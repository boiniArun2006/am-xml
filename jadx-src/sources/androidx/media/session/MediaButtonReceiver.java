package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    private static class MediaButtonConnectionCallback extends MediaBrowserCompat.n {
        private MediaBrowserCompat J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final BroadcastReceiver.PendingResult f39212O;
        private final Intent nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Context f39213t;

        private void O() {
            this.J2.rl();
            this.f39212O.finish();
        }

        void J2(MediaBrowserCompat mediaBrowserCompat) {
            this.J2 = mediaBrowserCompat;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.n
        public void n() {
            try {
                new MediaControllerCompat(this.f39213t, this.J2.t()).n((KeyEvent) this.nr.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException e2) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e2);
            }
            O();
        }

        MediaButtonConnectionCallback(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f39213t = context;
            this.nr = intent;
            this.f39212O = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.n
        public void rl() {
            O();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.n
        public void t() {
            O();
        }
    }

    private static void rl(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameN = n(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameN != null) {
            intent.setComponent(componentNameN);
            rl(context, intent);
            return;
        }
        ComponentName componentNameN2 = n(context, "android.media.browse.MediaBrowserService");
        if (componentNameN2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        MediaButtonConnectionCallback mediaButtonConnectionCallback = new MediaButtonConnectionCallback(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameN2, mediaButtonConnectionCallback, null);
        mediaButtonConnectionCallback.J2(mediaBrowserCompat);
        mediaBrowserCompat.n();
    }

    private static ComponentName n(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + listQueryIntentServices.size());
    }
}

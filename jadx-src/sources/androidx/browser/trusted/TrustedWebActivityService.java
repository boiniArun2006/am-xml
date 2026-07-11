package androidx.browser.trusted;

import a8o.n;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.browser.trusted.TrustedWebActivityServiceConnection;
import androidx.core.app.NotificationManagerCompat;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class TrustedWebActivityService extends Service {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final n.j f14616O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private NotificationManager f14617n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f14618t;

    /* JADX INFO: renamed from: androidx.browser.trusted.TrustedWebActivityService$1, reason: invalid class name */
    class AnonymousClass1 extends n.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TrustedWebActivityService f14619n;

        private void eWT() {
            TrustedWebActivityService trustedWebActivityService = this.f14619n;
            if (trustedWebActivityService.f14618t == -1) {
                String[] packagesForUid = trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                int i2 = 0;
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                Token tokenLoad = this.f14619n.t().load();
                PackageManager packageManager = this.f14619n.getPackageManager();
                if (tokenLoad != null) {
                    int length = packagesForUid.length;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        if (tokenLoad.n(packagesForUid[i2], packageManager)) {
                            this.f14619n.f14618t = Binder.getCallingUid();
                            break;
                        }
                        i2++;
                    }
                }
            }
            if (this.f14619n.f14618t != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }

        @Override // a8o.n
        public Bundle GR(Bundle bundle) {
            eWT();
            return new TrustedWebActivityServiceConnection.ResultArgs(this.f14619n.nr(TrustedWebActivityServiceConnection.NotificationsEnabledArgs.n(bundle).f14624n)).n();
        }

        @Override // a8o.n
        public int I() {
            eWT();
            return this.f14619n.xMQ();
        }

        @Override // a8o.n
        public Bundle Z() {
            eWT();
            return this.f14619n.KN();
        }

        @Override // a8o.n
        public Bundle g(Bundle bundle) {
            eWT();
            TrustedWebActivityServiceConnection.NotifyNotificationArgs notifyNotificationArgsN = TrustedWebActivityServiceConnection.NotifyNotificationArgs.n(bundle);
            return new TrustedWebActivityServiceConnection.ResultArgs(this.f14619n.mUb(notifyNotificationArgsN.f14625n, notifyNotificationArgsN.rl, notifyNotificationArgsN.f14626t, notifyNotificationArgsN.nr)).n();
        }

        @Override // a8o.n
        public void k(Bundle bundle) {
            eWT();
            TrustedWebActivityServiceConnection.CancelNotificationArgs cancelNotificationArgsN = TrustedWebActivityServiceConnection.CancelNotificationArgs.n(bundle);
            this.f14619n.O(cancelNotificationArgsN.f14623n, cancelNotificationArgsN.rl);
        }

        @Override // a8o.n
        public Bundle r(String str, Bundle bundle, IBinder iBinder) {
            eWT();
            return this.f14619n.J2(str, bundle, TrustedWebActivityCallbackRemote.n(iBinder));
        }

        @Override // a8o.n
        public Bundle s7N() {
            eWT();
            return new TrustedWebActivityServiceConnection.ActiveNotificationsArgs(this.f14619n.Uo()).n();
        }
    }

    public Bundle J2(String str, Bundle bundle, TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote) {
        return null;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.f14618t = -1;
        return super.onUnbind(intent);
    }

    public abstract TokenStore t();

    public int xMQ() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private static String n(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    private void rl() {
        if (this.f14617n == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f14616O;
    }

    public Bundle KN() {
        int iXMQ = xMQ();
        Bundle bundle = new Bundle();
        if (iXMQ == -1) {
            return bundle;
        }
        bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(getResources(), iXMQ));
        return bundle;
    }

    public void O(String str, int i2) {
        rl();
        this.f14617n.cancel(str, i2);
    }

    public Parcelable[] Uo() {
        rl();
        return NotificationApiHelperForM.n(this.f14617n);
    }

    public boolean mUb(String str, int i2, Notification notification, String str2) {
        rl();
        if (!NotificationManagerCompat.nr(this).n()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String strN = n(str2);
            notification = NotificationApiHelperForO.n(this, this.f14617n, notification, strN, str2);
            if (!NotificationApiHelperForO.rl(this.f14617n, strN)) {
                return false;
            }
        }
        this.f14617n.notify(str, i2, notification);
        return true;
    }

    public boolean nr(String str) {
        rl();
        if (!NotificationManagerCompat.nr(this).n()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return NotificationApiHelperForO.rl(this.f14617n, n(str));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f14617n = (NotificationManager) getSystemService("notification");
    }
}

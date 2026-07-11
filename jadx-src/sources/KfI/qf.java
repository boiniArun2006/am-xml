package KfI;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class qf implements u {
    private static final j rl = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f5737n;

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public qf(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f5737n = appContext;
    }

    @Override // KfI.u
    public void n(Messenger callback, ServiceConnection serviceConnection) {
        boolean zBindService;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(serviceConnection, "serviceConnection");
        Intent intent = new Intent(this.f5737n, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", callback);
        intent.setPackage(this.f5737n.getPackageName());
        try {
            zBindService = this.f5737n.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e2) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e2);
            zBindService = false;
        }
        if (zBindService) {
            return;
        }
        rl(this.f5737n, serviceConnection);
        Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
    }

    private final Object rl(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return Unit.INSTANCE;
        } catch (IllegalArgumentException e2) {
            return Integer.valueOf(Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e2));
        }
    }
}

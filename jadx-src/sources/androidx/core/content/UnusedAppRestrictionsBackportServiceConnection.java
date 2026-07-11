package androidx.core.content;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class UnusedAppRestrictionsBackportServiceConnection implements ServiceConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    IUnusedAppRestrictionsBackportService f36347n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ResolvableFuture f36348t;

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f36347n = null;
    }

    private IUnusedAppRestrictionsBackportCallback nr() {
        return new IUnusedAppRestrictionsBackportCallback.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.1
            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
            public void E2(boolean z2, boolean z3) {
                if (!z2) {
                    UnusedAppRestrictionsBackportServiceConnection.this.f36348t.ck(0);
                    Log.e("PackageManagerCompat", "Unable to retrieve the permission revocation setting from the backport");
                } else if (z3) {
                    UnusedAppRestrictionsBackportServiceConnection.this.f36348t.ck(3);
                } else {
                    UnusedAppRestrictionsBackportServiceConnection.this.f36348t.ck(2);
                }
            }
        };
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IUnusedAppRestrictionsBackportService iUnusedAppRestrictionsBackportServiceFcU = IUnusedAppRestrictionsBackportService.Stub.fcU(iBinder);
        this.f36347n = iUnusedAppRestrictionsBackportServiceFcU;
        try {
            iUnusedAppRestrictionsBackportServiceFcU.U(nr());
        } catch (RemoteException unused) {
            this.f36348t.ck(0);
        }
    }
}

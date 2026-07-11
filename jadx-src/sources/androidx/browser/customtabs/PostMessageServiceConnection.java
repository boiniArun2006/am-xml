package androidx.browser.customtabs;

import P.Ml;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class PostMessageServiceConnection implements PostMessageBackend, ServiceConnection {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private P.Ml f14594O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f14595n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final P.j f14596t;

    public void J2() {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f14594O = null;
        J2();
    }

    private boolean nr(Bundle bundle) {
        if (this.f14594O == null) {
            return false;
        }
        synchronized (this.f14595n) {
            try {
                try {
                    this.f14594O.wTp(this.f14596t, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public void O() {
        if (this.J2) {
            nr(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f14594O = Ml.j.fcU(iBinder);
        O();
    }
}

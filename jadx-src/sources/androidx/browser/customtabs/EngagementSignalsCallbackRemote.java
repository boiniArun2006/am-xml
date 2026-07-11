package androidx.browser.customtabs;

import P.w6;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
final class EngagementSignalsCallbackRemote implements EngagementSignalsCallback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final P.w6 f14586n;

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void nr(int i2, Bundle bundle) {
        try {
            this.f14586n.nr(i2, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void rl(boolean z2, Bundle bundle) {
        try {
            this.f14586n.rl(z2, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void t(boolean z2, Bundle bundle) {
        try {
            this.f14586n.t(z2, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    private EngagementSignalsCallbackRemote(P.w6 w6Var) {
        this.f14586n = w6Var;
    }

    static EngagementSignalsCallbackRemote n(IBinder iBinder) {
        return new EngagementSignalsCallbackRemote(w6.j.fcU(iBinder));
    }
}

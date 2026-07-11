package w;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class w6 implements InterfaceC2413n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FZ.n f74778n;
    private final K0.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f74779t;

    @Override // w.InterfaceC2413n
    public void t() {
        this.f74779t = true;
    }

    public w6(FZ.n customerSupport, K0.n legal) {
        Intrinsics.checkNotNullParameter(customerSupport, "customerSupport");
        Intrinsics.checkNotNullParameter(legal, "legal");
        this.f74778n = customerSupport;
        this.rl = legal;
    }

    @Override // w.InterfaceC2413n
    public K0.n n() {
        K0.n nVar = this.rl;
        if (this.f74779t) {
            return nVar;
        }
        return null;
    }

    @Override // w.InterfaceC2413n
    public FZ.n rl() {
        FZ.n nVar = this.f74778n;
        if (this.f74779t) {
            return nVar;
        }
        return null;
    }
}

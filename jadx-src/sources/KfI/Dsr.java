package KfI;

import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Dsr implements ep.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f5641n;

    public static Dsr n(InterfaceC2342j interfaceC2342j) {
        return new Dsr(interfaceC2342j);
    }

    public static CN3 t(oSp.n nVar) {
        return new CN3(nVar);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public CN3 get() {
        return t((oSp.n) this.f5641n.get());
    }

    public Dsr(InterfaceC2342j interfaceC2342j) {
        this.f5641n = interfaceC2342j;
    }
}

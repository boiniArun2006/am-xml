package pu;

import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class aC implements ep.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f72088n;
    private final InterfaceC2342j rl;

    public static aC n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2) {
        return new aC(interfaceC2342j, interfaceC2342j2);
    }

    public static Dsr t(qz qzVar, qz qzVar2) {
        return new Dsr(qzVar, qzVar2);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Dsr get() {
        return t((qz) this.f72088n.get(), (qz) this.rl.get());
    }

    public aC(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2) {
        this.f72088n = interfaceC2342j;
        this.rl = interfaceC2342j2;
    }
}

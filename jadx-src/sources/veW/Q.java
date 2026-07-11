package veW;

import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Q implements lK3.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final InterfaceC2342j f74715O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f74716n;
    private final InterfaceC2342j nr;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2342j f74717t;

    public static Q n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5) {
        return new Q(interfaceC2342j, interfaceC2342j2, interfaceC2342j3, interfaceC2342j4, interfaceC2342j5);
    }

    public static s4 t(MR.j jVar, MR.j jVar2, etI.I28 i28, Gg.QJ qj, Gg.UGc uGc) {
        return new s4(jVar, jVar2, i28, qj, uGc);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public s4 get() {
        return t((MR.j) this.f74716n.get(), (MR.j) this.rl.get(), (etI.I28) this.f74717t.get(), (Gg.QJ) this.nr.get(), (Gg.UGc) this.f74715O.get());
    }

    public Q(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5) {
        this.f74716n = interfaceC2342j;
        this.rl = interfaceC2342j2;
        this.f74717t = interfaceC2342j3;
        this.nr = interfaceC2342j4;
        this.f74715O = interfaceC2342j5;
    }
}

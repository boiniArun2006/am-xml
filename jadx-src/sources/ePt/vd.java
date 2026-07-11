package ePt;

import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class vd implements lK3.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final InterfaceC2342j f63675O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f63676n;
    private final InterfaceC2342j nr;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2342j f63677t;

    public static vd n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5) {
        return new vd(interfaceC2342j, interfaceC2342j2, interfaceC2342j3, interfaceC2342j4, interfaceC2342j5);
    }

    public static rv6 t(MR.j jVar, MR.j jVar2, Object obj, Object obj2, InterfaceC2342j interfaceC2342j) {
        return new rv6(jVar, jVar2, (I28) obj, (C1962m) obj2, interfaceC2342j);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public rv6 get() {
        return t((MR.j) this.f63676n.get(), (MR.j) this.rl.get(), this.f63677t.get(), this.nr.get(), this.f63675O);
    }

    public vd(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5) {
        this.f63676n = interfaceC2342j;
        this.rl = interfaceC2342j2;
        this.f63677t = interfaceC2342j3;
        this.nr = interfaceC2342j4;
        this.f63675O = interfaceC2342j5;
    }
}

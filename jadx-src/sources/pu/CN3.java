package pu;

import kotlin.coroutines.CoroutineContext;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 implements ep.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final InterfaceC2342j f72060O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f72061n;
    private final InterfaceC2342j nr;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2342j f72062t;

    public static CN3 n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5) {
        return new CN3(interfaceC2342j, interfaceC2342j2, interfaceC2342j3, interfaceC2342j4, interfaceC2342j5);
    }

    public static Ml t(CoroutineContext coroutineContext, s9b.I28 i28, KfI.n nVar, j jVar, HZ.j jVar2) {
        return new Ml(coroutineContext, i28, nVar, jVar, jVar2);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Ml get() {
        return t((CoroutineContext) this.f72061n.get(), (s9b.I28) this.rl.get(), (KfI.n) this.f72062t.get(), (j) this.nr.get(), ep.j.n(this.f72060O));
    }

    public CN3(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5) {
        this.f72061n = interfaceC2342j;
        this.rl = interfaceC2342j2;
        this.f72062t = interfaceC2342j3;
        this.nr = interfaceC2342j4;
        this.f72060O = interfaceC2342j5;
    }
}

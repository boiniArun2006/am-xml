package etI;

import Gg.r;
import java.util.concurrent.Executor;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Ml implements lK3.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final InterfaceC2342j f63883O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f63884n;
    private final InterfaceC2342j nr;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2342j f63885t;

    public static Ml n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5) {
        return new Ml(interfaceC2342j, interfaceC2342j2, interfaceC2342j3, interfaceC2342j4, interfaceC2342j5);
    }

    public static w6 t(Executor executor, hay.I28 i28, r rVar, ePt.Ml ml, Do.j jVar) {
        return new w6(executor, i28, rVar, ml, jVar);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public w6 get() {
        return t((Executor) this.f63884n.get(), (hay.I28) this.rl.get(), (r) this.f63885t.get(), (ePt.Ml) this.nr.get(), (Do.j) this.f63883O.get());
    }

    public Ml(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5) {
        this.f63884n = interfaceC2342j;
        this.rl = interfaceC2342j2;
        this.f63885t = interfaceC2342j3;
        this.nr = interfaceC2342j4;
        this.f63883O = interfaceC2342j5;
    }
}

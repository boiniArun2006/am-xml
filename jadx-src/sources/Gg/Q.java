package Gg;

import java.util.concurrent.Executor;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Q implements lK3.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f3703n;
    private final InterfaceC2342j nr;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2342j f3704t;

    public static Q n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4) {
        return new Q(interfaceC2342j, interfaceC2342j2, interfaceC2342j3, interfaceC2342j4);
    }

    public static UGc t(Executor executor, ePt.Ml ml, r rVar, Do.j jVar) {
        return new UGc(executor, ml, rVar, jVar);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public UGc get() {
        return t((Executor) this.f3703n.get(), (ePt.Ml) this.rl.get(), (r) this.f3704t.get(), (Do.j) this.nr.get());
    }

    public Q(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4) {
        this.f3703n = interfaceC2342j;
        this.rl = interfaceC2342j2;
        this.f3704t = interfaceC2342j3;
        this.nr = interfaceC2342j4;
    }
}

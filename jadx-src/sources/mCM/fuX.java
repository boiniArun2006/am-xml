package mCM;

import java.util.concurrent.Executor;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class fuX implements jh.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f70667n;
    private final InterfaceC2342j nr;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2342j f70668t;

    public static fuX n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4) {
        return new fuX(interfaceC2342j, interfaceC2342j2, interfaceC2342j3, interfaceC2342j4);
    }

    public static CN3 t(oSp.n nVar, oSp.n nVar2, oSp.j jVar, Executor executor) {
        return new CN3(nVar, nVar2, jVar, executor);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public CN3 get() {
        return t((oSp.n) this.f70667n.get(), (oSp.n) this.rl.get(), (oSp.j) this.f70668t.get(), (Executor) this.nr.get());
    }

    public fuX(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4) {
        this.f70667n = interfaceC2342j;
        this.rl = interfaceC2342j2;
        this.f70668t = interfaceC2342j3;
        this.nr = interfaceC2342j4;
    }
}

package KfI;

import kotlin.coroutines.CoroutineContext;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class eO implements ep.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f5696n;
    private final InterfaceC2342j nr;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2342j f5697t;

    public static eO n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4) {
        return new eO(interfaceC2342j, interfaceC2342j2, interfaceC2342j3, interfaceC2342j4);
    }

    public static o t(com.google.firebase.Wre wre, pu.Dsr dsr, CoroutineContext coroutineContext, u uVar) {
        return new o(wre, dsr, coroutineContext, uVar);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public o get() {
        return t((com.google.firebase.Wre) this.f5696n.get(), (pu.Dsr) this.rl.get(), (CoroutineContext) this.f5697t.get(), (u) this.nr.get());
    }

    public eO(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4) {
        this.f5696n = interfaceC2342j;
        this.rl = interfaceC2342j2;
        this.f5697t = interfaceC2342j3;
        this.nr = interfaceC2342j4;
    }
}

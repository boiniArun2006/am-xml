package KfI;

import kotlin.coroutines.CoroutineContext;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class afx implements ep.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final InterfaceC2342j f5691O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f5692n;
    private final InterfaceC2342j nr;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2342j f5693t;

    public static afx n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5) {
        return new afx(interfaceC2342j, interfaceC2342j2, interfaceC2342j3, interfaceC2342j4, interfaceC2342j5);
    }

    public static g9s t(com.google.firebase.Wre wre, s9b.I28 i28, pu.Dsr dsr, fuX fux, CoroutineContext coroutineContext) {
        return new g9s(wre, i28, dsr, fux, coroutineContext);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public g9s get() {
        return t((com.google.firebase.Wre) this.f5692n.get(), (s9b.I28) this.rl.get(), (pu.Dsr) this.f5693t.get(), (fuX) this.nr.get(), (CoroutineContext) this.f5691O.get());
    }

    public afx(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5) {
        this.f5692n = interfaceC2342j;
        this.rl = interfaceC2342j2;
        this.f5693t = interfaceC2342j3;
        this.nr = interfaceC2342j4;
        this.f5691O = interfaceC2342j5;
    }
}

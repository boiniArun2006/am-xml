package KfI;

import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Z implements ep.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f5687n;
    private final InterfaceC2342j rl;

    public static Z n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2) {
        return new Z(interfaceC2342j, interfaceC2342j2);
    }

    public static com.google.firebase.sessions.aC t(iwV iwv, rv6 rv6Var) {
        return new com.google.firebase.sessions.aC(iwv, rv6Var);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.sessions.aC get() {
        return t((iwV) this.f5687n.get(), (rv6) this.rl.get());
    }

    public Z(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2) {
        this.f5687n = interfaceC2342j;
        this.rl = interfaceC2342j2;
    }
}

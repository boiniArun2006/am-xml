package Li;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class CN3 implements D23.Ml {
    private final InterfaceC2342j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final InterfaceC2342j f6177O;
    private final InterfaceC2342j Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f6178n;
    private final InterfaceC2342j nr;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2342j f6179t;

    public static CN3 n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5, InterfaceC2342j interfaceC2342j6, InterfaceC2342j interfaceC2342j7) {
        return new CN3(interfaceC2342j, interfaceC2342j2, interfaceC2342j3, interfaceC2342j4, interfaceC2342j5, interfaceC2342j6, interfaceC2342j7);
    }

    public static I28 t(com.google.firebase.Wre wre, oSp.n nVar, s9b.I28 i28, oSp.n nVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.j jVar, SessionManager sessionManager) {
        return new I28(wre, nVar, i28, nVar2, remoteConfigManager, jVar, sessionManager);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public I28 get() {
        return t((com.google.firebase.Wre) this.f6178n.get(), (oSp.n) this.rl.get(), (s9b.I28) this.f6179t.get(), (oSp.n) this.nr.get(), (RemoteConfigManager) this.f6177O.get(), (com.google.firebase.perf.config.j) this.J2.get(), (SessionManager) this.Uo.get());
    }

    public CN3(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2, InterfaceC2342j interfaceC2342j3, InterfaceC2342j interfaceC2342j4, InterfaceC2342j interfaceC2342j5, InterfaceC2342j interfaceC2342j6, InterfaceC2342j interfaceC2342j7) {
        this.f6178n = interfaceC2342j;
        this.rl = interfaceC2342j2;
        this.f6179t = interfaceC2342j3;
        this.nr = interfaceC2342j4;
        this.f6177O = interfaceC2342j5;
        this.J2 = interfaceC2342j6;
        this.Uo = interfaceC2342j7;
    }
}

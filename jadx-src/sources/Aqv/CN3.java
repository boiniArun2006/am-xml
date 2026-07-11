package Aqv;

import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class CN3 implements D23.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f110n;

    public static CN3 n(j jVar) {
        return new CN3(jVar);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public SessionManager get() {
        return t(this.f110n);
    }

    public CN3(j jVar) {
        this.f110n = jVar;
    }

    public static SessionManager t(j jVar) {
        return (SessionManager) D23.w6.t(jVar.J2());
    }
}

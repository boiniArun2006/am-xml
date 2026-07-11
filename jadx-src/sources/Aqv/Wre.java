package Aqv;

import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Wre implements D23.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f113n;

    public static Wre n(j jVar) {
        return new Wre(jVar);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public RemoteConfigManager get() {
        return t(this.f113n);
    }

    public Wre(j jVar) {
        this.f113n = jVar;
    }

    public static RemoteConfigManager t(j jVar) {
        return (RemoteConfigManager) D23.w6.t(jVar.O());
    }
}

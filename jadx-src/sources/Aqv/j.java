package Aqv;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.firebase.Wre f115n;
    private final oSp.n nr;
    private final s9b.I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final oSp.n f116t;

    oSp.n Uo() {
        return this.nr;
    }

    oSp.n nr() {
        return this.f116t;
    }

    com.google.firebase.Wre rl() {
        return this.f115n;
    }

    s9b.I28 t() {
        return this.rl;
    }

    public j(com.google.firebase.Wre wre, s9b.I28 i28, oSp.n nVar, oSp.n nVar2) {
        this.f115n = wre;
        this.rl = i28;
        this.f116t = nVar;
        this.nr = nVar2;
    }

    SessionManager J2() {
        return SessionManager.getInstance();
    }

    RemoteConfigManager O() {
        return RemoteConfigManager.getInstance();
    }

    com.google.firebase.perf.config.j n() {
        return com.google.firebase.perf.config.j.Uo();
    }
}

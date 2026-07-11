package com.google.firebase.firestore.remote;

import java.util.Locale;
import uh.u;
import wqP.I28;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class UGc {
    private final j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final wqP.I28 f60404O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private u f60405n = u.UNKNOWN;
    private boolean nr = true;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private I28.n f60406t;

    interface j {
        void n(u uVar);
    }

    public static /* synthetic */ void n(UGc uGc) {
        uGc.f60406t = null;
        wqP.n.t(uGc.f60405n == u.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
        uGc.J2(String.format(Locale.ENGLISH, "Backend didn't respond within %d seconds\n", 10));
        uGc.Uo(u.OFFLINE);
    }

    private void J2(String str) {
        String str2 = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", str);
        if (!this.nr) {
            wqP.QJ.n("OnlineStateTracker", "%s", str2);
        } else {
            wqP.QJ.nr("OnlineStateTracker", "%s", str2);
            this.nr = false;
        }
    }

    private void Uo(u uVar) {
        if (uVar != this.f60405n) {
            this.f60405n = uVar;
            this.J2.n(uVar);
        }
    }

    private void rl() {
        I28.n nVar = this.f60406t;
        if (nVar != null) {
            nVar.t();
            this.f60406t = null;
        }
    }

    void O() {
        if (this.rl == 0) {
            Uo(u.UNKNOWN);
            wqP.n.t(this.f60406t == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            this.f60406t = this.f60404O.KN(I28.Ml.ONLINE_STATE_TIMEOUT, 10000L, new Runnable() { // from class: com.google.firebase.firestore.remote.s4
                @Override // java.lang.Runnable
                public final void run() {
                    UGc.n(this.f60460n);
                }
            });
        }
    }

    void nr(io.grpc.SPz sPz) {
        if (this.f60405n == u.ONLINE) {
            Uo(u.UNKNOWN);
            wqP.n.t(this.rl == 0, "watchStreamFailures must be 0", new Object[0]);
            wqP.n.t(this.f60406t == null, "onlineStateTimer must be null", new Object[0]);
            return;
        }
        int i2 = this.rl + 1;
        this.rl = i2;
        if (i2 >= 1) {
            rl();
            J2(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", 1, sPz));
            Uo(u.OFFLINE);
        }
    }

    u t() {
        return this.f60405n;
    }

    UGc(wqP.I28 i28, j jVar) {
        this.f60404O = i28;
        this.J2 = jVar;
    }

    void KN(u uVar) {
        rl();
        this.rl = 0;
        if (uVar == u.ONLINE) {
            this.nr = false;
        }
        Uo(uVar);
    }
}

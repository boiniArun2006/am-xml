package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.firestore.Pl;
import pUk.C2331c;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class FirebaseFirestore {
    private final VtZ.j J2;
    private final qf KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final VtZ.j f60308O;
    private final com.google.firebase.Wre Uo;
    private final Pe.C az;
    private E8.j mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final wqP.eO f60309n;
    private final String nr;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final pUk.Wre f60310t;
    private final j xMQ;
    final Xo qie = new Xo(new wqP.eO() { // from class: com.google.firebase.firestore.qz
        @Override // wqP.eO
        public final Object apply(Object obj) {
            return this.f60366n.mUb((wqP.I28) obj);
        }
    });
    private Pl gh = new Pl.n().J2();

    public interface j {
    }

    public static FirebaseFirestore KN(com.google.firebase.Wre wre, String str) {
        AbstractC2418c.t(wre, "Provided FirebaseApp must not be null.");
        AbstractC2418c.t(str, "Provided database name must not be null.");
        eO eOVar = (eO) wre.mUb(eO.class);
        AbstractC2418c.t(eOVar, "Firestore component is not present.");
        return eOVar.n(str);
    }

    public static FirebaseFirestore Uo(com.google.firebase.Wre wre) {
        return KN(wre, "(default)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public uh.r mUb(wqP.I28 i28) {
        uh.r rVar;
        synchronized (this.qie) {
            rVar = new uh.r(this.rl, new uh.o(this.f60310t, this.nr, this.gh.KN(), this.gh.mUb()), this.f60308O, this.J2, i28, this.az, (uh.aC) this.f60309n.apply(this.gh));
        }
        return rVar;
    }

    private Pl xMQ(Pl pl, E8.j jVar) {
        if (jVar == null) {
            return pl;
        }
        if (!"firestore.googleapis.com".equals(pl.KN())) {
            wqP.QJ.nr("FirebaseFirestore", "Host has been set in FirebaseFirestoreSettings and useEmulator, emulator host will be used.", new Object[0]);
        }
        return new Pl.n(pl).Uo(jVar.n() + ":" + jVar.rl()).xMQ(false).J2();
    }

    public void az(String str, int i2) {
        synchronized (this.qie) {
            try {
                if (this.qie.t()) {
                    throw new IllegalStateException("Cannot call useEmulator() after instance has already been initialized.");
                }
                E8.j jVar = new E8.j(str, i2);
                this.mUb = jVar;
                this.gh = xMQ(this.gh, jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    pUk.Wre nr() {
        return this.f60310t;
    }

    public void qie(Pl pl) {
        AbstractC2418c.t(pl, "Provided settings must not be null.");
        synchronized (this.f60310t) {
            try {
                Pl plXMQ = xMQ(pl, this.mUb);
                if (this.qie.t() && !this.gh.equals(plXMQ)) {
                    throw new IllegalStateException("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
                }
                this.gh = plXMQ;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    Object rl(wqP.eO eOVar) {
        return this.qie.n(eOVar);
    }

    public n t(String str) {
        AbstractC2418c.t(str, "Provided collection path must not be null.");
        this.qie.rl();
        return new n(C2331c.o(str), this);
    }

    FirebaseFirestore(Context context, pUk.Wre wre, String str, VtZ.j jVar, VtZ.j jVar2, wqP.eO eOVar, com.google.firebase.Wre wre2, j jVar3, Pe.C c2) {
        this.rl = (Context) AbstractC2418c.rl(context);
        this.f60310t = (pUk.Wre) AbstractC2418c.rl((pUk.Wre) AbstractC2418c.rl(wre));
        this.KN = new qf(wre);
        this.nr = (String) AbstractC2418c.rl(str);
        this.f60308O = (VtZ.j) AbstractC2418c.rl(jVar);
        this.J2 = (VtZ.j) AbstractC2418c.rl(jVar2);
        this.f60309n = (wqP.eO) AbstractC2418c.rl(eOVar);
        this.Uo = wre2;
        this.xMQ = jVar3;
        this.az = c2;
    }

    public static FirebaseFirestore J2() {
        return KN(O(), "(default)");
    }

    private static com.google.firebase.Wre O() {
        com.google.firebase.Wre wreAz = com.google.firebase.Wre.az();
        if (wreAz != null) {
            return wreAz;
        }
        throw new IllegalStateException("You must call FirebaseApp.initializeApp first.");
    }

    static FirebaseFirestore gh(Context context, com.google.firebase.Wre wre, oSp.j jVar, oSp.j jVar2, String str, j jVar3, Pe.C c2) {
        String strO = wre.ck().O();
        if (strO != null) {
            return new FirebaseFirestore(context, pUk.Wre.rl(strO, str), wre.HI(), new VtZ.Dsr(jVar), new VtZ.I28(jVar2), new wqP.eO() { // from class: com.google.firebase.firestore.o
                @Override // wqP.eO
                public final Object apply(Object obj) {
                    return uh.aC.KN((Pl) obj);
                }
            }, wre, jVar3, c2);
        }
        throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
    }

    @Keep
    static void setClientLanguage(@NonNull String str) {
        com.google.firebase.firestore.remote.QJ.Uo(str);
    }
}

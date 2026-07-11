package com.google.firebase.firestore;

import android.app.Activity;
import java.util.concurrent.Executor;
import pUk.C2331c;
import uh.Md;
import uh.Xo;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final pUk.C f60301n;
    private final FirebaseFirestore rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CN3)) {
            return false;
        }
        CN3 cn3 = (CN3) obj;
        return this.f60301n.equals(cn3.f60301n) && this.rl.equals(cn3.rl);
    }

    private uh.Ln KN() {
        return uh.Ln.rl(this.f60301n.qie());
    }

    private s4 Uo(Executor executor, final Xo.n nVar, final Activity activity, final Dsr dsr) {
        final uh.fuX fux = new uh.fuX(executor, new Dsr() { // from class: com.google.firebase.firestore.Ml
            @Override // com.google.firebase.firestore.Dsr
            public final void n(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
                CN3.t(this.f60330n, dsr, (Md) obj, firebaseFirestoreException);
            }
        });
        final uh.Ln lnKN = KN();
        return (s4) this.rl.rl(new wqP.eO() { // from class: com.google.firebase.firestore.I28
            @Override // wqP.eO
            public final Object apply(Object obj) {
                return CN3.rl(lnKN, nVar, fux, activity, (uh.r) obj);
            }
        });
    }

    private static Xo.n az(Q q2, EnumC1910c enumC1910c) {
        Xo.n nVar = new Xo.n();
        Q q3 = Q.INCLUDE;
        nVar.f74482n = q2 == q3;
        nVar.rl = q2 == q3;
        nVar.f74483t = false;
        nVar.nr = enumC1910c;
        return nVar;
    }

    private static Xo.n qie(Q q2) {
        return az(q2, EnumC1910c.DEFAULT);
    }

    public s4 J2(Executor executor, Q q2, Dsr dsr) {
        AbstractC2418c.t(executor, "Provided executor must not be null.");
        AbstractC2418c.t(q2, "Provided MetadataChanges value must not be null.");
        AbstractC2418c.t(dsr, "Provided EventListener must not be null.");
        return Uo(executor, qie(q2), null, dsr);
    }

    public s4 O(Q q2, Dsr dsr) {
        return J2(wqP.qz.f75137n, q2, dsr);
    }

    public String gh() {
        return this.f60301n.qie().t();
    }

    public int hashCode() {
        return (this.f60301n.hashCode() * 31) + this.rl.hashCode();
    }

    public String mUb() {
        return this.f60301n.gh();
    }

    public s4 nr(Dsr dsr) {
        return O(Q.EXCLUDE, dsr);
    }

    CN3(pUk.C c2, FirebaseFirestore firebaseFirestore) {
        this.f60301n = (pUk.C) AbstractC2418c.rl(c2);
        this.rl = firebaseFirestore;
    }

    public static /* synthetic */ void n(uh.fuX fux, uh.r rVar, uh.lej lejVar) {
        fux.t();
        rVar.mUb(lejVar);
    }

    public static /* synthetic */ s4 rl(uh.Ln ln2, Xo.n nVar, final uh.fuX fux, Activity activity, final uh.r rVar) {
        final uh.lej lejVarXMQ = rVar.xMQ(ln2, nVar, fux);
        return uh.Ml.t(activity, new s4() { // from class: com.google.firebase.firestore.Wre
            @Override // com.google.firebase.firestore.s4
            public final void remove() {
                CN3.n(fux, rVar, lejVarXMQ);
            }
        });
    }

    public static /* synthetic */ void t(CN3 cn3, Dsr dsr, Md md, FirebaseFirestoreException firebaseFirestoreException) {
        boolean z2;
        fuX fuxO;
        cn3.getClass();
        if (firebaseFirestoreException != null) {
            dsr.n(null, firebaseFirestoreException);
            return;
        }
        boolean z3 = true;
        if (md != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        wqP.n.t(z2, "Got event without value or error set", new Object[0]);
        if (md.O().size() > 1) {
            z3 = false;
        }
        wqP.n.t(z3, "Too many documents returned on a document query", new Object[0]);
        pUk.fuX fuxO2 = md.O().O(cn3.f60301n);
        if (fuxO2 != null) {
            fuxO = fuX.nr(cn3.rl, fuxO2, md.gh(), md.J2().contains(fuxO2.getKey()));
        } else {
            fuxO = fuX.O(cn3.rl, cn3.f60301n, md.gh());
        }
        dsr.n(fuxO, null);
    }

    static CN3 xMQ(C2331c c2331c, FirebaseFirestore firebaseFirestore) {
        if (c2331c.ty() % 2 == 0) {
            return new CN3(pUk.C.Uo(c2331c), firebaseFirestore);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + c2331c.t() + " has " + c2331c.ty());
    }
}

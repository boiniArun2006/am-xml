package com.google.firebase.firestore;

import android.app.Activity;
import java.util.concurrent.Executor;
import uh.Ln;
import uh.Md;
import uh.Xo;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class afx {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final uh.Ln f60346n;
    final FirebaseFirestore rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afx)) {
            return false;
        }
        afx afxVar = (afx) obj;
        return this.f60346n.equals(afxVar.f60346n) && this.rl.equals(afxVar.rl);
    }

    private static Xo.n KN(Q q2) {
        return xMQ(q2, EnumC1910c.DEFAULT);
    }

    private void mUb() {
        if (this.f60346n.mUb().equals(Ln.j.LIMIT_TO_LAST) && this.f60346n.J2().isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
    }

    public static /* synthetic */ s4 n(afx afxVar, Xo.n nVar, final uh.fuX fux, Activity activity, final uh.r rVar) {
        final uh.lej lejVarXMQ = rVar.xMQ(afxVar.f60346n, nVar, fux);
        return uh.Ml.t(activity, new s4() { // from class: com.google.firebase.firestore.g9s
            @Override // com.google.firebase.firestore.s4
            public final void remove() {
                afx.t(fux, rVar, lejVarXMQ);
            }
        });
    }

    private static Xo.n xMQ(Q q2, EnumC1910c enumC1910c) {
        Xo.n nVar = new Xo.n();
        Q q3 = Q.INCLUDE;
        nVar.f74482n = q2 == q3;
        nVar.rl = q2 == q3;
        nVar.f74483t = false;
        nVar.nr = enumC1910c;
        return nVar;
    }

    public s4 J2(Executor executor, Q q2, Dsr dsr) {
        AbstractC2418c.t(executor, "Provided executor must not be null.");
        AbstractC2418c.t(q2, "Provided MetadataChanges value must not be null.");
        AbstractC2418c.t(dsr, "Provided EventListener must not be null.");
        return Uo(executor, KN(q2), null, dsr);
    }

    public s4 O(Q q2, Dsr dsr) {
        return J2(wqP.qz.f75137n, q2, dsr);
    }

    public int hashCode() {
        return (this.f60346n.hashCode() * 31) + this.rl.hashCode();
    }

    public s4 nr(Dsr dsr) {
        return O(Q.EXCLUDE, dsr);
    }

    afx(uh.Ln ln2, FirebaseFirestore firebaseFirestore) {
        this.f60346n = (uh.Ln) AbstractC2418c.rl(ln2);
        this.rl = (FirebaseFirestore) AbstractC2418c.rl(firebaseFirestore);
    }

    private s4 Uo(Executor executor, final Xo.n nVar, final Activity activity, final Dsr dsr) {
        mUb();
        final uh.fuX fux = new uh.fuX(executor, new Dsr() { // from class: com.google.firebase.firestore.SPz
            @Override // com.google.firebase.firestore.Dsr
            public final void n(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
                afx.rl(this.f60341n, dsr, (Md) obj, firebaseFirestoreException);
            }
        });
        return (s4) this.rl.rl(new wqP.eO() { // from class: com.google.firebase.firestore.ci
            @Override // wqP.eO
            public final Object apply(Object obj) {
                return afx.n(this.f60350n, nVar, fux, activity, (uh.r) obj);
            }
        });
    }

    public static /* synthetic */ void rl(afx afxVar, Dsr dsr, Md md, FirebaseFirestoreException firebaseFirestoreException) {
        boolean z2;
        afxVar.getClass();
        if (firebaseFirestoreException != null) {
            dsr.n(null, firebaseFirestoreException);
            return;
        }
        if (md != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        wqP.n.t(z2, "Got event without value or error set", new Object[0]);
        dsr.n(new Ew(afxVar, md, afxVar.rl), null);
    }

    public static /* synthetic */ void t(uh.fuX fux, uh.r rVar, uh.lej lejVar) {
        fux.t();
        rVar.mUb(lejVar);
    }
}

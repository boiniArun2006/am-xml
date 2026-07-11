package uh;

import com.google.firebase.firestore.EnumC1910c;
import com.google.firebase.firestore.FirebaseFirestoreException;
import java.util.ArrayList;
import uh.Xo;
import uh.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class lej {
    private Md J2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ln f74520n;
    private final Xo.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.google.firebase.firestore.Dsr f74521t;
    private boolean nr = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private u f74519O = u.UNKNOWN;

    private void J2(Md md) {
        wqP.n.t(!this.nr, "Trying to raise initial event for second time", new Object[0]);
        Md mdT = Md.t(md.KN(), md.O(), md.J2(), md.gh(), md.rl(), md.xMQ());
        this.nr = true;
        this.f74521t.n(mdT, null);
    }

    private boolean KN(Md md, u uVar) {
        wqP.n.t(!this.nr, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!md.gh() || !rl()) {
            return true;
        }
        u uVar2 = u.OFFLINE;
        boolean zEquals = uVar.equals(uVar2);
        if (!this.rl.f74483t || zEquals) {
            return !md.O().isEmpty() || md.xMQ() || uVar.equals(uVar2);
        }
        wqP.n.t(md.gh(), "Waiting for sync, but snapshot is not from cache", new Object[0]);
        return false;
    }

    public Ln n() {
        return this.f74520n;
    }

    public boolean nr(u uVar) {
        this.f74519O = uVar;
        Md md = this.J2;
        if (md == null || this.nr || !KN(md, uVar)) {
            return false;
        }
        J2(this.J2);
        return true;
    }

    public boolean rl() {
        if (this.rl != null) {
            return !r0.nr.equals(EnumC1910c.CACHE);
        }
        return true;
    }

    public void t(FirebaseFirestoreException firebaseFirestoreException) {
        this.f74521t.n(null, firebaseFirestoreException);
    }

    public lej(Ln ln2, Xo.n nVar, com.google.firebase.firestore.Dsr dsr) {
        this.f74520n = ln2;
        this.f74521t = dsr;
        this.rl = nVar;
    }

    private boolean Uo(Md md) {
        boolean z2 = true;
        if (!md.nr().isEmpty()) {
            return true;
        }
        Md md2 = this.J2;
        if (md2 == null || md2.mUb() == md.mUb()) {
            z2 = false;
        }
        if (!md.n() && !z2) {
            return false;
        }
        return this.rl.rl;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean O(Md md) {
        boolean z2;
        boolean z3 = true;
        if (md.nr().isEmpty() && !md.n()) {
            z2 = false;
        } else {
            z2 = true;
        }
        wqP.n.t(z2, "We got a new snapshot with no changes?", new Object[0]);
        if (!this.rl.f74482n) {
            ArrayList arrayList = new ArrayList();
            for (qz qzVar : md.nr()) {
                if (qzVar.t() != qz.j.METADATA) {
                    arrayList.add(qzVar);
                }
            }
            md = new Md(md.KN(), md.O(), md.Uo(), arrayList, md.gh(), md.J2(), md.n(), true, md.xMQ());
        }
        if (!this.nr) {
            if (KN(md, this.f74519O)) {
                J2(md);
            } else {
                z3 = false;
            }
        } else if (Uo(md)) {
            this.f74521t.n(md, null);
        }
        this.J2 = md;
        return z3;
    }
}

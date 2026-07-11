package gq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class h implements P {
    private final rv6 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final psW f67783O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f67784n = new ArrayList();
    private eZ.I28 rl = new eZ.I28(Collections.EMPTY_LIST, I28.f67688t);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f67785t = 1;
    private com.google.protobuf.C nr = com.google.firebase.firestore.remote.DAz.f60374S;

    private List HI(eZ.I28 i28) {
        ArrayList arrayList = new ArrayList();
        Iterator it = i28.iterator();
        while (it.hasNext()) {
            BC.CN3 cn3Nr = nr(((Integer) it.next()).intValue());
            if (cn3Nr != null) {
                arrayList.add(cn3Nr);
            }
        }
        return arrayList;
    }

    private int qie(int i2) {
        if (this.f67784n.isEmpty()) {
            return 0;
        }
        return i2 - ((BC.CN3) this.f67784n.get(0)).nr();
    }

    @Override // gq.P
    public com.google.protobuf.C O() {
        return this.nr;
    }

    long gh(eO eOVar) {
        Iterator it = this.f67784n.iterator();
        long serializedSize = 0;
        while (it.hasNext()) {
            serializedSize += (long) eOVar.az((BC.CN3) it.next()).getSerializedSize();
        }
        return serializedSize;
    }

    boolean mUb(pUk.C c2) {
        Iterator itO = this.rl.O(new I28(c2, 0));
        if (itO.hasNext()) {
            return ((I28) itO.next()).nr().equals(c2);
        }
        return false;
    }

    @Override // gq.P
    public void n() {
        if (this.f67784n.isEmpty()) {
            wqP.n.t(this.rl.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    @Override // gq.P
    public List rl(Iterable iterable) {
        eZ.I28 i28 = new eZ.I28(Collections.EMPTY_LIST, wqP.Z.J2());
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            pUk.C c2 = (pUk.C) it.next();
            Iterator itO = this.rl.O(new I28(c2, 0));
            while (itO.hasNext()) {
                I28 i282 = (I28) itO.next();
                if (!c2.equals(i282.nr())) {
                    break;
                }
                i28 = i28.nr(Integer.valueOf(i282.t()));
            }
        }
        return HI(i28);
    }

    @Override // gq.P
    public BC.CN3 t(int i2) {
        int iQie = qie(i2 + 1);
        if (iQie < 0) {
            iQie = 0;
        }
        if (this.f67784n.size() > iQie) {
            return (BC.CN3) this.f67784n.get(iQie);
        }
        return null;
    }

    public boolean ty() {
        return this.f67784n.isEmpty();
    }

    @Override // gq.P
    public List xMQ() {
        return Collections.unmodifiableList(this.f67784n);
    }

    h(psW psw, VtZ.aC aCVar) {
        this.f67783O = psw;
        this.J2 = psw.nr(aCVar);
    }

    private int az(int i2, String str) {
        boolean z2;
        int iQie = qie(i2);
        if (iQie >= 0 && iQie < this.f67784n.size()) {
            z2 = true;
        } else {
            z2 = false;
        }
        wqP.n.t(z2, "Batches must exist to be %s", str);
        return iQie;
    }

    @Override // gq.P
    public void J2(BC.CN3 cn3) {
        boolean z2;
        if (az(cn3.nr(), "removed") == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        wqP.n.t(z2, "Can only remove the first entry of the mutation queue", new Object[0]);
        this.f67784n.remove(0);
        eZ.I28 i28J2 = this.rl;
        Iterator it = cn3.Uo().iterator();
        while (it.hasNext()) {
            pUk.C cJ2 = ((BC.Wre) it.next()).J2();
            this.f67783O.Uo().nr(cJ2);
            i28J2 = i28J2.J2(new I28(cJ2, cn3.nr()));
        }
        this.rl = i28J2;
    }

    @Override // gq.P
    public void KN(BC.CN3 cn3, com.google.protobuf.C c2) {
        boolean z2;
        int iNr = cn3.nr();
        int iAz = az(iNr, "acknowledged");
        boolean z3 = true;
        if (iAz == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        wqP.n.t(z2, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        BC.CN3 cn32 = (BC.CN3) this.f67784n.get(iAz);
        if (iNr != cn32.nr()) {
            z3 = false;
        }
        wqP.n.t(z3, "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(iNr), Integer.valueOf(cn32.nr()));
        this.nr = (com.google.protobuf.C) AbstractC2418c.rl(c2);
    }

    @Override // gq.P
    public void Uo(com.google.protobuf.C c2) {
        this.nr = (com.google.protobuf.C) AbstractC2418c.rl(c2);
    }

    @Override // gq.P
    public BC.CN3 nr(int i2) {
        boolean z2;
        int iQie = qie(i2);
        if (iQie >= 0 && iQie < this.f67784n.size()) {
            BC.CN3 cn3 = (BC.CN3) this.f67784n.get(iQie);
            if (cn3.nr() == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            wqP.n.t(z2, "If found batch must match", new Object[0]);
            return cn3;
        }
        return null;
    }

    @Override // gq.P
    public void start() {
        if (ty()) {
            this.f67785t = 1;
        }
    }
}

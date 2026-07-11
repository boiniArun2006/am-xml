package gq;

import android.util.SparseArray;
import gq.C2147u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class Lu implements OU, Z {
    private final uh.Ew J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final C2147u f67702O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final psW f67703n;
    private C2145p nr;
    private final eO rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f67704t = new HashMap();
    private long Uo = -1;

    public static /* synthetic */ void Ik(long[] jArr, Long l2) {
        jArr[0] = jArr[0] + 1;
    }

    private boolean o(pUk.C c2) {
        Iterator it = this.f67703n.Ik().iterator();
        while (it.hasNext()) {
            if (((h) it.next()).mUb(c2)) {
                return true;
            }
        }
        return false;
    }

    @Override // gq.Z
    public long HI() {
        long jTy = this.f67703n.xMQ().ty();
        final long[] jArr = new long[1];
        mUb(new wqP.C() { // from class: gq.vd
            @Override // wqP.C
            public final void accept(Object obj) {
                Lu.Ik(jArr, (Long) obj);
            }
        });
        return jTy + jArr[0];
    }

    @Override // gq.OU
    public long J2() {
        wqP.n.t(this.Uo != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.Uo;
    }

    @Override // gq.OU
    public void KN(pUk.C c2) {
        this.f67704t.put(c2, Long.valueOf(J2()));
    }

    @Override // gq.Z
    public C2147u O() {
        return this.f67702O;
    }

    @Override // gq.Z
    public int Uo(long j2) {
        Md mdKN = this.f67703n.KN();
        ArrayList arrayList = new ArrayList();
        Iterator it = mdKN.xMQ().iterator();
        while (it.hasNext()) {
            pUk.C key = ((pUk.fuX) it.next()).getKey();
            if (!r(key, j2)) {
                arrayList.add(key);
                this.f67704t.remove(key);
            }
        }
        mdKN.removeAll(arrayList);
        return arrayList.size();
    }

    @Override // gq.OU
    public void az() {
        wqP.n.t(this.Uo == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.Uo = this.J2.n();
    }

    @Override // gq.Z
    public long ck() {
        long jQie = this.f67703n.xMQ().qie(this.rl) + this.f67703n.KN().KN(this.rl);
        Iterator it = this.f67703n.Ik().iterator();
        while (it.hasNext()) {
            jQie += ((h) it.next()).gh(this.rl);
        }
        return jQie;
    }

    @Override // gq.Z
    public int gh(long j2, SparseArray sparseArray) {
        return this.f67703n.xMQ().ck(j2, sparseArray);
    }

    @Override // gq.Z
    public void mUb(wqP.C c2) {
        for (Map.Entry entry : this.f67704t.entrySet()) {
            if (!r((pUk.C) entry.getKey(), ((Long) entry.getValue()).longValue())) {
                c2.accept((Long) entry.getValue());
            }
        }
    }

    @Override // gq.OU
    public void n(pUk.C c2) {
        this.f67704t.put(c2, Long.valueOf(J2()));
    }

    @Override // gq.OU
    public void nr(pUk.C c2) {
        this.f67704t.put(c2, Long.valueOf(J2()));
    }

    @Override // gq.OU
    public void qie() {
        wqP.n.t(this.Uo != -1, "Committing a transaction without having started one", new Object[0]);
        this.Uo = -1L;
    }

    @Override // gq.OU
    public void rl(pUk.C c2) {
        this.f67704t.put(c2, Long.valueOf(J2()));
    }

    @Override // gq.Z
    public void t(wqP.C c2) {
        this.f67703n.xMQ().gh(c2);
    }

    @Override // gq.OU
    public void ty(C2145p c2145p) {
        this.nr = c2145p;
    }

    Lu(psW psw, C2147u.n nVar, eO eOVar) {
        this.f67703n = psw;
        this.rl = eOVar;
        this.J2 = new uh.Ew(psw.xMQ().az());
        this.f67702O = new C2147u(this, nVar);
    }

    private boolean r(pUk.C c2, long j2) {
        if (o(c2) || this.nr.t(c2) || this.f67703n.xMQ().mUb(c2)) {
            return true;
        }
        Long l2 = (Long) this.f67704t.get(c2);
        if (l2 != null && l2.longValue() > j2) {
            return true;
        }
        return false;
    }

    @Override // gq.OU
    public void xMQ(oJ oJVar) {
        this.f67703n.xMQ().n(oJVar.qie(J2()));
    }
}

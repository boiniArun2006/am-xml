package gq;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Zs implements tpM {
    private final psW J2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f67756t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f67755n = new HashMap();
    private final C2145p rl = new C2145p();
    private pUk.UGc nr = pUk.UGc.f72007t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f67754O = 0;

    public void HI(int i2) {
        this.rl.KN(i2);
    }

    public void Ik(oJ oJVar) {
        this.f67755n.remove(oJVar.Uo());
        this.rl.KN(oJVar.KN());
    }

    @Override // gq.tpM
    public eZ.I28 J2(int i2) {
        return this.rl.nr(i2);
    }

    @Override // gq.tpM
    public void KN(eZ.I28 i28, int i2) {
        this.rl.Uo(i28, i2);
        OU ouUo = this.J2.Uo();
        Iterator it = i28.iterator();
        while (it.hasNext()) {
            ouUo.rl((pUk.C) it.next());
        }
    }

    @Override // gq.tpM
    public int O() {
        return this.f67756t;
    }

    @Override // gq.tpM
    public pUk.UGc Uo() {
        return this.nr;
    }

    public long az() {
        return this.f67754O;
    }

    int ck(long j2, SparseArray sparseArray) {
        Iterator it = this.f67755n.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iKN = ((oJ) entry.getValue()).KN();
            if (((oJ) entry.getValue()).O() <= j2 && sparseArray.get(iKN) == null) {
                it.remove();
                HI(iKN);
                i2++;
            }
        }
        return i2;
    }

    public void gh(wqP.C c2) {
        Iterator it = this.f67755n.values().iterator();
        while (it.hasNext()) {
            c2.accept((oJ) it.next());
        }
    }

    public boolean mUb(pUk.C c2) {
        return this.rl.t(c2);
    }

    @Override // gq.tpM
    public void nr(oJ oJVar) {
        this.f67755n.put(oJVar.Uo(), oJVar);
        int iKN = oJVar.KN();
        if (iKN > this.f67756t) {
            this.f67756t = iKN;
        }
        if (oJVar.O() > this.f67754O) {
            this.f67754O = oJVar.O();
        }
    }

    long qie(eO eOVar) {
        Iterator it = this.f67755n.entrySet().iterator();
        long serializedSize = 0;
        while (it.hasNext()) {
            serializedSize += (long) eOVar.HI((oJ) ((Map.Entry) it.next()).getValue()).getSerializedSize();
        }
        return serializedSize;
    }

    @Override // gq.tpM
    public void rl(pUk.UGc uGc) {
        this.nr = uGc;
    }

    @Override // gq.tpM
    public oJ t(uh.vd vdVar) {
        return (oJ) this.f67755n.get(vdVar);
    }

    public long ty() {
        return this.f67755n.size();
    }

    @Override // gq.tpM
    public void xMQ(eZ.I28 i28, int i2) {
        this.rl.rl(i28, i2);
        OU ouUo = this.J2.Uo();
        Iterator it = i28.iterator();
        while (it.hasNext()) {
            ouUo.n((pUk.C) it.next());
        }
    }

    Zs(psW psw) {
        this.J2 = psw;
    }

    @Override // gq.tpM
    public void n(oJ oJVar) {
        nr(oJVar);
    }
}

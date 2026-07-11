package gq;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class iwV implements OU {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C2145p f67791n;
    private final psW rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Set f67792t;

    private boolean O(pUk.C c2) {
        Iterator it = this.rl.Ik().iterator();
        while (it.hasNext()) {
            if (((h) it.next()).mUb(c2)) {
                return true;
            }
        }
        return false;
    }

    private boolean t(pUk.C c2) {
        if (this.rl.xMQ().mUb(c2) || O(c2)) {
            return true;
        }
        C2145p c2145p = this.f67791n;
        return c2145p != null && c2145p.t(c2);
    }

    @Override // gq.OU
    public long J2() {
        return -1L;
    }

    @Override // gq.OU
    public void az() {
        this.f67792t = new HashSet();
    }

    @Override // gq.OU
    public void n(pUk.C c2) {
        this.f67792t.remove(c2);
    }

    @Override // gq.OU
    public void nr(pUk.C c2) {
        this.f67792t.add(c2);
    }

    @Override // gq.OU
    public void qie() {
        Md mdKN = this.rl.KN();
        ArrayList arrayList = new ArrayList();
        for (pUk.C c2 : this.f67792t) {
            if (!t(c2)) {
                arrayList.add(c2);
            }
        }
        mdKN.removeAll(arrayList);
        this.f67792t = null;
    }

    @Override // gq.OU
    public void rl(pUk.C c2) {
        this.f67792t.add(c2);
    }

    @Override // gq.OU
    public void ty(C2145p c2145p) {
        this.f67791n = c2145p;
    }

    @Override // gq.OU
    public void xMQ(oJ oJVar) {
        Zs zsXMQ = this.rl.xMQ();
        Iterator it = zsXMQ.J2(oJVar.KN()).iterator();
        while (it.hasNext()) {
            this.f67792t.add((pUk.C) it.next());
        }
        zsXMQ.Ik(oJVar);
    }

    iwV(psW psw) {
        this.rl = psw;
    }

    @Override // gq.OU
    public void KN(pUk.C c2) {
        if (t(c2)) {
            this.f67792t.remove(c2);
        } else {
            this.f67792t.add(c2);
        }
    }
}

package gq;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gq.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class C2145p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private eZ.I28 f67827n;
    private eZ.I28 rl;

    private void O(I28 i28) {
        this.f67827n = this.f67827n.J2(i28);
        this.rl = this.rl.J2(i28);
    }

    public void J2(pUk.C c2, int i2) {
        O(new I28(c2, i2));
    }

    public void n(pUk.C c2, int i2) {
        I28 i28 = new I28(c2, i2);
        this.f67827n = this.f67827n.nr(i28);
        this.rl = this.rl.nr(i28);
    }

    public boolean t(pUk.C c2) {
        Iterator itO = this.f67827n.O(new I28(c2, 0));
        if (itO.hasNext()) {
            return ((I28) itO.next()).nr().equals(c2);
        }
        return false;
    }

    public C2145p() {
        List list = Collections.EMPTY_LIST;
        this.f67827n = new eZ.I28(list, I28.f67688t);
        this.rl = new eZ.I28(list, I28.nr);
    }

    public eZ.I28 KN(int i2) {
        Iterator itO = this.rl.O(new I28(pUk.C.t(), i2));
        eZ.I28 i28Nr = pUk.C.nr();
        while (itO.hasNext()) {
            I28 i28 = (I28) itO.next();
            if (i28.t() != i2) {
                break;
            }
            i28Nr = i28Nr.nr(i28.nr());
            O(i28);
        }
        return i28Nr;
    }

    public void Uo(eZ.I28 i28, int i2) {
        Iterator it = i28.iterator();
        while (it.hasNext()) {
            J2((pUk.C) it.next(), i2);
        }
    }

    public eZ.I28 nr(int i2) {
        Iterator itO = this.rl.O(new I28(pUk.C.t(), i2));
        eZ.I28 i28Nr = pUk.C.nr();
        while (itO.hasNext()) {
            I28 i28 = (I28) itO.next();
            if (i28.t() != i2) {
                break;
            }
            i28Nr = i28Nr.nr(i28.nr());
        }
        return i28Nr;
    }

    public void rl(eZ.I28 i28, int i2) {
        Iterator it = i28.iterator();
        while (it.hasNext()) {
            n((pUk.C) it.next(), i2);
        }
    }
}

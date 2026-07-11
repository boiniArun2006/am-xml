package BC;

import com.google.firebase.Timestamp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import pUk.QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f391n;
    private final List nr;
    private final Timestamp rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f392t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CN3.class == obj.getClass()) {
            CN3 cn3 = (CN3) obj;
            if (this.f391n == cn3.f391n && this.rl.equals(cn3.rl) && this.f392t.equals(cn3.f392t) && this.nr.equals(cn3.nr)) {
                return true;
            }
        }
        return false;
    }

    public Ml n(QJ qj, Ml ml) {
        for (int i2 = 0; i2 < this.f392t.size(); i2++) {
            Wre wre = (Wre) this.f392t.get(i2);
            if (wre.J2().equals(qj.getKey())) {
                ml = wre.n(qj, ml, this.rl);
            }
        }
        for (int i3 = 0; i3 < this.nr.size(); i3++) {
            Wre wre2 = (Wre) this.nr.get(i3);
            if (wre2.J2().equals(qj.getKey())) {
                ml = wre2.n(qj, ml, this.rl);
            }
        }
        return ml;
    }

    public Timestamp J2() {
        return this.rl;
    }

    public Set O() {
        HashSet hashSet = new HashSet();
        Iterator it = this.nr.iterator();
        while (it.hasNext()) {
            hashSet.add(((Wre) it.next()).J2());
        }
        return hashSet;
    }

    public List Uo() {
        return this.nr;
    }

    public int hashCode() {
        return (((((this.f391n * 31) + this.rl.hashCode()) * 31) + this.f392t.hashCode()) * 31) + this.nr.hashCode();
    }

    public int nr() {
        return this.f391n;
    }

    public void rl(QJ qj, fuX fux) {
        int size = this.nr.size();
        List listO = fux.O();
        wqP.n.t(listO.size() == size, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(listO.size()));
        for (int i2 = 0; i2 < size; i2++) {
            Wre wre = (Wre) this.nr.get(i2);
            if (wre.J2().equals(qj.getKey())) {
                wre.rl(qj, (Dsr) listO.get(i2));
            }
        }
    }

    public List t() {
        return this.f392t;
    }

    public String toString() {
        return "MutationBatch(batchId=" + this.f391n + ", localWriteTime=" + this.rl + ", baseMutations=" + this.f392t + ", mutations=" + this.nr + ')';
    }

    public CN3(int i2, Timestamp timestamp, List list, List list2) {
        wqP.n.t(!list2.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.f391n = i2;
        this.rl = timestamp;
        this.f392t = list;
        this.nr = list2;
    }
}

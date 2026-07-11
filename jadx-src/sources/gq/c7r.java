package gq;

import android.database.Cursor;
import android.util.SparseArray;
import gq.C2147u;
import java.util.ArrayList;
import java.util.List;
import pUk.C2331c;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class c7r implements OU, Z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private C2145p f67762O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mrQ f67763n;
    private final C2147u nr;
    private uh.Ew rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f67764t = -1;

    @Override // gq.Z
    public int Uo(long j2) {
        final int[] iArr = new int[1];
        final ArrayList arrayList = new ArrayList();
        final C2331c[] c2331cArr = {C2331c.f72012t};
        while (this.f67763n.te("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?").rl(Long.valueOf(j2), Wre.t(c2331cArr[0]), 100).O(new wqP.C() { // from class: gq.RGN
            @Override // wqP.C
            public final void accept(Object obj) {
                c7r.r(this.f67728n, iArr, arrayList, c2331cArr, (Cursor) obj);
            }
        }) == 100) {
        }
        this.f67763n.KN().removeAll(arrayList);
        return iArr[0];
    }

    private void S(pUk.C c2) {
        this.f67763n.XQ("DELETE FROM target_documents WHERE path = ? AND target_id = 0", Wre.t(c2.qie()));
    }

    private boolean XQ(pUk.C c2) {
        return !this.f67763n.te("SELECT 1 FROM document_mutations WHERE path = ?").rl(Wre.t(c2.qie())).J2();
    }

    private boolean Z(pUk.C c2) {
        if (this.f67762O.t(c2)) {
            return true;
        }
        return XQ(c2);
    }

    @Override // gq.Z
    public long HI() {
        return this.f67763n.xMQ().r() + ((Long) this.f67763n.te("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").nr(new wqP.eO() { // from class: gq.B
            @Override // wqP.eO
            public final Object apply(Object obj) {
                return Long.valueOf(((Cursor) obj).getLong(0));
            }
        })).longValue();
    }

    @Override // gq.OU
    public long J2() {
        wqP.n.t(this.f67764t != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f67764t;
    }

    @Override // gq.Z
    public C2147u O() {
        return this.nr;
    }

    void WPU(long j2) {
        this.rl = new uh.Ew(j2);
    }

    @Override // gq.OU
    public void az() {
        wqP.n.t(this.f67764t == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f67764t = this.rl.n();
    }

    @Override // gq.Z
    public long ck() {
        return this.f67763n.S();
    }

    @Override // gq.Z
    public int gh(long j2, SparseArray sparseArray) {
        return this.f67763n.xMQ().Z(j2, sparseArray);
    }

    @Override // gq.Z
    public void mUb(final wqP.C c2) {
        this.f67763n.te("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").O(new wqP.C() { // from class: gq.xuv
            @Override // wqP.C
            public final void accept(Object obj) {
                c2.accept(Long.valueOf(((Cursor) obj).getLong(0)));
            }
        });
    }

    @Override // gq.OU
    public void qie() {
        wqP.n.t(this.f67764t != -1, "Committing a transaction without having started one", new Object[0]);
        this.f67764t = -1L;
    }

    @Override // gq.Z
    public void t(wqP.C c2) {
        this.f67763n.xMQ().ck(c2);
    }

    @Override // gq.OU
    public void ty(C2145p c2145p) {
        this.f67762O = c2145p;
    }

    c7r(mrQ mrq, C2147u.n nVar) {
        this.f67763n = mrq;
        this.nr = new C2147u(this, nVar);
    }

    private void aYN(pUk.C c2) {
        this.f67763n.XQ("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", Wre.t(c2.qie()), Long.valueOf(J2()));
    }

    public static /* synthetic */ void r(c7r c7rVar, int[] iArr, List list, C2331c[] c2331cArr, Cursor cursor) {
        c7rVar.getClass();
        C2331c c2331cRl = Wre.rl(cursor.getString(0));
        pUk.C cUo = pUk.C.Uo(c2331cRl);
        if (!c7rVar.Z(cUo)) {
            iArr[0] = iArr[0] + 1;
            list.add(cUo);
            c7rVar.S(cUo);
        }
        c2331cArr[0] = c2331cRl;
    }

    @Override // gq.OU
    public void KN(pUk.C c2) {
        aYN(c2);
    }

    @Override // gq.OU
    public void n(pUk.C c2) {
        aYN(c2);
    }

    @Override // gq.OU
    public void nr(pUk.C c2) {
        aYN(c2);
    }

    @Override // gq.OU
    public void rl(pUk.C c2) {
        aYN(c2);
    }

    @Override // gq.OU
    public void xMQ(oJ oJVar) {
        this.f67763n.xMQ().n(oJVar.qie(J2()));
    }
}

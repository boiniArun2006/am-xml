package gq;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.protobuf.InvalidProtocolBufferException;
import gq.mrQ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class V1 implements P {
    private com.google.protobuf.C J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f67743O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mrQ f67744n;
    private final String nr;
    private final eO rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final qz f67745t;

    private static class j implements wqP.C {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ArrayList f67746n = new ArrayList();
        private boolean rl = true;

        @Override // wqP.C
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            t(blob);
            if (blob.length < 1000000) {
                this.rl = false;
            }
        }

        com.google.protobuf.C O() {
            return com.google.protobuf.C.copyFrom(this.f67746n);
        }

        int nr() {
            return this.f67746n.size();
        }

        j(byte[] bArr) {
            t(bArr);
        }

        private void t(byte[] bArr) {
            this.f67746n.add(com.google.protobuf.C.copyFrom(bArr));
        }
    }

    private BC.CN3 o(int i2, byte[] bArr) {
        try {
            if (bArr.length < 1000000) {
                return this.rl.O(hoV.I28.ViF(bArr));
            }
            j jVar = new j(bArr);
            while (jVar.rl) {
                this.f67744n.te("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?").rl(Integer.valueOf((jVar.nr() * 1000000) + 1), 1000000, this.nr, Integer.valueOf(i2)).t(jVar);
            }
            return this.rl.O(hoV.I28.aYN(jVar.O()));
        } catch (InvalidProtocolBufferException e2) {
            throw wqP.n.n("MutationBatch failed to parse: %s", e2);
        }
    }

    private void S() {
        this.f67744n.XQ("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.nr, -1, this.J2.toByteArray());
    }

    private void XQ() {
        final ArrayList arrayList = new ArrayList();
        this.f67744n.te("SELECT uid FROM mutation_queues").O(new wqP.C() { // from class: gq.Ogx
            @Override // wqP.C
            public final void accept(Object obj) {
                arrayList.add(((Cursor) obj).getString(0));
            }
        });
        this.f67743O = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f67744n.te("SELECT MAX(batch_id) FROM mutations WHERE uid = ?").rl((String) it.next()).O(new wqP.C() { // from class: gq.DC
                @Override // wqP.C
                public final void accept(Object obj) {
                    V1 v1 = this.f67677n;
                    v1.f67743O = Math.max(v1.f67743O, ((Cursor) obj).getInt(0));
                }
            });
        }
        this.f67743O++;
    }

    @Override // gq.P
    public void J2(BC.CN3 cn3) {
        SQLiteStatement sQLiteStatementG = this.f67744n.g("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement sQLiteStatementG2 = this.f67744n.g("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int iNr = cn3.nr();
        wqP.n.t(this.f67744n.Z(sQLiteStatementG, this.nr, Integer.valueOf(iNr)) != 0, "Mutation batch (%s, %d) did not exist", this.nr, Integer.valueOf(cn3.nr()));
        Iterator it = cn3.Uo().iterator();
        while (it.hasNext()) {
            pUk.C cJ2 = ((BC.Wre) it.next()).J2();
            this.f67744n.Z(sQLiteStatementG2, this.nr, Wre.t(cJ2.qie()), Integer.valueOf(iNr));
            this.f67744n.Uo().nr(cJ2);
        }
    }

    @Override // gq.P
    public com.google.protobuf.C O() {
        return this.J2;
    }

    public boolean Z() {
        return this.f67744n.te("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1").rl(this.nr).J2();
    }

    @Override // gq.P
    public BC.CN3 nr(final int i2) {
        return (BC.CN3) this.f67744n.te("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?").rl(1000000, this.nr, Integer.valueOf(i2)).nr(new wqP.eO() { // from class: gq.T
            @Override // wqP.eO
            public final Object apply(Object obj) {
                return V1.az(this.f67738n, i2, (Cursor) obj);
            }
        });
    }

    @Override // gq.P
    public List rl(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Wre.t(((pUk.C) it.next()).qie()));
        }
        mrQ.n nVar = new mrQ.n(this.f67744n, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, this.nr), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        final ArrayList arrayList2 = new ArrayList();
        final HashSet hashSet = new HashSet();
        while (nVar.nr()) {
            nVar.O().O(new wqP.C() { // from class: gq.L0y
                @Override // wqP.C
                public final void accept(Object obj) {
                    V1.ck(this.f67698n, hashSet, arrayList2, (Cursor) obj);
                }
            });
        }
        if (nVar.t() > 1) {
            Collections.sort(arrayList2, new Comparator() { // from class: gq.CM
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return wqP.Z.gh(((BC.CN3) obj).nr(), ((BC.CN3) obj2).nr());
                }
            });
        }
        return arrayList2;
    }

    @Override // gq.P
    public BC.CN3 t(int i2) {
        return (BC.CN3) this.f67744n.te("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1").rl(1000000, this.nr, Integer.valueOf(i2 + 1)).nr(new wqP.eO() { // from class: gq.t
            @Override // wqP.eO
            public final Object apply(Object obj) {
                return V1.qie(this.f67851n, (Cursor) obj);
            }
        });
    }

    @Override // gq.P
    public List xMQ() {
        final ArrayList arrayList = new ArrayList();
        this.f67744n.te("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC").rl(1000000, this.nr).O(new wqP.C() { // from class: gq.g9
            @Override // wqP.C
            public final void accept(Object obj) {
                V1.HI(this.f67775n, arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    V1(mrQ mrq, eO eOVar, VtZ.aC aCVar, qz qzVar) {
        String strN;
        this.f67744n = mrq;
        this.rl = eOVar;
        if (aCVar.rl()) {
            strN = aCVar.n();
        } else {
            strN = "";
        }
        this.nr = strN;
        this.J2 = com.google.firebase.firestore.remote.DAz.f60374S;
        this.f67745t = qzVar;
    }

    public static /* synthetic */ void HI(V1 v1, List list, Cursor cursor) {
        v1.getClass();
        list.add(v1.o(cursor.getInt(0), cursor.getBlob(1)));
    }

    public static /* synthetic */ BC.CN3 az(V1 v1, int i2, Cursor cursor) {
        v1.getClass();
        return v1.o(i2, cursor.getBlob(0));
    }

    public static /* synthetic */ void ck(V1 v1, Set set, List list, Cursor cursor) {
        v1.getClass();
        int i2 = cursor.getInt(0);
        if (!set.contains(Integer.valueOf(i2))) {
            set.add(Integer.valueOf(i2));
            list.add(v1.o(i2, cursor.getBlob(1)));
        }
    }

    public static /* synthetic */ void gh(V1 v1, Cursor cursor) {
        v1.getClass();
        v1.J2 = com.google.protobuf.C.copyFrom(cursor.getBlob(0));
    }

    public static /* synthetic */ BC.CN3 qie(V1 v1, Cursor cursor) {
        v1.getClass();
        return v1.o(cursor.getInt(0), cursor.getBlob(1));
    }

    @Override // gq.P
    public void KN(BC.CN3 cn3, com.google.protobuf.C c2) {
        this.J2 = (com.google.protobuf.C) AbstractC2418c.rl(c2);
        S();
    }

    @Override // gq.P
    public void Uo(com.google.protobuf.C c2) {
        this.J2 = (com.google.protobuf.C) AbstractC2418c.rl(c2);
        S();
    }

    @Override // gq.P
    public void n() {
        if (!Z()) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        this.f67744n.te("SELECT path FROM document_mutations WHERE uid = ?").rl(this.nr).O(new wqP.C() { // from class: gq.crp
            @Override // wqP.C
            public final void accept(Object obj) {
                arrayList.add(Wre.rl(((Cursor) obj).getString(0)));
            }
        });
        wqP.n.t(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
    }

    @Override // gq.P
    public void start() {
        XQ();
        if (this.f67744n.te("SELECT last_stream_token FROM mutation_queues WHERE uid = ?").rl(this.nr).t(new wqP.C() { // from class: gq.cA
            @Override // wqP.C
            public final void accept(Object obj) {
                V1.gh(this.f67765n, (Cursor) obj);
            }
        }) == 0) {
            S();
        }
    }
}

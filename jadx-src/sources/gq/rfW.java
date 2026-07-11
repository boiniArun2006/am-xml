package gq;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import com.google.firebase.Timestamp;
import com.google.protobuf.InvalidProtocolBufferException;
import gq.rfW;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class rfW implements tpM {
    private long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private pUk.UGc f67842O = pUk.UGc.f72007t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mrQ f67843n;
    private long nr;
    private final eO rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f67844t;

    /* JADX INFO: Access modifiers changed from: private */
    static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        eZ.I28 f67845n;

        private n() {
            this.f67845n = pUk.C.nr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        oJ f67846n;

        private w6() {
        }
    }

    int Z(long j2, final SparseArray sparseArray) {
        final int[] iArr = new int[1];
        this.f67843n.te("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?").rl(Long.valueOf(j2)).O(new wqP.C() { // from class: gq.Sw
            @Override // wqP.C
            public final void accept(Object obj) {
                rfW.az(this.f67736n, sparseArray, iArr, (Cursor) obj);
            }
        });
        ViF();
        return iArr[0];
    }

    private oJ HI(byte[] bArr) {
        try {
            return this.rl.Uo(hoV.w6.g(bArr));
        } catch (InvalidProtocolBufferException e2) {
            throw wqP.n.n("TargetData failed to parse: %s", e2);
        }
    }

    private void ViF() {
        this.f67843n.XQ("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f67844t), Long.valueOf(this.nr), Long.valueOf(this.f67842O.rl().getSeconds()), Integer.valueOf(this.f67842O.rl().getNanoseconds()), Long.valueOf(this.J2));
    }

    public long Ik() {
        return this.nr;
    }

    @Override // gq.tpM
    public eZ.I28 J2(int i2) {
        final n nVar = new n();
        this.f67843n.te("SELECT path FROM target_documents WHERE target_id = ?").rl(Integer.valueOf(i2)).O(new wqP.C() { // from class: gq.ibE
            @Override // wqP.C
            public final void accept(Object obj) {
                rfW.n nVar2 = nVar;
                nVar2.f67845n = nVar2.f67845n.nr(pUk.C.Uo(Wre.rl(((Cursor) obj).getString(0))));
            }
        });
        return nVar.f67845n;
    }

    @Override // gq.tpM
    public void KN(eZ.I28 i28, int i2) {
        SQLiteStatement sQLiteStatementG = this.f67843n.g("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        c7r c7rVarViF = this.f67843n.Uo();
        Iterator it = i28.iterator();
        while (it.hasNext()) {
            pUk.C c2 = (pUk.C) it.next();
            this.f67843n.Z(sQLiteStatementG, Integer.valueOf(i2), Wre.t(c2.qie()));
            c7rVarViF.rl(c2);
        }
    }

    @Override // gq.tpM
    public int O() {
        return this.f67844t;
    }

    @Override // gq.tpM
    public pUk.UGc Uo() {
        return this.f67842O;
    }

    void WPU() {
        wqP.n.t(this.f67843n.te("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").t(new wqP.C() { // from class: gq.zpl
            @Override // wqP.C
            public final void accept(Object obj) {
                rfW.qie(this.f67874n, (Cursor) obj);
            }
        }) == 1, "Missing target_globals entry", new Object[0]);
    }

    public void ck(final wqP.C c2) {
        this.f67843n.te("SELECT target_proto FROM targets").O(new wqP.C() { // from class: gq.xq
            @Override // wqP.C
            public final void accept(Object obj) {
                rfW.ty(this.f67867n, c2, (Cursor) obj);
            }
        });
    }

    public void o(int i2) {
        this.f67843n.XQ("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i2));
    }

    public long r() {
        return this.J2;
    }

    @Override // gq.tpM
    public void rl(pUk.UGc uGc) {
        this.f67842O = uGc;
        ViF();
    }

    @Override // gq.tpM
    public void xMQ(eZ.I28 i28, int i2) {
        SQLiteStatement sQLiteStatementG = this.f67843n.g("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        c7r c7rVarViF = this.f67843n.Uo();
        Iterator it = i28.iterator();
        while (it.hasNext()) {
            pUk.C c2 = (pUk.C) it.next();
            this.f67843n.Z(sQLiteStatementG, Integer.valueOf(i2), Wre.t(c2.qie()));
            c7rVarViF.n(c2);
        }
    }

    rfW(mrQ mrq, eO eOVar) {
        this.f67843n = mrq;
        this.rl = eOVar;
    }

    private void S(oJ oJVar) {
        int iKN = oJVar.KN();
        String strT = oJVar.Uo().t();
        Timestamp timestampRl = oJVar.J2().rl();
        this.f67843n.XQ("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(iKN), strT, Long.valueOf(timestampRl.getSeconds()), Integer.valueOf(timestampRl.getNanoseconds()), oJVar.nr().toByteArray(), Long.valueOf(oJVar.O()), this.rl.HI(oJVar).toByteArray());
    }

    private void XQ(int i2) {
        o(i2);
        this.f67843n.XQ("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i2));
        this.J2--;
    }

    private boolean aYN(oJ oJVar) {
        boolean z2;
        if (oJVar.KN() > this.f67844t) {
            this.f67844t = oJVar.KN();
            z2 = true;
        } else {
            z2 = false;
        }
        if (oJVar.O() > this.nr) {
            this.nr = oJVar.O();
            return true;
        }
        return z2;
    }

    public static /* synthetic */ void az(rfW rfw, SparseArray sparseArray, int[] iArr, Cursor cursor) {
        rfw.getClass();
        int i2 = cursor.getInt(0);
        if (sparseArray.get(i2) == null) {
            rfw.XQ(i2);
            iArr[0] = iArr[0] + 1;
        }
    }

    public static /* synthetic */ void gh(rfW rfw, uh.vd vdVar, w6 w6Var, Cursor cursor) {
        rfw.getClass();
        oJ oJVarHI = rfw.HI(cursor.getBlob(0));
        if (vdVar.equals(oJVarHI.Uo())) {
            w6Var.f67846n = oJVarHI;
        }
    }

    public static /* synthetic */ void qie(rfW rfw, Cursor cursor) {
        rfw.getClass();
        rfw.f67844t = cursor.getInt(0);
        rfw.nr = cursor.getInt(1);
        rfw.f67842O = new pUk.UGc(new Timestamp(cursor.getLong(2), cursor.getInt(3)));
        rfw.J2 = cursor.getLong(4);
    }

    public static /* synthetic */ void ty(rfW rfw, wqP.C c2, Cursor cursor) {
        rfw.getClass();
        c2.accept(rfw.HI(cursor.getBlob(0)));
    }

    @Override // gq.tpM
    public void n(oJ oJVar) {
        S(oJVar);
        if (aYN(oJVar)) {
            ViF();
        }
    }

    @Override // gq.tpM
    public void nr(oJ oJVar) {
        S(oJVar);
        aYN(oJVar);
        this.J2++;
        ViF();
    }

    @Override // gq.tpM
    public oJ t(final uh.vd vdVar) {
        String strT = vdVar.t();
        final w6 w6Var = new w6();
        this.f67843n.te("SELECT target_proto FROM targets WHERE canonical_id = ?").rl(strT).O(new wqP.C() { // from class: gq.DT
            @Override // wqP.C
            public final void accept(Object obj) {
                rfW.gh(this.f67678n, vdVar, w6Var, (Cursor) obj);
            }
        });
        return w6Var.f67846n;
    }
}

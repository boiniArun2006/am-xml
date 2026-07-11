package gq;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.InvalidProtocolBufferException;
import gq.mrQ;
import gq.rv6;
import hoV.w6;
import java.util.ArrayList;
import java.util.List;
import pUk.C2331c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class IE {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SQLiteDatabase f67690n;
    private final eO rl;

    public static /* synthetic */ void az(boolean[] zArr, SQLiteStatement sQLiteStatement, Cursor cursor) {
        zArr[0] = true;
        String string = cursor.getString(0);
        C2331c c2331cRl = Wre.rl(string);
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, c2331cRl.ty());
        sQLiteStatement.bindString(2, string);
        wqP.n.t(sQLiteStatement.executeUpdateDelete() != -1, "Failed to update document path", new Object[0]);
    }

    private void nHg() {
        final boolean[] zArr;
        mrQ.Ml mlRl = new mrQ.Ml(this.f67690n, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?").rl(100);
        final SQLiteStatement sQLiteStatementCompileStatement = this.f67690n.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
        do {
            zArr = new boolean[]{false};
            mlRl.O(new wqP.C() { // from class: gq.U
                @Override // wqP.C
                public final void accept(Object obj) {
                    IE.az(zArr, sQLiteStatementCompileStatement, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    public static /* synthetic */ void qie(boolean[] zArr, SQLiteStatement sQLiteStatement, long j2, Cursor cursor) {
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j2);
        wqP.n.t(sQLiteStatement.executeInsert() != -1, "Failed to insert a sentinel row", new Object[0]);
    }

    private void wTp() {
        final boolean[] zArr;
        Long l2 = (Long) new mrQ.Ml(this.f67690n, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").nr(new wqP.eO() { // from class: gq.V
            @Override // wqP.eO
            public final Object apply(Object obj) {
                return Long.valueOf(((Cursor) obj).getLong(0));
            }
        });
        wqP.n.t(l2 != null, "Missing highest sequence number", new Object[0]);
        final long jLongValue = l2.longValue();
        final SQLiteStatement sQLiteStatementCompileStatement = this.f67690n.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        mrQ.Ml mlRl = new mrQ.Ml(this.f67690n, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").rl(100);
        do {
            zArr = new boolean[]{false};
            mlRl.O(new wqP.C() { // from class: gq.Qik
                @Override // wqP.C
                public final void accept(Object obj) {
                    IE.qie(zArr, sQLiteStatementCompileStatement, jLongValue, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    private boolean E(String str) {
        return !new mrQ.Ml(this.f67690n, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").rl(str).J2();
    }

    private void E2() {
        Xw(new String[]{"remote_documents"}, new Runnable() { // from class: gq.W
            @Override // java.lang.Runnable
            public final void run() {
                this.f67748n.f67690n.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
            }
        });
    }

    public static /* synthetic */ void Ik(IE ie) {
        ie.f67690n.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
        ie.f67690n.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
        ie.f67690n.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
        ie.f67690n.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
    }

    public static /* synthetic */ void J2(IE ie) {
        ie.f67690n.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        ie.f67690n.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    private void N() {
        if (E("targets")) {
            this.f67690n.execSQL("DROP TABLE targets");
        }
        if (E("target_globals")) {
            this.f67690n.execSQL("DROP TABLE target_globals");
        }
        if (E("target_documents")) {
            this.f67690n.execSQL("DROP TABLE target_documents");
        }
    }

    private void P5() {
        new mrQ.Ml(this.f67690n, "SELECT target_id, target_proto FROM targets").O(new wqP.C() { // from class: gq.t6
            @Override // wqP.C
            public final void accept(Object obj) {
                IE.Uo(this.f67852n, (Cursor) obj);
            }
        });
    }

    private void S() {
        this.f67690n.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.f67690n.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    private void T() {
        new mrQ.Ml(this.f67690n, "SELECT target_id, target_proto FROM targets").O(new wqP.C() { // from class: gq.D
            @Override // wqP.C
            public final void accept(Object obj) {
                IE.o(this.f67675n, (Cursor) obj);
            }
        });
    }

    private void U(String str, int i2) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f67690n.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        sQLiteStatementCompileStatement.bindString(1, str);
        sQLiteStatementCompileStatement.bindLong(2, i2);
        wqP.n.t(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i2));
        this.f67690n.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i2)});
    }

    private void ViF() {
        Xw(new String[]{"bundles", "named_queries"}, new Runnable() { // from class: gq.ozJ
            @Override // java.lang.Runnable
            public final void run() {
                IE.J2(this.f67826n);
            }
        });
    }

    private void WPU() {
        if (eF("target_documents", "sequence_number")) {
            return;
        }
        this.f67690n.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
    }

    private void X() {
        Xw(new String[]{"collection_parents"}, new Runnable() { // from class: gq.nSC
            @Override // java.lang.Runnable
            public final void run() {
                this.f67813n.f67690n.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
            }
        });
        final rv6.j jVar = new rv6.j();
        final SQLiteStatement sQLiteStatementCompileStatement = this.f67690n.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)");
        final wqP.C c2 = new wqP.C() { // from class: gq.HcS
            @Override // wqP.C
            public final void accept(Object obj) {
                IE.KN(jVar, sQLiteStatementCompileStatement, (C2331c) obj);
            }
        };
        new mrQ.Ml(this.f67690n, "SELECT path FROM remote_documents").O(new wqP.C() { // from class: gq.VoU
            @Override // wqP.C
            public final void accept(Object obj) {
                c2.accept((C2331c) Wre.rl(((Cursor) obj).getString(0)).ck());
            }
        });
        new mrQ.Ml(this.f67690n, "SELECT path FROM document_mutations").O(new wqP.C() { // from class: gq.s6u
            @Override // wqP.C
            public final void accept(Object obj) {
                c2.accept((C2331c) Wre.rl(((Cursor) obj).getString(0)).ck());
            }
        });
    }

    private void XQ(String str) {
        this.f67690n.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{str});
    }

    private void Xw(String[] strArr, Runnable runnable) {
        String str = "[" + TextUtils.join(", ", strArr) + "]";
        boolean z2 = false;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str2 = strArr[i2];
            boolean zE = E(str2);
            if (i2 == 0) {
                z2 = zE;
            } else if (zE != z2) {
                String str3 = "Expected all of " + str + " to either exist or not, but ";
                throw new IllegalStateException(z2 ? str3 + strArr[0] + " exists and " + str2 + " does not" : str3 + strArr[0] + " does not exist and " + str2 + " does");
            }
        }
        if (!z2) {
            runnable.run();
            return;
        }
        wqP.QJ.n("SQLiteSchema", "Skipping migration because all of " + str + " already exist", new Object[0]);
    }

    private void Z() {
        if (eF("remote_documents", "path_length")) {
            return;
        }
        this.f67690n.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
    }

    private void aYN() {
        if (!eF("target_globals", "target_count")) {
            this.f67690n.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long jQueryNumEntries = DatabaseUtils.queryNumEntries(this.f67690n, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(jQueryNumEntries));
        this.f67690n.update("target_globals", contentValues, null, null);
    }

    private boolean bzg() {
        boolean zEF = eF("remote_documents", "read_time_seconds");
        boolean zEF2 = eF("remote_documents", "read_time_nanos");
        wqP.n.t(zEF == zEF2, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        return zEF && zEF2;
    }

    private void e() {
        Xw(new String[]{"targets", "target_globals", "target_documents"}, new Runnable() { // from class: gq.OA
            @Override // java.lang.Runnable
            public final void run() {
                IE.mUb(this.f67717n);
            }
        });
    }

    private void fD() {
        Xw(new String[]{"mutation_queues", "mutations", "document_mutations"}, new Runnable() { // from class: gq.S
            @Override // java.lang.Runnable
            public final void run() {
                IE.ty(this.f67731n);
            }
        });
    }

    private void g() {
        Xw(new String[]{"index_configuration", "index_state", "index_entries"}, new Runnable() { // from class: gq.z3w
            @Override // java.lang.Runnable
            public final void run() {
                IE.Ik(this.f67873n);
            }
        });
    }

    public static /* synthetic */ void gh(IE ie) {
        ie.f67690n.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
        ie.f67690n.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
        ie.f67690n.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
    }

    private void iF() {
        Xw(new String[]{"document_overlays"}, new Runnable() { // from class: gq.AZy
            @Override // java.lang.Runnable
            public final void run() {
                IE.gh(this.f67673n);
            }
        });
    }

    private void jB() {
        new mrQ.Ml(this.f67690n, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").O(new wqP.C() { // from class: gq.dT
            @Override // wqP.C
            public final void accept(Object obj) {
                IE.xMQ(this.f67769n, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ void mUb(IE ie) {
        ie.f67690n.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        ie.f67690n.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        ie.f67690n.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        ie.f67690n.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        ie.f67690n.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    private void nY() {
        Xw(new String[]{"data_migrations"}, new Runnable() { // from class: gq.yr
            @Override // java.lang.Runnable
            public final void run() {
                this.f67870n.f67690n.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
            }
        });
    }

    private void s7N() {
        this.f67690n.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
    }

    private void te() {
        Xw(new String[]{"globals"}, new Runnable() { // from class: gq.eZk
            @Override // java.lang.Runnable
            public final void run() {
                this.f67772n.f67690n.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
            }
        });
    }

    public static /* synthetic */ void ty(IE ie) {
        ie.f67690n.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        ie.f67690n.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        ie.f67690n.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    private void v() {
        if (DatabaseUtils.queryNumEntries(this.f67690n, "target_globals") == 1) {
            return;
        }
        this.f67690n.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
    }

    void M7(int i2) {
        p5(i2, 17);
    }

    List rV9(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.f67690n.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursorRawQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getString(columnIndex));
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    IE(SQLiteDatabase sQLiteDatabase, eO eOVar) {
        this.f67690n = sQLiteDatabase;
        this.rl = eOVar;
    }

    public static /* synthetic */ void KN(rv6.j jVar, SQLiteStatement sQLiteStatement, C2331c c2331c) {
        if (jVar.n(c2331c)) {
            String strXMQ = c2331c.xMQ();
            C2331c c2331c2 = (C2331c) c2331c.ck();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, strXMQ);
            sQLiteStatement.bindString(2, Wre.t(c2331c2));
            sQLiteStatement.execute();
        }
    }

    public static /* synthetic */ void Uo(IE ie, Cursor cursor) {
        ie.getClass();
        int i2 = cursor.getInt(0);
        try {
            ie.f67690n.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{ie.rl.Uo(hoV.w6.g(cursor.getBlob(1))).Uo().t(), Integer.valueOf(i2)});
        } catch (InvalidProtocolBufferException unused) {
            throw wqP.n.n("Failed to decode Query data for target %s", Integer.valueOf(i2));
        }
    }

    private boolean eF(String str, String str2) {
        if (rV9(str).indexOf(str2) != -1) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void nr(IE ie, String str, Cursor cursor) {
        ie.getClass();
        ie.U(str, cursor.getInt(0));
    }

    public static /* synthetic */ void o(IE ie, Cursor cursor) {
        ie.getClass();
        int i2 = cursor.getInt(0);
        try {
            ie.f67690n.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((hoV.w6) ((w6.n) hoV.w6.g(cursor.getBlob(1)).toBuilder()).xMQ().build()).toByteArray(), Integer.valueOf(i2)});
        } catch (InvalidProtocolBufferException unused) {
            throw wqP.n.n("Failed to decode Query data for target %s", Integer.valueOf(i2));
        }
    }

    public static /* synthetic */ void xMQ(final IE ie, Cursor cursor) {
        ie.getClass();
        final String string = cursor.getString(0);
        new mrQ.Ml(ie.f67690n, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").rl(string, Long.valueOf(cursor.getLong(1))).O(new wqP.C() { // from class: gq.Mo
            @Override // wqP.C
            public final void accept(Object obj) {
                IE.nr(this.f67715n, string, (Cursor) obj);
            }
        });
    }

    void p5(int i2, int i3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i2 < 1 && i3 >= 1) {
            fD();
            e();
            E2();
        }
        if (i2 < 3 && i3 >= 3 && i2 != 0) {
            N();
            e();
        }
        if (i2 < 4 && i3 >= 4) {
            v();
            aYN();
        }
        if (i2 < 5 && i3 >= 5) {
            WPU();
        }
        if (i2 < 6 && i3 >= 6) {
            jB();
        }
        if (i2 < 7 && i3 >= 7) {
            wTp();
        }
        if (i2 < 8 && i3 >= 8) {
            X();
        }
        if (i2 < 9 && i3 >= 9) {
            if (!bzg()) {
                S();
            } else {
                T();
            }
        }
        if (i2 == 9 && i3 >= 10) {
            T();
        }
        if (i2 < 11 && i3 >= 11) {
            P5();
        }
        if (i2 < 12 && i3 >= 12) {
            ViF();
        }
        if (i2 < 13 && i3 >= 13) {
            Z();
            nHg();
        }
        if (i2 < 14 && i3 >= 14) {
            iF();
            nY();
            XQ(yg.rl);
        }
        if (i2 < 15 && i3 >= 15) {
            s7N();
        }
        if (i2 < 16 && i3 >= 16) {
            g();
        }
        if (i2 < 17 && i3 >= 17) {
            te();
        }
        wqP.QJ.n("SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }
}

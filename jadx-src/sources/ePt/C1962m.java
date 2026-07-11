package ePt;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: ePt.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class C1962m extends SQLiteOpenHelper {
    private static final j E2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final j f63653S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final List f63654X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final j f63655Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j f63656e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j f63657g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final j f63658o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final j f63659r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f63660n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f63661t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f63652O = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
    static int J2 = 7;

    /* JADX INFO: renamed from: ePt.m$j */
    public interface j {
        void n(SQLiteDatabase sQLiteDatabase);
    }

    C1962m(Context context, String str, int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.f63661t = false;
        this.f63660n = i2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f63661t = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    static {
        j jVar = new j() { // from class: ePt.Lu
            @Override // ePt.C1962m.j
            public final void n(SQLiteDatabase sQLiteDatabase) {
                C1962m.n(sQLiteDatabase);
            }
        };
        f63659r = jVar;
        j jVar2 = new j() { // from class: ePt.h
            @Override // ePt.C1962m.j
            public final void n(SQLiteDatabase sQLiteDatabase) {
                C1962m.jB(sQLiteDatabase);
            }
        };
        f63658o = jVar2;
        j jVar3 = new j() { // from class: ePt.K
            @Override // ePt.C1962m.j
            public final void n(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f63655Z = jVar3;
        j jVar4 = new j() { // from class: ePt.psW
            @Override // ePt.C1962m.j
            public final void n(SQLiteDatabase sQLiteDatabase) {
                C1962m.U(sQLiteDatabase);
            }
        };
        f63653S = jVar4;
        j jVar5 = new j() { // from class: ePt.Md
            @Override // ePt.C1962m.j
            public final void n(SQLiteDatabase sQLiteDatabase) {
                C1962m.Z(sQLiteDatabase);
            }
        };
        f63657g = jVar5;
        j jVar6 = new j() { // from class: ePt.Zs
            @Override // ePt.C1962m.j
            public final void n(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        E2 = jVar6;
        j jVar7 = new j() { // from class: ePt.P
            @Override // ePt.C1962m.j
            public final void n(SQLiteDatabase sQLiteDatabase) {
                C1962m.rl(sQLiteDatabase);
            }
        };
        f63656e = jVar7;
        f63654X = Arrays.asList(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7);
    }

    private void M7(SQLiteDatabase sQLiteDatabase) {
        if (this.f63661t) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    public static /* synthetic */ void U(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    public static /* synthetic */ void Z(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f63652O);
    }

    private void eF(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        List list = f63654X;
        if (i3 <= list.size()) {
            while (i2 < i3) {
                ((j) f63654X.get(i2)).n(sQLiteDatabase);
                i2++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i2 + " to " + i3 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public static /* synthetic */ void jB(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void rl(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        p5(sQLiteDatabase, this.f63660n);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        p5(sQLiteDatabase, i3);
    }

    private void p5(SQLiteDatabase sQLiteDatabase, int i2) {
        M7(sQLiteDatabase);
        eF(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        M7(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        M7(sQLiteDatabase);
        eF(sQLiteDatabase, i2, i3);
    }
}

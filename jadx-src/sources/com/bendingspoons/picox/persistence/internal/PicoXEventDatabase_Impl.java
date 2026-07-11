package com.bendingspoons.picox.persistence.internal;

import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import zL.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class PicoXEventDatabase_Impl extends PicoXEventDatabase {
    private volatile zL.j Ik;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    class j extends RoomOpenHelper.Delegate {
        @Override // androidx.room.RoomOpenHelper.Delegate
        public void O(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        j(int i2) {
            super(i2);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult Uo(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(2);
            map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
            map.put("eventData", new TableInfo.Column("eventData", "TEXT", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("picox_events", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfoRl = TableInfo.rl(supportSQLiteDatabase, "picox_events");
            if (tableInfo.equals(tableInfoRl)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "picox_events(com.bendingspoons.picox.persistence.internal.entity.PicoXEventEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfoRl);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void n(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.ck(obbPUqyhtS.gQmtEdzdLv);
            supportSQLiteDatabase.ck("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.ck("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b17456751735981127b48568a415ad81')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void nr(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) PicoXEventDatabase_Impl.this).mDatabase = supportSQLiteDatabase;
            PicoXEventDatabase_Impl.this.rV9(supportSQLiteDatabase);
            List list = ((RoomDatabase) PicoXEventDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).J2(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void rl(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.ck("DROP TABLE IF EXISTS `picox_events`");
            List list = ((RoomDatabase) PicoXEventDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).nr(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void t(SupportSQLiteDatabase supportSQLiteDatabase) {
            List list = ((RoomDatabase) PicoXEventDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).rl(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void J2(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.t(supportSQLiteDatabase);
        }
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker HI() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "picox_events");
    }

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper Ik(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.n(SupportSQLiteOpenHelper.Configuration.n(databaseConfiguration.context).t(databaseConfiguration.com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String).rl(new RoomOpenHelper(databaseConfiguration, new j(1), "b17456751735981127b48568a415ad81", "f60960aabe5bea6da14b183519d18c16")).n());
    }

    @Override // androidx.room.RoomDatabase
    public List Z(Map map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    protected Map fD() {
        HashMap map = new HashMap();
        map.put(zL.j.class, n.Uo());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public Set g() {
        return new HashSet();
    }

    @Override // com.bendingspoons.picox.persistence.internal.PicoXEventDatabase
    public zL.j p5() {
        zL.j jVar;
        if (this.Ik != null) {
            return this.Ik;
        }
        synchronized (this) {
            try {
                if (this.Ik == null) {
                    this.Ik = new n(this);
                }
                jVar = this.Ik;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }
}

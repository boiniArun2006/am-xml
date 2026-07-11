package com.bendingspoons.spidersense.data.storageManager.internal;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import i1.Ml;
import i1.w6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CompleteDebugEventDatabase_Impl extends CompleteDebugEventDatabase {
    private volatile w6 Ik;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    class j extends RoomOpenHelper.Delegate {
        @Override // androidx.room.RoomOpenHelper.Delegate
        public void O(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        j(int i2) {
            super(i2);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult Uo(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(3);
            map.put(YjqZUJsVmhcjko.wTU, new TableInfo.Column("id", "TEXT", true, 1, null, 1));
            map.put("storedAt", new TableInfo.Column("storedAt", "REAL", true, 0, null, 1));
            map.put("completeDebugEventData", new TableInfo.Column("completeDebugEventData", "TEXT", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("spidersense_complete_debug_events", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfoRl = TableInfo.rl(supportSQLiteDatabase, "spidersense_complete_debug_events");
            if (tableInfo.equals(tableInfoRl)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "spidersense_complete_debug_events(com.bendingspoons.spidersense.data.storageManager.entities.CompleteDebugEventEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfoRl);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void n(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.ck("CREATE TABLE IF NOT EXISTS `spidersense_complete_debug_events` (`id` TEXT NOT NULL, `storedAt` REAL NOT NULL, `completeDebugEventData` TEXT NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.ck("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.ck("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a7c3a0ca1504a7409e4b00a510d6b5e9')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void nr(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) CompleteDebugEventDatabase_Impl.this).mDatabase = supportSQLiteDatabase;
            CompleteDebugEventDatabase_Impl.this.rV9(supportSQLiteDatabase);
            List list = ((RoomDatabase) CompleteDebugEventDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).J2(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void rl(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.ck("DROP TABLE IF EXISTS `spidersense_complete_debug_events`");
            List list = ((RoomDatabase) CompleteDebugEventDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).nr(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void t(SupportSQLiteDatabase supportSQLiteDatabase) {
            List list = ((RoomDatabase) CompleteDebugEventDatabase_Impl.this).mCallbacks;
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "spidersense_complete_debug_events");
    }

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper Ik(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.n(SupportSQLiteOpenHelper.Configuration.n(databaseConfiguration.context).t(databaseConfiguration.com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String).rl(new RoomOpenHelper(databaseConfiguration, new j(5), "a7c3a0ca1504a7409e4b00a510d6b5e9", "04d1abf9900085db104d017455692d6e")).n());
    }

    @Override // androidx.room.RoomDatabase
    public List Z(Map map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    protected Map fD() {
        HashMap map = new HashMap();
        map.put(w6.class, Ml.mUb());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public Set g() {
        return new HashSet();
    }

    @Override // com.bendingspoons.spidersense.data.storageManager.internal.CompleteDebugEventDatabase
    public w6 p5() {
        w6 w6Var;
        if (this.Ik != null) {
            return this.Ik;
        }
        synchronized (this) {
            try {
                if (this.Ik == null) {
                    this.Ik = new Ml(this);
                }
                w6Var = this.Ik;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w6Var;
    }
}

package com.alightcreative.room;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import f2.I28;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class AlightDatabase_Impl extends AlightDatabase {
    private volatile f2.j ck;

    class j extends RoomOpenDelegate {
        @Override // androidx.room.RoomOpenDelegate
        public void J2(SQLiteConnection sQLiteConnection) {
        }

        @Override // androidx.room.RoomOpenDelegate
        public void KN(SQLiteConnection sQLiteConnection) {
        }

        j(int i2, String str, String str2) {
            super(i2, str, str2);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void Uo(SQLiteConnection sQLiteConnection) {
            AlightDatabase_Impl.this.v(sQLiteConnection);
        }

        @Override // androidx.room.RoomOpenDelegate
        public RoomOpenDelegate.ValidationResult mUb(SQLiteConnection sQLiteConnection) {
            HashMap map = new HashMap(3);
            map.put("projectId", new TableInfo.Column("projectId", "TEXT", true, 1, null, 1));
            map.put("featureId", new TableInfo.Column("featureId", "TEXT", true, 2, null, 1));
            map.put("expirationMillis", new TableInfo.Column("expirationMillis", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("unlock_feature", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfoN = TableInfo.n(sQLiteConnection, "unlock_feature");
            if (tableInfo.equals(tableInfoN)) {
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
            return new RoomOpenDelegate.ValidationResult(false, "unlock_feature(com.alightcreative.ads.data.UnlockFeatureRoomEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfoN);
        }

        @Override // androidx.room.RoomOpenDelegate
        public void n(SQLiteConnection sQLiteConnection) {
            SQLite.n(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `unlock_feature` (`projectId` TEXT NOT NULL, `featureId` TEXT NOT NULL, `expirationMillis` INTEGER NOT NULL, PRIMARY KEY(`projectId`, `featureId`))");
            SQLite.n(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            SQLite.n(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cc648343467204e619631475f92312c8')");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void rl(SQLiteConnection sQLiteConnection) {
            SQLite.n(sQLiteConnection, "DROP TABLE IF EXISTS `unlock_feature`");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void xMQ(SQLiteConnection sQLiteConnection) {
            DBUtil.rl(sQLiteConnection);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate ck() {
        return new j(2, "cc648343467204e619631475f92312c8", "e4c6bbdb7e528337d49b6aa0def3828e");
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker HI() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "unlock_feature");
    }

    @Override // androidx.room.RoomDatabase
    public List Z(Map map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    protected Map fD() {
        HashMap map = new HashMap();
        map.put(f2.j.class, I28.Uo());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public Set g() {
        return new HashSet();
    }

    @Override // com.alightcreative.room.AlightDatabase
    public f2.j p5() {
        f2.j jVar;
        if (this.ck != null) {
            return this.ck;
        }
        synchronized (this) {
            try {
                if (this.ck == null) {
                    this.ck = new I28(this);
                }
                jVar = this.ck;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }
}

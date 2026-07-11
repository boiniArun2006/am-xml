package androidx.work.impl;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.PreferenceDao_Impl;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.RawWorkInfoDao_Impl;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.WorkTagDao_Impl;
import c8G.Fsz.qwlyMfUJj;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile WorkSpecDao Ik;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private volatile WorkProgressDao f42795S;
    private volatile PreferenceDao WPU;
    private volatile WorkNameDao XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private volatile SystemIdInfoDao f42796Z;
    private volatile RawWorkInfoDao aYN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile WorkTagDao f42797o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile DependencyDao f42798r;

    @Override // androidx.work.impl.WorkDatabase
    public PreferenceDao B() {
        PreferenceDao preferenceDao;
        if (this.WPU != null) {
            return this.WPU;
        }
        synchronized (this) {
            try {
                if (this.WPU == null) {
                    this.WPU = new PreferenceDao_Impl(this);
                }
                preferenceDao = this.WPU;
            } catch (Throwable th) {
                throw th;
            }
        }
        return preferenceDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public SystemIdInfoDao D() {
        SystemIdInfoDao systemIdInfoDao;
        if (this.f42796Z != null) {
            return this.f42796Z;
        }
        synchronized (this) {
            try {
                if (this.f42796Z == null) {
                    this.f42796Z = new SystemIdInfoDao_Impl(this);
                }
                systemIdInfoDao = this.f42796Z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return systemIdInfoDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkSpecDao GR() {
        WorkSpecDao workSpecDao;
        if (this.Ik != null) {
            return this.Ik;
        }
        synchronized (this) {
            try {
                if (this.Ik == null) {
                    this.Ik = new WorkSpecDao_Impl(this);
                }
                workSpecDao = this.Ik;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workSpecDao;
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker HI() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkProgressDao I() {
        WorkProgressDao workProgressDao;
        if (this.f42795S != null) {
            return this.f42795S;
        }
        synchronized (this) {
            try {
                if (this.f42795S == null) {
                    this.f42795S = new WorkProgressDao_Impl(this);
                }
                workProgressDao = this.f42795S;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workProgressDao;
    }

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper Ik(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.n(SupportSQLiteOpenHelper.Configuration.n(databaseConfiguration.context).t(databaseConfiguration.com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String).rl(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(12) { // from class: androidx.work.impl.WorkDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void O(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult Uo(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap map = new HashMap(2);
                map.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
                map.put("prerequisite_id", new TableInfo.Column("prerequisite_id", "TEXT", true, 2, null, 1));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSet.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new TableInfo.Index("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
                hashSet2.add(new TableInfo.Index("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
                TableInfo tableInfo = new TableInfo("Dependency", map, hashSet, hashSet2);
                TableInfo tableInfoRl = TableInfo.rl(supportSQLiteDatabase, "Dependency");
                if (!tableInfo.equals(tableInfoRl)) {
                    return new RoomOpenHelper.ValidationResult(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfoRl);
                }
                HashMap map2 = new HashMap(25);
                map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                map2.put("state", new TableInfo.Column("state", "INTEGER", true, 0, null, 1));
                map2.put("worker_class_name", new TableInfo.Column("worker_class_name", "TEXT", true, 0, null, 1));
                map2.put("input_merger_class_name", new TableInfo.Column("input_merger_class_name", "TEXT", false, 0, null, 1));
                map2.put("input", new TableInfo.Column("input", "BLOB", true, 0, null, 1));
                map2.put("output", new TableInfo.Column("output", "BLOB", true, 0, null, 1));
                map2.put("initial_delay", new TableInfo.Column("initial_delay", "INTEGER", true, 0, null, 1));
                map2.put("interval_duration", new TableInfo.Column("interval_duration", "INTEGER", true, 0, null, 1));
                map2.put("flex_duration", new TableInfo.Column("flex_duration", qwlyMfUJj.WzdNAk, true, 0, null, 1));
                map2.put("run_attempt_count", new TableInfo.Column("run_attempt_count", "INTEGER", true, 0, null, 1));
                map2.put("backoff_policy", new TableInfo.Column("backoff_policy", "INTEGER", true, 0, null, 1));
                map2.put("backoff_delay_duration", new TableInfo.Column("backoff_delay_duration", "INTEGER", true, 0, null, 1));
                map2.put("period_start_time", new TableInfo.Column("period_start_time", "INTEGER", true, 0, null, 1));
                map2.put("minimum_retention_duration", new TableInfo.Column("minimum_retention_duration", "INTEGER", true, 0, null, 1));
                map2.put("schedule_requested_at", new TableInfo.Column("schedule_requested_at", "INTEGER", true, 0, null, 1));
                map2.put("run_in_foreground", new TableInfo.Column("run_in_foreground", "INTEGER", true, 0, null, 1));
                map2.put("out_of_quota_policy", new TableInfo.Column("out_of_quota_policy", "INTEGER", true, 0, null, 1));
                map2.put("required_network_type", new TableInfo.Column("required_network_type", "INTEGER", false, 0, null, 1));
                map2.put("requires_charging", new TableInfo.Column("requires_charging", "INTEGER", true, 0, null, 1));
                map2.put("requires_device_idle", new TableInfo.Column("requires_device_idle", LHbnkhI.ReZFW, true, 0, null, 1));
                map2.put("requires_battery_not_low", new TableInfo.Column("requires_battery_not_low", "INTEGER", true, 0, null, 1));
                map2.put("requires_storage_not_low", new TableInfo.Column("requires_storage_not_low", "INTEGER", true, 0, null, 1));
                map2.put("trigger_content_update_delay", new TableInfo.Column("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
                map2.put("trigger_max_content_delay", new TableInfo.Column("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
                map2.put("content_uri_triggers", new TableInfo.Column("content_uri_triggers", "BLOB", false, 0, null, 1));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(2);
                hashSet4.add(new TableInfo.Index("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
                hashSet4.add(new TableInfo.Index("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
                TableInfo tableInfo2 = new TableInfo("WorkSpec", map2, hashSet3, hashSet4);
                TableInfo tableInfoRl2 = TableInfo.rl(supportSQLiteDatabase, "WorkSpec");
                if (!tableInfo2.equals(tableInfoRl2)) {
                    return new RoomOpenHelper.ValidationResult(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + tableInfo2 + "\n Found:\n" + tableInfoRl2);
                }
                HashMap map3 = new HashMap(2);
                map3.put("tag", new TableInfo.Column("tag", "TEXT", true, 1, null, 1));
                map3.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 2, null, 1));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new TableInfo.Index("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
                TableInfo tableInfo3 = new TableInfo("WorkTag", map3, hashSet5, hashSet6);
                TableInfo tableInfoRl3 = TableInfo.rl(supportSQLiteDatabase, "WorkTag");
                if (!tableInfo3.equals(tableInfoRl3)) {
                    return new RoomOpenHelper.ValidationResult(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfoRl3);
                }
                HashMap map4 = new HashMap(2);
                map4.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
                map4.put("system_id", new TableInfo.Column("system_id", "INTEGER", true, 0, null, 1));
                HashSet hashSet7 = new HashSet(1);
                hashSet7.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                TableInfo tableInfo4 = new TableInfo("SystemIdInfo", map4, hashSet7, new HashSet(0));
                TableInfo tableInfoRl4 = TableInfo.rl(supportSQLiteDatabase, "SystemIdInfo");
                if (!tableInfo4.equals(tableInfoRl4)) {
                    return new RoomOpenHelper.ValidationResult(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + tableInfo4 + "\n Found:\n" + tableInfoRl4);
                }
                HashMap map5 = new HashMap(2);
                map5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new TableInfo.Column(AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", true, 1, null, 1));
                map5.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 2, null, 1));
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet9 = new HashSet(1);
                hashSet9.add(new TableInfo.Index("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
                TableInfo tableInfo5 = new TableInfo("WorkName", map5, hashSet8, hashSet9);
                TableInfo tableInfoRl5 = TableInfo.rl(supportSQLiteDatabase, "WorkName");
                if (!tableInfo5.equals(tableInfoRl5)) {
                    return new RoomOpenHelper.ValidationResult(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfoRl5);
                }
                HashMap map6 = new HashMap(2);
                map6.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
                map6.put("progress", new TableInfo.Column("progress", "BLOB", true, 0, null, 1));
                HashSet hashSet10 = new HashSet(1);
                hashSet10.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                TableInfo tableInfo6 = new TableInfo("WorkProgress", map6, hashSet10, new HashSet(0));
                TableInfo tableInfoRl6 = TableInfo.rl(supportSQLiteDatabase, "WorkProgress");
                if (!tableInfo6.equals(tableInfoRl6)) {
                    return new RoomOpenHelper.ValidationResult(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + tableInfo6 + "\n Found:\n" + tableInfoRl6);
                }
                HashMap map7 = new HashMap(2);
                map7.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
                map7.put("long_value", new TableInfo.Column("long_value", "INTEGER", false, 0, null, 1));
                TableInfo tableInfo7 = new TableInfo("Preference", map7, new HashSet(0), new HashSet(0));
                TableInfo tableInfoRl7 = TableInfo.rl(supportSQLiteDatabase, "Preference");
                if (tableInfo7.equals(tableInfoRl7)) {
                    return new RoomOpenHelper.ValidationResult(true, null);
                }
                return new RoomOpenHelper.ValidationResult(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfoRl7);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void n(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.ck("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.ck("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                supportSQLiteDatabase.ck("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                supportSQLiteDatabase.ck("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                supportSQLiteDatabase.ck("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                supportSQLiteDatabase.ck("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                supportSQLiteDatabase.ck("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.ck("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                supportSQLiteDatabase.ck("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.ck("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.ck("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                supportSQLiteDatabase.ck("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.ck("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                supportSQLiteDatabase.ck("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.ck("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void nr(SupportSQLiteDatabase supportSQLiteDatabase) {
                ((RoomDatabase) WorkDatabase_Impl.this).mDatabase = supportSQLiteDatabase;
                supportSQLiteDatabase.ck("PRAGMA foreign_keys = ON");
                WorkDatabase_Impl.this.rV9(supportSQLiteDatabase);
                if (((RoomDatabase) WorkDatabase_Impl.this).mCallbacks != null) {
                    int size = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((RoomDatabase.Callback) ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks.get(i2)).J2(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void rl(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.ck("DROP TABLE IF EXISTS `Dependency`");
                supportSQLiteDatabase.ck("DROP TABLE IF EXISTS `WorkSpec`");
                supportSQLiteDatabase.ck("DROP TABLE IF EXISTS `WorkTag`");
                supportSQLiteDatabase.ck("DROP TABLE IF EXISTS `SystemIdInfo`");
                supportSQLiteDatabase.ck("DROP TABLE IF EXISTS `WorkName`");
                supportSQLiteDatabase.ck("DROP TABLE IF EXISTS `WorkProgress`");
                supportSQLiteDatabase.ck("DROP TABLE IF EXISTS `Preference`");
                if (((RoomDatabase) WorkDatabase_Impl.this).mCallbacks != null) {
                    int size = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((RoomDatabase.Callback) ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks.get(i2)).nr(supportSQLiteDatabase);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void t(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (((RoomDatabase) WorkDatabase_Impl.this).mCallbacks != null) {
                    int size = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((RoomDatabase.Callback) ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks.get(i2)).rl(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void J2(SupportSQLiteDatabase supportSQLiteDatabase) {
                DBUtil.t(supportSQLiteDatabase);
            }
        }, "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).n());
    }

    @Override // androidx.work.impl.WorkDatabase
    public RawWorkInfoDao J() {
        RawWorkInfoDao rawWorkInfoDao;
        if (this.aYN != null) {
            return this.aYN;
        }
        synchronized (this) {
            try {
                if (this.aYN == null) {
                    this.aYN = new RawWorkInfoDao_Impl(this);
                }
                rawWorkInfoDao = this.aYN;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rawWorkInfoDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkTagDao Nxk() {
        WorkTagDao workTagDao;
        if (this.f42797o != null) {
            return this.f42797o;
        }
        synchronized (this) {
            try {
                if (this.f42797o == null) {
                    this.f42797o = new WorkTagDao_Impl(this);
                }
                workTagDao = this.f42797o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workTagDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkNameDao a() {
        WorkNameDao workNameDao;
        if (this.XQ != null) {
            return this.XQ;
        }
        synchronized (this) {
            try {
                if (this.XQ == null) {
                    this.XQ = new WorkNameDao_Impl(this);
                }
                workNameDao = this.XQ;
            } catch (Throwable th) {
                throw th;
            }
        }
        return workNameDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public DependencyDao eF() {
        DependencyDao dependencyDao;
        if (this.f42798r != null) {
            return this.f42798r;
        }
        synchronized (this) {
            try {
                if (this.f42798r == null) {
                    this.f42798r = new DependencyDao_Impl(this);
                }
                dependencyDao = this.f42798r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dependencyDao;
    }
}

package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.utils.IdGenerator;
import androidx.work.impl.utils.PreferenceUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class WorkDatabaseMigrations {
    public static Migration J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static Migration f42789O;
    public static Migration nr;
    public static Migration rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Migration f42791t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Migration f42790n = new Migration(1, 2) { // from class: androidx.work.impl.WorkDatabaseMigrations.1
        @Override // androidx.room.migration.Migration
        public void rl(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.ck("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            supportSQLiteDatabase.ck("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            supportSQLiteDatabase.ck("DROP TABLE IF EXISTS alarmInfo");
            supportSQLiteDatabase.ck("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    };
    public static Migration Uo = new Migration(11, 12) { // from class: androidx.work.impl.WorkDatabaseMigrations.7
        @Override // androidx.room.migration.Migration
        public void rl(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.ck("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    };

    public static class RescheduleMigration extends Migration {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Context f42792t;

        @Override // androidx.room.migration.Migration
        public void rl(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (this.endVersion >= 10) {
                supportSQLiteDatabase.e("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f42792t.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }

        public RescheduleMigration(Context context, int i2, int i3) {
            super(i2, i3);
            this.f42792t = context;
        }
    }

    public static class WorkMigration9To10 extends Migration {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Context f42793t;

        public WorkMigration9To10(Context context) {
            super(9, 10);
            this.f42793t = context;
        }

        @Override // androidx.room.migration.Migration
        public void rl(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.ck("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            PreferenceUtils.t(this.f42793t, supportSQLiteDatabase);
            IdGenerator.n(this.f42793t, supportSQLiteDatabase);
        }
    }

    static {
        int i2 = 4;
        rl = new Migration(3, i2) { // from class: androidx.work.impl.WorkDatabaseMigrations.2
            @Override // androidx.room.migration.Migration
            public void rl(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.ck("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        };
        f42791t = new Migration(i2, 5) { // from class: androidx.work.impl.WorkDatabaseMigrations.3
            @Override // androidx.room.migration.Migration
            public void rl(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.ck("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                supportSQLiteDatabase.ck("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
            }
        };
        int i3 = 7;
        nr = new Migration(6, i3) { // from class: androidx.work.impl.WorkDatabaseMigrations.4
            @Override // androidx.room.migration.Migration
            public void rl(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.ck("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            }
        };
        int i5 = 8;
        f42789O = new Migration(i3, i5) { // from class: androidx.work.impl.WorkDatabaseMigrations.5
            @Override // androidx.room.migration.Migration
            public void rl(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.ck("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
            }
        };
        J2 = new Migration(i5, 9) { // from class: androidx.work.impl.WorkDatabaseMigrations.6
            @Override // androidx.room.migration.Migration
            public void rl(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.ck("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
            }
        };
    }
}

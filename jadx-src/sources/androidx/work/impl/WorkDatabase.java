package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.work.impl.WorkDatabaseMigrations;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@TypeConverters
@Database
@RestrictTo
public abstract class WorkDatabase extends RoomDatabase {
    private static final long ck = TimeUnit.DAYS.toMillis(1);

    public static WorkDatabase p5(final Context context, Executor executor, boolean z2) {
        RoomDatabase.Builder builderN;
        if (z2) {
            builderN = Room.rl(context, WorkDatabase.class).t();
        } else {
            builderN = Room.n(context, WorkDatabase.class, WorkDatabasePathHelper.nr());
            builderN.J2(new SupportSQLiteOpenHelper.Factory() { // from class: androidx.work.impl.WorkDatabase.1
                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
                public SupportSQLiteOpenHelper n(SupportSQLiteOpenHelper.Configuration configuration) {
                    SupportSQLiteOpenHelper.Configuration.Builder builderN2 = SupportSQLiteOpenHelper.Configuration.n(context);
                    builderN2.t(configuration.com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String).rl(configuration.callback).nr(true);
                    return new FrameworkSQLiteOpenHelperFactory().n(builderN2.n());
                }
            });
        }
        return (WorkDatabase) builderN.Uo(executor).n(E()).rl(WorkDatabaseMigrations.f42790n).rl(new WorkDatabaseMigrations.RescheduleMigration(context, 2, 3)).rl(WorkDatabaseMigrations.rl).rl(WorkDatabaseMigrations.f42791t).rl(new WorkDatabaseMigrations.RescheduleMigration(context, 5, 6)).rl(WorkDatabaseMigrations.nr).rl(WorkDatabaseMigrations.f42789O).rl(WorkDatabaseMigrations.J2).rl(new WorkDatabaseMigrations.WorkMigration9To10(context)).rl(new WorkDatabaseMigrations.RescheduleMigration(context, 10, 11)).rl(WorkDatabaseMigrations.Uo).O().nr();
    }

    public abstract PreferenceDao B();

    public abstract SystemIdInfoDao D();

    public abstract WorkSpecDao GR();

    public abstract WorkProgressDao I();

    public abstract RawWorkInfoDao J();

    public abstract WorkTagDao Nxk();

    public abstract WorkNameDao a();

    public abstract DependencyDao eF();

    static RoomDatabase.Callback E() {
        return new RoomDatabase.Callback() { // from class: androidx.work.impl.WorkDatabase.2
            @Override // androidx.room.RoomDatabase.Callback
            public void J2(SupportSQLiteDatabase supportSQLiteDatabase) {
                super.J2(supportSQLiteDatabase);
                supportSQLiteDatabase.az();
                try {
                    supportSQLiteDatabase.ck(WorkDatabase.FX());
                    supportSQLiteDatabase.E2();
                } finally {
                    supportSQLiteDatabase.v();
                }
            }
        };
    }

    static String FX() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + M() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    static long M() {
        return System.currentTimeMillis() - ck;
    }
}

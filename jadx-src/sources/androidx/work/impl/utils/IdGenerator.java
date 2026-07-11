package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class IdGenerator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WorkDatabase f42985n;

    private void O(String str, int i2) {
        this.f42985n.B().n(new Preference(str, i2));
    }

    public static void n(Context context, SupportSQLiteDatabase supportSQLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i2 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i3 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            supportSQLiteDatabase.az();
            try {
                supportSQLiteDatabase.e("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                supportSQLiteDatabase.e("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                sharedPreferences.edit().clear().apply();
                supportSQLiteDatabase.E2();
            } finally {
                supportSQLiteDatabase.v();
            }
        }
    }

    private int t(String str) {
        this.f42985n.xMQ();
        try {
            Long lRl = this.f42985n.B().rl(str);
            int i2 = 0;
            int iIntValue = lRl != null ? lRl.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i2 = iIntValue + 1;
            }
            O(str, i2);
            this.f42985n.P5();
            this.f42985n.r();
            return iIntValue;
        } catch (Throwable th) {
            this.f42985n.r();
            throw th;
        }
    }

    public int nr(int i2, int i3) {
        synchronized (IdGenerator.class) {
            int iT = t("next_job_scheduler_id");
            if (iT < i2 || iT > i3) {
                O("next_job_scheduler_id", i2 + 1);
            } else {
                i2 = iT;
            }
        }
        return i2;
    }

    public int rl() {
        int iT;
        synchronized (IdGenerator.class) {
            iT = t("next_alarm_manager_id");
        }
        return iT;
    }

    public IdGenerator(WorkDatabase workDatabase) {
        this.f42985n = workDatabase;
    }
}

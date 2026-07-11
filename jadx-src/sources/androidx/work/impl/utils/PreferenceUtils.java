package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RestrictTo
public class PreferenceUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WorkDatabase f42993n;

    /* JADX INFO: renamed from: androidx.work.impl.utils.PreferenceUtils$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    class AnonymousClass1 implements Function<Long, Long> {
        @Override // androidx.arch.core.util.Function
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long apply(Long l2) {
            return Long.valueOf(l2 != null ? l2.longValue() : 0L);
        }
    }

    public static void t(Context context, SupportSQLiteDatabase supportSQLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j3 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            supportSQLiteDatabase.az();
            try {
                supportSQLiteDatabase.e("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                supportSQLiteDatabase.e("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j3)});
                sharedPreferences.edit().clear().apply();
                supportSQLiteDatabase.E2();
            } finally {
                supportSQLiteDatabase.v();
            }
        }
    }

    public void O(boolean z2) {
        this.f42993n.B().n(new Preference("reschedule_needed", z2));
    }

    public long n() {
        Long lRl = this.f42993n.B().rl("last_cancel_all_time_ms");
        if (lRl != null) {
            return lRl.longValue();
        }
        return 0L;
    }

    public void nr(long j2) {
        this.f42993n.B().n(new Preference("last_cancel_all_time_ms", j2));
    }

    public boolean rl() {
        Long lRl = this.f42993n.B().rl("reschedule_needed");
        return lRl != null && lRl.longValue() == 1;
    }

    public PreferenceUtils(WorkDatabase workDatabase) {
        this.f42993n = workDatabase;
    }
}

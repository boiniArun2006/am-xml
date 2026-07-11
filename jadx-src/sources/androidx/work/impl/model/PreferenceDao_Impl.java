package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class PreferenceDao_Impl implements PreferenceDao {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RoomDatabase f42935n;
    private final EntityInsertionAdapter rl;

    /* JADX INFO: renamed from: androidx.work.impl.model.PreferenceDao_Impl$2, reason: invalid class name */
    class AnonymousClass2 implements Callable<Long> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RoomSQLiteQuery f42936n;
        final /* synthetic */ PreferenceDao_Impl rl;

        protected void finalize() {
            this.f42936n.release();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long call() {
            Long lValueOf = null;
            Cursor cursorJ2 = DBUtil.J2(this.rl.f42935n, this.f42936n, false, null);
            try {
                if (cursorJ2.moveToFirst() && !cursorJ2.isNull(0)) {
                    lValueOf = Long.valueOf(cursorJ2.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorJ2.close();
            }
        }
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public void n(Preference preference) {
        this.f42935n.KN();
        this.f42935n.xMQ();
        try {
            this.rl.gh(preference);
            this.f42935n.P5();
        } finally {
            this.f42935n.r();
        }
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public Long rl(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42935n.KN();
        Long lValueOf = null;
        Cursor cursorJ2 = DBUtil.J2(this.f42935n, roomSQLiteQueryUo, false, null);
        try {
            if (cursorJ2.moveToFirst() && !cursorJ2.isNull(0)) {
                lValueOf = Long.valueOf(cursorJ2.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorJ2.close();
            roomSQLiteQueryUo.release();
        }
    }

    public PreferenceDao_Impl(RoomDatabase roomDatabase) {
        this.f42935n = roomDatabase;
        this.rl = new EntityInsertionAdapter<Preference>(roomDatabase) { // from class: androidx.work.impl.model.PreferenceDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
            public void mUb(SupportSQLiteStatement supportSQLiteStatement, Preference preference) {
                String str = preference.f42934n;
                if (str == null) {
                    supportSQLiteStatement.gh(1);
                } else {
                    supportSQLiteStatement.k(1, str);
                }
                Long l2 = preference.rl;
                if (l2 == null) {
                    supportSQLiteStatement.gh(2);
                } else {
                    supportSQLiteStatement.mUb(2, l2.longValue());
                }
            }
        };
    }
}

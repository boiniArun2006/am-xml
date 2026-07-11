package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class DependencyDao_Impl implements DependencyDao {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RoomDatabase f42933n;
    private final EntityInsertionAdapter rl;

    @Override // androidx.work.impl.model.DependencyDao
    public void n(Dependency dependency) {
        this.f42933n.KN();
        this.f42933n.xMQ();
        try {
            this.rl.gh(dependency);
            this.f42933n.P5();
        } finally {
            this.f42933n.r();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public boolean nr(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42933n.KN();
        boolean z2 = false;
        Cursor cursorJ2 = DBUtil.J2(this.f42933n, roomSQLiteQueryUo, false, null);
        try {
            if (cursorJ2.moveToFirst()) {
                z2 = cursorJ2.getInt(0) != 0;
            }
            return z2;
        } finally {
            cursorJ2.close();
            roomSQLiteQueryUo.release();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public List rl(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42933n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42933n, roomSQLiteQueryUo, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorJ2.getCount());
            while (cursorJ2.moveToNext()) {
                arrayList.add(cursorJ2.getString(0));
            }
            return arrayList;
        } finally {
            cursorJ2.close();
            roomSQLiteQueryUo.release();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public boolean t(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42933n.KN();
        boolean z2 = false;
        Cursor cursorJ2 = DBUtil.J2(this.f42933n, roomSQLiteQueryUo, false, null);
        try {
            if (cursorJ2.moveToFirst()) {
                z2 = cursorJ2.getInt(0) != 0;
            }
            return z2;
        } finally {
            cursorJ2.close();
            roomSQLiteQueryUo.release();
        }
    }

    public DependencyDao_Impl(RoomDatabase roomDatabase) {
        this.f42933n = roomDatabase;
        this.rl = new EntityInsertionAdapter<Dependency>(roomDatabase) { // from class: androidx.work.impl.model.DependencyDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
            public void mUb(SupportSQLiteStatement supportSQLiteStatement, Dependency dependency) {
                String str = dependency.f42932n;
                if (str == null) {
                    supportSQLiteStatement.gh(1);
                } else {
                    supportSQLiteStatement.k(1, str);
                }
                String str2 = dependency.rl;
                if (str2 == null) {
                    supportSQLiteStatement.gh(2);
                } else {
                    supportSQLiteStatement.k(2, str2);
                }
            }
        };
    }
}

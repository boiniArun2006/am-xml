package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class WorkNameDao_Impl implements WorkNameDao {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RoomDatabase f42943n;
    private final EntityInsertionAdapter rl;

    @Override // androidx.work.impl.model.WorkNameDao
    public void n(WorkName workName) {
        this.f42943n.KN();
        this.f42943n.xMQ();
        try {
            this.rl.gh(workName);
            this.f42943n.P5();
        } finally {
            this.f42943n.r();
        }
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public List rl(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42943n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42943n, roomSQLiteQueryUo, false, null);
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

    public WorkNameDao_Impl(RoomDatabase roomDatabase) {
        this.f42943n = roomDatabase;
        this.rl = new EntityInsertionAdapter<WorkName>(roomDatabase) { // from class: androidx.work.impl.model.WorkNameDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
            public void mUb(SupportSQLiteStatement supportSQLiteStatement, WorkName workName) {
                String str = workName.f42942n;
                if (str == null) {
                    supportSQLiteStatement.gh(1);
                } else {
                    supportSQLiteStatement.k(1, str);
                }
                String str2 = workName.rl;
                if (str2 == null) {
                    supportSQLiteStatement.gh(2);
                } else {
                    supportSQLiteStatement.k(2, str2);
                }
            }
        };
    }
}

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
public final class WorkTagDao_Impl implements WorkTagDao {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RoomDatabase f42966n;
    private final EntityInsertionAdapter rl;

    @Override // androidx.work.impl.model.WorkTagDao
    public List n(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42966n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42966n, roomSQLiteQueryUo, false, null);
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

    @Override // androidx.work.impl.model.WorkTagDao
    public void rl(WorkTag workTag) {
        this.f42966n.KN();
        this.f42966n.xMQ();
        try {
            this.rl.gh(workTag);
            this.f42966n.P5();
        } finally {
            this.f42966n.r();
        }
    }

    public WorkTagDao_Impl(RoomDatabase roomDatabase) {
        this.f42966n = roomDatabase;
        this.rl = new EntityInsertionAdapter<WorkTag>(roomDatabase) { // from class: androidx.work.impl.model.WorkTagDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
            public void mUb(SupportSQLiteStatement supportSQLiteStatement, WorkTag workTag) {
                String str = workTag.f42965n;
                if (str == null) {
                    supportSQLiteStatement.gh(1);
                } else {
                    supportSQLiteStatement.k(1, str);
                }
                String str2 = workTag.rl;
                if (str2 == null) {
                    supportSQLiteStatement.gh(2);
                } else {
                    supportSQLiteStatement.k(2, str2);
                }
            }
        };
    }
}

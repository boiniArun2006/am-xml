package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class SystemIdInfoDao_Impl implements SystemIdInfoDao {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RoomDatabase f42940n;
    private final EntityInsertionAdapter rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SharedSQLiteStatement f42941t;

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public SystemIdInfo n(String str) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            roomSQLiteQueryUo.gh(1);
        } else {
            roomSQLiteQueryUo.k(1, str);
        }
        this.f42940n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42940n, roomSQLiteQueryUo, false, null);
        try {
            return cursorJ2.moveToFirst() ? new SystemIdInfo(cursorJ2.getString(CursorUtil.O(cursorJ2, "work_spec_id")), cursorJ2.getInt(CursorUtil.O(cursorJ2, "system_id"))) : null;
        } finally {
            cursorJ2.close();
            roomSQLiteQueryUo.release();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void nr(String str) {
        this.f42940n.KN();
        SupportSQLiteStatement supportSQLiteStatementRl = this.f42941t.rl();
        if (str == null) {
            supportSQLiteStatementRl.gh(1);
        } else {
            supportSQLiteStatementRl.k(1, str);
        }
        this.f42940n.xMQ();
        try {
            supportSQLiteStatementRl.XQ();
            this.f42940n.P5();
        } finally {
            this.f42940n.r();
            this.f42941t.KN(supportSQLiteStatementRl);
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public List rl() {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f42940n.KN();
        Cursor cursorJ2 = DBUtil.J2(this.f42940n, roomSQLiteQueryUo, false, null);
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

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void t(SystemIdInfo systemIdInfo) {
        this.f42940n.KN();
        this.f42940n.xMQ();
        try {
            this.rl.gh(systemIdInfo);
            this.f42940n.P5();
        } finally {
            this.f42940n.r();
        }
    }

    public SystemIdInfoDao_Impl(RoomDatabase roomDatabase) {
        this.f42940n = roomDatabase;
        this.rl = new EntityInsertionAdapter<SystemIdInfo>(roomDatabase) { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
            public void mUb(SupportSQLiteStatement supportSQLiteStatement, SystemIdInfo systemIdInfo) {
                String str = systemIdInfo.f42939n;
                if (str == null) {
                    supportSQLiteStatement.gh(1);
                } else {
                    supportSQLiteStatement.k(1, str);
                }
                supportSQLiteStatement.mUb(2, systemIdInfo.rl);
            }
        };
        this.f42941t = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }
}

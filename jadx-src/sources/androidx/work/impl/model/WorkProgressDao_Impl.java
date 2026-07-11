package androidx.work.impl.model;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Data;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class WorkProgressDao_Impl implements WorkProgressDao {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RoomDatabase f42945n;
    private final SharedSQLiteStatement nr;
    private final EntityInsertionAdapter rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SharedSQLiteStatement f42946t;

    @Override // androidx.work.impl.model.WorkProgressDao
    public void n(String str) {
        this.f42945n.KN();
        SupportSQLiteStatement supportSQLiteStatementRl = this.f42946t.rl();
        if (str == null) {
            supportSQLiteStatementRl.gh(1);
        } else {
            supportSQLiteStatementRl.k(1, str);
        }
        this.f42945n.xMQ();
        try {
            supportSQLiteStatementRl.XQ();
            this.f42945n.P5();
        } finally {
            this.f42945n.r();
            this.f42946t.KN(supportSQLiteStatementRl);
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void rl() {
        this.f42945n.KN();
        SupportSQLiteStatement supportSQLiteStatementRl = this.nr.rl();
        this.f42945n.xMQ();
        try {
            supportSQLiteStatementRl.XQ();
            this.f42945n.P5();
        } finally {
            this.f42945n.r();
            this.nr.KN(supportSQLiteStatementRl);
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void t(WorkProgress workProgress) {
        this.f42945n.KN();
        this.f42945n.xMQ();
        try {
            this.rl.gh(workProgress);
            this.f42945n.P5();
        } finally {
            this.f42945n.r();
        }
    }

    public WorkProgressDao_Impl(RoomDatabase roomDatabase) {
        this.f42945n = roomDatabase;
        this.rl = new EntityInsertionAdapter<WorkProgress>(roomDatabase) { // from class: androidx.work.impl.model.WorkProgressDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
            public void mUb(SupportSQLiteStatement supportSQLiteStatement, WorkProgress workProgress) throws Throwable {
                String str = workProgress.f42944n;
                if (str == null) {
                    supportSQLiteStatement.gh(1);
                } else {
                    supportSQLiteStatement.k(1, str);
                }
                byte[] bArrGh = Data.gh(workProgress.rl);
                if (bArrGh == null) {
                    supportSQLiteStatement.gh(2);
                } else {
                    supportSQLiteStatement.C(2, bArrGh);
                }
            }
        };
        this.f42946t = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkProgressDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "DELETE from WorkProgress where work_spec_id=?";
            }
        };
        this.nr = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkProgressDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String O() {
                return "DELETE FROM WorkProgress";
            }
        };
    }
}

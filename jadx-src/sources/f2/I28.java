package f2;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 implements f2.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RoomDatabase f66429n;
    private final EntityInsertAdapter rl = new j();

    class j extends EntityInsertAdapter {
        j() {
        }

        @Override // androidx.room.EntityInsertAdapter
        protected String rl() {
            return "INSERT OR REPLACE INTO `unlock_feature` (`projectId`,`featureId`,`expirationMillis`) VALUES (?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public void n(SQLiteStatement sQLiteStatement, JK.Ml ml) {
            if (ml.t() == null) {
                sQLiteStatement.gh(1);
            } else {
                sQLiteStatement.iF(1, ml.t());
            }
            if (ml.rl() == null) {
                sQLiteStatement.gh(2);
            } else {
                sQLiteStatement.iF(2, ml.rl());
            }
            sQLiteStatement.mUb(3, ml.n());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit KN(JK.Ml ml, SQLiteConnection sQLiteConnection) {
        this.rl.t(sQLiteConnection, ml);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ List O(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementMI = sQLiteConnection.mI("SELECT * FROM unlock_feature");
        try {
            int iT = SQLiteStatementUtil.t(sQLiteStatementMI, "projectId");
            int iT2 = SQLiteStatementUtil.t(sQLiteStatementMI, "featureId");
            int iT3 = SQLiteStatementUtil.t(sQLiteStatementMI, "expirationMillis");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementMI.RQ()) {
                String strHV = null;
                String strHV2 = sQLiteStatementMI.isNull(iT) ? null : sQLiteStatementMI.HV(iT);
                if (!sQLiteStatementMI.isNull(iT2)) {
                    strHV = sQLiteStatementMI.HV(iT2);
                }
                arrayList.add(new JK.Ml(strHV2, strHV, sQLiteStatementMI.getLong(iT3)));
            }
            return arrayList;
        } finally {
            sQLiteStatementMI.close();
        }
    }

    public static List Uo() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ Unit nr(long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementMI = sQLiteConnection.mI("DELETE FROM unlock_feature WHERE expirationMillis < ?");
        try {
            sQLiteStatementMI.mUb(1, j2);
            sQLiteStatementMI.RQ();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementMI.close();
        }
    }

    @Override // f2.j
    public Object n(final long j2, Continuation continuation) {
        return DBUtil.O(this.f66429n, false, true, new Function1() { // from class: f2.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I28.nr(j2, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // f2.j
    public Object rl(Continuation continuation) {
        return DBUtil.O(this.f66429n, true, false, new Function1() { // from class: f2.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I28.O((SQLiteConnection) obj);
            }
        }, continuation);
    }

    public I28(RoomDatabase roomDatabase) {
        this.f66429n = roomDatabase;
    }

    @Override // f2.j
    public Object t(final JK.Ml ml, Continuation continuation) {
        ml.getClass();
        return DBUtil.O(this.f66429n, false, true, new Function1() { // from class: f2.Ml
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f66431n.KN(ml, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}

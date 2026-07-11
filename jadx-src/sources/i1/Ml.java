package i1;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bendingspoons.spidersense.data.storageManager.entities.CompleteDebugEventEntity;
import com.bendingspoons.spidersense.domain.entities.CompleteDebugEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ml implements i1.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RoomDatabase f68094n;
    private final SharedSQLiteStatement nr;
    private final EntityInsertionAdapter rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final i1.n f68095t = new i1.n();

    class CN3 implements Callable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Collection f68096n;

        CN3(Collection collection) {
            this.f68096n = collection;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            StringBuilder sbRl = StringUtil.rl();
            sbRl.append("DELETE FROM spidersense_complete_debug_events WHERE id IN (");
            StringUtil.n(sbRl, this.f68096n.size());
            sbRl.append(")");
            SupportSQLiteStatement supportSQLiteStatementGh = Ml.this.f68094n.gh(sbRl.toString());
            Iterator it = this.f68096n.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                supportSQLiteStatementGh.k(i2, (String) it.next());
                i2++;
            }
            Ml.this.f68094n.xMQ();
            try {
                Integer numValueOf = Integer.valueOf(supportSQLiteStatementGh.XQ());
                Ml.this.f68094n.P5();
                return numValueOf;
            } finally {
                Ml.this.f68094n.r();
            }
        }
    }

    class I28 implements Callable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RoomSQLiteQuery f68097n;

        I28(RoomSQLiteQuery roomSQLiteQuery) {
            this.f68097n = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long call() {
            Cursor cursorJ2 = DBUtil.J2(Ml.this.f68094n, this.f68097n, false, null);
            try {
                long jValueOf = cursorJ2.moveToFirst() ? Long.valueOf(cursorJ2.getLong(0)) : 0L;
                cursorJ2.close();
                this.f68097n.release();
                return jValueOf;
            } catch (Throwable th) {
                cursorJ2.close();
                this.f68097n.release();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i1.Ml$Ml, reason: collision with other inner class name */
    class CallableC0964Ml implements Callable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f68098n;

        CallableC0964Ml(long j2) {
            this.f68098n = j2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            SupportSQLiteStatement supportSQLiteStatementRl = Ml.this.nr.rl();
            supportSQLiteStatementRl.mUb(1, this.f68098n);
            try {
                Ml.this.f68094n.xMQ();
                try {
                    Integer numValueOf = Integer.valueOf(supportSQLiteStatementRl.XQ());
                    Ml.this.f68094n.P5();
                    return numValueOf;
                } finally {
                    Ml.this.f68094n.r();
                }
            } finally {
                Ml.this.nr.KN(supportSQLiteStatementRl);
            }
        }
    }

    class Wre implements Callable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RoomSQLiteQuery f68099n;

        Wre(RoomSQLiteQuery roomSQLiteQuery) {
            this.f68099n = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorJ2 = DBUtil.J2(Ml.this.f68094n, this.f68099n, false, null);
            try {
                int iO = CursorUtil.O(cursorJ2, "id");
                int iO2 = CursorUtil.O(cursorJ2, "storedAt");
                int iO3 = CursorUtil.O(cursorJ2, "completeDebugEventData");
                ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                while (cursorJ2.moveToNext()) {
                    String string = cursorJ2.getString(iO);
                    double d2 = cursorJ2.getDouble(iO2);
                    CompleteDebugEvent completeDebugEventNr = Ml.this.f68095t.nr(cursorJ2.getString(iO3));
                    if (completeDebugEventNr == null) {
                        throw new IllegalStateException("Expected NON-NULL 'com.bendingspoons.spidersense.domain.entities.CompleteDebugEvent', but it was NULL.");
                    }
                    arrayList.add(new CompleteDebugEventEntity(string, d2, completeDebugEventNr));
                }
                cursorJ2.close();
                this.f68099n.release();
                return arrayList;
            } catch (Throwable th) {
                cursorJ2.close();
                this.f68099n.release();
                throw th;
            }
        }
    }

    class j extends EntityInsertionAdapter {
        j(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String O() {
            return "INSERT OR IGNORE INTO `spidersense_complete_debug_events` (`id`,`storedAt`,`completeDebugEventData`) VALUES (?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void mUb(SupportSQLiteStatement supportSQLiteStatement, CompleteDebugEventEntity completeDebugEventEntity) {
            supportSQLiteStatement.k(1, completeDebugEventEntity.getId());
            supportSQLiteStatement.WPU(2, completeDebugEventEntity.getStoredAt());
            supportSQLiteStatement.k(3, Ml.this.f68095t.O(completeDebugEventEntity.getCompleteDebugEventData()));
        }
    }

    class n extends SharedSQLiteStatement {
        n(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String O() {
            return "\n        DELETE FROM spidersense_complete_debug_events WHERE id IN (\n            SELECT id from spidersense_complete_debug_events ORDER BY storedAt LIMIT ?\n        )\n        ";
        }
    }

    class w6 implements Callable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ CompleteDebugEventEntity f68100n;

        w6(CompleteDebugEventEntity completeDebugEventEntity) {
            this.f68100n = completeDebugEventEntity;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Long call() {
            Ml.this.f68094n.xMQ();
            try {
                Long lValueOf = Long.valueOf(Ml.this.rl.qie(this.f68100n));
                Ml.this.f68094n.P5();
                return lValueOf;
            } finally {
                Ml.this.f68094n.r();
            }
        }
    }

    public static List mUb() {
        return Collections.EMPTY_LIST;
    }

    @Override // i1.w6
    public Object O(Continuation continuation) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT count(*) from spidersense_complete_debug_events", 0);
        return CoroutinesRoom.n(this.f68094n, false, DBUtil.n(), new I28(roomSQLiteQueryUo), continuation);
    }

    @Override // i1.w6
    public Object n(Collection collection, Continuation continuation) {
        return CoroutinesRoom.rl(this.f68094n, true, new CN3(collection), continuation);
    }

    @Override // i1.w6
    public Object nr(long j2, Continuation continuation) {
        return CoroutinesRoom.rl(this.f68094n, true, new CallableC0964Ml(j2), continuation);
    }

    @Override // i1.w6
    public Object rl(long j2, Continuation continuation) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT * from spidersense_complete_debug_events ORDER BY storedAt LIMIT ?", 1);
        roomSQLiteQueryUo.mUb(1, j2);
        return CoroutinesRoom.n(this.f68094n, false, DBUtil.n(), new Wre(roomSQLiteQueryUo), continuation);
    }

    @Override // i1.w6
    public Object t(CompleteDebugEventEntity completeDebugEventEntity, Continuation continuation) {
        return CoroutinesRoom.rl(this.f68094n, true, new w6(completeDebugEventEntity), continuation);
    }

    public Ml(RoomDatabase roomDatabase) {
        this.f68094n = roomDatabase;
        this.rl = new j(roomDatabase);
        this.nr = new n(roomDatabase);
    }
}

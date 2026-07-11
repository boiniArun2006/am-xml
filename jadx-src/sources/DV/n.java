package DV;

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
import com.bendingspoons.pico.data.repository.internal.entity.picoEvent.PicoEventEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n implements DV.j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final SharedSQLiteStatement f1495O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RoomDatabase f1496n;
    private final SharedSQLiteStatement nr;
    private final EntityInsertionAdapter rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ykr.n f1497t = new ykr.n();

    class CN3 implements Callable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RoomSQLiteQuery f1498n;

        CN3(RoomSQLiteQuery roomSQLiteQuery) {
            this.f1498n = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorJ2 = DBUtil.J2(n.this.f1496n, this.f1498n, false, null);
            try {
                int iO = CursorUtil.O(cursorJ2, "id");
                int iO2 = CursorUtil.O(cursorJ2, "eventData");
                int iO3 = CursorUtil.O(cursorJ2, "committed");
                ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                while (cursorJ2.moveToNext()) {
                    String string = cursorJ2.getString(iO);
                    QAv.j jVarO = n.this.f1497t.O(cursorJ2.getString(iO2));
                    if (jVarO == null) {
                        throw new IllegalStateException("Expected NON-NULL 'com.bendingspoons.pico.domain.internal.PicoInternalEvent', but it was NULL.");
                    }
                    arrayList.add(new PicoEventEntity(string, jVarO, cursorJ2.getInt(iO3) != 0));
                }
                cursorJ2.close();
                this.f1498n.release();
                return arrayList;
            } catch (Throwable th) {
                cursorJ2.close();
                this.f1498n.release();
                throw th;
            }
        }
    }

    class I28 implements Callable {
        I28() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            SupportSQLiteStatement supportSQLiteStatementRl = n.this.nr.rl();
            try {
                n.this.f1496n.xMQ();
                try {
                    supportSQLiteStatementRl.XQ();
                    n.this.f1496n.P5();
                    return Unit.INSTANCE;
                } finally {
                    n.this.f1496n.r();
                }
            } finally {
                n.this.nr.KN(supportSQLiteStatementRl);
            }
        }
    }

    class Ml implements Callable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ PicoEventEntity f1500n;

        Ml(PicoEventEntity picoEventEntity) {
            this.f1500n = picoEventEntity;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            n.this.f1496n.xMQ();
            try {
                n.this.rl.gh(this.f1500n);
                n.this.f1496n.P5();
                return Unit.INSTANCE;
            } finally {
                n.this.f1496n.r();
            }
        }
    }

    class Wre implements Callable {
        Wre() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            SupportSQLiteStatement supportSQLiteStatementRl = n.this.f1495O.rl();
            try {
                n.this.f1496n.xMQ();
                try {
                    supportSQLiteStatementRl.XQ();
                    n.this.f1496n.P5();
                    return Unit.INSTANCE;
                } finally {
                    n.this.f1496n.r();
                }
            } finally {
                n.this.f1495O.KN(supportSQLiteStatementRl);
            }
        }
    }

    class fuX implements Callable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Collection f1502n;

        fuX(Collection collection) {
            this.f1502n = collection;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            StringBuilder sbRl = StringUtil.rl();
            sbRl.append("DELETE FROM pico_events WHERE id IN (");
            StringUtil.n(sbRl, this.f1502n.size());
            sbRl.append(") AND committed = 1");
            SupportSQLiteStatement supportSQLiteStatementGh = n.this.f1496n.gh(sbRl.toString());
            Iterator it = this.f1502n.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                supportSQLiteStatementGh.k(i2, (String) it.next());
                i2++;
            }
            n.this.f1496n.xMQ();
            try {
                supportSQLiteStatementGh.XQ();
                n.this.f1496n.P5();
                return Unit.INSTANCE;
            } finally {
                n.this.f1496n.r();
            }
        }
    }

    class j extends EntityInsertionAdapter {
        j(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String O() {
            return "INSERT OR REPLACE INTO `pico_events` (`id`,`eventData`,`committed`) VALUES (?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void mUb(SupportSQLiteStatement supportSQLiteStatement, PicoEventEntity picoEventEntity) {
            supportSQLiteStatement.k(1, picoEventEntity.getId());
            supportSQLiteStatement.k(2, n.this.f1497t.nr(picoEventEntity.getEventData()));
            supportSQLiteStatement.mUb(3, picoEventEntity.getCommitted() ? 1L : 0L);
        }
    }

    /* JADX INFO: renamed from: DV.n$n, reason: collision with other inner class name */
    class C0059n extends SharedSQLiteStatement {
        C0059n(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String O() {
            return "UPDATE pico_events SET committed = 1";
        }
    }

    class w6 extends SharedSQLiteStatement {
        w6(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String O() {
            return "DELETE FROM pico_events WHERE committed = 0";
        }
    }

    public static List gh() {
        return Collections.EMPTY_LIST;
    }

    @Override // DV.j
    public Object O(Continuation continuation) {
        return CoroutinesRoom.rl(this.f1496n, true, new I28(), continuation);
    }

    @Override // DV.j
    public Object n(Collection collection, Continuation continuation) {
        return CoroutinesRoom.rl(this.f1496n, true, new fuX(collection), continuation);
    }

    @Override // DV.j
    public Object nr(Continuation continuation) {
        return CoroutinesRoom.rl(this.f1496n, true, new Wre(), continuation);
    }

    @Override // DV.j
    public Object rl(PicoEventEntity picoEventEntity, Continuation continuation) {
        return CoroutinesRoom.rl(this.f1496n, true, new Ml(picoEventEntity), continuation);
    }

    @Override // DV.j
    public Object t(int i2, Continuation continuation) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT * from pico_events WHERE committed = 1 LIMIT ?", 1);
        roomSQLiteQueryUo.mUb(1, i2);
        return CoroutinesRoom.n(this.f1496n, false, DBUtil.n(), new CN3(roomSQLiteQueryUo), continuation);
    }

    public n(RoomDatabase roomDatabase) {
        this.f1496n = roomDatabase;
        this.rl = new j(roomDatabase);
        this.nr = new C0059n(roomDatabase);
        this.f1495O = new w6(roomDatabase);
    }
}

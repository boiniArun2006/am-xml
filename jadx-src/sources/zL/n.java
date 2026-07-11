package zL;

import SpD.PicoXEvent;
import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bendingspoons.picox.persistence.internal.entity.PicoXEventEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements zL.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RoomDatabase f76454n;
    private final EntityInsertionAdapter rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final P1.j f76455t = new P1.j();

    class Ml implements Callable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Collection f76456n;

        Ml(Collection collection) {
            this.f76456n = collection;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            StringBuilder sbRl = StringUtil.rl();
            sbRl.append("DELETE FROM picox_events WHERE id IN (");
            StringUtil.n(sbRl, this.f76456n.size());
            sbRl.append(")");
            SupportSQLiteStatement supportSQLiteStatementGh = n.this.f76454n.gh(sbRl.toString());
            Iterator it = this.f76456n.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                supportSQLiteStatementGh.k(i2, (String) it.next());
                i2++;
            }
            n.this.f76454n.xMQ();
            try {
                supportSQLiteStatementGh.XQ();
                n.this.f76454n.P5();
                return Unit.INSTANCE;
            } finally {
                n.this.f76454n.r();
            }
        }
    }

    class j extends EntityInsertionAdapter {
        j(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        protected String O() {
            return "INSERT OR REPLACE INTO `picox_events` (`id`,`eventData`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void mUb(SupportSQLiteStatement supportSQLiteStatement, PicoXEventEntity picoXEventEntity) {
            supportSQLiteStatement.k(1, picoXEventEntity.getId());
            supportSQLiteStatement.k(2, n.this.f76455t.n(picoXEventEntity.getEventData()));
        }
    }

    /* JADX INFO: renamed from: zL.n$n, reason: collision with other inner class name */
    class CallableC1296n implements Callable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ PicoXEventEntity f76457n;

        CallableC1296n(PicoXEventEntity picoXEventEntity) {
            this.f76457n = picoXEventEntity;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            n.this.f76454n.xMQ();
            try {
                n.this.rl.gh(this.f76457n);
                n.this.f76454n.P5();
                return Unit.INSTANCE;
            } finally {
                n.this.f76454n.r();
            }
        }
    }

    class w6 implements Callable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RoomSQLiteQuery f76458n;

        w6(RoomSQLiteQuery roomSQLiteQuery) {
            this.f76458n = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorJ2 = DBUtil.J2(n.this.f76454n, this.f76458n, false, null);
            try {
                int iO = CursorUtil.O(cursorJ2, "id");
                int iO2 = CursorUtil.O(cursorJ2, "eventData");
                ArrayList arrayList = new ArrayList(cursorJ2.getCount());
                while (cursorJ2.moveToNext()) {
                    String string = cursorJ2.getString(iO);
                    PicoXEvent picoXEventRl = n.this.f76455t.rl(cursorJ2.getString(iO2));
                    if (picoXEventRl == null) {
                        throw new IllegalStateException("Expected NON-NULL 'com.bendingspoons.picox.models.PicoXEvent', but it was NULL.");
                    }
                    arrayList.add(new PicoXEventEntity(string, picoXEventRl));
                }
                cursorJ2.close();
                this.f76458n.release();
                return arrayList;
            } catch (Throwable th) {
                cursorJ2.close();
                this.f76458n.release();
                throw th;
            }
        }
    }

    public static List Uo() {
        return Collections.EMPTY_LIST;
    }

    @Override // zL.j
    public Object n(Collection collection, Continuation continuation) {
        return CoroutinesRoom.rl(this.f76454n, true, new Ml(collection), continuation);
    }

    @Override // zL.j
    public Object rl(int i2, Continuation continuation) {
        RoomSQLiteQuery roomSQLiteQueryUo = RoomSQLiteQuery.Uo("SELECT * from picox_events LIMIT ?", 1);
        roomSQLiteQueryUo.mUb(1, i2);
        return CoroutinesRoom.n(this.f76454n, false, DBUtil.n(), new w6(roomSQLiteQueryUo), continuation);
    }

    @Override // zL.j
    public Object t(PicoXEventEntity picoXEventEntity, Continuation continuation) {
        return CoroutinesRoom.rl(this.f76454n, true, new CallableC1296n(picoXEventEntity), continuation);
    }

    public n(RoomDatabase roomDatabase) {
        this.f76454n = roomDatabase;
        this.rl = new j(roomDatabase);
    }
}

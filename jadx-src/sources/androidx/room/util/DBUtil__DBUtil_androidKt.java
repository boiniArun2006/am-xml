package androidx.room.util;

import GJW.Dsr;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.TransactionElement;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001aB\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0087@¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"R", "Landroidx/room/RoomDatabase;", "db", "", "isReadOnly", "inTransaction", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteConnection;", "block", "nr", "(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "t", "(Landroidx/room/RoomDatabase;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "sqLiteQuery", "maybeCopy", "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "O", "(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "rl", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "Ljava/io/File;", "databaseFile", "", "J2", "(Ljava/io/File;)I", c.f62177j, "()Landroid/os/CancellationSignal;", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
@SourceDebugExtension({"SMAP\nDBUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt\n+ 2 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n108#1,2:247\n111#1:251\n48#2:249\n67#2:250\n1#3:252\n*S KotlinDebug\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt\n*L\n52#1:247,2\n52#1:251\n53#1:249\n53#1:250\n*E\n"})
final /* synthetic */ class DBUtil__DBUtil_androidKt {
    public static final int J2(File databaseFile) {
        Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i2 = byteBufferAllocate.getInt();
            CloseableKt.closeFinally(channel, null);
            return i2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(channel, th);
                throw th2;
            }
        }
    }

    public static final Cursor O(RoomDatabase db, SupportSQLiteQuery sqLiteQuery, boolean z2, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor cursorU = db.U(sqLiteQuery, cancellationSignal);
        if (!z2 || !(cursorU instanceof AbstractWindowedCursor)) {
            return cursorU;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorU;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.n(cursorU) : cursorU;
    }

    public static final CancellationSignal n() {
        return new CancellationSignal();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object nr(RoomDatabase roomDatabase, boolean z2, boolean z3, Function1 function1, Continuation continuation) {
        DBUtil__DBUtil_androidKt$performSuspending$1 dBUtil__DBUtil_androidKt$performSuspending$1;
        RoomDatabase roomDatabase2;
        boolean z4;
        Function1 function12;
        if (continuation instanceof DBUtil__DBUtil_androidKt$performSuspending$1) {
            dBUtil__DBUtil_androidKt$performSuspending$1 = (DBUtil__DBUtil_androidKt$performSuspending$1) continuation;
            int i2 = dBUtil__DBUtil_androidKt$performSuspending$1.f41834o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dBUtil__DBUtil_androidKt$performSuspending$1.f41834o = i2 - Integer.MIN_VALUE;
            } else {
                dBUtil__DBUtil_androidKt$performSuspending$1 = new DBUtil__DBUtil_androidKt$performSuspending$1(continuation);
            }
        }
        DBUtil__DBUtil_androidKt$performSuspending$1 dBUtil__DBUtil_androidKt$performSuspending$12 = dBUtil__DBUtil_androidKt$performSuspending$1;
        Object obj = dBUtil__DBUtil_androidKt$performSuspending$12.f41835r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dBUtil__DBUtil_androidKt$performSuspending$12.f41834o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (roomDatabase.T() && roomDatabase.Xw() && roomDatabase.N()) {
                DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(z3, z2, roomDatabase, null, function1);
                dBUtil__DBUtil_androidKt$performSuspending$12.f41834o = 1;
                Object objM7 = roomDatabase.M7(z2, dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1, dBUtil__DBUtil_androidKt$performSuspending$12);
                if (objM7 != coroutine_suspended) {
                    return objM7;
                }
            } else {
                dBUtil__DBUtil_androidKt$performSuspending$12.f41833n = roomDatabase;
                dBUtil__DBUtil_androidKt$performSuspending$12.f41836t = function1;
                dBUtil__DBUtil_androidKt$performSuspending$12.f41832O = z2;
                dBUtil__DBUtil_androidKt$performSuspending$12.J2 = z3;
                dBUtil__DBUtil_androidKt$performSuspending$12.f41834o = 2;
                Object objNr = DBUtil.nr(roomDatabase, z3, dBUtil__DBUtil_androidKt$performSuspending$12);
                if (objNr != coroutine_suspended) {
                    roomDatabase2 = roomDatabase;
                    obj = objNr;
                    z4 = z3;
                    function12 = function1;
                }
            }
        }
        if (i3 == 1) {
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        boolean z5 = dBUtil__DBUtil_androidKt$performSuspending$12.J2;
        z2 = dBUtil__DBUtil_androidKt$performSuspending$12.f41832O;
        Function1 function13 = (Function1) dBUtil__DBUtil_androidKt$performSuspending$12.f41836t;
        RoomDatabase roomDatabase3 = (RoomDatabase) dBUtil__DBUtil_androidKt$performSuspending$12.f41833n;
        ResultKt.throwOnFailure(obj);
        z4 = z5;
        function12 = function13;
        roomDatabase2 = roomDatabase3;
        DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 = new DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(null, roomDatabase2, z2, z4, function12);
        dBUtil__DBUtil_androidKt$performSuspending$12.f41833n = null;
        dBUtil__DBUtil_androidKt$performSuspending$12.f41836t = null;
        dBUtil__DBUtil_androidKt$performSuspending$12.f41834o = 3;
        Object objUo = Dsr.Uo((CoroutineContext) obj, dBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1, dBUtil__DBUtil_androidKt$performSuspending$12);
        return objUo == coroutine_suspended ? coroutine_suspended : objUo;
    }

    public static final void rl(SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        DBUtil.rl(new SupportSQLiteConnection(db));
    }

    public static final Object t(RoomDatabase roomDatabase, boolean z2, Continuation continuation) {
        ContinuationInterceptor transactionDispatcher;
        CoroutineContext coroutineContextPlus;
        if (roomDatabase.T()) {
            TransactionElement transactionElement = (TransactionElement) continuation.get$context().get(TransactionElement.INSTANCE);
            if (transactionElement != null && (transactionDispatcher = transactionElement.getTransactionDispatcher()) != null && (coroutineContextPlus = roomDatabase.ViF().plus(transactionDispatcher)) != null) {
                return coroutineContextPlus;
            }
            if (z2) {
                return roomDatabase.e();
            }
            return roomDatabase.ViF();
        }
        return roomDatabase.S().getCoroutineContext();
    }
}

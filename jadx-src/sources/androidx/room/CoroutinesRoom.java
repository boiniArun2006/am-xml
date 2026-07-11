package androidx.room;

import GJW.eO;
import GJW.xuv;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.util.DBUtil;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/CoroutinesRoom;", "", c.f62177j, "Companion", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
public final class CoroutinesRoom {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/room/CoroutinesRoom$Companion;", "", "<init>", "()V", "R", "Landroidx/room/RoomDatabase;", "db", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "rl", "(Landroidx/room/RoomDatabase;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", c.f62177j, "(Landroidx/room/RoomDatabase;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutinesRoom.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinesRoom.android.kt\nandroidx/room/CoroutinesRoom$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,93:1\n314#2,11:94\n*S KotlinDebug\n*F\n+ 1 CoroutinesRoom.android.kt\nandroidx/room/CoroutinesRoom$Companion\n*L\n65#1:94,11\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object n(RoomDatabase roomDatabase, boolean z2, CancellationSignal cancellationSignal, Callable callable, Continuation continuation) {
            CoroutinesRoom$Companion$execute$3 coroutinesRoom$Companion$execute$3;
            final CancellationSignal cancellationSignal2;
            Callable callable2;
            Object objNr;
            RoomDatabase roomDatabase2 = roomDatabase;
            if (continuation instanceof CoroutinesRoom$Companion$execute$3) {
                coroutinesRoom$Companion$execute$3 = (CoroutinesRoom$Companion$execute$3) continuation;
                int i2 = coroutinesRoom$Companion$execute$3.f41276Z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    coroutinesRoom$Companion$execute$3.f41276Z = i2 - Integer.MIN_VALUE;
                } else {
                    coroutinesRoom$Companion$execute$3 = new CoroutinesRoom$Companion$execute$3(this, continuation);
                }
            }
            Object obj = coroutinesRoom$Companion$execute$3.f41279r;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = coroutinesRoom$Companion$execute$3.f41276Z;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (roomDatabase2.Xw() && roomDatabase2.N()) {
                    return callable.call();
                }
                coroutinesRoom$Companion$execute$3.f41277n = roomDatabase2;
                cancellationSignal2 = cancellationSignal;
                coroutinesRoom$Companion$execute$3.f41280t = cancellationSignal2;
                callable2 = callable;
                coroutinesRoom$Companion$execute$3.f41275O = callable2;
                coroutinesRoom$Companion$execute$3.f41276Z = 1;
                objNr = DBUtil.nr(roomDatabase2, z2, coroutinesRoom$Companion$execute$3);
                if (objNr != coroutine_suspended) {
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            Callable callable3 = (Callable) coroutinesRoom$Companion$execute$3.f41275O;
            CancellationSignal cancellationSignal3 = (CancellationSignal) coroutinesRoom$Companion$execute$3.f41280t;
            RoomDatabase roomDatabase3 = (RoomDatabase) coroutinesRoom$Companion$execute$3.f41277n;
            ResultKt.throwOnFailure(obj);
            callable2 = callable3;
            roomDatabase2 = roomDatabase3;
            objNr = obj;
            cancellationSignal2 = cancellationSignal3;
            CoroutineContext coroutineContext = (CoroutineContext) objNr;
            coroutinesRoom$Companion$execute$3.f41277n = roomDatabase2;
            coroutinesRoom$Companion$execute$3.f41280t = cancellationSignal2;
            coroutinesRoom$Companion$execute$3.f41275O = callable2;
            coroutinesRoom$Companion$execute$3.J2 = coroutineContext;
            coroutinesRoom$Companion$execute$3.f41276Z = 2;
            eO eOVar = new eO(IntrinsicsKt.intercepted(coroutinesRoom$Companion$execute$3), 1);
            eOVar.e();
            final xuv xuvVarNr = GJW.C.nr(roomDatabase2.S(), coroutineContext, null, new CoroutinesRoom$Companion$execute$4$job$1(callable2, eOVar, null), 2, null);
            eOVar.J2(new Function1<Throwable, Unit>() { // from class: androidx.room.CoroutinesRoom$Companion$execute$4$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    n(th);
                    return Unit.INSTANCE;
                }

                public final void n(Throwable th) {
                    CancellationSignal cancellationSignal4 = cancellationSignal2;
                    if (cancellationSignal4 != null) {
                        cancellationSignal4.cancel();
                    }
                    xuv.j.rl(xuvVarNr, null, 1, null);
                }
            });
            Object objWPU = eOVar.WPU();
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(coroutinesRoom$Companion$execute$3);
            }
            return objWPU == coroutine_suspended ? coroutine_suspended : objWPU;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object rl(RoomDatabase roomDatabase, boolean z2, Callable callable, Continuation continuation) {
            CoroutinesRoom$Companion$execute$1 coroutinesRoom$Companion$execute$1;
            if (continuation instanceof CoroutinesRoom$Companion$execute$1) {
                coroutinesRoom$Companion$execute$1 = (CoroutinesRoom$Companion$execute$1) continuation;
                int i2 = coroutinesRoom$Companion$execute$1.J2;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    coroutinesRoom$Companion$execute$1.J2 = i2 - Integer.MIN_VALUE;
                } else {
                    coroutinesRoom$Companion$execute$1 = new CoroutinesRoom$Companion$execute$1(this, continuation);
                }
            }
            Object objNr = coroutinesRoom$Companion$execute$1.f41272t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = coroutinesRoom$Companion$execute$1.J2;
            if (i3 == 0) {
                ResultKt.throwOnFailure(objNr);
                if (roomDatabase.Xw() && roomDatabase.N()) {
                    return callable.call();
                }
                coroutinesRoom$Companion$execute$1.f41271n = callable;
                coroutinesRoom$Companion$execute$1.J2 = 1;
                objNr = DBUtil.nr(roomDatabase, z2, coroutinesRoom$Companion$execute$1);
                if (objNr != coroutine_suspended) {
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objNr);
                return objNr;
            }
            callable = (Callable) coroutinesRoom$Companion$execute$1.f41271n;
            ResultKt.throwOnFailure(objNr);
            CoroutinesRoom$Companion$execute$2 coroutinesRoom$Companion$execute$2 = new CoroutinesRoom$Companion$execute$2(callable, null);
            coroutinesRoom$Companion$execute$1.f41271n = null;
            coroutinesRoom$Companion$execute$1.J2 = 2;
            Object objUo = GJW.Dsr.Uo((CoroutineContext) objNr, coroutinesRoom$Companion$execute$2, coroutinesRoom$Companion$execute$1);
            return objUo == coroutine_suspended ? coroutine_suspended : objUo;
        }
    }

    public static final Object n(RoomDatabase roomDatabase, boolean z2, CancellationSignal cancellationSignal, Callable callable, Continuation continuation) {
        return INSTANCE.n(roomDatabase, z2, cancellationSignal, callable, continuation);
    }

    public static final Object rl(RoomDatabase roomDatabase, boolean z2, Callable callable, Continuation continuation) {
        return INSTANCE.rl(roomDatabase, z2, callable, continuation);
    }
}

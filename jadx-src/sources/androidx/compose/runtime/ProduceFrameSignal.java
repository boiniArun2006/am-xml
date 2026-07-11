package androidx.compose.runtime;

import GJW.eO;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/ProduceFrameSignal;", "", "<init>", "()V", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "", "t", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "O", "Lkotlin/coroutines/Continuation;", "nr", "()Lkotlin/coroutines/Continuation;", c.f62177j, "Ljava/lang/Object;", "pendingFrameContinuation", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,1791:1\n33#2,2:1792\n33#2,2:1803\n314#3,9:1794\n323#3,2:1805\n48#4,5:1807\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n*L\n1713#1:1792,2\n1720#1:1803,2\n1719#1:1794,9\n1719#1:1805,2\n1738#1:1807,5\n*E\n"})
final class ProduceFrameSignal {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Object pendingFrameContinuation;

    public final Object t(Object obj, Continuation continuation) {
        eO eOVar;
        synchronized (obj) {
            if (this.pendingFrameContinuation == RecomposerKt.f30354n) {
                this.pendingFrameContinuation = RecomposerKt.rl;
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            eO eOVar2 = new eO(IntrinsicsKt.intercepted(continuation), 1);
            eOVar2.e();
            synchronized (obj) {
                try {
                    if (this.pendingFrameContinuation == RecomposerKt.f30354n) {
                        this.pendingFrameContinuation = RecomposerKt.rl;
                        eOVar = eOVar2;
                    } else {
                        this.pendingFrameContinuation = eOVar2;
                        eOVar = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (eOVar != null) {
                Result.Companion companion = Result.INSTANCE;
                eOVar.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
            }
            Object objWPU = eOVar2.WPU();
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWPU : Unit.INSTANCE;
        }
    }

    public final void O() {
        if (!(this.pendingFrameContinuation == RecomposerKt.rl)) {
            PreconditionsKt.rl("frame not pending");
        }
        this.pendingFrameContinuation = null;
    }

    public final Continuation nr() {
        Object obj = this.pendingFrameContinuation;
        if (obj instanceof Continuation) {
            this.pendingFrameContinuation = RecomposerKt.rl;
            return (Continuation) obj;
        }
        if (Intrinsics.areEqual(obj, RecomposerKt.f30354n) ? true : Intrinsics.areEqual(obj, RecomposerKt.rl)) {
            return null;
        }
        if (obj == null) {
            this.pendingFrameContinuation = RecomposerKt.f30354n;
            return null;
        }
        throw new IllegalStateException(("invalid pendingFrameContinuation " + obj).toString());
    }
}

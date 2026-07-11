package androidx.compose.runtime;

import GJW.Pl;
import GJW.eO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/Latch;", "", "<init>", "()V", "", "nr", "J2", "t", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", c.f62177j, "Ljava/lang/Object;", "lock", "", "Lkotlin/coroutines/Continuation;", "rl", "Ljava/util/List;", "awaiters", "spareList", "", "Z", "_isOpen", "O", "()Z", "isOpen", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,86:1\n27#2:87\n33#2,2:88\n33#2,2:90\n33#2,2:92\n33#2,2:103\n314#3,9:94\n323#3,2:105\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n*L\n36#1:87\n42#1:88,2\n54#1:90,2\n58#1:92,2\n80#1:103,2\n79#1:94,9\n79#1:105,2\n*E\n"})
public final class Latch {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private List awaiters = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private List spareList = new ArrayList();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean _isOpen = true;

    public final void J2() {
        synchronized (this.lock) {
            try {
                if (O()) {
                    return;
                }
                List list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Continuation continuation = (Continuation) list.get(i2);
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
                }
                list.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean O() {
        boolean z2;
        synchronized (this.lock) {
            z2 = this._isOpen;
        }
        return z2;
    }

    public final void nr() {
        synchronized (this.lock) {
            this._isOpen = false;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final Object t(Continuation continuation) {
        if (O()) {
            return Unit.INSTANCE;
        }
        final eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        synchronized (this.lock) {
            this.awaiters.add(eOVar);
        }
        eOVar.J2(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Latch$await$2$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                Object obj = this.f30199n.lock;
                Latch latch = this.f30199n;
                Pl pl = eOVar;
                synchronized (obj) {
                    latch.awaiters.remove(pl);
                    Unit unit = Unit.INSTANCE;
                }
            }
        });
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objWPU;
        }
        return Unit.INSTANCE;
    }
}

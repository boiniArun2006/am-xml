package androidx.compose.foundation.gestures;

import GJW.Lu;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001JA\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\r8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultDraggable2DState;", "Landroidx/compose/foundation/gestures/Draggable2DState;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/Drag2DScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", c.f62177j, "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/jvm/functions/Function1;", "nr", "()Lkotlin/jvm/functions/Function1;", "onDelta", "rl", "Landroidx/compose/foundation/gestures/Drag2DScope;", "drag2DScope", "Landroidx/compose/foundation/MutatorMutex;", "t", "Landroidx/compose/foundation/MutatorMutex;", "drag2DMutex", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultDraggable2DState implements Draggable2DState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function1 onDelta;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Drag2DScope drag2DScope;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutatorMutex drag2DMutex;

    @Override // androidx.compose.foundation.gestures.Draggable2DState
    public Object n(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object objJ2 = Lu.J2(new DefaultDraggable2DState$drag$2(this, mutatePriority, function2, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final Function1 getOnDelta() {
        return this.onDelta;
    }
}

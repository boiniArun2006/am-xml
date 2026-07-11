package androidx.compose.foundation.gestures;

import GJW.Lu;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0002\b\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010(\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultScrollableState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Lkotlin/Function1;", "", "onDelta", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "O", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "rl", "(F)F", c.f62177j, "Lkotlin/jvm/functions/Function1;", "qie", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollScope", "Landroidx/compose/foundation/MutatorMutex;", "t", "Landroidx/compose/foundation/MutatorMutex;", "scrollMutex", "Landroidx/compose/runtime/MutableState;", "", "nr", "Landroidx/compose/runtime/MutableState;", "isScrollingState", "isLastScrollForwardState", "J2", "isLastScrollBackwardState", "()Z", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultScrollableState implements ScrollableState {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableState isLastScrollBackwardState;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableState isLastScrollForwardState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function1 onDelta;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState isScrollingState;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float nr(float pixels) {
            boolean z2;
            if (Float.isNaN(pixels)) {
                return 0.0f;
            }
            float fFloatValue = ((Number) this.f16640n.getOnDelta().invoke(Float.valueOf(pixels))).floatValue();
            MutableState mutableState = this.f16640n.isLastScrollForwardState;
            boolean z3 = false;
            if (fFloatValue > 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            mutableState.setValue(Boolean.valueOf(z2));
            MutableState mutableState2 = this.f16640n.isLastScrollBackwardState;
            if (fFloatValue < 0.0f) {
                z3 = true;
            }
            mutableState2.setValue(Boolean.valueOf(z3));
            return fFloatValue;
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutatorMutex scrollMutex = new MutatorMutex();

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object O(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object objJ2 = Lu.J2(new DefaultScrollableState$scroll$2(this, mutatePriority, function2, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final Function1 getOnDelta() {
        return this.onDelta;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float rl(float delta) {
        return ((Number) this.onDelta.invoke(Float.valueOf(delta))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean t() {
        return ((Boolean) this.isScrollingState.getValue()).booleanValue();
    }

    public DefaultScrollableState(Function1 function1) {
        this.onDelta = function1;
        Boolean bool = Boolean.FALSE;
        this.isScrollingState = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.isLastScrollForwardState = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.isLastScrollBackwardState = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
    }
}

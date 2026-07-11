package androidx.compose.foundation.text.input.internal;

import GJW.xuv;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0014\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R+\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnimationState;", "", "", "animate", "<init>", "(Z)V", "", "Uo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "()V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Z", "nr", "()Z", "Ljava/util/concurrent/atomic/AtomicReference;", "LGJW/xuv;", "Landroidx/compose/foundation/AtomicReference;", "rl", "Ljava/util/concurrent/atomic/AtomicReference;", "animationJob", "", "<set-?>", "Landroidx/compose/runtime/MutableFloatState;", "O", "()F", "J2", "(F)V", "cursorAlpha", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCursorAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,99:1\n79#2:100\n112#2,2:101\n*S KotlinDebug\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n*L\n44#1:100\n44#1:101,2\n*E\n"})
public final class CursorAnimationState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean animate;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private AtomicReference animationJob = new AtomicReference(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState cursorAlpha = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2(float f3) {
        this.cursorAlpha.Z(f3);
    }

    public final float O() {
        return this.cursorAlpha.n();
    }

    public final Object Uo(Continuation continuation) {
        Object objJ2 = GJW.Lu.J2(new CursorAnimationState$snapToVisibleAndAnimate$2(this, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final boolean getAnimate() {
        return this.animate;
    }

    public final void t() {
        xuv xuvVar = (xuv) this.animationJob.getAndSet(null);
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
    }

    public CursorAnimationState(boolean z2) {
        this.animate = z2;
    }
}

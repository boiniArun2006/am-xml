package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fR+\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0005R+\u0010\u0016\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011\"\u0004\b\u0015\u0010\u0005¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "S", "Landroidx/compose/animation/core/TransitionState;", "initialState", "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/Transition;", "transition", "", "J2", "(Landroidx/compose/animation/core/Transition;)V", "Uo", "()V", "<set-?>", "rl", "Landroidx/compose/runtime/MutableState;", c.f62177j, "()Ljava/lang/Object;", "nr", "currentState", "t", "KN", "targetState", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2141:1\n85#2:2142\n113#2,2:2143\n85#2:2145\n113#2,2:2146\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n*L\n167#1:2142\n167#1:2143,2\n179#1:2145\n179#1:2146,2\n*E\n"})
public final class MutableTransitionState<S> extends TransitionState<S> {
    public static final int nr = 0;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableState currentState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState targetState;

    public MutableTransitionState(Object obj) {
        super(null);
        this.currentState = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
        this.targetState = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void J2(Transition transition) {
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void Uo() {
    }

    public void KN(Object obj) {
        this.targetState.setValue(obj);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public Object n() {
        return this.currentState.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void nr(Object obj) {
        this.currentState.setValue(obj);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public Object rl() {
        return this.targetState.getValue();
    }
}

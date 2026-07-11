package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 0, 1, 1}, l = {102, 153}, m = "animateToZero", n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
final class UpdatableAnimationState$animateToZero$1 extends ContinuationImpl {
    float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f17276O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f17277Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f17278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ UpdatableAnimationState f17279o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f17280r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f17281t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdatableAnimationState$animateToZero$1(UpdatableAnimationState updatableAnimationState, Continuation continuation) {
        super(continuation);
        this.f17279o = updatableAnimationState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17280r = obj;
        this.f17277Z |= Integer.MIN_VALUE;
        return this.f17279o.KN(null, null, this);
    }
}

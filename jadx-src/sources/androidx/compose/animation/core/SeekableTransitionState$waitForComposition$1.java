package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 0, 1, 1}, l = {543, 2142}, m = "waitForComposition", n = {"this", "expectedState", "this", "expectedState"}, s = {"L$0", "L$1", "L$0", "L$1"})
final class SeekableTransitionState$waitForComposition$1 extends ContinuationImpl {
    final /* synthetic */ SeekableTransitionState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f15610O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f15611n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f15612r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f15613t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeekableTransitionState$waitForComposition$1(SeekableTransitionState seekableTransitionState, Continuation continuation) {
        super(continuation);
        this.J2 = seekableTransitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15610O = obj;
        this.f15612r |= Integer.MIN_VALUE;
        return this.J2.FX(this);
    }
}

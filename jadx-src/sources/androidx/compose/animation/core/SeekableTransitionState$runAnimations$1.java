package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 1}, l = {353, 356}, m = "runAnimations", n = {"this", "this"}, s = {"L$0", "L$0"})
final class SeekableTransitionState$runAnimations$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ SeekableTransitionState f15591O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f15592n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f15593t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeekableTransitionState$runAnimations$1(SeekableTransitionState seekableTransitionState, Continuation continuation) {
        super(continuation);
        this.f15591O = seekableTransitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15593t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f15591O.bzg(this);
    }
}

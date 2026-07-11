package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {231, 280}, m = "animate", n = {"$this$animate", "animation", "block", "lateInitScope", "$this$animate", "animation", "block", "lateInitScope"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
final class SuspendAnimationKt$animate$4<T, V extends AnimationVector> extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f15631O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f15632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f15633o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f15634r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f15635t;

    SuspendAnimationKt$animate$4(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15634r = obj;
        this.f15633o |= Integer.MIN_VALUE;
        return SuspendAnimationKt.t(null, null, 0L, null, this);
    }
}

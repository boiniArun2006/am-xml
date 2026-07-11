package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {942, 949}, m = "runFrameLoop", n = {"this", "parentFrameClock", "frameSignal", "toRecompose", "toApply", "this", "parentFrameClock", "frameSignal", "toRecompose", "toApply"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
final class Recomposer$runFrameLoop$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f30314O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f30315S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Recomposer f30316Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f30317n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    /* synthetic */ Object f30318o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f30319r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f30320t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runFrameLoop$1(Recomposer recomposer, Continuation continuation) {
        super(continuation);
        this.f30316Z = recomposer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30318o = obj;
        this.f30315S |= Integer.MIN_VALUE;
        return this.f30316Z.tUK(null, null, this);
    }
}

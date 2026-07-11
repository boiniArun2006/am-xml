package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {1061, 1104}, m = "awaitHorizontalTouchSlopOrCancellation-jO51t88", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
final class DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16680O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f16681S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    /* synthetic */ Object f16682Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f16684o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f16685r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16686t;

    DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16682Z = obj;
        this.f16681S |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.J2(null, 0L, null, this);
    }
}

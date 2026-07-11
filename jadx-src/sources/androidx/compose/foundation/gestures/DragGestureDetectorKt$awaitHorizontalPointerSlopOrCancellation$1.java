package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {1061, 1104}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
final class DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16673O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f16674S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    /* synthetic */ Object f16675Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f16677o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f16678r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16679t;

    DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16675Z = obj;
        this.f16674S |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.O(null, 0L, 0, null, this);
    }
}

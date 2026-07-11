package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {802, 825}, m = "awaitPointerSlopOrCancellation-6ksA65w", n = {"$this$awaitPointerSlopOrCancellation_u2d6ksA65w", "onPointerSlopReached", "pointer", "touchSlopDetector", "touchSlop", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w", "onPointerSlopReached", "pointer", "touchSlopDetector", "dragEvent", "touchSlop"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
final class DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16697O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f16698S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    /* synthetic */ Object f16699Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f16701o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f16702r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16703t;

    DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16699Z = obj;
        this.f16698S |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.KN(null, 0L, 0, null, 0L, null, this);
    }
}

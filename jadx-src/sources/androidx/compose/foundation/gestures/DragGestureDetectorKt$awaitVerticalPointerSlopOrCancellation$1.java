package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {1061, 1104}, m = "awaitVerticalPointerSlopOrCancellation-gDDlDlE", n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
final class DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16714O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f16715S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    /* synthetic */ Object f16716Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16717n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f16718o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f16719r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16720t;

    DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16716Z = obj;
        this.f16715S |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.gh(null, 0L, 0, null, this);
    }
}

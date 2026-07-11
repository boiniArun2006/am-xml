package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0}, l = {1048}, m = "drag-VnAYq1g", n = {"$this$drag_u2dVnAYq1g", "onDrag", "orientation", "motionConsumed", "$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
final class DragGestureDetectorKt$drag$2 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16781O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f16782S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    /* synthetic */ Object f16783Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16784n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Object f16785o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f16786r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16787t;

    DragGestureDetectorKt$drag$2(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16783Z = obj;
        this.f16782S |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.r(null, 0L, null, null, null, this);
    }
}

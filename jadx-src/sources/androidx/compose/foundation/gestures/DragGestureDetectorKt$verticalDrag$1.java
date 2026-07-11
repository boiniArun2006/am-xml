package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0}, l = {1055}, m = "verticalDrag-jO51t88", n = {"onDrag", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
final class DragGestureDetectorKt$verticalDrag$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16794O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f16795Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    /* synthetic */ Object f16797o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f16798r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16799t;

    DragGestureDetectorKt$verticalDrag$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16797o = obj;
        this.f16795Z |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.WPU(null, 0L, null, this);
    }
}

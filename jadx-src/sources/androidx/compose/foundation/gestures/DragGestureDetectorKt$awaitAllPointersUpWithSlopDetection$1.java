package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0}, l = {851}, m = "awaitAllPointersUpWithSlopDetection", n = {"$this$awaitAllPointersUpWithSlopDetection", "pass", "pointer", "touchSlopDetector", "pointerSlopReached", "touchSlop"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "F$0"})
final class DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16660O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f16661S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    /* synthetic */ Object f16662Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16663n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f16664o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f16665r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16666t;

    DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16662Z = obj;
        this.f16661S |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.rl(null, null, null, this);
    }
}

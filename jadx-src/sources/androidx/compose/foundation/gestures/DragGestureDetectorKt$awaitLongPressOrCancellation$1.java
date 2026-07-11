package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0}, l = {968}, m = "awaitLongPressOrCancellation-rnUCldI", n = {"initialDown", "longPress", "deepPress"}, s = {"L$0", "L$1", "L$2"})
final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16687O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16688n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f16689r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16690t;

    DragGestureDetectorKt$awaitLongPressOrCancellation$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f16689r |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.Uo(null, 0L, this);
    }
}

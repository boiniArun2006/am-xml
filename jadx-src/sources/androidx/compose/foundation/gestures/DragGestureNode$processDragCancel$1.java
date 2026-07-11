package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0}, l = {552}, m = "processDragCancel", n = {"this"}, s = {"L$0"})
final class DragGestureNode$processDragCancel$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ DragGestureNode f16823O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16824n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f16825t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureNode$processDragCancel$1(DragGestureNode dragGestureNode, Continuation continuation) {
        super(continuation);
        this.f16823O = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16825t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f16823O.f11(this);
    }
}

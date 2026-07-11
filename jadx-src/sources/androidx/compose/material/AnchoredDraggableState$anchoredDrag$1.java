package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {525}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
final class AnchoredDraggableState$anchoredDrag$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ AnchoredDraggableState f21104O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f21105n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f21106t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableState$anchoredDrag$1(AnchoredDraggableState anchoredDraggableState, Continuation continuation) {
        super(continuation);
        this.f21104O = anchoredDraggableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f21106t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f21104O.xMQ(null, null, this);
    }
}

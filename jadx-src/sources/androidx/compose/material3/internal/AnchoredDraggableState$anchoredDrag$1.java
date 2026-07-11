package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {520}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
final class AnchoredDraggableState$anchoredDrag$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ AnchoredDraggableState f29046O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f29047n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f29048t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableState$anchoredDrag$1(AnchoredDraggableState anchoredDraggableState, Continuation continuation) {
        super(continuation);
        this.f29046O = anchoredDraggableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29048t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f29046O.xMQ(null, null, this);
    }
}

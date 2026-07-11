package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", f = "AnchoredDraggable.kt", i = {1}, l = {455, 458}, m = "fling", n = {"leftoverVelocity"}, s = {"L$0"})
final class AnchoredDraggableNode$fling$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ AnchoredDraggableNode f16520O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16521n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f16522t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableNode$fling$1(AnchoredDraggableNode anchoredDraggableNode, Continuation continuation) {
        super(continuation);
        this.f16520O = anchoredDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16522t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f16520O.ep(0.0f, this);
    }
}

package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0, 0}, l = {106}, m = "emitEnter", n = {"this", "interaction"}, s = {"L$0", "L$1"})
final class HoverableNode$emitEnter$1 extends ContinuationImpl {
    final /* synthetic */ HoverableNode J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f16136O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16137n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f16138r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16139t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HoverableNode$emitEnter$1(HoverableNode hoverableNode, Continuation continuation) {
        super(continuation);
        this.J2 = hoverableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16136O = obj;
        this.f16138r |= Integer.MIN_VALUE;
        return this.J2.NC9(this);
    }
}

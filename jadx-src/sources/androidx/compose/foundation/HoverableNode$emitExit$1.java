package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", i = {0}, l = {114}, m = "emitExit", n = {"this"}, s = {"L$0"})
final class HoverableNode$emitExit$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ HoverableNode f16140O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16141n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f16142t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HoverableNode$emitExit$1(HoverableNode hoverableNode, Continuation continuation) {
        super(continuation);
        this.f16140O = hoverableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16142t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f16140O.ex(this);
    }
}

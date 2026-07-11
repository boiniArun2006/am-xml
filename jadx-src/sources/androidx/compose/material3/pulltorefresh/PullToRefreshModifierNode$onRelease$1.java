package androidx.compose.material3.pulltorefresh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", i = {0, 0, 1, 1}, l = {359, 362}, m = "onRelease", n = {"this", "velocity", "this", "velocity"}, s = {"L$0", "F$0", "L$0", "F$0"})
final class PullToRefreshModifierNode$onRelease$1 extends ContinuationImpl {
    final /* synthetic */ PullToRefreshModifierNode J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f29375O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f29376n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f29377r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f29378t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullToRefreshModifierNode$onRelease$1(PullToRefreshModifierNode pullToRefreshModifierNode, Continuation continuation) {
        super(continuation);
        this.J2 = pullToRefreshModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29375O = obj;
        this.f29377r |= Integer.MIN_VALUE;
        return this.J2.cAB(0.0f, this);
    }
}

package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", f = "LazyStaggeredGridState.kt", i = {0, 0, 0}, l = {251, 252}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
final class LazyStaggeredGridState$scroll$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f18793O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f18794n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f18795o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ LazyStaggeredGridState f18796r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f18797t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridState$scroll$1(LazyStaggeredGridState lazyStaggeredGridState, Continuation continuation) {
        super(continuation);
        this.f18796r = lazyStaggeredGridState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f18795o |= Integer.MIN_VALUE;
        return this.f18796r.O(null, null, this);
    }
}

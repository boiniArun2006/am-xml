package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", i = {0, 0, 0}, l = {377, 378}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
final class LazyGridState$scroll$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f18355O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f18356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f18357o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ LazyGridState f18358r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f18359t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyGridState$scroll$1(LazyGridState lazyGridState, Continuation continuation) {
        super(continuation);
        this.f18358r = lazyGridState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f18357o |= Integer.MIN_VALUE;
        return this.f18358r.O(null, null, this);
    }
}

package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", i = {0, 0, 0}, l = {365, 366}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
final class LazyListState$scroll$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f18126O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f18127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f18128o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ LazyListState f18129r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f18130t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListState$scroll$1(LazyListState lazyListState, Continuation continuation) {
        super(continuation);
        this.f18129r = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f18128o |= Integer.MIN_VALUE;
        return this.f18129r.O(null, null, this);
    }
}

package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 1}, l = {636, 641}, m = "scroll$suspendImpl", n = {"$this", "scrollPriority", "block", "$this"}, s = {"L$0", "L$1", "L$2", "L$0"})
final class PagerState$scroll$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f19009O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f19010n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f19011o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ PagerState f19012r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f19013t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerState$scroll$1(PagerState pagerState, Continuation continuation) {
        super(continuation);
        this.f19012r = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f19011o |= Integer.MIN_VALUE;
        return PagerState.a(this.f19012r, null, null, this);
    }
}

package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 0}, l = {610, 617}, m = "animateScrollToPage", n = {"this", "animationSpec", "page", "pageOffsetFraction"}, s = {"L$0", "L$1", "I$0", "F$0"})
final class PagerState$animateScrollToPage$1 extends ContinuationImpl {
    float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f18993O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f18994Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f18995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ PagerState f18996o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f18997r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f18998t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerState$animateScrollToPage$1(PagerState pagerState, Continuation continuation) {
        super(continuation);
        this.f18996o = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18997r = obj;
        this.f18994Z |= Integer.MIN_VALUE;
        return this.f18996o.az(0, 0.0f, null, this);
    }
}

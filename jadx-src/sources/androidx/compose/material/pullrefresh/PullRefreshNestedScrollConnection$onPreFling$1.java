package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", i = {}, l = {98}, m = "onPreFling-QWom1Mo", n = {}, s = {})
final class PullRefreshNestedScrollConnection$onPreFling$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ PullRefreshNestedScrollConnection f23957O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f23958n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f23959t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullRefreshNestedScrollConnection$onPreFling$1(PullRefreshNestedScrollConnection pullRefreshNestedScrollConnection, Continuation continuation) {
        super(continuation);
        this.f23957O = pullRefreshNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23959t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f23957O.lS(0L, this);
    }
}

package androidx.compose.material3.pulltorefresh;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", i = {0}, l = {Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE}, m = "animateToThreshold", n = {"this"}, s = {"L$0"})
final class PullToRefreshModifierNode$animateToThreshold$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ PullToRefreshModifierNode f29365O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f29366n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f29367t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullToRefreshModifierNode$animateToThreshold$1(PullToRefreshModifierNode pullToRefreshModifierNode, Continuation continuation) {
        super(continuation);
        this.f29365O = pullToRefreshModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f29367t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f29365O.ZwA(this);
    }
}

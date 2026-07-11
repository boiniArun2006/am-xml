package androidx.privacysandbox.ads.adservices.topics;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", i = {}, l = {40}, m = "getTopics$suspendImpl", n = {}, s = {})
final class TopicsManagerImplCommon$getTopics$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TopicsManagerImplCommon f40918O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f40919n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f40920t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TopicsManagerImplCommon$getTopics$1(TopicsManagerImplCommon topicsManagerImplCommon, Continuation continuation) {
        super(continuation);
        this.f40918O = topicsManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40920t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return TopicsManagerImplCommon.O(this.f40918O, null, this);
    }
}

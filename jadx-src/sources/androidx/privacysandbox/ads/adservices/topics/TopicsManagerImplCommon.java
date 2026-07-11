package androidx.privacysandbox.ads.adservices.topics;

import GJW.eO;
import SM1.j;
import SM1.n;
import SM1.w6;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresExtension.Container
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0083@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;", "LSM1/w6;", "mTopicsManager", "<init>", "(LSM1/w6;)V", "LSM1/j;", "getTopicsRequest", "LSM1/n;", "J2", "(LSM1/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", AdActivity.REQUEST_KEY_EXTRA, "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", c.f62177j, "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;)LSM1/j;", "response", "nr", "(LSM1/n;)Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension({"SMAP\nTopicsManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicsManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,62:1\n314#2,11:63\n*S KotlinDebug\n*F\n+ 1 TopicsManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon\n*L\n46#1:63,11\n*E\n"})
public class TopicsManagerImplCommon extends TopicsManager {
    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    @RequiresPermission
    @DoNotInline
    public Object n(GetTopicsRequest getTopicsRequest, Continuation<? super GetTopicsResponse> continuation) {
        return O(this, getTopicsRequest, continuation);
    }

    public TopicsManagerImplCommon(w6 mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
    }

    private final Object J2(j jVar, Continuation continuation) {
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        rl(this);
        new androidx.credentials.j();
        OutcomeReceiverKt.n(eOVar);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @RequiresPermission
    @DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object O(TopicsManagerImplCommon topicsManagerImplCommon, GetTopicsRequest getTopicsRequest, Continuation<? super GetTopicsResponse> continuation) {
        TopicsManagerImplCommon$getTopics$1 topicsManagerImplCommon$getTopics$1;
        if (continuation instanceof TopicsManagerImplCommon$getTopics$1) {
            topicsManagerImplCommon$getTopics$1 = (TopicsManagerImplCommon$getTopics$1) continuation;
            int i2 = topicsManagerImplCommon$getTopics$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                topicsManagerImplCommon$getTopics$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                topicsManagerImplCommon$getTopics$1 = new TopicsManagerImplCommon$getTopics$1(topicsManagerImplCommon, continuation);
            }
        }
        Object objJ2 = topicsManagerImplCommon$getTopics$1.f40920t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = topicsManagerImplCommon$getTopics$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objJ2);
            topicsManagerImplCommon.t(getTopicsRequest);
            topicsManagerImplCommon$getTopics$1.f40919n = topicsManagerImplCommon;
            topicsManagerImplCommon$getTopics$1.J2 = 1;
            objJ2 = topicsManagerImplCommon.J2(null, topicsManagerImplCommon$getTopics$1);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            topicsManagerImplCommon = (TopicsManagerImplCommon) topicsManagerImplCommon$getTopics$1.f40919n;
            ResultKt.throwOnFailure(objJ2);
        }
        android.support.v4.media.j.n(objJ2);
        return topicsManagerImplCommon.nr(null);
    }

    public GetTopicsResponse nr(n response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return GetTopicsResponseHelper.f40912n.n(response);
    }

    public j t(GetTopicsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequestHelper.f40910n.rl(request);
        return null;
    }

    public static final /* synthetic */ w6 rl(TopicsManagerImplCommon topicsManagerImplCommon) {
        topicsManagerImplCommon.getClass();
        return null;
    }
}

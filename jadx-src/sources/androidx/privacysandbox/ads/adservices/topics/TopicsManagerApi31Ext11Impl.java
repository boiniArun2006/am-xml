package androidx.privacysandbox.ads.adservices.topics;

import SM1.j;
import SM1.n;
import SM1.w6;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresExtension
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0011¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerApi31Ext11Impl;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", AdActivity.REQUEST_KEY_EXTRA, "LSM1/j;", "t", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;)LSM1/j;", "LSM1/n;", "response", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "nr", "(LSM1/n;)Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
public final class TopicsManagerApi31Ext11Impl extends TopicsManagerImplCommon {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerApi31Ext11Impl(Context context) {
        super(null);
        Intrinsics.checkNotNullParameter(context, "context");
        w6.n(context);
        Intrinsics.checkNotNullExpressionValue(null, "get(context)");
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public GetTopicsResponse nr(n response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return GetTopicsResponseHelper.f40912n.rl(response);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public j t(GetTopicsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequestHelper.f40910n.n(request);
        return null;
    }
}

package androidx.privacysandbox.ads.adservices.topics;

import SM1.j;
import androidx.annotation.RestrictTo;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequestHelper;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", AdActivity.REQUEST_KEY_EXTRA, "LSM1/j;", c.f62177j, "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;)LSM1/j;", "rl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
public final class GetTopicsRequestHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final GetTopicsRequestHelper f40910n = new GetTopicsRequestHelper();

    public final j n(GetTopicsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        new j.C0311j().rl(request.getAdsSdkName()).t(request.getShouldRecordObservation()).n();
        Intrinsics.checkNotNullExpressionValue(null, "Builder()\n            .s…ion)\n            .build()");
        return null;
    }

    public final j rl(GetTopicsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        new j.C0311j().rl(request.getAdsSdkName()).n();
        Intrinsics.checkNotNullExpressionValue(null, "Builder()\n            .s…ame)\n            .build()");
        return null;
    }

    private GetTopicsRequestHelper() {
    }
}

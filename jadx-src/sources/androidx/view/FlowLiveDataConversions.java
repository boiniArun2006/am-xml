package androidx.view;

import TFv.Wre;
import TFv.fuX;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/lifecycle/LiveData;", "LTFv/Wre;", c.f62177j, "(Landroidx/lifecycle/LiveData;)LTFv/Wre;", "lifecycle-livedata_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName(name = "FlowLiveDataConversions")
public final class FlowLiveDataConversions {
    public static final Wre n(LiveData liveData) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        return fuX.HI(fuX.J2(new FlowLiveDataConversions$asFlow$1(liveData, null)));
    }
}

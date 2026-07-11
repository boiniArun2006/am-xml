package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.android.gms.ads.MobileAds;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeke {
    private final Context zza;

    zzeke(Context context) {
        this.zza = context;
    }

    public final com.google.common.util.concurrent.Xo zza(boolean z2) {
        try {
            GetTopicsRequest getTopicsRequestN = new GetTopicsRequest.Builder().rl(MobileAds.ERROR_DOMAIN).t(z2).n();
            TopicsManagerFutures topicsManagerFuturesN = TopicsManagerFutures.n(this.zza);
            return topicsManagerFuturesN != null ? topicsManagerFuturesN.rl(getTopicsRequestN) : zzgzo.zzc(new IllegalStateException());
        } catch (Exception e2) {
            return zzgzo.zzc(e2);
        }
    }
}

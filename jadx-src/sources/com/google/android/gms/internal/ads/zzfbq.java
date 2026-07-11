package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final /* synthetic */ class zzfbq implements zzgyw {
    static final /* synthetic */ zzfbq zza = new zzfbq();

    private /* synthetic */ zzfbq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (getTopicsResponse == null) {
            return zzgzo.zza(new zzfbs("", 1, null));
        }
        zzifk zzifkVarZzc = zzifl.zzc();
        for (Topic topic : getTopicsResponse.getTopics()) {
            zzifi zzifiVarZzc = zzifj.zzc();
            zzifiVarZzc.zza(topic.getTopicCode());
            zzifiVarZzc.zzb(topic.getModelVersion());
            zzifiVarZzc.zzc(topic.getTaxonomyVersion());
            zzifkVarZzc.zza((zzifj) zzifiVarZzc.zzbu());
        }
        return zzgzo.zza(new zzfbs(Base64.encodeToString(((zzifl) zzifkVarZzc.zzbu()).zzaN(), 1), 1, null));
    }
}

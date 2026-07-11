package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfza {
    private final zzfyw zza;

    @PublishedApi
    public final /* synthetic */ zzfyy zza() {
        zzibr zzibrVarZzbu = this.zza.zzbu();
        Intrinsics.checkNotNullExpressionValue(zzibrVarZzbu, "build(...)");
        return (zzfyy) zzibrVarZzbu;
    }

    @JvmName(name = "getQueryIdToAdQualityDataMapMap")
    public final /* synthetic */ zziev zzb() {
        Map mapZzb = this.zza.zzb();
        Intrinsics.checkNotNullExpressionValue(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zziev(mapZzb);
    }

    @JvmName(name = "putQueryIdToAdQualityDataMap")
    public final void zzc(zziev zzievVar, String key, zzfyu value) {
        Intrinsics.checkNotNullParameter(zzievVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.zza.zzc(key, value);
    }

    @JvmName(name = "removeQueryIdToAdQualityDataMap")
    public final /* synthetic */ void zzd(zziev zzievVar, String key) {
        Intrinsics.checkNotNullParameter(zzievVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        this.zza.zza(key);
    }
}

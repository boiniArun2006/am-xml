package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcwh implements zzcwi {
    private final Map zza;

    zzcwh(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    @Nullable
    public final zzekg zza(int i2, String str) {
        return (zzekg) this.zza.get(str);
    }
}

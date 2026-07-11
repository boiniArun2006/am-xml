package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgpm extends zzgok {
    final /* synthetic */ zzgpo zza;
    private final zzgpt zzb;

    @Override // com.google.android.gms.internal.ads.zzgol
    public final void zzb(Bundle bundle) {
        int i2 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i3 = bundle.getInt("uiMode", 0);
        zzgpr zzgprVarZzd = zzgps.zzd();
        zzgprVarZzd.zza(i2);
        if (string != null) {
            zzgprVarZzd.zzb(string);
        }
        zzgprVarZzd.zzc(i3);
        this.zzb.zza(zzgprVarZzd.zzd());
        if (i2 == 8157) {
            this.zza.zzd();
        }
    }

    zzgpm(zzgpo zzgpoVar, zzgpt zzgptVar) {
        Objects.requireNonNull(zzgpoVar);
        this.zza = zzgpoVar;
        this.zzb = zzgptVar;
    }
}

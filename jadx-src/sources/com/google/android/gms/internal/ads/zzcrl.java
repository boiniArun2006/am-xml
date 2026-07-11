package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcrl implements zzdca {
    private final zzfki zza;

    public zzcrl(zzfki zzfkiVar) {
        this.zza = zzfkiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zza(@Nullable Context context) {
        try {
            this.zza.zzi();
        } catch (zzfjr e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onPause for the mediation adapter.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzb(@Nullable Context context) {
        try {
            zzfki zzfkiVar = this.zza;
            zzfkiVar.zzj();
            if (context != null) {
                zzfkiVar.zzp(context);
            }
        } catch (zzfjr e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onResume for the mediation adapter.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzc(@Nullable Context context) {
        try {
            this.zza.zzf();
        } catch (zzfjr e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onDestroy for the mediation adapter.", e2);
        }
    }
}

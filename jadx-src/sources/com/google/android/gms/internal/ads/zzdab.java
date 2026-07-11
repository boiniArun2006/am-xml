package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzdab implements zzdct, zzdca {
    private final zzfir zza;

    public zzdab(Context context, zzfir zzfirVar, zzbxx zzbxxVar) {
        this.zza = zzfirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zza(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzb(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdca
    public final void zzc(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        zzbxy zzbxyVar = this.zza.zzad;
        if (zzbxyVar == null || !zzbxyVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbxyVar.zzb;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }
}

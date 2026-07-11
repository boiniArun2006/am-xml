package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfqy extends zzbez {
    final /* synthetic */ zzhah zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzft zzb;
    final /* synthetic */ zzfqz zzc;

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzc(int i2) {
    }

    zzfqy(zzfqz zzfqzVar, zzhah zzhahVar, com.google.android.gms.ads.internal.client.zzft zzftVar) {
        this.zza = zzhahVar;
        this.zzb = zzftVar;
        Objects.requireNonNull(zzfqzVar);
        this.zzc = zzfqzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzb(zzbex zzbexVar) {
        Objects.requireNonNull(this.zzc);
        zzfqt.zza(zzbexVar, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        String str = this.zzb.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        zzfqz zzfqzVar = this.zzc;
        Objects.requireNonNull(zzfqzVar);
        zzfqzVar.zzD(zzeVar);
    }
}

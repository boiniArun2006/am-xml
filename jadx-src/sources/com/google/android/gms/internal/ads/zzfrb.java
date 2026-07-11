package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfrb extends com.google.android.gms.ads.internal.client.zzbm {
    final /* synthetic */ zzhah zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbx zzb;
    final /* synthetic */ zzfrc zzc;

    zzfrb(zzfrc zzfrcVar, zzhah zzhahVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        this.zza = zzhahVar;
        this.zzb = zzbxVar;
        Objects.requireNonNull(zzfrcVar);
        this.zzc = zzfrcVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzb() {
        Objects.requireNonNull(this.zzc);
        zzfqt.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        zzfrc zzfrcVar = this.zzc;
        String str = zzfrcVar.zze.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        zzfrcVar.zzD(zzeVar);
    }
}

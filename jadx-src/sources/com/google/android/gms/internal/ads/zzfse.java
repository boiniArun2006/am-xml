package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfse extends zzcbf {
    final /* synthetic */ zzhah zza;
    final /* synthetic */ zzcaz zzb;
    final /* synthetic */ zzfsf zzc;

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf(int i2) {
    }

    zzfse(zzfsf zzfsfVar, zzhah zzhahVar, zzcaz zzcazVar) {
        this.zza = zzhahVar;
        this.zzb = zzcazVar;
        Objects.requireNonNull(zzfsfVar);
        this.zzc = zzfsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zze() {
        Objects.requireNonNull(this.zzc);
        zzfqt.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        zzfsf zzfsfVar = this.zzc;
        String str = zzfsfVar.zze.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(string);
        sb.append(", adUnitId: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        zzfsfVar.zzD(zzeVar);
    }
}

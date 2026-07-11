package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgom extends zzgou {
    private String zza;
    private String zzb;

    zzgom() {
    }

    @Override // com.google.android.gms.internal.ads.zzgou
    public final zzgou zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgou
    public final zzgou zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgou
    public final zzgov zzc() {
        return new zzgon(this.zza, this.zzb, null);
    }
}

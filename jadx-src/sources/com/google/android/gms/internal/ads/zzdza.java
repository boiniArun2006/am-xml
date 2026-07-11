package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzdza extends zzdze {
    private long zza;
    private int zzb;
    private byte zzc;

    zzdza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdze
    public final zzdze zza(long j2) {
        this.zza = j2;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdze
    public final zzdze zzb(int i2) {
        this.zzb = i2;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdze
    public final zzdzf zzc() {
        if (this.zzc == 3) {
            return new zzdzb(this.zza, this.zzb, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb.append(" id");
        }
        if ((this.zzc & 2) == 0) {
            sb.append(" eventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

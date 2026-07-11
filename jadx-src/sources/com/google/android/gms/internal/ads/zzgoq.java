package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgoq extends zzgpr {
    private int zza;
    private String zzb;
    private int zzc;
    private byte zzd;

    zzgoq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final zzgpr zza(int i2) {
        this.zza = i2;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final zzgpr zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final zzgpr zzc(int i2) {
        this.zzc = i2;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final zzgps zzd() {
        if (this.zzd == 3) {
            return new zzgor(this.zza, this.zzb, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzd & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

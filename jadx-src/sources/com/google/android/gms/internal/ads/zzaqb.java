package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzaqb {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void zza() {
        int i2 = this.zzd;
        int i3 = i2 == Integer.MIN_VALUE ? this.zzb : i2 + this.zzc;
        this.zzd = i3;
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + String.valueOf(i3).length());
        sb.append(str);
        sb.append(i3);
        this.zze = sb.toString();
    }

    public zzaqb(int i2, int i3, int i5) {
        String string;
        if (i2 == Integer.MIN_VALUE) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 1);
            sb.append(i2);
            sb.append("/");
            string = sb.toString();
        }
        this.zza = string;
        this.zzb = i3;
        this.zzc = i5;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    public final int zzb() {
        zzd();
        return this.zzd;
    }

    public final String zzc() {
        zzd();
        return this.zze;
    }
}

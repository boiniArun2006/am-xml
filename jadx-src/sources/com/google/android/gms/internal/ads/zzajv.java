package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzajv implements zzagc {
    public final int zza;
    public final long zzb;
    public final int zzc;

    public zzajv(int i2, long j2, int i3) {
        this.zza = i2;
        this.zzb = j2;
        this.zzc = i3;
    }

    public final String toString() {
        String strZzx = zzfj.zzx(this.zza);
        int length = strZzx.length();
        long j2 = this.zzb;
        int length2 = String.valueOf(j2).length();
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i2).length() + 1);
        sb.append("AtomSizeTooSmall{type=");
        sb.append(strZzx);
        sb.append(", size=");
        sb.append(j2);
        sb.append(", minHeaderSize=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}

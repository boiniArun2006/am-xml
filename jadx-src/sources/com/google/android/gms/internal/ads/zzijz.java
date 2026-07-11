package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzijz {
    public static final zzijz zzj = new zzijz(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzijz zzk = new zzijz(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzijz zzl = new zzijz(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final zzijz zzm = new zzijz(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;

    public zzijz(double d2, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
        this.zza = d7;
        this.zzb = d8;
        this.zzc = d9;
        this.zzd = d2;
        this.zze = d4;
        this.zzf = d5;
        this.zzg = d6;
        this.zzh = d10;
        this.zzi = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzijz.class != obj.getClass()) {
            return false;
        }
        zzijz zzijzVar = (zzijz) obj;
        return Double.compare(zzijzVar.zzd, this.zzd) == 0 && Double.compare(zzijzVar.zze, this.zze) == 0 && Double.compare(zzijzVar.zzf, this.zzf) == 0 && Double.compare(zzijzVar.zzg, this.zzg) == 0 && Double.compare(zzijzVar.zzh, this.zzh) == 0 && Double.compare(zzijzVar.zzi, this.zzi) == 0 && Double.compare(zzijzVar.zza, this.zza) == 0 && Double.compare(zzijzVar.zzb, this.zzb) == 0 && Double.compare(zzijzVar.zzc, this.zzc) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zza);
        long j2 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zzb);
        long j3 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.zzc);
        long j4 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.zzd);
        long j5 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.zze);
        long j6 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.zzf);
        long j7 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.zzg);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.zzh);
        long j9 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.zzi);
        return (((((((((((((((((int) j2) * 31) + ((int) j3)) * 31) + ((int) j4)) * 31) + ((int) j5)) * 31) + ((int) j6)) * 31) + ((int) j7)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j9)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zzj)) {
            return "Rotate 0°";
        }
        if (equals(zzk)) {
            return "Rotate 90°";
        }
        if (equals(zzl)) {
            return "Rotate 180°";
        }
        if (equals(zzm)) {
            return "Rotate 270°";
        }
        double d2 = this.zza;
        double d4 = this.zzb;
        double d5 = this.zzc;
        double d6 = this.zzd;
        double d7 = this.zze;
        double d8 = this.zzf;
        double d9 = this.zzg;
        double d10 = this.zzh;
        double d11 = this.zzi;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d4);
        sb.append(", w=");
        sb.append(d5);
        sb.append(", a=");
        sb.append(d6);
        sb.append(", b=");
        sb.append(d7);
        sb.append(", c=");
        sb.append(d8);
        sb.append(", d=");
        sb.append(d9);
        sb.append(", tx=");
        sb.append(d10);
        sb.append(", ty=");
        sb.append(d11);
        sb.append("}");
        return sb.toString();
    }
}

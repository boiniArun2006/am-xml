package com.google.android.gms.internal.ads;

import ScC.FuwU.XIvb;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzi {
    public static final zzi zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;

    @Nullable
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    /* synthetic */ zzi(int i2, int i3, int i5, byte[] bArr, int i7, int i8, byte[] bArr2) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i5;
        this.zze = bArr;
        this.zzf = i7;
        this.zzg = i8;
    }

    public static boolean zza(@Nullable zzi zziVar) {
        if (zziVar == null) {
            return true;
        }
        int i2 = zziVar.zzb;
        if (i2 != -1 && i2 != 1 && i2 != 2) {
            return false;
        }
        int i3 = zziVar.zzc;
        if (i3 != -1 && i3 != 2) {
            return false;
        }
        int i5 = zziVar.zzd;
        if ((i5 != -1 && i5 != 3) || zziVar.zze != null) {
            return false;
        }
        int i7 = zziVar.zzg;
        if (i7 != -1 && i7 != 8) {
            return false;
        }
        int i8 = zziVar.zzf;
        return i8 == -1 || i8 == 8;
    }

    public static int zzb(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzc(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzh(int i2) {
        if (i2 == -1) {
            return "Unset color space";
        }
        if (i2 == 6) {
            return "BT2020";
        }
        if (i2 == 1) {
            return "BT709";
        }
        if (i2 == 2) {
            return "BT601";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
        sb.append("Undefined color space ");
        sb.append(i2);
        return sb.toString();
    }

    private static String zzi(int i2) {
        if (i2 == -1) {
            return "Unset color transfer";
        }
        if (i2 == 10) {
            return "Gamma 2.2";
        }
        if (i2 == 1) {
            return "Linear";
        }
        if (i2 == 2) {
            return "sRGB";
        }
        if (i2 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i2 == 6) {
            return "ST2084 PQ";
        }
        if (i2 == 7) {
            return "HLG";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 25);
        sb.append("Undefined color transfer ");
        sb.append(i2);
        return sb.toString();
    }

    private static String zzj(int i2) {
        if (i2 == -1) {
            return "Unset color range";
        }
        if (i2 == 1) {
            return XIvb.RahnIIMe;
        }
        if (i2 == 2) {
            return "Limited range";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
        sb.append("Undefined color range ");
        sb.append(i2);
        return sb.toString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzi.class == obj.getClass()) {
            zzi zziVar = (zzi) obj;
            if (this.zzb == zziVar.zzb && this.zzc == zziVar.zzc && this.zzd == zziVar.zzd && Arrays.equals(this.zze, zziVar.zze) && this.zzf == zziVar.zzf && this.zzg == zziVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final zzh zzd() {
        return new zzh(this, null);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }

    static {
        zzh zzhVar = new zzh();
        zzhVar.zza(1);
        zzhVar.zzb(2);
        zzhVar.zzc(3);
        zza = zzhVar.zzg();
        zzh zzhVar2 = new zzh();
        zzhVar2.zza(1);
        zzhVar2.zzb(1);
        zzhVar2.zzc(2);
        zzhVar2.zzg();
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public final int hashCode() {
        int i2 = this.zzh;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((((((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31) + Arrays.hashCode(this.zze)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string;
        int i2 = this.zzf;
        int i3 = this.zzd;
        int i5 = this.zzc;
        String strZzh = zzh(this.zzb);
        String strZzj = zzj(i5);
        String strZzi = zzi(i3);
        String string2 = "NA";
        if (i2 != -1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 8);
            sb.append(i2);
            sb.append("bit Luma");
            string = sb.toString();
        } else {
            string = "NA";
        }
        int i7 = this.zzg;
        if (i7 != -1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 10);
            sb2.append(i7);
            sb2.append("bit Chroma");
            string2 = sb2.toString();
        }
        boolean z2 = this.zze != null;
        StringBuilder sb3 = new StringBuilder(strZzh.length() + 12 + strZzj.length() + 2 + strZzi.length() + 2 + String.valueOf(z2).length() + 2 + string.length() + 2 + string2.length() + 1);
        sb3.append("ColorInfo(");
        sb3.append(strZzh);
        sb3.append(", ");
        sb3.append(strZzj);
        sb3.append(", ");
        sb3.append(strZzi);
        sb3.append(", ");
        sb3.append(z2);
        sb3.append(", ");
        sb3.append(string);
        sb3.append(", ");
        sb3.append(string2);
        sb3.append(")");
        return sb3.toString();
    }

    public final String zzg() {
        String str;
        String string;
        if (zzf()) {
            Object[] objArr = {zzh(this.zzb), zzj(this.zzc), zzi(this.zzd)};
            String str2 = zzfj.zza;
            str = String.format(Locale.US, "%s/%s/%s", objArr);
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            int i2 = this.zzf;
            int i3 = this.zzg;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(i3).length());
            sb.append(i2);
            sb.append("/");
            sb.append(i3);
            string = sb.toString();
        } else {
            string = "NA/NA";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + string.length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(string);
        return sb2.toString();
    }
}

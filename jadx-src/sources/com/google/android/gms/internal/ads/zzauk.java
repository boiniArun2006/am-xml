package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzauk {
    public static final zzauk zzb = new zzauk(new byte[0]);
    public static final Comparator zzc = new zzauj();
    public final byte[] zza;

    public zzauk(byte[] bArr) {
        this.zza = bArr;
    }

    public static zzauk zze(byte[] bArr) {
        return new zzauk(zzh(bArr, 0, bArr.length));
    }

    public static zzauk zzf(String str) {
        return zze(str.getBytes(Charset.forName(zzaui.zza("Hn2H4l0="))));
    }

    public static int zzg(byte b2) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        return b2 & ((iArr[6] + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9)) ^ (iArr[7] % 837626799));
    }

    public static byte[] zzh(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzauk) {
            return Arrays.equals(this.zza, ((zzauk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(Arrays.hashCode(this.zza));
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int i12 = i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9);
        String string = Arrays.toString(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + ((i11 % 981766422) ^ i12));
        sb.append(zzaui.zza("CVC1qiQNJHikW0iU1TIPZA=="));
        sb.append(string);
        sb.append(zzaui.zza("Ng=="));
        return sb.toString();
    }

    public final byte[] zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        return length == 0 ? new byte[0] : zzh(bArr, 0, length);
    }

    public final byte zzb(int i2) {
        int i3 = ((((~2106914653) & 587408197) | 1537377410) + ((2106914653 & 536945509) | 443419704)) - 2137956065;
        int i5 = 2013725218 % 1633938701;
        int i7 = ((((~1287859999) & 62941354) | 437464817) + ((1287859999 & 1639989262) | 1644309956)) - 2060977796;
        int i8 = 1442767057 % 63299708;
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (((length - (i2 + 1)) | i2) >= 0) {
            return bArr[i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + (i3 ^ i5));
            sb.append(zzaui.zza("Akelqh1fajntGgo="));
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + (i7 ^ i8) + String.valueOf(length).length());
        sb2.append(zzaui.zza("Akelqh1faDmxRUSK1T9GeQ=="));
        sb2.append(i2);
        sb2.append(zzaui.zza("Zwk="));
        sb2.append(length);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final String zzc() {
        Charset charsetForName = Charset.forName(zzaui.zza("Hn2H4l0="));
        byte[] bArr = this.zza;
        return new String(bArr, 0, bArr.length, charsetForName);
    }

    public final zzauk zzd(zzauk zzaukVar) {
        byte[] bArr = zzaukVar.zza;
        int length = bArr.length;
        byte[] bArr2 = this.zza;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return zze(bArr3);
    }
}

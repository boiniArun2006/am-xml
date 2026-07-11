package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzqc {
    protected static final Charset zza = StandardCharsets.UTF_16;
    protected int[] zzb;
    protected int[] zzc;
    private final int[] zzd = {511133343, 1277647508, 107287496, 338123662};
    private byte[] zze;
    private byte[] zzf;
    private int zzg;

    protected zzqc() {
    }

    protected static int zza(int i2, int i3) {
        if (i2 % 2 != 0) {
            return (i2 | i3) - (i2 & i3);
        }
        return ((~i2) & i3) | ((~i3) & i2);
    }

    public static String zze(String str, byte[] bArr, zzqd zzqdVar) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr2 = new byte[12];
        int length = bArrDecode.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArrDecode, 0, bArr2, 0, 12);
        System.arraycopy(bArrDecode, 12, bArr3, 0, length);
        return new String(new zzqc(bArr, bArr2).zzd(bArr3), zza);
    }

    protected zzqc(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException();
        }
        this.zze = bArr;
        this.zzg = 1;
        this.zzf = bArr2;
        this.zzb = new int[16];
        for (int i2 = 0; i2 < 4; i2++) {
            this.zzb[i2] = zza(this.zzd[i2], 2131181306);
        }
        for (int i3 = 4; i3 < 12; i3++) {
            this.zzb[i3] = zzg(this.zze, (i3 - 4) * 4);
        }
        this.zzb[12] = this.zzg;
        for (int i5 = 13; i5 < 16; i5++) {
            this.zzb[i5] = zzg(this.zzf, (i5 - 13) * 4);
        }
        int[] iArr = new int[16];
        this.zzc = iArr;
        int[] iArr2 = this.zzb;
        int length = iArr2.length;
        System.arraycopy(iArr2, 0, iArr, 0, 16);
    }

    public static String zzf(String str, byte[] bArr, zzqd zzqdVar) {
        byte[] bArr2 = new byte[12];
        new SecureRandom().nextBytes(bArr2);
        byte[] bArrZzd = new zzqc(bArr, bArr2).zzd(str.getBytes(zza));
        int length = bArrZzd.length;
        byte[] bArr3 = new byte[length + 12];
        System.arraycopy(bArr2, 0, bArr3, 0, 12);
        System.arraycopy(bArrZzd, 0, bArr3, 12, length);
        return Base64.encodeToString(bArr3, 2);
    }

    private static final int zzg(byte[] bArr, int i2) {
        int i3 = bArr[i2] & UByte.MAX_VALUE;
        int i5 = bArr[i2 + 1] & UByte.MAX_VALUE;
        int i7 = bArr[i2 + 2] & UByte.MAX_VALUE;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    protected final void zzb(int i2, int i3, int i5, int i7) {
        zzc(i2, i3, i7, 16);
        zzc(i5, i7, i3, 12);
        zzc(i2, i3, i7, 8);
        zzc(i5, i7, i3, 7);
    }

    protected final void zzc(int i2, int i3, int i5, int i7) {
        int[] iArr = this.zzb;
        int i8 = iArr[i2] + iArr[i3];
        iArr[i2] = i8;
        int iZza = zza(iArr[i5], i8);
        iArr[i5] = iZza;
        iArr[i5] = (iZza << i7) | (iZza >>> (32 - i7));
    }

    protected final byte[] zzd(byte[] bArr) {
        if (this.zzg != 1) {
            throw new IllegalStateException();
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i2 = 0;
        while (length > 0) {
            int[] iArr = this.zzc;
            int[] iArr2 = this.zzb;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr2, 0, 16);
            this.zzb[12] = this.zzg;
            for (int i3 = 0; i3 < 10; i3++) {
                zzb(0, 4, 8, 12);
                zzb(1, 5, 9, 13);
                zzb(2, 6, 10, 14);
                zzb(3, 7, 11, 15);
                zzb(0, 5, 10, 15);
                zzb(1, 6, 11, 12);
                zzb(2, 7, 8, 13);
                zzb(3, 4, 9, 14);
            }
            byte[] bArr3 = new byte[64];
            for (int i5 = 0; i5 < 16; i5++) {
                int i7 = this.zzb[i5];
                int i8 = i5 * 4;
                bArr3[i8] = (byte) (i7 & 255);
                bArr3[i8 + 1] = (byte) ((i7 >> 8) & 255);
                bArr3[i8 + 2] = (byte) ((i7 >> 16) & 255);
                bArr3[i8 + 3] = (byte) ((i7 >> 24) & 255);
            }
            for (int i9 = 0; i9 < Math.min(64, length); i9++) {
                int i10 = i2 + i9;
                bArr2[i10] = (byte) zza(bArr3[i9], bArr[i10]);
            }
            this.zzg++;
            length -= 64;
            i2 += 64;
        }
        return bArr2;
    }
}

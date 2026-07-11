package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzer {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzgup zzc = zzgup.zzl(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private static final AtomicBoolean zzd = new AtomicBoolean();
    private byte[] zze;
    private int zzf;
    private int zzg;

    public zzer(byte[] bArr, int i2) {
        this.zze = bArr;
        this.zzg = i2;
    }

    private final char zzS(ByteOrder byteOrder, int i2) {
        zzW(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.zze;
            int i3 = this.zzf + i2;
            return zzgxw.zza(bArr[i3], bArr[i3 + 1]);
        }
        byte[] bArr2 = this.zze;
        int i5 = this.zzf + i2;
        return zzgxw.zza(bArr2[i5 + 1], bArr2[i5]);
    }

    private static boolean zzX(byte b2) {
        return (b2 & 192) == 128;
    }

    public final long zzA() {
        zzW(4);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        long j2 = bArr[i2];
        int i5 = i2 + 2;
        this.zzf = i5;
        long j3 = bArr[i3];
        int i7 = i2 + 3;
        this.zzf = i7;
        long j4 = bArr[i5];
        this.zzf = i2 + 4;
        return ((((long) bArr[i7]) & 255) << 24) | (255 & j2) | ((j3 & 255) << 8) | ((j4 & 255) << 16);
    }

    public final int zzB() {
        zzW(4);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        int i7 = i2 + 2;
        this.zzf = i7;
        int i8 = bArr[i3] & UByte.MAX_VALUE;
        int i9 = i2 + 3;
        this.zzf = i9;
        int i10 = bArr[i7] & UByte.MAX_VALUE;
        this.zzf = i2 + 4;
        return (bArr[i9] & UByte.MAX_VALUE) | (i5 << 24) | (i8 << 16) | (i10 << 8);
    }

    public final int zzC() {
        zzW(4);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        int i7 = i2 + 2;
        this.zzf = i7;
        int i8 = bArr[i3] & UByte.MAX_VALUE;
        int i9 = i2 + 3;
        this.zzf = i9;
        int i10 = bArr[i7] & UByte.MAX_VALUE;
        this.zzf = i2 + 4;
        return ((bArr[i9] & UByte.MAX_VALUE) << 24) | (i8 << 8) | i5 | (i10 << 16);
    }

    public final int zzF() {
        zzW(4);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        this.zzf = i2 + 2;
        int i7 = bArr[i3] & UByte.MAX_VALUE;
        this.zzf = i2 + 4;
        return (i5 << 8) | i7;
    }

    public final long zzO() {
        int i2;
        zzW(1);
        long j2 = this.zze[this.zzf];
        int i3 = 7;
        while (true) {
            i2 = 0;
            if (i3 < 0) {
                break;
            }
            int i5 = 1 << i3;
            if ((((long) i5) & j2) != 0) {
                i3--;
            } else if (i3 < 6) {
                j2 &= (long) (i5 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 35);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j2);
            throw new NumberFormatException(sb.toString());
        }
        zzW(i2);
        for (int i7 = 1; i7 < i2; i7++) {
            byte b2 = this.zze[this.zzf + i7];
            if ((b2 & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 42);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j2);
                throw new NumberFormatException(sb2.toString());
            }
            j2 = (j2 << 6) | ((long) (b2 & 63));
        }
        this.zzf += i2;
        return j2;
    }

    public final long zzP() {
        long j2 = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            if (this.zzf == this.zzg) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZzs = zzs();
            j2 |= (127 & jZzs) << (i2 * 7);
            if ((jZzs & 128) == 0) {
                return j2;
            }
        }
        return j2;
    }

    public final void zzb(byte[] bArr, int i2) {
        this.zze = bArr;
        this.zzg = i2;
        this.zzf = 0;
    }

    public final int zze() {
        return this.zzg;
    }

    public final void zzf(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= this.zze.length) {
            z2 = true;
        }
        zzgrc.zza(z2);
        this.zzg = i2;
    }

    public final int zzg() {
        return this.zzf;
    }

    public final void zzh(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= this.zzg) {
            z2 = true;
        }
        zzgrc.zza(z2);
        this.zzf = i2;
    }

    public final byte[] zzi() {
        return this.zze;
    }

    public final int zzn() {
        zzW(1);
        return this.zze[this.zzf] & UByte.MAX_VALUE;
    }

    public final int zzs() {
        zzW(1);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        this.zzf = i2 + 1;
        return bArr[i2] & UByte.MAX_VALUE;
    }

    public final int zzt() {
        zzW(2);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        this.zzf = i2 + 2;
        return (bArr[i3] & UByte.MAX_VALUE) | (i5 << 8);
    }

    public final int zzu() {
        zzW(2);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        this.zzf = i2 + 2;
        return ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
    }

    public final short zzv() {
        zzW(2);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        this.zzf = i2 + 2;
        return (short) ((bArr[i3] & UByte.MAX_VALUE) | (i5 << 8));
    }

    public final short zzw() {
        zzW(2);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        this.zzf = i2 + 2;
        return (short) (((bArr[i3] & UByte.MAX_VALUE) << 8) | i5);
    }

    public final int zzx() {
        zzW(3);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        int i7 = i2 + 2;
        this.zzf = i7;
        int i8 = bArr[i3] & UByte.MAX_VALUE;
        this.zzf = i2 + 3;
        return (bArr[i7] & UByte.MAX_VALUE) | (i5 << 16) | (i8 << 8);
    }

    public final int zzy() {
        zzW(3);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        int i7 = i2 + 2;
        this.zzf = i7;
        int i8 = bArr[i3] & UByte.MAX_VALUE;
        this.zzf = i2 + 3;
        return (bArr[i7] & UByte.MAX_VALUE) | ((i5 << 24) >> 8) | (i8 << 8);
    }

    public final long zzz() {
        zzW(4);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        long j2 = bArr[i2];
        int i5 = i2 + 2;
        this.zzf = i5;
        long j3 = bArr[i3];
        int i7 = i2 + 3;
        this.zzf = i7;
        long j4 = bArr[i5];
        this.zzf = i2 + 4;
        return (((long) bArr[i7]) & 255) | ((j2 & 255) << 24) | ((j3 & 255) << 16) | ((j4 & 255) << 8);
    }

    public zzer() {
        this.zze = zzfj.zzb;
    }

    private final int zzU(Charset charset) {
        int codePoint;
        int i2;
        int iN;
        zzgrc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() < zzV(charset)) {
            int i3 = this.zzf;
            int i5 = this.zzg;
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 17 + String.valueOf(i5).length());
            sb.append("position=");
            sb.append(i3);
            sb.append(", limit=");
            sb.append(i5);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i7 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b2 = this.zze[this.zzf];
            if ((b2 & ByteCompanionObject.MIN_VALUE) == 0) {
                codePoint = androidx.media3.container.j.n(b2);
                return (codePoint << 8) | i7;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b4 = this.zze[this.zzf];
            if ((b4 & ByteCompanionObject.MIN_VALUE) == 0) {
                i2 = 1;
            } else if ((b4 & 224) == 192 && zzd() >= 2 && zzX(this.zze[this.zzf + 1])) {
                i2 = 2;
            } else {
                if ((this.zze[this.zzf] & 240) == 224 && zzd() >= 3) {
                    byte[] bArr = this.zze;
                    int i8 = this.zzf;
                    if (zzX(bArr[i8 + 1]) && zzX(bArr[i8 + 2])) {
                        i2 = 3;
                    }
                }
                if ((this.zze[this.zzf] & 248) == 240 && zzd() >= 4) {
                    byte[] bArr2 = this.zze;
                    int i9 = this.zzf;
                    if (zzX(bArr2[i9 + 1]) && zzX(bArr2[i9 + 2]) && zzX(bArr2[i9 + 3])) {
                        i2 = 4;
                    }
                }
                i2 = 0;
            }
            if (i2 == 1) {
                iN = androidx.media3.container.j.n(this.zze[this.zzf]);
            } else if (i2 == 2) {
                byte[] bArr3 = this.zze;
                int i10 = this.zzf;
                iN = zzY(0, 0, bArr3[i10], bArr3[i10 + 1]);
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        byte[] bArr4 = this.zze;
                        int i11 = this.zzf;
                        iN = zzY(bArr4[i11], bArr4[i11 + 1], bArr4[i11 + 2], bArr4[i11 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.zze;
                int i12 = this.zzf;
                iN = zzY(0, bArr5[i12] & 15, bArr5[i12 + 1], bArr5[i12 + 2]);
            }
            i7 = i2;
            codePoint = iN;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cZzS = zzS(byteOrder, 0);
            if (!Character.isHighSurrogate(cZzS) || zzd() < 4) {
                codePoint = cZzS;
                i7 = 2;
            } else {
                codePoint = Character.toCodePoint(cZzS, zzS(byteOrder, 2));
                i7 = 4;
            }
        }
        return (codePoint << 8) | i7;
    }

    private static int zzV(Charset charset) {
        zzgrc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final void zzW(int i2) {
        if (!zzd.get() || zzd() >= i2) {
            return;
        }
        int iZzd = zzd();
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 25 + String.valueOf(iZzd).length());
        sb.append("bytesNeeded= ");
        sb.append(i2);
        sb.append(", bytesLeft=");
        sb.append(iZzd);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    private static int zzY(int i2, int i3, int i5, int i7) {
        return zzgxz.zze((byte) 0, zzgyd.zza(((i2 & 7) << 2) | ((i3 & 48) >> 4)), zzgyd.zza(((i5 & 60) >> 2) | ((i3 & 15) << 4)), zzgyd.zza((i7 & 63) | ((i5 & 3) << 6)));
    }

    public final long zzD() {
        zzW(8);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        long j2 = bArr[i2];
        int i5 = i2 + 2;
        this.zzf = i5;
        long j3 = bArr[i3];
        int i7 = i2 + 3;
        this.zzf = i7;
        long j4 = bArr[i5];
        int i8 = i2 + 4;
        this.zzf = i8;
        long j5 = bArr[i7];
        int i9 = i2 + 5;
        this.zzf = i9;
        long j6 = bArr[i8];
        int i10 = i2 + 6;
        this.zzf = i10;
        long j7 = bArr[i9];
        int i11 = i2 + 7;
        this.zzf = i11;
        long j9 = bArr[i10];
        this.zzf = i2 + 8;
        return ((j9 & 255) << 8) | ((j2 & 255) << 56) | ((j3 & 255) << 48) | ((j4 & 255) << 40) | ((j5 & 255) << 32) | ((j6 & 255) << 24) | ((j7 & 255) << 16) | (((long) bArr[i11]) & 255);
    }

    public final long zzE() {
        zzW(8);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        int i3 = i2 + 1;
        this.zzf = i3;
        long j2 = bArr[i2];
        int i5 = i2 + 2;
        this.zzf = i5;
        long j3 = bArr[i3];
        int i7 = i2 + 3;
        this.zzf = i7;
        long j4 = bArr[i5];
        int i8 = i2 + 4;
        this.zzf = i8;
        long j5 = bArr[i7];
        int i9 = i2 + 5;
        this.zzf = i9;
        long j6 = bArr[i8];
        int i10 = i2 + 6;
        this.zzf = i10;
        long j7 = bArr[i9];
        int i11 = i2 + 7;
        this.zzf = i11;
        long j9 = bArr[i10];
        this.zzf = i2 + 8;
        return ((j9 & 255) << 48) | (j2 & 255) | ((j3 & 255) << 8) | ((j4 & 255) << 16) | ((j5 & 255) << 24) | ((j6 & 255) << 32) | ((j7 & 255) << 40) | ((((long) bArr[i11]) & 255) << 56);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzN(Charset charset) {
        zzgrc.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            zzR();
        }
        int i2 = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i2 = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i3 = this.zzf;
        while (true) {
            int i5 = this.zzg;
            if (i3 >= i5 - (i2 - 1)) {
                i3 = i5;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && zzfj.zzk(this.zze[i3])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.zze;
                if (bArr[i3] == 0 && zzfj.zzk(bArr[i3 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.zze;
                    if (bArr2[i3 + 1] == 0 && zzfj.zzk(bArr2[i3])) {
                        break;
                    }
                }
                i3 += i2;
            }
        }
        String strZzK = zzK(i3 - this.zzf, charset);
        if (this.zzf != this.zzg && zzT(charset, zza) == '\r') {
            zzT(charset, zzb);
        }
        return strZzK;
    }

    public final void zza(int i2) {
        byte[] bArr = this.zze;
        if (bArr.length < i2) {
            bArr = new byte[i2];
        }
        zzb(bArr, i2);
    }

    public final void zzc(int i2) {
        byte[] bArr = this.zze;
        if (i2 > bArr.length) {
            this.zze = Arrays.copyOf(bArr, i2);
        }
    }

    public final int zzd() {
        return Math.max(this.zzg - this.zzf, 0);
    }

    public final int zzj() {
        return this.zze.length;
    }

    public final void zzk(int i2) {
        zzh(this.zzf + i2);
    }

    public final void zzl(zzeq zzeqVar, int i2) {
        zzm(zzeqVar.zza, 0, i2);
        zzeqVar.zzf(0);
    }

    public final char zzo() {
        return zzS(ByteOrder.BIG_ENDIAN, 0);
    }

    public zzer(int i2) {
        this.zze = new byte[i2];
        this.zzg = i2;
    }

    private final char zzT(Charset charset, char[] cArr) {
        int iZzU;
        boolean z2;
        if (zzd() >= zzV(charset) && (iZzU = zzU(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c2 = (char) j2;
                if (c2 == j2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzgrc.zze(z2, "Out of range: %s", j2);
                for (char c4 : cArr) {
                    if (c4 == c2) {
                        this.zzf += zzgxz.zza(iZzU & 255);
                        return c2;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int zzG() {
        return (zzs() << 21) | (zzs() << 14) | (zzs() << 7) | zzs();
    }

    public final int zzH() {
        int iZzB = zzB();
        if (iZzB >= 0) {
            return iZzB;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(iZzB);
        throw new IllegalStateException(sb.toString());
    }

    public final int zzI() {
        int iZzC = zzC();
        if (iZzC >= 0) {
            return iZzC;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iZzC).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(iZzC);
        throw new IllegalStateException(sb.toString());
    }

    public final long zzJ() {
        long jZzD = zzD();
        if (jZzD >= 0) {
            return jZzD;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(jZzD).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(jZzD);
        throw new IllegalStateException(sb.toString());
    }

    public final String zzK(int i2, Charset charset) {
        zzW(i2);
        byte[] bArr = this.zze;
        int i3 = this.zzf;
        String str = new String(bArr, i3, i2, charset);
        this.zzf = i3 + i2;
        return str;
    }

    public final String zzL(int i2) {
        int i3;
        zzW(i2);
        if (i2 == 0) {
            return "";
        }
        int i5 = this.zzf;
        int i7 = (i5 + i2) - 1;
        if (i7 < this.zzg && this.zze[i7] == 0) {
            i3 = i2 - 1;
        } else {
            i3 = i2;
        }
        String strZzj = zzfj.zzj(this.zze, i5, i3);
        this.zzf += i2;
        return strZzj;
    }

    @Nullable
    public final String zzM(char c2) {
        if (zzd() == 0) {
            return null;
        }
        int i2 = this.zzf;
        while (i2 < this.zzg && this.zze[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.zze;
        int i3 = this.zzf;
        String strZzj = zzfj.zzj(bArr, i3, i2 - i3);
        this.zzf = i2;
        if (i2 < this.zzg) {
            this.zzf = i2 + 1;
        }
        return strZzj;
    }

    public final void zzQ() {
        while ((zzs() & 128) != 0) {
        }
    }

    @Nullable
    public final Charset zzR() {
        if (zzd() >= 3) {
            byte[] bArr = this.zze;
            int i2 = this.zzf;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.zzf = i2 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (zzd() >= 2) {
            byte[] bArr2 = this.zze;
            int i3 = this.zzf;
            byte b2 = bArr2[i3];
            if (b2 == -2) {
                if (bArr2[i3 + 1] == -1) {
                    this.zzf = i3 + 2;
                    return StandardCharsets.UTF_16BE;
                }
                return null;
            }
            if (b2 == -1 && bArr2[i3 + 1] == -2) {
                this.zzf = i3 + 2;
                return StandardCharsets.UTF_16LE;
            }
            return null;
        }
        return null;
    }

    public final void zzm(byte[] bArr, int i2, int i3) {
        zzW(i3);
        System.arraycopy(this.zze, this.zzf, bArr, i2, i3);
        this.zzf += i3;
    }

    public final int zzp(Charset charset) {
        if (zzU(charset) != 0) {
            return zzgxz.zza(r3 >>> 8);
        }
        return 1114112;
    }

    public final int zzq() {
        if (zzd() >= 3) {
            this.zzf -= 3;
            return zzx();
        }
        int i2 = this.zzf;
        int i3 = this.zzg;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 17 + String.valueOf(i3).length());
        sb.append("position=");
        sb.append(i2);
        sb.append(", limit=");
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int zzr() {
        if (zzd() >= 4) {
            this.zzf -= 4;
            return zzB();
        }
        int i2 = this.zzf;
        int i3 = this.zzg;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 17 + String.valueOf(i3).length());
        sb.append("position=");
        sb.append(i2);
        sb.append(", limit=");
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public zzer(byte[] bArr) {
        this.zze = bArr;
        this.zzg = bArr.length;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zziap extends zziaq {
    private final InputStream zzf;
    private final byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    /* synthetic */ zziap(InputStream inputStream, int i2, byte[] bArr) {
        super(null);
        this.zzm = Integer.MAX_VALUE;
        byte[] bArr2 = zzice.zzb;
        this.zzf = inputStream;
        this.zzg = new byte[4096];
        this.zzh = 0;
        this.zzj = 0;
        this.zzl = 0;
    }

    private final void zzN() {
        int i2 = this.zzh + this.zzi;
        this.zzh = i2;
        int i3 = this.zzl + i2;
        int i5 = this.zzm;
        if (i3 <= i5) {
            this.zzi = 0;
            return;
        }
        int i7 = i3 - i5;
        this.zzi = i7;
        this.zzh = i2 - i7;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzC() {
        return this.zzl + this.zzj;
    }

    final long zzw() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte bZzD = zzD();
            j2 |= ((long) (bZzD & ByteCompanionObject.MAX_VALUE)) << i2;
            if ((bZzD & ByteCompanionObject.MIN_VALUE) == 0) {
                return j2;
            }
        }
        throw new zzicg("CodedInputStream encountered a malformed varint.");
    }

    private final boolean zzP(int i2) throws IOException {
        int i3 = this.zzj;
        int i5 = i3 + i2;
        int i7 = this.zzh;
        if (i5 <= i7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 66);
            sb.append("refillBuffer() called when ");
            sb.append(i2);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i8 = this.zzl;
        if (i2 > (Integer.MAX_VALUE - i8) - i3 || i8 + i3 + i2 > this.zzm) {
            return false;
        }
        if (i3 > 0) {
            if (i7 > i3) {
                byte[] bArr = this.zzg;
                System.arraycopy(bArr, i3, bArr, 0, i7 - i3);
            }
            i8 = this.zzl + i3;
            this.zzl = i8;
            i7 = this.zzh - i3;
            this.zzh = i7;
            this.zzj = 0;
        }
        try {
            int i9 = this.zzf.read(this.zzg, i7, Math.min(4096 - i7, (Integer.MAX_VALUE - i8) - i7));
            if (i9 != 0 && i9 >= -1 && i9 <= 4096) {
                if (i9 <= 0) {
                    return false;
                }
                this.zzh += i9;
                zzN();
                return this.zzh >= i2 || zzP(i2);
            }
            String strValueOf = String.valueOf(this.zzf.getClass());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 39 + String.valueOf(i9).length() + 41);
            sb2.append(strValueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(i9);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        } catch (zzicg e2) {
            e2.zza();
            throw e2;
        }
    }

    private final byte[] zzR(int i2) throws IOException {
        if (i2 == 0) {
            return zzice.zzb;
        }
        int i3 = this.zzl;
        int i5 = this.zzj;
        int i7 = i3 + i5 + i2;
        if ((-2147483647) + i7 > 0) {
            throw new zzicg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i8 = this.zzm;
        if (i7 > i8) {
            zzE((i8 - i3) - i5);
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i9 = this.zzh - i5;
        int i10 = i2 - i9;
        if (i10 >= 4096) {
            try {
                if (i10 > this.zzf.available()) {
                    return null;
                }
            } catch (zzicg e2) {
                e2.zza();
                throw e2;
            }
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzg, this.zzj, bArr, 0, i9);
        this.zzl += this.zzh;
        this.zzj = 0;
        this.zzh = 0;
        while (i9 < i2) {
            try {
                int i11 = this.zzf.read(bArr, i9, i2 - i9);
                if (i11 == -1) {
                    throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += i11;
                i9 += i11;
            } catch (zzicg e3) {
                e3.zza();
                throw e3;
            }
        }
        return bArr;
    }

    private final List zzS(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(i2, 4096);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                int i5 = this.zzf.read(bArr, i3, iMin - i3);
                if (i5 == -1) {
                    throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += i5;
                i3 += i5;
            }
            i2 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final void zzA(int i2) {
        this.zzm = i2;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final boolean zzB() throws IOException {
        return this.zzj == this.zzh && !zzP(1);
    }

    public final byte zzD() throws IOException {
        if (this.zzj == this.zzh) {
            zzO(1);
        }
        byte[] bArr = this.zzg;
        int i2 = this.zzj;
        this.zzj = i2 + 1;
        return bArr[i2];
    }

    public final void zzE(int i2) throws IOException {
        int i3 = this.zzh;
        int i5 = this.zzj;
        int i7 = i3 - i5;
        if (i2 <= i7 && i2 >= 0) {
            this.zzj = i5 + i2;
            return;
        }
        if (i2 < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i8 = this.zzl;
        int i9 = i8 + i5;
        int i10 = this.zzm;
        if (i9 + i2 > i10) {
            zzE((i10 - i8) - i5);
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i9;
        this.zzh = 0;
        this.zzj = 0;
        while (i7 < i2) {
            try {
                long j2 = i2 - i7;
                try {
                    long jSkip = this.zzf.skip(j2);
                    if (jSkip < 0 || jSkip > j2) {
                        String strValueOf = String.valueOf(this.zzf.getClass());
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb.append(strValueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i7 += (int) jSkip;
                    }
                } catch (zzicg e2) {
                    e2.zza();
                    throw e2;
                }
            } catch (Throwable th) {
                this.zzl += i7;
                zzN();
                throw th;
            }
        }
        this.zzl += i7;
        zzN();
        if (i7 >= i2) {
            return;
        }
        int i11 = this.zzh;
        int i12 = i11 - this.zzj;
        this.zzj = i11;
        zzO(1);
        while (true) {
            int i13 = i2 - i12;
            int i14 = this.zzh;
            if (i13 <= i14) {
                this.zzj = i13;
                return;
            } else {
                i12 += i14;
                this.zzj = i14;
                zzO(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final void zzb(int i2) throws zzicg {
        if (this.zzk != i2) {
            throw new zzicg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final boolean zzc(int i2) throws IOException {
        int i3 = i2 & 7;
        int i5 = 0;
        if (i3 == 0) {
            if (this.zzh - this.zzj < 10) {
                while (i5 < 10) {
                    if (zzD() < 0) {
                        i5++;
                    }
                }
                throw new zzicg("CodedInputStream encountered a malformed varint.");
            }
            while (i5 < 10) {
                byte[] bArr = this.zzg;
                int i7 = this.zzj;
                this.zzj = i7 + 1;
                if (bArr[i7] < 0) {
                    i5++;
                }
            }
            throw new zzicg("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i3 == 1) {
            zzE(8);
            return true;
        }
        if (i3 == 2) {
            zzE(zzu());
            return true;
        }
        if (i3 == 3) {
            zzJ();
            zzb(((i2 >>> 3) << 3) | 4);
            return true;
        }
        if (i3 == 4) {
            zzI();
            return false;
        }
        if (i3 != 5) {
            throw new zzicf("Protocol message tag had invalid wire type.");
        }
        zzE(4);
        return true;
    }

    public final int zzu() throws IOException {
        int i2;
        int i3 = this.zzj;
        int i5 = this.zzh;
        if (i5 != i3) {
            byte[] bArr = this.zzg;
            int i7 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.zzj = i7;
                return b2;
            }
            if (i5 - i7 >= 9) {
                int i8 = i3 + 2;
                int i9 = (bArr[i7] << 7) ^ b2;
                if (i9 < 0) {
                    i2 = i9 ^ (-128);
                } else {
                    int i10 = i3 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        i2 = i11 ^ 16256;
                    } else {
                        int i12 = i3 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            i2 = (-2080896) ^ i13;
                        } else {
                            i10 = i3 + 5;
                            byte b4 = bArr[i12];
                            int i14 = (i13 ^ (b4 << 28)) ^ 266354560;
                            if (b4 < 0) {
                                i12 = i3 + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i3 + 7;
                                    if (bArr[i12] < 0) {
                                        i12 = i3 + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i3 + 9;
                                            if (bArr[i12] < 0) {
                                                int i15 = i3 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i8 = i15;
                                                    i2 = i14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i14;
                            }
                            i2 = i14;
                        }
                        i8 = i12;
                    }
                    i8 = i10;
                }
                this.zzj = i8;
                return i2;
            }
        }
        return (int) zzw();
    }

    public final long zzv() throws IOException {
        long j2;
        long j3;
        long j4;
        int i2 = this.zzj;
        int i3 = this.zzh;
        if (i3 != i2) {
            byte[] bArr = this.zzg;
            int i5 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.zzj = i5;
                return b2;
            }
            if (i3 - i5 >= 9) {
                int i7 = i2 + 2;
                int i8 = (bArr[i5] << 7) ^ b2;
                if (i8 < 0) {
                    j2 = i8 ^ (-128);
                } else {
                    int i9 = i2 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        j2 = i10 ^ 16256;
                    } else {
                        int i11 = i2 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            long j5 = (-2080896) ^ i12;
                            i7 = i11;
                            j2 = j5;
                        } else {
                            i9 = i2 + 5;
                            long j6 = (((long) bArr[i11]) << 28) ^ ((long) i12);
                            if (j6 >= 0) {
                                j2 = j6 ^ 266354560;
                            } else {
                                i7 = i2 + 6;
                                long j7 = (((long) bArr[i9]) << 35) ^ j6;
                                if (j7 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    int i13 = i2 + 7;
                                    long j9 = j7 ^ (((long) bArr[i7]) << 42);
                                    if (j9 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i7 = i2 + 8;
                                        j7 = j9 ^ (((long) bArr[i13]) << 49);
                                        if (j7 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i13 = i2 + 9;
                                            j9 = j7 ^ (((long) bArr[i7]) << 56);
                                            if (j9 >= 0) {
                                                j3 = 71499008037633920L;
                                            } else {
                                                i7 = i2 + 10;
                                                long j10 = j9 ^ (((long) bArr[i13]) << 63);
                                                if (j10 >= 0) {
                                                    j2 = j10 ^ (-9151873028817141888L);
                                                }
                                            }
                                        }
                                    }
                                    j2 = j9 ^ j3;
                                    i7 = i13;
                                }
                                j2 = j7 ^ j4;
                            }
                        }
                    }
                    i7 = i9;
                }
                this.zzj = i7;
                return j2;
            }
        }
        return zzw();
    }

    public final int zzx() throws IOException {
        int i2 = this.zzj;
        if (this.zzh - i2 < 4) {
            zzO(4);
            i2 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i2 + 4;
        int i3 = bArr[i2] & UByte.MAX_VALUE;
        int i5 = bArr[i2 + 1] & UByte.MAX_VALUE;
        int i7 = bArr[i2 + 2] & UByte.MAX_VALUE;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    public final long zzy() throws IOException {
        int i2 = this.zzj;
        if (this.zzh - i2 < 8) {
            zzO(8);
            i2 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i2 + 8;
        long j2 = bArr[i2];
        long j3 = (((long) bArr[i2 + 1]) & 255) << 8;
        long j4 = bArr[i2 + 2];
        long j5 = bArr[i2 + 3];
        return ((((long) bArr[i2 + 6]) & 255) << 48) | (j2 & 255) | j3 | ((j4 & 255) << 16) | ((j5 & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzz(int i2) throws zzicg {
        if (i2 < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = i2 + this.zzl + this.zzj;
        if (i3 < 0) {
            throw new zzicg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.zzm;
        if (i3 > i5) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = i3;
        zzN();
        return i5;
    }

    private final void zzO(int i2) throws IOException {
        if (!zzP(i2)) {
            if (i2 > (Integer.MAX_VALUE - this.zzl) - this.zzj) {
                throw new zzicg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final byte[] zzQ(int i2, boolean z2) throws IOException {
        byte[] bArrZzR = zzR(i2);
        if (bArrZzR != null) {
            return bArrZzR;
        }
        int i3 = this.zzj;
        int i5 = this.zzh;
        int i7 = i5 - i3;
        this.zzl += i5;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> listZzS = zzS(i2 - i7);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzg, i3, bArr, 0, i7);
        for (byte[] bArr2 : listZzS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i7, length);
            i7 += length;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzk = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzk = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzicg("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzg() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzh() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final boolean zzk() throws IOException {
        if (zzv() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final String zzl() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i2 = this.zzh;
            int i3 = this.zzj;
            if (iZzu <= i2 - i3) {
                String str = new String(this.zzg, i3, iZzu, zzice.zza);
                this.zzj += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu >= 0) {
            if (iZzu <= this.zzh) {
                zzO(iZzu);
                String str2 = new String(this.zzg, this.zzj, iZzu, zzice.zza);
                this.zzj += iZzu;
                return str2;
            }
            return new String(zzQ(iZzu, false), zzice.zza);
        }
        throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final String zzm() throws IOException {
        byte[] bArrZzQ;
        int iZzu = zzu();
        int i2 = this.zzj;
        int i3 = this.zzh;
        if (iZzu <= i3 - i2 && iZzu > 0) {
            bArrZzQ = this.zzg;
            this.zzj = i2 + iZzu;
        } else {
            if (iZzu == 0) {
                return "";
            }
            if (iZzu >= 0) {
                i2 = 0;
                if (iZzu <= i3) {
                    zzO(iZzu);
                    bArrZzQ = this.zzg;
                    this.zzj = iZzu;
                } else {
                    bArrZzQ = zzQ(iZzu, false);
                }
            } else {
                throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        return zzier.zze(bArrZzQ, i2, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final zzian zzn() throws IOException {
        int iZzu = zzu();
        int i2 = this.zzh;
        int i3 = this.zzj;
        if (iZzu <= i2 - i3 && iZzu > 0) {
            zzian zzianVarZzt = zzian.zzt(this.zzg, i3, iZzu, false);
            this.zzj += iZzu;
            return zzianVarZzt;
        }
        if (iZzu == 0) {
            return zzian.zza;
        }
        if (iZzu >= 0) {
            byte[] bArrZzR = zzR(iZzu);
            if (bArrZzR != null) {
                return zzian.zzt(bArrZzR, 0, bArrZzR.length, false);
            }
            int i5 = this.zzj;
            int i7 = this.zzh;
            int i8 = i7 - i5;
            this.zzl += i7;
            this.zzj = 0;
            this.zzh = 0;
            List<byte[]> listZzS = zzS(iZzu - i8);
            byte[] bArr = new byte[iZzu];
            System.arraycopy(this.zzg, i5, bArr, 0, i8);
            for (byte[] bArr2 : listZzS) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i8, length);
                i8 += length;
            }
            return zzian.zzu(bArr);
        }
        throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzp() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzr() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzs() throws IOException {
        return zziaq.zzK(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzt() throws IOException {
        return zziaq.zzL(zzv());
    }
}

package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzlg extends zzli {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzlg(InputStream inputStream, int i2, zzlh zzlhVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        byte[] bArr = zznl.zzb;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final void zzK() {
        int i2 = this.zzg + this.zzh;
        this.zzg = i2;
        int i3 = this.zzk + i2;
        int i5 = this.zzl;
        if (i3 <= i5) {
            this.zzh = 0;
            return;
        }
        int i7 = i3 - i5;
        this.zzh = i7;
        this.zzg = i2 - i7;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzd() {
        return this.zzk + this.zzi;
    }

    final long zzs() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte bZza = zza();
            j2 |= ((long) (bZza & ByteCompanionObject.MAX_VALUE)) << i2;
            if ((bZza & ByteCompanionObject.MIN_VALUE) == 0) {
                return j2;
            }
        }
        throw new zznn("CodedInputStream encountered a malformed varint.");
    }

    private final List zzJ(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(i2, 4096);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                int i5 = this.zze.read(bArr, i3, iMin - i3);
                if (i5 == -1) {
                    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i5;
                i3 += i5;
            }
            i2 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final boolean zzM(int i2) throws IOException {
        int i3 = this.zzi;
        int i5 = i3 + i2;
        int i7 = this.zzg;
        if (i5 <= i7) {
            throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
        }
        int i8 = this.zzk;
        if (i2 > (Integer.MAX_VALUE - i8) - i3 || i8 + i3 + i2 > this.zzl) {
            return false;
        }
        if (i3 > 0) {
            if (i7 > i3) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i3, bArr, 0, i7 - i3);
            }
            i8 = this.zzk + i3;
            this.zzk = i8;
            i7 = this.zzg - i3;
            this.zzg = i7;
            this.zzi = 0;
        }
        try {
            int i9 = this.zze.read(this.zzf, i7, Math.min(4096 - i7, (Integer.MAX_VALUE - i8) - i7));
            if (i9 == 0 || i9 < -1 || i9 > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + i9 + "\nThe InputStream implementation is buggy.");
            }
            if (i9 <= 0) {
                return false;
            }
            this.zzg += i9;
            zzK();
            if (this.zzg >= i2) {
                return true;
            }
            return zzM(i2);
        } catch (zznn e2) {
            e2.zza();
            throw e2;
        }
    }

    private final byte[] zzO(int i2) throws IOException {
        if (i2 == 0) {
            return zznl.zzb;
        }
        int i3 = this.zzk;
        int i5 = this.zzi;
        int i7 = i3 + i5 + i2;
        if ((-2147483647) + i7 > 0) {
            throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i8 = this.zzl;
        if (i7 > i8) {
            zzB((i8 - i3) - i5);
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i9 = this.zzg - i5;
        int i10 = i2 - i9;
        if (i10 >= 4096) {
            try {
                if (i10 > this.zze.available()) {
                    return null;
                }
            } catch (zznn e2) {
                e2.zza();
                throw e2;
            }
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i9);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i9 < i2) {
            try {
                int i11 = this.zze.read(bArr, i9, i2 - i9);
                if (i11 == -1) {
                    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i11;
                i9 += i11;
            } catch (zznn e3) {
                e3.zza();
                throw e3;
            }
        }
        return bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzA(int i2) {
        this.zzl = i2;
        zzK();
    }

    public final void zzB(int i2) throws IOException {
        int i3 = this.zzg;
        int i5 = this.zzi;
        int i7 = i3 - i5;
        if (i2 <= i7 && i2 >= 0) {
            this.zzi = i5 + i2;
            return;
        }
        if (i2 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i8 = this.zzk;
        int i9 = i8 + i5;
        int i10 = this.zzl;
        if (i9 + i2 > i10) {
            zzB((i10 - i8) - i5);
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i9;
        this.zzg = 0;
        this.zzi = 0;
        while (i7 < i2) {
            try {
                long j2 = i2 - i7;
                try {
                    long jSkip = this.zze.skip(j2);
                    if (jSkip < 0 || jSkip > j2) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i7 += (int) jSkip;
                    }
                } catch (zznn e2) {
                    e2.zza();
                    throw e2;
                }
            } catch (Throwable th) {
                this.zzk += i7;
                zzK();
                throw th;
            }
        }
        this.zzk += i7;
        zzK();
        if (i7 >= i2) {
            return;
        }
        int i11 = this.zzg;
        int i12 = i11 - this.zzi;
        this.zzi = i11;
        zzL(1);
        while (true) {
            int i13 = i2 - i12;
            int i14 = this.zzg;
            if (i13 <= i14) {
                this.zzi = i13;
                return;
            } else {
                i12 += i14;
                this.zzi = i14;
                zzL(1);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzC() throws IOException {
        return this.zzi == this.zzg && !zzM(1);
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzE(int i2) throws IOException {
        int i3 = i2 & 7;
        int i5 = 0;
        if (i3 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i5 < 10) {
                    if (zza() < 0) {
                        i5++;
                    }
                }
                throw new zznn("CodedInputStream encountered a malformed varint.");
            }
            while (i5 < 10) {
                byte[] bArr = this.zzf;
                int i7 = this.zzi;
                this.zzi = i7 + 1;
                if (bArr[i7] < 0) {
                    i5++;
                }
            }
            throw new zznn("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i3 == 1) {
            zzB(8);
            return true;
        }
        if (i3 == 2) {
            zzB(zzj());
            return true;
        }
        if (i3 == 3) {
            zzI();
            zzz(((i2 >>> 3) << 3) | 4);
            return true;
        }
        if (i3 == 4) {
            return false;
        }
        if (i3 != 5) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
        zzB(4);
        return true;
    }

    public final byte zza() throws IOException {
        if (this.zzi == this.zzg) {
            zzL(1);
        }
        byte[] bArr = this.zzf;
        int i2 = this.zzi;
        this.zzi = i2 + 1;
        return bArr[i2];
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zze(int i2) throws zznn {
        if (i2 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = i2 + this.zzk + this.zzi;
        if (i3 < 0) {
            throw new zznn("Failed to parse the message.");
        }
        int i5 = this.zzl;
        if (i3 > i5) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i3;
        zzK();
        return i5;
    }

    public final int zzi() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 4) {
            zzL(4);
            i2 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 4;
        int i3 = bArr[i2] & UByte.MAX_VALUE;
        int i5 = bArr[i2 + 1] & UByte.MAX_VALUE;
        int i7 = bArr[i2 + 2] & UByte.MAX_VALUE;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    public final int zzj() throws IOException {
        int i2;
        int i3 = this.zzi;
        int i5 = this.zzg;
        if (i5 != i3) {
            byte[] bArr = this.zzf;
            int i7 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.zzi = i7;
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
                this.zzi = i8;
                return i2;
            }
        }
        return (int) zzs();
    }

    public final long zzq() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 8) {
            zzL(8);
            i2 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 8;
        long j2 = bArr[i2];
        long j3 = (((long) bArr[i2 + 1]) & 255) << 8;
        long j4 = bArr[i2 + 2];
        long j5 = bArr[i2 + 3];
        return ((((long) bArr[i2 + 6]) & 255) << 48) | (j2 & 255) | j3 | ((j4 & 255) << 16) | ((j5 & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    public final long zzr() throws IOException {
        long j2;
        long j3;
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            byte[] bArr = this.zzf;
            int i5 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.zzi = i5;
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
                            long j4 = (-2080896) ^ i12;
                            i7 = i11;
                            j2 = j4;
                        } else {
                            i9 = i2 + 5;
                            long j5 = (((long) bArr[i11]) << 28) ^ ((long) i12);
                            if (j5 >= 0) {
                                j2 = j5 ^ 266354560;
                            } else {
                                i7 = i2 + 6;
                                long j6 = (((long) bArr[i9]) << 35) ^ j5;
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    int i13 = i2 + 7;
                                    long j7 = j6 ^ (((long) bArr[i7]) << 42);
                                    if (j7 >= 0) {
                                        j2 = j7 ^ 4363953127296L;
                                    } else {
                                        i7 = i2 + 8;
                                        j6 = j7 ^ (((long) bArr[i13]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i13 = i2 + 9;
                                            long j9 = (j6 ^ (((long) bArr[i7]) << 56)) ^ 71499008037633920L;
                                            if (j9 < 0) {
                                                i7 = i2 + 10;
                                                if (bArr[i13] >= 0) {
                                                    j2 = j9;
                                                }
                                            } else {
                                                j2 = j9;
                                            }
                                        }
                                    }
                                    i7 = i13;
                                }
                                j2 = j6 ^ j3;
                            }
                        }
                    }
                    i7 = i9;
                }
                this.zzi = i7;
                return j2;
            }
        }
        return zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzz(int i2) throws zznn {
        if (this.zzj != i2) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
    }

    private final void zzL(int i2) throws IOException {
        if (!zzM(i2)) {
            if (i2 > (Integer.MAX_VALUE - this.zzk) - this.zzi) {
                throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final byte[] zzN(int i2, boolean z2) throws IOException {
        byte[] bArrZzO = zzO(i2);
        if (bArrZzO != null) {
            return bArrZzO;
        }
        int i3 = this.zzi;
        int i5 = this.zzg;
        int i7 = i5 - i3;
        this.zzk += i5;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzJ = zzJ(i2 - i7);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzf, i3, bArr, 0, i7);
        for (byte[] bArr2 : listZzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i7, length);
            i7 += length;
        }
        return bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzD() throws IOException {
        if (zzr() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzh() throws IOException {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzl() throws IOException {
        return zzli.zzF(zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzj = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw new zznn("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzp() throws IOException {
        return zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzu() throws IOException {
        return zzli.zzG(zzr());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final zzle zzw() throws IOException {
        int iZzj = zzj();
        int i2 = this.zzg;
        int i3 = this.zzi;
        if (iZzj <= i2 - i3 && iZzj > 0) {
            zzle zzleVarZzk = zzle.zzk(this.zzf, i3, iZzj);
            this.zzi += iZzj;
            return zzleVarZzk;
        }
        if (iZzj == 0) {
            return zzle.zzb;
        }
        if (iZzj >= 0) {
            byte[] bArrZzO = zzO(iZzj);
            if (bArrZzO != null) {
                return zzle.zzk(bArrZzO, 0, bArrZzO.length);
            }
            int i5 = this.zzi;
            int i7 = this.zzg;
            int i8 = i7 - i5;
            this.zzk += i7;
            this.zzi = 0;
            this.zzg = 0;
            List<byte[]> listZzJ = zzJ(iZzj - i8);
            byte[] bArr = new byte[iZzj];
            System.arraycopy(this.zzf, i5, bArr, 0, i8);
            for (byte[] bArr2 : listZzJ) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i8, length);
                i8 += length;
            }
            return new zzlc(bArr);
        }
        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (iZzj <= i2 - i3) {
                String str = new String(this.zzf, i3, iZzj, zznl.zza);
                this.zzi += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj >= 0) {
            if (iZzj <= this.zzg) {
                zzL(iZzj);
                String str2 = new String(this.zzf, this.zzi, iZzj, zznl.zza);
                this.zzi += iZzj;
                return str2;
            }
            return new String(zzN(iZzj, false), zznl.zza);
        }
        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzy() throws IOException {
        byte[] bArrZzN;
        int iZzj = zzj();
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (iZzj <= i3 - i2 && iZzj > 0) {
            bArrZzN = this.zzf;
            this.zzi = i2 + iZzj;
        } else {
            if (iZzj == 0) {
                return "";
            }
            if (iZzj >= 0) {
                i2 = 0;
                if (iZzj <= i3) {
                    zzL(iZzj);
                    bArrZzN = this.zzf;
                    this.zzi = iZzj;
                } else {
                    bArrZzN = zzN(iZzj, false);
                }
            } else {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        return zzpv.zzd(bArrZzN, i2, iZzj);
    }
}

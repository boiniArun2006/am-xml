package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zziao extends zziaq {
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zziao(byte[] bArr, int i2, int i3, boolean z2, byte[] bArr2) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zzf = bArr;
        this.zzg = i3 + i2;
        this.zzi = i2;
        this.zzj = i2;
    }

    private final void zzN() {
        int i2 = this.zzg + this.zzh;
        this.zzg = i2;
        int i3 = i2 - this.zzj;
        int i5 = this.zzl;
        if (i3 <= i5) {
            this.zzh = 0;
            return;
        }
        int i7 = i3 - i5;
        this.zzh = i7;
        this.zzg = i2 - i7;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final boolean zzB() throws IOException {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzC() {
        return this.zzi - this.zzj;
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

    @Override // com.google.android.gms.internal.ads.zziaq
    public final void zzA(int i2) {
        this.zzl = i2;
        zzN();
    }

    public final byte zzD() throws IOException {
        int i2 = this.zzi;
        if (i2 == this.zzg) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 1;
        return bArr[i2];
    }

    public final void zzE(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.zzg;
            int i5 = this.zzi;
            if (i2 <= i3 - i5) {
                this.zzi = i5 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
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
            if (this.zzg - this.zzi < 10) {
                while (i5 < 10) {
                    if (zzD() < 0) {
                        i5++;
                    }
                }
                throw new zzicg("CodedInputStream encountered a malformed varint.");
            }
            while (i5 < 10) {
                byte[] bArr = this.zzf;
                int i7 = this.zzi;
                this.zzi = i7 + 1;
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
        return (int) zzw();
    }

    public final long zzv() throws IOException {
        long j2;
        long j3;
        long j4;
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
                this.zzi = i7;
                return j2;
            }
        }
        return zzw();
    }

    public final int zzx() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 4) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 4;
        int i3 = bArr[i2] & UByte.MAX_VALUE;
        int i5 = bArr[i2 + 1] & UByte.MAX_VALUE;
        int i7 = bArr[i2 + 2] & UByte.MAX_VALUE;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    public final long zzy() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 8) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 8;
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
        int i3 = i2 + (this.zzi - this.zzj);
        if (i3 < 0) {
            throw new zzicg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.zzl;
        if (i3 > i5) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i3;
        zzN();
        return i5;
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
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (iZzu <= i2 - i3) {
                String str = new String(this.zzf, i3, iZzu, zzice.zza);
                this.zzi += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final String zzm() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (iZzu <= i2 - i3) {
                String strZze = zzier.zze(this.zzf, i3, iZzu);
                this.zzi += iZzu;
                return strZze;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu <= 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final zzian zzn() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (iZzu <= i2 - i3) {
                zzian zzianVarZzt = zzian.zzt(this.zzf, i3, iZzu, false);
                this.zzi += iZzu;
                return zzianVarZzt;
            }
        }
        if (iZzu == 0) {
            return zzian.zza;
        }
        if (iZzu > 0) {
            int i5 = this.zzg;
            int i7 = this.zzi;
            if (iZzu <= i5 - i7) {
                int i8 = iZzu + i7;
                this.zzi = i8;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(this.zzf, i7, i8);
                zzian zzianVar = zzian.zza;
                return new zzial(bArrCopyOfRange);
            }
        }
        if (iZzu <= 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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

package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzlf extends zzli {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    /* synthetic */ zzlf(byte[] bArr, int i2, int i3, boolean z2, zzlh zzlhVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzJ() {
        int i2 = this.zzf + this.zzg;
        this.zzf = i2;
        int i3 = this.zzj;
        if (i2 <= i3) {
            this.zzg = 0;
            return;
        }
        int i5 = i2 - i3;
        this.zzg = i5;
        this.zzf = i2 - i5;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzC() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzd() {
        return this.zzh;
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

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzA(int i2) {
        this.zzj = i2;
        zzJ();
    }

    public final void zzB(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.zzf;
            int i5 = this.zzh;
            if (i2 <= i3 - i5) {
                this.zzh = i5 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzE(int i2) throws IOException {
        int i3 = i2 & 7;
        int i5 = 0;
        if (i3 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i5 < 10) {
                    if (zza() < 0) {
                        i5++;
                    }
                }
                throw new zznn("CodedInputStream encountered a malformed varint.");
            }
            while (i5 < 10) {
                byte[] bArr = this.zze;
                int i7 = this.zzh;
                this.zzh = i7 + 1;
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
        int i2 = this.zzh;
        if (i2 == this.zzf) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 1;
        return bArr[i2];
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zze(int i2) throws zznn {
        if (i2 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = i2 + this.zzh;
        if (i3 < 0) {
            throw new zznn("Failed to parse the message.");
        }
        int i5 = this.zzj;
        if (i3 > i5) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = i3;
        zzJ();
        return i5;
    }

    public final int zzi() throws IOException {
        int i2 = this.zzh;
        if (this.zzf - i2 < 4) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 4;
        int i3 = bArr[i2] & UByte.MAX_VALUE;
        int i5 = bArr[i2 + 1] & UByte.MAX_VALUE;
        int i7 = bArr[i2 + 2] & UByte.MAX_VALUE;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    public final int zzj() throws IOException {
        int i2;
        int i3 = this.zzh;
        int i5 = this.zzf;
        if (i5 != i3) {
            byte[] bArr = this.zze;
            int i7 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.zzh = i7;
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
                this.zzh = i8;
                return i2;
            }
        }
        return (int) zzs();
    }

    public final long zzq() throws IOException {
        int i2 = this.zzh;
        if (this.zzf - i2 < 8) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 8;
        long j2 = bArr[i2];
        long j3 = (((long) bArr[i2 + 1]) & 255) << 8;
        long j4 = bArr[i2 + 2];
        long j5 = bArr[i2 + 3];
        return ((((long) bArr[i2 + 6]) & 255) << 48) | (j2 & 255) | j3 | ((j4 & 255) << 16) | ((j5 & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    public final long zzr() throws IOException {
        long j2;
        long j3;
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            byte[] bArr = this.zze;
            int i5 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.zzh = i5;
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
                this.zzh = i7;
                return j2;
            }
        }
        return zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzz(int i2) throws zznn {
        if (this.zzi != i2) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
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
            this.zzi = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzi = iZzj;
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
        if (iZzj > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (iZzj <= i2 - i3) {
                zzle zzleVarZzk = zzle.zzk(this.zze, i3, iZzj);
                this.zzh += iZzj;
                return zzleVarZzk;
            }
        }
        if (iZzj != 0) {
            if (iZzj > 0) {
                int i5 = this.zzf;
                int i7 = this.zzh;
                if (iZzj <= i5 - i7) {
                    int i8 = iZzj + i7;
                    this.zzh = i8;
                    return new zzlc(Arrays.copyOfRange(this.zze, i7, i8));
                }
            }
            if (iZzj <= 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        return zzle.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (iZzj <= i2 - i3) {
                String str = new String(this.zze, i3, iZzj, zznl.zza);
                this.zzh += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzy() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (iZzj <= i2 - i3) {
                String strZzd = zzpv.zzd(this.zze, i3, iZzj);
                this.zzh += iZzj;
                return strZzd;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

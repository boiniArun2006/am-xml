package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzaka extends zzakb {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzab());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzc() {
        return this.zzg - this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzd() throws IOException {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzf() throws IOException {
        return zzaa();
    }

    private zzaka(byte[] bArr, int i2, int i3, boolean z2) {
        super();
        this.zzj = Integer.MAX_VALUE;
        this.zzd = bArr;
        this.zze = i3 + i2;
        this.zzg = i2;
        this.zzh = i2;
    }

    private final int zzaa() throws IOException {
        int i2;
        int i3 = this.zzg;
        int i5 = this.zze;
        if (i5 != i3) {
            byte[] bArr = this.zzd;
            int i7 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.zzg = i7;
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
                this.zzg = i8;
                return i2;
            }
        }
        return (int) zzm();
    }

    private final long zzab() throws IOException {
        int i2 = this.zzg;
        if (this.zze - i2 < 8) {
            throw zzalf.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    private final long zzac() throws IOException {
        long j2;
        long j3;
        long j4;
        int i2 = this.zzg;
        int i3 = this.zze;
        if (i3 != i2) {
            byte[] bArr = this.zzd;
            int i5 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.zzg = i5;
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
                        i7 = i9;
                    } else {
                        int i11 = i2 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            long j5 = (-2080896) ^ i12;
                            i7 = i11;
                            j2 = j5;
                        } else {
                            long j6 = i12;
                            i7 = i2 + 5;
                            long j7 = j6 ^ (((long) bArr[i11]) << 28);
                            if (j7 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i13 = i2 + 6;
                                long j9 = j7 ^ (((long) bArr[i7]) << 35);
                                if (j9 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i2 + 7;
                                    j7 = j9 ^ (((long) bArr[i13]) << 42);
                                    if (j7 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i13 = i2 + 8;
                                        j9 = j7 ^ (((long) bArr[i7]) << 49);
                                        if (j9 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i2 + 9;
                                            long j10 = (j9 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                int i14 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i7 = i14;
                                                }
                                            }
                                            j2 = j10;
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
                this.zzg = i7;
                return j2;
            }
        }
        return zzm();
    }

    private final void zzad() {
        int i2 = this.zze + this.zzf;
        this.zze = i2;
        int i3 = i2 - this.zzh;
        int i5 = this.zzj;
        if (i3 <= i5) {
            this.zzf = 0;
            return;
        }
        int i7 = i3 - i5;
        this.zzf = i7;
        this.zze = i2 - i7;
    }

    private final void zzf(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.zze;
            int i5 = this.zzg;
            if (i2 <= i3 - i5) {
                this.zzg = i5 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw zzalf.zzj();
        }
        throw zzalf.zzf();
    }

    private final byte zzy() throws IOException {
        int i2 = this.zzg;
        if (i2 == this.zze) {
            throw zzalf.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i2 + 1;
        return bArr[i2];
    }

    private final int zzz() throws IOException {
        int i2 = this.zzg;
        if (this.zze - i2 < 4) {
            throw zzalf.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i2 + 4;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zza(int i2) throws zzalf {
        if (i2 < 0) {
            throw zzalf.zzf();
        }
        int iZzc = i2 + zzc();
        if (iZzc < 0) {
            throw zzalf.zzi();
        }
        int i3 = this.zzj;
        if (iZzc > i3) {
            throw zzalf.zzj();
        }
        this.zzj = iZzc;
        zzad();
        return i3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void zzb(int i2) throws zzalf {
        if (this.zzi != i2) {
            throw zzalf.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void zzc(int i2) {
        this.zzj = i2;
        zzad();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final boolean zzd(int i2) throws IOException {
        int i3 = i2 & 7;
        int i5 = 0;
        if (i3 == 0) {
            if (this.zze - this.zzg < 10) {
                while (i5 < 10) {
                    if (zzy() < 0) {
                        i5++;
                    }
                }
                throw zzalf.zze();
            }
            while (i5 < 10) {
                byte[] bArr = this.zzd;
                int i7 = this.zzg;
                this.zzg = i7 + 1;
                if (bArr[i7] < 0) {
                    i5++;
                }
            }
            throw zzalf.zze();
            return true;
        }
        if (i3 == 1) {
            zzf(8);
            return true;
        }
        if (i3 == 2) {
            zzf(zzaa());
            return true;
        }
        if (i3 == 3) {
            zzx();
            zzb(((i2 >>> 3) << 3) | 4);
            return true;
        }
        if (i3 == 4) {
            zzw();
            return false;
        }
        if (i3 != 5) {
            throw zzalf.zza();
        }
        zzf(4);
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    final long zzm() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte bZzy = zzy();
            j2 |= ((long) (bZzy & ByteCompanionObject.MAX_VALUE)) << i2;
            if ((bZzy & ByteCompanionObject.MIN_VALUE) == 0) {
                return j2;
            }
        }
        throw zzalf.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final boolean zzt() throws IOException {
        return this.zzg == this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zze() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzg() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzh() throws IOException {
        return zzakb.zze(zzaa());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzi() throws IOException {
        if (zzt()) {
            this.zzi = 0;
            return 0;
        }
        int iZzaa = zzaa();
        this.zzi = iZzaa;
        if ((iZzaa >>> 3) != 0) {
            return iZzaa;
        }
        throw zzalf.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzj() throws IOException {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzk() throws IOException {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzl() throws IOException {
        return zzac();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzn() throws IOException {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzo() throws IOException {
        return zzakb.zza(zzac());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzp() throws IOException {
        return zzac();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzajp zzq() throws IOException {
        byte[] bArrCopyOfRange;
        int iZzaa = zzaa();
        if (iZzaa > 0) {
            int i2 = this.zze;
            int i3 = this.zzg;
            if (iZzaa <= i2 - i3) {
                zzajp zzajpVarZza = zzajp.zza(this.zzd, i3, iZzaa);
                this.zzg += iZzaa;
                return zzajpVarZza;
            }
        }
        if (iZzaa == 0) {
            return zzajp.zza;
        }
        if (iZzaa > 0) {
            int i5 = this.zze;
            int i7 = this.zzg;
            if (iZzaa <= i5 - i7) {
                int i8 = iZzaa + i7;
                this.zzg = i8;
                bArrCopyOfRange = Arrays.copyOfRange(this.zzd, i7, i8);
            } else if (iZzaa <= 0) {
                if (iZzaa == 0) {
                    bArrCopyOfRange = zzalb.zzb;
                } else {
                    throw zzalf.zzf();
                }
            } else {
                throw zzalf.zzj();
            }
        }
        return zzajp.zzb(bArrCopyOfRange);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final String zzr() throws IOException {
        int iZzaa = zzaa();
        if (iZzaa > 0) {
            int i2 = this.zze;
            int i3 = this.zzg;
            if (iZzaa <= i2 - i3) {
                String str = new String(this.zzd, i3, iZzaa, zzalb.zza);
                this.zzg += iZzaa;
                return str;
            }
        }
        if (iZzaa == 0) {
            return "";
        }
        if (iZzaa < 0) {
            throw zzalf.zzf();
        }
        throw zzalf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final String zzs() throws IOException {
        int iZzaa = zzaa();
        if (iZzaa > 0) {
            int i2 = this.zze;
            int i3 = this.zzg;
            if (iZzaa <= i2 - i3) {
                String strZzb = zzant.zzb(this.zzd, i3, iZzaa);
                this.zzg += iZzaa;
                return strZzb;
            }
        }
        if (iZzaa == 0) {
            return "";
        }
        if (iZzaa <= 0) {
            throw zzalf.zzf();
        }
        throw zzalf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final boolean zzu() throws IOException {
        if (zzac() != 0) {
            return true;
        }
        return false;
    }
}

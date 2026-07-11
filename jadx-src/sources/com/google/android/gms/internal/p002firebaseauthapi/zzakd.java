package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzakd extends zzakb {
    private final InputStream zzd;
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

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
        return this.zzj + this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzd() throws IOException {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzf() throws IOException {
        return zzaa();
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

    private zzakd(InputStream inputStream, int i2) {
        super();
        this.zzk = Integer.MAX_VALUE;
        zzalb.zza(inputStream, "input");
        this.zzd = inputStream;
        this.zze = new byte[4096];
        this.zzf = 0;
        this.zzh = 0;
        this.zzj = 0;
    }

    private static int zza(InputStream inputStream) throws IOException {
        try {
            return inputStream.available();
        } catch (zzalf e2) {
            e2.zzk();
            throw e2;
        }
    }

    private final int zzaa() throws IOException {
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
        return (int) zzm();
    }

    private final long zzab() throws IOException {
        int i2 = this.zzh;
        if (this.zzf - i2 < 8) {
            zzg(8);
            i2 = this.zzh;
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    private final long zzac() throws IOException {
        long j2;
        long j3;
        long j4;
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
                this.zzh = i7;
                return j2;
            }
        }
        return zzm();
    }

    private final void zzad() {
        int i2 = this.zzf + this.zzg;
        this.zzf = i2;
        int i3 = this.zzj + i2;
        int i5 = this.zzk;
        if (i3 <= i5) {
            this.zzg = 0;
            return;
        }
        int i7 = i3 - i5;
        this.zzg = i7;
        this.zzf = i2 - i7;
    }

    private final List<byte[]> zzf(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(i2, 4096);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                int i5 = this.zzd.read(bArr, i3, iMin - i3);
                if (i5 == -1) {
                    throw zzalf.zzj();
                }
                this.zzj += i5;
                i3 += i5;
            }
            i2 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i2) throws IOException {
        if (zzi(i2)) {
            return;
        }
        if (i2 <= (this.zzb - this.zzj) - this.zzh) {
            throw zzalf.zzj();
        }
        throw zzalf.zzi();
    }

    private final void zzh(int i2) throws IOException {
        int i3 = this.zzf;
        int i5 = this.zzh;
        if (i2 <= i3 - i5 && i2 >= 0) {
            this.zzh = i5 + i2;
            return;
        }
        if (i2 < 0) {
            throw zzalf.zzf();
        }
        int i7 = this.zzj;
        int i8 = i7 + i5 + i2;
        int i9 = this.zzk;
        if (i8 > i9) {
            zzh((i9 - i7) - i5);
            throw zzalf.zzj();
        }
        this.zzj = i7 + i5;
        int i10 = i3 - i5;
        this.zzf = 0;
        this.zzh = 0;
        while (i10 < i2) {
            try {
                long j2 = i2 - i10;
                long jZza = zza(this.zzd, j2);
                if (jZza >= 0 && jZza <= j2) {
                    if (jZza == 0) {
                        break;
                    } else {
                        i10 += (int) jZza;
                    }
                } else {
                    throw new IllegalStateException(String.valueOf(this.zzd.getClass()) + "#skip returned invalid result: " + jZza + "\nThe InputStream implementation is buggy.");
                }
            } finally {
                this.zzj += i10;
                zzad();
            }
        }
        if (i10 >= i2) {
            return;
        }
        int i11 = this.zzf;
        int i12 = i11 - this.zzh;
        this.zzh = i11;
        zzg(1);
        while (true) {
            int i13 = i2 - i12;
            int i14 = this.zzf;
            if (i13 <= i14) {
                this.zzh = i13;
                return;
            } else {
                i12 += i14;
                this.zzh = i14;
                zzg(1);
            }
        }
    }

    private final byte[] zzj(int i2) throws IOException {
        if (i2 == 0) {
            return zzalb.zzb;
        }
        if (i2 < 0) {
            throw zzalf.zzf();
        }
        int i3 = this.zzj;
        int i5 = this.zzh;
        int i7 = i3 + i5 + i2;
        if (i7 - this.zzb > 0) {
            throw zzalf.zzi();
        }
        int i8 = this.zzk;
        if (i7 > i8) {
            zzh((i8 - i3) - i5);
            throw zzalf.zzj();
        }
        int i9 = this.zzf - i5;
        int i10 = i2 - i9;
        if (i10 >= 4096 && i10 > zza(this.zzd)) {
            return null;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zze, this.zzh, bArr, 0, i9);
        this.zzj += this.zzf;
        this.zzh = 0;
        this.zzf = 0;
        while (i9 < i2) {
            int iZza = zza(this.zzd, bArr, i9, i2 - i9);
            if (iZza == -1) {
                throw zzalf.zzj();
            }
            this.zzj += iZza;
            i9 += iZza;
        }
        return bArr;
    }

    private final byte zzy() throws IOException {
        if (this.zzh == this.zzf) {
            zzg(1);
        }
        byte[] bArr = this.zze;
        int i2 = this.zzh;
        this.zzh = i2 + 1;
        return bArr[i2];
    }

    private final int zzz() throws IOException {
        int i2 = this.zzh;
        if (this.zzf - i2 < 4) {
            zzg(4);
            i2 = this.zzh;
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 4;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void zzb(int i2) throws zzalf {
        if (this.zzi != i2) {
            throw zzalf.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void zzc(int i2) {
        this.zzk = i2;
        zzad();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final boolean zzd(int i2) throws IOException {
        int i3 = i2 & 7;
        int i5 = 0;
        if (i3 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i5 < 10) {
                    if (zzy() < 0) {
                        i5++;
                    }
                }
                throw zzalf.zze();
            }
            while (i5 < 10) {
                byte[] bArr = this.zze;
                int i7 = this.zzh;
                this.zzh = i7 + 1;
                if (bArr[i7] < 0) {
                    i5++;
                }
            }
            throw zzalf.zze();
            return true;
        }
        if (i3 == 1) {
            zzh(8);
            return true;
        }
        if (i3 == 2) {
            zzh(zzaa());
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
        zzh(4);
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
        return this.zzh == this.zzf && !zzi(1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zze() throws IOException {
        return zzz();
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final zzajp zzq() throws IOException {
        int iZzaa = zzaa();
        int i2 = this.zzf;
        int i3 = this.zzh;
        if (iZzaa <= i2 - i3 && iZzaa > 0) {
            zzajp zzajpVarZza = zzajp.zza(this.zze, i3, iZzaa);
            this.zzh += iZzaa;
            return zzajpVarZza;
        }
        if (iZzaa == 0) {
            return zzajp.zza;
        }
        if (iZzaa >= 0) {
            byte[] bArrZzj = zzj(iZzaa);
            if (bArrZzj != null) {
                return zzajp.zza(bArrZzj);
            }
            int i5 = this.zzh;
            int i7 = this.zzf;
            int length = i7 - i5;
            this.zzj += i7;
            this.zzh = 0;
            this.zzf = 0;
            List<byte[]> listZzf = zzf(iZzaa - length);
            byte[] bArr = new byte[iZzaa];
            System.arraycopy(this.zze, i5, bArr, 0, length);
            for (byte[] bArr2 : listZzf) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return zzajp.zzb(bArr);
        }
        throw zzalf.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final String zzr() throws IOException {
        int iZzaa = zzaa();
        if (iZzaa > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (iZzaa <= i2 - i3) {
                String str = new String(this.zze, i3, iZzaa, zzalb.zza);
                this.zzh += iZzaa;
                return str;
            }
        }
        if (iZzaa == 0) {
            return "";
        }
        if (iZzaa >= 0) {
            if (iZzaa <= this.zzf) {
                zzg(iZzaa);
                String str2 = new String(this.zze, this.zzh, iZzaa, zzalb.zza);
                this.zzh += iZzaa;
                return str2;
            }
            return new String(zza(iZzaa, false), zzalb.zza);
        }
        throw zzalf.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final String zzs() throws IOException {
        byte[] bArrZza;
        int iZzaa = zzaa();
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (iZzaa <= i3 - i2 && iZzaa > 0) {
            bArrZza = this.zze;
            this.zzh = i2 + iZzaa;
        } else {
            if (iZzaa == 0) {
                return "";
            }
            if (iZzaa >= 0) {
                i2 = 0;
                if (iZzaa <= i3) {
                    zzg(iZzaa);
                    bArrZza = this.zze;
                    this.zzh = iZzaa;
                } else {
                    bArrZza = zza(iZzaa, false);
                }
            } else {
                throw zzalf.zzf();
            }
        }
        return zzant.zzb(bArrZza, i2, iZzaa);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final boolean zzu() throws IOException {
        if (zzac() != 0) {
            return true;
        }
        return false;
    }

    private final boolean zzi(int i2) throws IOException {
        do {
            int i3 = this.zzh;
            int i5 = i3 + i2;
            int i7 = this.zzf;
            if (i5 > i7) {
                int i8 = this.zzb;
                int i9 = this.zzj;
                if (i2 > (i8 - i9) - i3 || i9 + i3 + i2 > this.zzk) {
                    return false;
                }
                if (i3 > 0) {
                    if (i7 > i3) {
                        byte[] bArr = this.zze;
                        System.arraycopy(bArr, i3, bArr, 0, i7 - i3);
                    }
                    this.zzj += i3;
                    this.zzf -= i3;
                    this.zzh = 0;
                }
                InputStream inputStream = this.zzd;
                byte[] bArr2 = this.zze;
                int i10 = this.zzf;
                int iZza = zza(inputStream, bArr2, i10, Math.min(bArr2.length - i10, (this.zzb - this.zzj) - i10));
                if (iZza == 0 || iZza < -1 || iZza > this.zze.length) {
                    throw new IllegalStateException(String.valueOf(this.zzd.getClass()) + "#read(byte[]) returned invalid result: " + iZza + "\nThe InputStream implementation is buggy.");
                }
                if (iZza <= 0) {
                    return false;
                }
                this.zzf += iZza;
                zzad();
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
            }
        } while (this.zzf < i2);
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zza(int i2) throws zzalf {
        if (i2 >= 0) {
            int i3 = i2 + this.zzj + this.zzh;
            if (i3 >= 0) {
                int i5 = this.zzk;
                if (i3 <= i5) {
                    this.zzk = i3;
                    zzad();
                    return i5;
                }
                throw zzalf.zzj();
            }
            throw zzalf.zzi();
        }
        throw zzalf.zzf();
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
        try {
            return inputStream.read(bArr, i2, i3);
        } catch (zzalf e2) {
            e2.zzk();
            throw e2;
        }
    }

    private static long zza(InputStream inputStream, long j2) throws IOException {
        try {
            return inputStream.skip(j2);
        } catch (zzalf e2) {
            e2.zzk();
            throw e2;
        }
    }

    private final byte[] zza(int i2, boolean z2) throws IOException {
        byte[] bArrZzj = zzj(i2);
        if (bArrZzj != null) {
            return bArrZzj;
        }
        int i3 = this.zzh;
        int i5 = this.zzf;
        int length = i5 - i3;
        this.zzj += i5;
        this.zzh = 0;
        this.zzf = 0;
        List<byte[]> listZzf = zzf(i2 - length);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zze, i3, bArr, 0, length);
        for (byte[] bArr2 : listZzf) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }
}

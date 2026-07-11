package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzxw {
    private final zzaan zza;
    private final zzer zzb = new zzer(32);
    private zzxv zzc;
    private zzxv zzd;
    private zzxv zze;
    private long zzf;

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final long zzf() {
        return this.zzf;
    }

    private final int zzi(int i2) {
        zzxv zzxvVar = this.zze;
        if (zzxvVar.zzc == null) {
            zzaal zzaalVarZza = this.zza.zza();
            zzxv zzxvVar2 = new zzxv(this.zze.zzb, 65536);
            zzxvVar.zzc = zzaalVarZza;
            zzxvVar.zzd = zzxvVar2;
        }
        return Math.min(i2, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i2) {
        long j2 = this.zzf + ((long) i2);
        this.zzf = j2;
        zzxv zzxvVar = this.zze;
        if (j2 == zzxvVar.zzb) {
            this.zze = zzxvVar.zzd;
        }
    }

    private static zzxv zzk(zzxv zzxvVar, zzih zzihVar, zzxx zzxxVar, zzer zzerVar) {
        zzxv zzxvVarZzm;
        int iZzt;
        if (zzihVar.zzk()) {
            long j2 = zzxxVar.zzb;
            zzerVar.zza(1);
            zzxv zzxvVarZzm2 = zzm(zzxvVar, j2, zzerVar.zzi(), 1);
            long j3 = j2 + 1;
            byte b2 = zzerVar.zzi()[0];
            int i2 = b2 & ByteCompanionObject.MIN_VALUE;
            int i3 = b2 & ByteCompanionObject.MAX_VALUE;
            zzie zzieVar = zzihVar.zzb;
            byte[] bArr = zzieVar.zza;
            if (bArr == null) {
                zzieVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z2 = i2 != 0;
            zzxvVarZzm = zzm(zzxvVarZzm2, j3, zzieVar.zza, i3);
            long j4 = j3 + ((long) i3);
            if (z2) {
                zzerVar.zza(2);
                zzxvVarZzm = zzm(zzxvVarZzm, j4, zzerVar.zzi(), 2);
                j4 += 2;
                iZzt = zzerVar.zzt();
            } else {
                iZzt = 1;
            }
            int[] iArr = zzieVar.zzd;
            if (iArr == null || iArr.length < iZzt) {
                iArr = new int[iZzt];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzieVar.zze;
            if (iArr3 == null || iArr3.length < iZzt) {
                iArr3 = new int[iZzt];
            }
            int[] iArr4 = iArr3;
            if (z2) {
                int i5 = iZzt * 6;
                zzerVar.zza(i5);
                zzxvVarZzm = zzm(zzxvVarZzm, j4, zzerVar.zzi(), i5);
                j4 += (long) i5;
                zzerVar.zzh(0);
                for (int i7 = 0; i7 < iZzt; i7++) {
                    iArr2[i7] = zzerVar.zzt();
                    iArr4[i7] = zzerVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzxxVar.zza - ((int) (j4 - zzxxVar.zzb));
            }
            zzagg zzaggVar = zzxxVar.zzc;
            String str = zzfj.zza;
            zzieVar.zza(iZzt, iArr2, iArr4, zzaggVar.zzb, zzieVar.zza, zzaggVar.zza, zzaggVar.zzc, zzaggVar.zzd);
            long j5 = zzxxVar.zzb;
            int i8 = (int) (j4 - j5);
            zzxxVar.zzb = j5 + ((long) i8);
            zzxxVar.zza -= i8;
        } else {
            zzxvVarZzm = zzxvVar;
        }
        if (!zzihVar.zze()) {
            zzihVar.zzj(zzxxVar.zza);
            return zzl(zzxvVarZzm, zzxxVar.zzb, zzihVar.zzc, zzxxVar.zza);
        }
        zzerVar.zza(4);
        zzxv zzxvVarZzm3 = zzm(zzxvVarZzm, zzxxVar.zzb, zzerVar.zzi(), 4);
        int iZzH = zzerVar.zzH();
        zzxxVar.zzb += 4;
        zzxxVar.zza -= 4;
        zzihVar.zzj(iZzH);
        zzxv zzxvVarZzl = zzl(zzxvVarZzm3, zzxxVar.zzb, zzihVar.zzc, iZzH);
        zzxxVar.zzb += (long) iZzH;
        int i9 = zzxxVar.zza - iZzH;
        zzxxVar.zza = i9;
        ByteBuffer byteBuffer = zzihVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            zzihVar.zzf = ByteBuffer.allocate(i9);
        } else {
            zzihVar.zzf.clear();
        }
        return zzl(zzxvVarZzl, zzxxVar.zzb, zzihVar.zzf, zzxxVar.zza);
    }

    private static zzxv zzn(zzxv zzxvVar, long j2) {
        while (j2 >= zzxvVar.zzb) {
            zzxvVar = zzxvVar.zzd;
        }
        return zzxvVar;
    }

    public final void zza() {
        zzxv zzxvVar = this.zzc;
        if (zzxvVar.zzc != null) {
            this.zza.zzc(zzxvVar);
            zzxvVar.zzc();
        }
        this.zzc.zza(0L, 65536);
        zzxv zzxvVar2 = this.zzc;
        this.zzd = zzxvVar2;
        this.zze = zzxvVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzc(zzih zzihVar, zzxx zzxxVar) {
        this.zzd = zzk(this.zzd, zzihVar, zzxxVar, this.zzb);
    }

    public final void zzd(zzih zzihVar, zzxx zzxxVar) {
        zzk(this.zzd, zzihVar, zzxxVar, this.zzb);
    }

    public final void zze(long j2) {
        zzxv zzxvVar;
        if (j2 != -1) {
            while (true) {
                zzxvVar = this.zzc;
                if (j2 < zzxvVar.zzb) {
                    break;
                }
                this.zza.zzb(zzxvVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzxvVar.zza) {
                this.zzd = zzxvVar;
            }
        }
    }

    public final void zzh(zzer zzerVar, int i2) {
        while (i2 > 0) {
            int iZzi = zzi(i2);
            zzxv zzxvVar = this.zze;
            zzerVar.zzm(zzxvVar.zzc.zza, zzxvVar.zzb(this.zzf), iZzi);
            i2 -= iZzi;
            zzj(iZzi);
        }
    }

    public zzxw(zzaan zzaanVar) {
        this.zza = zzaanVar;
        zzxv zzxvVar = new zzxv(0L, 65536);
        this.zzc = zzxvVar;
        this.zzd = zzxvVar;
        this.zze = zzxvVar;
    }

    private static zzxv zzl(zzxv zzxvVar, long j2, ByteBuffer byteBuffer, int i2) {
        zzxv zzxvVarZzn = zzn(zzxvVar, j2);
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (zzxvVarZzn.zzb - j2));
            byteBuffer.put(zzxvVarZzn.zzc.zza, zzxvVarZzn.zzb(j2), iMin);
            i2 -= iMin;
            j2 += (long) iMin;
            if (j2 == zzxvVarZzn.zzb) {
                zzxvVarZzn = zzxvVarZzn.zzd;
            }
        }
        return zzxvVarZzn;
    }

    private static zzxv zzm(zzxv zzxvVar, long j2, byte[] bArr, int i2) {
        zzxv zzxvVarZzn = zzn(zzxvVar, j2);
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (zzxvVarZzn.zzb - j2));
            System.arraycopy(zzxvVarZzn.zzc.zza, zzxvVarZzn.zzb(j2), bArr, i2 - i3, iMin);
            i3 -= iMin;
            j2 += (long) iMin;
            if (j2 == zzxvVarZzn.zzb) {
                zzxvVarZzn = zzxvVarZzn.zzd;
            }
        }
        return zzxvVarZzn;
    }

    public final int zzg(zzj zzjVar, int i2, boolean z2) throws IOException {
        int iZzi = zzi(i2);
        zzxv zzxvVar = this.zze;
        int iZza = zzjVar.zza(zzxvVar.zzc.zza, zzxvVar.zzb(this.zzf), iZzi);
        if (iZza == -1) {
            if (z2) {
                return -1;
            }
            throw new EOFException();
        }
        zzj(iZza);
        return iZza;
    }
}

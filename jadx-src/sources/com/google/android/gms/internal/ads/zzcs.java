package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzcs implements zzcr {
    final /* synthetic */ zzct zza;
    private final short[] zzb;
    private short[] zzc;
    private short[] zzd;
    private short[] zze;
    private int zzf;
    private int zzg;
    private int zzh;

    private final int zzs(short[] sArr, int i2, int i3, int i5) {
        int i7 = 1;
        int i8 = 255;
        int i9 = 0;
        int i10 = 0;
        while (i3 <= i5) {
            int iAbs = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                int iZzg = this.zza.zzg() * i2;
                iAbs += Math.abs(sArr[iZzg + i11] - sArr[(iZzg + i3) + i11]);
            }
            int i12 = iAbs * i9;
            int i13 = i7 * i3;
            if (i12 < i13) {
                i7 = iAbs;
            }
            if (i12 < i13) {
                i9 = i3;
            }
            int i14 = iAbs * i8;
            int i15 = i10 * i3;
            if (i14 > i15) {
                i10 = iAbs;
            }
            if (i14 > i15) {
                i8 = i3;
            }
            i3++;
        }
        this.zzf = i7 / i9;
        this.zzg = i10 / i8;
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzb(int i2, long j2, long j3) {
        int i3 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i3 >= zzctVar.zzg()) {
                return;
            }
            short[] sArr = this.zzd;
            int iZzg = zzctVar.zzg();
            int iZzj = zzctVar.zzj();
            short[] sArr2 = this.zze;
            int iZzg2 = (zzctVar.zzg() * i2) + i3;
            short s2 = sArr2[iZzg2];
            short s3 = sArr2[iZzg2 + zzctVar.zzg()];
            long jZzm = ((long) zzctVar.zzm()) * j2;
            long jZzl = ((long) zzctVar.zzl()) * j3;
            long jZzl2 = ((long) (zzctVar.zzl() + 1)) * j3;
            int i5 = i3;
            long j4 = jZzl2 - jZzl;
            long j5 = jZzl2 - jZzm;
            sArr[(iZzj * iZzg) + i5] = (short) (((j5 * ((long) s2)) + ((j4 - j5) * ((long) s3))) / j4);
            i3 = i5 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final boolean zzc() {
        int i2 = this.zzf;
        return i2 != 0 && this.zza.zzn() != 0 && this.zzg <= i2 * 3 && i2 + i2 > this.zzh * 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzg() {
        this.zzh = 0;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzi() {
        this.zzh = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzm(int i2, int i3) {
        for (int i5 = 0; i5 < this.zza.zzg() * i3; i5++) {
            this.zzc[i2 + i5] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final /* synthetic */ Object zzp() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final /* synthetic */ Object zzq() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final /* synthetic */ Object zzr() {
        return this.zzc;
    }

    private final short[] zzt(short[] sArr, int i2, int i3) {
        zzct zzctVar = this.zza;
        int length = sArr.length / zzctVar.zzg();
        return i2 + i3 <= length ? sArr : Arrays.copyOf(sArr, (((length * 3) / 2) + i3) * zzctVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzd(int i2, int i3) {
        int iZzg;
        short[] sArr = this.zzc;
        int i5 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i5 >= zzctVar.zzh() / i3) {
                return;
            }
            int i7 = 0;
            int i8 = 0;
            while (true) {
                iZzg = zzctVar.zzg() * i3;
                if (i7 < iZzg) {
                    i8 += sArr[(zzctVar.zzg() * i2) + (iZzg * i5) + i7];
                    i7++;
                }
            }
            this.zzb[i5] = (short) (i8 / iZzg);
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zze(int i2, int i3, int i5) {
        return zzs(this.zzb, 0, i3, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zzf(int i2, int i3, int i5) {
        return zzs(this.zzc, i2, i3, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzh(int i2, int i3, int i5, int i7, int i8) {
        short[] sArr = this.zzd;
        short[] sArr2 = this.zzc;
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = (i7 * i3) + i9;
            int i11 = (i8 * i3) + i9;
            int i12 = (i5 * i3) + i9;
            for (int i13 = 0; i13 < i2; i13++) {
                sArr[i12] = (short) (((sArr2[i10] * (i2 - i13)) + (sArr2[i11] * i13)) / i2);
                i12 += i3;
                i10 += i3;
                i11 += i3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzj(int i2) {
        this.zzc = zzt(this.zzc, this.zza.zzi(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzk(int i2) {
        this.zzd = zzt(this.zzd, this.zza.zzj(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzl(int i2) {
        this.zze = zzt(this.zze, this.zza.zzk(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzn(ByteBuffer byteBuffer, int i2) {
        zzct zzctVar = this.zza;
        byteBuffer.asShortBuffer().get(this.zzc, zzctVar.zzi() * zzctVar.zzg(), i2 / 2);
        byteBuffer.position(byteBuffer.position() + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzo(ByteBuffer byteBuffer, int i2) {
        zzct zzctVar = this.zza;
        byteBuffer.asShortBuffer().put(this.zzd, 0, zzctVar.zzg() * i2);
        byteBuffer.position(byteBuffer.position() + ((i2 + i2) * zzctVar.zzg()));
    }

    zzcs(zzct zzctVar) {
        Objects.requireNonNull(zzctVar);
        this.zza = zzctVar;
        this.zzb = new short[zzctVar.zzh()];
        this.zzc = new short[zzctVar.zzh() * zzctVar.zzg()];
        this.zzd = new short[zzctVar.zzh() * zzctVar.zzg()];
        this.zze = new short[zzctVar.zzh() * zzctVar.zzg()];
    }
}

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzcq implements zzcr {
    final /* synthetic */ zzct zza;
    private final float[] zzb;
    private float[] zzc;
    private float[] zzd;
    private float[] zze;
    private double zzf;
    private double zzg;
    private double zzh;

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzb(int i2, long j2, long j3) {
        int i3 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i3 >= zzctVar.zzg()) {
                return;
            }
            float[] fArr = this.zzd;
            int iZzg = zzctVar.zzg();
            int iZzj = zzctVar.zzj();
            float[] fArr2 = this.zze;
            int iZzg2 = (zzctVar.zzg() * i2) + i3;
            float f3 = fArr2[iZzg2];
            float f4 = fArr2[iZzg2 + zzctVar.zzg()];
            long jZzm = ((long) zzctVar.zzm()) * j2;
            long jZzl = ((long) zzctVar.zzl()) * j3;
            long jZzl2 = ((long) (zzctVar.zzl() + 1)) * j3;
            long j4 = jZzl2 - jZzm;
            fArr[(iZzj * iZzg) + i3] = ((j4 * f3) + ((r12 - j4) * f4)) / (jZzl2 - jZzl);
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final boolean zzc() {
        double d2 = this.zzf;
        return d2 != 0.0d && this.zza.zzn() != 0 && this.zzg <= d2 * 3.0d && d2 + d2 > this.zzh * 3.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzd(int i2, int i3) {
        int iZzg;
        int i5 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i5 >= zzctVar.zzh() / i3) {
                return;
            }
            double d2 = 0.0d;
            int i7 = 0;
            while (true) {
                iZzg = zzctVar.zzg() * i3;
                if (i7 < iZzg) {
                    d2 += (double) this.zzc[(zzctVar.zzg() * i2) + (iZzg * i5) + i7];
                    i7++;
                }
            }
            this.zzb[i5] = (float) (d2 / ((double) iZzg));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzg() {
        this.zzh = 0.0d;
        this.zzf = 0.0d;
        this.zzg = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzi() {
        this.zzh = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzm(int i2, int i3) {
        for (int i5 = 0; i5 < this.zza.zzg() * i3; i5++) {
            this.zzc[i2 + i5] = 0.0f;
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

    private final int zzs(float[] fArr, int i2, int i3, int i5) {
        int i7 = 255;
        int i8 = 0;
        double d2 = 0.0d;
        double d4 = 1.0d;
        int i9 = i3;
        while (true) {
            double d5 = i7;
            double d6 = i8;
            if (i9 > i5) {
                this.zzf = d4 / d6;
                this.zzg = d2 / d5;
                return i8;
            }
            int i10 = 0;
            double dAbs = 0.0d;
            while (i10 < i9) {
                int iZzg = this.zza.zzg() * i2;
                dAbs += (double) Math.abs(fArr[iZzg + i10] - fArr[(iZzg + i9) + i10]);
                i10++;
                i7 = i7;
            }
            int i11 = i7;
            double d7 = d6 * dAbs;
            double d8 = i9;
            double d9 = d4 * d8;
            if (d7 < d9) {
                d4 = dAbs;
            }
            if (d7 < d9) {
                i8 = i9;
            }
            double d10 = d5 * dAbs;
            double d11 = d8 * d2;
            if (d10 > d11) {
                d2 = dAbs;
            }
            i7 = d10 > d11 ? i9 : i11;
            i9++;
        }
    }

    private final float[] zzt(float[] fArr, int i2, int i3) {
        zzct zzctVar = this.zza;
        int length = fArr.length / zzctVar.zzg();
        return i2 + i3 <= length ? fArr : Arrays.copyOf(fArr, (((length * 3) / 2) + i3) * zzctVar.zzg());
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
        float[] fArr = this.zzd;
        float[] fArr2 = this.zzc;
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = (i7 * i3) + i9;
            int i11 = (i8 * i3) + i9;
            int i12 = (i5 * i3) + i9;
            for (int i13 = 0; i13 < i2; i13++) {
                fArr[i12] = ((fArr2[i10] * (i2 - i13)) + (fArr2[i11] * i13)) / i2;
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
        byteBuffer.asFloatBuffer().get(this.zzc, zzctVar.zzi() * zzctVar.zzg(), i2 / 4);
        byteBuffer.position(byteBuffer.position() + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzo(ByteBuffer byteBuffer, int i2) {
        zzct zzctVar = this.zza;
        byteBuffer.asFloatBuffer().put(this.zzd, 0, zzctVar.zzg() * i2);
        byteBuffer.position(byteBuffer.position() + (i2 * 4 * zzctVar.zzg()));
    }

    zzcq(zzct zzctVar) {
        Objects.requireNonNull(zzctVar);
        this.zza = zzctVar;
        this.zzb = new float[zzctVar.zzh()];
        this.zzc = new float[zzctVar.zzh() * zzctVar.zzg()];
        this.zzd = new float[zzctVar.zzh() * zzctVar.zzg()];
        this.zze = new float[zzctVar.zzh() * zzctVar.zzg()];
    }
}

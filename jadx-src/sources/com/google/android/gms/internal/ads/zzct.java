package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzct {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final zzcr zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private double zzq;

    public final void zze() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 0;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0.0d;
        this.zzi.zzg();
    }

    final /* synthetic */ int zzg() {
        return this.zzb;
    }

    final /* synthetic */ int zzh() {
        return this.zzh;
    }

    final /* synthetic */ int zzi() {
        return this.zzj;
    }

    final /* synthetic */ int zzj() {
        return this.zzk;
    }

    final /* synthetic */ int zzk() {
        return this.zzl;
    }

    final /* synthetic */ int zzl() {
        return this.zzm;
    }

    final /* synthetic */ int zzm() {
        return this.zzn;
    }

    final /* synthetic */ int zzn() {
        return this.zzp;
    }

    private final void zzo(int i2, int i3) {
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzk(i3);
        Object objZzr = zzcrVar.zzr();
        Object objZzq = zzcrVar.zzq();
        int i5 = this.zzk;
        int i7 = this.zzb;
        System.arraycopy(objZzr, i2 * i7, objZzq, i5 * i7, i3 * i7);
        this.zzk += i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017e A[EDGE_INSN: B:101:0x017e->B:59:0x017e BREAK  A[LOOP:3: B:13:0x0035->B:92:0x024c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024c A[LOOP:3: B:13:0x0035->B:92:0x024c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzp() {
        float f3;
        int iZze;
        int i2;
        double d2;
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        float f4;
        int i10;
        int i11;
        long j2;
        long j3;
        float f5 = this.zzc;
        float f6 = this.zzd;
        double d4 = f5 / f6;
        int i12 = this.zzk;
        int i13 = 0;
        int i14 = 1;
        if (d4 > 1.0000100135803223d || d4 < 0.9999899864196777d) {
            int i15 = this.zzj;
            int i16 = this.zzh;
            if (i15 >= i16) {
                int i17 = 0;
                while (true) {
                    int i18 = this.zzo;
                    if (i18 > 0) {
                        int iMin = Math.min(i16, i18);
                        zzo(i17, iMin);
                        this.zzo -= iMin;
                        i17 += iMin;
                        f3 = f6;
                        d2 = d4;
                        i3 = i14;
                        i5 = i16;
                    } else {
                        int i19 = this.zza;
                        int i20 = i19 > 4000 ? i19 / Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE : i14;
                        int i21 = this.zzb;
                        if (i21 != i14) {
                            zzcr zzcrVar = this.zzi;
                            zzcrVar.zzd(i17, i20);
                            int i22 = this.zzf;
                            int i23 = this.zzg;
                            f3 = f6;
                            int iZze2 = zzcrVar.zze(i13, i22 / i20, i23 / i20);
                            if (i20 == i14) {
                                int i24 = iZze2 * i20;
                                int i25 = i20 * 4;
                                int i26 = i24 - i25;
                                if (i26 >= i22) {
                                    i22 = i26;
                                }
                                int i27 = i24 + i25;
                                if (i27 <= i23) {
                                    i23 = i27;
                                }
                                if (i21 == i14) {
                                    iZze = zzcrVar.zzf(i17, i22, i23);
                                } else {
                                    zzcrVar.zzd(i17, i14);
                                    iZze = zzcrVar.zze(i13, i22, i23);
                                }
                            } else {
                                iZze = iZze2;
                            }
                            i2 = i21;
                            zzcr zzcrVar2 = this.zzi;
                            int i28 = zzcrVar2.zzc() ? this.zzp : iZze;
                            int i29 = i17 + i28;
                            zzcrVar2.zzi();
                            this.zzp = iZze;
                            double d5 = i28;
                            if (d4 > 1.0d) {
                                double d6 = d4 - 1.0d;
                                if (d4 >= 2.0d) {
                                    i3 = i14;
                                    i5 = i16;
                                    double d7 = (d5 / d6) + this.zzq;
                                    int iRound = (int) Math.round(d7);
                                    d2 = d4;
                                    this.zzq = d7 - ((double) iRound);
                                    i9 = iRound;
                                } else {
                                    d2 = d4;
                                    i3 = i14;
                                    i5 = i16;
                                    double d8 = ((d5 * (2.0d - d2)) / d6) + this.zzq;
                                    int iRound2 = (int) Math.round(d8);
                                    this.zzo = iRound2;
                                    this.zzq = d8 - ((double) iRound2);
                                    i9 = i28;
                                }
                                zzcrVar2.zzk(i9);
                                zzcrVar2.zzh(i9, i2, this.zzk, i17, i29);
                                this.zzk += i9;
                                i17 += i28 + i9;
                            } else {
                                d2 = d4;
                                i3 = i14;
                                i5 = i16;
                                double d9 = 1.0d - d2;
                                if (d2 < 0.5d) {
                                    double d10 = ((d5 * d2) / d9) + this.zzq;
                                    int iRound3 = (int) Math.round(d10);
                                    this.zzq = d10 - ((double) iRound3);
                                    i7 = i12;
                                    i8 = iRound3;
                                } else {
                                    i7 = i12;
                                    double d11 = ((d5 * ((d2 + d2) - 1.0d)) / d9) + this.zzq;
                                    int iRound4 = (int) Math.round(d11);
                                    this.zzo = iRound4;
                                    this.zzq = d11 - ((double) iRound4);
                                    i8 = i28;
                                }
                                int i30 = i28 + i8;
                                zzcrVar2.zzk(i30);
                                System.arraycopy(zzcrVar2.zzr(), i17 * i2, zzcrVar2.zzq(), this.zzk * i2, i28 * i2);
                                int i31 = i17;
                                zzcrVar2.zzh(i8, i2, this.zzk + i28, i29, i31);
                                this.zzk += i30;
                                i17 = i31 + i8;
                                if (i17 + i5 <= i15) {
                                    break;
                                }
                                i12 = i7;
                                f6 = f3;
                                i14 = i3;
                                i16 = i5;
                                d4 = d2;
                                i13 = 0;
                            }
                        } else if (i20 == i14) {
                            iZze = this.zzi.zzf(i17, this.zzf, this.zzg);
                            f3 = f6;
                            i2 = i14;
                            zzcr zzcrVar22 = this.zzi;
                            if (zzcrVar22.zzc()) {
                            }
                            int i292 = i17 + i28;
                            zzcrVar22.zzi();
                            this.zzp = iZze;
                            double d52 = i28;
                            if (d4 > 1.0d) {
                            }
                        } else {
                            i21 = i14;
                            zzcr zzcrVar3 = this.zzi;
                            zzcrVar3.zzd(i17, i20);
                            int i222 = this.zzf;
                            int i232 = this.zzg;
                            f3 = f6;
                            int iZze22 = zzcrVar3.zze(i13, i222 / i20, i232 / i20);
                            if (i20 == i14) {
                            }
                            i2 = i21;
                            zzcr zzcrVar222 = this.zzi;
                            if (zzcrVar222.zzc()) {
                            }
                            int i2922 = i17 + i28;
                            zzcrVar222.zzi();
                            this.zzp = iZze;
                            double d522 = i28;
                            if (d4 > 1.0d) {
                            }
                        }
                    }
                    i7 = i12;
                    if (i17 + i5 <= i15) {
                    }
                }
                int i32 = this.zzj - i17;
                zzcr zzcrVar4 = this.zzi;
                int i33 = this.zzb;
                System.arraycopy(zzcrVar4.zzr(), i17 * i33, zzcrVar4.zzr(), 0, i33 * i32);
                this.zzj = i32;
            }
            f4 = this.zze * f3;
            if (f4 != 1.0f || this.zzk == i7) {
            }
            int i34 = this.zza;
            long j4 = i34;
            long j5 = (long) (i34 / f4);
            while (j5 != 0 && j4 != 0 && j5 % 2 == 0 && j4 % 2 == 0) {
                j5 /= 2;
                j4 /= 2;
            }
            int i35 = this.zzk - i7;
            zzcr zzcrVar5 = this.zzi;
            zzcrVar5.zzl(i35);
            int i36 = this.zzb;
            System.arraycopy(zzcrVar5.zzq(), i7 * i36, zzcrVar5.zzp(), this.zzl * i36, i35 * i36);
            this.zzk = i7;
            this.zzl += i35;
            int i37 = 0;
            while (true) {
                i10 = this.zzl - 1;
                if (i37 >= i10) {
                    break;
                }
                while (true) {
                    i11 = this.zzm + 1;
                    j2 = i11;
                    long j6 = j2 * j5;
                    j3 = this.zzn;
                    if (j6 <= j3 * j4) {
                        break;
                    }
                    int i38 = i3;
                    zzcrVar5.zzk(i38);
                    zzcrVar5.zzb(i37, j4, j5);
                    this.zzn += i38;
                    this.zzk += i38;
                }
                int i39 = i3;
                this.zzm = i11;
                if (j2 == j4) {
                    this.zzm = 0;
                    zzgrc.zzi(j3 == j5 ? i39 : 0);
                    this.zzn = 0;
                }
                i37++;
                i3 = i39;
            }
            if (i10 != 0) {
                System.arraycopy(zzcrVar5.zzp(), i10 * i36, zzcrVar5.zzp(), 0, (this.zzl - i10) * i36);
                this.zzl -= i10;
                return;
            }
            return;
        }
        zzo(0, this.zzj);
        this.zzj = 0;
        f3 = f6;
        i7 = i12;
        i3 = 1;
        f4 = this.zze * f3;
        if (f4 != 1.0f) {
        }
    }

    public final int zza() {
        return this.zzj * this.zzb * this.zzi.zza();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        zzcr zzcrVar = this.zzi;
        int iRemaining = byteBuffer.remaining();
        int iZza = iRemaining / (this.zzb * zzcrVar.zza());
        zzcrVar.zzj(iZza);
        zzcrVar.zzn(byteBuffer, iRemaining);
        this.zzj += iZza;
        zzp();
    }

    public final void zzc(ByteBuffer byteBuffer) {
        zzgrc.zzi(this.zzk >= 0);
        int i2 = this.zzb;
        int iRemaining = byteBuffer.remaining();
        zzcr zzcrVar = this.zzi;
        int iMin = Math.min(iRemaining / (zzcrVar.zza() * i2), this.zzk);
        zzcrVar.zzo(byteBuffer, iMin);
        this.zzk -= iMin;
        System.arraycopy(zzcrVar.zzq(), iMin * i2, zzcrVar.zzq(), 0, this.zzk * i2);
    }

    public final void zzd() {
        int i2 = this.zzj;
        int i3 = this.zzo;
        int i5 = this.zzk;
        float f3 = this.zzc;
        float f4 = this.zzd;
        int i7 = i5 + ((int) ((((((((double) (i2 - i3)) / ((double) (f3 / f4))) + ((double) i3)) + this.zzq) + ((double) this.zzl)) / ((double) (this.zze * f4))) + 0.5d));
        this.zzq = 0.0d;
        int i8 = this.zzh;
        int i9 = i8 + i8;
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzj(i2 + i9);
        zzcrVar.zzm(i2 * this.zzb, i9);
        this.zzj += i9;
        zzp();
        if (this.zzk > i7) {
            this.zzk = Math.max(i7, 0);
        }
        this.zzj = 0;
        this.zzo = 0;
        this.zzl = 0;
    }

    public final int zzf() {
        zzgrc.zzi(this.zzk >= 0);
        return this.zzk * this.zzb * this.zzi.zza();
    }

    public zzct(int i2, int i3, float f3, float f4, int i5, boolean z2) {
        zzcr zzcsVar;
        this.zza = i2;
        this.zzb = i3;
        this.zzc = f3;
        this.zzd = f4;
        this.zze = i2 / i5;
        this.zzf = i2 / Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE;
        int i7 = i2 / 65;
        this.zzg = i7;
        this.zzh = i7 + i7;
        if (z2) {
            zzcsVar = new zzcq(this);
        } else {
            zzcsVar = new zzcs(this);
        }
        this.zzi = zzcsVar;
    }
}

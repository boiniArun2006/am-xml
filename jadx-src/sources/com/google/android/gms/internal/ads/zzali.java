package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzali implements zzalp {
    private final zzalo zza;
    private final long zzb;
    private final long zzc;
    private final zzalt zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    final /* synthetic */ long zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ zzalt zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzalp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zza(zzaev zzaevVar) throws IOException {
        long j2;
        long j3;
        long jMax;
        int i2 = this.zze;
        if (i2 == 0) {
            long jZzn = zzaevVar.zzn();
            this.zzg = jZzn;
            this.zze = 1;
            long j4 = this.zzc - 65307;
            if (j4 > jZzn) {
                return j4;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                long j5 = this.zzi;
                long j6 = this.zzj;
                if (j5 == j6) {
                    jMax = -1;
                    j3 = -1;
                } else {
                    long jZzn2 = zzaevVar.zzn();
                    zzalo zzaloVar = this.zza;
                    if (zzaloVar.zzb(zzaevVar, j6)) {
                        zzaloVar.zzc(zzaevVar, false);
                        zzaevVar.zzl();
                        long j7 = this.zzh;
                        j2 = 2;
                        long j9 = zzaloVar.zzb;
                        long j10 = j7 - j9;
                        int i3 = zzaloVar.zzd + zzaloVar.zze;
                        if (j10 < 0 || j10 >= 72000) {
                            if (j10 < 0) {
                                this.zzj = jZzn2;
                                this.zzl = j9;
                            } else {
                                this.zzi = zzaevVar.zzn() + ((long) i3);
                                this.zzk = j9;
                            }
                            long j11 = this.zzj;
                            long j12 = this.zzi;
                            long j13 = j11 - j12;
                            if (j13 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                this.zzj = j12;
                                j3 = -1;
                                jMax = j12;
                            } else {
                                long jZzn3 = zzaevVar.zzn() - (((long) i3) * (j10 <= 0 ? 2L : 1L));
                                j3 = -1;
                                String str = zzfj.zza;
                                jMax = Math.max(j12, Math.min(jZzn3 + ((j10 * j13) / (this.zzl - this.zzk)), j11 - 1));
                            }
                        } else {
                            jMax = -1;
                            j3 = -1;
                        }
                        if (jMax == j3) {
                            return jMax;
                        }
                        this.zze = 3;
                    } else {
                        jMax = this.zzi;
                        if (jMax == jZzn2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j3 = -1;
                    }
                }
                j2 = 2;
                if (jMax == j3) {
                }
            } else {
                if (i2 != 3) {
                    return -1L;
                }
                j3 = -1;
                j2 = 2;
            }
            while (true) {
                zzalo zzaloVar2 = this.zza;
                zzaloVar2.zzb(zzaevVar, j3);
                zzaloVar2.zzc(zzaevVar, false);
                if (zzaloVar2.zzb > this.zzh) {
                    zzaevVar.zzl();
                    this.zze = 4;
                    return -(this.zzk + j2);
                }
                zzaevVar.zzf(zzaloVar2.zzd + zzaloVar2.zze);
                this.zzi = zzaevVar.zzn();
                this.zzk = zzaloVar2.zzb;
                j3 = -1;
            }
        }
        zzalo zzaloVar3 = this.zza;
        zzaloVar3.zza();
        if (!zzaloVar3.zzb(zzaevVar, -1L)) {
            throw new EOFException();
        }
        zzaloVar3.zzc(zzaevVar, false);
        zzaevVar.zzf(zzaloVar3.zzd + zzaloVar3.zze);
        long j14 = zzaloVar3.zzb;
        while ((zzaloVar3.zza & 4) != 4 && zzaloVar3.zzb(zzaevVar, -1L) && zzaevVar.zzn() < this.zzc && zzaloVar3.zzc(zzaevVar, true) && zzaey.zzd(zzaevVar, zzaloVar3.zzd + zzaloVar3.zze)) {
            j14 = zzaloVar3.zzb;
        }
        this.zzf = j14;
        this.zze = 4;
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final void zzb(long j2) {
        long j3 = this.zzf - 1;
        String str = zzfj.zza;
        this.zzh = Math.max(0L, Math.min(j2, j3));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    @Nullable
    public final /* bridge */ /* synthetic */ zzafy zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzalh(this, bArr);
        }
        return null;
    }

    public zzali(zzalt zzaltVar, long j2, long j3, long j4, long j5, boolean z2) {
        boolean z3;
        if (j2 >= 0 && j3 > j2) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzgrc.zza(z3);
        this.zzd = zzaltVar;
        this.zzb = j2;
        this.zzc = j3;
        if (j4 != j3 - j2 && !z2) {
            this.zze = 0;
        } else {
            this.zzf = j5;
            this.zze = 4;
        }
        this.zza = new zzalo();
    }
}

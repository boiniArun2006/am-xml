package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzacs {
    private final zzacr zza;
    private final zzacz zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzdn zzk = zzdn.zza;

    public zzacs(Context context, zzacr zzacrVar, long j2) {
        this.zza = zzacrVar;
        this.zzb = new zzacz(context);
    }

    public final void zza(int i2) {
        if (i2 == 0) {
            this.zzd = 1;
        } else if (i2 != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
        this.zzb.zzd();
    }

    public final void zzb() {
        this.zzc = true;
        this.zzf = zzfj.zzq(this.zzk.zzb());
        this.zzb.zzb();
    }

    public final void zzc() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzd(@Nullable Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzc(surface);
        zzo(1);
    }

    public final void zzg(zzdn zzdnVar) {
        this.zzk = zzdnVar;
    }

    public final void zzh() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final boolean zzi(boolean z2) {
        if (z2 && (this.zzd == 3 || (!this.zzl && this.zzm))) {
            this.zzh = -9223372036854775807L;
            return true;
        }
        if (this.zzh == -9223372036854775807L) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = -9223372036854775807L;
        return false;
    }

    public final void zzj(boolean z2) {
        this.zzi = z2;
        this.zzh = -9223372036854775807L;
    }

    public final void zzn(@FloatRange float f3) {
        zzgrc.zza(f3 > 0.0f);
        if (f3 == this.zzj) {
            return;
        }
        this.zzj = f3;
        this.zzb.zze(f3);
    }

    private final void zzo(int i2) {
        this.zzd = Math.min(this.zzd, i2);
    }

    public final void zze(float f3) {
        this.zzb.zzf(f3);
    }

    public final boolean zzf() {
        int i2 = this.zzd;
        this.zzd = 3;
        this.zzf = zzfj.zzq(this.zzk.zzb());
        return i2 != 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
    
        if (r17 > androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        if (r24 >= r28) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
    
        if (r21.zzc != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzk(long j2, long j3, long j4, long j5, boolean z2, boolean z3, zzacq zzacqVar) throws zziw {
        long j6;
        zzacqVar.zzc();
        if (this.zzc && this.zze == -9223372036854775807L) {
            this.zze = j3;
        }
        if (this.zzg != j2) {
            this.zzb.zzg(j2);
            this.zzg = j2;
        }
        long jZzq = (long) ((j2 - j3) / ((double) this.zzj));
        if (this.zzc) {
            jZzq -= zzfj.zzq(this.zzk.zzb()) - j4;
        }
        zzacqVar.zze(jZzq);
        if (z2 && !z3) {
            return 3;
        }
        if (!this.zzl) {
            if (this.zza.zzao(zzacqVar.zzd(), j3, j4, z3, true)) {
                return 4;
            }
            if (this.zzc && zzacqVar.zzd() < 30000) {
                return 3;
            }
            this.zzm = true;
            return 5;
        }
        long jZzd = zzacqVar.zzd();
        boolean z4 = false;
        if (this.zzh == -9223372036854775807L || this.zzi) {
            int i2 = this.zzd;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        j6 = -9223372036854775807L;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException();
                        }
                        j6 = -9223372036854775807L;
                        long jZzq2 = zzfj.zzq(this.zzk.zzb()) - this.zzf;
                        if (this.zzc) {
                            long j7 = this.zze;
                            if (j7 != -9223372036854775807L) {
                                if (j7 != j3) {
                                    if (jZzd < -30000) {
                                    }
                                }
                            }
                        }
                    }
                }
                return 0;
            }
            j6 = -9223372036854775807L;
        } else {
            j6 = -9223372036854775807L;
        }
        if (!this.zzc || j3 == this.zze) {
            return 5;
        }
        long jZzc = this.zzk.zzc();
        zzacqVar.zzg(this.zzb.zzi((zzacqVar.zzd() * 1000) + jZzc, j2));
        zzacqVar.zze((zzacqVar.zzf() - jZzc) / 1000);
        if (this.zzh != j6 && !this.zzi) {
            z4 = true;
        }
        if (this.zza.zzao(zzacqVar.zzd(), j3, j4, z3, z4)) {
            return 4;
        }
        return (zzacqVar.zzd() >= -30000 || z3) ? zzacqVar.zzd() > 50000 ? 5 : 1 : z4 ? 3 : 2;
    }

    public final void zzl() {
        this.zzb.zzd();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzo(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzm(int i2) {
        this.zzb.zza(i2);
    }
}

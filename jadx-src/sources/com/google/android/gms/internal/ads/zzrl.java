package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.dash.DashMediaSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzrl {
    private final zzrk zza;
    private final int zzb;
    private final zzsj zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    private final long zzh(long j2, long j3, long j4, float f3) {
        return zzfj.zzr(j2, this.zzb) + zzfj.zzv(j4 - j3, f3);
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i2 = this.zzd;
        return i2 == 0 || i2 == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    private final void zzf(int i2) {
        this.zzd = i2;
        long j2 = 10000;
        if (i2 == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i2 == 1) {
                this.zzf = 10000L;
                return;
            }
            j2 = (i2 == 2 || i2 == 3) ? 10000000L : 500000L;
        }
        this.zzf = j2;
    }

    private final long zzg(long j2, float f3) {
        zzrk zzrkVar = this.zza;
        return zzh(zzrkVar.zzc(), zzrkVar.zzb(), j2, f3);
    }

    public final void zza(long j2, float f3, long j3) {
        boolean z2;
        int i2;
        if (j2 - this.zzg < this.zzf) {
            return;
        }
        this.zzg = j2;
        zzrk zzrkVar = this.zza;
        boolean zZza = zzrkVar.zza();
        if (zZza) {
            long jZzb = zzrkVar.zzb();
            long jZzg = zzg(j2, f3);
            i2 = 2;
            if (Math.abs(jZzb - j2) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                zzsj zzsjVar = this.zzc;
                long jZzc = zzrkVar.zzc();
                long jZzq = ((zzrw) zzsjVar).zza.zzq();
                int length = String.valueOf(jZzc).length();
                int length2 = String.valueOf(jZzb).length();
                int length3 = String.valueOf(j2).length();
                StringBuilder sb = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + String.valueOf(j3).length() + 2 + String.valueOf(jZzq).length());
                sb.append("Spurious audio timestamp (system clock mismatch): ");
                sb.append(jZzc);
                sb.append(", ");
                sb.append(jZzb);
                sb.append(", ");
                sb.append(j2);
                sb.append(", ");
                sb.append(j3);
                sb.append(", ");
                sb.append(jZzq);
                zzee.zzc("AudioTrackAudioOutput", sb.toString());
                zzf(4);
                z2 = zZza;
            } else if (Math.abs(jZzg - j3) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                zzsj zzsjVar2 = this.zzc;
                long jZzc2 = zzrkVar.zzc();
                long jZzq2 = ((zzrw) zzsjVar2).zza.zzq();
                int length4 = String.valueOf(jZzc2).length();
                int length5 = String.valueOf(jZzb).length();
                int length6 = String.valueOf(j2).length();
                int length7 = length4 + 54 + length5 + 2 + length6 + 2 + String.valueOf(j3).length() + 2;
                z2 = zZza;
                StringBuilder sb2 = new StringBuilder(length7 + String.valueOf(jZzq2).length());
                sb2.append("Spurious audio timestamp (frame position mismatch): ");
                sb2.append(jZzc2);
                sb2.append(", ");
                sb2.append(jZzb);
                sb2.append(", ");
                sb2.append(j2);
                sb2.append(", ");
                sb2.append(j3);
                sb2.append(", ");
                sb2.append(jZzq2);
                zzee.zzc("AudioTrackAudioOutput", sb2.toString());
                zzf(4);
            } else {
                z2 = zZza;
                if (this.zzd == 4) {
                    zzf(0);
                }
            }
        } else {
            z2 = zZza;
            i2 = 2;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            if (!z2) {
                if (j2 - this.zze > 500000) {
                    zzf(3);
                    return;
                }
                return;
            } else {
                if (zzrkVar.zzb() >= this.zze) {
                    this.zzh = zzrkVar.zzc();
                    this.zzi = zzrkVar.zzb();
                    zzf(1);
                    return;
                }
                return;
            }
        }
        if (i3 != 1) {
            if (i3 == i2) {
                if (z2) {
                    return;
                }
                zzf(0);
                return;
            } else {
                if (i3 == 3 && z2) {
                    zzf(0);
                    return;
                }
                return;
            }
        }
        if (!z2) {
            zzf(0);
            return;
        }
        long jZzc3 = zzrkVar.zzc();
        long j4 = this.zzh;
        if (jZzc3 > j4) {
            if (Math.abs(zzg(j2, f3) - zzh(j4, this.zzi, j2, f3)) < 1000) {
                zzf(2);
                return;
            }
        }
        if (j2 - this.zze > SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US) {
            zzf(3);
        } else {
            this.zzh = zzrkVar.zzc();
            this.zzi = zzrkVar.zzb();
        }
    }

    public zzrl(AudioTrack audioTrack, zzsj zzsjVar) {
        this.zza = new zzrk(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzsjVar;
        zzf(0);
    }

    public final long zze(long j2, float f3) {
        return zzg(j2, f3);
    }
}

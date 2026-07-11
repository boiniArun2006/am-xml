package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzacz {
    private final Context zzb;

    @Nullable
    private zzacv zzc;
    private boolean zzd;

    @Nullable
    private Surface zze;
    private float zzg;
    private float zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private final zzabv zza = new zzabv();
    private float zzf = -1.0f;
    private float zzi = 1.0f;
    private int zzj = 0;

    public zzacz(Context context) {
        this.zzb = context;
    }

    private final void zzj() {
        this.zzm = 0L;
        this.zzq = -1L;
        this.zzn = -1L;
        this.zzk = 0L;
        this.zzl = 0L;
    }

    public final void zzb() {
        this.zzd = true;
        zzj();
        DisplayManager displayManager = (DisplayManager) this.zzb.getSystemService("display");
        zzacv zzacyVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                zzacyVar = Build.VERSION.SDK_INT >= 33 ? new zzacy(choreographer, displayManager, null) : new zzacw(choreographer, displayManager, null);
            } catch (RuntimeException e2) {
                zzee.zzd("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e2);
            }
        }
        this.zzc = zzacyVar;
        if (zzacyVar != null) {
            zzacyVar.zza();
        }
        zzl(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzacv zzacvVar = this.zzc;
        if (zzacvVar != null) {
            zzacvVar.zzb();
        }
        zzm();
    }

    private final void zzk() {
        if (Build.VERSION.SDK_INT < 30 || this.zze == null) {
            return;
        }
        zzabv zzabvVar = this.zza;
        float fZzg = zzabvVar.zzc() ? zzabvVar.zzg() : this.zzf;
        float f3 = this.zzg;
        if (fZzg != f3) {
            if (fZzg != -1.0f && f3 != -1.0f) {
                float f4 = 1.0f;
                if (zzabvVar.zzc() && zzabvVar.zze() >= 5000000000L) {
                    f4 = 0.1f;
                }
                if (Math.abs(fZzg - this.zzg) < f4) {
                    return;
                }
            } else if (fZzg == -1.0f && zzabvVar.zzd() < 30) {
                return;
            }
            this.zzg = fZzg;
            zzl(false);
        }
    }

    private final void zzl(boolean z2) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f3 = 0.0f;
        if (this.zzd) {
            float f4 = this.zzg;
            if (f4 != -1.0f) {
                f3 = this.zzi * f4;
            }
        }
        if (z2 || this.zzh != f3) {
            this.zzh = f3;
            zzacu.zza(this.zze, f3);
        }
    }

    private final void zzm() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f || !surface.isValid()) {
            return;
        }
        this.zzh = 0.0f;
        zzacu.zza(this.zze, 0.0f);
    }

    public final void zza(int i2) {
        if (this.zzj == i2) {
            return;
        }
        this.zzj = i2;
        zzl(true);
    }

    public final void zzc(@Nullable Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzm();
        this.zze = surface;
        zzl(true);
    }

    public final void zze(float f3) {
        this.zzi = f3;
        zzl(false);
    }

    public final void zzf(float f3) {
        this.zzf = f3;
        this.zza.zza();
        zzk();
    }

    public final void zzg(long j2) {
        long j3 = this.zzn;
        if (j3 != -1) {
            this.zzq = j3;
            this.zzr = this.zzo;
            this.zzs = this.zzp;
            this.zzk = this.zzl;
        }
        this.zzm++;
        this.zza.zzb(j2 * 1000);
        zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzi(long j2, long j3) {
        long j4;
        long j5;
        long j6;
        float f3;
        long jZzf;
        if (this.zzq != -1) {
            zzabv zzabvVar = this.zza;
            if (zzabvVar.zzc()) {
                jZzf = zzabvVar.zzf() * (this.zzm - this.zzq);
                f3 = this.zzi;
            } else {
                long j7 = j3 - this.zzs;
                f3 = this.zzi;
                jZzf = j7 * 1000;
            }
            j4 = this.zzr + ((long) (jZzf / f3));
            if (Math.abs(j2 - j4) > 20000000) {
                zzj();
                j4 = j2;
            }
        } else {
            j4 = j2;
        }
        this.zzn = this.zzm;
        this.zzo = j4;
        this.zzp = j3;
        zzacv zzacvVar = this.zzc;
        if (zzacvVar != null) {
            long j9 = zzacvVar.zzc;
            long j10 = this.zzc.zzd;
            if (j9 != -9223372036854775807L && j10 != -9223372036854775807L) {
                long j11 = j9 + (((j4 - j9) / j10) * j10);
                if (j4 <= j11) {
                    j5 = j11 - j10;
                } else {
                    j5 = j11;
                    j11 += j10;
                }
                long j12 = j10 / 2;
                long j13 = j11 - j4;
                long j14 = j4 - j5;
                long jAbs = Math.abs(j13 - j14);
                if (jAbs < j12) {
                    long j15 = j10 / 4;
                    if (jAbs < j15) {
                        j6 = this.zzk;
                        if (j6 == 0) {
                            if (j13 < j14) {
                                j15 = -j15;
                            }
                        }
                    } else {
                        j15 = 0;
                    }
                    this.zzl = j15;
                    j6 = j15;
                    if (j13 + j6 >= j14) {
                        j11 = j5;
                    }
                    return j11 - ((j10 * 80) / 100);
                }
                j6 = this.zzk;
                this.zzl = j6;
                if (j13 + j6 >= j14) {
                }
                return j11 - ((j10 * 80) / 100);
            }
        }
        return j4;
    }

    public final void zzd() {
        zzj();
    }
}

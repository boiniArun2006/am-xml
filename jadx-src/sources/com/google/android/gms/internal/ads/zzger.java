package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzger {
    public long zza;
    public long zzb;
    public long zzc;
    public long zzd;
    public double zze;
    public float zzf;
    public float zzg;
    public float zzh;
    public float zzi;
    private double zzj;
    private double zzk;

    private static double zzb(MotionEvent motionEvent, double d2, double d4, double d5) {
        return d5 + Math.hypot(((double) motionEvent.getRawX()) - d2, ((double) motionEvent.getRawY()) - d4);
    }

    final /* synthetic */ void zza(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                    this.zzd++;
                    return;
                } else {
                    this.zzb += (long) (motionEvent.getHistorySize() + 1);
                    this.zze = zzb(motionEvent, this.zzj, this.zzk, this.zze);
                    this.zzj = motionEvent.getRawX();
                    this.zzk = motionEvent.getRawY();
                    return;
                }
            }
            this.zzc++;
            this.zze = zzb(motionEvent, this.zzj, this.zzk, this.zze);
            this.zzj = motionEvent.getRawX();
            this.zzk = motionEvent.getRawY();
            return;
        }
        this.zza++;
        this.zze = 0.0d;
        this.zzj = motionEvent.getRawX();
        this.zzk = motionEvent.getRawY();
        this.zzf = motionEvent.getX();
        this.zzg = motionEvent.getY();
        this.zzh = motionEvent.getRawX();
        this.zzi = motionEvent.getRawY();
    }
}

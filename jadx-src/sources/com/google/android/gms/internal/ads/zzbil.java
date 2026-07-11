package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbil {
    private MotionEvent zza = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private MotionEvent zzb = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    private final ScheduledExecutorService zzc;

    public final com.google.common.util.concurrent.Xo zzb() {
        return (zzgzg) zzgzo.zzi(zzgzg.zzw(zzgzo.zza(null)), ((Long) zzbjd.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
    }

    public zzbil(Context context, ScheduledExecutorService scheduledExecutorService, zzbin zzbinVar, zzfoo zzfooVar) {
        this.zzc = scheduledExecutorService;
    }

    public final void zza(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zza.getEventTime()) {
            this.zza = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.zzb.getEventTime()) {
            this.zzb = MotionEvent.obtain(motionEvent);
        }
    }
}

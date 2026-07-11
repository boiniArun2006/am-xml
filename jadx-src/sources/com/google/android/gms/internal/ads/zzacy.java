package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RequiresApi
final class zzacy extends zzacv implements Choreographer$VsyncCallback {
    private final Handler zzf;

    /* synthetic */ zzacy(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        super(choreographer, displayManager, null);
        this.zzf = zzfj.zzc(null);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        if (i2 == 0) {
            this.zza.postVsyncCallback(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    final void zzb() {
        this.zzb.unregisterDisplayListener(this);
        this.zzf.removeCallbacksAndMessages(null);
        this.zza.removeVsyncCallback(this);
        this.zzc = -9223372036854775807L;
        this.zzd = -9223372036854775807L;
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.zzc = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        long j2 = -9223372036854775807L;
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            if (expectedPresentationTimeNanos != 0) {
                j2 = expectedPresentationTimeNanos;
            }
            this.zzd = j2;
        } else {
            this.zzd = -9223372036854775807L;
        }
        this.zzf.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzacy zzacyVar = this.zza;
                zzacyVar.zza.postVsyncCallback(zzacyVar);
            }
        }, 500L);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    final void zza() {
        super.zza();
        this.zza.postVsyncCallback(this);
    }
}

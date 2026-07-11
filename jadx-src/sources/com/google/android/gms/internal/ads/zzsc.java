package com.google.android.gms.internal.ads;

import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RequiresApi
final class zzsc {
    final /* synthetic */ zzsd zza;
    private final Handler zzb;
    private final AudioTrack$StreamEventCallback zzc;

    final /* synthetic */ void zza() {
        this.zza.zzr().unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }

    /* synthetic */ zzsc(zzsd zzsdVar, byte[] bArr) {
        Objects.requireNonNull(zzsdVar);
        this.zza = zzsdVar;
        final Handler handlerZzc = zzfj.zzc(null);
        this.zzb = handlerZzc;
        zzsa zzsaVar = new zzsa(this);
        this.zzc = zzsaVar;
        Objects.requireNonNull(handlerZzc);
        zzsdVar.zzr().registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzsb
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handlerZzc.post(runnable);
            }
        }, zzsaVar);
    }
}

package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzsa extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzsc zza;

    public final void onDataRequest(AudioTrack audioTrack, int i2) {
        zzed zzedVarZzs = this.zza.zza.zzs();
        zzedVarZzs.zzd(-1, zzrz.zza);
        zzedVarZzs.zze();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzed zzedVarZzs = this.zza.zza.zzs();
        zzedVarZzs.zzd(-1, zzrx.zza);
        zzedVarZzs.zze();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzed zzedVarZzs = this.zza.zza.zzs();
        zzedVarZzs.zzd(-1, zzry.zza);
        zzedVarZzs.zze();
    }

    zzsa(zzsc zzscVar) {
        Objects.requireNonNull(zzscVar);
        this.zza = zzscVar;
    }
}

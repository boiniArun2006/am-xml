package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.MimeTypes;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
final class zzzp {

    @Nullable
    private final Spatializer zza;
    private final boolean zzb;

    @Nullable
    private final Handler zzc;

    @Nullable
    private final Spatializer$OnSpatializerStateChangedListener zzd;

    public final boolean zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return androidx.media3.exoplayer.trackselection.l3D.n(spatializer).isAvailable();
    }

    public final boolean zzc() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return androidx.media3.exoplayer.trackselection.l3D.n(spatializer).isEnabled();
    }

    public final boolean zzd(zzd zzdVar, zzv zzvVar) {
        int i2;
        String str = zzvVar.zzo;
        if (Objects.equals(str, "audio/eac3-joc")) {
            i2 = zzvVar.zzG;
            if (i2 == 16) {
                i2 = 12;
            }
        } else if (Objects.equals(str, MimeTypes.AUDIO_IAMF)) {
            i2 = zzvVar.zzG;
            if (i2 == -1) {
                i2 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4")) {
            i2 = zzvVar.zzG;
            if (i2 == 18 || i2 == 21) {
                i2 = 24;
            }
        } else {
            i2 = zzvVar.zzG;
        }
        int iZzB = zzfj.zzB(i2);
        if (iZzB == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iZzB);
        int i3 = zzvVar.zzH;
        if (i3 != -1) {
            channelMask.setSampleRate(i3);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return androidx.media3.exoplayer.trackselection.l3D.n(spatializer).canBeSpatialized(zzdVar.zza(), channelMask.build());
    }

    public final void zze() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.zza;
        if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.zzd) == null || (handler = this.zzc) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }

    public zzzp(@Nullable Context context, zzaaa zzaaaVar, @Nullable Boolean bool) {
        AudioManager audioManagerZza;
        if (context == null) {
            audioManagerZza = null;
        } else {
            audioManagerZza = zzcj.zza(context);
        }
        if (audioManagerZza != null && (bool == null || !bool.booleanValue())) {
            Spatializer spatializer = audioManagerZza.getSpatializer();
            this.zza = spatializer;
            this.zzb = spatializer.getImmersiveAudioLevel() != 0;
            zzzn zzznVar = new zzzn(this, zzaaaVar);
            this.zzd = zzznVar;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            final Handler handler = new Handler(looperMyLooper);
            this.zzc = handler;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzzo
                @Override // java.util.concurrent.Executor
                public final /* synthetic */ void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, zzznVar);
            return;
        }
        this.zza = null;
        this.zzb = false;
        this.zzc = null;
        this.zzd = null;
    }
}

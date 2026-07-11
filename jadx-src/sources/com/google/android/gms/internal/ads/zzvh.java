package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzvh implements zzuk {
    private final MediaCodec zza;

    @Nullable
    private final zzug zzb;

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zza(int i2, int i3, int i5, long j2, int i7) {
        this.zza.queueInputBuffer(i2, 0, i5, j2, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzc(int i2, boolean z2) {
        this.zza.releaseOutputBuffer(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzd(int i2, long j2) {
        this.zza.releaseOutputBuffer(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final int zze() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final MediaFormat zzg() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    @Nullable
    public final ByteBuffer zzh(int i2) {
        return this.zza.getInputBuffer(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    @Nullable
    public final ByteBuffer zzj(int i2) {
        return this.zza.getOutputBuffer(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzk() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzl() {
        zzug zzugVar;
        zzug zzugVar2;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && i2 < 33) {
                this.zza.stop();
            }
            if (i2 >= 35 && (zzugVar2 = this.zzb) != null) {
                zzugVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (zzugVar = this.zzb) != null) {
                zzugVar.zzc(this.zza);
            }
            this.zza.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzn(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    @RequiresApi
    public final void zzo() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzq(int i2) {
        this.zza.setVideoScalingMode(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    @RequiresApi
    public final void zzr(List list) {
        this.zza.subscribeToVendorParameters(list);
    }

    /* synthetic */ zzvh(MediaCodec mediaCodec, zzug zzugVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = zzugVar;
        if (Build.VERSION.SDK_INT >= 35 && zzugVar != null) {
            zzugVar.zzb(mediaCodec);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzb(int i2, int i3, zzie zzieVar, long j2, int i5) {
        this.zza.queueSecureInputBuffer(i2, 0, zzieVar.zzb(), j2, i5);
    }
}

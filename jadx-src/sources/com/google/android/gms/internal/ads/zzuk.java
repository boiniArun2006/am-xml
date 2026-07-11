package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface zzuk {
    void zza(int i2, int i3, int i5, long j2, int i7);

    void zzb(int i2, int i3, zzie zzieVar, long j2, int i5);

    void zzc(int i2, boolean z2);

    void zzd(int i2, long j2);

    int zze();

    int zzf(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzg();

    @Nullable
    ByteBuffer zzh(int i2);

    @Nullable
    ByteBuffer zzj(int i2);

    void zzk();

    void zzl();

    default boolean zzm(zzuj zzujVar) {
        return false;
    }

    void zzn(Surface surface);

    @RequiresApi
    void zzo();

    void zzp(Bundle bundle);

    void zzq(int i2);

    @RequiresApi
    void zzr(List list);

    default void zzi(Runnable runnable) {
        runnable.run();
    }
}

package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public interface zzqc {
    void zza();

    void zzb();

    boolean zzc(ByteBuffer byteBuffer, int i2, long j2) throws zzqb;

    void zzd();

    void zze();

    void zzf(float f3);

    boolean zzg();

    int zzh();

    int zzi();

    long zzj();

    long zzk();

    boolean zzl();

    void zzm(zzqa zzqaVar);

    default void zzn(zzpq zzpqVar) {
    }

    void zzo(@Nullable AudioDeviceInfo audioDeviceInfo);
}

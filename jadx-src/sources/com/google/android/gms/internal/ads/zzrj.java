package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public interface zzrj {
    void zzA();

    void zzB();

    default void zzC() {
    }

    void zza(zzrg zzrgVar);

    default void zzb(@Nullable zzpq zzpqVar) {
    }

    default void zzc(zzdn zzdnVar) {
    }

    boolean zzd(zzv zzvVar);

    int zze(zzv zzvVar);

    default zzpz zzf(zzv zzvVar) {
        throw null;
    }

    long zzg(boolean z2);

    void zzh(zzv zzvVar, int i2, @Nullable int[] iArr) throws zzre;

    void zzi();

    void zzj();

    boolean zzk(ByteBuffer byteBuffer, long j2, int i2) throws zzri, zzrf;

    void zzl() throws zzri;

    boolean zzm();

    boolean zzn();

    void zzo(zzav zzavVar);

    zzav zzp();

    void zzq(boolean z2);

    void zzr(zzd zzdVar);

    void zzs(int i2);

    void zzt(zze zzeVar);

    default void zzu(@Nullable AudioDeviceInfo audioDeviceInfo) {
    }

    default void zzv(int i2) {
    }

    long zzw();

    @RequiresApi
    default void zzx(int i2, int i3) {
    }

    void zzy(float f3);

    void zzz();
}

package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzqe {
    private final zzv zza;

    @Nullable
    private AudioDeviceInfo zzc;
    private zzd zzb = zzd.zza;
    private int zzd = 0;
    private int zze = -1;
    private int zzf = -1;

    public final zzqe zza(zzd zzdVar) {
        this.zzb = zzdVar;
        return this;
    }

    public final zzqe zzb(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.zzc = audioDeviceInfo;
        return this;
    }

    public final zzqe zzc(int i2) {
        this.zzd = i2;
        return this;
    }

    public final zzqe zzd(int i2) {
        this.zze = i2;
        return this;
    }

    public final zzqe zze(int i2) {
        this.zzf = -1;
        return this;
    }

    final /* synthetic */ zzv zzf() {
        return this.zza;
    }

    final /* synthetic */ zzd zzg() {
        return this.zzb;
    }

    final /* synthetic */ AudioDeviceInfo zzh() {
        return this.zzc;
    }

    final /* synthetic */ int zzi() {
        return this.zzd;
    }

    final /* synthetic */ int zzj() {
        return this.zze;
    }

    final /* synthetic */ int zzk() {
        return this.zzf;
    }

    public zzqe(zzv zzvVar) {
        this.zza = zzvVar;
    }
}

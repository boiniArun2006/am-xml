package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzuh {
    public final zzun zza;
    public final MediaFormat zzb;
    public final zzv zzc;

    @Nullable
    public final Surface zzd;

    @Nullable
    public final MediaCrypto zze = null;

    @Nullable
    public final zzug zzf;

    private zzuh(zzun zzunVar, MediaFormat mediaFormat, zzv zzvVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, @Nullable zzug zzugVar) {
        this.zza = zzunVar;
        this.zzb = mediaFormat;
        this.zzc = zzvVar;
        this.zzd = surface;
        this.zzf = zzugVar;
    }

    public static zzuh zza(zzun zzunVar, MediaFormat mediaFormat, zzv zzvVar, @Nullable MediaCrypto mediaCrypto, @Nullable zzug zzugVar) {
        return new zzuh(zzunVar, mediaFormat, zzvVar, null, null, zzugVar);
    }

    public static zzuh zzb(zzun zzunVar, MediaFormat mediaFormat, zzv zzvVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        return new zzuh(zzunVar, mediaFormat, zzvVar, surface, null, null);
    }
}

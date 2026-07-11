package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcez implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcfi zzb;

    zzcez(zzcfi zzcfiVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        Objects.requireNonNull(zzcfiVar);
        this.zzb = zzcfiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfi zzcfiVar = this.zzb;
        zzcfiVar.zzs(this.zza);
        if (zzcfiVar.zzt() != null) {
            zzcfiVar.zzt().zzb();
        }
    }
}

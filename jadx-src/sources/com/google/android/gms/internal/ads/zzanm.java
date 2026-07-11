package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.dash.DashMediaSource;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzanm implements zzamf {
    private final zzer zza = new zzer();
    private final zzer zzb = new zzer();
    private final zzanl zzc;

    @Nullable
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i2, int i3, zzame zzameVar, zzdr zzdrVar) {
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i3 + i2);
        zzerVar.zzh(i2);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzer zzerVar2 = this.zzb;
        if (zzfj.zzL(zzerVar, zzerVar2, this.zzd)) {
            zzerVar.zzb(zzerVar2.zzi(), zzerVar2.zze());
        }
        zzanl zzanlVar = this.zzc;
        zzanlVar.zzd();
        int iZzd = zzerVar.zzd();
        zzcx zzcxVarZzc = null;
        if (iZzd >= 2 && zzerVar.zzt() == iZzd) {
            zzanlVar.zzb(zzerVar);
            zzcxVarZzc = zzanlVar.zzc(zzerVar);
        }
        zzdrVar.zza(new zzalx(zzcxVarZzc != null ? zzguf.zzj(zzcxVarZzc) : zzguf.zzi(), -9223372036854775807L, DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US));
    }

    public zzanm(List list) {
        zzanl zzanlVar = new zzanl();
        this.zzc = zzanlVar;
        zzanlVar.zza(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }
}

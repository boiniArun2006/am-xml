package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import androidx.media3.container.Mp4Box;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaha implements zzaeu {
    private final zzer zza = new zzer(4);
    private final zzaga zzb = new zzaga(-1, -1, MimeTypes.IMAGE_AVIF);

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        ((zzael) zzaevVar).zzj(4, false);
        return zzh(zzaevVar, Mp4Box.TYPE_ftyp) && zzh(zzaevVar, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    private final boolean zzh(zzaev zzaevVar, int i2) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(4);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, 4, false);
        return zzerVar.zzz() == ((long) i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzb.zzc(zzaexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        return this.zzb.zzd(zzaevVar, zzafvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j3) {
        this.zzb.zze(j2, j3);
    }
}

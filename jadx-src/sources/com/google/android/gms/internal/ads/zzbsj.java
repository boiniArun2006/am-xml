package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbsj implements zzcer {
    final /* synthetic */ zzbsk zza;

    @Override // com.google.android.gms.internal.ads.zzcer
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbrg zzbrgVar = (zzbrg) obj;
        zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy > Destroying engine.");
                zzbrg zzbrgVar2 = zzbrgVar;
                zzbrgVar2.zzn("/result", zzbog.zzo);
                zzbrgVar2.zzj();
            }
        });
    }

    zzbsj(zzbsk zzbskVar) {
        Objects.requireNonNull(zzbskVar);
        this.zza = zzbskVar;
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdjv extends zzdhd implements zzboz {
    @Override // com.google.android.gms.internal.ads.zzboz
    public final synchronized void zza() {
        zzs(zzdju.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zzb(@Nullable final zzcas zzcasVar) {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdjs
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((zzboz) obj).zzb(zzcasVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzboz
    public final void zzc() {
        zzs(zzdjt.zza);
    }

    public zzdjv(Set set) {
        super(set);
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@VisibleForTesting
public final class zzdbo extends zzdhd implements zzdbj {
    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzc(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdbn
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                ((zzdbv) obj).zzj(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzd(final zzdmb zzdmbVar) {
        zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdbl
            @Override // com.google.android.gms.internal.ads.zzdhc
            public final /* synthetic */ void zza(Object obj) {
                zzdbv zzdbvVar = (zzdbv) obj;
                String message = zzdmbVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzdbvVar.zzj(zzfkm.zzd(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zze() {
        zzs(zzdbm.zza);
    }

    @VisibleForTesting
    public zzdbo(Set set) {
        super(set);
    }
}

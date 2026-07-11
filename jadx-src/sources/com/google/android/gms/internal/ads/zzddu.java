package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzddu extends zzdhd implements zzdbz, zzdde {
    private final zzfir zzb;
    private final AtomicBoolean zzc;
    private final zzfjc zzd;

    private final void zzb() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjb)).booleanValue() && this.zzc.compareAndSet(false, true) && (zztVar = this.zzb.zzae) != null && zztVar.zza == 3) {
            zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzddt
                @Override // com.google.android.gms.internal.ads.zzdhc
                public final /* synthetic */ void zza(Object obj) {
                    ((zzddw) obj).zzm(zztVar);
                }
            });
        }
    }

    public final void zza(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        if (com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(this.zzd) && this.zzb.zzaB) {
            zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdds
                @Override // com.google.android.gms.internal.ads.zzdhc
                public final /* synthetic */ void zza(Object obj) {
                    ((zzddw) obj).zzm(zztVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        int i2 = this.zzb.zzb;
        if (i2 == 2 || i2 == 5 || i2 == 4 || i2 == 6 || i2 == 7) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzl() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    public zzddu(Set set, zzfir zzfirVar, zzfjc zzfjcVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfirVar;
        this.zzd = zzfjcVar;
    }
}

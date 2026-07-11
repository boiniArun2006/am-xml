package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzguu extends zzgsd {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzgrd zzb;

    zzguu(Iterator it, zzgrd zzgrdVar) {
        this.zza = it;
        this.zzb = zzgrdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsd
    protected final Object zza() {
        zzgrd zzgrdVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzgrdVar = this.zzb;
            next = it.next();
        } while (!zzgrdVar.zza(next));
        return next;
    }
}

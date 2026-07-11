package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class zzgyz extends zzgyq {
    private List zza;

    zzgyz(zzgub zzgubVar, boolean z2) {
        super(zzgubVar, z2, true);
        List listZzb = zzgubVar.isEmpty() ? Collections.EMPTY_LIST : zzgvf.zzb(zzgubVar.size());
        for (int i2 = 0; i2 < zzgubVar.size(); i2++) {
            listZzb.add(null);
        }
        this.zza = listZzb;
    }

    abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzw(int i2, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i2, new zzgyy(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzA(int i2) {
        super.zzA(i2);
        this.zza = null;
    }
}

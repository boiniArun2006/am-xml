package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzetm implements zzfax {
    private final Set zza;

    zzetm(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgzo.zza(new zzetl(arrayList, null));
    }
}

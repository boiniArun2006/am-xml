package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgyx extends zzgyz {
    zzgyx(zzgub zzgubVar, boolean z2) {
        super(zzgubVar, z2);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgyz
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        Object obj;
        ArrayList arrayListZzb = zzgvf.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgyy zzgyyVar = (zzgyy) it.next();
            if (zzgyyVar != null) {
                obj = zzgyyVar.zza;
            } else {
                obj = null;
            }
            arrayListZzb.add(obj);
        }
        return Collections.unmodifiableList(arrayListZzb);
    }
}

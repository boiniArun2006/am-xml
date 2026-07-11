package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zziks implements zzikg {
    private final List zza;
    private final List zzb;

    /* synthetic */ zziks(List list, List list2, zzikq zzikqVar) {
        this.zza = list;
        this.zzb = list2;
    }

    static {
        zzikh.zza(Collections.EMPTY_SET);
    }

    public static zzikr zza(int i2, int i3) {
        return new zzikr(i2, i3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.zza;
        int size = list.size();
        List list2 = this.zzb;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) ((zzikp) list2.get(i2)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetZzb = zzikd.zzb(size);
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object objZzb = ((zzikp) list.get(i3)).zzb();
            objZzb.getClass();
            hashSetZzb.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i5 = 0; i5 < size4; i5++) {
            for (Object obj : (Collection) arrayList.get(i5)) {
                obj.getClass();
                hashSetZzb.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetZzb);
    }
}

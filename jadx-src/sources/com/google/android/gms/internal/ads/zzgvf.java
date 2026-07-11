package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgvf {
    public static ArrayList zza(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList zzb(int i2) {
        zzgtb.zzb(i2, "initialArraySize");
        return new ArrayList(i2);
    }

    public static List zzc(List list, zzgqt zzgqtVar) {
        return list instanceof RandomAccess ? new zzgvc(list, zzgqtVar) : new zzgve(list, zzgqtVar);
    }
}

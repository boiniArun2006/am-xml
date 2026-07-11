package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaej {
    private final Map zza = new LinkedHashMap();

    public final void zza(zzaei zzaeiVar) {
        long[] jArr = zzaeiVar.zze;
        if (jArr.length > 0) {
            Map map = this.zza;
            if (map.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            map.put(Long.valueOf(jArr[0]), zzaeiVar);
        }
    }

    public final zzaei zzb() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (zzaei zzaeiVar : this.zza.values()) {
            arrayList.add(zzaeiVar.zzb);
            arrayList2.add(zzaeiVar.zzc);
            arrayList3.add(zzaeiVar.zzd);
            arrayList4.add(zzaeiVar.zze);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i2 = (int) length;
        zzgrc.zze(length == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", length);
        int[] iArr3 = new int[i2];
        int i3 = 0;
        for (int[] iArr4 : iArr) {
            int length2 = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i3, length2);
            i3 += length2;
        }
        return new zzaei(iArr3, zzgyc.zza((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), zzgyc.zza((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), zzgyc.zza((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }
}

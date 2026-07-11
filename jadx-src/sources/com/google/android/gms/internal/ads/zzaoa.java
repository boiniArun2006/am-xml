package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzaoa implements zzama {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    @Override // com.google.android.gms.internal.ads.zzama
    public final long zzb(int i2) {
        zzgrc.zza(i2 >= 0);
        long[] jArr = this.zzc;
        zzgrc.zza(i2 < jArr.length);
        return jArr[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzama
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzama
    public final List zzc(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            List list = this.zza;
            if (i2 >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i3 = i2 + i2;
            if (jArr[i3] <= j2 && j2 < jArr[i3 + 1]) {
                zzanq zzanqVar = (zzanq) list.get(i2);
                zzcx zzcxVar = zzanqVar.zza;
                if (zzcxVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzanqVar);
                } else {
                    arrayList.add(zzcxVar);
                }
            }
            i2++;
        }
        Collections.sort(arrayList2, zzanz.zza);
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            zzcw zzcwVarZza = ((zzanq) arrayList2.get(i5)).zza.zza();
            zzcwVarZza.zzf((-1) - i5, 1);
            arrayList.add(zzcwVarZza.zzr());
        }
        return arrayList;
    }

    public zzaoa(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzanq zzanqVar = (zzanq) list.get(i2);
            long[] jArr = this.zzb;
            int i3 = i2 + i2;
            jArr[i3] = zzanqVar.zzb;
            jArr[i3 + 1] = zzanqVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbej {
    private final int zza;
    private final zzbeg zzb = new zzbel();

    public zzbej(int i2) {
        this.zza = i2;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(((String) arrayList.get(i2)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzbei zzbeiVar = new zzbei();
        int i3 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i3, new zzbeh(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzbek.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzben.zza(strArrZzb, i3, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbeiVar.zzb.write(this.zzb.zza(((zzbem) it.next()).zzb));
            } catch (IOException e2) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e2);
            }
        }
        return zzbeiVar.toString();
    }
}

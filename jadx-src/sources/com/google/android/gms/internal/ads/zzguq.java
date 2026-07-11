package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzguq extends zzgul {
    public final zzgus zzc() {
        Map map = this.zza;
        if (map == null) {
            return zzgtt.zza;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return zzgtt.zza;
        }
        zzguh zzguhVar = new zzguh(setEntrySet.size());
        int size = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            zzgup zzgupVarZzo = zzgup.zzo(((zzguo) entry.getValue()).zzi());
            if (!zzgupVarZzo.isEmpty()) {
                zzguhVar.zza(key, zzgupVarZzo);
                size += zzgupVarZzo.size();
            }
        }
        return new zzgus(zzguhVar.zzc(), size, null);
    }

    public final zzguq zzb(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            boolean z2 = true;
            while (it.hasNext()) {
                if (!z2) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z2 = false;
            }
            sb.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            zzgua zzguaVarZzs = (zzgua) zza().get(obj);
            if (zzguaVarZzs == null) {
                int iMax = 4;
                if (listAsList instanceof Set) {
                    iMax = Math.max(4, ((Set) listAsList).size());
                }
                zzguaVarZzs = zzgup.zzs(iMax);
                zza().put(obj, zzguaVarZzs);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                zzgtb.zza(obj, next);
                zzguaVarZzs.zzd(next);
            }
        }
        return this;
    }
}

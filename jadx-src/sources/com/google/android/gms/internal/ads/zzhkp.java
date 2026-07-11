package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhkp {
    private final Map zza = new HashMap();

    public final zzhkr zzb() {
        return new zzhkr(this.zza, null);
    }

    public final zzhkp zza(zzhye zzhyeVar, Object obj) throws GeneralSecurityException {
        List list;
        if (zzhyeVar.zzd() != 0 && zzhyeVar.zzd() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        Map map = this.zza;
        if (map.containsKey(zzhyeVar)) {
            list = (List) map.get(zzhyeVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(zzhyeVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzpq<P> {
    private final Map<zzaae, List<P>> zza = new HashMap();

    public final zzpq<P> zza(zzaae zzaaeVar, P p2) throws GeneralSecurityException {
        List<P> list;
        if (zzaaeVar.zza() != 0 && zzaaeVar.zza() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        if (this.zza.containsKey(zzaaeVar)) {
            list = this.zza.get(zzaaeVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.zza.put(zzaaeVar, arrayList);
            list = arrayList;
        }
        list.add(p2);
        return this;
    }

    public final zzpo<P> zza() {
        return new zzpo<>(this.zza);
    }
}

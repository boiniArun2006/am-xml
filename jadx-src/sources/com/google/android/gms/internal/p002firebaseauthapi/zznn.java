package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zznn<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    public final zznn<E, O> zza(E e2, O o2) {
        this.zza.put(e2, o2);
        this.zzb.put(o2, e2);
        return this;
    }

    private zznn() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zznk<E, O> zza() {
        return new zznk<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb));
    }
}

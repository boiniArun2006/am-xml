package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zznk<E extends Enum<E>, O> {
    private final Map<E, O> zza;
    private final Map<O, E> zzb;

    public static <E extends Enum<E>, O> zznn<E, O> zza() {
        return new zznn<>();
    }

    private zznk(Map<E, O> map, Map<O, E> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final E zza(O o2) throws GeneralSecurityException {
        E e2 = this.zzb.get(o2);
        if (e2 != null) {
            return e2;
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + String.valueOf(o2));
    }

    public final O zza(E e2) throws GeneralSecurityException {
        O o2 = this.zza.get(e2);
        if (o2 != null) {
            return o2;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + String.valueOf(e2));
    }
}

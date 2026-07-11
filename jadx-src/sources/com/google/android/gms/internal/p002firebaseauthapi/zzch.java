package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzch {
    private zzch() {
    }

    static {
        Logger.getLogger(zzch.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzbe.class);
        hashSet.add(zzbi.class);
        hashSet.add(zzcj.class);
        hashSet.add(zzbk.class);
        hashSet.add(zzbh.class);
        hashSet.add(zzcb.class);
        hashSet.add(zzso.class);
        hashSet.add(zzcf.class);
        hashSet.add(zzci.class);
        Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    static zzws zza(String str, zzajp zzajpVar) throws GeneralSecurityException {
        zzbl<?> zzblVarZza = zznt.zza().zza(str);
        if (zzblVarZza instanceof zzcg) {
            return ((zzcg) zzblVarZza).zzc(zzajpVar);
        }
        throw new GeneralSecurityException("manager for key type " + str + " is not a PrivateKeyManager");
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhkv {
    private final Map zza;
    private final Map zzb;

    private zzhkv() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    final /* synthetic */ Map zzd() {
        return this.zza;
    }

    final /* synthetic */ Map zze() {
        return this.zzb;
    }

    public final zzhkv zza(zzhku zzhkuVar) throws GeneralSecurityException {
        if (zzhkuVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzhkw zzhkwVar = new zzhkw(zzhkuVar.zzb(), zzhkuVar.zzc(), null);
        Map map = this.zza;
        if (!map.containsKey(zzhkwVar)) {
            map.put(zzhkwVar, zzhkuVar);
            return this;
        }
        zzhku zzhkuVar2 = (zzhku) map.get(zzhkwVar);
        if (zzhkuVar2.equals(zzhkuVar) && zzhkuVar.equals(zzhkuVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzhkwVar.toString()));
    }

    public final zzhkv zzb(zzhla zzhlaVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZza = zzhlaVar.zza();
        if (!map.containsKey(clsZza)) {
            map.put(clsZza, zzhlaVar);
            return this;
        }
        zzhla zzhlaVar2 = (zzhla) map.get(clsZza);
        if (zzhlaVar2.equals(zzhlaVar) && zzhlaVar.equals(zzhlaVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
    }

    public final zzhky zzc() {
        return new zzhky(this, null);
    }

    /* synthetic */ zzhkv(zzhky zzhkyVar, byte[] bArr) {
        this.zza = new HashMap(zzhkyVar.zzd());
        this.zzb = new HashMap(zzhkyVar.zze());
    }

    /* synthetic */ zzhkv(byte[] bArr) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }
}

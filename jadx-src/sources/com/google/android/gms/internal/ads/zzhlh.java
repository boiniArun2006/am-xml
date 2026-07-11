package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhlh {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzhlh() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    final /* synthetic */ Map zze() {
        return this.zza;
    }

    final /* synthetic */ Map zzf() {
        return this.zzb;
    }

    final /* synthetic */ Map zzg() {
        return this.zzc;
    }

    final /* synthetic */ Map zzh() {
        return this.zzd;
    }

    public final zzhlh zza(zzhji zzhjiVar) throws GeneralSecurityException {
        zzhlj zzhljVar = new zzhlj(zzhjiVar.zzb(), zzhjiVar.zzc(), null);
        Map map = this.zza;
        if (!map.containsKey(zzhljVar)) {
            map.put(zzhljVar, zzhjiVar);
            return this;
        }
        zzhji zzhjiVar2 = (zzhji) map.get(zzhljVar);
        if (zzhjiVar2.equals(zzhjiVar) && zzhjiVar.equals(zzhjiVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhljVar.toString()));
    }

    public final zzhlh zzb(zzhjf zzhjfVar) throws GeneralSecurityException {
        zzhli zzhliVar = new zzhli(zzhjfVar.zzc(), zzhjfVar.zzb(), null);
        Map map = this.zzb;
        if (!map.containsKey(zzhliVar)) {
            map.put(zzhliVar, zzhjfVar);
            return this;
        }
        zzhjf zzhjfVar2 = (zzhjf) map.get(zzhliVar);
        if (zzhjfVar2.equals(zzhjfVar) && zzhjfVar.equals(zzhjfVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhliVar.toString()));
    }

    public final zzhlh zzc(zzhkn zzhknVar) throws GeneralSecurityException {
        zzhlj zzhljVar = new zzhlj(zzhknVar.zzb(), zzhknVar.zzc(), null);
        Map map = this.zzc;
        if (!map.containsKey(zzhljVar)) {
            map.put(zzhljVar, zzhknVar);
            return this;
        }
        zzhkn zzhknVar2 = (zzhkn) map.get(zzhljVar);
        if (zzhknVar2.equals(zzhknVar) && zzhknVar.equals(zzhknVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhljVar.toString()));
    }

    public final zzhlh zzd(zzhkk zzhkkVar) throws GeneralSecurityException {
        zzhli zzhliVar = new zzhli(zzhkkVar.zzc(), zzhkkVar.zzb(), null);
        Map map = this.zzd;
        if (!map.containsKey(zzhliVar)) {
            map.put(zzhliVar, zzhkkVar);
            return this;
        }
        zzhkk zzhkkVar2 = (zzhkk) map.get(zzhliVar);
        if (zzhkkVar2.equals(zzhkkVar) && zzhkkVar.equals(zzhkkVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhliVar.toString()));
    }

    public zzhlh(zzhlk zzhlkVar) {
        this.zza = new HashMap(zzhlkVar.zzg());
        this.zzb = new HashMap(zzhlkVar.zzh());
        this.zzc = new HashMap(zzhlkVar.zzi());
        this.zzd = new HashMap(zzhlkVar.zzj());
    }
}

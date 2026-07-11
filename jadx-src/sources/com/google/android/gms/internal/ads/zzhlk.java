package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhlk {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    final /* synthetic */ Map zzg() {
        return this.zza;
    }

    final /* synthetic */ Map zzh() {
        return this.zzb;
    }

    final /* synthetic */ Map zzi() {
        return this.zzc;
    }

    final /* synthetic */ Map zzj() {
        return this.zzd;
    }

    public final boolean zza(zzhlg zzhlgVar) {
        return this.zzb.containsKey(new zzhli(zzhlgVar.getClass(), zzhlgVar.zzf(), null));
    }

    public final zzhaz zzb(zzhlg zzhlgVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        zzhli zzhliVar = new zzhli(zzhlgVar.getClass(), zzhlgVar.zzf(), null);
        Map map = this.zzb;
        if (map.containsKey(zzhliVar)) {
            return ((zzhjf) map.get(zzhliVar)).zza(zzhlgVar, zzhbtVar);
        }
        String string = zzhliVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 47);
        sb.append("No Key Parser for requested key type ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhlg zzc(zzhaz zzhazVar, Class cls, zzhbt zzhbtVar) throws GeneralSecurityException {
        zzhlj zzhljVar = new zzhlj(zzhazVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhljVar)) {
            return ((zzhji) map.get(zzhljVar)).zza(zzhazVar, zzhbtVar);
        }
        String string = zzhljVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 32);
        sb.append("No Key serializer for ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final boolean zzd(zzhlg zzhlgVar) {
        return this.zzd.containsKey(new zzhli(zzhlgVar.getClass(), zzhlgVar.zzf(), null));
    }

    public final zzhbp zze(zzhlg zzhlgVar) throws GeneralSecurityException {
        zzhli zzhliVar = new zzhli(zzhlgVar.getClass(), zzhlgVar.zzf(), null);
        Map map = this.zzd;
        if (map.containsKey(zzhliVar)) {
            return ((zzhkk) map.get(zzhliVar)).zza(zzhlgVar);
        }
        String string = zzhliVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 54);
        sb.append("No Parameters Parser for requested key type ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhlg zzf(zzhbp zzhbpVar, Class cls) throws GeneralSecurityException {
        zzhlj zzhljVar = new zzhlj(zzhbpVar.getClass(), cls, null);
        Map map = this.zzc;
        if (map.containsKey(zzhljVar)) {
            return ((zzhkn) map.get(zzhljVar)).zza(zzhbpVar);
        }
        String string = zzhljVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 39);
        sb.append("No Key Format serializer for ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    /* synthetic */ zzhlk(zzhlh zzhlhVar, byte[] bArr) {
        this.zza = new HashMap(zzhlhVar.zze());
        this.zzb = new HashMap(zzhlhVar.zzf());
        this.zzc = new HashMap(zzhlhVar.zzg());
        this.zzd = new HashMap(zzhlhVar.zzh());
    }
}

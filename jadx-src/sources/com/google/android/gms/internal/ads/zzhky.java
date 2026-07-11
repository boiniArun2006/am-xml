package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhky {
    private final Map zza;
    private final Map zzb;

    final /* synthetic */ Map zzd() {
        return this.zza;
    }

    final /* synthetic */ Map zze() {
        return this.zzb;
    }

    public static zzhkv zza() {
        return new zzhkv(null);
    }

    public final Object zzb(zzhaz zzhazVar, Class cls) throws GeneralSecurityException {
        zzhkw zzhkwVar = new zzhkw(zzhazVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhkwVar)) {
            return ((zzhku) map.get(zzhkwVar)).zza(zzhazVar);
        }
        String string = zzhkwVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 102);
        sb.append("No PrimitiveConstructor for ");
        sb.append(string);
        sb.append(" available, see https://developers.google.com/tink/faq/registration_errors");
        throw new GeneralSecurityException(sb.toString());
    }

    public final Object zzc(zzhjj zzhjjVar, zzhjr zzhjrVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        final zzhla zzhlaVar = (zzhla) map.get(cls);
        return zzhlaVar.zze(zzhjjVar, zzhjrVar, new zzhkz() { // from class: com.google.android.gms.internal.ads.zzhkx
            @Override // com.google.android.gms.internal.ads.zzhkz
            public final /* synthetic */ Object zza(zzhbi zzhbiVar) {
                return this.zza.zzb(zzhbiVar.zza(), zzhlaVar.zzb());
            }
        });
    }

    /* synthetic */ zzhky(zzhkv zzhkvVar, byte[] bArr) {
        this.zza = new HashMap(zzhkvVar.zzd());
        this.zzb = new HashMap(zzhkvVar.zze());
    }
}

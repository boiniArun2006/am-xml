package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjh;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzjr {
    private static final zzaae zza;
    private static final zzpk<zzjh, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzja, zzqe> zzd;
    private static final zzns<zzqe> zze;
    private static final Map<zzjh.zzb, zzxu> zzf;
    private static final Map<zzxu, zzjh.zzb> zzg;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzja zzb(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            zzuk zzukVarZza = zzuk.zza(zzqeVar.zzd(), zzakk.zza());
            if (zzukVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzja.zzc().zza(zzjh.zzc().zza(zzukVarZza.zzd().zzb()).zza(zza(zzqeVar.zzc())).zza()).zza(zzaaf.zza(zzukVarZza.zzd().zzd(), zzck.zza(zzckVar))).zza(zzqeVar.zze()).zza();
        } catch (zzalf unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }

    static {
        zzaae zzaaeVarZzb = zzqq.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zza = zzaaeVarZzb;
        zzb = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzju
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                zzjh zzjhVar = (zzjh) zzceVar;
                return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.AesSivKey").zza(((zzun) ((zzaky) zzun.zzc().zza(zzjhVar.zzb()).zze())).a_()).zza(zzjr.zza(zzjhVar.zzd())).zze()));
            }
        }, zzjh.class, zzqd.class);
        zzc = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjt
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                return zzjr.zzb((zzqd) zzqiVar);
            }
        }, zzaaeVarZzb, zzqd.class);
        zzd = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjw
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzja zzjaVar = (zzja) zzbmVar;
                return zzqe.zza("type.googleapis.com/google.crypto.tink.AesSivKey", ((zzuk) ((zzaky) zzuk.zzb().zza(zzajp.zza(zzjaVar.zzf().zza(zzck.zza(zzckVar)))).zze())).a_(), zzws.zza.SYMMETRIC, zzjr.zza(((zzjh) ((zzjm) zzjaVar.zza())).zzd()), zzjaVar.zzb());
            }
        }, zzja.class, zzqe.class);
        zze = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzjr.zzb((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb, zzqe.class);
        HashMap map = new HashMap();
        zzjh.zzb zzbVar = zzjh.zzb.zzc;
        zzxu zzxuVar = zzxu.RAW;
        map.put(zzbVar, zzxuVar);
        zzjh.zzb zzbVar2 = zzjh.zzb.zza;
        zzxu zzxuVar2 = zzxu.TINK;
        map.put(zzbVar2, zzxuVar2);
        zzjh.zzb zzbVar3 = zzjh.zzb.zzb;
        zzxu zzxuVar3 = zzxu.CRUNCHY;
        map.put(zzbVar3, zzxuVar3);
        zzf = Collections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(zzxu.class);
        enumMap.put(zzxuVar, zzbVar);
        enumMap.put(zzxuVar2, zzbVar2);
        enumMap.put(zzxuVar3, zzbVar3);
        enumMap.put(zzxu.LEGACY, zzbVar3);
        zzg = Collections.unmodifiableMap(enumMap);
    }

    private static zzjh.zzb zza(zzxu zzxuVar) throws GeneralSecurityException {
        Map<zzxu, zzjh.zzb> map = zzg;
        if (map.containsKey(zzxuVar)) {
            return map.get(zzxuVar);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxuVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzjh zzb(zzqd zzqdVar) throws GeneralSecurityException {
        if (zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                zzun zzunVarZza = zzun.zza(zzqdVar.zza().zze(), zzakk.zza());
                if (zzunVarZza.zzb() == 0) {
                    return zzjh.zzc().zza(zzunVarZza.zza()).zza(zza(zzqdVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf e2) {
                throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + zzqdVar.zza().zzf());
    }

    private static zzxu zza(zzjh.zzb zzbVar) throws GeneralSecurityException {
        Map<zzjh.zzb, zzxu> map = zzf;
        if (map.containsKey(zzbVar)) {
            return map.get(zzbVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVar));
    }

    public static void zza() throws GeneralSecurityException {
        zzpc zzpcVarZza = zzpc.zza();
        zzpcVarZza.zza(zzb);
        zzpcVarZza.zza(zzc);
        zzpcVarZza.zza(zzd);
        zzpcVarZza.zza(zze);
    }
}

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfsk {
    private final zzfsw zza;
    private final zzfsw zzb;
    private final boolean zzc;
    private final zzfso zzd;
    private final zzfsr zze;

    public static zzfsk zza(zzfso zzfsoVar, zzfsr zzfsrVar, zzfsw zzfswVar, zzfsw zzfswVar2, boolean z2) {
        zzfuh.zzb(zzfsoVar, "CreativeType is null");
        zzfuh.zzb(zzfsrVar, "ImpressionType is null");
        zzfuh.zzb(zzfswVar, "Impression owner is null");
        if (zzfswVar == zzfsw.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfsoVar == zzfso.DEFINED_BY_JAVASCRIPT && zzfswVar == zzfsw.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfsrVar == zzfsr.DEFINED_BY_JAVASCRIPT && zzfswVar == zzfsw.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfsk(zzfsoVar, zzfsrVar, zzfswVar, zzfswVar2, z2);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfud.zzc(jSONObject, "impressionOwner", this.zza);
        zzfud.zzc(jSONObject, "mediaEventsOwner", this.zzb);
        zzfud.zzc(jSONObject, "creativeType", this.zzd);
        zzfud.zzc(jSONObject, "impressionType", this.zze);
        zzfud.zzc(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }

    private zzfsk(zzfso zzfsoVar, zzfsr zzfsrVar, zzfsw zzfswVar, zzfsw zzfswVar2, boolean z2) {
        this.zzd = zzfsoVar;
        this.zze = zzfsrVar;
        this.zza = zzfswVar;
        if (zzfswVar2 == null) {
            this.zzb = zzfsw.NONE;
        } else {
            this.zzb = zzfswVar2;
        }
        this.zzc = z2;
    }
}

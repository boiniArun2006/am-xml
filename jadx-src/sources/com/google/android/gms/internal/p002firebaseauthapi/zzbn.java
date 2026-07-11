package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzbn {
    private final zzce zza;

    public static zzbn zza(zzce zzceVar) throws GeneralSecurityException {
        return new zzbn(zzceVar);
    }

    private final zzww zzb() {
        try {
            zzce zzceVar = this.zza;
            return zzceVar instanceof zzoh ? ((zzoh) zzceVar).zzb().zza() : ((zzqd) zzpc.zza().zza(this.zza, zzqd.class)).zza();
        } catch (GeneralSecurityException e2) {
            throw new zzqo("Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + String.valueOf(this.zza), e2);
        }
    }

    public final zzce zza() throws GeneralSecurityException {
        zzce zzceVar = this.zza;
        return zzceVar != null ? zzceVar : zzcm.zza(zzb().zzk());
    }

    private zzbn(zzce zzceVar) {
        this.zza = zzceVar;
    }
}

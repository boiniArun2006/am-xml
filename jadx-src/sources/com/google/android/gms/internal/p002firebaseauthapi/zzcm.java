package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzcm {
    public static zzce zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzww zzwwVarZza = zzww.zza(bArr, zzakk.zza());
            zzpc zzpcVarZza = zzpc.zza();
            zzqd zzqdVarZza = zzqd.zza(zzwwVarZza);
            return !zzpcVarZza.zzc(zzqdVarZza) ? new zzoh(zzqdVarZza) : zzpcVarZza.zza(zzqdVarZza);
        } catch (IOException e2) {
            throw new GeneralSecurityException("Failed to parse proto", e2);
        }
    }

    public static byte[] zza(zzce zzceVar) throws GeneralSecurityException {
        if (zzceVar instanceof zzoh) {
            return ((zzoh) zzceVar).zzb().zza().zzk();
        }
        return ((zzqd) zzpc.zza().zza(zzceVar, zzqd.class)).zza().zzk();
    }
}

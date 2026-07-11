package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzlm {
    private static final byte[] zza = new byte[0];

    public static zzlq zza(zzke zzkeVar) throws GeneralSecurityException {
        zzce zzceVarZzb = zzkeVar.zzb();
        if (zzceVarZzb instanceof zzdz) {
            return new zzlo((zzdz) zzceVarZzb);
        }
        if (zzceVarZzb instanceof zzdk) {
            return new zzlp((zzdk) zzceVarZzb);
        }
        if (zzceVarZzb instanceof zzjh) {
            return new zzlr((zzjh) zzceVarZzb);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: " + String.valueOf(zzceVarZzb));
    }
}

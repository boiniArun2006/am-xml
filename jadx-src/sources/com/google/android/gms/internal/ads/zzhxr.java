package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhxr implements zzhnp {
    @Override // com.google.android.gms.internal.ads.zzhnp
    public final byte[] zza(byte[] bArr, int i2) throws GeneralSecurityException {
        throw null;
    }

    public static zzhnp zzb(zzhnn zzhnnVar) throws GeneralSecurityException {
        zzhnp zzhnpVarZzb = zzhnt.zzb(zzhnnVar);
        try {
            return new zzhxq(zzhnpVarZzb, zzhnu.zzb(zzhnnVar), null);
        } catch (GeneralSecurityException unused) {
            return zzhnpVarZzb;
        }
    }
}

package com.google.android.gms.internal.ads;

import com.caoccao.javet.values.primitive.V8ValueNull;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhbc {
    public static final zzhbp zzb(zzhbp zzhbpVar) throws GeneralSecurityException {
        return zzhbpVar != null ? zzhbpVar : zzhbv.zzb(zza(null).zzaN());
    }

    static final zzhqf zza(zzhbp zzhbpVar) {
        try {
            return ((zzhlc) zzhkg.zza().zzk(null, zzhlc.class)).zzc();
        } catch (GeneralSecurityException e2) {
            throw new zzhlm("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(V8ValueNull.NULL), e2);
        }
    }
}

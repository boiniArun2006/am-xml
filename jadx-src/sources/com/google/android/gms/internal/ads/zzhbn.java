package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhbn {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzhbm zza(String str) throws GeneralSecurityException {
        for (zzhbm zzhbmVar : zza) {
            if (zzhbmVar.zza()) {
                return zzhbmVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}

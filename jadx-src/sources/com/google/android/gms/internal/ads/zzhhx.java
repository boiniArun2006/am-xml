package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhhx extends ThreadLocal {
    protected static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zzhxe.zza.zzb("AES/GCM-SIV/NoPadding");
            if (zzhgq.zzb(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    zzhhx() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}

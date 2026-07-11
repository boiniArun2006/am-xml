package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzhxs extends ThreadLocal {
    final /* synthetic */ zzhxt zza;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            zzhxe zzhxeVar = zzhxe.zzb;
            zzhxt zzhxtVar = this.zza;
            Mac mac = (Mac) zzhxeVar.zzb(zzhxtVar.zzb());
            mac.init(zzhxtVar.zzc());
            return mac;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    zzhxs(zzhxt zzhxtVar) {
        Objects.requireNonNull(zzhxtVar);
        this.zza = zzhxtVar;
    }
}

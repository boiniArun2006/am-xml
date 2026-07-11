package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdn extends Lambda implements Function0 {
    public static final zzdn zza = new zzdn();

    public zzdn() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws zzbd {
        int i2 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzbr.class.getName().hashCode());
        if (objZzb != null) {
            return (zzbr) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}

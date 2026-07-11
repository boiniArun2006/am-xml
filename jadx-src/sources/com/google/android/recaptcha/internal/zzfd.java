package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzfd extends Lambda implements Function0 {
    public static final zzfd zza = new zzfd();

    public zzfd() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws zzbd {
        int i2 = zzav.zza;
        Object objZzb = zzau.zza().zzb(zzaq.class.getName().hashCode());
        if (objZzb != null) {
            return (zzaq) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}

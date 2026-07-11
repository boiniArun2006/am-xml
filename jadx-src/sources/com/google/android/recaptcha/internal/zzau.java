package com.google.android.recaptcha.internal;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzau {
    public static final zzav zza() {
        zzav zzavVar = zzav.zzb;
        if (zzavVar == null) {
            zzav zzavVar2 = new zzav((Map) zzav.zzd.invoke(), null);
            zzav.zzc.clear();
            zzav.zzb = zzavVar2;
            return zzavVar2;
        }
        return zzavVar;
    }
}

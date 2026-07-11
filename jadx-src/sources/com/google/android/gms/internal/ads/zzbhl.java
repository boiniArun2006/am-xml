package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Deprecated
public final class zzbhl {
    public static boolean zza(@Nullable zzbht zzbhtVar, @Nullable zzbhq zzbhqVar, String... strArr) {
        if (zzbhqVar == null) {
            return false;
        }
        zzbhtVar.zzb(zzbhqVar, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), strArr);
        return true;
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfko implements zzikg {
    private zzfko(zzfkn zzfknVar) {
    }

    public static zzfko zza(zzfkn zzfknVar) {
        return new zzfko(zzfknVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zziko.zzb(defaultClock);
        return defaultClock;
    }
}

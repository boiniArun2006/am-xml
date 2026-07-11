package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzfnm {
    private static final com.google.common.util.concurrent.Xo zza = zzgzo.zza(null);
    private final zzgzy zzb;
    private final ScheduledExecutorService zzc;
    private final zzfnn zzd;

    public zzfnm(zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzfnn zzfnnVar) {
        this.zzb = zzgzyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfnnVar;
    }

    protected abstract String zzc(Object obj);

    final /* synthetic */ zzgzy zze() {
        return this.zzb;
    }

    final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzfnn zzg() {
        return this.zzd;
    }

    public final zzfnl zza(Object obj, com.google.common.util.concurrent.Xo xo) {
        return new zzfnl(this, obj, null, xo, Collections.singletonList(xo), xo, null);
    }

    public final zzfnd zzb(Object obj, com.google.common.util.concurrent.Xo... xoArr) {
        return new zzfnd(this, obj, Arrays.asList(xoArr), null);
    }
}

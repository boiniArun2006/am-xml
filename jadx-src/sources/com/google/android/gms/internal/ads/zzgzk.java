package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzgzk extends zzgzi implements com.google.common.util.concurrent.Xo {
    protected zzgzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    protected /* bridge */ /* synthetic */ Future zza() {
        throw null;
    }

    protected abstract com.google.common.util.concurrent.Xo zzc();

    @Override // com.google.common.util.concurrent.Xo
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }
}

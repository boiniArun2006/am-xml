package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzei extends zzeg implements zzeu {
    protected zzei() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg
    protected /* bridge */ /* synthetic */ Future zzc() {
        throw null;
    }

    protected abstract zzeu zzd();

    @Override // com.google.android.gms.internal.play_billing.zzeu
    public final void zzb(Runnable runnable, Executor executor) {
        zzd().zzb(runnable, executor);
    }
}

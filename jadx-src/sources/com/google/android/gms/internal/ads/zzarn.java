package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzarn implements Executor {
    final /* synthetic */ Handler zza;

    zzarn(zzarp zzarpVar, Handler handler) {
        this.zza = handler;
        Objects.requireNonNull(zzarpVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface zzabl extends Executor {
    static zzabl zzb(Executor executor, zzdr zzdrVar) {
        return new zzabk(executor, zzdrVar);
    }

    void zza();
}

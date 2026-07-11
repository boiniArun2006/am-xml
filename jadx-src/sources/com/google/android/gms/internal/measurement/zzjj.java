package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzjj extends ContentObserver {
    final /* synthetic */ zzjl zza;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        this.zza.zzb().set(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjj(zzjl zzjlVar, Handler handler) {
        super(null);
        Objects.requireNonNull(zzjlVar);
        this.zza = zzjlVar;
    }
}

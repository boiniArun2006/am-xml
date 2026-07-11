package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzjo extends ContentObserver {
    final /* synthetic */ zzjq zza;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        this.zza.zzc();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjo(zzjq zzjqVar, Handler handler) {
        super(null);
        Objects.requireNonNull(zzjqVar);
        this.zza = zzjqVar;
    }
}

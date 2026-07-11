package com.google.android.recaptcha.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzfz {
    private final zzjj zza;

    public zzfz() {
        this(1);
    }

    public zzfz(int i2) {
        this.zza = zzjj.zza(i2);
    }

    public final List zza() {
        return CollectionsKt.toList(this.zza);
    }

    public final boolean zzb(List list) {
        this.zza.add(list);
        return true;
    }

    public final List zwk() {
        return zza();
    }
}

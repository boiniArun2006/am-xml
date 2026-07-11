package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzq extends zzai {
    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzq(zzt zztVar, String str) {
        super("unmonitored");
        Objects.requireNonNull(zztVar);
    }
}

package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgvd extends zzgws {
    final /* synthetic */ zzgve zza;

    @Override // com.google.android.gms.internal.ads.zzgwr
    final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgvd(zzgve zzgveVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgveVar);
        this.zza = zzgveVar;
    }
}

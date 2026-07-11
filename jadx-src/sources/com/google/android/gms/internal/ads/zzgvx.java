package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgvx extends zzgvz implements Serializable {
    static final zzgvx zza = new zzgvx();

    private zzgvx() {
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzgvz
    public final zzgvz zza() {
        return zzgwh.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgvz, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }
}

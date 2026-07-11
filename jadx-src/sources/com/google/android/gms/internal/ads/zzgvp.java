package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgvp extends zzgvt {
    final /* synthetic */ Comparator zza;

    zzgvp(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    final Map zza() {
        return new TreeMap(this.zza);
    }
}

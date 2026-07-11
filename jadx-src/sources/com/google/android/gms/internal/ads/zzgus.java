package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class zzgus<K, V> extends zzgun<K, V> implements zzgvn<K, V> {
    private final transient zzgup<V> emptySet;
    private transient zzgup zza;

    public final zzgup zza() {
        zzgup zzgupVar = this.zza;
        if (zzgupVar != null) {
            return zzgupVar;
        }
        zzgur zzgurVar = new zzgur(this);
        this.zza = zzgurVar;
        return zzgurVar;
    }

    zzgus(zzgui zzguiVar, int i2, Comparator comparator) {
        super(zzguiVar, i2);
        this.emptySet = zzgwg.zza;
    }
}

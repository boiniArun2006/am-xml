package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class zzgun<K, V> extends zzgsz<K, V> implements Serializable {
    final transient zzgui<K, ? extends zzgub<V>> map;
    final transient int size;

    zzgun(zzgui zzguiVar, int i2) {
        this.map = zzguiVar;
        this.size = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgvn
    public final int zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy, com.google.android.gms.internal.ads.zzgvn
    @Deprecated
    public final boolean zze(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvn
    @Deprecated
    public final void zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy, com.google.android.gms.internal.ads.zzgvn
    public final /* bridge */ /* synthetic */ Collection zzt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy, com.google.android.gms.internal.ads.zzgvn
    public /* synthetic */ Map zzu() {
        return this.map;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    final Set zzh() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    final /* synthetic */ Collection zzj() {
        return new zzgum(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    final Map zzl() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    public final boolean zzr(Object obj) {
        return obj != null && super.zzr(obj);
    }
}

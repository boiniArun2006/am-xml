package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzicb extends AbstractList {
    private final zzibz zza;
    private final zzica zzb;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return this.zzb.zzb(this.zza.zzf(i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    public zzicb(zzibz zzibzVar, zzica zzicaVar) {
        this.zza = zzibzVar;
        this.zzb = zzicaVar;
    }
}

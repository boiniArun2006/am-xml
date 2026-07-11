package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class zzgsp extends zzgsi implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzgsv zze;

    public SortedMap headMap(Object obj) {
        return new zzgsp(this.zze, zzg().headMap(obj));
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzgsp(this.zze, zzg().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzgsp(this.zze, zzg().tailMap(obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgvl
    /* JADX INFO: renamed from: zze */
    public SortedSet zzh() {
        return new zzgsq(this.zze, zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzgsi, com.google.android.gms.internal.ads.zzgvl, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetZzh = zzh();
        this.zzd = sortedSetZzh;
        return sortedSetZzh;
    }

    SortedMap zzg() {
        return (SortedMap) ((zzgsi) this).zza;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgsp(zzgsv zzgsvVar, SortedMap sortedMap) {
        super(zzgsvVar, sortedMap);
        Objects.requireNonNull(zzgsvVar);
        this.zze = zzgsvVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return zzg().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzg().firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzg().lastKey();
    }
}

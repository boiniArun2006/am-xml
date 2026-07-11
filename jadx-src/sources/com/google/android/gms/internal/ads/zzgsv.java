package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class zzgsv extends zzgsy implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    Collection zza(Collection collection) {
        throw null;
    }

    Collection zzb(Object obj, Collection collection) {
        throw null;
    }

    abstract Collection zzc();

    @Override // com.google.android.gms.internal.ads.zzgvn
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    Set zzh() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    Map zzl() {
        throw null;
    }

    final /* synthetic */ Map zzo() {
        return this.zza;
    }

    final /* synthetic */ int zzp() {
        return this.zzb;
    }

    final /* synthetic */ void zzq(int i2) {
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy, com.google.android.gms.internal.ads.zzgvn
    public final boolean zze(Object obj, Object obj2) {
        Map map = this.zza;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZzc = zzc();
        if (!collectionZzc.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        map.put(obj, collectionZzc);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgvn
    public final void zzf() {
        Map map = this.zza;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.zzb = 0;
    }

    final List zzg(Object obj, List list, zzgss zzgssVar) {
        return list instanceof RandomAccess ? new zzgso(this, obj, list, zzgssVar) : new zzgsu(this, obj, list, zzgssVar);
    }

    final Set zzi() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzgsn(this, (NavigableMap) map) : map instanceof SortedMap ? new zzgsq(this, (SortedMap) map) : new zzgsl(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    final Collection zzj() {
        return new zzgsx(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    final Iterator zzk() {
        return new zzgsf(this);
    }

    final Map zzm() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzgsm(this, (NavigableMap) map) : map instanceof SortedMap ? new zzgsp(this, (SortedMap) map) : new zzgsi(this, map);
    }

    final /* synthetic */ void zzn(Object obj) {
        Object objRemove;
        try {
            objRemove = this.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.zzb -= size;
        }
    }

    protected zzgsv(Map map) {
        zzgrc.zza(map.isEmpty());
        this.zza = map;
    }
}

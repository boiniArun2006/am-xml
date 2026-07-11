package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgwk extends zzgwo {
    final /* synthetic */ Set zza;
    final /* synthetic */ Set zzb;

    @Override // com.google.android.gms.internal.ads.zzgwo
    final int zzb() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgwk(Set set, Set set2) {
        super(null);
        this.zza = set;
        this.zzb = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.contains(obj) && this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zza.containsAll(collection) && this.zzb.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.zzb, this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.zza.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (this.zzb.contains(it.next())) {
                i2++;
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: zza */
    public final zzgwt iterator() {
        return new zzgwj(this, this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgwo
    final int zzc() {
        return Math.min(zzgwo.zzd(this.zza), zzgwo.zzd(this.zzb));
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class zzas<E> extends zzai<E> implements Set<E> {
    private transient zzaj<E> zza;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return zzax.zza(this, obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public zzaj<E> zzc() {
        zzaj<E> zzajVar = this.zza;
        if (zzajVar != null) {
            return zzajVar;
        }
        zzaj<E> zzajVarZzg = zzg();
        this.zza = zzajVarZzg;
        return zzajVarZzg;
    }

    zzas() {
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzax.zza(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    zzaj<E> zzg() {
        return zzaj.zza(toArray());
    }
}

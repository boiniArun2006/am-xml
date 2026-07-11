package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzjj extends zzjn implements Serializable {
    final int zza;
    private final Queue zzb;

    @Override // com.google.android.recaptcha.internal.zzjl, com.google.android.recaptcha.internal.zzjm
    protected final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzjn, com.google.android.recaptcha.internal.zzjl
    protected final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzjn
    protected final Queue zzd() {
        return this.zzb;
    }

    public static zzjj zza(int i2) {
        return new zzjj(i2);
    }

    private zzjj(int i2) {
        if (i2 >= 0) {
            this.zzb = new ArrayDeque(i2);
            this.zza = i2;
            return;
        }
        throw new IllegalArgumentException(zzji.zza("maxSize (%s) must >= 0", Integer.valueOf(i2)));
    }

    @Override // com.google.android.recaptcha.internal.zzjl, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzjl, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z2;
        int size = collection.size();
        if (size >= this.zza) {
            clear();
            int i2 = size - this.zza;
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzjf.zzb(z2, "number to skip cannot be negative");
            return zzjq.zza(this, new zzjp(collection, i2).iterator());
        }
        return zzjq.zza(this, collection.iterator());
    }

    @Override // com.google.android.recaptcha.internal.zzjn, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}

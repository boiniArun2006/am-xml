package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class zzgtz extends zzgua {
    Object[] zza;
    int zzb;
    boolean zzc;

    final void zzb(Object[] objArr, int i2) {
        zzgvy.zza(objArr, 2);
        zzf(2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgua
    public /* bridge */ /* synthetic */ zzgua zzd(Object obj) {
        throw null;
    }

    private final void zzf(int i2) {
        int length = this.zza.length;
        int iZze = zzgua.zze(length, this.zzb + i2);
        if (iZze > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, iZze);
            this.zzc = false;
        }
    }

    public final zzgua zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size());
            if (collection instanceof zzgub) {
                this.zzb = ((zzgub) collection).zzg(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzd(it.next());
        }
        return this;
    }

    zzgtz(int i2) {
        zzgtb.zzb(i2, "initialCapacity");
        this.zza = new Object[i2];
        this.zzb = 0;
    }

    public final zzgtz zza(Object obj) {
        obj.getClass();
        zzf(1);
        Object[] objArr = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        objArr[i2] = obj;
        return this;
    }
}

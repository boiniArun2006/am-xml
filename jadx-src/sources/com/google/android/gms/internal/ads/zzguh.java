package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzguh {
    Object[] zza;
    int zzb;
    zzgug zzc;

    public zzguh() {
        this(4);
    }

    public final zzgui zzc() {
        return zzf(true);
    }

    public final zzgui zzd() {
        return zzf(false);
    }

    zzguh(int i2) {
        this.zza = new Object[i2 + i2];
        this.zzb = 0;
    }

    private final void zze(int i2) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i3 = i2 + i2;
        if (i3 > length) {
            this.zza = Arrays.copyOf(objArr, zzgua.zze(length, i3));
        }
    }

    private final zzgui zzf(boolean z2) {
        zzgug zzgugVar;
        zzgug zzgugVar2;
        if (z2 && (zzgugVar2 = this.zzc) != null) {
            throw zzgugVar2.zza();
        }
        zzgwf zzgwfVarZzk = zzgwf.zzk(this.zzb, this.zza, this);
        if (!z2 || (zzgugVar = this.zzc) == null) {
            return zzgwfVarZzk;
        }
        throw zzgugVar.zza();
    }

    public final zzguh zza(Object obj, Object obj2) {
        zze(this.zzb + 1);
        zzgtb.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + i2;
        objArr[i3] = obj;
        objArr[i3 + 1] = obj2;
        this.zzb = i2 + 1;
        return this;
    }

    public final zzguh zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zze(this.zzb + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }
}

package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzjp extends zzjk {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    zzjp(Iterable iterable, int i2) {
        this.zza = iterable;
        this.zzb = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i2 = this.zzb;
        Iterator it = iterable.iterator();
        it.getClass();
        zzjf.zzb(i2 >= 0, "numberToAdvance must be nonnegative");
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            it.next();
        }
        return new zzjo(this, it);
    }
}

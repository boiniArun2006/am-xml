package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyh;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class zzgyu extends zzgyh.zzf {
    private static final zzgyr zzbn;
    private static final zzgzw zzbo = new zzgzw(zzgyu.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    zzgyu(int i2) {
        this.remainingField = i2;
    }

    abstract void zzf(Set set);

    static {
        Throwable th;
        zzgyr zzgytVar;
        byte[] bArr = null;
        try {
            zzgytVar = new zzgys(bArr);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzgytVar = new zzgyt(bArr);
        }
        zzbn = zzgytVar;
        if (th != null) {
            zzbo.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(setNewSetFromMap);
        zzbn.zza(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptionsField;
        Objects.requireNonNull(set2);
        return set2;
    }

    final int zzC() {
        return zzbn.zzb(this);
    }
}

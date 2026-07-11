package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzenc {

    @GuardedBy
    private final zzhah zzc;

    @GuardedBy
    private zzens zzf;
    private final String zzh;
    private final int zzi;
    private final zzenr zzj;
    private zzfir zzk;

    @GuardedBy
    private final Map zza = new HashMap();

    @GuardedBy
    private final List zzb = new ArrayList();

    @GuardedBy
    private final List zzd = new ArrayList();

    @GuardedBy
    private final Set zze = new HashSet();

    @GuardedBy
    private int zzg = Integer.MAX_VALUE;

    @GuardedBy
    private boolean zzl = false;

    private final synchronized boolean zze() {
        if (this.zzl) {
            return false;
        }
        List list = this.zzb;
        if (!list.isEmpty() && ((zzfir) list.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list2 = this.zzd;
            if (list2.size() < this.zzi) {
                if (zzf(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzf(boolean z2) {
        try {
            for (zzfir zzfirVar : this.zzb) {
                Integer num = (Integer) this.zza.get(zzfirVar);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z2 || !this.zze.contains(zzfirVar.zzat)) {
                    int i2 = this.zzg;
                    if (iIntValue < i2) {
                        return true;
                    }
                    if (iIntValue > i2) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzg() {
        try {
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.zza.get((zzfir) it.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.zzg) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzh() {
        if (!zzf(true)) {
            if (!zzg()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized void zzi() {
        this.zzj.zzd(this.zzk);
        zzens zzensVar = this.zzf;
        if (zzensVar != null) {
            this.zzc.zza(zzensVar);
        } else {
            this.zzc.zzb(new zzenv(3, this.zzh));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r2.zzav == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r6.zzl = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        r6.zzd.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return (com.google.android.gms.internal.ads.zzfir) r1.remove(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized zzfir zza() {
        try {
            if (zze()) {
                int i2 = 0;
                while (true) {
                    List list = this.zzb;
                    if (i2 >= list.size()) {
                        break;
                    }
                    zzfir zzfirVar = (zzfir) list.get(i2);
                    String str = zzfirVar.zzat;
                    Set set = this.zze;
                    if (!set.contains(str)) {
                        break;
                    }
                    i2++;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void zzb(zzens zzensVar, zzfir zzfirVar) {
        this.zzl = false;
        this.zzd.remove(zzfirVar);
        if (zzd()) {
            zzensVar.zzm();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfirVar);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (iIntValue > this.zzg) {
            this.zzj.zzf(zzfirVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzf(this.zzk);
        }
        this.zzg = iIntValue;
        this.zzf = zzensVar;
        this.zzk = zzfirVar;
        if (zzh()) {
            return;
        }
        zzi();
    }

    final synchronized void zzc(Throwable th, zzfir zzfirVar) {
        this.zzl = false;
        this.zzd.remove(zzfirVar);
        this.zze.remove(zzfirVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zzi();
    }

    final synchronized boolean zzd() {
        return this.zzc.isDone();
    }

    zzenc(zzfjc zzfjcVar, zzenr zzenrVar, zzhah zzhahVar) {
        this.zzi = zzfjcVar.zzb.zzb.zzr;
        this.zzj = zzenrVar;
        this.zzc = zzhahVar;
        this.zzh = zzeny.zzb(zzfjcVar);
        List list = zzfjcVar.zzb.zza;
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.put((zzfir) list.get(i2), Integer.valueOf(i2));
        }
        this.zzb.addAll(list);
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzvu implements zzye {
    private final zzguf zza;
    private long zzb;

    public zzvu(List list, List list2) {
        int i2 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        zzgrc.zza(list.size() == list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzgucVar.zzf(new zzvt((zzye) list.get(i3), (List) list2.get(i3)));
        }
        this.zza = zzgucVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzg(long j2) {
        int i2 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i2 >= zzgufVar.size()) {
                return;
            }
            ((zzvt) zzgufVar.get(i2)).zzg(j2);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        int i2 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i2 >= zzgufVar.size()) {
                break;
            }
            zzvt zzvtVar = (zzvt) zzgufVar.get(i2);
            long jZzi = zzvtVar.zzi();
            if ((zzvtVar.zza().contains(1) || zzvtVar.zza().contains(2) || zzvtVar.zza().contains(4)) && jZzi != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzi);
            }
            if (jZzi != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzi);
            }
            i2++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j2 = this.zzb;
        return j2 != -9223372036854775807L ? j2 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        int i2 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i2 >= zzgufVar.size()) {
                break;
            }
            long jZzl = ((zzvt) zzgufVar.get(i2)).zzl();
            if (jZzl != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzl);
            }
            i2++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        boolean zZzm;
        boolean z2 = false;
        do {
            long jZzl = zzl();
            if (jZzl == Long.MIN_VALUE) {
                break;
            }
            int i2 = 0;
            zZzm = false;
            while (true) {
                zzguf zzgufVar = this.zza;
                if (i2 >= zzgufVar.size()) {
                    break;
                }
                long jZzl2 = ((zzvt) zzgufVar.get(i2)).zzl();
                boolean z3 = jZzl2 != Long.MIN_VALUE && jZzl2 <= zzllVar.zza;
                if (jZzl2 == jZzl || z3) {
                    zZzm |= ((zzvt) zzgufVar.get(i2)).zzm(zzllVar);
                }
                i2++;
            }
            z2 |= zZzm;
        } while (zZzm);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        int i2 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i2 >= zzgufVar.size()) {
                return false;
            }
            if (((zzvt) zzgufVar.get(i2)).zzn()) {
                return true;
            }
            i2++;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzmc {
    private final zzpq zza;
    private final zzmb zze;
    private final zzmx zzh;
    private final zzdx zzi;
    private boolean zzj;

    @Nullable
    private zzhz zzk;
    private zzyf zzl = new zzyf(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public final zzbf zza(int i2, int i3, List list) {
        zzgrc.zza(i2 >= 0 && i2 <= i3 && i3 <= zzc());
        zzgrc.zza(list.size() == i3 - i2);
        for (int i5 = i2; i5 < i3; i5++) {
            ((zzlz) this.zzb.get(i5)).zza.zzA((zzak) list.get(i5 - i2));
        }
        return zzh();
    }

    public final boolean zzb() {
        return this.zzj;
    }

    final /* synthetic */ zzmx zzj() {
        return this.zzh;
    }

    final /* synthetic */ zzdx zzk() {
        return this.zzi;
    }

    public final zzbf zzn(int i2, int i3, zzyf zzyfVar) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= i3 && i3 <= zzc()) {
            z2 = true;
        }
        zzgrc.zza(z2);
        this.zzl = zzyfVar;
        zzt(i2, i3);
        return zzh();
    }

    public final zzyf zzq() {
        return this.zzl;
    }

    private final void zzr() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzlz zzlzVar = (zzlz) it.next();
            if (zzlzVar.zzc.isEmpty()) {
                zzs(zzlzVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzlz zzlzVar) {
        zzly zzlyVar = (zzly) this.zzf.get(zzlzVar);
        if (zzlyVar != null) {
            zzlyVar.zza.zzr(zzlyVar.zzb);
        }
    }

    private final void zzt(int i2, int i3) {
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            }
            zzlz zzlzVar = (zzlz) this.zzb.remove(i3);
            this.zzd.remove(zzlzVar.zzb);
            zzu(i3, -zzlzVar.zza.zzz().zza());
            zzlzVar.zze = true;
            if (this.zzj) {
                zzw(zzlzVar);
            }
        }
    }

    private final void zzu(int i2, int i3) {
        while (true) {
            List list = this.zzb;
            if (i2 >= list.size()) {
                return;
            }
            ((zzlz) list.get(i2)).zzd += i3;
            i2++;
        }
    }

    private final void zzv(zzlz zzlzVar) {
        zzwf zzwfVar = zzlzVar.zza;
        zzwl zzwlVar = new zzwl() { // from class: com.google.android.gms.internal.ads.zzma
            @Override // com.google.android.gms.internal.ads.zzwl
            public final /* synthetic */ void zza(zzwm zzwmVar, zzbf zzbfVar) {
                this.zza.zzi(zzwmVar, zzbfVar);
            }
        };
        zzlx zzlxVar = new zzlx(this, zzlzVar);
        this.zzf.put(zzlzVar, new zzly(zzwfVar, zzwlVar, zzlxVar));
        zzwfVar.zzl(new Handler(zzfj.zze(), null), zzlxVar);
        zzwfVar.zzn(new Handler(zzfj.zze(), null), zzlxVar);
        zzwfVar.zzp(zzwlVar, this.zzk, this.zza);
    }

    private final void zzw(zzlz zzlzVar) {
        if (zzlzVar.zze && zzlzVar.zzc.isEmpty()) {
            zzly zzlyVar = (zzly) this.zzf.remove(zzlzVar);
            zzlyVar.getClass();
            zzwm zzwmVar = zzlyVar.zza;
            zzwmVar.zzs(zzlyVar.zzb);
            zzlx zzlxVar = zzlyVar.zzc;
            zzwmVar.zzm(zzlxVar);
            zzwmVar.zzo(zzlxVar);
            this.zzg.remove(zzlzVar);
        }
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final void zzd(@Nullable zzhz zzhzVar) {
        zzgrc.zzi(!this.zzj);
        this.zzk = zzhzVar;
        int i2 = 0;
        while (true) {
            List list = this.zzb;
            if (i2 >= list.size()) {
                this.zzj = true;
                return;
            }
            zzlz zzlzVar = (zzlz) list.get(i2);
            zzv(zzlzVar);
            this.zzg.add(zzlzVar);
            i2++;
        }
    }

    public final zzwi zze(zzwk zzwkVar, zzaan zzaanVar, long j2) {
        int i2 = zzmj.zzb;
        Pair pair = (Pair) zzwkVar.zza;
        Object obj = pair.first;
        zzwk zzwkVarZza = zzwkVar.zza(pair.second);
        zzlz zzlzVar = (zzlz) this.zzd.get(obj);
        zzlzVar.getClass();
        this.zzg.add(zzlzVar);
        zzly zzlyVar = (zzly) this.zzf.get(zzlzVar);
        if (zzlyVar != null) {
            zzlyVar.zza.zzq(zzlyVar.zzb);
        }
        zzlzVar.zzc.add(zzwkVarZza);
        zzwc zzwcVarZzC = zzlzVar.zza.zzG(zzwkVarZza, zzaanVar, j2);
        this.zzc.put(zzwcVarZzC, zzlzVar);
        zzr();
        return zzwcVarZzC;
    }

    public final void zzf(zzwi zzwiVar) {
        IdentityHashMap identityHashMap = this.zzc;
        zzlz zzlzVar = (zzlz) identityHashMap.remove(zzwiVar);
        zzlzVar.getClass();
        zzlzVar.zza.zzD(zzwiVar);
        zzlzVar.zzc.remove(((zzwc) zzwiVar).zza);
        if (!identityHashMap.isEmpty()) {
            zzr();
        }
        zzw(zzlzVar);
    }

    public final void zzg() {
        for (zzly zzlyVar : this.zzf.values()) {
            try {
                zzlyVar.zza.zzs(zzlyVar.zzb);
            } catch (RuntimeException e2) {
                zzee.zzf("MediaSourceList", "Failed to release child source.", e2);
            }
            zzwm zzwmVar = zzlyVar.zza;
            zzlx zzlxVar = zzlyVar.zzc;
            zzwmVar.zzm(zzlxVar);
            zzwmVar.zzo(zzlxVar);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final zzbf zzh() {
        List list = this.zzb;
        if (list.isEmpty()) {
            return zzbf.zza;
        }
        int iZza = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzlz zzlzVar = (zzlz) list.get(i2);
            zzlzVar.zzd = iZza;
            iZza += zzlzVar.zza.zzz().zza();
        }
        return new zzmj(list, this.zzl);
    }

    final /* synthetic */ void zzi(zzwm zzwmVar, zzbf zzbfVar) {
        this.zze.zzo();
    }

    public final zzbf zzl(List list, zzyf zzyfVar) {
        List list2 = this.zzb;
        zzt(0, list2.size());
        return zzm(list2.size(), list, zzyfVar);
    }

    public zzmc(zzmb zzmbVar, zzmx zzmxVar, zzdx zzdxVar, zzpq zzpqVar) {
        this.zza = zzpqVar;
        this.zze = zzmbVar;
        this.zzh = zzmxVar;
        this.zzi = zzdxVar;
    }

    public final zzbf zzm(int i2, List list, zzyf zzyfVar) {
        if (!list.isEmpty()) {
            this.zzl = zzyfVar;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                zzlz zzlzVar = (zzlz) list.get(i3 - i2);
                if (i3 > 0) {
                    zzlz zzlzVar2 = (zzlz) this.zzb.get(i3 - 1);
                    zzlzVar.zzc(zzlzVar2.zzd + zzlzVar2.zza.zzz().zza());
                } else {
                    zzlzVar.zzc(0);
                }
                zzu(i3, zzlzVar.zza.zzz().zza());
                this.zzb.add(i3, zzlzVar);
                this.zzd.put(zzlzVar.zzb, zzlzVar);
                if (this.zzj) {
                    zzv(zzlzVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzlzVar);
                    } else {
                        zzs(zzlzVar);
                    }
                }
            }
        }
        return zzh();
    }

    public final zzbf zzo(int i2, int i3, int i5, zzyf zzyfVar) {
        boolean z2;
        if (zzc() >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zza(z2);
        this.zzl = null;
        return zzh();
    }

    public final zzbf zzp(zzyf zzyfVar) {
        int iZzc = zzc();
        if (zzyfVar.zza() != iZzc) {
            zzyfVar = zzyfVar.zzg().zzf(0, iZzc);
        }
        this.zzl = zzyfVar;
        return zzh();
    }
}

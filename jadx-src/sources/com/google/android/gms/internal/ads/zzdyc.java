package com.google.android.gms.internal.ads;

import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdyc implements zzfnv {
    private final zzdxt zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdK(zzfno zzfnoVar, String str) {
    }

    private final void zze(zzfno zzfnoVar, boolean z2) {
        zzdyb zzdybVar = (zzdyb) this.zzd.get(zzfnoVar);
        if (zzdybVar == null) {
            return;
        }
        String str = true != z2 ? "f." : "s.";
        Map map = this.zza;
        zzfno zzfnoVarZzb = zzdybVar.zzb();
        if (map.containsKey(zzfnoVarZzb)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfnoVarZzb)).longValue();
            zzdxt zzdxtVar = this.zzb;
            String strZza = zzdybVar.zza();
            Map mapZzc = zzdxtVar.zzc();
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 2);
            sb.append(str);
            sb.append(jElapsedRealtime);
            mapZzc.put(qfEYuUHwj.xtUUYds.concat(strZza), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdL(zzfno zzfnoVar, String str) {
        this.zza.put(zzfnoVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdM(zzfno zzfnoVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfnoVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfnoVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfnoVar)) {
            zze(zzfnoVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdN(zzfno zzfnoVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfnoVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfnoVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfnoVar)) {
            zze(zzfnoVar, true);
        }
    }

    public zzdyc(zzdxt zzdxtVar, Set set, Clock clock) {
        this.zzb = zzdxtVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdyb zzdybVar = (zzdyb) it.next();
            this.zzd.put(zzdybVar.zzc(), zzdybVar);
        }
        this.zzc = clock;
    }
}

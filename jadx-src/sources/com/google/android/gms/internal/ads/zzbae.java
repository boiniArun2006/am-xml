package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.l;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzbae implements zzfxb {
    private final zzfvj zza;
    private final zzfvx zzb;
    private final zzbar zzc;
    private final zzbad zzd;
    private final zzazn zze;
    private final zzbat zzf;
    private final zzbal zzg;
    private final zzbac zzh;

    zzbae(@NonNull zzfvj zzfvjVar, @NonNull zzfvx zzfvxVar, @NonNull zzbar zzbarVar, @NonNull zzbad zzbadVar, @Nullable zzazn zzaznVar, @Nullable zzbat zzbatVar, @Nullable zzbal zzbalVar, @Nullable zzbac zzbacVar) {
        this.zza = zzfvjVar;
        this.zzb = zzfvxVar;
        this.zzc = zzbarVar;
        this.zzd = zzbadVar;
        this.zze = zzaznVar;
        this.zzf = zzbatVar;
        this.zzg = zzbalVar;
        this.zzh = zzbacVar;
    }

    private final Map zzf() {
        HashMap map = new HashMap();
        zzfvj zzfvjVar = this.zza;
        zzaxg zzaxgVarZzb = this.zzb.zzb();
        map.put("v", zzfvjVar.zza());
        map.put("gms", Boolean.valueOf(zzfvjVar.zzc()));
        map.put("gv", Long.valueOf(zzaxgVarZzb.zzd()));
        map.put(l.f62668w, zzaxgVarZzb.zzb());
        map.put("attts", Long.valueOf(zzaxgVarZzb.zzh().zzb()));
        map.put("att", zzaxgVarZzb.zzh().zzd());
        map.put("attkid", zzaxgVarZzb.zzh().zzc());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        zzbal zzbalVar = this.zzg;
        if (zzbalVar != null) {
            map.put("tcq", Long.valueOf(zzbalVar.zze()));
            map.put("tpq", Long.valueOf(zzbalVar.zzd()));
            map.put("tcv", Long.valueOf(zzbalVar.zzf()));
            map.put("tpv", Long.valueOf(zzbalVar.zzg()));
            map.put("tchv", Long.valueOf(zzbalVar.zzi()));
            map.put("tphv", Long.valueOf(zzbalVar.zzh()));
            map.put("tcc", Long.valueOf(zzbalVar.zzj()));
            map.put("tpc", Long.valueOf(zzbalVar.zzk()));
            zzazn zzaznVar = this.zze;
            if (zzaznVar != null) {
                map.put("nt", Long.valueOf(zzaznVar.zzc()));
            }
            zzbat zzbatVar = this.zzf;
            if (zzbatVar != null) {
                map.put("vs", Long.valueOf(zzbatVar.zzc()));
                map.put("vf", Long.valueOf(zzbatVar.zzd()));
            }
        }
        return map;
    }

    final void zza(View view) {
        this.zzc.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzc() {
        zzbac zzbacVar = this.zzh;
        Map mapZzf = zzf();
        if (zzbacVar != null) {
            mapZzf.put(l.f62621B, zzbacVar.zzb());
        }
        return mapZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzd() {
        zzbar zzbarVar = this.zzc;
        Map mapZzf = zzf();
        mapZzf.put("lts", Long.valueOf(zzbarVar.zzc()));
        return mapZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzb() {
        return zzf();
    }
}

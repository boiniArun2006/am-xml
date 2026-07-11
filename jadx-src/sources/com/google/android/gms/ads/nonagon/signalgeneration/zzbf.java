package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdaj;
import com.google.android.gms.internal.ads.zzdak;
import com.google.android.gms.internal.ads.zzdaw;
import com.google.android.gms.internal.ads.zzdkb;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzfnu;
import com.google.android.gms.internal.ads.zzgzo;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zziko;
import com.google.android.gms.internal.ads.zzikp;
import com.google.common.util.concurrent.Xo;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzbf implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;
    private final zzikp zzf;
    private final zzikp zzg;
    private final zzikp zzh;
    private final zzikp zzi;

    private zzbf(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
        this.zzf = zzikpVar6;
        this.zzg = zzikpVar7;
        this.zzh = zzikpVar8;
        this.zzi = zzikpVar9;
    }

    public static zzbf zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9) {
        return new zzbf(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7, zzikpVar8, zzikpVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        Xo xoZzi;
        zzau zzauVar = (zzau) this.zza.zzb();
        zzfnu zzfnuVar = (zzfnu) this.zzb.zzb();
        zzbh zzbhVarZzb = ((zzbi) this.zzc).zzb();
        zzdaj zzdajVarZzb = ((zzdak) this.zzd).zzb();
        zzdkb zzdkbVar = (zzdkb) this.zze.zzb();
        zzb zzbVar = (zzb) this.zzf.zzb();
        zzcdh zzcdhVar = (zzcdh) this.zzg.zzb();
        int iIntValue = ((Integer) this.zzh.zzb()).intValue();
        Bundle bundle = ((zzdaw) this.zzi).zza().zzt;
        zzbj zzbjVarZzb = null;
        if (iIntValue == 1 && zzcdhVar != null) {
            bundle.putLong(zzdxh.READ_FROM_DISK_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            zzbjVarZzb = zzbVar.zzb(zzcdhVar, zzauVar, bundle);
            bundle.putLong(zzdxh.READ_FROM_DISK_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        if (zzbjVarZzb != null) {
            zzdkbVar.zza(zzbjVarZzb);
            xoZzi = zzgzo.zza(zzbjVarZzb);
        } else {
            xoZzi = zzfnuVar.zza(zzfno.GENERATE_SIGNALS, zzdajVarZzb.zzb()).zzc(zzbhVarZzb).zzh(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS).zzi();
            zzgzo.zzr(xoZzi, new zzaw(zzdkbVar), zzcei.zza);
        }
        zziko.zzb(xoZzi);
        return xoZzi;
    }
}

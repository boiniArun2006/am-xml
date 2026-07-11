package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdsa {
    private final Executor zza;
    private final zzctc zzb;
    private final zzdjg zzc;
    private final zzcrv zzd;
    private final zzczz zze;

    zzdsa(Executor executor, zzctc zzctcVar, zzdjg zzdjgVar, zzcrv zzcrvVar, zzczz zzczzVar) {
        this.zza = executor;
        this.zzc = zzdjgVar;
        this.zzb = zzctcVar;
        this.zzd = zzcrvVar;
        this.zze = zzczzVar;
    }

    public final void zza(final zzcjl zzcjlVar) {
        if (zzcjlVar == null) {
            return;
        }
        zzdjg zzdjgVar = this.zzc;
        zzdjgVar.zza(zzcjlVar.zzE());
        zzbde zzbdeVar = new zzbde() { // from class: com.google.android.gms.internal.ads.zzdrz
            @Override // com.google.android.gms.internal.ads.zzbde
            public final /* synthetic */ void zzdj(zzbdd zzbddVar) {
                Rect rect = zzbddVar.zzd;
                zzcjlVar.zzP().zza(rect.left, rect.top, false);
            }
        };
        Executor executor = this.zza;
        zzdjgVar.zzq(zzbdeVar, executor);
        zzdjgVar.zzq(new zzbde() { // from class: com.google.android.gms.internal.ads.zzdrw
            @Override // com.google.android.gms.internal.ads.zzbde
            public final /* synthetic */ void zzdj(zzbdd zzbddVar) {
                HashMap map = new HashMap();
                map.put("isVisible", true != zzbddVar.zzj ? "0" : "1");
                zzcjlVar.zze("onAdVisibilityChanged", map);
            }
        }, executor);
        zzctc zzctcVar = this.zzb;
        zzdjgVar.zzq(zzctcVar, executor);
        zzctcVar.zza(zzcjlVar);
        zzclj zzcljVarZzP = zzcjlVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlD)).booleanValue() && zzcljVarZzP != null) {
            zzcrv zzcrvVar = this.zzd;
            zzcljVarZzP.zzc(zzcrvVar);
            zzcljVarZzP.zze(zzcrvVar, null, null);
        }
        zzcjlVar.zzab("/trackActiveViewUnit", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdrx
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcjl) obj, map);
            }
        });
        zzcjlVar.zzab("/untrackActiveViewUnit", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdry
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc((zzcjl) obj, map);
            }
        });
        zzcjlVar.zzP().zzJ(this.zze);
    }

    final /* synthetic */ void zzb(zzcjl zzcjlVar, Map map) {
        this.zzb.zzd();
    }

    final /* synthetic */ void zzc(zzcjl zzcjlVar, Map map) {
        this.zzb.zzb();
    }
}

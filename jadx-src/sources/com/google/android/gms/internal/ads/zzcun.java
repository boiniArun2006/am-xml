package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcun implements zzikg {
    private final zzcue zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;

    private zzcun(zzcue zzcueVar, zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzcueVar;
        this.zzb = zzikpVar;
        this.zzc = zzikpVar2;
        this.zzd = zzikpVar3;
        this.zze = zzikpVar4;
    }

    public static zzcun zza(zzcue zzcueVar, zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzcun(zzcueVar, zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    public static zzdje zzc(zzcue zzcueVar, final Context context, final VersionInfoParcel versionInfoParcel, final zzfir zzfirVar, final zzfjk zzfjkVar) {
        return new zzdje(new zzdct() { // from class: com.google.android.gms.internal.ads.zzcud
            @Override // com.google.android.gms.internal.ads.zzdct
            public final /* synthetic */ void zzg() {
                zzfjk zzfjkVar2 = zzfjkVar;
                JSONObject jSONObject = zzfirVar.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, versionInfoParcel.afmaVersion, jSONObject.toString(), zzfjkVar2.zzg);
            }
        }, zzcei.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (Context) this.zzb.zzb(), ((zzcna) this.zzc).zza(), ((zzcww) this.zzd).zza(), ((zzdaw) this.zze).zza());
    }
}

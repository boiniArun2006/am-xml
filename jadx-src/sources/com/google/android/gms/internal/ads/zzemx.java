package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzemx implements zzekm {
    private final Context zza;
    private final zzdmq zzb;
    private zzbui zzc;
    private final VersionInfoParcel zzd;

    public zzemx(Context context, zzdmq zzdmqVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdmqVar;
        this.zzd = versionInfoParcel;
    }

    final /* synthetic */ void zzc(zzbui zzbuiVar) {
        this.zzc = zzbuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcn)).intValue()) {
                zzbvsVar.zzn(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjcVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzemw(this, zzekjVar, null), (zzbtz) zzekjVar.zzc);
                return;
            }
            String str = zzfirVar.zzU;
            String string = zzfirVar.zzv.toString();
            zzfjk zzfjkVar = zzfjcVar.zza.zza;
            zzbvsVar.zzr(str, string, zzfjkVar.zzd, ObjectWrapper.wrap(this.zza), new zzemw(this, zzekjVar, null), (zzbtz) zzekjVar.zzc, zzfjkVar.zzj);
        } catch (RemoteException e2) {
            throw new zzfjr(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        ArrayList arrayList = zzfjcVar.zza.zza.zzh;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzenv(2, "Unified must be used for RTB.");
        }
        zzdoh zzdohVarZzaf = zzdoh.zzaf(this.zzc);
        if (!arrayList.contains(Integer.toString(zzdohVarZzaf.zzx()))) {
            throw new zzenv(1, "No corresponding native ad listener");
        }
        zzdoj zzdojVarZze = this.zzb.zze(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdos(zzdohVarZzaf), new zzdql(null, null, this.zzc));
        ((zzelv) zzekjVar.zzc).zzc(zzdojVarZze.zzg());
        return zzdojVarZze.zzh();
    }
}

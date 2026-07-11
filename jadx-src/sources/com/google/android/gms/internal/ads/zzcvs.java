package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcvs implements zzdct, zzdbz {
    private final Context zza;

    @Nullable
    private final zzcjl zzb;
    private final zzfir zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private zzekb zze;
    private boolean zzf;
    private final zzejz zzg;

    public zzcvs(Context context, @Nullable zzcjl zzcjlVar, zzfir zzfirVar, VersionInfoParcel versionInfoParcel, zzejz zzejzVar) {
        this.zza = context;
        this.zzb = zzcjlVar;
        this.zzc = zzfirVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzejzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final synchronized void zzdr() {
        zzcjl zzcjlVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcjlVar = this.zzb) == null) {
            return;
        }
        zzcjlVar.zze("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final synchronized void zzg() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }

    private final synchronized void zza() {
        zzcjl zzcjlVar;
        zzejy zzejyVar;
        zzejx zzejxVar;
        try {
            zzfir zzfirVar = this.zzc;
            if (zzfirVar.zzT && (zzcjlVar = this.zzb) != null) {
                if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                    VersionInfoParcel versionInfoParcel = this.zzd;
                    int i2 = versionInfoParcel.buddyApkVersion;
                    int i3 = versionInfoParcel.clientJarVersion;
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(i3).length());
                    sb.append(i2);
                    sb.append(".");
                    sb.append(i3);
                    String string = sb.toString();
                    zzfjn zzfjnVar = zzfirVar.zzV;
                    String strZza = zzfjnVar.zza();
                    if (zzfjnVar.zzc() == 1) {
                        zzejxVar = zzejx.VIDEO;
                        zzejyVar = zzejy.DEFINED_BY_JAVASCRIPT;
                    } else {
                        int i5 = zzfirVar.zze;
                        zzejx zzejxVar2 = zzejx.HTML_DISPLAY;
                        zzejyVar = i5 == 1 ? zzejy.ONE_PIXEL : zzejy.BEGIN_TO_RENDER;
                        zzejxVar = zzejxVar2;
                    }
                    zzekb zzekbVarZzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(string, zzcjlVar.zzD(), "", "javascript", strZza, zzejyVar, zzejxVar, zzfirVar.zzal);
                    this.zze = zzekbVarZzc;
                    if (zzekbVarZzc != null) {
                        zzfsj zzfsjVarZza = zzekbVarZzc.zza();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgl)).booleanValue()) {
                            com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfsjVarZza, zzcjlVar.zzD());
                            Iterator it = zzcjlVar.zzF().iterator();
                            while (it.hasNext()) {
                                com.google.android.gms.ads.internal.zzt.zzu().zzg(zzfsjVarZza, (View) it.next());
                            }
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfsjVarZza, zzcjlVar.zzE());
                        }
                        zzcjlVar.zzak(this.zze);
                        com.google.android.gms.ads.internal.zzt.zzu().zze(zzfsjVarZza);
                        this.zzf = true;
                        zzcjlVar.zze("onSdkLoaded", new ArrayMap());
                    }
                }
            }
        } finally {
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && this.zzg.zzb();
    }
}

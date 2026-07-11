package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbgj;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdmh implements zzdbf, zzdir {
    private final zzccn zza;
    private final Context zzb;
    private final zzccq zzc;

    @Nullable
    private final View zzd;
    private String zze;
    private final zzbgj.zza.EnumC0774zza zzf;
    private final zzfir zzg;

    public zzdmh(zzccn zzccnVar, Context context, zzccq zzccqVar, @Nullable View view, zzbgj.zza.EnumC0774zza enumC0774zza, zzfir zzfirVar) {
        this.zza = zzccnVar;
        this.zzb = context;
        this.zzc = zzccqVar;
        this.zzd = view;
        this.zzf = enumC0774zza;
        this.zzg = zzfirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdJ() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzd(zzcag zzcagVar, String str, String str2) {
        zzccq zzccqVar = this.zzc;
        Context context = this.zzb;
        if (zzccqVar.zza(context) && this.zzg.zzaG) {
            try {
                zzccqVar.zzo(context, zzccqVar.zzj(context), this.zza.zzb(), zzcagVar.zzb(), zzcagVar.zzc());
            } catch (RemoteException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception to get reward item.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzds() {
        if (this.zzg.zzaG) {
            this.zza.zza(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdt() {
        if (this.zzg.zzaG) {
            View view = this.zzd;
            if (view != null && this.zze != null) {
                this.zzc.zzg(view.getContext(), this.zze);
            }
            this.zza.zza(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzh() {
        zzbgj.zza.EnumC0774zza enumC0774zza = this.zzf;
        if (enumC0774zza != zzbgj.zza.EnumC0774zza.APP_OPEN && this.zzg.zzaG) {
            String strZzf = this.zzc.zzf(this.zzb);
            this.zze = strZzf;
            this.zze = String.valueOf(strZzf).concat(enumC0774zza == zzbgj.zza.EnumC0774zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzepp implements zzekg {
    private final Context zza;
    private final zzcvc zzb;

    @Nullable
    private final zzbhz zzc;
    private final zzgzy zzd;
    private final zzfnu zze;

    public zzepp(Context context, zzcvc zzcvcVar, zzfnu zzfnuVar, zzgzy zzgzyVar, @Nullable zzbhz zzbhzVar) {
        this.zza = context;
        this.zzb = zzcvcVar;
        this.zze = zzfnuVar;
        this.zzd = zzgzyVar;
        this.zzc = zzbhzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar;
        return (this.zzc == null || (zzfiwVar = zzfirVar.zzs) == null || zzfiwVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final com.google.common.util.concurrent.Xo zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzepl zzeplVar = new zzepl(this, new View(this.zza), null, zzepn.zza, (zzfis) zzfirVar.zzu.get(0));
        zzcty zzctyVarZzf = this.zzb.zzf(new zzcwv(zzfjcVar, zzfirVar, null), zzeplVar);
        zzepo zzepoVarZzl = zzctyVarZzf.zzl();
        zzfiw zzfiwVar = zzfirVar.zzs;
        final zzbhu zzbhuVar = new zzbhu(zzepoVarZzl, zzfiwVar.zzb, zzfiwVar.zza);
        zzfno zzfnoVar = zzfno.CUSTOM_RENDER_SYN;
        zzfnu zzfnuVar = this.zze;
        Objects.requireNonNull(zzfnuVar);
        return zzfnf.zzd(new zzfna() { // from class: com.google.android.gms.internal.ads.zzepm
            @Override // com.google.android.gms.internal.ads.zzfna
            public final /* synthetic */ void zza() throws RemoteException {
                this.zza.zzc(zzbhuVar);
            }
        }, this.zzd, zzfnoVar, zzfnuVar).zzj(zzfno.CUSTOM_RENDER_ACK).zze(zzgzo.zza(zzctyVarZzf.zzi())).zzi();
    }

    final /* synthetic */ void zzc(zzbhu zzbhuVar) throws RemoteException {
        this.zzc.zze(zzbhuVar);
    }
}

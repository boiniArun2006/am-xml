package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzaj;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcdd;
import com.google.android.gms.internal.ads.zzcma;
import com.google.android.gms.internal.ads.zzdpa;
import com.google.android.gms.internal.ads.zzdpc;
import com.google.android.gms.internal.ads.zzdzq;
import com.google.android.gms.internal.ads.zzeqr;
import com.google.android.gms.internal.ads.zzfdu;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzfgx;
import com.google.android.gms.internal.ads.zzfik;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class ClientApi extends zzcq {
    @KeepForSdk
    public ClientApi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzb(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbtt zzbttVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzffh zzffhVarZzj = zzcma.zza(context, zzbttVar, i2).zzj();
        zzffhVarZzj.zzd(context);
        zzffhVarZzj.zzb(zzrVar);
        zzffhVarZzj.zzc(str);
        return zzffhVarZzj.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbtt zzbttVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfgx zzfgxVarZzn = zzcma.zza(context, zzbttVar, i2).zzn();
        zzfgxVarZzn.zzd(context);
        zzfgxVarZzn.zzb(zzrVar);
        zzfgxVarZzn.zzc(str);
        return zzfgxVarZzn.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbt zzd(IObjectWrapper iObjectWrapper, String str, zzbtt zzbttVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzeqr(zzcma.zza(context, zzbttVar, i2), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbkw zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdpc((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzcaj zzf(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfik zzfikVarZzq = zzcma.zza(context, zzbttVar, i2).zzq();
        zzfikVarZzq.zzc(context);
        return zzfikVarZzq.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbxs zzg(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new zzw(activity);
        }
        int i2 = adOverlayInfoParcelZza.zzk;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return new zzw(activity);
                        }
                        return new zzag(activity);
                    }
                    return new zzac(activity, adOverlayInfoParcelZza);
                }
                return new zzaj(activity);
            }
            return new zzai(activity);
        }
        return new zzv(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzck zzh(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i2) {
        return zzcma.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbttVar, i2).zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdb zzi(IObjectWrapper iObjectWrapper, int i2) {
        return zzcma.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i2).zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i2) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzrVar, str, new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i2, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzblc zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdpa((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzcaz zzl(IObjectWrapper iObjectWrapper, String str, zzbtt zzbttVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfik zzfikVarZzq = zzcma.zza(context, zzbttVar, i2).zzq();
        zzfikVarZzq.zzc(context);
        zzfikVarZzq.zzb(str);
        return zzfikVarZzq.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzm(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbtt zzbttVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfdu zzfduVarZzl = zzcma.zza(context, zzbttVar, i2).zzl();
        zzfduVarZzl.zzb(str);
        zzfduVarZzl.zzc(context);
        return zzfduVarZzl.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzcdd zzn(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i2) {
        return zzcma.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbttVar, i2).zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbxl zzo(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i2) {
        return zzcma.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbttVar, i2).zzu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbpk zzp(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i2, zzbph zzbphVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdzq zzdzqVarZzA = zzcma.zza(context, zzbttVar, i2).zzA();
        zzdzqVarZzA.zzc(context);
        zzdzqVarZzA.zzb(zzbphVar);
        return zzdzqVarZzA.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdw zzq(IObjectWrapper iObjectWrapper, zzbtt zzbttVar, int i2) {
        return zzcma.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbttVar, i2).zzC();
    }
}

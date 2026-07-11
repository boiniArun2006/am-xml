package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdst extends zzbll {
    private final Context zza;
    private final zzdoh zzb;
    private zzdpg zzc;
    private zzdoc zzd;

    final /* synthetic */ zzdoc zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final String zze(String str) {
        return (String) this.zzb.zzad().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final zzbks zzf(String str) {
        return (zzbks) this.zzb.zzaa().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final List zzg() {
        try {
            zzdoh zzdohVar = this.zzb;
            SimpleArrayMap simpleArrayMapZzaa = zzdohVar.zzaa();
            SimpleArrayMap simpleArrayMapZzad = zzdohVar.zzad();
            String[] strArr = new String[simpleArrayMapZzaa.getSize() + simpleArrayMapZzad.getSize()];
            int i2 = 0;
            for (int i3 = 0; i3 < simpleArrayMapZzaa.getSize(); i3++) {
                strArr[i2] = (String) simpleArrayMapZzaa.xMQ(i3);
                i2++;
            }
            for (int i5 = 0; i5 < simpleArrayMapZzad.getSize(); i5++) {
                strArr[i2] = (String) simpleArrayMapZzad.xMQ(i5);
                i2++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final String zzh() {
        return this.zzb.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzi(String str) {
        zzdoc zzdocVar = this.zzd;
        if (zzdocVar != null) {
            zzdocVar.zza(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzj() {
        zzdoc zzdocVar = this.zzd;
        if (zzdocVar != null) {
            zzdocVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final com.google.android.gms.ads.internal.client.zzed zzk() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzl() {
        zzdoc zzdocVar = this.zzd;
        if (zzdocVar != null) {
            zzdocVar.zzd();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final boolean zzo() {
        zzdoc zzdocVar = this.zzd;
        if (zzdocVar != null && !zzdocVar.zzM()) {
            return false;
        }
        zzdoh zzdohVar = this.zzb;
        return zzdohVar.zzW() != null && zzdohVar.zzT() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final boolean zzp() {
        zzdoh zzdohVar = this.zzb;
        zzekb zzekbVarZzZ = zzdohVar.zzZ();
        if (zzekbVarZzZ == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zze(zzekbVarZzZ.zza());
        if (zzdohVar.zzW() == null) {
            return true;
        }
        zzdohVar.zzW().zze("onSdkLoaded", new ArrayMap());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzr() {
        try {
            String strZzac = this.zzb.zzac();
            if (Objects.equals(strZzac, "Google")) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(strZzac)) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdoc zzdocVar = this.zzd;
                if (zzdocVar != null) {
                    zzdocVar.zzL(strZzac, false);
                }
            }
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final zzbkp zzs() throws RemoteException {
        try {
            return this.zzd.zzP().zza();
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    public zzdst(Context context, zzdoh zzdohVar, zzdpg zzdpgVar, zzdoc zzdocVar) {
        this.zza = context;
        this.zzb = zzdohVar;
        this.zzc = zzdpgVar;
        this.zzd = zzdocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final boolean zzn(IObjectWrapper iObjectWrapper) {
        zzdpg zzdpgVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((objUnwrap instanceof ViewGroup) && (zzdpgVar = this.zzc) != null && zzdpgVar.zzd((ViewGroup) objUnwrap)) {
            this.zzb.zzT().zzaq(new zzdss(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzdoc zzdocVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((objUnwrap instanceof View) && this.zzb.zzZ() != null && (zzdocVar = this.zzd) != null) {
            zzdocVar.zzN((View) objUnwrap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        zzdpg zzdpgVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((objUnwrap instanceof ViewGroup) && (zzdpgVar = this.zzc) != null && zzdpgVar.zze((ViewGroup) objUnwrap)) {
            this.zzb.zzU().zzaq(new zzdss(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
            return true;
        }
        return false;
    }
}

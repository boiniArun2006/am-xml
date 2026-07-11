package com.google.android.gms.internal.ads;

import aT.dE.JLZo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdoh {
    private int zza;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzed zzb;

    @Nullable
    private zzbkl zzc;

    @Nullable
    private View zzd;

    @Nullable
    private List zze;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzez zzg;

    @Nullable
    private Bundle zzh;

    @Nullable
    private zzcjl zzi;

    @Nullable
    private zzcjl zzj;

    @Nullable
    private zzcjl zzk;

    @Nullable
    private zzekb zzl;

    @Nullable
    private com.google.common.util.concurrent.Xo zzm;

    @Nullable
    private zzcen zzn;

    @Nullable
    private View zzo;

    @Nullable
    private View zzp;

    @Nullable
    private IObjectWrapper zzq;
    private double zzr;

    @Nullable
    private zzbks zzs;

    @Nullable
    private zzbks zzt;

    @Nullable
    private String zzu;
    private float zzx;

    @Nullable
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private List zzf = Collections.EMPTY_LIST;

    @Nullable
    public static zzdoh zzag(zzbuf zzbufVar) {
        try {
            zzdog zzdogVarZzam = zzam(zzbufVar.zzs(), null);
            zzbkl zzbklVarZzt = zzbufVar.zzt();
            View view = (View) zzal(zzbufVar.zzr());
            String strZze = zzbufVar.zze();
            List listZzf = zzbufVar.zzf();
            String strZzg = zzbufVar.zzg();
            Bundle bundleZzp = zzbufVar.zzp();
            String strZzi = zzbufVar.zzi();
            View view2 = (View) zzal(zzbufVar.zzu());
            IObjectWrapper iObjectWrapperZzv = zzbufVar.zzv();
            String strZzj = zzbufVar.zzj();
            zzbks zzbksVarZzh = zzbufVar.zzh();
            zzdoh zzdohVar = new zzdoh();
            zzdohVar.zza = 1;
            zzdohVar.zzb = zzdogVarZzam;
            zzdohVar.zzc = zzbklVarZzt;
            zzdohVar.zzd = view;
            zzdohVar.zzs("headline", strZze);
            zzdohVar.zze = listZzf;
            zzdohVar.zzs("body", strZzg);
            zzdohVar.zzh = bundleZzp;
            zzdohVar.zzs("call_to_action", strZzi);
            zzdohVar.zzo = view2;
            zzdohVar.zzq = iObjectWrapperZzv;
            zzdohVar.zzs("advertiser", strZzj);
            zzdohVar.zzt = zzbksVarZzh;
            return zzdohVar;
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from content ad mapper", e2);
            return null;
        }
    }

    @Nullable
    public static zzdoh zzah(zzbue zzbueVar) {
        zzdoh zzdohVar;
        try {
            zzdog zzdogVarZzam = zzam(zzbueVar.zzt(), null);
            zzbkl zzbklVarZzv = zzbueVar.zzv();
            View view = (View) zzal(zzbueVar.zzu());
            String strZze = zzbueVar.zze();
            List listZzf = zzbueVar.zzf();
            String strZzg = zzbueVar.zzg();
            Bundle bundleZzr = zzbueVar.zzr();
            String strZzi = zzbueVar.zzi();
            View view2 = (View) zzal(zzbueVar.zzw());
            IObjectWrapper iObjectWrapperZzx = zzbueVar.zzx();
            String strZzk = zzbueVar.zzk();
            String strZzl = zzbueVar.zzl();
            double dZzj = zzbueVar.zzj();
            zzbks zzbksVarZzh = zzbueVar.zzh();
            zzdohVar = null;
            try {
                zzdoh zzdohVar2 = new zzdoh();
                zzdohVar2.zza = 2;
                zzdohVar2.zzb = zzdogVarZzam;
                zzdohVar2.zzc = zzbklVarZzv;
                zzdohVar2.zzd = view;
                zzdohVar2.zzs("headline", strZze);
                zzdohVar2.zze = listZzf;
                zzdohVar2.zzs("body", strZzg);
                zzdohVar2.zzh = bundleZzr;
                zzdohVar2.zzs("call_to_action", strZzi);
                zzdohVar2.zzo = view2;
                zzdohVar2.zzq = iObjectWrapperZzx;
                zzdohVar2.zzs("store", strZzk);
                zzdohVar2.zzs("price", strZzl);
                zzdohVar2.zzr = dZzj;
                zzdohVar2.zzs = zzbksVarZzh;
                return zzdohVar2;
            } catch (RemoteException e2) {
                e = e2;
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from app install ad mapper", e);
                return zzdohVar;
            }
        } catch (RemoteException e3) {
            e = e3;
            zzdohVar = null;
        }
    }

    @Nullable
    public static zzdoh zzai(zzbue zzbueVar) {
        try {
            return zzak(zzam(zzbueVar.zzt(), null), zzbueVar.zzv(), (View) zzal(zzbueVar.zzu()), zzbueVar.zze(), zzbueVar.zzf(), zzbueVar.zzg(), zzbueVar.zzr(), zzbueVar.zzi(), (View) zzal(zzbueVar.zzw()), zzbueVar.zzx(), zzbueVar.zzk(), zzbueVar.zzl(), zzbueVar.zzj(), zzbueVar.zzh(), null, 0.0f);
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from app install ad mapper", e2);
            return null;
        }
    }

    @Nullable
    public static zzdoh zzaj(zzbuf zzbufVar) {
        try {
            return zzak(zzam(zzbufVar.zzs(), null), zzbufVar.zzt(), (View) zzal(zzbufVar.zzr()), zzbufVar.zze(), zzbufVar.zzf(), zzbufVar.zzg(), zzbufVar.zzp(), zzbufVar.zzi(), (View) zzal(zzbufVar.zzu()), zzbufVar.zzv(), null, null, -1.0d, zzbufVar.zzh(), zzbufVar.zzj(), 0.0f);
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from content ad mapper", e2);
            return null;
        }
    }

    @Nullable
    public final synchronized View zzA() {
        return this.zzd;
    }

    @Nullable
    public final synchronized String zzB() {
        return zzw("headline");
    }

    @Nullable
    public final synchronized List zzC() {
        return this.zze;
    }

    public final synchronized List zzE() {
        return this.zzf;
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzez zzF() {
        return this.zzg;
    }

    @Nullable
    public final synchronized String zzG() {
        return zzw("body");
    }

    public final synchronized Bundle zzH() {
        try {
            if (this.zzh == null) {
                this.zzh = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzh;
    }

    @Nullable
    public final synchronized String zzI() {
        return zzw("call_to_action");
    }

    @Nullable
    public final synchronized View zzJ() {
        return this.zzo;
    }

    @Nullable
    public final synchronized View zzK() {
        return this.zzp;
    }

    @Nullable
    public final synchronized IObjectWrapper zzL() {
        return this.zzq;
    }

    @Nullable
    public final synchronized String zzM() {
        return zzw("store");
    }

    @Nullable
    public final synchronized String zzN() {
        return zzw("price");
    }

    public final synchronized double zzO() {
        return this.zzr;
    }

    @Nullable
    public final synchronized zzbks zzP() {
        return this.zzs;
    }

    @Nullable
    public final synchronized String zzQ() {
        return zzw("advertiser");
    }

    @Nullable
    public final synchronized zzbks zzR() {
        return this.zzt;
    }

    @Nullable
    public final synchronized String zzS() {
        return this.zzu;
    }

    @Nullable
    public final synchronized zzcjl zzT() {
        return this.zzi;
    }

    @Nullable
    public final synchronized zzcjl zzU() {
        return this.zzj;
    }

    public final synchronized boolean zzV() {
        return this.zzj != null;
    }

    @Nullable
    public final synchronized zzcjl zzW() {
        return this.zzk;
    }

    @Nullable
    public final synchronized com.google.common.util.concurrent.Xo zzX() {
        return this.zzm;
    }

    @Nullable
    public final synchronized zzcen zzY() {
        return this.zzn;
    }

    @Nullable
    public final synchronized zzekb zzZ() {
        return this.zzl;
    }

    public final synchronized void zza(int i2) {
        this.zza = i2;
    }

    @Nullable
    public final synchronized SimpleArrayMap zzaa() {
        return this.zzv;
    }

    public final synchronized float zzab() {
        return this.zzx;
    }

    @Nullable
    public final synchronized String zzac() {
        return this.zzy;
    }

    public final synchronized SimpleArrayMap zzad() {
        return this.zzw;
    }

    public final synchronized void zzae() {
        try {
            zzcjl zzcjlVar = this.zzi;
            if (zzcjlVar != null) {
                zzcjlVar.destroy();
                this.zzi = null;
            }
            zzcjl zzcjlVar2 = this.zzj;
            if (zzcjlVar2 != null) {
                zzcjlVar2.destroy();
                this.zzj = null;
            }
            zzcjl zzcjlVar3 = this.zzk;
            if (zzcjlVar3 != null) {
                zzcjlVar3.destroy();
                this.zzk = null;
            }
            com.google.common.util.concurrent.Xo xo = this.zzm;
            if (xo != null) {
                xo.cancel(false);
                this.zzm = null;
            }
            zzcen zzcenVar = this.zzn;
            if (zzcenVar != null) {
                zzcenVar.cancel(false);
                this.zzn = null;
            }
            this.zzl = null;
            this.zzv.clear();
            this.zzw.clear();
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzh = null;
            this.zzo = null;
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            this.zzt = null;
            this.zzu = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzed zzedVar) {
        this.zzb = zzedVar;
    }

    public final synchronized void zzc(zzbkl zzbklVar) {
        this.zzc = zzbklVar;
    }

    public final synchronized void zzd(List list) {
        this.zze = list;
    }

    public final synchronized void zze(List list) {
        this.zzf = list;
    }

    public final synchronized void zzf(@Nullable com.google.android.gms.ads.internal.client.zzez zzezVar) {
        this.zzg = zzezVar;
    }

    public final synchronized void zzg(View view) {
        this.zzo = view;
    }

    public final synchronized void zzh(View view) {
        this.zzp = view;
    }

    public final synchronized void zzi(double d2) {
        this.zzr = d2;
    }

    public final synchronized void zzj(zzbks zzbksVar) {
        this.zzs = zzbksVar;
    }

    public final synchronized void zzk(zzbks zzbksVar) {
        this.zzt = zzbksVar;
    }

    public final synchronized void zzl(String str) {
        this.zzu = str;
    }

    public final synchronized void zzm(zzcjl zzcjlVar) {
        this.zzi = zzcjlVar;
    }

    public final synchronized void zzn(zzcjl zzcjlVar) {
        this.zzj = zzcjlVar;
    }

    public final synchronized void zzo(zzcjl zzcjlVar) {
        this.zzk = zzcjlVar;
    }

    public final synchronized void zzp(com.google.common.util.concurrent.Xo xo) {
        this.zzm = xo;
    }

    public final synchronized void zzq(zzekb zzekbVar) {
        this.zzl = zzekbVar;
    }

    public final synchronized void zzr(zzcen zzcenVar) {
        this.zzn = zzcenVar;
    }

    public final synchronized void zzs(String str, @Nullable String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized void zzt(String str, zzbkd zzbkdVar) {
        if (zzbkdVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbkdVar);
        }
    }

    public final synchronized void zzu(float f3) {
        this.zzx = f3;
    }

    public final synchronized void zzv(@Nullable String str) {
        this.zzy = str;
    }

    @Nullable
    public final synchronized String zzw(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized int zzx() {
        return this.zza;
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzed zzy() {
        return this.zzb;
    }

    @Nullable
    public final synchronized zzbkl zzz() {
        return this.zzc;
    }

    private static zzdoh zzak(@Nullable com.google.android.gms.ads.internal.client.zzed zzedVar, zzbkl zzbklVar, @Nullable View view, String str, List list, String str2, Bundle bundle, String str3, @Nullable View view2, IObjectWrapper iObjectWrapper, @Nullable String str4, @Nullable String str5, double d2, zzbks zzbksVar, @Nullable String str6, float f3) {
        zzdoh zzdohVar = new zzdoh();
        zzdohVar.zza = 6;
        zzdohVar.zzb = zzedVar;
        zzdohVar.zzc = zzbklVar;
        zzdohVar.zzd = view;
        zzdohVar.zzs("headline", str);
        zzdohVar.zze = list;
        zzdohVar.zzs("body", str2);
        zzdohVar.zzh = bundle;
        zzdohVar.zzs("call_to_action", str3);
        zzdohVar.zzo = view2;
        zzdohVar.zzq = iObjectWrapper;
        zzdohVar.zzs("store", str4);
        zzdohVar.zzs(JLZo.iyPMbHpKmwX, str5);
        zzdohVar.zzr = d2;
        zzdohVar.zzs = zzbksVar;
        zzdohVar.zzs("advertiser", str6);
        zzdohVar.zzu(f3);
        return zzdohVar;
    }

    @Nullable
    private static Object zzal(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    @Nullable
    private static zzdog zzam(@Nullable com.google.android.gms.ads.internal.client.zzed zzedVar, @Nullable zzbui zzbuiVar) {
        if (zzedVar == null) {
            return null;
        }
        return new zzdog(zzedVar, zzbuiVar);
    }

    @Nullable
    public final zzbks zzD() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbkr.zzh((IBinder) obj);
        }
        return null;
    }

    @Nullable
    public static zzdoh zzaf(zzbui zzbuiVar) {
        try {
            return zzak(zzam(zzbuiVar.zzn(), zzbuiVar), zzbuiVar.zzo(), (View) zzal(zzbuiVar.zzp()), zzbuiVar.zze(), zzbuiVar.zzf(), zzbuiVar.zzg(), zzbuiVar.zzs(), zzbuiVar.zzi(), (View) zzal(zzbuiVar.zzq()), zzbuiVar.zzr(), zzbuiVar.zzl(), zzbuiVar.zzm(), zzbuiVar.zzk(), zzbuiVar.zzh(), zzbuiVar.zzj(), zzbuiVar.zzz());
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from unified ad mapper", e2);
            return null;
        }
    }
}

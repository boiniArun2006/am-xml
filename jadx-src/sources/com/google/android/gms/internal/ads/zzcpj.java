package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcpj extends com.google.android.gms.ads.internal.client.zzda {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdvp zzc;
    private final zzeki zzd;
    private final zzeqk zze;
    private final zzeak zzf;
    private final zzccq zzg;
    private final zzdvu zzh;
    private final zzebf zzi;
    private final zzbjy zzj;
    private final zzfor zzk;
    private final zzfkg zzl;
    private final zzcyq zzm;
    private final zzdxz zzn;
    private final zzecm zzo;
    private boolean zzp = false;
    private final Long zzq = Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());

    @VisibleForTesting
    zzcpj(Context context, VersionInfoParcel versionInfoParcel, zzdvp zzdvpVar, zzeki zzekiVar, zzeqk zzeqkVar, zzeak zzeakVar, zzccq zzccqVar, zzdvu zzdvuVar, zzebf zzebfVar, zzbjy zzbjyVar, zzfor zzforVar, zzfkg zzfkgVar, zzcyq zzcyqVar, zzdxz zzdxzVar, zzecm zzecmVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdvpVar;
        this.zzd = zzekiVar;
        this.zze = zzeqkVar;
        this.zzf = zzeakVar;
        this.zzg = zzccqVar;
        this.zzh = zzdvuVar;
        this.zzi = zzebfVar;
        this.zzj = zzbjyVar;
        this.zzk = zzforVar;
        this.zzl = zzfkgVar;
        this.zzm = zzcyqVar;
        this.zzn = zzdxzVar;
        this.zzo = zzecmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zze() {
        if (this.zzp) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Mobile ads is initialized already.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zzc();
        }
        Context context = this.zza;
        zzbhe.zza(context);
        com.google.android.gms.ads.internal.zzt.zzh().zze(context, this.zzb, this.zzn);
        this.zzm.zzc();
        com.google.android.gms.ads.internal.zzt.zzj().zza(context);
        this.zzp = true;
        this.zzf.zzc();
        this.zze.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeU)).booleanValue()) {
            this.zzh.zza();
        }
        this.zzi.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkF)).booleanValue()) {
            zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmt)).booleanValue()) {
            zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzx();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdO)).booleanValue()) {
            zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfz)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfA)).booleanValue()) {
                zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpe
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzd();
                    }
                });
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfN)).booleanValue()) {
            final zzecm zzecmVar = this.zzo;
            zzgzy zzgzyVar = zzcei.zzf;
            Objects.requireNonNull(zzecmVar);
            zzgzyVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzecmVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzf(float f3) {
        com.google.android.gms.ads.internal.zzt.zzi().zza(f3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzg(String str) {
        Context context = this.zza;
        zzbhe.zza(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeS)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzl().zza(context, this.zzb, str, null, this.zzk, null, null, this.zzi.zzs());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzh(boolean z2) {
        com.google.android.gms.ads.internal.zzt.zzi().zzc(z2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized float zzk() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized boolean zzl() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzw() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcY)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzr().zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzbb.zzd();
            }
        }
    }

    final /* synthetic */ void zzc() {
        zzfkp.zza(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Context is null. Failed to open debug menu.");
        } else {
            com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
            zzatVar.zzc(str);
            zzatVar.zzd(this.zzb.afmaVersion);
            zzatVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(@Nullable String str, IObjectWrapper iObjectWrapper) {
        String strZzt;
        Runnable runnable;
        Context context = this.zza;
        zzbhe.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeZ)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                strZzt = com.google.android.gms.ads.internal.util.zzs.zzt(context);
            } catch (RemoteException | RuntimeException e2) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "NonagonMobileAdsSettingManager_AppId");
                strZzt = "";
            }
        } else {
            strZzt = "";
        }
        boolean z2 = true;
        String str2 = true == TextUtils.isEmpty(strZzt) ? str : strZzt;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeS)).booleanValue();
        zzbgv zzbgvVar = zzbhe.zzby;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgzy zzgzyVar = zzcei.zzf;
                    final zzcpj zzcpjVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzgzyVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcph
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcpjVar.zzy(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z2 = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z2) {
            com.google.android.gms.ads.internal.zzt.zzl().zza(this.zza, this.zzb, str2, runnable3, this.zzk, this.zzn, this.zzq, this.zzi.zzs());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzm() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(String str) {
        this.zze.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbtt zzbttVar) throws RemoteException {
        this.zzl.zzc(zzbttVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzp(zzbqn zzbqnVar) throws RemoteException {
        this.zzf.zzb(zzbqnVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzq() throws RemoteException {
        return this.zzf.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzr(com.google.android.gms.ads.internal.client.zzfv zzfvVar) throws RemoteException {
        this.zzg.zzb(this.zza, zzfvVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs() {
        this.zzf.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        this.zzi.zzo(zzdnVar, zzebe.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(boolean z2) throws RemoteException {
        Context context;
        try {
            context = this.zza;
            zzgai.zza(context).zzb(z2);
        } catch (IOException e2) {
            throw new RemoteException(e2.getMessage());
        }
        if (z2) {
            return;
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                return;
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e3) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "clearStorageOnGpidPubDisable_scar");
            return;
        }
        throw new RemoteException(e2.getMessage());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzv(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkR)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzt(str);
        }
    }

    final /* synthetic */ void zzx() {
        this.zzj.zza(new zzbyt());
    }

    final /* synthetic */ void zzy(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map mapZzf = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzf();
        if (mapZzf.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzc()) {
            HashMap map = new HashMap();
            Iterator it = mapZzf.values().iterator();
            while (it.hasNext()) {
                for (zzbtm zzbtmVar : ((zzbtn) it.next()).zza) {
                    String str = zzbtmVar.zzb;
                    for (String str2 : zzbtmVar.zza) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzekj zzekjVarZza = this.zzd.zza(str3, jSONObject);
                    if (zzekjVarZza != null) {
                        zzfki zzfkiVar = (zzfki) zzekjVarZza.zzb;
                        if (!zzfkiVar.zzn() && zzfkiVar.zzq()) {
                            zzfkiVar.zzr(this.zza, (zzelw) zzekjVarZza.zzc, (List) entry.getValue());
                            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 45);
                            sb.append("Initialized rewarded video mediation adapter ");
                            sb.append(str3);
                            String string = sb.toString();
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                        }
                    }
                } catch (zzfjr e2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb2.append("Failed to initialize rewarded video mediation adapter \"");
                    sb2.append(str3);
                    sb2.append("\"");
                    String string2 = sb2.toString();
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj(string2, e2);
                }
            }
        }
    }

    @VisibleForTesting
    final void zzb() {
        if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzJ()) {
            String strZzL = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzL();
            if (!com.google.android.gms.ads.internal.zzt.zzo().zze(this.zza, strZzL, this.zzb.afmaVersion)) {
                com.google.android.gms.ads.internal.zzt.zzh().zzo().zzK(false);
                com.google.android.gms.ads.internal.zzt.zzh().zzo().zzM("");
            }
        }
    }

    final /* synthetic */ void zzd() {
        com.google.android.gms.ads.internal.zzt.zzn().zza(this.zza, this.zzn);
    }
}

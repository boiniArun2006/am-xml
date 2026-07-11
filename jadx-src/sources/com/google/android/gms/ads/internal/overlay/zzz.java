package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzgou;
import com.google.android.gms.internal.ads.zzgov;
import com.google.android.gms.internal.ads.zzgow;
import com.google.android.gms.internal.ads.zzgox;
import com.google.android.gms.internal.ads.zzgpq;
import com.google.android.gms.internal.ads.zzgps;
import com.google.android.gms.internal.ads.zzgpt;
import com.google.android.gms.internal.ads.zzgpu;
import com.google.android.gms.internal.ads.zzgpv;
import com.google.android.gms.internal.ads.zzgqi;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzz {
    private zzgpt zzf;

    @Nullable
    private zzcjl zzc = null;
    private boolean zze = false;

    @Nullable
    private String zza = null;

    @Nullable
    private zzgow zzd = null;

    @Nullable
    private String zzb = null;

    public final synchronized void zza(@Nullable zzcjl zzcjlVar, Context context) {
        this.zzc = zzcjlVar;
        if (!zzb(context)) {
            zzg("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put(FileUploadManager.f61572j, "fetch_completed");
        zzi("on_play_store_bind", map);
    }

    public final synchronized boolean zzb(Context context) {
        if (!zzgqi.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzgox.zza(context);
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzl();
        this.zze = true;
        return true;
    }

    private final void zzl() {
        if (this.zzf == null) {
            this.zzf = new zzx(this);
        }
    }

    public final void zzc(@Nullable zzcjl zzcjlVar, @Nullable zzgpq zzgpqVar) {
        if (zzcjlVar == null) {
            zzg("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcjlVar;
        if (!this.zze && !zzb(zzcjlVar.getContext())) {
            zzg("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmV)).booleanValue()) {
            this.zzb = zzgpqVar.zzb();
        }
        zzl();
        zzgow zzgowVar = this.zzd;
        if (zzgowVar != null) {
            zzgowVar.zza(zzgpqVar, this.zzf);
        }
    }

    public final void zzd() {
        zzgow zzgowVar;
        if (!this.zze || (zzgowVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgowVar.zzd(zzm(), this.zzf);
            zzh("onLMDOverlayExpand");
        }
    }

    public final void zze() {
        zzgow zzgowVar;
        if (!this.zze || (zzgowVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgowVar.zzc(zzm(), this.zzf);
            zzh("onLMDOverlayCollapse");
        }
    }

    public final void zzf() {
        zzgow zzgowVar;
        if (!this.zze || (zzgowVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzgou zzgouVarZzc = zzgov.zzc();
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzmV)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzgouVarZzc.zza(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzgouVarZzc.zzb(this.zzb);
        }
        zzgowVar.zzb(zzgouVarZzc.zzc(), this.zzf);
    }

    @VisibleForTesting
    final void zzh(String str) {
        zzi(str, new HashMap());
    }

    @VisibleForTesting
    final void zzi(final String str, final Map map) {
        zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk(str, map);
            }
        });
    }

    final /* synthetic */ void zzk(String str, Map map) {
        zzcjl zzcjlVar = this.zzc;
        if (zzcjlVar != null) {
            zzcjlVar.zze(str, map);
        }
    }

    private final zzgpv zzm() {
        zzgpu zzgpuVarZzc = zzgpv.zzc();
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmV)).booleanValue() && !TextUtils.isEmpty(this.zzb)) {
            zzgpuVarZzc.zzb(this.zzb);
        } else {
            String str = this.zza;
            if (str != null) {
                zzgpuVarZzc.zza(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        }
        return zzgpuVarZzc.zzc();
    }

    @VisibleForTesting
    final void zzg(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put(FileUploadManager.f61572j, str2);
            zzi("onError", map);
        }
    }

    @VisibleForTesting
    final void zzj(zzgps zzgpsVar) {
        if (!TextUtils.isEmpty(zzgpsVar.zzb())) {
            if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzmV)).booleanValue()) {
                this.zza = zzgpsVar.zzb();
            }
        }
        switch (zzgpsVar.zza()) {
            case 8152:
                zzh("onLMDOverlayOpened");
                break;
            case 8153:
                zzh("onLMDOverlayClicked");
                break;
            case 8155:
                zzh("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put(MRAIDPresenter.ERROR, String.valueOf(zzgpsVar.zza()));
                zzi("onLMDOverlayFailedToOpen", map);
                break;
        }
    }
}

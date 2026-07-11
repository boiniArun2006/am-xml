package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzclk {

    @Nullable
    private Profile zza = null;

    zzclk() {
    }

    public final void zza(WebView webView) {
        if (this.zza != null) {
            try {
                WebViewCompat.ty(webView, "GMA_WEBVIEW_PROFILE");
                com.google.android.gms.ads.internal.util.zze.zza("WebViewCompat Profile is defined");
            } catch (IllegalStateException e2) {
                String strConcat = "WebViewCompat error: ".concat(e2.toString());
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpx)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "WebViewCompat.setProfile");
                }
            }
        }
    }

    @RequiresApi
    @UiThread
    final void zzb(zzclo zzcloVar) {
        ProfileStore profileStore;
        if (!WebViewFeature.n(gUxOLwRQBPPLC.SlJNBc)) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzfys.zza("androidx.webkit.ProfileStore", "getInstance", new zzfyr[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            String str = GDEJgAYrPQHfw.GEhF;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(str.concat(strValueOf));
            try {
                profileStore = (ProfileStore) zzfys.zza("androidx.webkit.ProfileStore$-CC", "getInstance", new zzfyr[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e3) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd(str.concat(String.valueOf(e3.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.zza = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpw)).booleanValue()) {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzcloVar.zza;
                zzdxy zzdxyVarZza = zzcloVar.zzb.zzd().zza();
                zzdxyVarZza.zzc(FileUploadManager.f61572j, "webview_p_l");
                zzdxyVarZza.zzc("webview_p_l", Long.toString(jElapsedRealtime));
                zzdxyVarZza.zzd();
                return;
            }
            return;
        }
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("WebViewCompat failure: No instance");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpw)).booleanValue()) {
            zzdxy zzdxyVarZza2 = zzcloVar.zzb.zzd().zza();
            zzdxyVarZza2.zzc(FileUploadManager.f61572j, "webview_p_f");
            zzdxyVarZza2.zzc("webview_p_f", "No instance");
            zzdxyVarZza2.zzd();
        }
    }
}

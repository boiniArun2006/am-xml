package com.google.android.gms.ads.interstitial;

import aT.dE.JLZo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class InterstitialAdPreloader {
    private InterstitialAdPreloader() {
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return false;
        }
        return zzepVarZza.zzc(str, preloadConfiguration);
    }

    public static boolean destroy(@NonNull String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return false;
        }
        return zzepVarZza.zzf(str);
    }

    public static void destroyAll() {
        zzep zzepVarZza = zza();
        if (zzepVarZza != null) {
            zzepVarZza.zzg();
        }
    }

    @Nullable
    @Deprecated
    public static PreloadConfiguration getConfiguration(@NonNull String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return null;
        }
        return zzepVarZza.zzi(str);
    }

    @NonNull
    @Deprecated
    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return new HashMap();
        }
        return zzepVarZza.zzh();
    }

    public static int getNumAdsAvailable(@NonNull String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return 0;
        }
        return zzepVarZza.zze(str);
    }

    public static boolean isAdAvailable(@NonNull String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return false;
        }
        return zzepVarZza.zzd(str);
    }

    @Nullable
    public static InterstitialAd pollAd(@NonNull String str) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return null;
        }
        return zzepVarZza.zza(str);
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration, @NonNull PreloadCallbackV2 preloadCallbackV2) {
        zzep zzepVarZza = zza();
        if (zzepVarZza == null) {
            return false;
        }
        return zzepVarZza.zzb(str, preloadConfiguration, preloadCallbackV2);
    }

    @Nullable
    private static zzep zza() {
        zzep zzepVar = (zzep) zzex.zzb().zza(AdFormat.INTERSTITIAL);
        if (zzepVar == null) {
            zzo.zzi(JLZo.ePKgMGPQUlTpn);
        }
        return zzepVar;
    }
}

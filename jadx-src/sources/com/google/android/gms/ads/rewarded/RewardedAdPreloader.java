package com.google.android.gms.ads.rewarded;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class RewardedAdPreloader {
    private RewardedAdPreloader() {
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration) {
        zzfb zzfbVarZza = zza();
        if (zzfbVarZza == null) {
            return false;
        }
        return zzfbVarZza.zzc(str, preloadConfiguration);
    }

    public static boolean destroy(@NonNull String str) {
        zzfb zzfbVarZza = zza();
        if (zzfbVarZza == null) {
            return false;
        }
        return zzfbVarZza.zzf(str);
    }

    public static void destroyAll() {
        zzfb zzfbVarZza = zza();
        if (zzfbVarZza != null) {
            zzfbVarZza.zzg();
        }
    }

    @Nullable
    @Deprecated
    public static PreloadConfiguration getConfiguration(@NonNull String str) {
        zzfb zzfbVarZza = zza();
        if (zzfbVarZza == null) {
            return null;
        }
        return zzfbVarZza.zzi(str);
    }

    @NonNull
    @Deprecated
    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzfb zzfbVarZza = zza();
        if (zzfbVarZza == null) {
            return new HashMap();
        }
        return zzfbVarZza.zzh();
    }

    public static int getNumAdsAvailable(@NonNull String str) {
        zzfb zzfbVarZza = zza();
        if (zzfbVarZza == null) {
            return 0;
        }
        return zzfbVarZza.zze(str);
    }

    public static boolean isAdAvailable(@NonNull String str) {
        zzfb zzfbVarZza = zza();
        if (zzfbVarZza == null) {
            return false;
        }
        return zzfbVarZza.zzd(str);
    }

    @Nullable
    public static RewardedAd pollAd(@NonNull String str) {
        zzfb zzfbVarZza = zza();
        if (zzfbVarZza == null) {
            return null;
        }
        return zzfbVarZza.zza(str);
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration, @NonNull PreloadCallbackV2 preloadCallbackV2) {
        zzfb zzfbVarZza = zza();
        if (zzfbVarZza == null) {
            return false;
        }
        return zzfbVarZza.zzb(str, preloadConfiguration, preloadCallbackV2);
    }

    @Nullable
    private static zzfb zza() {
        zzfb zzfbVar = (zzfb) zzex.zzb().zza(AdFormat.REWARDED);
        if (zzfbVar == null) {
            zzo.zzl("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.", null);
        }
        return zzfbVar;
    }
}

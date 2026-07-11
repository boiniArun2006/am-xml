package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.MobileAds;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfkm {
    public static com.google.android.gms.ads.internal.client.zze zzc(int i2, com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 8) {
            if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjC)).intValue() > 0) {
                return zzeVar;
            }
            i2 = 8;
        }
        return zzd(i2, null, zzeVar);
    }

    public static com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        if (th instanceof zzekk) {
            zzekk zzekkVar = (zzekk) th;
            return zzc(zzekkVar.zza(), zzekkVar.zzb());
        }
        if (th instanceof zzecr) {
            return th.getMessage() == null ? zzd(((zzecr) th).zza(), null, null) : zzd(((zzecr) th).zza(), th.getMessage(), null);
        }
        if (!(th instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            return zzd(1, null, null);
        }
        com.google.android.gms.ads.internal.util.zzaz zzazVar = (com.google.android.gms.ads.internal.util.zzaz) th;
        return new com.google.android.gms.ads.internal.client.zze(zzazVar.zza(), zzgrt.zza(zzazVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.google.android.gms.ads.internal.client.zze zzd(int i2, @Nullable String str, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        String str2;
        int i3 = i2 - 1;
        if (str == null) {
            if (i2 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i3) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjF)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i2 == 0) {
            throw null;
        }
        int i5 = 0;
        int i7 = 2;
        switch (i3) {
            case 0:
            case 11:
            case 15:
                i7 = i5;
                return new com.google.android.gms.ads.internal.client.zze(i7, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i7 = 1;
                return new com.google.android.gms.ads.internal.client.zze(i7, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 2:
            case 10:
            case 18:
                i7 = 3;
                return new com.google.android.gms.ads.internal.client.zze(i7, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 3:
                i5 = 8;
                i7 = i5;
                return new com.google.android.gms.ads.internal.client.zze(i7, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 4:
            case 8:
            case 17:
                return new com.google.android.gms.ads.internal.client.zze(i7, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 7:
                i5 = 4;
                i7 = i5;
                return new com.google.android.gms.ads.internal.client.zze(i7, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 12:
                if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjF)).intValue() <= 0) {
                    i5 = 9;
                    i7 = i5;
                    return new com.google.android.gms.ads.internal.client.zze(i7, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                }
                i7 = 3;
                return new com.google.android.gms.ads.internal.client.zze(i7, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 13:
                i5 = 10;
                i7 = i5;
                return new com.google.android.gms.ads.internal.client.zze(i7, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            case 14:
                i5 = 11;
                i7 = i5;
                return new com.google.android.gms.ads.internal.client.zze(i7, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
            default:
                switch (i2) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }

    public static com.google.android.gms.ads.internal.client.zze zzb(Throwable th, @Nullable zzekl zzeklVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zzeVarZza = zza(th);
        int i2 = zzeVarZza.zza;
        if ((i2 == 3 || i2 == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zzeVarZza.zzd = null;
        }
        if (zzeklVar != null) {
            zzeVarZza.zze = zzeklVar.zzf();
        }
        return zzeVarZza;
    }
}

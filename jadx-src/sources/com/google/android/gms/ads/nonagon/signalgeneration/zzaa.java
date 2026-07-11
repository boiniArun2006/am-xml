package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.core.database.sqlite.cL.PtsLKY;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjk;
import com.google.android.gms.internal.ads.zzfot;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzaa {
    public static boolean zza(zzfjc zzfjcVar) {
        return zzg(zzfjcVar.zza.zza) != 1;
    }

    public static int zzg(zzfjk zzfjkVar) {
        if (zzfjkVar.zzs) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfjkVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    @Nullable
    public static String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? "unspecified" : bundle.getString(PtsLKY.tLJBGIC);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfot zzd(Bundle bundle) {
        byte b2;
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfot.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string.hashCode()) {
            case 1743582862:
                b2 = !string.equals(YjqZUJsVmhcjko.OHZKDjsxyUHsF) ? (byte) -1 : (byte) 0;
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    b2 = 1;
                    break;
                }
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    b2 = 2;
                    break;
                }
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    b2 = 3;
                    break;
                }
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    b2 = 4;
                    break;
                }
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    b2 = 5;
                    break;
                }
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    b2 = 6;
                    break;
                }
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    b2 = 7;
                    break;
                }
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    b2 = 8;
                    break;
                }
                break;
        }
        switch (b2) {
        }
        return zzfot.SCAR_REQUEST_TYPE_UNSPECIFIED;
    }

    public static void zze(final zzdye zzdyeVar, @Nullable zzdxt zzdxtVar, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            final zzdxt zzdxtVar2 = null;
            zzcei.zza.execute(new Runnable(zzdxtVar2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
                private final /* synthetic */ String zzb;
                private final /* synthetic */ Pair[] zzc;

                {
                    this.zzb = str;
                    this.zzc = pairArr;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaa.zzf(this.zza, null, this.zzb, this.zzc);
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String zzb(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str) {
            case "requester_type_0":
                return "0";
            case "requester_type_1":
                return "1";
            case "requester_type_2":
                return "2";
            case "requester_type_3":
                return "3";
            case "requester_type_4":
                return "4";
            case "requester_type_5":
                return "5";
            case "requester_type_6":
                return "6";
            case "requester_type_7":
                return "7";
            case "requester_type_8":
                return "8";
            default:
                return str;
        }
    }

    static /* synthetic */ void zzf(zzdye zzdyeVar, zzdxt zzdxtVar, String str, Pair[] pairArr) {
        ConcurrentHashMap concurrentHashMapZzd = zzdyeVar.zzd();
        zzh(concurrentHashMapZzd, FileUploadManager.f61572j, str);
        for (Pair pair : pairArr) {
            zzh(concurrentHashMapZzd, (String) pair.first, (String) pair.second);
        }
        zzdyeVar.zzb(concurrentHashMapZzd);
    }

    private static void zzh(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}

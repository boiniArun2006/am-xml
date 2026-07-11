package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfbi implements zzfax {
    private final zzgzy zza;
    private final Context zzb;
    private final zzecp zzc;

    zzfbi(zzgzy zzgzyVar, Context context, zzecp zzecpVar) {
        this.zza = zzgzyVar;
        this.zzb = context;
        this.zzc = zzecpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 38;
    }

    @Nullable
    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.Xo zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzfbg zzc() {
        ActivityInfo activityInfo;
        boolean z2;
        String string;
        PackageInfo packageInfo;
        String str;
        String string2;
        String str2;
        String strZza;
        String str3;
        boolean z3;
        PackageInfo packageInfo2;
        Context context = this.zzb;
        PackageManager packageManager = context.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo resolveInfoZzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo resolveInfoZzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        boolean zZzw = com.google.android.gms.ads.internal.util.client.zzf.zzw();
        boolean zIsLatchsky = DeviceProperties.isLatchsky(context);
        boolean zIsSidewinder = DeviceProperties.isSidewinder(context);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i2 = 0; i2 < localeList.size(); i2++) {
            arrayList.add(localeList.get(i2).getLanguage());
        }
        ResolveInfo resolveInfoZzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        String string3 = null;
        if (resolveInfoZzd3 == null || (activityInfo = resolveInfoZzd3.activityInfo) == null) {
            string = null;
            z2 = true;
        } else {
            try {
                z2 = true;
                try {
                    packageInfo = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                z2 = true;
            }
            if (packageInfo != null) {
                int i3 = packageInfo.versionCode;
                String str4 = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 1 + String.valueOf(str4).length());
                sb.append(i3);
                sb.append(".");
                sb.append(str4);
                string = sb.toString();
            } else {
                string = null;
            }
        }
        try {
            packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
        } catch (Exception unused3) {
        }
        if (packageInfo2 != null) {
            int i5 = packageInfo2.versionCode;
            String str5 = packageInfo2.packageName;
            str = string;
            try {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 1 + String.valueOf(str5).length());
                sb2.append(i5);
                sb2.append(".");
                sb2.append(str5);
                string2 = sb2.toString();
            } catch (Exception unused4) {
                string2 = null;
            }
            boolean zEquals = false;
            String str6 = Build.FINGERPRINT;
            String language2 = Locale.getDefault().getLanguage();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoU)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoT)).booleanValue()) {
                    language2 = com.google.android.gms.ads.internal.util.zzs.zzm(this.zzb).zzb();
                }
                str2 = language2;
                strZza = null;
            } else {
                com.google.android.gms.ads.internal.util.zzq zzqVarZzm = com.google.android.gms.ads.internal.util.zzs.zzm(this.zzb);
                String strZzb = zzqVarZzm.zzb();
                strZza = zzqVarZzm.zza();
                str2 = strZzb;
            }
            Context context2 = this.zzb;
            if (packageManager != null) {
                str3 = string2;
            } else {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                if (listQueryIntentActivities == null || resolveInfoResolveActivity == null) {
                    str3 = string2;
                    zEquals = false;
                } else {
                    int i7 = 0;
                    while (i7 < listQueryIntentActivities.size()) {
                        str3 = string2;
                        if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i7).activityInfo.name)) {
                            zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(zzikw.zza(context2));
                            break;
                        }
                        i7++;
                        string2 = str3;
                    }
                    str3 = string2;
                    zEquals = false;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmO)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                z3 = com.google.android.gms.ads.internal.util.zzs.zzG(context2) ? z2 : false;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmS)).booleanValue()) {
                string3 = "";
            } else {
                try {
                    Bundle bundle = Wrappers.packageManager(context2).getApplicationInfo(context2.getPackageName(), 128).metaData;
                    if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                        string3 = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                }
            }
            return new zzfbg(resolveInfoZzd == null ? z2 : false, resolveInfoZzd2 == null ? z2 : false, country, zZzw, zIsLatchsky, zIsSidewinder, language, arrayList, str, str3, str6, zEquals, Build.MODEL, availableBytes, z3, string3, Build.VERSION.SDK_INT, str2, strZza, this.zzc.zza());
        }
        str = string;
        string2 = null;
        boolean zEquals2 = false;
        String str62 = Build.FINGERPRINT;
        String language22 = Locale.getDefault().getLanguage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoU)).booleanValue()) {
        }
        Context context22 = this.zzb;
        if (packageManager != null) {
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmO)).booleanValue()) {
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmS)).booleanValue()) {
        }
        if (resolveInfoZzd2 == null) {
        }
        return new zzfbg(resolveInfoZzd == null ? z2 : false, resolveInfoZzd2 == null ? z2 : false, country, zZzw, zIsLatchsky, zIsSidewinder, language, arrayList, str, str3, str62, zEquals2, Build.MODEL, availableBytes2, z3, string3, Build.VERSION.SDK_INT, str2, strZza, this.zzc.zza());
    }
}

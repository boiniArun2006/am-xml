package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzezk implements zzfax {
    private final ApplicationInfo zza;

    @Nullable
    private final PackageInfo zzb;
    private final Context zzc;

    zzezk(ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 29;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    @Override // com.google.android.gms.internal.ads.zzfax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.common.util.concurrent.Xo zza() {
        String strValueOf;
        String installingPackageName;
        String initiatingPackageName;
        InstallSourceInfo installSourceInfo;
        String str = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        String str2 = null;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        String str3 = packageInfo == null ? null : packageInfo.versionName;
        try {
            Context context = this.zzc;
            zzfyn zzfynVar = com.google.android.gms.ads.internal.util.zzs.zza;
            strValueOf = String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str));
        } catch (PackageManager.NameNotFoundException unused) {
            strValueOf = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzok)).booleanValue()) {
                try {
                    installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str);
                } catch (PackageManager.NameNotFoundException e2) {
                    e = e2;
                    installingPackageName = null;
                }
                if (installSourceInfo != null) {
                    installingPackageName = installSourceInfo.getInstallingPackageName();
                    try {
                        if (TextUtils.isEmpty(installingPackageName)) {
                            com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                            installingPackageName = null;
                        }
                        initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                    }
                    try {
                    } catch (PackageManager.NameNotFoundException e4) {
                        e = e4;
                        str2 = initiatingPackageName;
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PackageInfoSignalSource.getInstallSourceInfo");
                    }
                    if (TextUtils.isEmpty(initiatingPackageName)) {
                        com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                        initiatingPackageName = str2;
                    }
                } else {
                    installingPackageName = null;
                    initiatingPackageName = null;
                }
            }
        }
        return zzgzo.zza(new zzezl(str, numValueOf, str3, strValueOf, installingPackageName, initiatingPackageName));
    }
}

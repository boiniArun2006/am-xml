package com.google.android.gms.measurement.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhj {
    final zzib zza;

    zzhj(zzpf zzpfVar) {
        this.zza = zzpfVar.zzaf();
    }

    @VisibleForTesting
    final boolean zza() {
        try {
            zzib zzibVar = this.zza;
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(zzibVar.zzaY());
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            zzibVar.zzaV().zzk().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e2) {
            this.zza.zzaV().zzk().zzb("Failed to retrieve Play Store version for Install Referrer", e2);
            return false;
        }
    }
}

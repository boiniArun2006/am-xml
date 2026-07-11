package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbja;
import com.google.android.gms.internal.ads.zzcel;
import com.google.common.util.concurrent.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzd {
    public static void zza(Context context) {
        int i2 = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) zzbja.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzi()) {
                    return;
                }
                Xo xoZzb = new zzc(context).zzb();
                int i3 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Updating ad debug logging enablement.");
                zzcel.zza(xoZzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to determine debug setting.", e2);
            }
        }
    }
}

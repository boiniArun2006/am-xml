package com.google.android.gms.ads.internal.adaptersettings;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbgn;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class AdapterSettings {

    @Nullable
    private static volatile AdapterSettings instance;
    private final zzbgn adapterSettingsInternal = zzbd.zzd();

    @KeepForSdk
    private boolean getBoolean(String str, boolean z2) {
        return this.adapterSettingsInternal.zzf(str, z2);
    }

    @KeepForSdk
    private float getFloat(String str, float f3) {
        return this.adapterSettingsInternal.zze(str, f3);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    @KeepForSdk
    private int getInt(String str, int i2) {
        return this.adapterSettingsInternal.zzd(str, i2);
    }

    @KeepForSdk
    private long getLong(String str, long j2) {
        return this.adapterSettingsInternal.zzc(str, j2);
    }

    @KeepForSdk
    private String getString(String str, String str2) {
        return this.adapterSettingsInternal.zzb(str, str2);
    }

    AdapterSettings() {
    }
}

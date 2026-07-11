package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbkh;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {

    @Nullable
    private final zzbkh zza;

    @NonNull
    public NativeAdOptions getNativeAdOptions() {
        return zzbkh.zza(this.zza);
    }

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z2, @Nullable Location location, int i2, int i3, @Nullable String str2, String str3, @Nullable zzbkh zzbkhVar) {
        super(context, str, bundle, bundle2, z2, location, i2, i3, str2, str3);
        this.zza = zzbkhVar;
    }
}

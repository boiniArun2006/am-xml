package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzei extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzep zza;

    public zzei(zzep zzepVar) {
        this.zza = zzepVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z2;
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i2 = 5;
        if (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzep zzepVar = this.zza;
        if (true == z2) {
            i2 = 10;
        }
        zzepVar.zze(i2);
    }
}

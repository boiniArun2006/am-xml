package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzfb extends com.google.android.gms.ads.preload.zzb {
    @Nullable
    public final RewardedAd zza(String str) {
        zzcaz zzcazVarZzq;
        try {
            zzcazVarZzq = this.zza.zzq(str);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            zzcazVarZzq = null;
        }
        if (zzcazVarZzq == null) {
            return null;
        }
        return new zzcbi(zzj(), zzcazVarZzq);
    }

    public zzfb(Context context) {
        super(context, AdFormat.REWARDED);
    }
}

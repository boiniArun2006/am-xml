package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbex;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeo extends com.google.android.gms.ads.preload.zzb {
    @Nullable
    public final AppOpenAd zza(String str) {
        zzbex zzbexVarZzp;
        try {
            zzbexVarZzp = this.zza.zzp(str);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            zzbexVarZzp = null;
        }
        if (zzbexVarZzp == null) {
            return null;
        }
        return new zzbet(zzbexVarZzp);
    }

    public zzeo(Context context) {
        super(context, AdFormat.APP_OPEN_AD);
    }
}

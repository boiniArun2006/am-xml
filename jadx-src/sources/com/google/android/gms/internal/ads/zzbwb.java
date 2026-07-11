package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzbwb implements MediationAdLoadCallback {
    final /* synthetic */ zzbvm zza;
    final /* synthetic */ zzbtz zzb;

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    zzbwb(zzbwf zzbwfVar, zzbvm zzbvmVar, zzbtz zzbtzVar) {
        this.zza = zzbvmVar;
        this.zzb = zzbtzVar;
        Objects.requireNonNull(zzbwfVar);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    @Nullable
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        UnifiedNativeAdMapper unifiedNativeAdMapper = (UnifiedNativeAdMapper) obj;
        String str = qUrazMnwDskFs.cDwtzttjkBmi;
        if (unifiedNativeAdMapper != null) {
            try {
                this.zza.zze(new zzbva(unifiedNativeAdMapper));
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(str, e2);
            }
            return new zzbwg(this.zzb);
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(str, e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, "undefined"));
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcdl implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcen zzb;

    zzcdl(zzcdm zzcdmVar, Context context, zzcen zzcenVar) {
        this.zza = context;
        this.zzb = zzcenVar;
        Objects.requireNonNull(zzcdmVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            this.zzb.zzd(e2);
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception while getting advertising Id info", e2);
        }
    }
}

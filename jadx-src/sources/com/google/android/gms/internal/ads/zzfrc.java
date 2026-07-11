package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfrc extends zzfsa {
    public zzfrc(ClientApi clientApi, Context context, int i2, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock) {
        super(clientApi, context, i2, zzfkgVar, zzftVar, zzceVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock);
    }

    public zzfrc(String str, ClientApi clientApi, Context context, int i2, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock, @Nullable zzfqr zzfqrVar) {
        super(str, clientApi, context, i2, zzfkgVar, zzftVar, zzchVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock, zzfqrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    protected final com.google.common.util.concurrent.Xo zza(Context context) {
        zzbtt zzbttVarZzd = this.zzd.zzd();
        if (zzbttVarZzd == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create an interstitial ad manager."));
        }
        com.google.android.gms.ads.internal.client.zzbx zzbxVarZzc = this.zza.zzc(ObjectWrapper.wrap(context), new com.google.android.gms.ads.internal.client.zzr(), this.zze.zza, zzbttVarZzd, this.zzc);
        if (zzbxVarZzc == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create an interstitial ad manager."));
        }
        zzhah zzhahVarZze = zzhah.zze();
        try {
            zzx(this.zze.zzc);
            zzbxVarZzc.zzQ(this.zze.zzc, new zzfrb(this, zzhahVarZze, zzbxVarZzc));
            return zzhahVarZze;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load interstitial ad.", e2);
            return zzgzo.zzc(new zzfqs(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    protected final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzQ)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    @Nullable
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzc(Object obj) {
        try {
            return ((com.google.android.gms.ads.internal.client.zzbx) obj).zzt();
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for  the interstitial ad.", e2);
            return null;
        }
    }
}

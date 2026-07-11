package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfqz extends zzfsa {
    public zzfqz(ClientApi clientApi, Context context, int i2, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock) {
        super(clientApi, context, i2, zzfkgVar, zzftVar, zzceVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock);
    }

    public zzfqz(String str, ClientApi clientApi, Context context, int i2, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock, @Nullable zzfqr zzfqrVar) {
        super(str, clientApi, context, i2, zzfkgVar, zzftVar, zzchVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock, zzfqrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    protected final com.google.common.util.concurrent.Xo zza(Context context) {
        zzbtt zzbttVarZzd = this.zzd.zzd();
        if (zzbttVarZzd == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create an app open ad manager."));
        }
        com.google.android.gms.ads.internal.client.zzbx zzbxVarZzm = this.zza.zzm(ObjectWrapper.wrap(context), com.google.android.gms.ads.internal.client.zzr.zzd(), this.zze.zza, zzbttVarZzd, this.zzc);
        if (zzbxVarZzm == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create an app open ad manager."));
        }
        zzhah zzhahVarZze = zzhah.zze();
        try {
            zzx(this.zze.zzc);
            zzbxVarZzm.zzJ(new zzfqy(this, zzhahVarZze, this.zze));
            zzbxVarZzm.zze(this.zze.zzc);
            return zzhahVarZze;
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load app open ad.", e2);
            return zzgzo.zzc(new zzfqs(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    protected final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzS)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    @Nullable
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzc(Object obj) {
        try {
            return ((zzbex) obj).zzg();
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the app open ad.", e2);
            return null;
        }
    }
}

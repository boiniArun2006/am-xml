package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfsf extends zzfsa {
    public zzfsf(ClientApi clientApi, Context context, int i2, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock) {
        super(clientApi, context, i2, zzfkgVar, zzftVar, zzceVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock);
    }

    public zzfsf(String str, ClientApi clientApi, Context context, int i2, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock, @Nullable zzfqr zzfqrVar) {
        super(str, clientApi, context, i2, zzfkgVar, zzftVar, zzchVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock, zzfqrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    protected final com.google.common.util.concurrent.Xo zza(Context context) {
        zzbtt zzbttVarZzd = this.zzd.zzd();
        if (zzbttVarZzd == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create a rewarded ad."));
        }
        zzcaz zzcazVarZzl = this.zza.zzl(ObjectWrapper.wrap(context), this.zze.zza, zzbttVarZzd, this.zzc);
        if (zzcazVarZzl == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create a rewarded ad."));
        }
        zzhah zzhahVarZze = zzhah.zze();
        try {
            zzx(this.zze.zzc);
            zzcazVarZzl.zzc(this.zze.zzc, new zzfse(this, zzhahVarZze, zzcazVarZzl));
            return zzhahVarZze;
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to load rewarded ad.");
            return zzgzo.zzc(new zzfqs(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    protected final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzR)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    @Nullable
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzc(Object obj) {
        try {
            return ((zzcaz) obj).zzm();
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the rewarded ad.", e2);
            return null;
        }
    }
}

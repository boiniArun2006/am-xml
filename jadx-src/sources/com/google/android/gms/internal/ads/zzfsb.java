package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfsb {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final zzfmy zzd;
    private final ClientApi zze = new ClientApi();
    private final zzfkg zzf;
    private final Clock zzg;

    @Nullable
    private final zzfqr zzh;

    @Nullable
    public final zzfsa zzb(String str, com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzch zzchVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zze;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzb;
            return new zzfrc(str, clientApi, context, versionInfoParcel.clientJarVersion, this.zzf, zzftVar, zzchVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zze;
            Context context2 = this.zza;
            VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new zzfsf(str, clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zzf, zzftVar, zzchVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zze;
        Context context3 = this.zza;
        VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new zzfqz(str, clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zzf, zzftVar, zzchVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
    }

    private final zzfra zzc() {
        return new zzfra(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzG)).longValue(), 2.0d, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzH)).longValue(), 0.2d, this.zzg);
    }

    @Nullable
    public final zzfsa zza(com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzce zzceVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zze;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzb;
            return new zzfrc(clientApi, context, versionInfoParcel.clientJarVersion, this.zzf, zzftVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zze;
            Context context2 = this.zza;
            VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new zzfsf(clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zzf, zzftVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zze;
        Context context3 = this.zza;
        VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new zzfqz(clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zzf, zzftVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg);
    }

    zzfsb(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfkg zzfkgVar, Clock clock, @Nullable zzfqr zzfqrVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfmyVar;
        this.zzg = clock;
        this.zzf = zzfkgVar;
        this.zzh = zzfqrVar;
    }
}

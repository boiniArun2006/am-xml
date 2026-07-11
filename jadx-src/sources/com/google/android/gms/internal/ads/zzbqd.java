package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbqd implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcen zza;
    final /* synthetic */ zzbqf zzb;

    zzbqd(zzbqf zzbqfVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzbqfVar);
        this.zzb = zzbqfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zzc().zzp());
        } catch (DeadObjectException e2) {
            this.zza.zzd(e2);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 23);
        sb.append("onConnectionSuspended: ");
        sb.append(i2);
        this.zza.zzd(new RuntimeException(sb.toString()));
    }
}

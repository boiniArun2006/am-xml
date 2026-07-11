package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcbj implements RewardItem {
    private final zzcaw zza;

    public zzcbj(zzcaw zzcawVar) {
        this.zza = zzcawVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzcaw zzcawVar = this.zza;
        if (zzcawVar != null) {
            try {
                return zzcawVar.zzf();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getAmount to RewardItem", e2);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    @Nullable
    public final String getType() {
        zzcaw zzcawVar = this.zza;
        if (zzcawVar != null) {
            try {
                return zzcawVar.zze();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getType to RewardItem", e2);
            }
        }
        return null;
    }
}

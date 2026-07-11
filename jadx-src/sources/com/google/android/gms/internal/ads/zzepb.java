package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzepb implements zzeki {
    private final zzeqf zza;
    private final zzdvp zzb;

    zzepb(zzeqf zzeqfVar, zzdvp zzdvpVar) {
        this.zza = zzeqfVar;
        this.zzb = zzdvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeki
    @Nullable
    public final zzekj zza(String str, JSONObject jSONObject) throws zzfjr {
        zzbvs zzbvsVarZzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzck)).booleanValue()) {
            try {
                zzbvsVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e2);
                zzbvsVarZzb = null;
            }
        } else {
            zzbvsVarZzb = this.zza.zzb(str);
        }
        if (zzbvsVarZzb == null) {
            return null;
        }
        return new zzekj(zzbvsVarZzb, new zzelv(), str);
    }
}

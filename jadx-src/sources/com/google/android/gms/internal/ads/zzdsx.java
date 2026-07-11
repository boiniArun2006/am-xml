package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdsx implements zzboh {

    @Nullable
    private final zzblw zza;
    private final zzdtk zzb;
    private final zzika zzc;

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzblm) this.zzc.zzb(), str);
        } catch (RemoteException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            String string = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(string, e2);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }

    public zzdsx(zzdor zzdorVar, zzdoh zzdohVar, zzdtk zzdtkVar, zzika zzikaVar) {
        this.zza = zzdorVar.zzg(zzdohVar.zzS());
        this.zzb = zzdtkVar;
        this.zzc = zzikaVar;
    }
}

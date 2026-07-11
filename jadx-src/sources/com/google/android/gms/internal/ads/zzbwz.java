package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbwz extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }

    public zzbwz(zzbkl zzbklVar) {
        try {
            this.zzb = zzbklVar.zzb();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbklVar.zzc()) {
                zzbks zzbksVarZzh = obj instanceof IBinder ? zzbkr.zzh((IBinder) obj) : null;
                if (zzbksVarZzh != null) {
                    this.zza.add(new zzbxb(zzbksVarZzh));
                }
            }
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
        }
    }
}

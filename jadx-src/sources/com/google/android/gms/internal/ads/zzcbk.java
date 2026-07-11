package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final /* synthetic */ class zzcbk implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ zzcbk zza = new zzcbk();

    private /* synthetic */ zzcbk() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return iInterfaceQueryLocalInterface instanceof zzcbd ? (zzcbd) iInterfaceQueryLocalInterface : new zzcbd(iBinder);
    }
}

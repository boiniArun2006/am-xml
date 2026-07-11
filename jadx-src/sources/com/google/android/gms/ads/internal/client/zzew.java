package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbqm;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzew extends zzbqm {
    final /* synthetic */ zzex zza;

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(List list) throws RemoteException {
        int i2;
        ArrayList arrayList;
        zzex zzexVar = this.zza;
        synchronized (zzexVar.zzw()) {
            zzexVar.zzy(false);
            zzexVar.zzz(true);
            arrayList = new ArrayList(zzexVar.zzx());
            zzexVar.zzx().clear();
        }
        InitializationStatus initializationStatusZzB = zzex.zzB(list);
        int size = arrayList.size();
        for (i2 = 0; i2 < size; i2++) {
            ((OnInitializationCompleteListener) arrayList.get(i2)).onInitializationComplete(initializationStatusZzB);
        }
    }

    /* synthetic */ zzew(zzex zzexVar, byte[] bArr) {
        Objects.requireNonNull(zzexVar);
        this.zza = zzexVar;
    }
}

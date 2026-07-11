package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbxl;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@KeepForSdk
public class OfflinePingSender extends Worker {
    private final zzbxl zza;

    @Override // androidx.work.Worker
    @NonNull
    public final ListenableWorker.Result doWork() {
        return (ListenableWorker.Result) VMRunner.invoke("TKx6CkZHzJPV8ped", new Object[]{this});
    }

    public OfflinePingSender(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzbb.zzb().zzk(context, new zzbtp());
    }
}

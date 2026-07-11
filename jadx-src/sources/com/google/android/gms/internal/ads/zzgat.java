package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgat {
    public static com.google.common.util.concurrent.Xo zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzgar zzgarVar = new zzgar(task, null);
        task.addOnCompleteListener(zzhaf.zza(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzgas
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                zzgar zzgarVar2 = zzgarVar;
                if (task2.isCanceled()) {
                    zzgarVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzgarVar2.zza(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzgarVar2.zzb(exception);
            }
        });
        return zzgarVar;
    }
}

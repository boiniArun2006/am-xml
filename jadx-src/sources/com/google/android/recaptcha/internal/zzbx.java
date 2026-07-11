package com.google.android.recaptcha.internal;

import GJW.P;
import GJW.ci;
import GJW.r;
import GJW.xuv;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzbx {
    public static final P zza(Task task) {
        final r rVarT = ci.t(null, 1, null);
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                r rVar = rVarT;
                Exception exception = task2.getException();
                if (exception != null) {
                    rVar.n(exception);
                } else if (task2.isCanceled()) {
                    xuv.j.rl(rVar, null, 1, null);
                } else {
                    rVar.eF(task2.getResult());
                }
            }
        });
        return new zzbw(rVarT);
    }
}

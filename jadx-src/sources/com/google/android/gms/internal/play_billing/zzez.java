package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzdy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzez extends zzdy.zzi implements Runnable {
    private final Runnable zzc;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzc.run();
        } catch (Throwable th) {
            zzo(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    protected final String zzg() {
        return "task=[" + this.zzc.toString() + "]";
    }

    public zzez(Runnable runnable) {
        runnable.getClass();
        this.zzc = runnable;
    }
}

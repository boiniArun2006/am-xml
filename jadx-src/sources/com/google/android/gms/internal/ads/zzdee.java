package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzdee implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdeg zzdegVar = (zzdeg) this.zza.get();
        if (zzdegVar != null) {
            zzdegVar.zzs(zzded.zza);
        }
    }
}

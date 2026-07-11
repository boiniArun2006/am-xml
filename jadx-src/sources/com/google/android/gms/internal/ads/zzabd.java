package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzabd implements Runnable {
    private final zzabc zza;

    public zzabd(zzabc zzabcVar) {
        this.zza = zzabcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzo();
    }
}

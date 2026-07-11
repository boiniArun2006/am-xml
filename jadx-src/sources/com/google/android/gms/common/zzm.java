package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class zzm extends zzj {
    private static final WeakReference zzb = new WeakReference(null);
    private WeakReference zza;

    protected abstract byte[] zzb();

    @Override // com.google.android.gms.common.zzj
    final byte[] zzc() {
        byte[] bArrZzb;
        synchronized (this) {
            try {
                bArrZzb = (byte[]) this.zza.get();
                if (bArrZzb == null) {
                    bArrZzb = zzb();
                    this.zza = new WeakReference(bArrZzb);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrZzb;
    }

    zzm(byte[] bArr) {
        super(bArr);
        this.zza = zzb;
    }
}

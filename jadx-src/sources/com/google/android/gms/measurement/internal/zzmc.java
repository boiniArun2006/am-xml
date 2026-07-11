package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzmc implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zznk zzd;

    zzmc(zznk zznkVar, AtomicReference atomicReference, zzr zzrVar, boolean z2) {
        this.zza = atomicReference;
        this.zzb = zzrVar;
        this.zzc = z2;
        Objects.requireNonNull(zznkVar);
        this.zzd = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zznk zznkVar;
        zzga zzgaVarZzZ;
        AtomicReference atomicReference2 = this.zza;
        synchronized (atomicReference2) {
            try {
                try {
                    zznkVar = this.zzd;
                    zzgaVarZzZ = zznkVar.zzZ();
                } catch (RemoteException e2) {
                    this.zzd.zzu.zzaV().zzb().zzb("Failed to get all user properties; remote exception", e2);
                    atomicReference = this.zza;
                }
                if (zzgaVarZzZ == null) {
                    zznkVar.zzu.zzaV().zzb().zza("Failed to get all user properties; not connected to service");
                    atomicReference2.notify();
                    return;
                }
                zzr zzrVar = this.zzb;
                Preconditions.checkNotNull(zzrVar);
                atomicReference2.set(zzgaVarZzZ.zzj(zzrVar, this.zzc));
                zznkVar.zzV();
                atomicReference = this.zza;
                atomicReference.notify();
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}

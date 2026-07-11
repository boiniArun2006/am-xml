package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzmw implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzr zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zznk zzf;

    zzmw(zznk zznkVar, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar, boolean z2) {
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzrVar;
        this.zze = z2;
        Objects.requireNonNull(zznkVar);
        this.zzf = zznkVar;
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
                    zznkVar = this.zzf;
                    zzgaVarZzZ = zznkVar.zzZ();
                } catch (RemoteException e2) {
                    this.zzf.zzu.zzaV().zzb().zzd("(legacy) Failed to get user properties; remote exception", null, this.zzb, e2);
                    this.zza.set(Collections.EMPTY_LIST);
                    atomicReference = this.zza;
                }
                if (zzgaVarZzZ == null) {
                    zznkVar.zzu.zzaV().zzb().zzd("(legacy) Failed to get user properties; not connected to service", null, this.zzb, this.zzc);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    zzr zzrVar = this.zzd;
                    Preconditions.checkNotNull(zzrVar);
                    atomicReference2.set(zzgaVarZzZ.zzp(this.zzb, this.zzc, this.zze, zzrVar));
                } else {
                    atomicReference2.set(zzgaVarZzZ.zzq(null, this.zzb, this.zzc, this.zze));
                }
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

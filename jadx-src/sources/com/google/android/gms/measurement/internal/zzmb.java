package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzmb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzr zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zze;
    final /* synthetic */ zznk zzf;

    zzmb(zznk zznkVar, String str, String str2, zzr zzrVar, boolean z2, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = z2;
        this.zze = zzcuVar;
        Objects.requireNonNull(zznkVar);
        this.zzf = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e2;
        Bundle bundle2 = new Bundle();
        try {
            zznk zznkVar = this.zzf;
            zzga zzgaVarZzZ = zznkVar.zzZ();
            if (zzgaVarZzZ == null) {
                zzib zzibVar = zznkVar.zzu;
                zzibVar.zzaV().zzb().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                zzibVar.zzk().zzaq(this.zze, bundle2);
                return;
            }
            zzr zzrVar = this.zzc;
            Preconditions.checkNotNull(zzrVar);
            List<zzpk> listZzp = zzgaVarZzZ.zzp(this.zza, this.zzb, this.zzd, zzrVar);
            int i2 = zzpo.zza;
            bundle = new Bundle();
            if (listZzp != null) {
                for (zzpk zzpkVar : listZzp) {
                    String str = zzpkVar.zze;
                    if (str != null) {
                        bundle.putString(zzpkVar.zzb, str);
                    } else {
                        Long l2 = zzpkVar.zzd;
                        if (l2 != null) {
                            bundle.putLong(zzpkVar.zzb, l2.longValue());
                        } else {
                            Double d2 = zzpkVar.zzg;
                            if (d2 != null) {
                                bundle.putDouble(zzpkVar.zzb, d2.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    zznkVar.zzV();
                    zzib zzibVar2 = zznkVar.zzu;
                    zzibVar2.zzk().zzaq(this.zze, bundle);
                } catch (RemoteException e3) {
                    e2 = e3;
                    this.zzf.zzu.zzaV().zzb().zzc("Failed to get user properties; remote exception", this.zza, e2);
                    zznk zznkVar2 = this.zzf;
                    zznkVar2.zzu.zzk().zzaq(this.zze, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                zznk zznkVar3 = this.zzf;
                zznkVar3.zzu.zzk().zzaq(this.zze, bundle2);
                throw th;
            }
        } catch (RemoteException e4) {
            bundle = bundle2;
            e2 = e4;
        } catch (Throwable th2) {
            th = th2;
            zznk zznkVar32 = this.zzf;
            zznkVar32.zzu.zzk().zzaq(this.zze, bundle2);
            throw th;
        }
    }
}

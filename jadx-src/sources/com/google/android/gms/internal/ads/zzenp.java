package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzenp implements zzgzl {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfiu zzb;
    final /* synthetic */ zzfir zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfqg zze;
    final /* synthetic */ zzfjc zzf;
    final /* synthetic */ zzenr zzg;

    zzenp(zzenr zzenrVar, long j2, zzfiu zzfiuVar, zzfir zzfirVar, String str, zzfqg zzfqgVar, zzfjc zzfjcVar) {
        this.zza = j2;
        this.zzb = zzfiuVar;
        this.zzc = zzfirVar;
        this.zzd = str;
        this.zze = zzfqgVar;
        this.zzf = zzfjcVar;
        Objects.requireNonNull(zzenrVar);
        this.zzg = zzenrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Throwable th) {
        int i2;
        int i3;
        com.google.android.gms.ads.internal.client.zze zzeVarZzb;
        Integer numValueOf;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzenr zzenrVar = this.zzg;
        long jElapsedRealtime = zzenrVar.zzj().elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i3 = 2;
        } else {
            if (th instanceof zzemz) {
                i2 = 3;
            } else if (th instanceof CancellationException) {
                i3 = 4;
            } else if (th instanceof zzfjr) {
                i3 = 5;
            } else if (th instanceof zzecr) {
                i3 = zzfkm.zza(th).zza == 3 ? 1 : 6;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzci)).booleanValue() && (th instanceof zzekk) && (zzeVarZzb = ((zzekk) th).zzb()) != null) {
                    numValueOf = Integer.valueOf(zzeVarZzb.zza);
                    i2 = i3;
                    synchronized (zzenrVar) {
                        try {
                            if (zzenrVar.zzn()) {
                                zzenrVar.zzk().zza(this.zzb, this.zzc, i2, th instanceof zzekk ? (zzekk) th : null, jElapsedRealtime);
                                jElapsedRealtime = jElapsedRealtime;
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjG)).booleanValue()) {
                                zzfqk zzfqkVarZzl = zzenrVar.zzl();
                                zzfqg zzfqgVar = this.zze;
                                zzfjc zzfjcVar = this.zzf;
                                zzfir zzfirVar = this.zzc;
                                zzfqkVarZzl.zza(zzfqgVar.zza(zzfjcVar, zzfirVar, zzfirVar.zzn), zzfirVar.zzax);
                            }
                            if (zzenrVar.zzp()) {
                                return;
                            }
                            LinkedHashMap linkedHashMapZzm = zzenrVar.zzm();
                            zzfir zzfirVar2 = this.zzc;
                            linkedHashMapZzm.put(zzfirVar2, new zzenq(this.zzd, zzfirVar2.zzaf, i2, jElapsedRealtime, numValueOf));
                            com.google.android.gms.ads.internal.client.zze zzeVarZza = zzfkm.zza(th);
                            int i5 = zzeVarZza.zza;
                            if ((i5 == 3 || i5 == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                                zzeVarZza = zzfkm.zza(new zzekk(13, zzeVarZza.zzd));
                            }
                            zzenrVar.zzo().zze(zzfirVar2, jElapsedRealtime, zzeVarZza);
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } else {
                i2 = 6;
            }
            numValueOf = null;
            synchronized (zzenrVar) {
            }
        }
        i2 = i3;
        numValueOf = null;
        synchronized (zzenrVar) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        long j2;
        zzenr zzenrVar = this.zzg;
        long jElapsedRealtime = zzenrVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzenrVar) {
            try {
                if (zzenrVar.zzn()) {
                    j2 = jElapsedRealtime;
                    zzenrVar.zzk().zza(this.zzb, this.zzc, 0, null, j2);
                } else {
                    j2 = jElapsedRealtime;
                }
                if (zzenrVar.zzp()) {
                    return;
                }
                zzfir zzfirVar = this.zzc;
                if (zzenrVar.zzi(zzfirVar)) {
                    ((zzenq) zzenrVar.zzm().get(zzfirVar)).zzd = j2;
                } else {
                    long j3 = j2;
                    j2 = j3;
                    zzenrVar.zzm().put(zzfirVar, new zzenq(this.zzd, zzfirVar.zzaf, 0, j3, null));
                }
                zzenrVar.zzo().zzd(zzfirVar, j2, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

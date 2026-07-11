package com.google.android.gms.internal.ads;

import com.alightcreative.time.Kw.znsSxz;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgis {
    private final zzgmu zza;
    private final zzgkg zzb;
    private final zzgkx zzc;
    private final zzgoe zzd;
    private final zzgcl zze;
    private final boolean zzf;
    private final long zzg;
    private final long zzh;

    zzgis(zzgmu zzgmuVar, zzgkg zzgkgVar, zzgkx zzgkxVar, zzgoe zzgoeVar, zzgcl zzgclVar, boolean z2, long j2, long j3) {
        this.zza = zzgmuVar;
        this.zzb = zzgkgVar;
        this.zzc = zzgkxVar;
        this.zzd = zzgoeVar;
        this.zze = zzgclVar;
        this.zzf = z2;
        this.zzg = j2;
        this.zzh = j3;
    }

    private final com.google.common.util.concurrent.Xo zzh(final int i2) {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk(zzgzg.zzw(this.zzb.zza()), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgij
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                zzgds zzgdsVar = (zzgds) obj;
                this.zza.zzd(zzgdsVar);
                return zzgdsVar;
            }
        }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgik
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zze((zzgds) obj);
            }
        }, zzhaf.zza()), zzgil.zza, zzhaf.zza()), zzgie.class, zzgim.zza, zzhaf.zza()), zzgif.class, zzgin.zza, zzhaf.zza()), zzgid.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgio
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzf(i2, (zzgid) obj);
            }
        }, zzhaf.zza());
        this.zzd.zze(1002, zzgzgVar);
        return zzgzgVar;
    }

    final void zza(long j2) {
        if (j2 > 0) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgiq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            }, j2);
        } else {
            zzb();
        }
    }

    final com.google.common.util.concurrent.Xo zzb() {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg(zzgzg.zzw(this.zzc.zzb()), Throwable.class, zzgih.zza, zzhaf.zza());
        final zzgmu zzgmuVar = this.zza;
        Objects.requireNonNull(zzgmuVar);
        return (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk(zzgzgVar, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgig
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return new Boolean(zzgmuVar.zza((zzgdu) obj));
            }
        }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgii
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzc((Boolean) obj);
            }
        }, zzhaf.zza());
    }

    final /* synthetic */ zzgir zzf(final int i2, zzgid zzgidVar) {
        if (this.zzf && i2 < this.zzg) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgip
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(i2);
                }
            }, this.zzh * ((long) Math.pow(2.0d, i2)));
        }
        return zzgir.RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION;
    }

    final /* synthetic */ void zzg(int i2) {
        zzh(i2 + 1);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzc(Boolean bool) {
        if (!bool.booleanValue()) {
            this.zzd.zzb(1003);
            return zzgzo.zza(zzgir.RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID);
        }
        return zzh(0);
    }

    final /* synthetic */ zzgds zzd(zzgds zzgdsVar) {
        int iZzj = zzgdsVar.zzj() - 1;
        if (iZzj != 1 && iZzj != 2) {
            if (iZzj != 3) {
                if (iZzj != 12) {
                    zzgoe zzgoeVar = this.zzd;
                    int iZzj2 = zzgdsVar.zzj() - 1;
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzj2).length());
                    sb.append(iZzj2);
                    zzgoeVar.zzc(1005, sb.toString());
                    throw new zzgie(zzgdsVar.zzj() - 1);
                }
                zzgoe zzgoeVar2 = this.zzd;
                int iZzj3 = zzgdsVar.zzj() - 1;
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj3).length());
                sb2.append(iZzj3);
                zzgoeVar2.zzc(1005, sb2.toString());
                throw new zzgid(zzgdsVar.zzj() - 1);
            }
            zzgoe zzgoeVar3 = this.zzd;
            int iZzj4 = zzgdsVar.zzj() - 1;
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj4).length());
            sb3.append(iZzj4);
            zzgoeVar3.zzc(1004, sb3.toString());
            throw new zzgif(zzgdsVar.zzj() - 1);
        }
        return zzgdsVar;
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zze(zzgds zzgdsVar) {
        if (zzgdsVar.zzj() == 2) {
            return this.zzc.zzd(zzgdsVar.zza(), zzgdsVar.zzb().zzy());
        }
        if (zzgdsVar.zzj() == 3) {
            return this.zzc.zzc(zzgdsVar.zza(), zzgdsVar.zzc().zzy(), zzgdsVar.zzb().zzy());
        }
        throw new AssertionError(znsSxz.fpOpVlInVoCsS);
    }
}

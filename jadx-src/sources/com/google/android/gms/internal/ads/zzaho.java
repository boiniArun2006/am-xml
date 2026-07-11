package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzaho implements zzaeu {
    private zzaex zzb;
    private zzahv zzc;
    private zzaev zzd;
    private zzagd zze;

    @Nullable
    private zzakw zzf;
    private int zzh;
    private long zzi;
    private int zzj;
    private final zzer zza = new zzer(16);
    private long zzk = -1;
    private int zzg = 0;

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzb = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    private final void zzh() {
        zzaex zzaexVar = this.zzb;
        zzaexVar.getClass();
        zzaexVar.zzv();
        this.zzb.zzw(new zzafx(-9223372036854775807L, 0L));
        this.zzg = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        int i2;
        zzer zzerVar = new zzer(16);
        boolean z2 = true;
        while (true) {
            zzerVar.zza(8);
            if (!zzaevVar.zzh(zzerVar.zzi(), 0, 8, true)) {
                return false;
            }
            long jZzz = zzerVar.zzz();
            int iZzB = zzerVar.zzB();
            if (jZzz != 1) {
                i2 = 8;
            } else {
                if (!zzaevVar.zzh(zzerVar.zzi(), 8, 8, true)) {
                    return false;
                }
                jZzz = zzerVar.zzJ();
                i2 = 16;
            }
            long j2 = i2;
            if (jZzz < j2) {
                return false;
            }
            int i3 = (int) (jZzz - j2);
            if (z2) {
                if (iZzB != 1718909296 || i3 < 8) {
                    return false;
                }
                zzerVar.zza(4);
                zzael zzaelVar = (zzael) zzaevVar;
                zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
                if (zzerVar.zzB() != 1751476579) {
                    return false;
                }
                zzaelVar.zzj(i3 - 4, false);
            } else {
                if (iZzB == 1836086884) {
                    return true;
                }
                if (i3 != 0) {
                    ((zzael) zzaevVar).zzj(i3, false);
                }
            }
            z2 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        while (true) {
            int i2 = this.zzg;
            if (i2 == 0) {
                if (this.zzj == 0) {
                    zzer zzerVar = this.zza;
                    if (!zzaevVar.zzb(zzerVar.zzi(), 0, 8, true)) {
                        zzh();
                        return -1;
                    }
                    this.zzj = 8;
                    zzerVar.zzh(0);
                    this.zzi = zzerVar.zzz();
                    this.zzh = zzerVar.zzB();
                }
                long jZzJ = this.zzi;
                if (jZzJ == 1) {
                    zzer zzerVar2 = this.zza;
                    zzaevVar.zzc(zzerVar2.zzi(), 8, 8);
                    this.zzj += 8;
                    jZzJ = zzerVar2.zzJ();
                    this.zzi = jZzJ;
                }
                if (this.zzh == 1836086884) {
                    long jZzn = zzaevVar.zzn();
                    this.zzk = jZzn;
                    long j2 = this.zzj;
                    zzahv zzahvVar = new zzahv(0L, jZzn - j2, -9223372036854775807L, jZzn, jZzJ - j2);
                    this.zzc = zzahvVar;
                    zzaex zzaexVar = this.zzb;
                    zzaexVar.getClass();
                    zzagh zzaghVarZzu = zzaexVar.zzu(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzl(MimeTypes.IMAGE_HEIC);
                    zztVar.zzk(new zzap(-9223372036854775807L, zzahvVar));
                    zzaghVarZzu.zzz(zztVar.zzM());
                    this.zzg = 2;
                } else {
                    this.zzg = 1;
                }
            } else if (i2 == 1) {
                zzaevVar.zzf((int) (this.zzi - ((long) this.zzj)));
                this.zzj = 0;
                this.zzg = 0;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return -1;
                    }
                    if (this.zze == null || zzaevVar != this.zzd) {
                        this.zzd = zzaevVar;
                        this.zze = new zzagd(zzaevVar, this.zzk);
                    }
                    zzakw zzakwVar = this.zzf;
                    zzakwVar.getClass();
                    int iZzd = zzakwVar.zzd(this.zze, zzafvVar);
                    if (iZzd == 1) {
                        zzafvVar.zza += this.zzk;
                    }
                    return iZzd;
                }
                if (this.zzf == null) {
                    this.zzf = new zzakw(zzamd.zza, 8);
                }
                zzagd zzagdVar = new zzagd(zzaevVar, this.zzk);
                this.zze = zzagdVar;
                if (this.zzf.zza(zzagdVar)) {
                    zzakw zzakwVar2 = this.zzf;
                    long j3 = this.zzk;
                    zzaex zzaexVar2 = this.zzb;
                    zzaexVar2.getClass();
                    zzakwVar2.zzc(new zzagf(j3, zzaexVar2));
                    this.zzg = 3;
                } else {
                    zzh();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j3) {
        if (j2 != 0) {
            if (this.zzg == 3) {
                zzakw zzakwVar = this.zzf;
                zzakwVar.getClass();
                zzakwVar.zze(j2, j3);
                return;
            }
            return;
        }
        this.zzg = 0;
        this.zzj = 0;
        this.zzk = -1L;
        if (this.zzf != null) {
            this.zzf = null;
        }
    }
}

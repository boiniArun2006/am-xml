package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzapo implements zzaqc {
    private final zzapn zza;
    private final zzer zzb = new zzer(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzc(zzer zzerVar, int i2) {
        int i3 = i2 & 1;
        int iZzg = i3 != 0 ? zzerVar.zzg() + zzerVar.zzs() : -1;
        if (this.zzf) {
            if (i3 == 0) {
                return;
            }
            this.zzf = false;
            zzerVar.zzh(iZzg);
            this.zzd = 0;
        }
        while (zzerVar.zzd() > 0) {
            int i5 = this.zzd;
            if (i5 < 3) {
                if (i5 == 0) {
                    int iZzs = zzerVar.zzs();
                    zzerVar.zzh(zzerVar.zzg() - 1);
                    if (iZzs == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzerVar.zzd(), 3 - this.zzd);
                zzer zzerVar2 = this.zzb;
                zzerVar.zzm(zzerVar2.zzi(), this.zzd, iMin);
                int i7 = this.zzd + iMin;
                this.zzd = i7;
                if (i7 == 3) {
                    zzerVar2.zzh(0);
                    zzerVar2.zzf(3);
                    zzerVar2.zzk(1);
                    int iZzs2 = zzerVar2.zzs();
                    boolean z2 = (iZzs2 & 128) != 0;
                    int iZzs3 = zzerVar2.zzs();
                    this.zze = z2;
                    this.zzc = (((iZzs2 & 15) << 8) | iZzs3) + 3;
                    int iZzj = zzerVar2.zzj();
                    int i8 = this.zzc;
                    if (iZzj < i8) {
                        int iZzj2 = zzerVar2.zzj();
                        zzerVar2.zzc(Math.min(4098, Math.max(i8, iZzj2 + iZzj2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzerVar.zzd(), this.zzc - this.zzd);
                zzer zzerVar3 = this.zzb;
                zzerVar.zzm(zzerVar3.zzi(), this.zzd, iMin2);
                int i9 = this.zzd + iMin2;
                this.zzd = i9;
                int i10 = this.zzc;
                if (i9 != i10) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzerVar3.zzf(i10);
                    } else {
                        if (zzfj.zzG(zzerVar3.zzi(), 0, i10, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        zzerVar3.zzf(this.zzc - 4);
                    }
                    zzerVar3.zzh(0);
                    this.zza.zzb(zzerVar3);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
        this.zza.zza(zzfgVar, zzaexVar, zzaqbVar);
        this.zzf = true;
    }

    public zzapo(zzapn zzapnVar) {
        this.zza = zzapnVar;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzapa implements zzaon {
    private String zzf;
    private zzagh zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final String zza = "video/mp2t";
    private int zze = 0;
    private final zzer zzb = new zzer(new byte[15], 2);
    private final zzeq zzc = new zzeq();
    private final zzer zzd = new zzer();
    private final zzapb zzq = new zzapb();
    private int zzr = -2147483647;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zza(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = -2147483647;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1L;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i2) {
        this.zzl = i2;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j2 != -9223372036854775807L) {
            double d2 = j2;
            if (this.zzj) {
                this.zzi = d2;
            } else {
                this.zzh = d2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) throws zzat {
        int i2;
        this.zzg.getClass();
        while (zzerVar.zzd() > 0) {
            int i3 = this.zze;
            int iZzj = 0;
            if (i3 == 0) {
                int i5 = this.zzl;
                if ((i5 & 2) != 0) {
                    if ((i5 & 4) == 0) {
                        while (zzerVar.zzd() > 0) {
                            int i7 = this.zzm << 8;
                            this.zzm = i7;
                            int iZzs = i7 | zzerVar.zzs();
                            this.zzm = iZzs;
                            if ((iZzs & 16777215) == 12583333) {
                                zzerVar.zzh(zzerVar.zzg() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                }
                zzerVar.zzh(zzerVar.zze());
            } else if (i3 != 1) {
                zzapb zzapbVar = this.zzq;
                int i8 = zzapbVar.zza;
                if (i8 == 1 || i8 == 17) {
                    zzf(zzerVar, this.zzd, true);
                }
                int iMin = Math.min(zzerVar.zzd(), zzapbVar.zzc - this.zzo);
                this.zzg.zzc(zzerVar, iMin);
                int i9 = this.zzo + iMin;
                this.zzo = i9;
                if (i9 == zzapbVar.zzc) {
                    int i10 = zzapbVar.zza;
                    if (i10 == 1) {
                        byte[] bArrZzi = this.zzd.zzi();
                        zzapc zzapcVarZzb = zzapd.zzb(new zzeq(bArrZzi, bArrZzi.length));
                        this.zzr = zzapcVarZzb.zzb;
                        this.zzs = zzapcVarZzb.zzc;
                        long j2 = this.zzu;
                        long j3 = zzapbVar.zzb;
                        if (j2 != j3) {
                            this.zzu = j3;
                            int i11 = zzapcVarZzb.zza;
                            String strConcat = i11 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i11))) : "mhm1";
                            byte[] bArr = zzapcVarZzb.zzd;
                            zzguf zzgufVarZzk = null;
                            if (bArr != null && bArr.length > 0) {
                                zzgufVarZzk = zzguf.zzk(zzfj.zzb, bArr);
                            }
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzf);
                            zztVar.zzl(this.zza);
                            zztVar.zzm("audio/mhm1");
                            zztVar.zzF(this.zzr);
                            zztVar.zzj(strConcat);
                            zztVar.zzp(zzgufVarZzk);
                            this.zzg.zzz(zztVar.zzM());
                        }
                        this.zzv = true;
                    } else if (i10 == 17) {
                        byte[] bArrZzi2 = this.zzd.zzi();
                        zzeq zzeqVar = new zzeq(bArrZzi2, bArrZzi2.length);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(2);
                            iZzj = zzeqVar.zzj(13);
                        }
                        this.zzt = iZzj;
                    } else if (i10 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        int i12 = this.zzs - this.zzt;
                        double d2 = this.zzr;
                        long jRound = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (((double) i12) * 1000000.0d) / d2;
                        }
                        this.zzg.zze(jRound, i2, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                zzer zzerVar2 = this.zzb;
                zzf(zzerVar, zzerVar2, false);
                if (zzerVar2.zzd() == 0) {
                    zzeq zzeqVar2 = this.zzc;
                    int iZze = zzerVar2.zze();
                    zzeqVar2.zzb(zzerVar2.zzi(), iZze);
                    zzapb zzapbVar2 = this.zzq;
                    if (zzapd.zza(zzeqVar2, zzapbVar2)) {
                        this.zzo = 0;
                        this.zzp += zzapbVar2.zzc + iZze;
                        zzerVar2.zzh(0);
                        this.zzg.zzc(zzerVar2, zzerVar2.zze());
                        zzerVar2.zza(2);
                        this.zzd.zza(zzapbVar2.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else if (zzerVar2.zze() < 15) {
                        zzerVar2.zzf(zzerVar2.zze() + 1);
                    }
                }
                this.zzn = false;
            }
        }
    }

    public zzapa(String str) {
    }

    private static final void zzf(zzer zzerVar, zzer zzerVar2, boolean z2) {
        int iZzg = zzerVar.zzg();
        int iMin = Math.min(zzerVar.zzd(), zzerVar2.zzd());
        zzerVar.zzm(zzerVar2.zzi(), zzerVar2.zzg(), iMin);
        zzerVar2.zzk(iMin);
        if (z2) {
            zzerVar.zzh(iZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzf = zzaqbVar.zzc();
        this.zzg = zzaexVar.zzu(zzaqbVar.zzb(), 1);
    }
}

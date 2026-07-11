package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzahr implements zzaeu {
    private zzaex zzb;
    private int zzc;
    private int zzd;
    private int zze;

    @Nullable
    private zzahv zzg;
    private zzaev zzh;
    private zzagd zzi;

    @Nullable
    private zzakw zzj;
    private final zzer zza = new zzer(2);
    private long zzf = -1;

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzb = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    private final int zzh(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(2);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, 2, false);
        return zzerVar.zzt();
    }

    private final int zzi(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(2);
        zzaevVar.zzi(zzerVar.zzi(), 0, 2);
        return zzerVar.zzt() - 2;
    }

    private final void zzj() {
        zzaex zzaexVar = this.zzb;
        zzaexVar.getClass();
        zzaexVar.zzv();
        this.zzb.zzw(new zzafx(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        String strZzM;
        zzaht zzahtVarZza;
        long j2;
        byte b2 = -1;
        int i2 = this.zzc;
        long j3 = -1;
        if (i2 == 0) {
            zzer zzerVar = this.zza;
            zzerVar.zza(2);
            zzaevVar.zzc(zzerVar.zzi(), 0, 2);
            int iZzt = zzerVar.zzt();
            this.zzd = iZzt;
            if (iZzt == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                } else {
                    zzj();
                }
            } else if ((iZzt < 65488 || iZzt > 65497) && iZzt != 65281) {
                this.zzc = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            this.zze = zzi(zzaevVar);
            zzaevVar.zzf(2);
            this.zzc = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzaevVar != this.zzh) {
                    this.zzh = zzaevVar;
                    this.zzi = new zzagd(zzaevVar, this.zzf);
                }
                zzakw zzakwVar = this.zzj;
                zzakwVar.getClass();
                int iZzd = zzakwVar.zzd(this.zzi, zzafvVar);
                if (iZzd == 1) {
                    zzafvVar.zza += this.zzf;
                }
                return iZzd;
            }
            long jZzn = zzaevVar.zzn();
            long j4 = this.zzf;
            if (jZzn != j4) {
                zzafvVar.zza = j4;
                return 1;
            }
            if (zzaevVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zzaevVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new zzakw(zzamd.zza, 8);
                }
                zzagd zzagdVar = new zzagd(zzaevVar, this.zzf);
                this.zzi = zzagdVar;
                if (this.zzj.zza(zzagdVar)) {
                    zzakw zzakwVar2 = this.zzj;
                    long j5 = this.zzf;
                    zzaex zzaexVar = this.zzb;
                    zzaexVar.getClass();
                    zzakwVar2.zzc(new zzagf(j5, zzaexVar));
                    zzahv zzahvVar = this.zzg;
                    zzahvVar.getClass();
                    zzaex zzaexVar2 = this.zzb;
                    zzaexVar2.getClass();
                    zzagh zzaghVarZzu = zzaexVar2.zzu(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzl("image/jpeg");
                    zztVar.zzk(new zzap(-9223372036854775807L, zzahvVar));
                    zzaghVarZzu.zzz(zztVar.zzM());
                    this.zzc = 5;
                } else {
                    zzj();
                }
            } else {
                zzj();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzer zzerVar2 = new zzer(this.zze);
            zzaevVar.zzc(zzerVar2.zzi(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzerVar2.zzM((char) 0)) && (strZzM = zzerVar2.zzM((char) 0)) != null) {
                long jZzo = zzaevVar.zzo();
                zzahv zzahvVar2 = null;
                if (jZzo != -1 && (zzahtVarZza = zzahu.zza(strZzM)) != null) {
                    List list = zzahtVarZza.zzb;
                    if (list.size() >= 2) {
                        int size = list.size() - 1;
                        long j6 = -1;
                        long j7 = -1;
                        long j9 = -1;
                        long j10 = -1;
                        while (size >= 0) {
                            zzahs zzahsVar = (zzahs) list.get(size);
                            byte b4 = b2;
                            String str = zzahsVar.zza;
                            long j11 = j3;
                            boolean z2 = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (size == 0) {
                                jZzo -= zzahsVar.zzc;
                                j2 = 0;
                            } else {
                                j2 = jZzo - zzahsVar.zzb;
                            }
                            long j12 = j2;
                            long j13 = jZzo;
                            jZzo = j12;
                            if (z2 && jZzo != j13) {
                                j10 = j13 - jZzo;
                                j9 = jZzo;
                            }
                            if (size == 0) {
                                j7 = j13;
                            }
                            if (size == 0) {
                                j6 = jZzo;
                            }
                            size--;
                            b2 = b4;
                            j3 = j11;
                        }
                        long j14 = j3;
                        if (j9 != j14 && j10 != j14 && j6 != j14 && j7 != j14) {
                            zzahvVar2 = new zzahv(j6, j7, zzahtVarZza.zza, j9, j10);
                        }
                    }
                }
                this.zzg = zzahvVar2;
                if (zzahvVar2 != null) {
                    this.zzf = zzahvVar2.zzd;
                }
            }
        } else {
            zzaevVar.zzf(this.zze);
        }
        this.zzc = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j3) {
        if (j2 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzakw zzakwVar = this.zzj;
            zzakwVar.getClass();
            zzakwVar.zze(j2, j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        int iZzi;
        if (zzh(zzaevVar) == 65496) {
            while (true) {
                int iZzh = zzh(zzaevVar);
                this.zzd = iZzh;
                if (iZzh == 65498 || (iZzi = zzi(zzaevVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    ((zzael) zzaevVar).zzj(iZzi, false);
                } else {
                    zzer zzerVar = this.zza;
                    zzerVar.zza(iZzi);
                    ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, iZzi, false);
                    if (Objects.equals(zzerVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") && zzahu.zzb(zzerVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

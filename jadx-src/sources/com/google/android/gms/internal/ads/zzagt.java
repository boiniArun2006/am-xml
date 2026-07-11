package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzagt implements zzaeu {
    private final zzer zza;
    private final zzags zzb;
    private final boolean zzc;
    private final zzamd zzd;
    private int zze;
    private zzaex zzf;
    private zzagu zzg;
    private long zzh;
    private zzagw[] zzi;
    private long zzj;

    @Nullable
    private zzagw zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzagt() {
        this(1, zzamd.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zze = 0;
        if (this.zzc) {
            zzaexVar = new zzamg(zzaexVar, this.zzd);
        }
        this.zzf = zzaexVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    final /* synthetic */ zzagw[] zzh() {
        return this.zzi;
    }

    public zzagt(int i2, zzamd zzamdVar) {
        this.zzd = zzamdVar;
        this.zzc = 1 == (i2 ^ 1);
        this.zza = new zzer(12);
        this.zzb = new zzags(null);
        this.zzf = new zzaft();
        this.zzi = new zzagw[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }

    @Nullable
    private final zzagw zzi(int i2) {
        for (zzagw zzagwVar : this.zzi) {
            if (zzagwVar.zzc(i2)) {
                return zzagwVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzaevVar.zzi(zzerVar.zzi(), 0, 12);
        zzerVar.zzh(0);
        if (zzerVar.zzC() != 1179011410) {
            return false;
        }
        zzerVar.zzk(4);
        return zzerVar.zzC() == 541677121;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        boolean z2;
        int i2;
        long j2;
        long j3 = this.zzj;
        if (j3 != -1) {
            long jZzn = zzaevVar.zzn();
            if (j3 < jZzn || j3 > 262144 + jZzn) {
                zzafvVar.zza = j3;
                z2 = true;
            } else {
                zzaevVar.zzf((int) (j3 - jZzn));
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.zzj = -1L;
        if (z2) {
            return 1;
        }
        int i3 = this.zze;
        zzagw zzagwVar = null;
        if (i3 == 0) {
            if (!zza(zzaevVar)) {
                throw zzat.zzb("AVI Header List not found", null);
            }
            zzaevVar.zzf(12);
            this.zze = 1;
            return 0;
        }
        if (i3 == 1) {
            zzer zzerVar = this.zza;
            zzaevVar.zzc(zzerVar.zzi(), 0, 12);
            zzerVar.zzh(0);
            zzags zzagsVar = this.zzb;
            zzagsVar.zza(zzerVar);
            int i5 = zzagsVar.zza;
            if (i5 != 1414744396) {
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 22);
                sb.append("LIST expected, found: ");
                sb.append(i5);
                throw zzat.zzb(sb.toString(), null);
            }
            int iZzC = zzerVar.zzC();
            if (iZzC == 1819436136) {
                this.zzl = zzagsVar.zzb;
                this.zze = 2;
                return 0;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzC).length() + 22);
            sb2.append("hdrl expected, found: ");
            sb2.append(iZzC);
            throw zzat.zzb(sb2.toString(), null);
        }
        if (i3 == 2) {
            int i7 = this.zzl - 4;
            zzer zzerVar2 = new zzer(i7);
            zzaevVar.zzc(zzerVar2.zzi(), 0, i7);
            zzagx zzagxVarZzb = zzagx.zzb(1819436136, zzerVar2);
            if (zzagxVarZzb.zza() != 1819436136) {
                int iZza = zzagxVarZzb.zza();
                StringBuilder sb3 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb3.append("Unexpected header list type ");
                sb3.append(iZza);
                throw zzat.zzb(sb3.toString(), null);
            }
            zzagu zzaguVar = (zzagu) zzagxVarZzb.zzc(zzagu.class);
            if (zzaguVar == null) {
                throw zzat.zzb("AviHeader not found", null);
            }
            this.zzg = zzaguVar;
            this.zzh = ((long) zzaguVar.zzc) * ((long) zzaguVar.zza);
            ArrayList arrayList = new ArrayList();
            zzguf zzgufVar = zzagxVarZzb.zza;
            int size = zzgufVar.size();
            int i8 = 0;
            int i9 = 0;
            while (i8 < size) {
                zzagq zzagqVar = (zzagq) zzgufVar.get(i8);
                if (zzagqVar.zza() == 1819440243) {
                    zzagx zzagxVar = (zzagx) zzagqVar;
                    int i10 = i9 + 1;
                    zzagv zzagvVar = (zzagv) zzagxVar.zzc(zzagv.class);
                    zzagy zzagyVar = (zzagy) zzagxVar.zzc(zzagy.class);
                    if (zzagvVar == null) {
                        zzee.zzc("AviExtractor", "Missing Stream Header");
                    } else if (zzagyVar == null) {
                        zzee.zzc("AviExtractor", "Missing Stream Format");
                    } else {
                        long jZzd = zzagvVar.zzd();
                        zzv zzvVar = zzagyVar.zza;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzb(i9);
                        int i11 = zzagvVar.zze;
                        if (i11 != 0) {
                            zztVarZza.zzn(i11);
                        }
                        zzagz zzagzVar = (zzagz) zzagxVar.zzc(zzagz.class);
                        if (zzagzVar != null) {
                            zztVarZza.zzc(zzagzVar.zza);
                        }
                        int iZzf = zzas.zzf(zzvVar.zzo);
                        if (iZzf == 1) {
                            zzagh zzaghVarZzu = this.zzf.zzu(i9, iZzf);
                            zzaghVarZzu.zzz(zztVarZza.zzM());
                            zzaghVarZzu.zzN(jZzd);
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzagwVar = new zzagw(i9, zzagvVar, zzaghVarZzu);
                        } else if (iZzf == 2) {
                            iZzf = 2;
                            zzagh zzaghVarZzu2 = this.zzf.zzu(i9, iZzf);
                            zzaghVarZzu2.zzz(zztVarZza.zzM());
                            zzaghVarZzu2.zzN(jZzd);
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzagwVar = new zzagw(i9, zzagvVar, zzaghVarZzu2);
                        } else {
                            zzagwVar = null;
                        }
                    }
                    if (zzagwVar != null) {
                        arrayList.add(zzagwVar);
                    }
                    i9 = i10;
                }
                i8++;
                zzagwVar = null;
            }
            this.zzi = (zzagw[]) arrayList.toArray(new zzagw[0]);
            this.zzf.zzv();
            this.zze = 3;
            return 0;
        }
        if (i3 == 3) {
            long j4 = this.zzm;
            if (j4 != -1 && zzaevVar.zzn() != j4) {
                this.zzj = j4;
                return 0;
            }
            zzer zzerVar3 = this.zza;
            zzaevVar.zzi(zzerVar3.zzi(), 0, 12);
            zzaevVar.zzl();
            zzerVar3.zzh(0);
            zzags zzagsVar2 = this.zzb;
            zzagsVar2.zza(zzerVar3);
            int iZzC2 = zzerVar3.zzC();
            int i12 = zzagsVar2.zza;
            if (i12 == 1179011410) {
                zzaevVar.zzf(12);
                return 0;
            }
            if (i12 != 1414744396 || iZzC2 != 1769369453) {
                this.zzj = zzaevVar.zzn() + ((long) zzagsVar2.zzb) + 8;
                return 0;
            }
            long jZzn2 = zzaevVar.zzn();
            this.zzm = jZzn2;
            long j5 = jZzn2 + ((long) zzagsVar2.zzb) + 8;
            this.zzn = j5;
            if (!this.zzp) {
                zzagu zzaguVar2 = this.zzg;
                zzaguVar2.getClass();
                if ((zzaguVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j5;
                    return 0;
                }
                this.zzf.zzw(new zzafx(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzaevVar.zzn() + 12;
            this.zze = 6;
            return 0;
        }
        if (i3 == 4) {
            zzer zzerVar4 = this.zza;
            zzaevVar.zzc(zzerVar4.zzi(), 0, 8);
            zzerVar4.zzh(0);
            int iZzC3 = zzerVar4.zzC();
            int iZzC4 = zzerVar4.zzC();
            if (iZzC3 != 829973609) {
                this.zzj = zzaevVar.zzn() + ((long) iZzC4);
                return 0;
            }
            this.zze = 5;
            this.zzo = iZzC4;
            return 0;
        }
        if (i3 != 5) {
            if (zzaevVar.zzn() >= this.zzn) {
                return -1;
            }
            zzagw zzagwVar2 = this.zzk;
            if (zzagwVar2 != null) {
                if (!zzagwVar2.zze(zzaevVar)) {
                    return 0;
                }
                this.zzk = null;
                return 0;
            }
            if ((zzaevVar.zzn() & 1) == 1) {
                zzaevVar.zzf(1);
            }
            zzer zzerVar5 = this.zza;
            zzaevVar.zzi(zzerVar5.zzi(), 0, 12);
            zzerVar5.zzh(0);
            int iZzC5 = zzerVar5.zzC();
            if (iZzC5 == 1414744396) {
                zzerVar5.zzh(8);
                zzaevVar.zzf(zzerVar5.zzC() != 1769369453 ? 8 : 12);
                zzaevVar.zzl();
                return 0;
            }
            int iZzC6 = zzerVar5.zzC();
            if (iZzC5 == 1263424842) {
                this.zzj = zzaevVar.zzn() + ((long) iZzC6) + 8;
                return 0;
            }
            zzaevVar.zzf(8);
            zzaevVar.zzl();
            zzagw zzagwVarZzi = zzi(iZzC5);
            if (zzagwVarZzi == null) {
                this.zzj = zzaevVar.zzn() + ((long) iZzC6);
                return 0;
            }
            zzagwVarZzi.zzd(iZzC6);
            this.zzk = zzagwVarZzi;
            return 0;
        }
        zzer zzerVar6 = new zzer(this.zzo);
        zzaevVar.zzc(zzerVar6.zzi(), 0, this.zzo);
        if (zzerVar6.zzd() < 16) {
            i2 = 0;
            j2 = 0;
        } else {
            int iZzg = zzerVar6.zzg();
            zzerVar6.zzk(8);
            long jZzC = zzerVar6.zzC();
            i2 = 0;
            long j6 = this.zzm;
            j2 = jZzC > j6 ? 0L : j6 + 8;
            zzerVar6.zzh(iZzg);
        }
        while (zzerVar6.zzd() >= 16) {
            int iZzC7 = zzerVar6.zzC();
            int iZzC8 = zzerVar6.zzC();
            long jZzC2 = ((long) zzerVar6.zzC()) + j2;
            zzerVar6.zzk(4);
            zzagw zzagwVarZzi2 = zzi(iZzC7);
            if (zzagwVarZzi2 != null) {
                zzagwVarZzi2.zza(jZzC2, (iZzC8 & 16) == 16 ? 1 : i2);
            }
        }
        zzagw[] zzagwVarArr = this.zzi;
        int length = zzagwVarArr.length;
        for (int i13 = i2; i13 < length; i13++) {
            zzagwVarArr[i13].zzb();
        }
        this.zzp = true;
        if (this.zzi.length == 0) {
            this.zzf.zzw(new zzafx(this.zzh, 0L));
        } else {
            this.zzf.zzw(new zzagr(this, this.zzh));
        }
        this.zze = 6;
        this.zzj = this.zzm;
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j3) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzagw zzagwVar : this.zzi) {
            zzagwVar.zzf(j2);
        }
        if (j2 == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }
}

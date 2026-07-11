package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzahg implements zzaeu {
    private final byte[] zza;
    private final zzer zzb;
    private final zzafb zzc;
    private zzaex zzd;
    private zzagh zze;
    private int zzf;

    @Nullable
    private zzap zzg;
    private zzafh zzh;
    private int zzi;
    private int zzj;
    private zzahe zzk;
    private int zzl;
    private long zzm;

    static {
        int i2 = zzahf.zza;
    }

    public zzahg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzafe.zza(zzaevVar, false);
        zzer zzerVar = new zzer(4);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, 4, false);
        return zzerVar.zzz() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public zzahg(int i2) {
        this.zza = new byte[42];
        this.zzb = new zzer(new byte[32768], 0);
        this.zzc = new zzafb();
        this.zzf = 0;
    }

    private final long zzh(zzer zzerVar, boolean z2) {
        boolean zZza;
        this.zzh.getClass();
        int iZzg = zzerVar.zzg();
        while (iZzg <= zzerVar.zze() - 16) {
            zzerVar.zzh(iZzg);
            zzafh zzafhVar = this.zzh;
            int i2 = this.zzj;
            zzafb zzafbVar = this.zzc;
            if (zzafc.zza(zzerVar, zzafhVar, i2, zzafbVar)) {
                zzerVar.zzh(iZzg);
                return zzafbVar.zza;
            }
            iZzg++;
        }
        if (!z2) {
            zzerVar.zzh(iZzg);
            return -1L;
        }
        while (iZzg <= zzerVar.zze() - this.zzi) {
            zzerVar.zzh(iZzg);
            try {
                zZza = zzafc.zza(zzerVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                zZza = false;
            }
            if (zzerVar.zzg() <= zzerVar.zze() && zZza) {
                zzerVar.zzh(iZzg);
                return this.zzc.zza;
            }
            iZzg++;
        }
        zzerVar.zzh(zzerVar.zze());
        return -1L;
    }

    private final void zzi() {
        long j2 = this.zzm * 1000000;
        zzafh zzafhVar = this.zzh;
        String str = zzfj.zza;
        this.zze.zze(j2 / ((long) zzafhVar.zze), 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzd = zzaexVar;
        this.zze = zzaexVar.zzu(0, 1);
        zzaexVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        boolean zZzb;
        zzafh zzafhVar;
        zzafy zzafxVar;
        boolean z2;
        int i2 = this.zzf;
        if (i2 == 0) {
            zzaevVar.zzl();
            long jZzm = zzaevVar.zzm();
            zzap zzapVarZza = zzafe.zza(zzaevVar, true);
            zzaevVar.zzf((int) (zzaevVar.zzm() - jZzm));
            this.zzg = zzapVarZza;
            this.zzf = 1;
            return 0;
        }
        if (i2 == 1) {
            zzaevVar.zzi(this.zza, 0, 42);
            zzaevVar.zzl();
            this.zzf = 2;
            return 0;
        }
        if (i2 == 2) {
            zzer zzerVar = new zzer(4);
            zzaevVar.zzc(zzerVar.zzi(), 0, 4);
            if (zzerVar.zzz() != 1716281667) {
                throw zzat.zzb("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i2 == 3) {
            zzafd zzafdVar = new zzafd(this.zzh);
            do {
                zZzb = zzafe.zzb(zzaevVar, zzafdVar);
                zzafhVar = zzafdVar.zza;
                String str = zzfj.zza;
                this.zzh = zzafhVar;
            } while (!zZzb);
            zzafhVar.getClass();
            this.zzi = Math.max(zzafhVar.zzc, 6);
            zzv zzvVarZzc = this.zzh.zzc(this.zza, this.zzg);
            zzagh zzaghVar = this.zze;
            zzt zztVarZza = zzvVarZzc.zza();
            zztVarZza.zzl("audio/flac");
            zzaghVar.zzz(zztVarZza.zzM());
            this.zze.zzN(this.zzh.zza());
            this.zzf = 4;
            return 0;
        }
        if (i2 == 4) {
            zzaevVar.zzl();
            zzer zzerVar2 = new zzer(2);
            zzaevVar.zzi(zzerVar2.zzi(), 0, 2);
            int iZzt = zzerVar2.zzt();
            if ((iZzt >> 2) != 16382) {
                zzaevVar.zzl();
                throw zzat.zzb("First frame does not start with sync code.", null);
            }
            zzaevVar.zzl();
            this.zzj = iZzt;
            zzaex zzaexVar = this.zzd;
            String str2 = zzfj.zza;
            long jZzn = zzaevVar.zzn();
            long jZzo = zzaevVar.zzo();
            zzafh zzafhVar2 = this.zzh;
            zzafhVar2.getClass();
            zzafg zzafgVar = zzafhVar2.zzk;
            if (zzafgVar != null && zzafgVar.zza.length > 0) {
                zzafxVar = new zzaff(zzafhVar2, jZzn);
            } else if (jZzo == -1 || zzafhVar2.zzj <= 0) {
                zzafxVar = new zzafx(zzafhVar2.zza(), 0L);
            } else {
                zzahe zzaheVar = new zzahe(zzafhVar2, this.zzj, jZzn, jZzo);
                this.zzk = zzaheVar;
                zzafxVar = zzaheVar.zza();
            }
            zzaexVar.zzw(zzafxVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzafh zzafhVar3 = this.zzh;
        zzafhVar3.getClass();
        zzahe zzaheVar2 = this.zzk;
        if (zzaheVar2 != null && zzaheVar2.zzc()) {
            return zzaheVar2.zzd(zzaevVar, zzafvVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzafc.zzb(zzaevVar, zzafhVar3);
            return 0;
        }
        zzer zzerVar3 = this.zzb;
        int iZze = zzerVar3.zze();
        if (iZze < 32768) {
            int iZza = zzaevVar.zza(zzerVar3.zzi(), iZze, 32768 - iZze);
            z2 = iZza == -1;
            if (!z2) {
                zzerVar3.zzf(iZze + iZza);
            } else if (zzerVar3.zzd() == 0) {
                zzi();
                return -1;
            }
        } else {
            z2 = false;
        }
        int iZzg = zzerVar3.zzg();
        int i3 = this.zzl;
        int i5 = this.zzi;
        if (i3 < i5) {
            zzerVar3.zzk(Math.min(i5 - i3, zzerVar3.zzd()));
        }
        long jZzh = zzh(zzerVar3, z2);
        int iZzg2 = zzerVar3.zzg() - iZzg;
        zzerVar3.zzh(iZzg);
        this.zze.zzc(zzerVar3, iZzg2);
        this.zzl += iZzg2;
        if (jZzh != -1) {
            zzi();
            this.zzl = 0;
            this.zzm = jZzh;
        }
        int length = zzerVar3.zzi().length - zzerVar3.zze();
        if (zzerVar3.zzd() >= 16 || length >= 16) {
            return 0;
        }
        int iZzd = zzerVar3.zzd();
        System.arraycopy(zzerVar3.zzi(), zzerVar3.zzg(), zzerVar3.zzi(), 0, iZzd);
        zzerVar3.zzh(0);
        zzerVar3.zzf(iZzd);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j3) {
        if (j2 == 0) {
            this.zzf = 0;
        } else {
            zzahe zzaheVar = this.zzk;
            if (zzaheVar != null) {
                zzaheVar.zzb(j3);
            }
        }
        this.zzm = j3 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zza(0);
    }
}

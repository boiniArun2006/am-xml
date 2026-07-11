package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzaqk implements zzaeu {
    private zzaex zza;
    private zzagh zzb;
    private zzaqh zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    static {
        int i2 = zzaqj.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zza = zzaexVar;
        this.zzb = zzaexVar.zzu(0, 1);
        zzaexVar.zzv();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        int i2;
        this.zzb.getClass();
        String str = zzfj.zza;
        int i3 = this.zzc;
        int iZzz = 4;
        if (i3 == 0) {
            zzgrc.zzi(zzaevVar.zzn() == 0);
            int i5 = this.zzf;
            if (i5 != -1) {
                zzaevVar.zzf(i5);
                this.zzc = 4;
            } else {
                if (!zzaqn.zza(zzaevVar)) {
                    throw zzat.zzb("Unsupported or unrecognized wav file type.", null);
                }
                zzaevVar.zzf((int) (zzaevVar.zzm() - zzaevVar.zzn()));
                this.zzc = 1;
            }
            return 0;
        }
        long jZzE = -1;
        if (i3 == 1) {
            int i7 = zzaqn.zza;
            zzer zzerVar = new zzer(8);
            zzaqm zzaqmVarZza = zzaqm.zza(zzaevVar, zzerVar);
            if (zzaqmVarZza.zza != 1685272116) {
                zzaevVar.zzl();
            } else {
                zzaevVar.zzk(8);
                zzerVar.zzh(0);
                zzaevVar.zzi(zzerVar.zzi(), 0, 8);
                jZzE = zzerVar.zzE();
                zzaevVar.zzf(((int) zzaqmVarZza.zzb) + 8);
            }
            this.zzd = jZzE;
            this.zzc = 2;
            return 0;
        }
        if (i3 == 2) {
            zzaql zzaqlVarZzb = zzaqn.zzb(zzaevVar);
            int i8 = zzaqlVarZzb.zza;
            if (i8 == 17) {
                this.zze = new zzaqg(this.zza, this.zzb, zzaqlVarZzb);
            } else if (i8 == 6) {
                this.zze = new zzaqi(this.zza, this.zzb, zzaqlVarZzb, "audio/g711-alaw", -1);
            } else if (i8 == 7) {
                this.zze = new zzaqi(this.zza, this.zzb, zzaqlVarZzb, "audio/g711-mlaw", -1);
            } else {
                int i9 = zzaqlVarZzb.zze;
                if (i8 == 1) {
                    iZzz = zzfj.zzz(i9, ByteOrder.LITTLE_ENDIAN);
                    i2 = iZzz;
                    if (i2 == 0) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 29);
                        sb.append("Unsupported WAV format type: ");
                        sb.append(i8);
                        throw zzat.zzc(sb.toString());
                    }
                    this.zze = new zzaqi(this.zza, this.zzb, zzaqlVarZzb, "audio/raw", i2);
                } else {
                    if (i8 == 3) {
                        if (i9 == 32) {
                            i2 = iZzz;
                        }
                        if (i2 == 0) {
                        }
                    }
                    i2 = 0;
                    if (i2 == 0) {
                    }
                }
            }
            this.zzc = 3;
            return 0;
        }
        if (i3 != 3) {
            zzgrc.zzi(this.zzg != -1);
            long jZzn = this.zzg - zzaevVar.zzn();
            zzaqh zzaqhVar = this.zze;
            zzaqhVar.getClass();
            return zzaqhVar.zzc(zzaevVar, jZzn) ? -1 : 0;
        }
        Pair pairZzc = zzaqn.zzc(zzaevVar);
        this.zzf = ((Long) pairZzc.first).intValue();
        long jLongValue = ((Long) pairZzc.second).longValue();
        long j2 = this.zzd;
        if (j2 != -1 && jLongValue == 4294967295L) {
            jLongValue = j2;
        }
        long j3 = ((long) this.zzf) + jLongValue;
        this.zzg = j3;
        long jZzo = zzaevVar.zzo();
        if (jZzo != -1 && j3 > jZzo) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 29 + String.valueOf(jZzo).length());
            sb2.append("Data exceeds input length: ");
            sb2.append(j3);
            sb2.append(", ");
            sb2.append(jZzo);
            zzee.zzc("WavExtractor", sb2.toString());
            this.zzg = jZzo;
            j3 = jZzo;
        }
        zzaqh zzaqhVar2 = this.zze;
        zzaqhVar2.getClass();
        zzaqhVar2.zzb(this.zzf, j3);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j3) {
        this.zzc = j2 == 0 ? 0 : 4;
        zzaqh zzaqhVar = this.zze;
        if (zzaqhVar != null) {
            zzaqhVar.zza(j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return zzaqn.zza(zzaevVar);
    }
}

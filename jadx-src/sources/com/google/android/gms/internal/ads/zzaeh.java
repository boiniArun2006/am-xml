package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaeh {
    private static int zzc(zzer zzerVar) {
        int i2 = 0;
        while (zzerVar.zzd() != 0) {
            int iZzs = zzerVar.zzs();
            i2 += iZzs;
            if (iZzs != 255) {
                return i2;
            }
        }
        return -1;
    }

    public static void zzb(long j2, zzer zzerVar, zzagh[] zzaghVarArr) {
        int iZzs = zzerVar.zzs();
        if ((iZzs & 64) != 0) {
            int i2 = iZzs & 31;
            zzerVar.zzk(1);
            int iZzg = zzerVar.zzg();
            for (zzagh zzaghVar : zzaghVarArr) {
                int i3 = i2 * 3;
                zzerVar.zzh(iZzg);
                zzaghVar.zzc(zzerVar, i3);
                zzgrc.zzi(j2 != -9223372036854775807L);
                zzaghVar.zze(j2, 1, i3, 0, null);
            }
        }
    }

    public static void zza(long j2, zzer zzerVar, zzagh[] zzaghVarArr) {
        int iZzB;
        boolean z2;
        while (true) {
            boolean z3 = true;
            if (zzerVar.zzd() > 1) {
                int iZzc = zzc(zzerVar);
                int iZzc2 = zzc(zzerVar);
                int iZzg = zzerVar.zzg() + iZzc2;
                if (iZzc2 != -1 && iZzc2 <= zzerVar.zzd()) {
                    if (iZzc == 4 && iZzc2 >= 8) {
                        int iZzs = zzerVar.zzs();
                        int iZzt = zzerVar.zzt();
                        if (iZzt == 49) {
                            iZzB = zzerVar.zzB();
                            iZzt = 49;
                        } else {
                            iZzB = 0;
                        }
                        int iZzs2 = zzerVar.zzs();
                        if (iZzt == 47) {
                            zzerVar.zzk(1);
                            iZzt = 47;
                        }
                        if (iZzs != 181 || ((iZzt != 49 && iZzt != 47) || iZzs2 != 3)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (iZzt == 49) {
                            if (iZzB != 1195456820) {
                                z3 = false;
                            }
                            z2 &= z3;
                        }
                        if (z2) {
                            zzb(j2, zzerVar, zzaghVarArr);
                        }
                    }
                } else {
                    zzee.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    iZzg = zzerVar.zze();
                }
                zzerVar.zzh(iZzg);
            } else {
                return;
            }
        }
    }
}

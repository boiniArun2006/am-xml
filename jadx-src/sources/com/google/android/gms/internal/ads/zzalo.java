package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzalo {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzer zzg = new zzer(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    zzalo() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r11 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r10.zzn() >= r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r10.zzd(1) != (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(zzaev zzaevVar, long j2) throws IOException {
        boolean z2;
        if (zzaevVar.zzn() == zzaevVar.zzm()) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zza(z2);
        zzer zzerVar = this.zzg;
        zzerVar.zza(4);
        while (true) {
            if ((j2 != -1 && zzaevVar.zzn() + 4 >= j2) || !zzaey.zze(zzaevVar, zzerVar.zzi(), 0, 4, true)) {
                break;
            }
            zzerVar.zzh(0);
            if (zzerVar.zzz() == 1332176723) {
                zzaevVar.zzl();
                return true;
            }
            zzaevVar.zzf(1);
        }
    }

    public final boolean zzc(zzaev zzaevVar, boolean z2) throws IOException {
        zza();
        zzer zzerVar = this.zzg;
        zzerVar.zza(27);
        if (zzaey.zze(zzaevVar, zzerVar.zzi(), 0, 27, z2) && zzerVar.zzz() == 1332176723) {
            if (zzerVar.zzs() != 0) {
                if (z2) {
                    return false;
                }
                throw zzat.zzc("unsupported bit stream revision");
            }
            this.zza = zzerVar.zzs();
            this.zzb = zzerVar.zzE();
            zzerVar.zzA();
            zzerVar.zzA();
            zzerVar.zzA();
            int iZzs = zzerVar.zzs();
            this.zzc = iZzs;
            this.zzd = iZzs + 27;
            zzerVar.zza(iZzs);
            if (zzaey.zze(zzaevVar, zzerVar.zzi(), 0, this.zzc, z2)) {
                for (int i2 = 0; i2 < this.zzc; i2++) {
                    int[] iArr = this.zzf;
                    int iZzs2 = zzerVar.zzs();
                    iArr[i2] = iZzs2;
                    this.zze += iZzs2;
                }
                return true;
            }
        }
        return false;
    }
}

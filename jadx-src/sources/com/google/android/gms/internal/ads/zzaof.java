package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaof implements zzaeu {
    private final zzaog zza = new zzaog(null, 0, "audio/ac4");
    private final zzer zzb = new zzer(16384);
    private boolean zzc;

    static {
        int i2 = zzaoe.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        char c2;
        int i2;
        char c4 = 2;
        zzer zzerVar = new zzer(10);
        int i3 = 0;
        while (true) {
            zzael zzaelVar = (zzael) zzaevVar;
            zzaelVar.zzh(zzerVar.zzi(), 0, 10, false);
            zzerVar.zzh(0);
            if (zzerVar.zzx() != 4801587) {
                break;
            }
            char c5 = c4;
            zzerVar.zzk(3);
            int iZzG = zzerVar.zzG();
            i3 += iZzG + 10;
            zzaelVar.zzj(iZzG, false);
            c4 = c5;
        }
        zzaevVar.zzl();
        zzael zzaelVar2 = (zzael) zzaevVar;
        zzaelVar2.zzj(i3, false);
        int i5 = 0;
        int i7 = i3;
        while (true) {
            int i8 = 7;
            zzaelVar2.zzh(zzerVar.zzi(), 0, 7, false);
            zzerVar.zzh(0);
            int iZzt = zzerVar.zzt();
            if (iZzt == 44096 || iZzt == 44097) {
                i5++;
                if (i5 >= 4) {
                    return true;
                }
                byte[] bArrZzi = zzerVar.zzi();
                int i9 = zzady.zza;
                if (bArrZzi.length < 7) {
                    c2 = c4;
                    i2 = -1;
                } else {
                    c2 = c4;
                    int i10 = (bArrZzi[3] & UByte.MAX_VALUE) | ((bArrZzi[c4] & UByte.MAX_VALUE) << 8);
                    if (i10 == 65535) {
                        i10 = ((bArrZzi[4] & UByte.MAX_VALUE) << 16) | ((bArrZzi[5] & UByte.MAX_VALUE) << 8) | (bArrZzi[6] & UByte.MAX_VALUE);
                    } else {
                        i8 = 4;
                    }
                    if (iZzt == 44097) {
                        i8 += 2;
                    }
                    i2 = i10 + i8;
                }
                if (i2 == -1) {
                    return false;
                }
                zzaelVar2.zzj(i2 - 7, false);
                c4 = c2;
            } else {
                zzaevVar.zzl();
                i7++;
                if (i7 - i3 >= 8192) {
                    return false;
                }
                zzaelVar2.zzj(i7, false);
                i5 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j3) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zza.zzb(zzaexVar, new zzaqb(Integer.MIN_VALUE, 0, 1));
        zzaexVar.zzv();
        zzaexVar.zzw(new zzafx(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        zzer zzerVar = this.zzb;
        int iZza = zzaevVar.zza(zzerVar.zzi(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        zzerVar.zzh(0);
        zzerVar.zzf(iZza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzerVar);
        return 0;
    }
}

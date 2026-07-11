package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzahd implements zzaef {
    private final zzafh zza;
    private final int zzb;
    private final zzafb zzc = new zzafb();

    /* synthetic */ zzahd(zzafh zzafhVar, int i2, byte[] bArr) {
        this.zza = zzafhVar;
        this.zzb = i2;
    }

    private final long zzc(zzaev zzaevVar) throws IOException {
        while (zzaevVar.zzm() < zzaevVar.zzo() - 6) {
            zzafh zzafhVar = this.zza;
            int i2 = this.zzb;
            zzafb zzafbVar = this.zzc;
            long jZzm = zzaevVar.zzm();
            zzer zzerVar = new zzer(17);
            zzaevVar.zzi(zzerVar.zzi(), 0, 2);
            if (zzerVar.zzo() != i2) {
                zzaevVar.zzl();
                zzaevVar.zzk((int) (jZzm - zzaevVar.zzn()));
            } else {
                zzerVar.zzf(zzaey.zzb(zzaevVar, zzerVar.zzi(), 2, 15) + 2);
                zzaevVar.zzl();
                zzaevVar.zzk((int) (jZzm - zzaevVar.zzn()));
                if (zzafc.zza(zzerVar, zzafhVar, i2, zzafbVar)) {
                    break;
                }
            }
            zzaevVar.zzk(1);
        }
        if (zzaevVar.zzm() >= zzaevVar.zzo() - 6) {
            zzaevVar.zzk((int) (zzaevVar.zzo() - zzaevVar.zzm()));
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaee zza(zzaev zzaevVar, long j2) throws IOException {
        long jZzn = zzaevVar.zzn();
        long jZzc = zzc(zzaevVar);
        long jZzm = zzaevVar.zzm();
        zzaevVar.zzk(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzaevVar);
        long jZzm2 = zzaevVar.zzm();
        if (jZzc <= j2 && jZzc2 > j2) {
            return zzaee.zzc(jZzm);
        }
        if (jZzc2 <= j2) {
            return zzaee.zzb(jZzc2, jZzm2);
        }
        return zzaee.zza(jZzc, jZzn);
    }
}

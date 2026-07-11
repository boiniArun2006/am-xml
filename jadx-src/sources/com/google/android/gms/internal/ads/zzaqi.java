package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzaqi implements zzaqh {
    private final zzaex zza;
    private final zzagh zzb;
    private final zzaql zzc;
    private final zzv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza(long j2) {
        this.zzf = j2;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(int i2, long j2) {
        zzaqo zzaqoVar = new zzaqo(this.zzc, 1, i2, j2);
        this.zza.zzw(zzaqoVar);
        zzagh zzaghVar = this.zzb;
        zzaghVar.zzz(this.zzd);
        zzaghVar.zzN(zzaqoVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final boolean zzc(zzaev zzaevVar, long j2) throws IOException {
        int i2;
        int i3;
        long j3 = j2;
        while (j3 > 0 && (i2 = this.zzg) < (i3 = this.zze)) {
            int iZza = this.zzb.zza(zzaevVar, (int) Math.min(i3 - i2, j3), true);
            if (iZza == -1) {
                j3 = 0;
            } else {
                this.zzg += iZza;
                j3 -= (long) iZza;
            }
        }
        zzaql zzaqlVar = this.zzc;
        int i5 = this.zzg;
        int i7 = zzaqlVar.zzd;
        int i8 = i5 / i7;
        if (i8 > 0) {
            long jZzt = this.zzf + zzfj.zzt(this.zzh, 1000000L, zzaqlVar.zzc, RoundingMode.DOWN);
            int i9 = i8 * i7;
            int i10 = this.zzg - i9;
            this.zzb.zze(jZzt, 1, i9, i10, null);
            this.zzh += (long) i8;
            this.zzg = i10;
        }
        return j3 <= 0;
    }

    public zzaqi(zzaex zzaexVar, zzagh zzaghVar, zzaql zzaqlVar, String str, int i2) throws zzat {
        this.zza = zzaexVar;
        this.zzb = zzaghVar;
        this.zzc = zzaqlVar;
        int i3 = zzaqlVar.zzb * zzaqlVar.zze;
        int i5 = zzaqlVar.zzd;
        int i7 = i3 / 8;
        if (i5 == i7) {
            int i8 = zzaqlVar.zzc * i7;
            int i9 = i8 * 8;
            int iMax = Math.max(i7, i8 / 10);
            this.zze = iMax;
            zzt zztVar = new zzt();
            zztVar.zzl("audio/wav");
            zztVar.zzm(str);
            zztVar.zzh(i9);
            zztVar.zzi(i9);
            zztVar.zzn(iMax);
            zztVar.zzE(zzaqlVar.zzb);
            zztVar.zzF(zzaqlVar.zzc);
            zztVar.zzG(i2);
            this.zzd = zztVar.zzM();
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 28 + String.valueOf(i5).length());
        sb.append("Expected block size: ");
        sb.append(i7);
        sb.append("; got: ");
        sb.append(i5);
        throw zzat.zzb(sb.toString(), null);
    }
}

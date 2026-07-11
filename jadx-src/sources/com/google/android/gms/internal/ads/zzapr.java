package com.google.android.gms.internal.ads;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzapr implements zzaef {
    private final zzfg zza;
    private final zzer zzb = new zzer();
    private final int zzc;

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaee zza(zzaev zzaevVar, long j2) throws IOException {
        int iZza;
        int iZza2;
        long jZzn = zzaevVar.zzn();
        int iMin = (int) Math.min(112800L, zzaevVar.zzo() - jZzn);
        zzer zzerVar = this.zzb;
        zzerVar.zza(iMin);
        zzaevVar.zzi(zzerVar.zzi(), 0, iMin);
        int iZze = zzerVar.zze();
        long j3 = -1;
        long j4 = -9223372036854775807L;
        long j5 = -1;
        while (zzerVar.zzd() >= 188 && (iZza2 = (iZza = zzaqd.zza(zzerVar.zzi(), zzerVar.zzg(), iZze)) + 188) <= iZze) {
            long jZzb = zzaqd.zzb(zzerVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZze = this.zza.zze(jZzb);
                if (jZze > j2) {
                    return j4 == -9223372036854775807L ? zzaee.zza(jZze, jZzn) : zzaee.zzc(jZzn + j5);
                }
                j5 = iZza;
                if (SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jZze > j2) {
                    return zzaee.zzc(jZzn + j5);
                }
                j4 = jZze;
            }
            zzerVar.zzh(iZza2);
            j3 = iZza2;
        }
        return j4 != -9223372036854775807L ? zzaee.zzb(j4, jZzn + j3) : zzaee.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzb() {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }

    public zzapr(int i2, zzfg zzfgVar, int i3) {
        this.zzc = i2;
        this.zza = zzfgVar;
    }
}

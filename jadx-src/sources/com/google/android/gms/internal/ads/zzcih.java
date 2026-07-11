package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzcih implements zzhb {
    private final zzhb zza;
    private final long zzb;
    private final zzhb zzc;
    private long zzd;
    private Uri zze;

    zzcih(zzhb zzhbVar, int i2, zzhb zzhbVar2) {
        this.zza = zzhbVar;
        this.zzb = i2;
        this.zzc = zzhbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        return zzgui.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) throws IOException {
        int i5;
        long j2 = this.zzd;
        long j3 = this.zzb;
        if (j2 < j3) {
            int iZza = this.zza.zza(bArr, i2, (int) Math.min(i3, j3 - j2));
            long j4 = this.zzd + ((long) iZza);
            this.zzd = j4;
            i5 = iZza;
            j2 = j4;
        } else {
            i5 = 0;
        }
        if (j2 < j3) {
            return i5;
        }
        int iZza2 = this.zzc.zza(bArr, i2 + i5, i3 - i5);
        int i7 = i5 + iZza2;
        this.zzd += (long) iZza2;
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws IOException {
        Uri uri;
        zzhf zzhfVar2;
        Uri uri2 = zzhfVar.zza;
        this.zze = uri2;
        long j2 = zzhfVar.zze;
        long j3 = this.zzb;
        zzhf zzhfVar3 = null;
        if (j2 >= j3) {
            uri = uri2;
            zzhfVar2 = null;
        } else {
            long j4 = zzhfVar.zzf;
            long jMin = j3 - j2;
            if (j4 != -1) {
                jMin = Math.min(j4, jMin);
            }
            uri = uri2;
            zzhfVar2 = new zzhf(uri, j2, jMin, null);
        }
        long j5 = zzhfVar.zzf;
        if (j5 == -1 || j2 + j5 > j3) {
            zzhfVar3 = new zzhf(uri, Math.max(j3, j2), j5 != -1 ? Math.min(j5, (j2 + j5) - j3) : -1L, null);
        }
        long jZzb = zzhfVar2 != null ? this.zza.zzb(zzhfVar2) : 0L;
        long jZzb2 = zzhfVar3 != null ? this.zzc.zzb(zzhfVar3) : 0L;
        this.zzd = j2;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }
}

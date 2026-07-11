package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzagi {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zzaev zzaevVar) throws IOException {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzaevVar.zzi(bArr, 0, 10);
        zzaevVar.zzl();
        int i2 = zzadv.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    public final void zzc(zzagh zzaghVar, long j2, int i2, int i3, int i5, @Nullable zzagg zzaggVar) {
        zzgrc.zzj(this.zzg <= i3 + i5, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i7 = this.zzc;
            int i8 = i7 + 1;
            this.zzc = i8;
            if (i7 == 0) {
                this.zzd = j2;
                this.zze = i2;
                this.zzf = 0;
            }
            this.zzf += i3;
            this.zzg = i5;
            if (i8 >= 16) {
                zzd(zzaghVar, zzaggVar);
            }
        }
    }

    public final void zzd(zzagh zzaghVar, @Nullable zzagg zzaggVar) {
        if (this.zzc > 0) {
            zzaghVar.zze(this.zzd, this.zze, this.zzf, this.zzg, zzaggVar);
            this.zzc = 0;
        }
    }
}

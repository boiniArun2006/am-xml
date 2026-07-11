package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzajj {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzd(int i2) {
        int i3 = 0;
        while (i3 < 8) {
            int i5 = i3 + 1;
            if ((zza[i3] & ((long) i2)) != 0) {
                return i5;
            }
            i3 = i5;
        }
        return -1;
    }

    public static long zze(byte[] bArr, int i2, boolean z2) {
        long j2 = ((long) bArr[0]) & 255;
        if (z2) {
            j2 &= ~zza[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (((long) bArr[i3]) & 255);
        }
        return j2;
    }

    public final void zza() {
        this.zzc = 0;
        this.zzd = 0;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final long zzb(zzaev zzaevVar, boolean z2, boolean z3, int i2) throws IOException {
        if (this.zzc == 0) {
            byte[] bArr = this.zzb;
            if (!zzaevVar.zzb(bArr, 0, 1, z2)) {
                return -1L;
            }
            int iZzd = zzd(bArr[0] & UByte.MAX_VALUE);
            this.zzd = iZzd;
            if (iZzd == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i3 = this.zzd;
        if (i3 > i2) {
            this.zzc = 0;
            return -2L;
        }
        if (i3 != 1) {
            zzaevVar.zzc(this.zzb, 1, i3 - 1);
        }
        this.zzc = 0;
        return zze(this.zzb, this.zzd, z3);
    }
}

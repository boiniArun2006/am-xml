package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzaji {
    private final zzer zza = new zzer(8);
    private int zzb;

    private final long zzb(zzaev zzaevVar) throws IOException {
        int i2;
        zzer zzerVar = this.zza;
        zzael zzaelVar = (zzael) zzaevVar;
        int i3 = 0;
        zzaelVar.zzh(zzerVar.zzi(), 0, 1, false);
        int i5 = zzerVar.zzi()[0] & UByte.MAX_VALUE;
        if (i5 == 0) {
            return Long.MIN_VALUE;
        }
        int i7 = 128;
        int i8 = 0;
        while (true) {
            i2 = i8 + 1;
            if ((i5 & i7) != 0) {
                break;
            }
            i7 >>= 1;
            i8 = i2;
        }
        int i9 = i5 & (~i7);
        zzaelVar.zzh(zzerVar.zzi(), 1, i8, false);
        while (i3 < i8) {
            i3++;
            i9 = (zzerVar.zzi()[i3] & UByte.MAX_VALUE) + (i9 << 8);
        }
        this.zzb += i2;
        return i9;
    }

    public final boolean zza(zzaev zzaevVar) throws IOException {
        long jZzo = zzaevVar.zzo();
        long j2 = 1024;
        if (jZzo != -1 && jZzo <= 1024) {
            j2 = jZzo;
        }
        zzer zzerVar = this.zza;
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long jZzz = zzerVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | ((long) (zzerVar.zzi()[0] & UByte.MAX_VALUE))) {
            int i2 = (int) j2;
            int i3 = this.zzb + 1;
            this.zzb = i3;
            if (i3 == i2) {
                return false;
            }
            zzaelVar.zzh(zzerVar.zzi(), 0, 1, false);
        }
        long jZzb = zzb(zzaevVar);
        long j3 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j4 = j3 + jZzb;
            if (jZzo == -1 || j4 < jZzo) {
                while (true) {
                    long j5 = this.zzb;
                    if (j5 < j4) {
                        if (zzb(zzaevVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzaevVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i5 = (int) jZzb2;
                            zzaelVar.zzj(i5, false);
                            this.zzb += i5;
                        }
                    } else if (j5 == j4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

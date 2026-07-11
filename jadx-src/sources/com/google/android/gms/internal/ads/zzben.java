package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzben {
    @VisibleForTesting
    static String zzc(String[] strArr, int i2, int i3) {
        int i5 = i3 + i2;
        if (strArr.length < i5) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i8 = i5 - 1;
            if (i2 >= i8) {
                sb.append(strArr[i8]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            sb.append(' ');
            i2++;
        }
    }

    @VisibleForTesting
    static long zzd(long j2, int i2) {
        if (i2 == 1) {
            return j2;
        }
        int i3 = i2 >> 1;
        long j3 = (j2 * j2) % 1073807359;
        return ((i2 & 1) == 0 ? zzd(j3, i3) : j2 * (zzd(j3, i3) % 1073807359)) % 1073807359;
    }

    private static long zze(String[] strArr, int i2, int i3) {
        long jZza = (((long) zzbek.zza(strArr[0])) + 2147483647L) % 1073807359;
        for (int i5 = 1; i5 < i3; i5++) {
            jZza = (((jZza * 16785407) % 1073807359) + ((((long) zzbek.zza(strArr[i5])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jZza;
    }

    public static void zza(String[] strArr, int i2, int i3, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzb(i2, zze(strArr, 0, length), zzc(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzb(i2, jZze, zzc(strArr, 0, 6), 6, priorityQueue);
        int i5 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i5 >= length2 - 5) {
                return;
            }
            long jZza = zzbek.zza(strArr[i5 - 1]);
            long jZza2 = zzbek.zza(strArr[i5 + 5]);
            String strZzc = zzc(strArr, i5, 6);
            jZze = ((((((jZze + 1073807359) - ((zzd(16785407L, 5) * ((jZza + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((jZza2 + 2147483647L) % 1073807359)) % 1073807359;
            zzb(i2, jZze, strZzc, length2, priorityQueue);
            i5++;
        }
    }

    @VisibleForTesting
    static void zzb(int i2, long j2, String str, int i3, PriorityQueue priorityQueue) {
        zzbem zzbemVar = new zzbem(j2, str, i3);
        if ((priorityQueue.size() != i2 || (((zzbem) priorityQueue.peek()).zzc <= zzbemVar.zzc && ((zzbem) priorityQueue.peek()).zza <= zzbemVar.zza)) && !priorityQueue.contains(zzbemVar)) {
            priorityQueue.add(zzbemVar);
            if (priorityQueue.size() > i2) {
                priorityQueue.poll();
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzajf implements zzafy {

    @Nullable
    private final zzaei zza;
    private final SparseArray zzb;
    private final long zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    public zzajf(SparseArray sparseArray, long j2, int i2, long j3, long j4) {
        int i3;
        this.zzb = sparseArray;
        this.zzc = j2;
        this.zzd = i2;
        List list = (List) sparseArray.get(i2);
        zzaei zzaeiVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i5 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                zzaje zzajeVar = (zzaje) list.get(i7);
                jArrCopyOf3[i7] = zzajeVar.zza();
                jArrCopyOf[i7] = zzajeVar.zzb();
            }
            while (true) {
                i3 = size - 1;
                if (i5 >= i3) {
                    break;
                }
                int i8 = i5 + 1;
                iArrCopyOf[i5] = (int) (jArrCopyOf[i8] - jArrCopyOf[i5]);
                jArrCopyOf2[i5] = jArrCopyOf3[i8] - jArrCopyOf3[i5];
                i5 = i8;
            }
            int i9 = i3;
            while (i9 > 0 && jArrCopyOf3[i9] >= j2) {
                i9--;
            }
            iArrCopyOf[i9] = (int) ((j3 + j4) - jArrCopyOf[i9]);
            jArrCopyOf2[i9] = j2 - jArrCopyOf3[i9];
            if (i9 < i3) {
                zzee.zzc("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i10 = i9 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i10);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i10);
            }
            zzaeiVar = new zzaei(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.zza = zzaeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        List list = (List) this.zzb.get(this.zzd);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        zzaei zzaeiVar = this.zza;
        if (zzaeiVar != null) {
            return zzaeiVar.zzc(j2);
        }
        zzafz zzafzVar = zzafz.zza;
        return new zzafw(zzafzVar, zzafzVar);
    }
}

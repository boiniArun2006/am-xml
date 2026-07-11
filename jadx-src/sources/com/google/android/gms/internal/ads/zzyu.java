package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzyu extends zzyw {
    protected zzyu(zzbg zzbgVar, int[] iArr, int i2, zzaas zzaasVar, long j2, long j3, long j4, int i3, int i5, float f3, float f4, List list, zzdn zzdnVar) {
        super(zzbgVar, iArr, 0);
        zzguf.zzq(list);
    }

    static /* synthetic */ zzguf zzd(zzaab[] zzaabVarArr) {
        int i2;
        long[][] jArr;
        int i3 = 1;
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        for (int i7 = 0; i7 < 2; i7++) {
            zzaab zzaabVar = zzaabVarArr[i7];
            if (zzaabVar == null || zzaabVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i8 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                zzgucVar.zzf(new zzys(0L, 0L));
                arrayList.add(zzgucVar);
            }
        }
        long[][] jArr2 = new long[2][];
        for (int i9 = 0; i9 < 2; i9++) {
            zzaab zzaabVar2 = zzaabVarArr[i9];
            if (zzaabVar2 == null) {
                jArr2[i9] = new long[0];
            } else {
                int[] iArr = zzaabVar2.zzb;
                jArr2[i9] = new long[iArr.length];
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    long j2 = zzaabVar2.zza.zza(iArr[i10]).zzj;
                    long[] jArr3 = jArr2[i9];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr3[i10] = j2;
                }
                Arrays.sort(jArr2[i9]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i11 = 0; i11 < 2; i11++) {
            long[] jArr5 = jArr2[i11];
            jArr4[i11] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzgva zzgvaVarZza = zzgvu.zzc(zzgvz.zzb()).zzb(2).zza();
        int i12 = 0;
        while (i12 < 2) {
            int length = jArr2[i12].length;
            if (length <= i3) {
                i2 = i5;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i13 = i5;
                while (true) {
                    long[] jArr6 = jArr2[i12];
                    double dLog = 0.0d;
                    if (i13 >= jArr6.length) {
                        break;
                    }
                    int i14 = i5;
                    long[][] jArr7 = jArr2;
                    long j3 = jArr6[i13];
                    if (j3 != -1) {
                        dLog = Math.log(j3);
                    }
                    dArr[i13] = dLog;
                    i13 += i3;
                    i5 = i14;
                    jArr2 = jArr7;
                }
                i2 = i5;
                jArr = jArr2;
                int i15 = length - 1;
                double d2 = dArr[i15] - dArr[i2];
                int i16 = i2;
                while (i16 < i15) {
                    double d4 = dArr[i16];
                    i16 += i3;
                    zzgvaVarZza.zze(Double.valueOf(d2 == 0.0d ? 1.0d : (((d4 + dArr[i16]) * 0.5d) - dArr[i2]) / d2), Integer.valueOf(i12));
                    i3 = i3;
                }
            }
            i12++;
            i5 = i2;
            jArr2 = jArr;
            i3 = i3;
        }
        int i17 = i5;
        long[][] jArr8 = jArr2;
        zzguf zzgufVarZzq = zzguf.zzq(zzgvaVarZza.zzt());
        while (i5 < zzgufVarZzq.size()) {
            int iIntValue = ((Integer) zzgufVarZzq.get(i5)).intValue();
            int i18 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i18;
            jArr4[iIntValue] = jArr8[iIntValue][i18];
            zzi(arrayList, jArr4);
            i5++;
        }
        for (int i19 = i17; i19 < 2; i19++) {
            if (arrayList.get(i19) != null) {
                long j4 = jArr4[i19];
                jArr4[i19] = j4 + j4;
            }
        }
        zzi(arrayList, jArr4);
        zzguc zzgucVar2 = new zzguc();
        for (int i20 = i17; i20 < arrayList.size(); i20++) {
            zzguc zzgucVar3 = (zzguc) arrayList.get(i20);
            zzgucVar2.zzf(zzgucVar3 == null ? zzguf.zzi() : zzgucVar3.zzi());
        }
        return zzgucVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j2 = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            j2 += jArr[i2];
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzguc zzgucVar = (zzguc) list.get(i3);
            if (zzgucVar != null) {
                zzgucVar.zzf(new zzys(j2, jArr[i3]));
            }
        }
    }
}

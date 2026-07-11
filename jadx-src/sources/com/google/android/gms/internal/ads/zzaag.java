package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzaag extends zzaaj {
    protected abstract Pair zzh(zzaaf zzaafVar, int[][][] iArr, int[] iArr2, zzwk zzwkVar, zzbf zzbfVar) throws zziw;

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zzp(@Nullable Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final zzaak zzq(zzmn[] zzmnVarArr, zzyn zzynVar, zzwk zzwkVar, zzbf zzbfVar) throws zziw {
        List[] listArr;
        boolean z2;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = zzynVar.zzb;
            zzbgVarArr[i2] = new zzbg[i3];
            iArr3[i2] = new int[i3][];
        }
        int i5 = 2;
        int[] iArr4 = new int[2];
        for (int i7 = 0; i7 < 2; i7++) {
            iArr4[i7] = zzmnVarArr[i7].zzu();
        }
        int i8 = 0;
        while (i8 < zzynVar.zzb) {
            zzbg zzbgVarZza = zzynVar.zza(i8);
            int i9 = zzbgVarZza.zzc;
            int i10 = i5;
            int i11 = 0;
            int i12 = 0;
            boolean z3 = true;
            while (i11 < i5) {
                zzmn zzmnVar = zzmnVarArr[i11];
                int iMax = 0;
                for (int i13 = 0; i13 < zzbgVarZza.zza; i13++) {
                    iMax = Math.max(iMax, zzmnVar.zzab(zzbgVarZza.zza(i13)) & 7);
                }
                boolean z4 = iArr2[i11] == 0;
                if (iMax > i12) {
                    z3 = z4;
                    i10 = i11;
                    i12 = iMax;
                } else if (iMax == i12 && i9 == 5 && !z3 && z4) {
                    i10 = i11;
                    i12 = iMax;
                    z3 = true;
                }
                i11++;
                i5 = 2;
            }
            if (i10 == i5) {
                iArr = new int[zzbgVarZza.zza];
            } else {
                zzmn zzmnVar2 = zzmnVarArr[i10];
                int i14 = zzbgVarZza.zza;
                int[] iArr5 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr5[i15] = zzmnVar2.zzab(zzbgVarZza.zza(i15));
                }
                iArr = iArr5;
            }
            int i16 = iArr2[i10];
            zzbgVarArr[i10][i16] = zzbgVarZza;
            iArr3[i10][i16] = iArr;
            iArr2[i10] = i16 + 1;
            i8++;
            i5 = 2;
        }
        zzyn[] zzynVarArr = new zzyn[i5];
        String[] strArr = new String[i5];
        int[] iArr6 = new int[i5];
        int i17 = 0;
        while (i17 < i5) {
            int i18 = iArr2[i17];
            zzynVarArr[i17] = new zzyn((zzbg[]) zzfj.zzb(zzbgVarArr[i17], i18));
            iArr3[i17] = (int[][]) zzfj.zzb(iArr3[i17], i18);
            strArr[i17] = zzmnVarArr[i17].zzS();
            iArr6[i17] = zzmnVarArr[i17].zza();
            i17++;
            i5 = 2;
        }
        int i19 = i5;
        zzaaf zzaafVar = new zzaaf(strArr, iArr6, zzynVarArr, iArr4, iArr3, new zzyn((zzbg[]) zzfj.zzb(zzbgVarArr[i19], iArr2[i19])));
        Pair pairZzh = zzh(zzaafVar, iArr3, iArr4, zzwkVar, zzbfVar);
        zzaah[] zzaahVarArr = (zzaah[]) pairZzh.second;
        List[] listArr2 = new List[zzaahVarArr.length];
        for (int i20 = 0; i20 < zzaahVarArr.length; i20++) {
            zzaah zzaahVar = zzaahVarArr[i20];
            listArr2[i20] = zzaahVar != null ? zzguf.zzj(zzaahVar) : zzguf.zzi();
        }
        zzguc zzgucVar = new zzguc();
        for (int i21 = 0; i21 < 2; i21++) {
            zzyn zzynVarZzb = zzaafVar.zzb(i21);
            List list = listArr2[i21];
            int i22 = 0;
            while (i22 < zzynVarZzb.zzb) {
                zzbg zzbgVarZza2 = zzynVarZzb.zza(i22);
                boolean z5 = zzaafVar.zzd(i21, i22, false) != 0;
                int i23 = zzbgVarZza2.zza;
                int[] iArr7 = new int[i23];
                boolean[] zArr = new boolean[i23];
                int i24 = 0;
                while (i24 < i23) {
                    iArr7[i24] = zzaafVar.zzc(i21, i22, i24) & 7;
                    int i25 = 0;
                    while (true) {
                        if (i25 >= list.size()) {
                            listArr = listArr2;
                            z2 = false;
                            break;
                        }
                        zzaah zzaahVar2 = (zzaah) list.get(i25);
                        listArr = listArr2;
                        if (zzaahVar2.zza().equals(zzbgVarZza2) && zzaahVar2.zzg(i24) != -1) {
                            z2 = true;
                            break;
                        }
                        i25++;
                        listArr2 = listArr;
                    }
                    zArr[i24] = z2;
                    i24++;
                    listArr2 = listArr;
                }
                zzgucVar.zzf(new zzbm(zzbgVarZza2, z5, iArr7, zArr));
                i22++;
                listArr2 = listArr2;
            }
        }
        zzyn zzynVarZze = zzaafVar.zze();
        for (int i26 = 0; i26 < zzynVarZze.zzb; i26++) {
            zzbg zzbgVarZza3 = zzynVarZze.zza(i26);
            int i27 = zzbgVarZza3.zza;
            int[] iArr8 = new int[i27];
            Arrays.fill(iArr8, 0);
            zzgucVar.zzf(new zzbm(zzbgVarZza3, false, iArr8, new boolean[i27]));
        }
        return new zzaak((zzmo[]) pairZzh.first, (zzaac[]) pairZzh.second, new zzbn(zzgucVar.zzi()), zzaafVar);
    }
}

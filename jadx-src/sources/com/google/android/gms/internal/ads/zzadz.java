package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzadz {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;

    @Nullable
    public final String zzl;

    private zzadz(List list, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, int i12, float f3, @Nullable String str) {
        this.zza = list;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i5;
        this.zze = i7;
        this.zzf = i8;
        this.zzg = i9;
        this.zzh = i10;
        this.zzi = i11;
        this.zzj = i12;
        this.zzk = f3;
        this.zzl = str;
    }

    public static zzadz zza(zzer zzerVar) throws zzat {
        String strZza;
        int i2;
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        float f3;
        int i10;
        int i11;
        try {
            zzerVar.zzk(4);
            int iZzs = (zzerVar.zzs() & 3) + 1;
            if (iZzs == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzs2 = zzerVar.zzs() & 31;
            for (int i12 = 0; i12 < iZzs2; i12++) {
                arrayList.add(zzb(zzerVar));
            }
            int iZzs3 = zzerVar.zzs();
            for (int i13 = 0; i13 < iZzs3; i13++) {
                arrayList.add(zzb(zzerVar));
            }
            if (iZzs2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = zzgm.zza;
                zzgl zzglVarZze = zzgm.zze(bArr2, 5, bArr.length);
                int i14 = zzglVarZze.zze;
                int i15 = zzglVarZze.zzf;
                int i16 = zzglVarZze.zzh + 8;
                int i17 = zzglVarZze.zzi + 8;
                int i18 = zzglVarZze.zzj;
                int i19 = zzglVarZze.zzk;
                int i20 = zzglVarZze.zzl;
                int i21 = zzglVarZze.zzm;
                float f4 = zzglVarZze.zzg;
                strZza = zzdo.zza(zzglVarZze.zza, zzglVarZze.zzb, zzglVarZze.zzc);
                i8 = i20;
                i9 = i21;
                f3 = f4;
                i7 = i17;
                i10 = i18;
                i11 = i19;
                i2 = i14;
                i3 = i15;
                i5 = i16;
            } else {
                strZza = null;
                i2 = -1;
                i3 = -1;
                i5 = -1;
                i7 = -1;
                i8 = -1;
                i9 = 16;
                f3 = 1.0f;
                i10 = -1;
                i11 = -1;
            }
            return new zzadz(arrayList, iZzs, i2, i3, i5, i7, i10, i11, i8, i9, f3, strZza);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw zzat.zzb("Error parsing AVC config", e2);
        }
    }

    private static byte[] zzb(zzer zzerVar) {
        int iZzt = zzerVar.zzt();
        int iZzg = zzerVar.zzg();
        zzerVar.zzk(iZzt);
        return zzdo.zzf(zzerVar.zzi(), iZzg, iZzt);
    }
}

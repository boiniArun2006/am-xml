package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzafo {
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
    public final int zzk;
    public final float zzl;
    public final int zzm;

    @Nullable
    public final String zzn;

    @Nullable
    public final zzgj zzo;

    private zzafo(List list, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f3, int i16, @Nullable String str, @Nullable zzgj zzgjVar) {
        this.zza = list;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i8;
        this.zze = i9;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = i12;
        this.zzi = i13;
        this.zzj = i14;
        this.zzk = i15;
        this.zzl = f3;
        this.zzm = i16;
        this.zzn = str;
        this.zzo = zzgjVar;
    }

    public static zzafo zza(zzer zzerVar) throws zzat {
        return zzc(zzerVar, false, null);
    }

    public static zzafo zzb(zzer zzerVar, zzgj zzgjVar) throws zzat {
        return zzc(zzerVar, true, zzgjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0133 A[PHI: r34
      0x0133: PHI (r34v2 int) = (r34v0 int), (r34v0 int), (r34v0 int), (r34v0 int), (r34v3 int) binds: [B:41:0x013c, B:42:0x013e, B:96:0x023e, B:97:0x0240, B:38:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzafo zzc(zzer zzerVar, boolean z2, @Nullable zzgj zzgjVar) throws zzat {
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        zzgf zzgfVar;
        int i5;
        int iMax;
        int i7;
        int iMax2;
        int i8;
        int i9;
        int i10;
        int i11 = 4;
        boolean z5 = true;
        if (z2) {
            try {
                zzerVar.zzk(4);
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                z4 = true;
                throw zzat.zzb("Error parsing".concat(z4 != z2 ? "HEVC config" : "L-HEVC config"), e);
            }
        } else {
            try {
                zzerVar.zzk(21);
            } catch (ArrayIndexOutOfBoundsException e3) {
                e = e3;
                z3 = z5;
                z4 = z3;
                throw zzat.zzb("Error parsing".concat(z4 != z2 ? "HEVC config" : "L-HEVC config"), e);
            }
        }
        int iZzs = zzerVar.zzs() & 3;
        int iZzs2 = zzerVar.zzs();
        int iZzg = zzerVar.zzg();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iZzs2; i14++) {
            zzerVar.zzk(1);
            int iZzt = zzerVar.zzt();
            for (int i15 = 0; i15 < iZzt; i15++) {
                int iZzt2 = zzerVar.zzt();
                i13 += iZzt2 + 4;
                zzerVar.zzk(iZzt2);
            }
        }
        zzerVar.zzh(iZzg);
        byte[] bArr = new byte[i13];
        zzgj zzgjVar2 = zzgjVar;
        int i16 = 0;
        float f3 = 1.0f;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        String strZzb = null;
        int i29 = 0;
        while (i29 < iZzs2) {
            int iZzs3 = zzerVar.zzs() & 63;
            int iZzt3 = zzerVar.zzt();
            z3 = z5;
            int i30 = i12;
            zzgj zzgjVarZzf = zzgjVar2;
            while (i30 < iZzt3) {
                try {
                    int iZzt4 = zzerVar.zzt();
                    int i31 = i30;
                    System.arraycopy(zzgm.zza, i12, bArr, i16, i11);
                    int i32 = i16 + 4;
                    System.arraycopy(zzerVar.zzi(), zzerVar.zzg(), bArr, i32, iZzt4);
                    int i33 = 32;
                    if (iZzs3 == 32) {
                        if (i31 == 0) {
                            zzgjVarZzf = zzgm.zzf(bArr, i32, i32 + iZzt4);
                            i3 = i32;
                            i2 = iZzs;
                            i9 = 0;
                            i8 = 0;
                        }
                        i16 = i3 + iZzt4;
                        zzerVar.zzk(iZzt4);
                        i30 = i9 + 1;
                        i12 = i8;
                        iZzs = i2;
                        i11 = 4;
                    } else {
                        i33 = iZzs3;
                    }
                    i2 = iZzs;
                    if (i33 != 33) {
                        i3 = i32;
                        int i34 = 8;
                        if (i33 == 39 && i31 == 0) {
                            int i35 = i16 + 6;
                            int i36 = (i3 + iZzt4) - 1;
                            while (true) {
                                byte b2 = bArr[i36];
                                if (b2 == 0) {
                                    if (i36 <= i35) {
                                        break;
                                    }
                                    i36--;
                                } else {
                                    if (b2 == 0 || i36 <= i35) {
                                        break;
                                    }
                                    zzgn zzgnVar = new zzgn(bArr, i35, i36 + 1);
                                    while (true) {
                                        if (!zzgnVar.zzd(16)) {
                                            break;
                                        }
                                        int i37 = i34;
                                        int iZzf = zzgnVar.zzf(i37);
                                        int i38 = 0;
                                        while (iZzf == 255) {
                                            i38 += 255;
                                            iZzf = zzgnVar.zzf(i37);
                                        }
                                        int i39 = i38 + iZzf;
                                        int iZzf2 = zzgnVar.zzf(i37);
                                        int i40 = 0;
                                        while (iZzf2 == 255) {
                                            i40 += 255;
                                            iZzf2 = zzgnVar.zzf(8);
                                        }
                                        i34 = 8;
                                        int i41 = i40 + iZzf2;
                                        if (i41 == 0 || !zzgnVar.zzd(i41)) {
                                            break;
                                        }
                                        if (i39 == 176) {
                                            int iZzg2 = zzgnVar.zzg();
                                            boolean zZze = zzgnVar.zze();
                                            int iZzg3 = zZze ? zzgnVar.zzg() : 0;
                                            int iZzg4 = zzgnVar.zzg();
                                            int iZzg5 = -1;
                                            int iZzg6 = -1;
                                            int i42 = -1;
                                            int iZzf3 = -1;
                                            int i43 = -1;
                                            int iZzf4 = -1;
                                            int i44 = 0;
                                            while (i44 <= iZzg4) {
                                                iZzg5 = zzgnVar.zzg();
                                                iZzg6 = zzgnVar.zzg();
                                                boolean z6 = zZze;
                                                int iZzf5 = zzgnVar.zzf(6);
                                                if (iZzf5 != 63) {
                                                    if (iZzf5 == 0) {
                                                        i5 = iZzf5;
                                                        iMax = Math.max(0, iZzg2 - 30);
                                                    } else {
                                                        i5 = iZzf5;
                                                        iMax = Math.max(0, (i5 + iZzg2) - 31);
                                                    }
                                                    iZzf3 = zzgnVar.zzf(iMax);
                                                    if (z6) {
                                                        int iZzf6 = zzgnVar.zzf(6);
                                                        if (iZzf6 != 63) {
                                                            if (iZzf6 == 0) {
                                                                i7 = iZzf6;
                                                                iMax2 = Math.max(0, iZzg3 - 30);
                                                            } else {
                                                                i7 = iZzf6;
                                                                iMax2 = Math.max(0, (i7 + iZzg3) - 31);
                                                            }
                                                            iZzf4 = zzgnVar.zzf(iMax2);
                                                            i43 = i7;
                                                        }
                                                    }
                                                    if (zzgnVar.zze()) {
                                                        zzgnVar.zzb(10);
                                                    }
                                                    i44++;
                                                    zZze = z6;
                                                    i42 = i5;
                                                }
                                            }
                                            zzgfVar = new zzgf(iZzg2, iZzg3, iZzg4 + 1, iZzg5, iZzg6, i42, iZzf3, i43, iZzf4);
                                        } else {
                                            zzgnVar.zzb(i41 * 8);
                                        }
                                    }
                                }
                            }
                            zzgfVar = null;
                            if (zzgfVar != null && zzgjVarZzf != null) {
                                i8 = 0;
                                if (zzgfVar.zza == ((zzfz) zzgjVarZzf.zza.get(0)).zzb) {
                                    i9 = i31;
                                    i27 = 4;
                                } else {
                                    i27 = 5;
                                }
                            }
                        } else {
                            i8 = 0;
                        }
                        i16 = i3 + iZzt4;
                        zzerVar.zzk(iZzt4);
                        i30 = i9 + 1;
                        i12 = i8;
                        iZzs = i2;
                        i11 = 4;
                    } else if (i31 == 0) {
                        zzgg zzggVarZzg = zzgm.zzg(bArr, i32, i32 + iZzt4, zzgjVarZzf);
                        int i45 = zzggVarZzg.zza + 1;
                        int i46 = zzggVarZzg.zze;
                        int i47 = zzggVarZzg.zzf;
                        int i48 = zzggVarZzg.zzg;
                        i3 = i32;
                        int i49 = zzggVarZzg.zzh;
                        int i50 = zzggVarZzg.zzc + 8;
                        int i51 = zzggVarZzg.zzd + 8;
                        int i52 = zzggVarZzg.zzk;
                        int i53 = zzggVarZzg.zzl;
                        int i54 = zzggVarZzg.zzm;
                        float f4 = zzggVarZzg.zzi;
                        int i55 = zzggVarZzg.zzj;
                        zzgb zzgbVar = zzggVarZzg.zzb;
                        if (zzgbVar != null) {
                            i10 = i55;
                            strZzb = zzdo.zzb(zzgbVar.zza, zzgbVar.zzb, zzgbVar.zzc, zzgbVar.zzd, zzgbVar.zze, zzgbVar.zzf);
                        } else {
                            i10 = i55;
                        }
                        i26 = i54;
                        f3 = f4;
                        i28 = i10;
                        i9 = i31;
                        i23 = i51;
                        i24 = i52;
                        i25 = i53;
                        i20 = i48;
                        i21 = i49;
                        i22 = i50;
                        i8 = 0;
                        i18 = i46;
                        i19 = i47;
                        i17 = i45;
                        i16 = i3 + iZzt4;
                        zzerVar.zzk(iZzt4);
                        i30 = i9 + 1;
                        i12 = i8;
                        iZzs = i2;
                        i11 = 4;
                    } else {
                        i3 = i32;
                        i8 = 0;
                    }
                    i9 = i31;
                    i16 = i3 + iZzt4;
                    zzerVar.zzk(iZzt4);
                    i30 = i9 + 1;
                    i12 = i8;
                    iZzs = i2;
                    i11 = 4;
                } catch (ArrayIndexOutOfBoundsException e4) {
                    e = e4;
                    z4 = z3;
                    throw zzat.zzb("Error parsing".concat(z4 != z2 ? "HEVC config" : "L-HEVC config"), e);
                }
            }
            i29++;
            zzgjVar2 = zzgjVarZzf;
            z5 = z3;
            iZzs = iZzs;
            i11 = 4;
        }
        z3 = z5;
        return new zzafo(i13 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iZzs + 1, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, f3, i28, strZzb, zzgjVar2);
    }
}

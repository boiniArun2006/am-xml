package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzamr implements zzamf {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzamk zzg;
    private final zzamj zzh;
    private final zzamq zzi;
    private Bitmap zzj;

    private static int[] zzd() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int zzg(int i2, int i3, int i5, int i7) {
        return (i2 << 24) | (i3 << 16) | (i5 << 8) | i7;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i2, int i3, zzame zzameVar, zzdr zzdrVar) {
        boolean z2;
        zzalx zzalxVar;
        Canvas canvas;
        char c2;
        char c4;
        char c5;
        int i5;
        zzamq zzamqVar;
        Canvas canvas2;
        int i7;
        int i8;
        int i9;
        zzamo zzamoVar;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i10;
        int iZzj5;
        zzeq zzeqVar = new zzeq(bArr, i2 + i3);
        zzeqVar.zzf(i2);
        while (true) {
            z2 = true;
            if (zzeqVar.zzc() >= 48 && zzeqVar.zzj(8) == 15) {
                zzamq zzamqVar2 = this.zzi;
                int iZzj6 = zzeqVar.zzj(8);
                int iZzj7 = zzeqVar.zzj(16);
                int iZzj8 = zzeqVar.zzj(16);
                int iZze = zzeqVar.zze() + iZzj8;
                if (iZzj8 * 8 > zzeqVar.zzc()) {
                    zzee.zzc("DvbParser", "Data field length exceeds limit");
                    zzeqVar.zzh(zzeqVar.zzc());
                } else {
                    switch (iZzj6) {
                        case 16:
                            if (iZzj7 == zzamqVar2.zza) {
                                zzamm zzammVar = zzamqVar2.zzi;
                                int iZzj9 = zzeqVar.zzj(8);
                                int iZzj10 = zzeqVar.zzj(4);
                                int iZzj11 = zzeqVar.zzj(2);
                                zzeqVar.zzh(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i11 = iZzj8 - 2; i11 > 0; i11 -= 6) {
                                    int iZzj12 = zzeqVar.zzj(8);
                                    zzeqVar.zzh(8);
                                    sparseArray.put(iZzj12, new zzamn(zzeqVar.zzj(16), zzeqVar.zzj(16)));
                                }
                                zzamm zzammVar2 = new zzamm(iZzj9, iZzj10, iZzj11, sparseArray);
                                if (zzammVar2.zzb != 0) {
                                    zzamqVar2.zzi = zzammVar2;
                                    zzamqVar2.zzc.clear();
                                    zzamqVar2.zzd.clear();
                                    zzamqVar2.zze.clear();
                                } else if (zzammVar != null) {
                                    if (zzammVar.zza != zzammVar2.zza) {
                                        zzamqVar2.zzi = zzammVar2;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzamm zzammVar3 = zzamqVar2.zzi;
                            if (iZzj7 == zzamqVar2.zza && zzammVar3 != null) {
                                int iZzj13 = zzeqVar.zzj(8);
                                zzeqVar.zzh(4);
                                boolean zZzi = zzeqVar.zzi();
                                zzeqVar.zzh(3);
                                int iZzj14 = zzeqVar.zzj(16);
                                int iZzj15 = zzeqVar.zzj(16);
                                int iZzj16 = zzeqVar.zzj(3);
                                int iZzj17 = zzeqVar.zzj(3);
                                zzeqVar.zzh(2);
                                int iZzj18 = zzeqVar.zzj(8);
                                int iZzj19 = zzeqVar.zzj(8);
                                int iZzj20 = zzeqVar.zzj(4);
                                int iZzj21 = zzeqVar.zzj(2);
                                zzeqVar.zzh(2);
                                int i12 = iZzj8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i12 > 0) {
                                    int iZzj22 = zzeqVar.zzj(16);
                                    int iZzj23 = zzeqVar.zzj(2);
                                    int iZzj24 = zzeqVar.zzj(2);
                                    int iZzj25 = zzeqVar.zzj(12);
                                    zzeqVar.zzh(4);
                                    int iZzj26 = zzeqVar.zzj(12);
                                    int i13 = i12 - 6;
                                    if (iZzj23 == 1) {
                                        i12 -= 8;
                                        iZzj = zzeqVar.zzj(8);
                                        iZzj2 = zzeqVar.zzj(8);
                                    } else if (iZzj23 == 2) {
                                        iZzj23 = 2;
                                        i12 -= 8;
                                        iZzj = zzeqVar.zzj(8);
                                        iZzj2 = zzeqVar.zzj(8);
                                    } else {
                                        i12 = i13;
                                        iZzj = 0;
                                        iZzj2 = 0;
                                    }
                                    sparseArray2.put(iZzj22, new zzamp(iZzj23, iZzj24, iZzj25, iZzj26, iZzj, iZzj2));
                                }
                                zzamo zzamoVar2 = new zzamo(iZzj13, zZzi, iZzj14, iZzj15, iZzj16, iZzj17, iZzj18, iZzj19, iZzj20, iZzj21, sparseArray2);
                                if (zzammVar3.zzb == 0 && (zzamoVar = (zzamo) zzamqVar2.zzc.get(zzamoVar2.zza)) != null) {
                                    int i14 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzamoVar.zzj;
                                        if (i14 < sparseArray3.size()) {
                                            zzamoVar2.zzj.put(sparseArray3.keyAt(i14), (zzamp) sparseArray3.valueAt(i14));
                                            i14++;
                                        }
                                    }
                                }
                                zzamqVar2.zzc.put(zzamoVar2.zza, zzamoVar2);
                            }
                            break;
                        case 18:
                            if (iZzj7 == zzamqVar2.zza) {
                                zzamj zzamjVarZzb = zzb(zzeqVar, iZzj8);
                                zzamqVar2.zzd.put(zzamjVarZzb.zza, zzamjVarZzb);
                            } else if (iZzj7 == zzamqVar2.zzb) {
                                zzamj zzamjVarZzb2 = zzb(zzeqVar, iZzj8);
                                zzamqVar2.zzf.put(zzamjVarZzb2.zza, zzamjVarZzb2);
                            }
                            break;
                        case 19:
                            if (iZzj7 == zzamqVar2.zza) {
                                zzaml zzamlVarZzc = zzc(zzeqVar);
                                zzamqVar2.zze.put(zzamlVarZzc.zza, zzamlVarZzc);
                            } else if (iZzj7 == zzamqVar2.zzb) {
                                zzaml zzamlVarZzc2 = zzc(zzeqVar);
                                zzamqVar2.zzg.put(zzamlVarZzc2.zza, zzamlVarZzc2);
                            }
                            break;
                        case 20:
                            if (iZzj7 == zzamqVar2.zza) {
                                zzeqVar.zzh(4);
                                boolean zZzi2 = zzeqVar.zzi();
                                zzeqVar.zzh(3);
                                int iZzj27 = zzeqVar.zzj(16);
                                int iZzj28 = zzeqVar.zzj(16);
                                if (zZzi2) {
                                    int iZzj29 = zzeqVar.zzj(16);
                                    iZzj3 = zzeqVar.zzj(16);
                                    iZzj5 = zzeqVar.zzj(16);
                                    iZzj4 = zzeqVar.zzj(16);
                                    i10 = iZzj29;
                                } else {
                                    iZzj3 = iZzj27;
                                    iZzj4 = iZzj28;
                                    i10 = 0;
                                    iZzj5 = 0;
                                }
                                zzamqVar2.zzh = new zzamk(iZzj27, iZzj28, i10, iZzj3, iZzj5, iZzj4);
                            }
                            break;
                    }
                    zzeqVar.zzo(iZze - zzeqVar.zze());
                }
            }
        }
        zzamq zzamqVar3 = this.zzi;
        zzamm zzammVar4 = zzamqVar3.zzi;
        if (zzammVar4 == null) {
            zzalxVar = new zzalx(zzguf.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzamk zzamkVar = zzamqVar3.zzh;
            if (zzamkVar == null) {
                zzamkVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzamkVar.zza + 1 != bitmap.getWidth() || zzamkVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzamkVar.zza + 1, zzamkVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzammVar4.zzc;
            int i15 = 0;
            while (i15 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzamn zzamnVar = (zzamn) sparseArray4.valueAt(i15);
                zzamo zzamoVar3 = (zzamo) zzamqVar3.zzc.get(sparseArray4.keyAt(i15));
                int i16 = zzamnVar.zza + zzamkVar.zzc;
                int i17 = zzamnVar.zzb + zzamkVar.zze;
                int i18 = zzamoVar3.zzc;
                int i19 = i16 + i18;
                boolean z3 = z2;
                int iMin = Math.min(i19, zzamkVar.zzd);
                int i20 = zzamoVar3.zzd;
                int i21 = i17 + i20;
                canvas3.clipRect(i16, i17, iMin, Math.min(i21, zzamkVar.zzf));
                int i22 = zzamoVar3.zzf;
                zzamj zzamjVar = (zzamj) zzamqVar3.zzd.get(i22);
                if (zzamjVar == null && (zzamjVar = (zzamj) zzamqVar3.zzf.get(i22)) == null) {
                    zzamjVar = this.zzh;
                }
                SparseArray sparseArray5 = zzamoVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i23 = i15;
                int i24 = 0;
                while (i24 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i24);
                    int i25 = i24;
                    zzamp zzampVar = (zzamp) sparseArray5.valueAt(i24);
                    SparseArray sparseArray7 = sparseArray5;
                    zzaml zzamlVar = (zzaml) zzamqVar3.zze.get(iKeyAt);
                    if (zzamlVar == null) {
                        zzamlVar = (zzaml) zzamqVar3.zzg.get(iKeyAt);
                    }
                    if (zzamlVar != null) {
                        Paint paint = zzamlVar.zzb ? null : this.zzd;
                        i8 = i18;
                        int i26 = zzamoVar3.zze;
                        zzamqVar = zzamqVar3;
                        int i27 = zzampVar.zza + i16;
                        int i28 = i17 + zzampVar.zzb;
                        canvas2 = canvas3;
                        i7 = i16;
                        int[] iArr = i26 == 3 ? zzamjVar.zzd : i26 == 2 ? zzamjVar.zzc : zzamjVar.zzb;
                        i9 = i19;
                        zzh(zzamlVar.zzc, iArr, i26, i27, i28, paint, canvas2);
                        zzh(zzamlVar.zzd, iArr, i26, i27, i28 + 1, paint, canvas2);
                    } else {
                        zzamqVar = zzamqVar3;
                        canvas2 = canvas3;
                        i7 = i16;
                        i8 = i18;
                        i9 = i19;
                    }
                    i16 = i7;
                    i19 = i9;
                    i24 = i25 + 1;
                    i18 = i8;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzamqVar3 = zzamqVar;
                }
                zzamq zzamqVar4 = zzamqVar3;
                Canvas canvas4 = canvas3;
                int i29 = i16;
                int i30 = i18;
                int i31 = i19;
                float f3 = i17;
                float f4 = i29;
                if (zzamoVar3.zzb) {
                    int i32 = zzamoVar3.zze;
                    if (i32 == 3) {
                        i5 = zzamjVar.zzd[zzamoVar3.zzg];
                        c5 = 2;
                    } else {
                        c5 = 2;
                        i5 = i32 == 2 ? zzamjVar.zzc[zzamoVar3.zzh] : zzamjVar.zzb[zzamoVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i5);
                    float f5 = i31;
                    c4 = c5;
                    c2 = 3;
                    canvas = canvas4;
                    canvas.drawRect(f4, f3, f5, i21, paint2);
                } else {
                    canvas = canvas4;
                    c2 = 3;
                    c4 = 2;
                }
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(Bitmap.createBitmap(this.zzj, i29, i17, i30, i20));
                float f6 = zzamkVar.zza;
                zzcwVar.zzi(f4 / f6);
                zzcwVar.zzj(0);
                float f7 = zzamkVar.zzb;
                zzcwVar.zzf(f3 / f7, 0);
                zzcwVar.zzg(0);
                zzcwVar.zzm(i30 / f6);
                zzcwVar.zzn(i20 / f7);
                arrayList.add(zzcwVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i15 = i23 + 1;
                z2 = z3;
                zzamqVar3 = zzamqVar4;
                sparseArray4 = sparseArray6;
            }
            zzalxVar = new zzalx(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdrVar.zza(zzalxVar);
    }

    private static zzamj zzb(zzeq zzeqVar, int i2) {
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i3 = 8;
        int iZzj5 = zzeqVar.zzj(8);
        zzeqVar.zzh(8);
        int[] iArrZzd = zzd();
        int[] iArrZze = zze();
        int[] iArrZzf = zzf();
        int i5 = i2 - 2;
        while (i5 > 0) {
            int iZzj6 = zzeqVar.zzj(i3);
            int iZzj7 = zzeqVar.zzj(i3);
            int[] iArr = (iZzj7 & 128) != 0 ? iArrZzd : (iZzj7 & 64) != 0 ? iArrZze : iArrZzf;
            if ((iZzj7 & 1) != 0) {
                iZzj3 = zzeqVar.zzj(i3);
                iZzj4 = zzeqVar.zzj(i3);
                iZzj = zzeqVar.zzj(i3);
                iZzj2 = zzeqVar.zzj(i3);
                i5 -= 6;
            } else {
                int iZzj8 = zzeqVar.zzj(6) << 2;
                int iZzj9 = zzeqVar.zzj(4) << 4;
                i5 -= 4;
                iZzj = zzeqVar.zzj(4) << 4;
                iZzj2 = zzeqVar.zzj(2) << 6;
                iZzj3 = iZzj8;
                iZzj4 = iZzj9;
            }
            if (iZzj3 == 0) {
                iZzj2 = 255;
            }
            if (iZzj3 == 0) {
                iZzj = 0;
            }
            if (iZzj3 == 0) {
                iZzj4 = 0;
            }
            double d2 = iZzj3;
            String str = zzfj.zza;
            double d4 = iZzj4 - 128;
            double d5 = iZzj - 128;
            iArr[iZzj6] = zzg((byte) (255 - (iZzj2 & 255)), Math.max(0, Math.min((int) (d2 + (1.402d * d4)), 255)), Math.max(0, Math.min((int) ((d2 - (0.34414d * d5)) - (d4 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d2 + (d5 * 1.772d)), 255)));
            iZzj5 = iZzj5;
            i3 = 8;
        }
        return new zzamj(iZzj5, iArrZzd, iArrZze, iArrZzf);
    }

    private static zzaml zzc(zzeq zzeqVar) {
        byte[] bArr;
        int iZzj = zzeqVar.zzj(16);
        zzeqVar.zzh(4);
        int iZzj2 = zzeqVar.zzj(2);
        boolean zZzi = zzeqVar.zzi();
        zzeqVar.zzh(1);
        byte[] bArr2 = zzfj.zzb;
        if (iZzj2 != 1) {
            if (iZzj2 == 0) {
                int iZzj3 = zzeqVar.zzj(16);
                int iZzj4 = zzeqVar.zzj(16);
                if (iZzj3 > 0) {
                    bArr2 = new byte[iZzj3];
                    zzeqVar.zzn(bArr2, 0, iZzj3);
                }
                if (iZzj4 > 0) {
                    bArr = new byte[iZzj4];
                    zzeqVar.zzn(bArr, 0, iZzj4);
                }
            }
            return new zzaml(iZzj, zZzi, bArr2, bArr);
        }
        zzeqVar.zzh(zzeqVar.zzj(8) * 16);
        bArr = bArr2;
        return new zzaml(iZzj, zZzi, bArr2, bArr);
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            int i3 = i2 & 4;
            int i5 = i2 & 2;
            int i7 = i2 & 1;
            if (i2 < 8) {
                iArr[i2] = zzg(255, 1 != i7 ? 0 : 255, i5 != 0 ? 255 : 0, i3 != 0 ? 255 : 0);
            } else {
                iArr[i2] = zzg(255, 1 != i7 ? 0 : 127, i5 != 0 ? 127 : 0, i3 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = zzg(63, 1 != (i2 & 1) ? 0 : 255, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = zzg(255, (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = zzg(127, (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = zzg(255, (1 != (i2 & 1) ? 0 : 43) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = zzg(255, (1 != (i2 & 1) ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzh(byte[] bArr, int[] iArr, int i2, int i3, int i5, @Nullable Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z2;
        int iZzj;
        char c2;
        boolean z3;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i7;
        int i8;
        boolean z4;
        int iZzj5;
        int iZzj6;
        int i9;
        int i10;
        int i11;
        int iZzj7;
        int i12;
        Paint paint2 = paint;
        zzeq zzeqVar = new zzeq(bArr, bArr.length);
        int i13 = i3;
        int i14 = i5;
        byte[] bArrZzi = null;
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        while (zzeqVar.zzc() != 0) {
            int iZzj8 = zzeqVar.zzj(8);
            if (iZzj8 != 240) {
                int i15 = 4;
                int i16 = 1;
                int i17 = 2;
                switch (iZzj8) {
                    case 16:
                        if (i2 != 3) {
                            if (i2 != 2) {
                                bArr2 = null;
                            } else if (bArrZzi3 == null) {
                                bArr3 = zza;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrZzi3;
                            }
                            z2 = false;
                            while (true) {
                                iZzj = zzeqVar.zzj(2);
                                if (iZzj != 0) {
                                }
                                z3 = z2;
                                c2 = 4;
                                if (iZzj3 == 0) {
                                }
                                paint2 = paint;
                                z2 = z3;
                            }
                        } else if (bArrZzi == null) {
                            bArr3 = zzb;
                            bArr2 = bArr3;
                            z2 = false;
                            while (true) {
                                iZzj = zzeqVar.zzj(2);
                                if (iZzj != 0) {
                                    iZzj3 = 1;
                                    iZzj2 = iZzj;
                                } else {
                                    if (zzeqVar.zzi()) {
                                        iZzj4 = zzeqVar.zzj(3) + 3;
                                        iZzj2 = zzeqVar.zzj(2);
                                    } else {
                                        if (zzeqVar.zzi()) {
                                            iZzj3 = 1;
                                            z3 = z2;
                                            iZzj2 = 0;
                                        } else {
                                            int iZzj9 = zzeqVar.zzj(2);
                                            if (iZzj9 == 0) {
                                                c2 = 4;
                                                z3 = true;
                                                iZzj2 = 0;
                                                iZzj3 = 0;
                                            } else if (iZzj9 == 1) {
                                                c2 = 4;
                                                z3 = z2;
                                                iZzj3 = 2;
                                                iZzj2 = 0;
                                            } else if (iZzj9 == 2) {
                                                c2 = 4;
                                                z3 = z2;
                                                iZzj3 = zzeqVar.zzj(4) + 12;
                                                iZzj2 = zzeqVar.zzj(2);
                                            } else if (iZzj9 != 3) {
                                                z3 = z2;
                                                iZzj2 = 0;
                                                iZzj3 = 0;
                                            } else {
                                                iZzj4 = zzeqVar.zzj(8) + 29;
                                                iZzj2 = zzeqVar.zzj(2);
                                            }
                                            if (iZzj3 == 0 || paint2 == null) {
                                                i7 = i13;
                                            } else {
                                                int i18 = i14 + 1;
                                                float f3 = i14;
                                                if (bArr2 != 0) {
                                                    iZzj2 = bArr2[iZzj2];
                                                }
                                                paint2.setColor(iArr[iZzj2]);
                                                i7 = i13;
                                                canvas.drawRect(i13, f3, i13 + iZzj3, i18, paint2);
                                            }
                                            i13 = i7 + iZzj3;
                                            if (!z3) {
                                                zzeqVar.zzm();
                                            } else {
                                                paint2 = paint;
                                                z2 = z3;
                                            }
                                        }
                                        c2 = 4;
                                        if (iZzj3 == 0) {
                                            i7 = i13;
                                            i13 = i7 + iZzj3;
                                            if (!z3) {
                                            }
                                        }
                                    }
                                    iZzj3 = iZzj4;
                                }
                                z3 = z2;
                                c2 = 4;
                                if (iZzj3 == 0) {
                                }
                            }
                        } else {
                            bArr2 = bArrZzi;
                            z2 = false;
                            while (true) {
                                iZzj = zzeqVar.zzj(2);
                                if (iZzj != 0) {
                                }
                                z3 = z2;
                                c2 = 4;
                                if (iZzj3 == 0) {
                                }
                                paint2 = paint;
                                z2 = z3;
                            }
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i2 == 3 ? bArrZzi2 == null ? zzc : bArrZzi2 : null;
                        boolean z5 = false;
                        while (true) {
                            int iZzj10 = zzeqVar.zzj(i15);
                            if (iZzj10 != 0) {
                                i8 = 1;
                                z4 = z5;
                            } else if (zzeqVar.zzi()) {
                                if (zzeqVar.zzi()) {
                                    int iZzj11 = zzeqVar.zzj(i17);
                                    if (iZzj11 == 0) {
                                        i8 = 1;
                                        z4 = z5;
                                        iZzj10 = 0;
                                    } else if (iZzj11 == 1) {
                                        z4 = z5;
                                        i8 = i17;
                                        iZzj10 = 0;
                                    } else if (iZzj11 == i17) {
                                        iZzj5 = zzeqVar.zzj(i15) + 9;
                                        iZzj6 = zzeqVar.zzj(i15);
                                    } else if (iZzj11 != 3) {
                                        z4 = z5;
                                        iZzj10 = 0;
                                        i8 = 0;
                                    } else {
                                        iZzj5 = zzeqVar.zzj(8) + 25;
                                        iZzj6 = zzeqVar.zzj(i15);
                                    }
                                } else {
                                    iZzj5 = zzeqVar.zzj(i17) + i15;
                                    iZzj6 = zzeqVar.zzj(i15);
                                }
                                i8 = iZzj5;
                                z4 = z5;
                                iZzj10 = iZzj6;
                            } else {
                                int iZzj12 = zzeqVar.zzj(3);
                                if (iZzj12 != 0) {
                                    i8 = iZzj12 + 2;
                                    z4 = z5;
                                    iZzj10 = 0;
                                } else {
                                    z4 = true;
                                    iZzj10 = 0;
                                    i8 = 0;
                                }
                            }
                            if (i8 == 0 || paint2 == null) {
                                i9 = i13;
                                i10 = i17;
                            } else {
                                int i19 = i14 + 1;
                                float f4 = i14;
                                if (bArr4 != 0) {
                                    iZzj10 = bArr4[iZzj10];
                                }
                                paint2.setColor(iArr[iZzj10]);
                                i9 = i13;
                                i10 = 2;
                                canvas.drawRect(i13, f4, i13 + i8, i19, paint2);
                            }
                            i13 = i9 + i8;
                            if (z4) {
                                zzeqVar.zzm();
                                continue;
                            } else {
                                i17 = i10;
                                z5 = z4;
                                i15 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i20 = i13;
                        int i21 = 0;
                        while (true) {
                            int iZzj13 = zzeqVar.zzj(8);
                            if (iZzj13 != 0) {
                                i11 = i21;
                                iZzj7 = i16;
                            } else if (zzeqVar.zzi()) {
                                i11 = i21;
                                iZzj7 = zzeqVar.zzj(7);
                                iZzj13 = zzeqVar.zzj(8);
                            } else {
                                int iZzj14 = zzeqVar.zzj(7);
                                if (iZzj14 != 0) {
                                    i11 = i21;
                                    iZzj7 = iZzj14;
                                    iZzj13 = 0;
                                } else {
                                    i11 = i16;
                                    iZzj13 = 0;
                                    iZzj7 = 0;
                                }
                            }
                            if (iZzj7 == 0 || paint2 == null) {
                                i12 = i16;
                            } else {
                                paint2.setColor(iArr[iZzj13]);
                                i12 = i16;
                                canvas.drawRect(i20, i14, i20 + iZzj7, i14 + 1, paint2);
                            }
                            i20 += iZzj7;
                            if (i11 != 0) {
                                i13 = i20;
                                continue;
                            } else {
                                i16 = i12;
                                i21 = i11;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iZzj8) {
                            case 32:
                                bArrZzi3 = zzi(4, 4, zzeqVar);
                                break;
                            case 33:
                                bArrZzi = zzi(4, 8, zzeqVar);
                                break;
                            case 34:
                                bArrZzi2 = zzi(16, 8, zzeqVar);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i14 += 2;
                i13 = i3;
            }
            paint2 = paint;
        }
    }

    private static byte[] zzi(int i2, int i3, zzeq zzeqVar) {
        byte[] bArr = new byte[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            bArr[i5] = (byte) zzeqVar.zzj(i3);
        }
        return bArr;
    }

    public zzamr(List list) {
        zzer zzerVar = new zzer((byte[]) list.get(0));
        int iZzt = zzerVar.zzt();
        int iZzt2 = zzerVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzamk(719, 575, 0, 719, 0, 575);
        this.zzh = new zzamj(0, zzd(), zze(), zzf());
        this.zzi = new zzamq(iZzt, iZzt2);
    }
}

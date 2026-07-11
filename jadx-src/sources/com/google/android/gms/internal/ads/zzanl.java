package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzanl {
    private boolean zzb;
    private boolean zzc;
    private int[] zzd;
    private int zze;
    private int zzf;

    @Nullable
    private Rect zzg;
    private final int[] zza = new int[4];
    private int zzh = -1;
    private int zzi = -1;

    private static int zze(int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            i2 = 0;
        }
        return iArr[i2];
    }

    private static int zzf(int i2, int i3) {
        return (i2 & 16777215) | ((i3 * 17) << 24);
    }

    private final void zzg(zzeq zzeqVar, boolean z2, Rect rect, int[] iArr) {
        int i2;
        int i3;
        int i5 = !z2 ? 1 : 0;
        int iWidth = rect.width();
        int i7 = i5 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i8 = 0;
            do {
                int iZzj = 0;
                for (int i9 = 1; iZzj < i9 && i9 <= 64; i9 <<= 2) {
                    if (zzeqVar.zzc() < 4) {
                        i2 = -1;
                        i3 = 0;
                        break;
                    }
                    iZzj = (iZzj << 4) | zzeqVar.zzj(4);
                }
                i2 = iZzj & 3;
                i3 = iZzj < 4 ? iWidth : iZzj >> 2;
                int iMin = Math.min(i3, iWidth - i8);
                if (iMin > 0) {
                    int i10 = i7 + iMin;
                    Arrays.fill(iArr, i7, i10, this.zza[i2]);
                    i8 += iMin;
                    i7 = i10;
                }
            } while (i8 < iWidth);
            i5 += 2;
            if (i5 >= iHeight) {
                return;
            }
            i7 = i5 * iWidth;
            zzeqVar.zzm();
        }
    }

    public final void zza(String str) {
        int i2;
        String strTrim = str.trim();
        String str2 = zzfj.zza;
        for (String str3 : strTrim.split("\\r?\\n", -1)) {
            if (str3.startsWith("palette: ")) {
                String[] strArrSplit = str3.substring(9).split(",", -1);
                this.zzd = new int[strArrSplit.length];
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    int[] iArr = this.zzd;
                    try {
                        i2 = Integer.parseInt(strArrSplit[i3].trim(), 16);
                    } catch (RuntimeException unused) {
                        i2 = 0;
                    }
                    iArr[i3] = i2;
                }
            } else if (str3.startsWith("size: ")) {
                String[] strArrSplit2 = str3.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        this.zze = Integer.parseInt(strArrSplit2[0]);
                        this.zzf = Integer.parseInt(strArrSplit2[1]);
                        this.zzb = true;
                    } catch (RuntimeException e2) {
                        zzee.zzd("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    public final void zzd() {
        this.zzc = false;
        this.zzg = null;
        this.zzh = -1;
        this.zzi = -1;
    }

    public final void zzb(zzer zzerVar) {
        int[] iArr = this.zzd;
        if (iArr == null || !this.zzb) {
            return;
        }
        zzerVar.zzk(zzerVar.zzt() - 2);
        int iZzt = zzerVar.zzt();
        while (zzerVar.zzg() < iZzt && zzerVar.zzd() > 0) {
            switch (zzerVar.zzs()) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                    if (zzerVar.zzd() < 2) {
                        return;
                    }
                    int iZzs = zzerVar.zzs();
                    int iZzs2 = zzerVar.zzs();
                    int[] iArr2 = this.zza;
                    iArr2[3] = zze(iArr, iZzs >> 4);
                    iArr2[2] = zze(iArr, iZzs & 15);
                    iArr2[1] = zze(iArr, iZzs2 >> 4);
                    iArr2[0] = zze(iArr, iZzs2 & 15);
                    this.zzc = true;
                    break;
                case 4:
                    if (zzerVar.zzd() < 2 || !this.zzc) {
                        return;
                    }
                    int iZzs3 = zzerVar.zzs();
                    int iZzs4 = zzerVar.zzs();
                    int[] iArr3 = this.zza;
                    iArr3[3] = zzf(iArr3[3], iZzs3 >> 4);
                    iArr3[2] = zzf(iArr3[2], iZzs3 & 15);
                    iArr3[1] = zzf(iArr3[1], iZzs4 >> 4);
                    iArr3[0] = zzf(iArr3[0], iZzs4 & 15);
                    break;
                case 5:
                    if (zzerVar.zzd() < 6) {
                        return;
                    }
                    int iZzs5 = zzerVar.zzs();
                    int iZzs6 = zzerVar.zzs();
                    int i2 = iZzs6 >> 4;
                    int iZzs7 = ((iZzs6 & 15) << 8) | zzerVar.zzs();
                    int iZzs8 = zzerVar.zzs();
                    int iZzs9 = zzerVar.zzs();
                    this.zzg = new Rect((iZzs5 << 4) | i2, (iZzs8 << 4) | (iZzs9 >> 4), iZzs7 + 1, (((iZzs9 & 15) << 8) | zzerVar.zzs()) + 1);
                    break;
                case 6:
                    if (zzerVar.zzd() < 4) {
                        return;
                    }
                    this.zzh = zzerVar.zzt();
                    this.zzi = zzerVar.zzt();
                    break;
                default:
                    return;
            }
        }
    }

    @Nullable
    public final zzcx zzc(zzer zzerVar) {
        Rect rect;
        if (this.zzd == null || !this.zzb || !this.zzc || (rect = this.zzg) == null || this.zzh == -1 || this.zzi == -1 || rect.width() < 2 || this.zzg.height() < 2) {
            return null;
        }
        Rect rect2 = this.zzg;
        int[] iArr = new int[rect2.width() * rect2.height()];
        zzeq zzeqVar = new zzeq();
        zzerVar.zzh(this.zzh);
        zzeqVar.zza(zzerVar);
        zzg(zzeqVar, true, rect2, iArr);
        zzerVar.zzh(this.zzi);
        zzeqVar.zza(zzerVar);
        zzg(zzeqVar, false, rect2, iArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        zzcw zzcwVar = new zzcw();
        zzcwVar.zzc(bitmapCreateBitmap);
        zzcwVar.zzi(rect2.left / this.zze);
        zzcwVar.zzj(0);
        zzcwVar.zzf(rect2.top / this.zzf, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(rect2.width() / this.zze);
        zzcwVar.zzn(rect2.height() / this.zzf);
        return zzcwVar.zzr();
    }
}

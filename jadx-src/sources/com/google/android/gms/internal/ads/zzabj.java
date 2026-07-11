package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzabj {
    private static final Comparator zza = zzabi.zza;
    private static final Comparator zzb = zzabh.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzabg[] zzd = new zzabg[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i2, float f3) {
        zzabg zzabgVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i3 = this.zzh;
        if (i3 > 0) {
            zzabg[] zzabgVarArr = this.zzd;
            int i5 = i3 - 1;
            this.zzh = i5;
            zzabgVar = zzabgVarArr[i5];
        } else {
            zzabgVar = new zzabg(null);
        }
        int i7 = this.zzf;
        this.zzf = i7 + 1;
        zzabgVar.zza = i7;
        zzabgVar.zzb = i2;
        zzabgVar.zzc = f3;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzabgVar);
        this.zzg += i2;
        while (true) {
            int i8 = this.zzg;
            if (i8 <= 2000) {
                return;
            }
            int i9 = i8 + androidx.media3.common.C.PRIORITY_PROCESSING_FOREGROUND;
            zzabg zzabgVar2 = (zzabg) arrayList.get(0);
            int i10 = zzabgVar2.zzb;
            if (i10 <= i9) {
                this.zzg -= i10;
                arrayList.remove(0);
                int i11 = this.zzh;
                if (i11 < 5) {
                    zzabg[] zzabgVarArr2 = this.zzd;
                    this.zzh = i11 + 1;
                    zzabgVarArr2[i11] = zzabgVar2;
                }
            } else {
                zzabgVar2.zzb = i10 - i9;
                this.zzg -= i9;
            }
        }
    }

    public final float zzc(float f3) {
        int i2 = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f4 = this.zzg;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i2 >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzabg) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f5 = 0.5f * f4;
            zzabg zzabgVar = (zzabg) arrayList.get(i2);
            i3 += zzabgVar.zzb;
            if (i3 >= f5) {
                return zzabgVar.zzc;
            }
            i2++;
        }
    }

    public zzabj(int i2) {
    }
}

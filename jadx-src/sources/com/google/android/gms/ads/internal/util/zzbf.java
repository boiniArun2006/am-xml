package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzbf {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    public final void zza(double d2) {
        this.zze++;
        int i2 = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i2 >= dArr.length) {
                return;
            }
            double d4 = dArr[i2];
            if (d4 <= d2 && d2 < this.zzb[i2]) {
                int[] iArr = this.zzd;
                iArr[i2] = iArr[i2] + 1;
            }
            if (d2 < d4) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final List zzb() {
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            double[] dArr = this.zzc;
            double[] dArr2 = this.zzb;
            int[] iArr = this.zzd;
            double d2 = dArr[i2];
            double d4 = dArr2[i2];
            int i3 = iArr[i2];
            arrayList.add(new zzbd(str, d2, d4, ((double) i3) / ((double) this.zze), i3));
        }
        return arrayList;
    }

    /* synthetic */ zzbf(zzbe zzbeVar, byte[] bArr) {
        int size = zzbeVar.zzd().size();
        this.zza = (String[]) zzbeVar.zzc().toArray(new String[size]);
        this.zzb = zzc(zzbeVar.zzd());
        this.zzc = zzc(zzbeVar.zze());
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = ((Double) list.get(i2)).doubleValue();
        }
        return dArr;
    }
}

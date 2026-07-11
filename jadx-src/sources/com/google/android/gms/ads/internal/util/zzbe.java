package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzbe {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final zzbe zza(String str, double d2, double d4) {
        List list;
        int i2 = 0;
        while (true) {
            list = this.zza;
            if (i2 >= list.size()) {
                break;
            }
            double dDoubleValue = ((Double) this.zzc.get(i2)).doubleValue();
            double dDoubleValue2 = ((Double) this.zzb.get(i2)).doubleValue();
            if (d2 < dDoubleValue || (dDoubleValue == d2 && d4 < dDoubleValue2)) {
                break;
            }
            i2++;
        }
        list.add(i2, str);
        this.zzc.add(i2, Double.valueOf(d2));
        this.zzb.add(i2, Double.valueOf(d4));
        return this;
    }

    final /* synthetic */ List zzc() {
        return this.zza;
    }

    final /* synthetic */ List zzd() {
        return this.zzb;
    }

    final /* synthetic */ List zze() {
        return this.zzc;
    }

    public final zzbf zzb() {
        return new zzbf(this, null);
    }
}

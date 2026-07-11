package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zznz extends zzod {
    zznz() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzod
    public final void zza() {
        if (!zzb()) {
            for (int i2 = 0; i2 < zzc(); i2++) {
                Map.Entry entryZzd = zzd(i2);
                if (((zzlu) ((zzoa) entryZzd).zza()).zzd()) {
                    entryZzd.setValue(Collections.unmodifiableList((List) entryZzd.getValue()));
                }
            }
            for (Map.Entry entry : zze()) {
                if (((zzlu) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}

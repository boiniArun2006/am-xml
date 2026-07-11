package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaiw implements zzao {
    public final List zza;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaiw.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzaiw) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    public zzaiw(List list) {
        this.zza = list;
        boolean z2 = false;
        if (!list.isEmpty()) {
            long j2 = ((zzaiv) list.get(0)).zzb;
            int i2 = 1;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((zzaiv) list.get(i2)).zza < j2) {
                    z2 = true;
                    break;
                } else {
                    j2 = ((zzaiv) list.get(i2)).zzb;
                    i2++;
                }
            }
        }
        zzgrc.zza(!z2);
    }
}

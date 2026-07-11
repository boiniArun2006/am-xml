package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfb extends IllegalStateException {
    public final int zza;
    public final int zzb;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfb.class == obj.getClass()) {
            zzfb zzfbVar = (zzfb) obj;
            if (this.zza == zzfbVar.zza && this.zzb == zzfbVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza + 527) * 31) + this.zzb;
    }

    public zzfb(int i2, int i3) {
        String string;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 46);
            sb.append("Player stuck buffering and not loading for ");
            sb.append(i3);
            sb.append(" ms");
            string = sb.toString();
        } else if (i2 == 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 47);
            sb2.append("Player stuck buffering with no progress for ");
            sb2.append(i3);
            sb2.append(" ms");
            string = sb2.toString();
        } else if (i2 == 2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 45);
            sb3.append("Player stuck playing with no progress for ");
            sb3.append(i3);
            sb3.append(" ms");
            string = sb3.toString();
        } else if (i2 != 3) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(i3).length() + 31);
            sb4.append("Player stuck suppressed for ");
            sb4.append(i3);
            sb4.append(" ms");
            string = sb4.toString();
        } else {
            StringBuilder sb5 = new StringBuilder(String.valueOf(i3).length() + 43);
            sb5.append("Player stuck playing without ending for ");
            sb5.append(i3);
            sb5.append(" ms");
            string = sb5.toString();
        }
        super(string);
        this.zza = i2;
        this.zzb = i3;
    }
}

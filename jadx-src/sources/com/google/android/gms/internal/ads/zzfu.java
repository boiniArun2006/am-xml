package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfu extends zzfw {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfu(int i2, long j2) {
        super(i2, null);
        this.zza = j2;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzfw
    public final String toString() {
        List list = this.zzb;
        String strZze = zzfw.zze(this.zzd);
        String string = Arrays.toString(list.toArray());
        String string2 = Arrays.toString(this.zzc.toArray());
        int length = strZze.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        sb.append(strZze);
        sb.append(" leaves: ");
        sb.append(string);
        sb.append(" containers: ");
        sb.append(string2);
        return sb.toString();
    }

    public final void zza(zzfv zzfvVar) {
        this.zzb.add(zzfvVar);
    }

    public final void zzb(zzfu zzfuVar) {
        this.zzc.add(zzfuVar);
    }

    @Nullable
    public final zzfv zzc(int i2) {
        List list = this.zzb;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzfv zzfvVar = (zzfv) list.get(i3);
            if (zzfvVar.zzd == i2) {
                return zzfvVar;
            }
        }
        return null;
    }

    @Nullable
    public final zzfu zzd(int i2) {
        List list = this.zzc;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzfu zzfuVar = (zzfu) list.get(i3);
            if (zzfuVar.zzd == i2) {
                return zzfuVar;
            }
        }
        return null;
    }
}

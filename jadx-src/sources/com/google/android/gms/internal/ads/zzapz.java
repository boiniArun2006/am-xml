package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzapz {
    public final int zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public final int zza() {
        int i2 = this.zzc;
        if (i2 != 2) {
            return i2 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public zzapz(int i2, @Nullable String str, int i3, @Nullable List list, byte[] bArr) {
        List listUnmodifiableList;
        this.zza = i2;
        this.zzb = str;
        this.zzc = i3;
        if (list == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.zzd = listUnmodifiableList;
        this.zze = bArr;
    }
}

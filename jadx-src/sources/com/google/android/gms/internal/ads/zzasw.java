package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzasw {
    private final int zza;
    private final List zzb;
    private final int zzc;

    @Nullable
    private final InputStream zzd;

    public zzasw(int i2, List list, int i3, InputStream inputStream) {
        this.zza = i2;
        this.zzb = list;
        this.zzc = i3;
        this.zzd = inputStream;
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzc;
    }

    @Nullable
    public final InputStream zzd() {
        InputStream inputStream = this.zzd;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List zzb() {
        return Collections.unmodifiableList(this.zzb);
    }
}

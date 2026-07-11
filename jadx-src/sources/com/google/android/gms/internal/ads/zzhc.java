package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class zzhc extends IOException {
    public final int zza;

    public zzhc(int i2) {
        this.zza = i2;
    }

    public zzhc(@Nullable String str, int i2) {
        super(str);
        this.zza = i2;
    }

    public zzhc(@Nullable String str, @Nullable Throwable th, int i2) {
        super(str, th);
        this.zza = i2;
    }

    public zzhc(@Nullable Throwable th, int i2) {
        super(th);
        this.zza = i2;
    }
}

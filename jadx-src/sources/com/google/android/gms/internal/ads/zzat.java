package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class zzat extends IOException {
    public final boolean zza;
    public final int zzb;

    public static zzat zza(@Nullable String str, @Nullable Throwable th) {
        return new zzat(str, th, true, 0);
    }

    public static zzat zzb(@Nullable String str, @Nullable Throwable th) {
        return new zzat(str, th, true, 1);
    }

    public static zzat zzc(@Nullable String str) {
        return new zzat(str, null, false, 1);
    }

    protected zzat(@Nullable String str, @Nullable Throwable th, boolean z2, int i2) {
        super(str, th);
        this.zza = z2;
        this.zzb = i2;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String strConcat;
        String message = super.getMessage();
        if (message != null) {
            strConcat = message.concat(" ");
        } else {
            strConcat = "";
        }
        boolean z2 = this.zza;
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(strConcat.length() + 20 + String.valueOf(z2).length() + 11 + String.valueOf(i2).length() + 1);
        sb.append(strConcat);
        sb.append("{contentIsMalformed=");
        sb.append(z2);
        sb.append(", dataType=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzhs extends zzhq {
    public final int zzc;

    public zzhs(int i2, @Nullable String str, @Nullable IOException iOException, Map map, zzhf zzhfVar, byte[] bArr) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
        sb.append("Response code: ");
        sb.append(i2);
        super(sb.toString(), iOException, zzhfVar, 2004, 1);
        this.zzc = i2;
    }
}

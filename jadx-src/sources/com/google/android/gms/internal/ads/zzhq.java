package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class zzhq extends zzhc {
    public final int zzb;

    public zzhq(zzhf zzhfVar, int i2, int i3) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    private static int zzb(int i2, int i3) {
        return i2 == 2000 ? i3 != 1 ? 2000 : 2001 : i2;
    }

    public zzhq(IOException iOException, zzhf zzhfVar, int i2, int i3) {
        super(iOException, zzb(i2, i3));
        this.zzb = i3;
    }

    public zzhq(String str, zzhf zzhfVar, int i2, int i3) {
        super(str, zzb(i2, i3));
        this.zzb = i3;
    }

    public static zzhq zza(IOException iOException, zzhf zzhfVar, int i2) {
        int i3;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i3 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i3 = 1004;
        } else if (message != null && zzgql.zza(message).matches("cleartext.*not permitted.*")) {
            i3 = 2007;
        } else {
            i3 = 2001;
        }
        if (i3 == 2007) {
            return new zzhp(iOException, zzhfVar);
        }
        return new zzhq(iOException, zzhfVar, i3, i2);
    }

    public zzhq(String str, @Nullable IOException iOException, zzhf zzhfVar, int i2, int i3) {
        super(str, iOException, zzb(i2, i3));
        this.zzb = i3;
    }
}

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhkh {
    public static final zzhye zza = zzhye.zza(new byte[0]);

    public static final zzhye zza(int i2) {
        return zzhye.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i2).array());
    }

    public static final zzhye zzb(int i2) {
        return zzhye.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i2).array());
    }
}

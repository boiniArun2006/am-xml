package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzapi extends zzaeg {
    public zzapi(zzfg zzfgVar, long j2, long j3) {
        super(new zzaeb(), new zzaph(zzfgVar, null), j2, 0L, j2 + 1, 0L, j3, 188L, 1000);
    }

    static /* synthetic */ int zzh(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & UByte.MAX_VALUE) | ((bArr[i2] & UByte.MAX_VALUE) << 24) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 8);
    }
}

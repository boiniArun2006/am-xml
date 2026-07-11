package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class zzieo {
    zzieo() {
    }

    final boolean zza(byte[] bArr, int i2, int i3) {
        return zzb(0, bArr, i2, i3) == 0;
    }

    protected abstract int zzb(int i2, byte[] bArr, int i3, int i5);

    protected static final int zzc(String str, byte[] bArr, int i2, int i3) {
        byte[] bytes = str.getBytes(zzice.zza);
        int length = bytes.length;
        if (length - i2 > i3) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i2, length);
        return i2 + length;
    }
}

package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbeo extends zzbeg {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final byte[] zza(String str) {
        synchronized (this.zza) {
            try {
                MessageDigest messageDigestZzb = zzb();
                this.zzb = messageDigestZzb;
                if (messageDigestZzb == null) {
                    return new byte[0];
                }
                messageDigestZzb.reset();
                this.zzb.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = this.zzb.digest();
                int length = bArrDigest.length;
                int i2 = this.zzc;
                if (length > i2) {
                    length = i2;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i3 = this.zzd & 7;
                if (i3 > 0) {
                    long j2 = 0;
                    for (int i5 = 0; i5 < length; i5++) {
                        if (i5 > 0) {
                            j2 <<= 8;
                        }
                        j2 += (long) (bArr[i5] & UByte.MAX_VALUE);
                    }
                    long j3 = j2 >>> (8 - i3);
                    while (true) {
                        i2--;
                        if (i2 < 0) {
                            break;
                        }
                        bArr[i2] = (byte) (255 & j3);
                        j3 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzbeo(int i2) {
        int i3 = i2 >> 3;
        this.zzc = (i2 & 7) > 0 ? i3 + 1 : i3;
        this.zzd = i2;
    }
}

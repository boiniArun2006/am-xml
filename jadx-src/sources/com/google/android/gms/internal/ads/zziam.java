package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zziam extends OutputStream {
    private static final byte[] zza = new byte[0];
    private int zzd;
    private int zzf;
    private final int zzb = 128;
    private final ArrayList zzc = new ArrayList();
    private byte[] zze = new byte[128];

    @Override // java.io.OutputStream
    public final synchronized void write(int i2) {
        try {
            if (this.zzf == this.zze.length) {
                zzc(1);
            }
            byte[] bArr = this.zze;
            int i3 = this.zzf;
            this.zzf = i3 + 1;
            bArr[i3] = (byte) i2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzian zza() {
        try {
            int i2 = this.zzf;
            byte[] bArr = this.zze;
            if (i2 >= bArr.length) {
                this.zzc.add(new zzial(this.zze));
                this.zze = zza;
            } else if (i2 > 0) {
                this.zzc.add(new zzial(Arrays.copyOf(bArr, i2)));
            }
            this.zzd += this.zzf;
            this.zzf = 0;
        } catch (Throwable th) {
            throw th;
        }
        return zzian.zzw(this.zzc);
    }

    public final synchronized int zzb() {
        return this.zzd + this.zzf;
    }

    private final void zzc(int i2) {
        this.zzc.add(new zzial(this.zze));
        int length = this.zzd + this.zze.length;
        this.zzd = length;
        this.zze = new byte[Math.max(this.zzb, Math.max(i2, length >>> 1))];
        this.zzf = 0;
    }

    zziam(int i2) {
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzb()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.zze;
        int length = bArr2.length;
        int i5 = this.zzf;
        int i7 = length - i5;
        if (i3 <= i7) {
            System.arraycopy(bArr, i2, bArr2, i5, i3);
            this.zzf += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i5, i7);
        int i8 = i3 - i7;
        zzc(i8);
        System.arraycopy(bArr, i2 + i7, this.zze, 0, i8);
        this.zzf = i8;
    }
}

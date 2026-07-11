package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zziat extends zziaw {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zziat(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i3;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzH(int i2, int i3) throws IOException {
        zzs((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzI(int i2, int i3) throws IOException {
        zzs(i2 << 3);
        zzr(i3);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzJ(int i2, int i3) throws IOException {
        zzs(i2 << 3);
        zzs(i3);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzK(int i2, int i3) throws IOException {
        zzs((i2 << 3) | 5);
        zzt(i3);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzL(int i2, long j2) throws IOException {
        zzs(i2 << 3);
        zzu(j2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzh(int i2, long j2) throws IOException {
        zzs((i2 << 3) | 1);
        zzv(j2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzi(int i2, boolean z2) throws IOException {
        zzs(i2 << 3);
        zzq(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzj(int i2, String str) throws IOException {
        zzs((i2 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzk(int i2, zzian zzianVar) throws IOException {
        zzs((i2 << 3) | 2);
        zzl(zzianVar);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzn(int i2, zzidc zzidcVar) throws IOException {
        zzs(11);
        zzJ(2, i2);
        zzs(26);
        zzp(zzidcVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzo(int i2, zzian zzianVar) throws IOException {
        zzs(11);
        zzJ(2, i2);
        zzk(3, zzianVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzq(byte b2) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.zzc;
        try {
            int i3 = i2 + 1;
            try {
                this.zza[i2] = b2;
                this.zzc = i3;
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                i2 = i3;
                throw new zziau(i2, this.zzb, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e3) {
            indexOutOfBoundsException = e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzr(int i2) throws IOException {
        if (i2 >= 0) {
            zzs(i2);
        } else {
            zzu(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzs(int i2) throws IOException {
        int i3;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i5 = this.zzc;
        while ((i2 & (-128)) != 0) {
            try {
                i3 = i5 + 1;
                try {
                    this.zza[i5] = (byte) (i2 | 128);
                    i2 >>>= 7;
                    i5 = i3;
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i5 = i3;
                    throw new zziau(i5, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                throw new zziau(i5, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i3 = i5 + 1;
        this.zza[i5] = (byte) i2;
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzt(int i2) throws IOException {
        int i3 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i3] = (byte) i2;
            bArr[i3 + 1] = (byte) (i2 >> 8);
            bArr[i3 + 2] = (byte) (i2 >> 16);
            bArr[i3 + 3] = (byte) (i2 >> 24);
            this.zzc = i3 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new zziau(i3, this.zzb, 4, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzv(long j2) throws IOException {
        int i2 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i2] = (byte) j2;
            bArr[i2 + 1] = (byte) (j2 >> 8);
            bArr[i2 + 2] = (byte) (j2 >> 16);
            bArr[i2 + 3] = (byte) (j2 >> 24);
            bArr[i2 + 4] = (byte) (j2 >> 32);
            bArr[i2 + 5] = (byte) (j2 >> 40);
            bArr[i2 + 6] = (byte) (j2 >> 48);
            bArr[i2 + 7] = (byte) (j2 >> 56);
            this.zzc = i2 + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new zziau(i2, this.zzb, 8, e2);
        }
    }

    public final void zzw(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, i2, this.zza, this.zzc, i3);
            this.zzc += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zziau(this.zzc, this.zzb, i3, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzx(String str) throws IOException {
        int i2 = this.zzc;
        try {
            int iZzA = zziaw.zzA(str.length() * 3);
            int iZzA2 = zziaw.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzs(zzier.zzc(str));
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = zzier.zzd(str, bArr, i3, this.zzb - i3);
                return;
            }
            int i5 = i2 + iZzA2;
            this.zzc = i5;
            int iZzd = zzier.zzd(str, this.zza, i5, this.zzb - i5);
            this.zzc = i2;
            zzs((iZzd - i2) - iZzA2);
            this.zzc = iZzd;
        } catch (IndexOutOfBoundsException e2) {
            throw new zziau(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziae
    public final void zza(byte[] bArr, int i2, int i3) throws IOException {
        zzw(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzl(zzian zzianVar) throws IOException {
        zzs(zzianVar.zzc());
        zzianVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzm(byte[] bArr, int i2, int i3) throws IOException {
        zzs(i3);
        zzw(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzp(zzidc zzidcVar) throws IOException {
        zzs(zzidcVar.zzbr());
        zzidcVar.zzcX(this);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzu(long j2) throws IOException {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z2 = zziaw.zza;
        int i3 = this.zzc;
        if (z2 && this.zzb - i3 >= 10) {
            while ((j2 & (-128)) != 0) {
                zziem.zzp(this.zza, i3, (byte) (((int) j2) | 128));
                j2 >>>= 7;
                i3++;
            }
            i2 = i3 + 1;
            zziem.zzp(this.zza, i3, (byte) j2);
        } else {
            while ((j2 & (-128)) != 0) {
                try {
                    int i5 = i3 + 1;
                    try {
                        this.zza[i3] = (byte) (((int) j2) | 128);
                        j2 >>>= 7;
                        i3 = i5;
                    } catch (IndexOutOfBoundsException e2) {
                        indexOutOfBoundsException = e2;
                        i3 = i5;
                        throw new zziau(i3, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    indexOutOfBoundsException = e3;
                }
            }
            i2 = i3 + 1;
            try {
                this.zza[i3] = (byte) j2;
            } catch (IndexOutOfBoundsException e4) {
                indexOutOfBoundsException = e4;
                i3 = i2;
                throw new zziau(i3, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        this.zzc = i2;
    }
}

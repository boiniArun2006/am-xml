package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzlj extends zzll {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzlj(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzw(byte[] bArr, int i2, int i3) throws IOException {
        zzv(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final int zzy() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zza(int i2, int i3) throws IOException {
        zzr((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzb(int i2, int i3) throws IOException {
        zzr(i2 << 3);
        zzq(i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzc(int i2, int i3) throws IOException {
        zzr(i2 << 3);
        zzr(i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzd(int i2, int i3) throws IOException {
        zzr((i2 << 3) | 5);
        zzs(i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zze(int i2, long j2) throws IOException {
        zzr(i2 << 3);
        zzt(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzf(int i2, long j2) throws IOException {
        zzr((i2 << 3) | 1);
        zzu(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzg(int i2, boolean z2) throws IOException {
        zzr(i2 << 3);
        zzp(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzh(int i2, String str) throws IOException {
        zzr((i2 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzi(int i2, zzlg zzlgVar) throws IOException {
        zzr((i2 << 3) | 2);
        zzj(zzlgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    final void zzl(int i2, zznl zznlVar, zznw zznwVar) throws IOException {
        zzr((i2 << 3) | 2);
        zzr(((zzkr) zznlVar).zzcd(zznwVar));
        zznwVar.zzf(zznlVar, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzm(int i2, zznl zznlVar) throws IOException {
        zzr(11);
        zzc(2, i2);
        zzr(26);
        zzo(zznlVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzn(int i2, zzlg zzlgVar) throws IOException {
        zzr(11);
        zzc(2, i2);
        zzi(3, zzlgVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzp(byte b2) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.zze;
        try {
            int i3 = i2 + 1;
            try {
                this.zzc[i2] = b2;
                this.zze = i3;
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                i2 = i3;
                throw new zzlk(i2, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e3) {
            indexOutOfBoundsException = e3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzq(int i2) throws IOException {
        if (i2 >= 0) {
            zzr(i2);
        } else {
            zzt(i2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzr(int i2) throws IOException {
        int i3;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i5 = this.zze;
        while ((i2 & (-128)) != 0) {
            try {
                i3 = i5 + 1;
                try {
                    this.zzc[i5] = (byte) (i2 | 128);
                    i2 >>>= 7;
                    i5 = i3;
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i5 = i3;
                    throw new zzlk(i5, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                throw new zzlk(i5, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i3 = i5 + 1;
        this.zzc[i5] = (byte) i2;
        this.zze = i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzs(int i2) throws IOException {
        int i3 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i3] = (byte) i2;
            bArr[i3 + 1] = (byte) (i2 >> 8);
            bArr[i3 + 2] = (byte) (i2 >> 16);
            bArr[i3 + 3] = (byte) (i2 >> 24);
            this.zze = i3 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzlk(i3, this.zzd, 4, e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzu(long j2) throws IOException {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) j2;
            bArr[i2 + 1] = (byte) (j2 >> 8);
            bArr[i2 + 2] = (byte) (j2 >> 16);
            bArr[i2 + 3] = (byte) (j2 >> 24);
            bArr[i2 + 4] = (byte) (j2 >> 32);
            bArr[i2 + 5] = (byte) (j2 >> 40);
            bArr[i2 + 6] = (byte) (j2 >> 48);
            bArr[i2 + 7] = (byte) (j2 >> 56);
            this.zze = i2 + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzlk(i2, this.zzd, 8, e2);
        }
    }

    public final void zzv(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i3);
            this.zze += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzlk(this.zze, this.zzd, i3, e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzx(String str) throws IOException {
        int i2 = this.zze;
        try {
            int iZzz = zzll.zzz(str.length() * 3);
            int iZzz2 = zzll.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzr(zzor.zzb(str));
                byte[] bArr = this.zzc;
                int i3 = this.zze;
                this.zze = zzor.zzc(str, bArr, i3, this.zzd - i3);
                return;
            }
            int i5 = i2 + iZzz2;
            this.zze = i5;
            int iZzc = zzor.zzc(str, this.zzc, i5, this.zzd - i5);
            this.zze = i2;
            zzr((iZzc - i2) - iZzz2);
            this.zze = iZzc;
        } catch (zzoq e2) {
            this.zze = i2;
            zzF(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzlk(e3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzj(zzlg zzlgVar) throws IOException {
        zzr(zzlgVar.zzc());
        zzlgVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzk(byte[] bArr, int i2, int i3) throws IOException {
        zzr(i3);
        zzv(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzo(zznl zznlVar) throws IOException {
        zzr(zznlVar.zzcn());
        zznlVar.zzcB(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzt(long j2) throws IOException {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z2 = zzll.zzd;
        int i3 = this.zze;
        if (z2 && this.zzd - i3 >= 10) {
            while ((j2 & (-128)) != 0) {
                zzoo.zzp(this.zzc, i3, (byte) (((int) j2) | 128));
                j2 >>>= 7;
                i3++;
            }
            i2 = i3 + 1;
            zzoo.zzp(this.zzc, i3, (byte) j2);
        } else {
            while ((j2 & (-128)) != 0) {
                try {
                    int i5 = i3 + 1;
                    try {
                        this.zzc[i3] = (byte) (((int) j2) | 128);
                        j2 >>>= 7;
                        i3 = i5;
                    } catch (IndexOutOfBoundsException e2) {
                        indexOutOfBoundsException = e2;
                        i3 = i5;
                        throw new zzlk(i3, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    indexOutOfBoundsException = e3;
                }
            }
            i2 = i3 + 1;
            try {
                this.zzc[i3] = (byte) j2;
            } catch (IndexOutOfBoundsException e4) {
                indexOutOfBoundsException = e4;
                i3 = i2;
                throw new zzlk(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        this.zze = i2;
    }
}

package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzlk extends zzln {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zzlk(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i3;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzl(byte[] bArr, int i2, int i3) throws IOException {
        zzc(bArr, 0, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzb(byte b2) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            this.zzd = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    public final void zzc(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i3);
            this.zzd += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i3)), e2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzd(int i2, boolean z2) throws IOException {
        zzt(i2 << 3);
        zzb(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zze(int i2, zzle zzleVar) throws IOException {
        zzt((i2 << 3) | 2);
        zzt(zzleVar.zzd());
        zzleVar.zzh(this);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzf(int i2, int i3) throws IOException {
        zzt((i2 << 3) | 5);
        zzg(i3);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzg(int i2) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i3 = this.zzd;
            int i5 = i3 + 1;
            this.zzd = i5;
            bArr[i3] = (byte) (i2 & 255);
            int i7 = i3 + 2;
            this.zzd = i7;
            bArr[i5] = (byte) ((i2 >> 8) & 255);
            int i8 = i3 + 3;
            this.zzd = i8;
            bArr[i7] = (byte) ((i2 >> 16) & 255);
            this.zzd = i3 + 4;
            bArr[i8] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzh(int i2, long j2) throws IOException {
        zzt((i2 << 3) | 1);
        zzi(j2);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzi(long j2) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            int i3 = i2 + 1;
            this.zzd = i3;
            bArr[i2] = (byte) (((int) j2) & 255);
            int i5 = i2 + 2;
            this.zzd = i5;
            bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
            int i7 = i2 + 3;
            this.zzd = i7;
            bArr[i5] = (byte) (((int) (j2 >> 16)) & 255);
            int i8 = i2 + 4;
            this.zzd = i8;
            bArr[i7] = (byte) (((int) (j2 >> 24)) & 255);
            int i9 = i2 + 5;
            this.zzd = i9;
            bArr[i8] = (byte) (((int) (j2 >> 32)) & 255);
            int i10 = i2 + 6;
            this.zzd = i10;
            bArr[i9] = (byte) (((int) (j2 >> 40)) & 255);
            int i11 = i2 + 7;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j2 >> 48)) & 255);
            this.zzd = i2 + 8;
            bArr[i11] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzj(int i2, int i3) throws IOException {
        zzt(i2 << 3);
        zzk(i3);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzk(int i2) throws IOException {
        if (i2 >= 0) {
            zzt(i2);
        } else {
            zzv(i2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    final void zzm(int i2, zzoi zzoiVar, zzow zzowVar) throws IOException {
        zzt((i2 << 3) | 2);
        zzt(((zzko) zzoiVar).zza(zzowVar));
        zzowVar.zzj(zzoiVar, this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzn(int i2, zzoi zzoiVar) throws IOException {
        zzt(11);
        zzs(2, i2);
        zzt(26);
        zzt(zzoiVar.zzo());
        zzoiVar.zze(this);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzo(int i2, zzle zzleVar) throws IOException {
        zzt(11);
        zzs(2, i2);
        zze(3, zzleVar);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzp(int i2, String str) throws IOException {
        zzt((i2 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) throws IOException {
        int i2 = this.zzd;
        try {
            int iZzA = zzln.zzA(str.length() * 3);
            int iZzA2 = zzln.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzt(zzpv.zzc(str));
                byte[] bArr = this.zzb;
                int i3 = this.zzd;
                this.zzd = zzpv.zzb(str, bArr, i3, this.zzc - i3);
                return;
            }
            int i5 = i2 + iZzA2;
            this.zzd = i5;
            int iZzb = zzpv.zzb(str, this.zzb, i5, this.zzc - i5);
            this.zzd = i2;
            zzt((iZzb - i2) - iZzA2);
            this.zzd = iZzb;
        } catch (zzpu e2) {
            this.zzd = i2;
            zzD(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzll(e3);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzr(int i2, int i3) throws IOException {
        zzt((i2 << 3) | i3);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzs(int i2, int i3) throws IOException {
        zzt(i2 << 3);
        zzt(i3);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzt(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i3 = this.zzd;
                this.zzd = i3 + 1;
                bArr[i3] = (byte) ((i2 | 128) & 255);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
            }
        }
        byte[] bArr2 = this.zzb;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        bArr2[i5] = (byte) i2;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzu(int i2, long j2) throws IOException {
        zzt(i2 << 3);
        zzv(j2);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzv(long j2) throws IOException {
        if (!zzln.zzc || this.zzc - this.zzd < 10) {
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i2 = this.zzd;
                    this.zzd = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) | 128) & 255);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
                }
            }
            byte[] bArr2 = this.zzb;
            int i3 = this.zzd;
            this.zzd = i3 + 1;
            bArr2[i3] = (byte) j2;
            return;
        }
        while (true) {
            int i5 = (int) j2;
            if ((j2 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i7 = this.zzd;
                this.zzd = i7 + 1;
                zzps.zzn(bArr3, i7, (byte) i5);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i8 = this.zzd;
            this.zzd = i8 + 1;
            zzps.zzn(bArr4, i8, (byte) ((i5 | 128) & 255));
            j2 >>>= 7;
        }
    }
}

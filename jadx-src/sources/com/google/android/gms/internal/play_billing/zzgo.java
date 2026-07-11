package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgo extends zzgr {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zzgo(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzl(byte[] bArr, int i2, int i3) throws IOException {
        zzc(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzb(byte b2) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.zzd;
        try {
            int i3 = i2 + 1;
            try {
                this.zzb[i2] = b2;
                this.zzd = i3;
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                i2 = i3;
                throw new zzgp(i2, this.zzc, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e3) {
            indexOutOfBoundsException = e3;
        }
    }

    public final void zzc(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i3);
            this.zzd += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgp(this.zzd, this.zzc, i3, e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzd(int i2, boolean z2) throws IOException {
        zzt(i2 << 3);
        zzb(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zze(int i2, zzgk zzgkVar) throws IOException {
        zzt((i2 << 3) | 2);
        zzt(zzgkVar.zzd());
        zzgkVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzf(int i2, int i3) throws IOException {
        zzt((i2 << 3) | 5);
        zzg(i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzg(int i2) throws IOException {
        int i3 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i3] = (byte) (i2 & 255);
            bArr[i3 + 1] = (byte) ((i2 >> 8) & 255);
            bArr[i3 + 2] = (byte) ((i2 >> 16) & 255);
            bArr[i3 + 3] = (byte) ((i2 >> 24) & 255);
            this.zzd = i3 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgp(i3, this.zzc, 4, e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzh(int i2, long j2) throws IOException {
        zzt((i2 << 3) | 1);
        zzi(j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzi(long j2) throws IOException {
        int i2 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i2] = (byte) (((int) j2) & 255);
            bArr[i2 + 1] = (byte) (((int) (j2 >> 8)) & 255);
            bArr[i2 + 2] = (byte) (((int) (j2 >> 16)) & 255);
            bArr[i2 + 3] = (byte) (((int) (j2 >> 24)) & 255);
            bArr[i2 + 4] = (byte) (((int) (j2 >> 32)) & 255);
            bArr[i2 + 5] = (byte) (((int) (j2 >> 40)) & 255);
            bArr[i2 + 6] = (byte) (((int) (j2 >> 48)) & 255);
            bArr[i2 + 7] = (byte) (((int) (j2 >> 56)) & 255);
            this.zzd = i2 + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgp(i2, this.zzc, 8, e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzj(int i2, int i3) throws IOException {
        zzt(i2 << 3);
        zzk(i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzk(int i2) throws IOException {
        if (i2 >= 0) {
            zzt(i2);
        } else {
            zzv(i2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    final void zzm(int i2, zzim zzimVar, zzix zzixVar) throws IOException {
        zzt((i2 << 3) | 2);
        zzt(((zzfv) zzimVar).zze(zzixVar));
        zzixVar.zzi(zzimVar, this.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzn(int i2, zzim zzimVar) throws IOException {
        zzt(11);
        zzs(2, i2);
        zzt(26);
        zzt(zzimVar.zzk());
        zzimVar.zzJ(this);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzo(int i2, zzgk zzgkVar) throws IOException {
        zzt(11);
        zzs(2, i2);
        zze(3, zzgkVar);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzp(int i2, String str) throws IOException {
        zzt((i2 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) throws IOException {
        int i2 = this.zzd;
        try {
            int iZzz = zzgr.zzz(str.length() * 3);
            int iZzz2 = zzgr.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzt(zzjt.zzc(str));
                byte[] bArr = this.zzb;
                int i3 = this.zzd;
                this.zzd = zzjt.zzb(str, bArr, i3, this.zzc - i3);
                return;
            }
            int i5 = i2 + iZzz2;
            this.zzd = i5;
            int iZzb = zzjt.zzb(str, this.zzb, i5, this.zzc - i5);
            this.zzd = i2;
            zzt((iZzb - i2) - iZzz2);
            this.zzd = iZzb;
        } catch (zzjs e2) {
            this.zzd = i2;
            zzC(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzgp(e3);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzr(int i2, int i3) throws IOException {
        zzt((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzs(int i2, int i3) throws IOException {
        zzt(i2 << 3);
        zzt(i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzt(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i3 = this.zzd;
                this.zzd = i3 + 1;
                bArr[i3] = (byte) ((i2 | 128) & 255);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzgp(this.zzd, this.zzc, 1, e2);
            }
        }
        byte[] bArr2 = this.zzb;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        bArr2[i5] = (byte) i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzu(int i2, long j2) throws IOException {
        zzt(i2 << 3);
        zzv(j2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzv(long j2) throws IOException {
        if (!zzgr.zzc || this.zzc - this.zzd < 10) {
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i2 = this.zzd;
                    this.zzd = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) | 128) & 255);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzgp(this.zzd, this.zzc, 1, e2);
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
                zzjq.zzn(bArr3, i7, (byte) i5);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i8 = this.zzd;
            this.zzd = i8 + 1;
            zzjq.zzn(bArr4, i8, (byte) ((i5 | 128) & 255));
            j2 >>>= 7;
        }
    }
}

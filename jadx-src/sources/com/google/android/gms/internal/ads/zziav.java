package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zziav extends zzias {
    private final OutputStream zzg;

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzs(int i2) throws IOException {
        zzF(5);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzt(int i2) throws IOException {
        zzF(4);
        zzf(i2);
    }

    private final void zzF(int i2) throws IOException {
        if (this.zzb - this.zzc < i2) {
            zzG();
        }
    }

    private final void zzG() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzH(int i2, int i3) throws IOException {
        zzs((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzI(int i2, int i3) throws IOException {
        zzF(20);
        zzd(i2 << 3);
        if (i3 >= 0) {
            zzd(i3);
        } else {
            zze(i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzJ(int i2, int i3) throws IOException {
        zzF(20);
        zzd(i2 << 3);
        zzd(i3);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzK(int i2, int i3) throws IOException {
        zzF(14);
        zzd((i2 << 3) | 5);
        zzf(i3);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzL(int i2, long j2) throws IOException {
        zzF(20);
        zzd(i2 << 3);
        zze(j2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzh(int i2, long j2) throws IOException {
        zzF(18);
        zzd((i2 << 3) | 1);
        zzg(j2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzi(int i2, boolean z2) throws IOException {
        zzF(11);
        zzd(i2 << 3);
        zzc(z2 ? (byte) 1 : (byte) 0);
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
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b2);
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
    public final void zzu(long j2) throws IOException {
        zzF(10);
        zze(j2);
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzv(long j2) throws IOException {
        zzF(8);
        zzg(j2);
    }

    public final void zzw(byte[] bArr, int i2, int i3) throws IOException {
        int i5 = this.zzb;
        int i7 = this.zzc;
        int i8 = i5 - i7;
        if (i8 >= i3) {
            System.arraycopy(bArr, i2, this.zza, i7, i3);
            this.zzc += i3;
            this.zzd += i3;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, i2, bArr2, i7, i8);
        int i9 = i2 + i8;
        this.zzc = i5;
        this.zzd += i8;
        zzG();
        int i10 = i3 - i8;
        if (i10 <= i5) {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.zzc = i10;
        } else {
            this.zzg.write(bArr, i9, i10);
        }
        this.zzd += i10;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final void zzy() throws IOException {
        if (this.zzc > 0) {
            zzG();
        }
    }

    zziav(OutputStream outputStream, int i2) {
        super(i2);
        if (outputStream != null) {
            this.zzg = outputStream;
            return;
        }
        throw new NullPointerException("out");
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
    public final void zzx(String str) throws IOException {
        int iZzc;
        int length = str.length() * 3;
        int iZzA = zziaw.zzA(length);
        int i2 = iZzA + length;
        int i3 = this.zzb;
        if (i2 > i3) {
            byte[] bArr = new byte[length];
            int iZzd = zzier.zzd(str, bArr, 0, length);
            zzs(iZzd);
            zzw(bArr, 0, iZzd);
            return;
        }
        if (i2 > i3 - this.zzc) {
            zzG();
        }
        int iZzA2 = zziaw.zzA(str.length());
        int i5 = this.zzc;
        try {
            if (iZzA2 == iZzA) {
                int i7 = i5 + iZzA2;
                this.zzc = i7;
                int iZzd2 = zzier.zzd(str, this.zza, i7, i3 - i7);
                this.zzc = i5;
                iZzc = (iZzd2 - i5) - iZzA2;
                zzd(iZzc);
                this.zzc = iZzd2;
            } else {
                iZzc = zzier.zzc(str);
                zzd(iZzc);
                this.zzc = zzier.zzd(str, this.zza, this.zzc, iZzc);
            }
            this.zzd += iZzc;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new zziau(e2);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzael implements zzaev {
    private final zzj zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    public zzael(zzj zzjVar, long j2, long j3) {
        this.zzb = zzjVar;
        this.zzd = j2;
        this.zzc = j3;
    }

    private final void zzu(int i2) {
        if (i2 != -1) {
            this.zzd += (long) i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final void zzc(byte[] bArr, int i2, int i3) throws IOException {
        zzb(bArr, i2, i3, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final int zzd(int i2) throws IOException {
        int iZzq = zzq(1);
        if (iZzq == 0) {
            iZzq = zzt(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzu(iZzq);
        return iZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final void zzf(int i2) throws IOException {
        zze(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final void zzi(byte[] bArr, int i2, int i3) throws IOException {
        zzh(bArr, i2, i3, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final void zzk(int i2) throws IOException {
        zzj(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final void zzl() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final long zzm() {
        return this.zzd + ((long) this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final long zzn() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final long zzo() {
        return this.zzc;
    }

    static {
        zzal.zzb("media3.extractor");
    }

    private final void zzp(int i2) {
        int i3 = this.zzf + i2;
        int length = this.zze.length;
        if (i3 > length) {
            String str = zzfj.zza;
            this.zze = Arrays.copyOf(this.zze, Math.max(65536 + i3, Math.min(length + length, i3 + 524288)));
        }
    }

    private final int zzq(int i2) {
        int iMin = Math.min(this.zzg, i2);
        zzs(iMin);
        return iMin;
    }

    private final int zzr(byte[] bArr, int i2, int i3) {
        int i5 = this.zzg;
        if (i5 == 0) {
            return 0;
        }
        int iMin = Math.min(i5, i3);
        System.arraycopy(this.zze, 0, bArr, i2, iMin);
        zzs(iMin);
        return iMin;
    }

    private final void zzs(int i2) {
        int i3 = this.zzg - i2;
        this.zzg = i3;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i3 < bArr.length + (-524288) ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.zze = bArr2;
    }

    private final int zzt(byte[] bArr, int i2, int i3, int i5, boolean z2) throws IOException {
        if (!Thread.interrupted()) {
            int iZza = this.zzb.zza(bArr, i2 + i5, i3 - i5);
            if (iZza == -1) {
                if (i5 == 0 && z2) {
                    return -1;
                }
                throw new EOFException();
            }
            return i5 + iZza;
        }
        throw new InterruptedIOException();
    }

    @Override // com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) throws IOException {
        int iZzr = zzr(bArr, i2, i3);
        if (iZzr == 0) {
            iZzr = zzt(bArr, i2, i3, 0, true);
        }
        zzu(iZzr);
        return iZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final boolean zzb(byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        int iZzr = zzr(bArr, i2, i3);
        while (iZzr < i3 && iZzr != -1) {
            iZzr = zzt(bArr, i2, i3, iZzr, z2);
        }
        zzu(iZzr);
        if (iZzr != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final boolean zze(int i2, boolean z2) throws IOException {
        int iZzq = zzq(i2);
        while (iZzq < i2 && iZzq != -1) {
            iZzq = zzt(this.zza, -iZzq, Math.min(i2, iZzq + 4096), iZzq, z2);
        }
        zzu(iZzq);
        if (iZzq != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final int zzg(byte[] bArr, int i2, int i3) throws IOException {
        zzael zzaelVar;
        int iMin;
        zzp(i3);
        int i5 = this.zzg;
        int i7 = this.zzf;
        int i8 = i5 - i7;
        if (i8 == 0) {
            zzaelVar = this;
            iMin = zzaelVar.zzt(this.zze, i7, i3, 0, true);
            if (iMin == -1) {
                return -1;
            }
            zzaelVar.zzg += iMin;
        } else {
            zzaelVar = this;
            iMin = Math.min(i3, i8);
        }
        System.arraycopy(zzaelVar.zze, zzaelVar.zzf, bArr, i2, iMin);
        zzaelVar.zzf += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final boolean zzh(byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        if (!zzj(i3, z2)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i3, bArr, i2, i3);
        return true;
    }

    public final boolean zzj(int i2, boolean z2) throws IOException {
        zzp(i2);
        int iZzt = this.zzg - this.zzf;
        while (iZzt < i2) {
            int i3 = i2;
            boolean z3 = z2;
            iZzt = zzt(this.zze, this.zzf, i3, iZzt, z3);
            if (iZzt == -1) {
                return false;
            }
            this.zzg = this.zzf + iZzt;
            i2 = i3;
            z2 = z3;
        }
        this.zzf += i2;
        return true;
    }
}

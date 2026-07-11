package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class zzlc extends zzlb {
    protected final byte[] zza;

    zzlc(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzle) || zzd() != ((zzle) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzlc)) {
            return obj.equals(this);
        }
        zzlc zzlcVar = (zzlc) obj;
        int iZzj = zzj();
        int iZzj2 = zzlcVar.zzj();
        if (iZzj != 0 && iZzj2 != 0 && iZzj != iZzj2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzlcVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzlcVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzlcVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlcVar.zza;
        zzlcVar.zzc();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iZzd) {
            if (bArr[i2] != bArr2[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public byte zza(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.recaptcha.internal.zzle
    byte zzb(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.recaptcha.internal.zzle
    protected void zze(byte[] bArr, int i2, int i3, int i5) {
        System.arraycopy(this.zza, 0, bArr, 0, i5);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    protected final int zzf(int i2, int i3, int i5) {
        return zznl.zzb(i2, this.zza, 0, i5);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final zzle zzg(int i2, int i3) {
        int iZzi = zzle.zzi(0, i3, zzd());
        if (iZzi == 0) {
            return zzle.zzb;
        }
        return new zzkz(this.zza, 0, iZzi);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    final void zzh(zzkw zzkwVar) throws IOException {
        ((zzlk) zzkwVar).zzc(this.zza, 0, zzd());
    }
}

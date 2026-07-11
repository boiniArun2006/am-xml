package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class zzajw extends zzajx {
    protected final byte[] zzb;

    zzajw(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzajp) || zzb() != ((zzajp) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzajw)) {
            return obj.equals(this);
        }
        zzajw zzajwVar = (zzajw) obj;
        int iZza = zza();
        int iZza2 = zzajwVar.zza();
        if (iZza == 0 || iZza2 == 0 || iZza == iZza2) {
            return zza(zzajwVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public byte zza(int i2) {
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    byte zzb(int i2) {
        return this.zzb[i2];
    }

    protected int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final zzajp zza(int i2, int i3) {
        int iZza = zzajp.zza(0, i3, zzb());
        return iZza == 0 ? zzajp.zza : new zzajt(this.zzb, zze(), iZza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    protected final int zzb(int i2, int i3, int i5) {
        return zzalb.zza(i2, this.zzb, zze(), i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public final zzakb zzc() {
        return zzakb.zza(this.zzb, zze(), zzb(), true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    protected void zza(byte[] bArr, int i2, int i3, int i5) {
        System.arraycopy(this.zzb, 0, bArr, 0, i5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp
    final void zza(zzajm zzajmVar) throws IOException {
        zzajmVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajx
    final boolean zza(zzajp zzajpVar, int i2, int i3) {
        if (i3 <= zzajpVar.zzb()) {
            if (i3 <= zzajpVar.zzb()) {
                if (zzajpVar instanceof zzajw) {
                    zzajw zzajwVar = (zzajw) zzajpVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzajwVar.zzb;
                    int iZze = zze() + i3;
                    int iZze2 = zze();
                    int iZze3 = zzajwVar.zze();
                    while (iZze2 < iZze) {
                        if (bArr[iZze2] != bArr2[iZze3]) {
                            return false;
                        }
                        iZze2++;
                        iZze3++;
                    }
                    return true;
                }
                return zzajpVar.zza(0, i3).equals(zza(0, i3));
            }
            throw new IllegalArgumentException("Ran off end of other: 0, " + i3 + ", " + zzajpVar.zzb());
        }
        throw new IllegalArgumentException("Length too large: " + i3 + zzb());
    }
}

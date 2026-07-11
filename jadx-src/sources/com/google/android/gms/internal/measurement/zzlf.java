package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class zzlf extends zzle {
    protected final byte[] zza;

    zzlf(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlg) || zzc() != ((zzlg) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzlf)) {
            return obj.equals(this);
        }
        zzlf zzlfVar = (zzlf) obj;
        int iZzi = zzi();
        int iZzi2 = zzlfVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzc = zzc();
        if (iZzc > zzlfVar.zzc()) {
            int iZzc2 = zzc();
            StringBuilder sb = new StringBuilder(String.valueOf(iZzc).length() + 18 + String.valueOf(iZzc2).length());
            sb.append("Length too large: ");
            sb.append(iZzc);
            sb.append(iZzc2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (iZzc > zzlfVar.zzc()) {
            int iZzc3 = zzlfVar.zzc();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 27 + String.valueOf(iZzc3).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(iZzc);
            sb2.append(", ");
            sb2.append(iZzc3);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlfVar.zza;
        zzlfVar.zzd();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iZzc) {
            if (bArr[i2] != bArr2[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public int zzc() {
        return this.zza.length;
    }

    protected int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public byte zza(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    byte zzb(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    protected final int zzg(int i2, int i3, int i5) {
        return zzmo.zzc(i2, this.zza, 0, i5);
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final zzlg zze(int i2, int i3) {
        int iZzj = zzlg.zzj(0, i3, zzc());
        if (iZzj == 0) {
            return zzlg.zzb;
        }
        return new zzlb(this.zza, 0, iZzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    final void zzf(zzky zzkyVar) throws IOException {
        ((zzlj) zzkyVar).zzv(this.zza, 0, zzc());
    }
}

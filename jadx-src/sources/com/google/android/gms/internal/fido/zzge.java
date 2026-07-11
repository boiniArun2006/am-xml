package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class zzge extends zzgf {
    private volatile zzgf zza;
    final zzgb zzb;
    final Character zzc;

    zzge(zzgb zzgbVar, Character ch) {
        this.zzb = zzgbVar;
        if (ch != null && zzgbVar.zzc('=')) {
            throw new IllegalArgumentException(zzbo.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzc = ch;
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    void zzb(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        int i5 = 0;
        zzbm.zze(0, i3, bArr.length);
        while (i5 < i3) {
            zze(appendable, bArr, i5, Math.min(this.zzb.zzd, i3 - i5));
            i5 += this.zzb.zzd;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzge) {
            zzge zzgeVar = (zzge) obj;
            if (this.zzb.equals(zzgeVar.zzb) && Objects.equals(this.zzc, zzgeVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    zzgf zza(zzgb zzgbVar, Character ch) {
        return new zzge(zzgbVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    final int zzc(int i2) {
        zzgb zzgbVar = this.zzb;
        return zzgbVar.zzc * zzgh.zza(i2, zzgbVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    public final zzgf zzd() {
        zzgf zzgfVarZza = this.zza;
        if (zzgfVarZza == null) {
            zzgb zzgbVar = this.zzb;
            zzgb zzgbVarZzb = zzgbVar.zzb();
            zzgfVarZza = zzgbVarZzb == zzgbVar ? this : zza(zzgbVarZzb, this.zzc);
            this.zza = zzgfVarZza;
        }
        return zzgfVarZza;
    }

    final void zze(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        zzbm.zze(i2, i2 + i3, bArr.length);
        int i5 = 0;
        zzbm.zzc(i3 <= this.zzb.zzd);
        long j2 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            j2 = (j2 | ((long) (bArr[i2 + i7] & UByte.MAX_VALUE))) << 8;
        }
        int i8 = (i3 + 1) * 8;
        zzgb zzgbVar = this.zzb;
        while (i5 < i3 * 8) {
            long j3 = j2 >>> ((i8 - zzgbVar.zzb) - i5);
            zzgb zzgbVar2 = this.zzb;
            appendable.append(zzgbVar2.zza(((int) j3) & zzgbVar2.zza));
            i5 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i5 < this.zzb.zzd * 8) {
                this.zzc.getClass();
                appendable.append('=');
                i5 += this.zzb.zzb;
            }
        }
    }

    zzge(String str, String str2, Character ch) {
        this(new zzgb(str, str2.toCharArray()), ch);
    }
}

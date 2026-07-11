package com.google.android.gms.internal.fido;

import java.io.Serializable;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzfs extends zzft implements Serializable {
    final byte[] zza;

    @Override // com.google.android.gms.internal.fido.zzft
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    final byte[] zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(zzbo.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i2 = bArr[0] & UByte.MAX_VALUE;
        int i3 = bArr[1] & UByte.MAX_VALUE;
        int i5 = bArr[2] & UByte.MAX_VALUE;
        return ((bArr[3] & UByte.MAX_VALUE) << 24) | i2 | (i3 << 8) | (i5 << 16);
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    zzfs(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    final boolean zzc(zzft zzftVar) {
        boolean z2;
        if (this.zza.length != zzftVar.zze().length) {
            return false;
        }
        boolean z3 = true;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i2 < bArr.length) {
                if (bArr[i2] == zzftVar.zze()[i2]) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 &= z2;
                i2++;
            } else {
                return z3;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzafp {
    private final zzer zza = new zzer(10);

    private final boolean zzb(zzaev zzaevVar, int i2) throws IOException {
        int i3;
        int i5 = 0;
        do {
            int i7 = i5 % 10;
            if (i7 == 0) {
                if (i5 != 0) {
                    zzer zzerVar = this.zza;
                    System.arraycopy(zzerVar.zzi(), 10, zzerVar.zzi(), 0, 9);
                }
                i3 = 0;
            } else {
                i3 = i7;
            }
            int i8 = i5 != 0 ? 1 : 10;
            try {
                zzer zzerVar2 = this.zza;
                int i9 = i7 + 10;
                zzaevVar.zzi(zzerVar2.zzi(), i9 - i8, i8);
                zzerVar2.zzh(i3);
                zzerVar2.zzf(i9);
                if (zzerVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzafs.zza(zzerVar2.zzr()) != -1) {
                    return false;
                }
                if (i5 == 0) {
                    zzerVar2.zzc(20);
                }
                i5++;
            } catch (EOFException unused) {
            }
        } while (i5 <= i2);
        return false;
    }

    @Nullable
    public final zzap zza(zzaev zzaevVar, @Nullable zzaij zzaijVar, int i2) throws IOException {
        zzap zzapVarZza = null;
        int i3 = 0;
        while (zzb(zzaevVar, i2)) {
            zzer zzerVar = this.zza;
            int iZzg = zzerVar.zzg();
            zzerVar.zzk(6);
            int iZzG = zzerVar.zzG();
            int i5 = iZzG + 10;
            if (zzapVarZza == null) {
                byte[] bArr = new byte[i5];
                System.arraycopy(zzerVar.zzi(), iZzg, bArr, 0, 10);
                zzaevVar.zzi(bArr, 10, iZzG);
                zzapVarZza = zzaim.zza(bArr, i5, zzaijVar, new zzahw());
            } else {
                zzaevVar.zzk(iZzG);
            }
            i3 += i5;
        }
        zzaevVar.zzl();
        zzaevVar.zzk(i3);
        return zzapVarZza;
    }
}

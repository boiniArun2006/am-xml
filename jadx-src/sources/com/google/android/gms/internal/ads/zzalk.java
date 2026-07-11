package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzalk extends zzalt {

    @Nullable
    private zzafh zza;

    @Nullable
    private zzalj zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    zzalk() {
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final void zza(boolean z2) {
        super.zza(z2);
        if (z2) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final long zzb(zzer zzerVar) {
        if (zzd(zzerVar.zzi())) {
            int i2 = (zzerVar.zzi()[2] & UByte.MAX_VALUE) >> 4;
            if (i2 != 6) {
                if (i2 == 7) {
                    i2 = 7;
                    zzerVar.zzk(4);
                    zzerVar.zzO();
                }
            } else {
                zzerVar.zzk(4);
                zzerVar.zzO();
            }
            int iZzc = zzafc.zzc(zzerVar, i2);
            zzerVar.zzh(0);
            return iZzc;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final boolean zzc(zzer zzerVar, long j2, zzalr zzalrVar) {
        byte[] bArrZzi = zzerVar.zzi();
        zzafh zzafhVar = this.zza;
        if (zzafhVar == null) {
            zzafh zzafhVar2 = new zzafh(bArrZzi, 17);
            this.zza = zzafhVar2;
            zzt zztVarZza = zzafhVar2.zzc(Arrays.copyOfRange(bArrZzi, 9, zzerVar.zze()), null).zza();
            zztVarZza.zzl("audio/ogg");
            zzalrVar.zza = zztVarZza.zzM();
            return true;
        }
        if ((bArrZzi[0] & ByteCompanionObject.MAX_VALUE) == 3) {
            zzafg zzafgVarZzc = zzafe.zzc(zzerVar);
            zzafh zzafhVarZze = zzafhVar.zze(zzafgVarZzc);
            this.zza = zzafhVarZze;
            this.zzb = new zzalj(zzafhVarZze, zzafgVarZzc);
            return true;
        }
        if (!zzd(bArrZzi)) {
            return true;
        }
        zzalj zzaljVar = this.zzb;
        if (zzaljVar != null) {
            zzaljVar.zzd(j2);
            zzalrVar.zzb = this.zzb;
        }
        zzalrVar.zza.getClass();
        return false;
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzavb {
    public final zzatw zza;
    public final zzaux zzb;
    public final zzauu zzc;
    public final zzaup zzd;

    public zzavb(zzatw zzatwVar, zzaux zzauxVar, zzaup zzaupVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        this.zza = zzatwVar;
        this.zzb = zzauxVar;
        this.zzd = zzaupVar;
        this.zzc = new zzauu((i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9)) ^ (i11 % 454333378));
    }

    public final Optional zza() {
        zzatq zzatqVar;
        try {
            ArrayDeque arrayDeque = this.zzc.zza;
            if (arrayDeque.isEmpty()) {
                throw new zzaut();
            }
            zzaur zzaurVar = (zzaur) arrayDeque.pop();
            long j2 = zzaurVar.zza;
            long j3 = zzaurVar.zzb;
            long j4 = zzaurVar.zzc;
            zzaux zzauxVar = this.zzb;
            if (zzauxVar.zzb < j3) {
                return Optional.of(zzatq.zzG);
            }
            this.zzd.zza(j2);
            if (j4 == 0) {
                while (zzauxVar.zzb > j3) {
                    zzauxVar.zzc();
                }
            }
            return Optional.empty();
        } catch (zzaun e2) {
            e = e2;
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzauo e3) {
            e = e3;
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzaut unused) {
            zzatqVar = zzatq.zzw;
            return Optional.of(zzatqVar);
        } catch (zzauv unused2) {
            zzatqVar = zzatq.zzG;
            return Optional.of(zzatqVar);
        }
    }
}

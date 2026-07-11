package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class zzano<T, B> {
    private static volatile int zza = 100;

    zzano() {
    }

    abstract int zza(T t3);

    abstract B zza();

    abstract T zza(T t3, T t4);

    abstract void zza(B b2, int i2, int i3);

    abstract void zza(B b2, int i2, long j2);

    abstract void zza(B b2, int i2, zzajp zzajpVar);

    abstract void zza(B b2, int i2, T t3);

    abstract void zza(T t3, zzaof zzaofVar) throws IOException;

    abstract boolean zza(zzams zzamsVar);

    final boolean zza(B b2, zzams zzamsVar, int i2) throws IOException {
        int iZzd = zzamsVar.zzd();
        int i3 = iZzd >>> 3;
        int i5 = iZzd & 7;
        if (i5 == 0) {
            zzb(b2, i3, zzamsVar.zzl());
            return true;
        }
        if (i5 == 1) {
            zza(b2, i3, zzamsVar.zzk());
            return true;
        }
        if (i5 == 2) {
            zza((Object) b2, i3, zzamsVar.zzp());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                if (i2 != 0) {
                    return false;
                }
                throw zzalf.zzb();
            }
            if (i5 != 5) {
                throw zzalf.zza();
            }
            zza((Object) b2, i3, zzamsVar.zzf());
            return true;
        }
        B bZza = zza();
        int i7 = 4 | (i3 << 3);
        int i8 = i2 + 1;
        if (i8 >= zza) {
            throw zzalf.zzh();
        }
        while (zzamsVar.zzc() != Integer.MAX_VALUE && zza(bZza, zzamsVar, i8)) {
        }
        if (i7 != zzamsVar.zzd()) {
            throw zzalf.zzb();
        }
        zza(b2, i3, zze(bZza));
        return true;
    }

    abstract int zzb(T t3);

    abstract void zzb(B b2, int i2, long j2);

    abstract void zzb(T t3, zzaof zzaofVar) throws IOException;

    abstract void zzb(Object obj, B b2);

    abstract B zzc(Object obj);

    abstract void zzc(Object obj, T t3);

    abstract T zzd(Object obj);

    abstract T zze(B b2);

    abstract void zzf(Object obj);
}

package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgyt extends zzgyr {
    private zzgyt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    final void zza(zzgyu zzgyuVar, Set set, Set set2) {
        synchronized (zzgyuVar) {
            try {
                if (zzgyuVar.seenExceptionsField == null) {
                    zzgyuVar.seenExceptionsField = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    final int zzb(zzgyu zzgyuVar) {
        int i2;
        synchronized (zzgyuVar) {
            i2 = zzgyuVar.remainingField - 1;
            zzgyuVar.remainingField = i2;
        }
        return i2;
    }

    /* synthetic */ zzgyt(byte[] bArr) {
        super(null);
    }
}

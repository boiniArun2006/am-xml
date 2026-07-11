package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzamt implements zzama {
    private final zzamc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzama
    public final zzamc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzama
    public final zzamo zzb() {
        int i2 = this.zzd;
        return (i2 & 1) != 0 ? zzamo.PROTO2 : (i2 & 4) == 4 ? zzamo.EDITIONS : zzamo.PROTO3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzama
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }

    zzamt(zzamc zzamcVar, String str, Object[] objArr) {
        this.zza = zzamcVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        int i5 = 1;
        while (true) {
            int i7 = i5 + 1;
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 >= 55296) {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i5 = i7;
            } else {
                this.zzd = i2 | (cCharAt2 << i3);
                return;
            }
        }
    }
}

package com.google.android.gms.common;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzv {
    private String zza = null;

    @Nullable
    private Boolean zzb = null;

    @Nullable
    private Boolean zzc = null;

    private zzv() {
    }

    final zzv zza(String str) {
        this.zza = str;
        return this;
    }

    /* synthetic */ zzv(byte[] bArr) {
    }

    final zzw zzd() {
        Boolean bool = this.zzb;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.zzc != null) {
            return new zzw(this.zza, bool.booleanValue(), false, false, this.zzc.booleanValue(), false, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }

    final zzv zzb(boolean z2) {
        this.zzb = Boolean.valueOf(z2);
        return this;
    }

    final zzv zzc(boolean z2) {
        this.zzc = Boolean.valueOf(z2);
        return this;
    }
}

package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzayx implements zzfwx {
    final /* synthetic */ zzfvc zza;

    zzayx(zzayz zzayzVar, zzfvc zzfvcVar) {
        this.zza = zzfvcVar;
        Objects.requireNonNull(zzayzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfwx
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}

package com.google.android.gms.internal.fido;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzep extends zzev {
    private static final zzep zza = new zzep(zzev.zze());
    private final AtomicReference zzb;

    public static final zzep zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.fido.zzev
    public final zzdr zza() {
        return ((zzev) this.zzb.get()).zza();
    }

    @Override // com.google.android.gms.internal.fido.zzev
    public final zzfi zzc() {
        return ((zzev) this.zzb.get()).zzc();
    }

    @Override // com.google.android.gms.internal.fido.zzev
    public final boolean zzd(String str, Level level, boolean z2) {
        ((zzev) this.zzb.get()).zzd(str, level, z2);
        return false;
    }

    zzep(zzev zzevVar) {
        this.zzb = new AtomicReference(zzevVar);
    }
}

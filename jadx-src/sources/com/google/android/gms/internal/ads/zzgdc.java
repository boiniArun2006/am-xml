package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgdc {
    private final ExecutorService zza;

    public zzgdc(ExecutorService executorService) {
        this.zza = executorService;
    }

    public final zzgct zza(File file, zzidc zzidcVar, Function function) {
        return new zzgdb(file, this.zza, new zzgcz(zzidcVar), function);
    }

    public final zzgct zzb(File file, byte[] bArr, Function function) {
        return new zzgdb(file, this.zza, new zzgcv(bArr), function);
    }
}

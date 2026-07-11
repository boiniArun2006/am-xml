package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgp extends IOException {
    zzgp() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzgp(long j2, long j3, int i2, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i2))), th);
    }

    zzgp(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}

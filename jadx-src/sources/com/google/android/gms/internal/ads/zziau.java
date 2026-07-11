package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zziau extends IOException {
    zziau() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zziau(long j2, long j3, int i2, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i2))), th);
    }

    zziau(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}

package com.google.android.gms.internal.ads;

import ep.oxM.esLNYym;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzgxi implements Closeable {
    private static final zzgxh zzc = zzgxh.zza;
    private final Deque zza = new ArrayDeque(4);
    private Throwable zzb;

    public static zzgxi zza() {
        return new zzgxi(zzc);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Throwable th = this.zzb;
        while (true) {
            Deque deque = this.zza;
            if (deque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        zzgxg.zza.logp(Level.WARNING, "com.google.common.io.Closer", esLNYym.cKJUnbncIDAb, "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th2);
                    }
                }
            }
        }
        if (this.zzb != null || th == null) {
            return;
        }
        zzgrz.zza(th, IOException.class);
        zzgrz.zzb(th);
        throw new AssertionError(th);
    }

    public final Closeable zzb(Closeable closeable) {
        this.zza.addFirst(closeable);
        return closeable;
    }

    public final RuntimeException zzc(Throwable th) throws Throwable {
        this.zzb = th;
        zzgrz.zza(th, IOException.class);
        zzgrz.zzb(th);
        throw new RuntimeException(th);
    }

    zzgxi(zzgxh zzgxhVar) {
    }
}

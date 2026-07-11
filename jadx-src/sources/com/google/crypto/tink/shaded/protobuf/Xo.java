package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Q;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Xo {
    static final Xo nr = new Xo(true);
    private static boolean rl = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile Xo f59935t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f59936n = Collections.EMPTY_MAP;

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f59937n;
        private final int rl;

        public boolean equals(Object obj) {
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f59937n == jVar.f59937n && this.rl == jVar.rl;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f59937n) * 65535) + this.rl;
        }

        j(Object obj, int i2) {
            this.f59937n = obj;
            this.rl = i2;
        }
    }

    public static Xo rl() {
        Xo xoN;
        Xo xo = f59935t;
        if (xo != null) {
            return xo;
        }
        synchronized (Xo.class) {
            try {
                xoN = f59935t;
                if (xoN == null) {
                    xoN = rl ? Pl.n() : nr;
                    f59935t = xoN;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xoN;
    }

    public Q.w6 n(rv6 rv6Var, int i2) {
        android.support.v4.media.j.n(this.f59936n.get(new j(rv6Var, i2)));
        return null;
    }

    Xo(boolean z2) {
    }
}

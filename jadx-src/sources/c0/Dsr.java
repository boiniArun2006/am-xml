package c0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f43455n;
    private final Xo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final eQ.fuX f43456t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dsr)) {
            return false;
        }
        Dsr dsr = (Dsr) obj;
        return this.rl.equals(this.f43455n, dsr.f43455n) && Intrinsics.areEqual(this.f43456t, dsr.f43456t);
    }

    public int hashCode() {
        return (this.rl.hashCode(this.f43455n) * 31) + this.f43456t.hashCode();
    }

    public final eQ.fuX n() {
        return this.f43456t;
    }

    public final Object rl() {
        return this.f43455n;
    }

    public final Xo t() {
        return this.rl;
    }

    public Dsr(Object obj, Xo xo, eQ.fuX fux) {
        this.f43455n = obj;
        this.rl = xo;
        this.f43456t = fux;
    }
}

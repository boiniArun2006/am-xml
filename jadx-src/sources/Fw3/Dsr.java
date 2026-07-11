package Fw3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f3225n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f3224t = new j(null);
    private static final Dsr nr = new Dsr(0, 0);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final Dsr n() {
            return Dsr.nr;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dsr)) {
            return false;
        }
        Dsr dsr = (Dsr) obj;
        return this.f3225n == dsr.f3225n && this.rl == dsr.rl;
    }

    public int hashCode() {
        return (Long.hashCode(this.f3225n) * 31) + Integer.hashCode(this.rl);
    }

    public final long rl() {
        return this.f3225n;
    }

    public final int t() {
        return this.rl;
    }

    public String toString() {
        return "SystemResourceAmount(memory=" + this.f3225n + ", videoDecoders=" + this.rl + ')';
    }

    public Dsr(long j2, int i2) {
        this.f3225n = j2;
        this.rl = i2;
        LRC.j.t(j2, "memory");
        LRC.j.t(j2, "videoDecoders");
    }
}

package uOq;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g9s f74402n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f74403t;

    private z(Class cls, int i2, int i3) {
        this(g9s.rl(cls), i2, i3);
    }

    private z(g9s g9sVar, int i2, int i3) {
        this.f74402n = (g9s) ci.t(g9sVar, "Null dependency anInterface.");
        this.rl = i2;
        this.f74403t = i3;
    }

    public static z KN(Class cls) {
        return new z(cls, 0, 0);
    }

    public static z az(g9s g9sVar) {
        return new z(g9sVar, 1, 1);
    }

    public static z gh(g9s g9sVar) {
        return new z(g9sVar, 1, 0);
    }

    public static z mUb(Class cls) {
        return new z(cls, 1, 0);
    }

    public static z n(Class cls) {
        return new z(cls, 0, 2);
    }

    public static z qie(Class cls) {
        return new z(cls, 1, 1);
    }

    private static String rl(int i2) {
        if (i2 == 0) {
            return DevicePublicKeyStringDef.DIRECT;
        }
        if (i2 == 1) {
            return "provider";
        }
        if (i2 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i2);
    }

    public static z ty(Class cls) {
        return new z(cls, 2, 0);
    }

    public static z xMQ(Class cls) {
        return new z(cls, 0, 1);
    }

    public boolean J2() {
        return this.rl == 1;
    }

    public boolean O() {
        return this.f74403t == 0;
    }

    public boolean Uo() {
        return this.rl == 2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f74402n.equals(zVar.f74402n) && this.rl == zVar.rl && this.f74403t == zVar.f74403t) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f74402n.hashCode() ^ 1000003) * 1000003) ^ this.rl) * 1000003) ^ this.f74403t;
    }

    public boolean nr() {
        return this.f74403t == 2;
    }

    public g9s t() {
        return this.f74402n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f74402n);
        sb.append(", type=");
        int i2 = this.rl;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(rl(this.f74403t));
        sb.append("}");
        return sb.toString();
    }
}

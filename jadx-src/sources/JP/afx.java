package JP;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class afx {
    private static final AtomicLong nr = new AtomicLong();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f4535n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f4536t;

    static long O() {
        return nr.incrementAndGet();
    }

    public static afx rl(String str, String str2) {
        return new afx(str, str2, O());
    }

    private static String t(Class cls) {
        String simpleName = ((Class) t1.Xo.ck(cls, "type")).getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    public String J2() {
        return this.f4535n + "<" + this.f4536t + ">";
    }

    public long nr() {
        return this.f4536t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(J2());
        if (this.rl != null) {
            sb.append(": (");
            sb.append(this.rl);
            sb.append(')');
        }
        return sb.toString();
    }

    afx(String str, String str2, long j2) {
        t1.Xo.ck(str, "typeName");
        t1.Xo.O(!str.isEmpty(), "empty type");
        this.f4535n = str;
        this.rl = str2;
        this.f4536t = j2;
    }

    public static afx n(Class cls, String str) {
        return rl(t(cls), str);
    }
}

package bq4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 bq4.j, still in use, count: 1, list:
  (r0v0 bq4.j) from 0x002e: FILLED_NEW_ARRAY (r1v1 bq4.j), (r0v0 bq4.j), (r3v2 bq4.j), (r2v1 bq4.j) A[WRAPPED] (LINE:49) elemType: bq4.j
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final j[] f43381o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f43384n;

    static {
        f43381o = new j[]{jVar, new j(1), jVar, new j(3)};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f43380Z.clone();
    }

    public int rl() {
        return this.f43384n;
    }

    private j(int i2) {
        this.f43384n = i2;
    }
}

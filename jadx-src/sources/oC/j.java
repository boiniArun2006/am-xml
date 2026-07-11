package oC;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 oC.j, still in use, count: 1, list:
  (r0v0 oC.j) from 0x0018: SPUT (r0v0 oC.j) (LINE:26) oC.j.t oC.j
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
    AAC;


    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final j f71367t = new j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1078j f71366n = new C1078j(null);

    /* JADX INFO: renamed from: oC.j$j, reason: collision with other inner class name */
    public static final class C1078j {
        public /* synthetic */ C1078j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1078j() {
        }
    }

    static {
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) J2.clone();
    }

    private j() {
    }
}

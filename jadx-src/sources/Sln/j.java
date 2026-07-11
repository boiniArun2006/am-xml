package Sln;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 Sln.j, still in use, count: 1, list:
  (r0v0 Sln.j) from 0x0018: SPUT (r0v0 Sln.j) (LINE:26) Sln.j.t Sln.j
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
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {
    AAC;


    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final j f9925t = new j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0341j f9924n = new C0341j(null);

    /* JADX INFO: renamed from: Sln.j$j, reason: collision with other inner class name */
    public static final class C0341j {
        public /* synthetic */ C0341j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0341j() {
        }

        public final j n() {
            return j.f9925t;
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

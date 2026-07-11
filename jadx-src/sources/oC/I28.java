package oC;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 oC.I28, still in use, count: 1, list:
  (r0v0 oC.I28) from 0x0022: SPUT (r0v0 oC.I28) (LINE:36) oC.I28.t oC.I28
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
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class I28 {
    AVC,
    H265;


    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final I28 f71361t = new I28();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f71359n = new j(null);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final I28 n() {
            return I28.f71361t;
        }
    }

    static {
    }

    public static I28 valueOf(String str) {
        return (I28) Enum.valueOf(I28.class, str);
    }

    public static I28[] values() {
        return (I28[]) f71360r.clone();
    }

    private I28() {
    }
}

package EJn;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Pl {

    public static final class j extends Pl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f2280n = new j();

        private j() {
            super(null);
        }
    }

    public static final class n extends Pl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f2281n = new n();

        private n() {
            super(null);
        }
    }

    public /* synthetic */ Pl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Pl() {
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        Intrinsics.checkNotNull(simpleName);
        return simpleName;
    }
}

package ScC;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import fb.AbstractC2109j;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0319j f9792n = C0319j.rl;

    /* JADX INFO: renamed from: ScC.j$j, reason: collision with other inner class name */
    public static final class C0319j extends AbstractC2109j {
        static final /* synthetic */ C0319j rl = new C0319j();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static Function2 f9793t;

        public final Function2 rl() {
            Function2 function2 = f9793t;
            if (function2 != null) {
                return function2;
            }
            Intrinsics.throwUninitializedPropertyAccessException("trackEvent");
            return null;
        }

        private C0319j() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class n {
        private static final /* synthetic */ n[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f9796r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f9795n = new n("APP_OPEN", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f9797t = new n(BrandSafetyUtils.f61445k, 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f9794O = new n("INTERSTITIAL", 2);

        static {
            n[] nVarArrN = n();
            J2 = nVarArrN;
            f9796r = EnumEntriesKt.enumEntries(nVarArrN);
        }

        private static final /* synthetic */ n[] n() {
            return new n[]{f9795n, f9797t, f9794O};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) J2.clone();
        }

        private n(String str, int i2) {
        }
    }
}

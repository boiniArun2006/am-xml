package TX;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 {
    private static final /* synthetic */ w6[] J2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f10513n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f10514r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final w6 f10515t = new w6("V_4_0", 0);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final w6 f10512O = new w6("V_5_0", 1);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final w6 n(String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            if (Intrinsics.areEqual(version, "4.0")) {
                return w6.f10515t;
            }
            if (Intrinsics.areEqual(version, "5.0")) {
                return w6.f10512O;
            }
            return null;
        }
    }

    static {
        w6[] w6VarArrN = n();
        J2 = w6VarArrN;
        f10514r = EnumEntriesKt.enumEntries(w6VarArrN);
        f10513n = new j(null);
    }

    private static final /* synthetic */ w6[] n() {
        return new w6[]{f10515t, f10512O};
    }

    public static w6 valueOf(String str) {
        return (w6) Enum.valueOf(w6.class, str);
    }

    public static w6[] values() {
        return (w6[]) J2.clone();
    }

    private w6(String str, int i2) {
    }
}

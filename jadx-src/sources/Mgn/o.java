package Mgn;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class o {
    private static final /* synthetic */ EnumEntries E2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final o[] f6652O;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ o[] f6655g;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f6658t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f6659n;
    public static final o J2 = new o("SRC_SINC_BEST_QUALITY", 0, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o f6657r = new o("SRC_SINC_MEDIUM_QUALITY", 1, 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o f6656o = new o("SRC_SINC_FASTEST", 2, 2);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final o f6654Z = new o("SRC_ZERO_ORDER_HOLD", 3, 3);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final o f6653S = new o("SRC_LINEAR", 4, 4);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static {
        o[] oVarArrN = n();
        f6655g = oVarArrN;
        E2 = EnumEntriesKt.enumEntries(oVarArrN);
        f6658t = new j(null);
        f6652O = values();
    }

    private static final /* synthetic */ o[] n() {
        return new o[]{J2, f6657r, f6656o, f6654Z, f6653S};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f6655g.clone();
    }

    private o(String str, int i2, int i3) {
        this.f6659n = i3;
    }
}

package cg;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class o {
    public static final CN3 nr = new CN3(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f43810n;
    private final C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f43811t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class C {
        private static final /* synthetic */ C[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f43814r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C f43813n = new C("ALIGHT_MOTION_PRO_SUBSCRIPTION", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final C f43815t = new C("AMAZON_GIFT_CARD", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final C f43812O = new C("TOKOPEDIA_GIFT_CARD", 2);

        static {
            C[] cArrN = n();
            J2 = cArrN;
            f43814r = EnumEntriesKt.enumEntries(cArrN);
        }

        private static final /* synthetic */ C[] n() {
            return new C[]{f43813n, f43815t, f43812O};
        }

        public static C valueOf(String str) {
            return (C) Enum.valueOf(C.class, str);
        }

        public static C[] values() {
            return (C[]) J2.clone();
        }

        private C(String str, int i2) {
        }
    }

    public static final class CN3 {
        public /* synthetic */ CN3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[fuX.values().length];
                try {
                    iArr[fuX.f43823t.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fuX.f43816O.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[fuX.J2.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[fuX.f43822r.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[fuX.f43821o.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[fuX.f43818Z.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[fuX.f43817S.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[fuX.f43820g.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private CN3() {
        }

        private final o n(fuX fux, Long l2) {
            switch (j.$EnumSwitchMapping$0[fux.ordinal()]) {
                case 1:
                    return new n(l2);
                case 2:
                    return new j(l2);
                case 3:
                    return new w6(l2);
                case 4:
                    return new Ml(l2);
                case 5:
                    return new I28(l2);
                case 6:
                    return new Wre(l2);
                case 7:
                    return new Dsr(l2);
                case 8:
                    return new aC(l2);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final o rl(String id, Long l2) {
            fuX fux;
            Intrinsics.checkNotNullParameter(id, "id");
            fuX[] fuxArrValues = fuX.values();
            int length = fuxArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    fux = null;
                    break;
                }
                fux = fuxArrValues[i2];
                if (Intrinsics.areEqual(fux.rl(), id)) {
                    break;
                }
                i2++;
            }
            if (fux != null) {
                return o.nr.n(fux, l2);
            }
            return null;
        }
    }

    public static final class Dsr extends o {
        public Dsr(Long l2) {
            super(fuX.f43817S, C.f43812O, l2 != null ? l2.longValue() : 4500L, null);
        }
    }

    public static final class I28 extends o {
        public I28(Long l2) {
            super(fuX.f43821o, C.f43815t, l2 != null ? l2.longValue() : 5000L, null);
        }
    }

    public static final class Ml extends o {
        public Ml(Long l2) {
            super(fuX.f43822r, C.f43813n, l2 != null ? l2.longValue() : 10000L, null);
        }
    }

    public static final class Wre extends o {
        public Wre(Long l2) {
            super(fuX.f43818Z, C.f43815t, l2 != null ? l2.longValue() : 25000L, null);
        }
    }

    public static final class aC extends o {
        public aC(Long l2) {
            super(fuX.f43820g, C.f43812O, l2 != null ? l2.longValue() : 24500L, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class fuX {
        private static final /* synthetic */ fuX[] E2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f43819e;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f43824n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final fuX f43823t = new fuX("AMP2W", 0, "AMP2W");

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final fuX f43816O = new fuX("AMP1M", 1, "AMP1M");
        public static final fuX J2 = new fuX("AMP3M", 2, "AMP3M");

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final fuX f43822r = new fuX("AMP6M", 3, "AMP6M");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final fuX f43821o = new fuX("AMZ10", 4, "AMZ10");

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final fuX f43818Z = new fuX("AMZ50", 5, "AMZ50");

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final fuX f43817S = new fuX("TOK10", 6, "TOK10");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final fuX f43820g = new fuX("TOK50", 7, "TOK50");

        static {
            fuX[] fuxArrN = n();
            E2 = fuxArrN;
            f43819e = EnumEntriesKt.enumEntries(fuxArrN);
        }

        private static final /* synthetic */ fuX[] n() {
            return new fuX[]{f43823t, f43816O, J2, f43822r, f43821o, f43818Z, f43817S, f43820g};
        }

        public static fuX valueOf(String str) {
            return (fuX) Enum.valueOf(fuX.class, str);
        }

        public static fuX[] values() {
            return (fuX[]) E2.clone();
        }

        public final String rl() {
            return this.f43824n;
        }

        private fuX(String str, int i2, String str2) {
            this.f43824n = str2;
        }
    }

    public static final class j extends o {
        public j(Long l2) {
            super(fuX.f43816O, C.f43813n, l2 != null ? l2.longValue() : 2400L, null);
        }
    }

    public static final class n extends o {
        public n(Long l2) {
            super(fuX.f43823t, C.f43813n, l2 != null ? l2.longValue() : 1360L, null);
        }
    }

    public static final class w6 extends o {
        public w6(Long l2) {
            super(fuX.J2, C.f43813n, l2 != null ? l2.longValue() : 6000L, null);
        }
    }

    public /* synthetic */ o(fuX fux, C c2, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fux, c2, j2);
    }

    private o(fuX fux, C c2, long j2) {
        this.f43810n = fux;
        this.rl = c2;
        this.f43811t = j2;
    }

    public final fuX n() {
        return this.f43810n;
    }

    public final long rl() {
        return this.f43811t;
    }

    public final C t() {
        return this.rl;
    }
}

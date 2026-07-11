package YV;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Pl {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12116Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ Pl[] f12118o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pl f12117n = new Pl("CHARGE_FULL_PRICE", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pl f12120t = new Pl("CHARGE_PRORATED_PRICE", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Pl f12115O = new Pl("DEFERRED", 2);
    public static final Pl J2 = new Pl("WITHOUT_PRORATION", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pl f12119r = new Pl("WITH_TIME_PRORATION", 4);

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Pl.values().length];
            try {
                iArr[Pl.f12117n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pl.f12120t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Pl.f12115O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Pl.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Pl.f12119r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Pl[] plArrN = n();
        f12118o = plArrN;
        f12116Z = EnumEntriesKt.enumEntries(plArrN);
    }

    private static final /* synthetic */ Pl[] n() {
        return new Pl[]{f12117n, f12120t, f12115O, J2, f12119r};
    }

    public static Pl valueOf(String str) {
        return (Pl) Enum.valueOf(Pl.class, str);
    }

    public static Pl[] values() {
        return (Pl[]) f12118o.clone();
    }

    public final int rl() {
        int i2 = j.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            return 5;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 3) {
            return 6;
        }
        if (i2 == 4) {
            return 3;
        }
        if (i2 == 5) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    private Pl(String str, int i2) {
    }
}

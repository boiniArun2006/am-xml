package rWZ;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Pl {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f73062o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ Pl[] f73063r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pl f73061n = new Pl("IMPORT", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pl f73064t = new Pl("EXPORT", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Pl f73060O = new Pl("TEMPLATE_TOGGLE", 2);
    public static final Pl J2 = new Pl("PRESET_EXPORT", 3);

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Pl.values().length];
            try {
                iArr[Pl.f73061n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pl.f73064t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Pl.f73060O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Pl.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Pl[] plArrN = n();
        f73063r = plArrN;
        f73062o = EnumEntriesKt.enumEntries(plArrN);
    }

    private static final /* synthetic */ Pl[] n() {
        return new Pl[]{f73061n, f73064t, f73060O, J2};
    }

    public static Pl valueOf(String str) {
        return (Pl) Enum.valueOf(Pl.class, str);
    }

    public static Pl[] values() {
        return (Pl[]) f73063r.clone();
    }

    public final String rl() {
        int i2 = j.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            return "import";
        }
        if (i2 == 2) {
            return "export";
        }
        if (i2 == 3) {
            return "template_toggle";
        }
        if (i2 == 4) {
            return "preset_export";
        }
        throw new NoWhenBranchMatchedException();
    }

    private Pl(String str, int i2) {
    }
}

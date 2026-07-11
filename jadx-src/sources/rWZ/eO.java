package rWZ;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class eO {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f73083o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ eO[] f73084r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final eO f73082n = new eO("MAIN_EXPORT_SCREEN", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final eO f73085t = new eO("EDITOR_EXPORT_SCREEN", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final eO f73081O = new eO("THREE_DOTS_PROJECT_CARD", 2);
    public static final eO J2 = new eO("OVERLAY_CLOUD_SUBTAB", 3);

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[eO.values().length];
            try {
                iArr[eO.f73082n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eO.f73085t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eO.f73081O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[eO.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        eO[] eOVarArrN = n();
        f73084r = eOVarArrN;
        f73083o = EnumEntriesKt.enumEntries(eOVarArrN);
    }

    private static final /* synthetic */ eO[] n() {
        return new eO[]{f73082n, f73085t, f73081O, J2};
    }

    public static eO valueOf(String str) {
        return (eO) Enum.valueOf(eO.class, str);
    }

    public static eO[] values() {
        return (eO[]) f73084r.clone();
    }

    public final String rl() {
        int i2 = j.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1 || i2 == 2) {
            return "export_screen";
        }
        if (i2 == 3) {
            return "three_dots_project_card";
        }
        if (i2 == 4) {
            return "overlay_cloud_subtab";
        }
        throw new NoWhenBranchMatchedException();
    }

    private eO(String str, int i2) {
    }
}

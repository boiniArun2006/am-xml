package rWZ;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Xo {
    private static final /* synthetic */ EnumEntries E2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ Xo[] f73071g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Xo f73072n = new Xo("PROJECT_PACKAGE_IMPORT", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Xo f73075t = new Xo("PROJECT_PACKAGE_EXPORT", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Xo f73068O = new Xo("TEMPLATE_IMPORT", 2);
    public static final Xo J2 = new Xo("TEMPLATE_EXPORT", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Xo f73074r = new Xo("VIDEO_TEMPLATE_IMPORT", 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Xo f73073o = new Xo("VIDEO_TEMPLATE_EXPORT", 5);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Xo f73070Z = new Xo("MY_ACCOUNT", 6);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Xo f73069S = new Xo("PRESET_EXPORT", 7);

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Xo.values().length];
            try {
                iArr[Xo.f73072n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Xo.f73075t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Xo.f73068O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Xo.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Xo.f73074r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Xo.f73073o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Xo.f73070Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Xo.f73069S.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Xo[] xoArrN = n();
        f73071g = xoArrN;
        E2 = EnumEntriesKt.enumEntries(xoArrN);
    }

    private static final /* synthetic */ Xo[] n() {
        return new Xo[]{f73072n, f73075t, f73068O, J2, f73074r, f73073o, f73070Z, f73069S};
    }

    public static Xo valueOf(String str) {
        return (Xo) Enum.valueOf(Xo.class, str);
    }

    public static Xo[] values() {
        return (Xo[]) f73071g.clone();
    }

    public final String rl() {
        switch (j.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return "project_package_import";
            case 2:
                return "project_package_export";
            case 3:
                return "template_import";
            case 4:
                return "template_export";
            case 5:
                return "video_template_import";
            case 6:
                return "video_template_export";
            case 7:
                return "my_account";
            case 8:
                return "preset_export";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private Xo(String str, int i2) {
    }
}

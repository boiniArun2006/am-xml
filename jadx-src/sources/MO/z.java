package MO;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class z {
    private static final /* synthetic */ EnumEntries E2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ z[] f6600g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f6604n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final z f6603t = new z("EMAIL_IS_EMPTY", 0, 2132017563);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final z f6597O = new z("CONFIRM_PHONE_NUMBER_NOT_MATCHING", 1, 2132017561);
    public static final z J2 = new z("CONFIRM_EMAIL_NOT_MATCHING", 2, 2132017559);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final z f6602r = new z("INVALID_PHONE_NUMBER", 3, 2132017578);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final z f6601o = new z("INVALID_TIKTOK_USERNAME", 4, 2132017609);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final z f6599Z = new z("INVALID_INSTAGRAM_USERNAME", 5, 2132017604);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final z f6598S = new z("INVALID_YOUTUBE_USERNAME", 6, 2132017612);

    static {
        z[] zVarArrN = n();
        f6600g = zVarArrN;
        E2 = EnumEntriesKt.enumEntries(zVarArrN);
    }

    private static final /* synthetic */ z[] n() {
        return new z[]{f6603t, f6597O, J2, f6602r, f6601o, f6599Z, f6598S};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f6600g.clone();
    }

    public final int rl() {
        return this.f6604n;
    }

    private z(String str, int i2, int i3) {
        this.f6604n = i3;
    }
}

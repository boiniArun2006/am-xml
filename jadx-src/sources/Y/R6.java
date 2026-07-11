package Y;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class R6 {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f11916Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ R6[] f11917o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f11920n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final R6 f11919t = new R6("EQUALS", 0, 3);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final R6 f11915O = new R6("PREFIX", 1, 2);
    public static final R6 J2 = new R6("CONTAINS", 2, 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final R6 f11918r = new R6("NOTFOUND", 3, 0);

    static {
        R6[] r6ArrN = n();
        f11917o = r6ArrN;
        f11916Z = EnumEntriesKt.enumEntries(r6ArrN);
    }

    private static final /* synthetic */ R6[] n() {
        return new R6[]{f11919t, f11915O, J2, f11918r};
    }

    public static R6 valueOf(String str) {
        return (R6) Enum.valueOf(R6.class, str);
    }

    public static R6[] values() {
        return (R6[]) f11917o.clone();
    }

    public final int rl() {
        return this.f11920n;
    }

    private R6(String str, int i2, int i3) {
        this.f11920n = i3;
    }
}

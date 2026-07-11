package M;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class CN3 {
    private static final /* synthetic */ CN3[] E2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f6255e;
    private final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f6259O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f6260n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f6261t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final CN3 f6258r = new CN3("Home", 0, "home", 2132020287, 2131231756, 2131231755);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final CN3 f6257o = new CN3("Tutorial", 1, "tutorials", 2132020290, 2131232039, 2131232038);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final CN3 f6254Z = new CN3("Ranking", 2, "ranking", 2132020285, 2131231932, 2131231931);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final CN3 f6253S = new CN3("Projects", 3, "projects", 2132020288, 2131231927, 2131231926);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CN3 f6256g = new CN3("Templates", 4, "templates", 2132020317, 2131232016, 2131232015);

    static {
        CN3[] cn3ArrN = n();
        E2 = cn3ArrN;
        f6255e = EnumEntriesKt.enumEntries(cn3ArrN);
    }

    private static final /* synthetic */ CN3[] n() {
        return new CN3[]{f6258r, f6257o, f6254Z, f6253S, f6256g};
    }

    public static CN3 valueOf(String str) {
        return (CN3) Enum.valueOf(CN3.class, str);
    }

    public static CN3[] values() {
        return (CN3[]) E2.clone();
    }

    public final String J2() {
        return this.f6260n;
    }

    public final int nr() {
        return this.f6261t;
    }

    public final int rl() {
        return this.J2;
    }

    public final int t() {
        return this.f6259O;
    }

    private CN3(String str, int i2, String str2, int i3, int i5, int i7) {
        this.f6260n = str2;
        this.f6261t = i3;
        this.f6259O = i5;
        this.J2 = i7;
    }
}

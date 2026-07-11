package mA;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class CN3 {
    private static final /* synthetic */ EnumEntries E2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ CN3[] f70612g;
    private final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f70614O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f70615n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f70616r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f70617t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final CN3 f70613o = new CN3("TUTORIALS", 0, 2132019335, 2132019333, 2132019334, 2131232038, ColorKt.nr(4293189631L));

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final CN3 f70611Z = new CN3("PROJECTS", 1, 2132019329, 2132019327, 2132019328, 2131231704, ColorKt.nr(4293523455L));

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final CN3 f70610S = new CN3("TEMPLATES", 2, 2132019332, 2132019330, 2132019331, 2131232015, ColorKt.nr(4294963140L));

    public static EnumEntries nr() {
        return E2;
    }

    static {
        CN3[] cn3ArrN = n();
        f70612g = cn3ArrN;
        E2 = EnumEntriesKt.enumEntries(cn3ArrN);
    }

    private static final /* synthetic */ CN3[] n() {
        return new CN3[]{f70613o, f70611Z, f70610S};
    }

    public static CN3 valueOf(String str) {
        return (CN3) Enum.valueOf(CN3.class, str);
    }

    public static CN3[] values() {
        return (CN3[]) f70612g.clone();
    }

    public final int J2() {
        return this.J2;
    }

    public final int KN() {
        return this.f70615n;
    }

    public final int Uo() {
        return this.f70614O;
    }

    public final long rl() {
        return this.f70616r;
    }

    public final int t() {
        return this.f70617t;
    }

    private CN3(String str, int i2, int i3, int i5, int i7, int i8, long j2) {
        this.f70615n = i3;
        this.f70617t = i5;
        this.f70614O = i7;
        this.J2 = i8;
        this.f70616r = j2;
    }
}

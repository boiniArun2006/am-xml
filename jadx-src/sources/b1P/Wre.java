package b1P;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Wre {
    private static final /* synthetic */ Wre[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f43138r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Wre f43137n = new Wre("NORMAL", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Wre f43139t = new Wre("EDGE", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Wre f43136O = new Wre("SCREEN", 2);

    static {
        Wre[] wreArrN = n();
        J2 = wreArrN;
        f43138r = EnumEntriesKt.enumEntries(wreArrN);
    }

    private static final /* synthetic */ Wre[] n() {
        return new Wre[]{f43137n, f43139t, f43136O};
    }

    public static Wre valueOf(String str) {
        return (Wre) Enum.valueOf(Wre.class, str);
    }

    public static Wre[] values() {
        return (Wre[]) J2.clone();
    }

    private Wre(String str, int i2) {
    }
}

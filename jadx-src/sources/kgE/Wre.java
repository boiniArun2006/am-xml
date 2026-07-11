package kgE;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Wre {
    private static final /* synthetic */ Wre[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f70098r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Wre f70097n = new Wre("None", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Wre f70099t = new Wre("Cache", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Wre f70096O = new Wre("Server", 2);

    static {
        Wre[] wreArrN = n();
        J2 = wreArrN;
        f70098r = EnumEntriesKt.enumEntries(wreArrN);
    }

    private static final /* synthetic */ Wre[] n() {
        return new Wre[]{f70097n, f70099t, f70096O};
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

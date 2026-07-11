package tu;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class afx {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f73912S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ afx[] f73913Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final afx f73914n = new afx("DATE_TAKEN", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final afx f73917t = new afx("DATE_ADDED", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final afx f73911O = new afx("MEDIA_TITLE", 2);
    public static final afx J2 = new afx("MEDIA_ARTISTS", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final afx f73916r = new afx("MEDIA_ALBUMS", 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final afx f73915o = new afx("MEDIA_GENRES", 5);

    static {
        afx[] afxVarArrN = n();
        f73913Z = afxVarArrN;
        f73912S = EnumEntriesKt.enumEntries(afxVarArrN);
    }

    private static final /* synthetic */ afx[] n() {
        return new afx[]{f73914n, f73917t, f73911O, J2, f73916r, f73915o};
    }

    public static afx valueOf(String str) {
        return (afx) Enum.valueOf(afx.class, str);
    }

    public static afx[] values() {
        return (afx[]) f73913Z.clone();
    }

    private afx(String str, int i2) {
    }
}

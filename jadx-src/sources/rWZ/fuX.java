package rWZ;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class fuX {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f73087Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ fuX[] f73089o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fuX f73088n = new fuX("EDIT", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final fuX f73091t = new fuX("AUDIO_BROWSER_4", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final fuX f73086O = new fuX("MEDIA_BROWSER_4", 2);
    public static final fuX J2 = new fuX("SAVE_TO_STORAGE", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final fuX f73090r = new fuX("TEMPLATE", 4);

    static {
        fuX[] fuxArrN = n();
        f73089o = fuxArrN;
        f73087Z = EnumEntriesKt.enumEntries(fuxArrN);
    }

    private static final /* synthetic */ fuX[] n() {
        return new fuX[]{f73088n, f73091t, f73086O, J2, f73090r};
    }

    public static fuX valueOf(String str) {
        return (fuX) Enum.valueOf(fuX.class, str);
    }

    public static fuX[] values() {
        return (fuX[]) f73089o.clone();
    }

    private fuX(String str, int i2) {
    }
}

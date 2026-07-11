package rWZ;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class qz {
    private static final /* synthetic */ qz[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f73109r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qz f73108n = new qz("TEMPLATES_TAB", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final qz f73110t = new qz("MAIN_EDITOR", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final qz f73107O = new qz("PRESET_PREVIEWER", 2);

    static {
        qz[] qzVarArrN = n();
        J2 = qzVarArrN;
        f73109r = EnumEntriesKt.enumEntries(qzVarArrN);
    }

    private static final /* synthetic */ qz[] n() {
        return new qz[]{f73108n, f73110t, f73107O};
    }

    public static qz valueOf(String str) {
        return (qz) Enum.valueOf(qz.class, str);
    }

    public static qz[] values() {
        return (qz[]) J2.clone();
    }

    private qz(String str, int i2) {
    }
}

package ka;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class psW {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ psW[] f70025O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final psW f70026n = new psW("BIG", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final psW f70027t = new psW("SMALL", 1);

    static {
        psW[] pswArrN = n();
        f70025O = pswArrN;
        J2 = EnumEntriesKt.enumEntries(pswArrN);
    }

    private static final /* synthetic */ psW[] n() {
        return new psW[]{f70026n, f70027t};
    }

    public static psW valueOf(String str) {
        return (psW) Enum.valueOf(psW.class, str);
    }

    public static psW[] values() {
        return (psW[]) f70025O.clone();
    }

    private psW(String str, int i2) {
    }
}

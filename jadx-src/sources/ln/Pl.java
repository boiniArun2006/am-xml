package ln;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Pl {
    private static final /* synthetic */ Pl[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f70470r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pl f70469n = new Pl("ALWAYS", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pl f70471t = new Pl("AUTO", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Pl f70468O = new Pl("NEVER", 2);

    static {
        Pl[] plArrN = n();
        J2 = plArrN;
        f70470r = EnumEntriesKt.enumEntries(plArrN);
    }

    private static final /* synthetic */ Pl[] n() {
        return new Pl[]{f70469n, f70471t, f70468O};
    }

    public static Pl valueOf(String str) {
        return (Pl) Enum.valueOf(Pl.class, str);
    }

    public static Pl[] values() {
        return (Pl[]) J2.clone();
    }

    private Pl(String str, int i2) {
    }
}

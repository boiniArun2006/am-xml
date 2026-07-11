package g8;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class s4 {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ s4[] f67123O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s4 f67124n = new s4("Weekly", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s4 f67125t = new s4("Yearly", 1);

    static {
        s4[] s4VarArrN = n();
        f67123O = s4VarArrN;
        J2 = EnumEntriesKt.enumEntries(s4VarArrN);
    }

    private static final /* synthetic */ s4[] n() {
        return new s4[]{f67124n, f67125t};
    }

    public static s4 valueOf(String str) {
        return (s4) Enum.valueOf(s4.class, str);
    }

    public static s4[] values() {
        return (s4[]) f67123O.clone();
    }

    private s4(String str, int i2) {
    }
}

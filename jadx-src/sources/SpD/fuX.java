package SpD;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class fuX {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f9952o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ fuX[] f9953r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f9955n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final fuX f9954t = new fuX("APP_STARTED", 0, "app_started");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final fuX f9951O = new fuX("APP_FOREGROUNDED", 1, "app_foregrounded");
    public static final fuX J2 = new fuX("MANUAL", 2, "manual");

    static {
        fuX[] fuxArrN = n();
        f9953r = fuxArrN;
        f9952o = EnumEntriesKt.enumEntries(fuxArrN);
    }

    private static final /* synthetic */ fuX[] n() {
        return new fuX[]{f9954t, f9951O, J2};
    }

    public static fuX valueOf(String str) {
        return (fuX) Enum.valueOf(fuX.class, str);
    }

    public static fuX[] values() {
        return (fuX[]) f9953r.clone();
    }

    public final String rl() {
        return this.f9955n;
    }

    private fuX(String str, int i2, String str2) {
        this.f9955n = str2;
    }
}

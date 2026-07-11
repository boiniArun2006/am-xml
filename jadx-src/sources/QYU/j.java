package QYU;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j {
    private static final /* synthetic */ j[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8223r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f8225n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f8224t = new j("LOCKED", 0, 2131231825);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f8222O = new j("UNLOCKED", 1, 2131231824);

    static {
        j[] jVarArrN = n();
        J2 = jVarArrN;
        f8223r = EnumEntriesKt.enumEntries(jVarArrN);
    }

    private static final /* synthetic */ j[] n() {
        return new j[]{f8224t, f8222O};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) J2.clone();
    }

    public final int rl() {
        return this.f8225n;
    }

    private j(String str, int i2, int i3) {
        this.f8225n = i3;
    }
}

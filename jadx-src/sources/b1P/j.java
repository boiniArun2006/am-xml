package b1P;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f43142o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ j[] f43143r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f43141n = new j("LEFT", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f43144t = new j("TOP", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f43140O = new j("RIGHT", 2);
    public static final j J2 = new j("BOTTOM", 3);

    static {
        j[] jVarArrN = n();
        f43143r = jVarArrN;
        f43142o = EnumEntriesKt.enumEntries(jVarArrN);
    }

    private static final /* synthetic */ j[] n() {
        return new j[]{f43141n, f43144t, f43140O, J2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f43143r.clone();
    }

    private j(String str, int i2) {
    }
}

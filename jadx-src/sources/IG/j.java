package IG;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f4135o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ j[] f4136r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f4134n = new j("PROJECTS", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f4137t = new j("TEMPLATES", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f4133O = new j("PREMADE_TEMPLATE", 2);
    public static final j J2 = new j("PREMADE_PRESET", 3);

    static {
        j[] jVarArrN = n();
        f4136r = jVarArrN;
        f4135o = EnumEntriesKt.enumEntries(jVarArrN);
    }

    private static final /* synthetic */ j[] n() {
        return new j[]{f4134n, f4137t, f4133O, J2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f4136r.clone();
    }

    private j(String str, int i2) {
    }
}

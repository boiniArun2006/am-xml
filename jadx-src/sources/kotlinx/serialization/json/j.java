package kotlinx.serialization.json;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j {
    private static final /* synthetic */ j[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f70273r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f70272n = new j("NONE", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f70274t = new j("ALL_JSON_OBJECTS", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f70271O = new j("POLYMORPHIC", 2);

    private static final /* synthetic */ j[] n() {
        return new j[]{f70272n, f70274t, f70271O};
    }

    static {
        j[] jVarArrN = n();
        J2 = jVarArrN;
        f70273r = EnumEntriesKt.enumEntries(jVarArrN);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) J2.clone();
    }

    private j(String str, int i2) {
    }
}

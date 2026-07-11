package cO;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {
    private static final /* synthetic */ j[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f43647r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f43646n = new j("SERVER_ERROR", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f43648t = new j("CLIENT_ERROR", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f43645O = new j("SERIALIZATION_ERROR", 2);

    static {
        j[] jVarArrN = n();
        J2 = jVarArrN;
        f43647r = EnumEntriesKt.enumEntries(jVarArrN);
    }

    private static final /* synthetic */ j[] n() {
        return new j[]{f43646n, f43648t, f43645O};
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

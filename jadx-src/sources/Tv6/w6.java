package Tv6;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 {
    private static final /* synthetic */ w6[] E2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f10596e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f10601n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final w6 f10600t = new w6("INTERNAL", 0, "internalError");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final w6 f10593O = new w6("INVALID_REQUEST", 1, "invalidRequest");
    public static final w6 J2 = new w6("NETWORK", 2, "networkError");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final w6 f10599r = new w6("NO_FILL", 3, "noFill");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final w6 f10598o = new w6("APP_ID_MISSING", 4, "appIdMissing");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final w6 f10595Z = new w6("MEDIATION_NO_FILL", 5, "mediationNoFill");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final w6 f10594S = new w6("TIMEOUT", 6, "timeout");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w6 f10597g = new w6("UNKNOWN", 7, "unknown");

    static {
        w6[] w6VarArrN = n();
        E2 = w6VarArrN;
        f10596e = EnumEntriesKt.enumEntries(w6VarArrN);
    }

    private static final /* synthetic */ w6[] n() {
        return new w6[]{f10600t, f10593O, J2, f10599r, f10598o, f10595Z, f10594S, f10597g};
    }

    public static w6 valueOf(String str) {
        return (w6) Enum.valueOf(w6.class, str);
    }

    public static w6[] values() {
        return (w6[]) E2.clone();
    }

    public final String rl() {
        return this.f10601n;
    }

    private w6(String str, int i2, String str2) {
        this.f10601n = str2;
    }
}

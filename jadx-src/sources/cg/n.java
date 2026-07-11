package cg;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n {
    private static final /* synthetic */ n[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f43807r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f43809n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f43808t = new n("CREATOR_PROGRAM", 0, "ccip_2023");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final n f43806O = new n("RANKING_PROGRAM", 1, "iar_2023");

    static {
        n[] nVarArrN = n();
        J2 = nVarArrN;
        f43807r = EnumEntriesKt.enumEntries(nVarArrN);
    }

    private static final /* synthetic */ n[] n() {
        return new n[]{f43808t, f43806O};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) J2.clone();
    }

    public final String rl() {
        return this.f43809n;
    }

    private n(String str, int i2, String str2) {
        this.f43809n = str2;
    }
}

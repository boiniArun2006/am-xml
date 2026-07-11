package Asx;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f121o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ j[] f122r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f120n = new j("NOT_STARTED", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f123t = new j("STARTED", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f119O = new j("COMPLETED", 2);
    public static final j J2 = new j("FAILED", 3);

    static {
        j[] jVarArrN = n();
        f122r = jVarArrN;
        f121o = EnumEntriesKt.enumEntries(jVarArrN);
    }

    private static final /* synthetic */ j[] n() {
        return new j[]{f120n, f123t, f119O, J2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f122r.clone();
    }

    private j(String str, int i2) {
    }
}

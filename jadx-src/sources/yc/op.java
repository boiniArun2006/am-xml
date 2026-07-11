package yc;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class op {
    private static final /* synthetic */ op[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f76084r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final op f76083n = new op("NORMAL", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final op f76085t = new op("SOLO", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final op f76082O = new op("REDUCED_OPACITY", 2);

    static {
        op[] opVarArrN = n();
        J2 = opVarArrN;
        f76084r = EnumEntriesKt.enumEntries(opVarArrN);
    }

    private static final /* synthetic */ op[] n() {
        return new op[]{f76083n, f76085t, f76082O};
    }

    public static op valueOf(String str) {
        return (op) Enum.valueOf(op.class, str);
    }

    public static op[] values() {
        return (op[]) J2.clone();
    }

    private op(String str, int i2) {
    }
}

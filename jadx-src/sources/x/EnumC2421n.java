package x;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class EnumC2421n {
    private static final /* synthetic */ EnumC2421n[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f75142r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC2421n f75141n = new EnumC2421n("UNCHANGED", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC2421n f75143t = new EnumC2421n("TRANSLUCENT", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final EnumC2421n f75140O = new EnumC2421n("OPAQUE", 2);

    static {
        EnumC2421n[] enumC2421nArrN = n();
        J2 = enumC2421nArrN;
        f75142r = EnumEntriesKt.enumEntries(enumC2421nArrN);
    }

    private static final /* synthetic */ EnumC2421n[] n() {
        return new EnumC2421n[]{f75141n, f75143t, f75140O};
    }

    public static EnumC2421n valueOf(String str) {
        return (EnumC2421n) Enum.valueOf(EnumC2421n.class, str);
    }

    public static EnumC2421n[] values() {
        return (EnumC2421n[]) J2.clone();
    }

    private EnumC2421n(String str, int i2) {
    }
}

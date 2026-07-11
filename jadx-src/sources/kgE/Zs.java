package kgE;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Zs {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f70103o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ Zs[] f70104r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Zs f70102n = new Zs("None", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Zs f70105t = new Zs("Busy", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Zs f70101O = new Zs("Failed", 2);
    public static final Zs J2 = new Zs("Success", 3);

    static {
        Zs[] zsArrN = n();
        f70104r = zsArrN;
        f70103o = EnumEntriesKt.enumEntries(zsArrN);
    }

    private static final /* synthetic */ Zs[] n() {
        return new Zs[]{f70102n, f70105t, f70101O, J2};
    }

    public static Zs valueOf(String str) {
        return (Zs) Enum.valueOf(Zs.class, str);
    }

    public static Zs[] values() {
        return (Zs[]) f70104r.clone();
    }

    private Zs(String str, int i2) {
    }
}

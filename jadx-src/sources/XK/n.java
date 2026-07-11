package XK;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f11820o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ n[] f11821r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f11823n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f11822t = new n("FixedPalette", 0, 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final n f11819O = new n("Octree", 1, 2);
    public static final n J2 = new n("MedianCut", 2, 3);

    static {
        n[] nVarArrN = n();
        f11821r = nVarArrN;
        f11820o = EnumEntriesKt.enumEntries(nVarArrN);
    }

    private static final /* synthetic */ n[] n() {
        return new n[]{f11822t, f11819O, J2};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f11821r.clone();
    }

    public final int rl() {
        return this.f11823n;
    }

    private n(String str, int i2, int i3) {
        this.f11823n = i3;
    }
}

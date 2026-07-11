package QVk;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Pl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Pl[] f8184O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8185S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ Pl[] f8186Z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f8189t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f8190n;
    public static final Pl J2 = new Pl("UNKNOWN", 0, -1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pl f8188r = new Pl("VISIBLE", 1, 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pl f8187o = new Pl("INVISIBLE", 2, 2);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static {
        Pl[] plArrN = n();
        f8186Z = plArrN;
        f8185S = EnumEntriesKt.enumEntries(plArrN);
        f8189t = new j(null);
        f8184O = values();
    }

    private static final /* synthetic */ Pl[] n() {
        return new Pl[]{J2, f8188r, f8187o};
    }

    public static Pl valueOf(String str) {
        return (Pl) Enum.valueOf(Pl.class, str);
    }

    public static Pl[] values() {
        return (Pl[]) f8186Z.clone();
    }

    private Pl(String str, int i2, int i3) {
        this.f8190n = i3;
    }
}

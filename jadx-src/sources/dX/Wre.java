package dX;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f63514n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f63515o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ Wre[] f63516r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Wre f63517t = new Wre("LOW", 0);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Wre f63513O = new Wre("MEDIUM", 1);
    public static final Wre J2 = new Wre("HIGH", 2);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final Wre n(Wre priority1, Wre priority2) {
            Intrinsics.checkNotNullParameter(priority1, "priority1");
            Intrinsics.checkNotNullParameter(priority2, "priority2");
            return priority1.ordinal() > priority2.ordinal() ? priority1 : priority2;
        }
    }

    public static final Wre rl(Wre wre, Wre wre2) {
        return f63514n.n(wre, wre2);
    }

    static {
        Wre[] wreArrN = n();
        f63516r = wreArrN;
        f63515o = EnumEntriesKt.enumEntries(wreArrN);
        f63514n = new j(null);
    }

    private static final /* synthetic */ Wre[] n() {
        return new Wre[]{f63517t, f63513O, J2};
    }

    public static Wre valueOf(String str) {
        return (Wre) Enum.valueOf(Wre.class, str);
    }

    public static Wre[] values() {
        return (Wre[]) f63516r.clone();
    }

    private Wre(String str, int i2) {
    }
}

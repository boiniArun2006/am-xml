package tu;

import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Ew {
    public static final Ew J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Set f73878O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ Ew[] f73879S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Ew f73880Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f73881g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f73882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Ew f73883o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Ew f73884r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set f73885t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final Set n() {
            return Ew.f73885t;
        }

        public final Set rl() {
            return Ew.f73878O;
        }
    }

    static {
        Ew ew = new Ew("IMAGE", 0);
        J2 = ew;
        Ew ew2 = new Ew("VIDEO", 1);
        f73884r = ew2;
        f73883o = new Ew("AUDIO", 2);
        f73880Z = new Ew("BUCKET", 3);
        Ew[] ewArrN = n();
        f73879S = ewArrN;
        f73881g = EnumEntriesKt.enumEntries(ewArrN);
        f73882n = new j(null);
        f73885t = ArraysKt.toSet(values());
        f73878O = SetsKt.setOf((Object[]) new Ew[]{ew, ew2});
    }

    private static final /* synthetic */ Ew[] n() {
        return new Ew[]{J2, f73884r, f73883o, f73880Z};
    }

    public static Ew valueOf(String str) {
        return (Ew) Enum.valueOf(Ew.class, str);
    }

    public static Ew[] values() {
        return (Ew[]) f73879S.clone();
    }

    private Ew(String str, int i2) {
    }
}

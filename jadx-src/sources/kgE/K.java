package kgE;

import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class K {
    public static final K E2;
    private static final Set J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final K f70070N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f70071O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final K f70072S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final K f70073T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f70074U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final K f70075X;
    public static final K Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final K f70076Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final K f70077e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final K f70078g;
    private static final /* synthetic */ K[] jB;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final K f70079o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Set f70080r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final K f70081v;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f70082n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f70083t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final Set n() {
            return K.J2;
        }

        public final Set rl() {
            return K.f70080r;
        }
    }

    static {
        K k2 = new K("RemoveWatermark", 0, "RemoveWatermark", 1L);
        f70079o = k2;
        f70076Z = new K("PremiumFeatures", 1, "PremiumFeatures", 2L);
        K k3 = new K("MemberEffects", 2, "MemberEffects", 4L);
        f70072S = k3;
        K k4 = new K(KfLR.cbZmagv, 3, "ProjectPackageSharing", 8L);
        f70078g = k4;
        K k5 = new K("FutureMemberFeatures", 4, "FutureMemberFeatures", 16L);
        E2 = k5;
        f70077e = new K("InfiniteProjectSharing", 5, "InfiniteProjectSharing", 32L);
        K k7 = new K("AdvancedEasing", 6, "AdvancedEasing", 64L);
        f70075X = k7;
        K k8 = new K("LayerParenting", 7, "LayerParenting", 128L);
        f70073T = k8;
        K k9 = new K("CameraObjects", 8, "CameraObjects", 256L);
        f70070N = k9;
        K k10 = new K("CloudStorageLow", 9, "CloudStorageLowTier", 512L);
        f70081v = k10;
        K k11 = new K("CloudStorageHigh", 10, "CloudStorageHighTier", 1024L);
        Xw = k11;
        K[] kArrN = n();
        jB = kArrN;
        f70074U = EnumEntriesKt.enumEntries(kArrN);
        f70071O = new j(null);
        Set of = SetsKt.setOf((Object[]) new K[]{k2, k3, k7, k5, k4, k9, k8, k10});
        J2 = of;
        f70080r = SetsKt.plus(of, (Iterable) SetsKt.setOf(k11));
    }

    private static final /* synthetic */ K[] n() {
        return new K[]{f70079o, f70076Z, f70072S, f70078g, E2, f70077e, f70075X, f70073T, f70070N, f70081v, Xw};
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) jB.clone();
    }

    public final String J2() {
        return this.f70082n;
    }

    public final long nr() {
        return this.f70083t;
    }

    private K(String str, int i2, String str2, long j2) {
        this.f70082n = str2;
        this.f70083t = j2;
    }
}

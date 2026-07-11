package YV;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f12150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12151o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ qz[] f12152r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final qz f12153t = new qz("PENDING", 0);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final qz f12149O = new qz("PURCHASED", 1);
    public static final qz J2 = new qz("UNSPECIFIED_STATE", 2);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final qz n(int i2) {
            if (i2 == 0) {
                return qz.J2;
            }
            if (i2 == 1) {
                return qz.f12149O;
            }
            if (i2 == 2) {
                return qz.f12153t;
            }
            throw new IllegalArgumentException("Unknown purchase state: " + i2);
        }
    }

    static {
        qz[] qzVarArrN = n();
        f12152r = qzVarArrN;
        f12151o = EnumEntriesKt.enumEntries(qzVarArrN);
        f12150n = new j(null);
    }

    private static final /* synthetic */ qz[] n() {
        return new qz[]{f12153t, f12149O, J2};
    }

    public static qz valueOf(String str) {
        return (qz) Enum.valueOf(qz.class, str);
    }

    public static qz[] values() {
        return (qz[]) f12152r.clone();
    }

    private qz(String str, int i2) {
    }
}

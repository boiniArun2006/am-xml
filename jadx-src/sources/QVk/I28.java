package QVk;

import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final I28[] f8173O;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8175X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ I28[] f8177e;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f8181t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f8182n;
    public static final I28 J2 = new I28("UNKNOWN", 0, -1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final I28 f8180r = new I28("REQUESTED", 1, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final I28 f8179o = new I28("INTERMEDIATE_AVAILABLE", 2, 2);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final I28 f8176Z = new I28("SUCCESS", 3, 3);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final I28 f8174S = new I28("ERROR", 4, 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final I28 f8178g = new I28("EMPTY_EVENT", 5, 7);
    public static final I28 E2 = new I28("RELEASED", 6, 8);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[I28.values().length];
            try {
                iArr[I28.f8180r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I28.f8176Z.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I28.f8179o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[I28.f8174S.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[I28.E2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        I28[] i28ArrN = n();
        f8177e = i28ArrN;
        f8175X = EnumEntriesKt.enumEntries(i28ArrN);
        f8181t = new j(null);
        f8173O = values();
    }

    private static final /* synthetic */ I28[] n() {
        return new I28[]{J2, f8180r, f8179o, f8176Z, f8174S, f8178g, E2};
    }

    public static I28 valueOf(String str) {
        return (I28) Enum.valueOf(I28.class, str);
    }

    public static I28[] values() {
        return (I28[]) f8177e.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i2 = n.$EnumSwitchMapping$0[ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "unknown" : "released" : MRAIDPresenter.ERROR : "intermediate_available" : "success" : "requested";
    }

    private I28(String str, int i2, int i3) {
        this.f8182n = i3;
    }
}

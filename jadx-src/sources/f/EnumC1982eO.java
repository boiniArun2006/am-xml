package f;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f.eO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class EnumC1982eO {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f64018X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC1982eO[] f64020e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC1982eO f64022n = new EnumC1982eO("CHECKBOX", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC1982eO f64025t = new EnumC1982eO("CHECKBOX_COMPARISON", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final EnumC1982eO f64016O = new EnumC1982eO("CHECKBOX_OPTIONS", 2);
    public static final EnumC1982eO J2 = new EnumC1982eO("CLOUD_CARDS_TIERS", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1982eO f64024r = new EnumC1982eO("CLOUD_CARDS_TIERS_NO_TRIAL", 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC1982eO f64023o = new EnumC1982eO("CLOUD_UPSELL", 5);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final EnumC1982eO f64019Z = new EnumC1982eO("CLOUD_CARDS_DISCOUNT", 6);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final EnumC1982eO f64017S = new EnumC1982eO("CLOUD_COUNTDOWN", 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC1982eO f64021g = new EnumC1982eO("CLOUD_ONE_CHANCE", 8);
    public static final EnumC1982eO E2 = new EnumC1982eO("PLAYFUL_UNLOCK_FT", 9);

    static {
        EnumC1982eO[] enumC1982eOArrN = n();
        f64020e = enumC1982eOArrN;
        f64018X = EnumEntriesKt.enumEntries(enumC1982eOArrN);
    }

    private static final /* synthetic */ EnumC1982eO[] n() {
        return new EnumC1982eO[]{f64022n, f64025t, f64016O, J2, f64024r, f64023o, f64019Z, f64017S, f64021g, E2};
    }

    public static EnumC1982eO valueOf(String str) {
        return (EnumC1982eO) Enum.valueOf(EnumC1982eO.class, str);
    }

    public static EnumC1982eO[] values() {
        return (EnumC1982eO[]) f64020e.clone();
    }

    private EnumC1982eO(String str, int i2) {
    }
}

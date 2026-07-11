package C6;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Z {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f743Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ Z[] f745o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Z f744n = new Z("Success", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Z f747t = new Z("EncoderInitFail", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Z f742O = new Z("DecoderInitFail", 2);
    public static final Z J2 = new Z("EncodeFail", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Z f746r = new Z("DecodeFail", 4);

    static {
        Z[] zArrN = n();
        f745o = zArrN;
        f743Z = EnumEntriesKt.enumEntries(zArrN);
    }

    private static final /* synthetic */ Z[] n() {
        return new Z[]{f744n, f747t, f742O, J2, f746r};
    }

    public static Z valueOf(String str) {
        return (Z) Enum.valueOf(Z.class, str);
    }

    public static Z[] values() {
        return (Z[]) f745o.clone();
    }

    private Z(String str, int i2) {
    }
}

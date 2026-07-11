package six;

import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class fuX {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f73289Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ fuX[] f73291o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fuX f73290n = new fuX("SCENE", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final fuX f73293t = new fuX("ELEMENT", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final fuX f73288O = new fuX("TEMPLATE", 2);
    public static final fuX J2 = new fuX("PRESET", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final fuX f73292r = new fuX(HrvQKfmFZJudBc.INiD, 4);

    static {
        fuX[] fuxArrN = n();
        f73291o = fuxArrN;
        f73289Z = EnumEntriesKt.enumEntries(fuxArrN);
    }

    private static final /* synthetic */ fuX[] n() {
        return new fuX[]{f73290n, f73293t, f73288O, J2, f73292r};
    }

    public static fuX valueOf(String str) {
        return (fuX) Enum.valueOf(fuX.class, str);
    }

    public static fuX[] values() {
        return (fuX[]) f73291o.clone();
    }

    private fuX(String str, int i2) {
    }
}

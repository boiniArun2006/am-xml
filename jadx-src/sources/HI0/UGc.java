package HI0;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class UGc {
    private static final /* synthetic */ UGc[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f3842r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final UGc f3841n = new UGc("Exist", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final UGc f3843t = new UGc("NotExist", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final UGc f3840O = new UGc("Error", 2);

    static {
        UGc[] uGcArrN = n();
        J2 = uGcArrN;
        f3842r = EnumEntriesKt.enumEntries(uGcArrN);
    }

    private static final /* synthetic */ UGc[] n() {
        return new UGc[]{f3841n, f3843t, f3840O};
    }

    public static UGc valueOf(String str) {
        return (UGc) Enum.valueOf(UGc.class, str);
    }

    public static UGc[] values() {
        return (UGc[]) J2.clone();
    }

    private UGc(String str, int i2) {
    }
}

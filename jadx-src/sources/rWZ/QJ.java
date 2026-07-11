package rWZ;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class QJ {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ QJ[] f73065O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final QJ f73066n = new QJ("IN_APP_IMPORT", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final QJ f73067t = new QJ("DEVICE_FILES_IMPORT", 1);

    static {
        QJ[] qjArrN = n();
        f73065O = qjArrN;
        J2 = EnumEntriesKt.enumEntries(qjArrN);
    }

    private static final /* synthetic */ QJ[] n() {
        return new QJ[]{f73066n, f73067t};
    }

    public static QJ valueOf(String str) {
        return (QJ) Enum.valueOf(QJ.class, str);
    }

    public static QJ[] values() {
        return (QJ[]) f73065O.clone();
    }

    private QJ(String str, int i2) {
    }
}

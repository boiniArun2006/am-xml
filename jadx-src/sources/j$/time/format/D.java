package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class D {
    public static final D LENIENT;
    public static final D SMART;
    public static final D STRICT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ D[] f69015a;

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f69015a.clone();
    }

    static {
        D d2 = new D("STRICT", 0);
        STRICT = d2;
        D d4 = new D("SMART", 1);
        SMART = d4;
        D d5 = new D("LENIENT", 2);
        LENIENT = d5;
        f69015a = new D[]{d2, d4, d5};
    }
}

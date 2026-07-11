package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class A implements j {
    public static final A BEFORE_ROC;
    public static final A ROC;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ A[] f68935a;

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f68935a.clone();
    }

    static {
        A a2 = new A("BEFORE_ROC", 0);
        BEFORE_ROC = a2;
        A a3 = new A("ROC", 1);
        ROC = a3;
        f68935a = new A[]{a2, a3};
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return ordinal();
    }
}

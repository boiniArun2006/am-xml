package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class E {
    public static final E ALWAYS;
    public static final E EXCEEDS_PAD;
    public static final E NEVER;
    public static final E NORMAL;
    public static final E NOT_NEGATIVE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ E[] f69039a;

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f69039a.clone();
    }

    static {
        E e2 = new E("NORMAL", 0);
        NORMAL = e2;
        E e3 = new E("ALWAYS", 1);
        ALWAYS = e3;
        E e4 = new E("NEVER", 2);
        NEVER = e4;
        E e5 = new E("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = e5;
        E e6 = new E("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = e6;
        f69039a = new E[]{e2, e3, e4, e5, e6};
    }
}

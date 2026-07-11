package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class G implements j {
    public static final G BE;
    public static final G BEFORE_BE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ G[] f68942a;

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) f68942a.clone();
    }

    static {
        G g2 = new G("BEFORE_BE", 0);
        BEFORE_BE = g2;
        G g3 = new G("BE", 1);
        BE = g3;
        f68942a = new G[]{g2, g3};
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return ordinal();
    }
}

package j$.time.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class d {
    public static final d STANDARD;
    public static final d UTC;
    public static final d WALL;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ d[] f69202a;

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f69202a.clone();
    }

    static {
        d dVar = new d("UTC", 0);
        UTC = dVar;
        d dVar2 = new d("WALL", 1);
        WALL = dVar2;
        d dVar3 = new d("STANDARD", 2);
        STANDARD = dVar3;
        f69202a = new d[]{dVar, dVar2, dVar3};
    }
}

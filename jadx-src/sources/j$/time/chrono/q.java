package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class q implements j {
    public static final q BCE;
    public static final q CE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ q[] f68979a;

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f68979a.clone();
    }

    static {
        q qVar = new q("BCE", 0);
        BCE = qVar;
        q qVar2 = new q("CE", 1);
        CE = qVar2;
        f68979a = new q[]{qVar, qVar2};
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return ordinal();
    }
}

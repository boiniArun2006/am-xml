package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class o implements j {
    public static final o AH;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ o[] f68977a;

    @Override // j$.time.chrono.j
    public final int getValue() {
        return 1;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f68977a.clone();
    }

    static {
        o oVar = new o("AH", 0);
        AH = oVar;
        f68977a = new o[]{oVar};
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return j$.time.temporal.s.j(1L, 1L);
        }
        return super.l(pVar);
    }
}

package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class r implements InterfaceC2193f {
    public static final r INSENSITIVE;
    public static final r LENIENT;
    public static final r SENSITIVE;
    public static final r STRICT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ r[] f69087a;

    @Override // j$.time.format.InterfaceC2193f
    public final boolean q(y yVar, StringBuilder sb) {
        return true;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f69087a.clone();
    }

    static {
        r rVar = new r("SENSITIVE", 0);
        SENSITIVE = rVar;
        r rVar2 = new r("INSENSITIVE", 1);
        INSENSITIVE = rVar2;
        r rVar3 = new r("STRICT", 2);
        STRICT = rVar3;
        r rVar4 = new r("LENIENT", 3);
        LENIENT = rVar4;
        f69087a = new r[]{rVar, rVar2, rVar3, rVar4};
    }

    @Override // j$.time.format.InterfaceC2193f
    public final int s(w wVar, CharSequence charSequence, int i2) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            wVar.m(true);
            return i2;
        }
        if (iOrdinal == 1) {
            wVar.m(false);
            return i2;
        }
        if (iOrdinal == 2) {
            wVar.q(true);
            return i2;
        }
        if (iOrdinal != 3) {
            return i2;
        }
        wVar.q(false);
        return i2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}

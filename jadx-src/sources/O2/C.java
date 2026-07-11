package O2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f7240n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C f7239t = new j("TERABYTES", 0, 1099511627776L);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C f7235O = new C("GIGABYTES", 1, 1073741824) { // from class: O2.C.n
        {
            j jVar = null;
        }
    };
    public static final C J2 = new C("MEGABYTES", 2, 1048576) { // from class: O2.C.w6
        {
            j jVar = null;
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C f7238r = new C("KILOBYTES", 3, 1024) { // from class: O2.C.Ml
        {
            j jVar = null;
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C f7237o = new C("BYTES", 4, 1) { // from class: O2.C.I28
        {
            j jVar = null;
        }
    };

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ C[] f7236Z = n();

    enum j extends C {
        j(String str, int i2, long j2) {
            super(str, i2, j2, null);
        }
    }

    /* synthetic */ C(String str, int i2, long j2, j jVar) {
        this(str, i2, j2);
    }

    private C(String str, int i2, long j2) {
        this.f7240n = j2;
    }

    private static /* synthetic */ C[] n() {
        return new C[]{f7239t, f7235O, J2, f7238r, f7237o};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f7236Z.clone();
    }

    public long rl(long j2) {
        return (j2 * this.f7240n) / f7238r.f7240n;
    }
}

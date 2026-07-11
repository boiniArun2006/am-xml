package k9w;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 implements Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f69677n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f69676t = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f69674O = Uo(0.9999f);
    private static final float J2 = Uo(0.0f);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f69675r = Uo(1.0f);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final float n(float f3) {
            return ((I28) RangesKt.coerceAtMost(I28.t(I28.Uo(f3)), I28.t(I28.f69674O))).gh();
        }

        public final float rl() {
            return I28.f69675r;
        }
    }

    public static float Uo(float f3) {
        if (0.0f <= f3 && f3 <= 1.0f) {
            return f3;
        }
        throw new IllegalArgumentException(("Progress values must be in 0..1, found: " + f3).toString());
    }

    public static boolean KN(float f3, Object obj) {
        return (obj instanceof I28) && Float.compare(f3, ((I28) obj).gh()) == 0;
    }

    public static String mUb(float f3) {
        return "FMProgressValue(value=" + f3 + ')';
    }

    public static final /* synthetic */ I28 t(float f3) {
        return new I28(f3);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return nr(((I28) obj).gh());
    }

    public boolean equals(Object obj) {
        return KN(this.f69677n, obj);
    }

    public final /* synthetic */ float gh() {
        return this.f69677n;
    }

    public int hashCode() {
        return xMQ(this.f69677n);
    }

    public int nr(float f3) {
        return J2(this.f69677n, f3);
    }

    public String toString() {
        return mUb(this.f69677n);
    }

    private /* synthetic */ I28(float f3) {
        this.f69677n = f3;
    }

    public static int J2(float f3, float f4) {
        return Float.compare(f3, f4);
    }

    public static int xMQ(float f3) {
        return Float.hashCode(f3);
    }
}

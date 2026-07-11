package androidx.palette.graphics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Target {
    public static final Target J2;
    public static final Target KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Target f40508O;
    public static final Target Uo;
    public static final Target mUb;
    public static final Target xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final float[] f40509n;
    final float[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final float[] f40510t = new float[3];
    boolean nr = true;

    public static final class Builder {
    }

    private static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    static {
        Target target = new Target();
        f40508O = target;
        az(target);
        ck(target);
        Target target2 = new Target();
        J2 = target2;
        HI(target2);
        ck(target2);
        Target target3 = new Target();
        Uo = target3;
        qie(target3);
        ck(target3);
        Target target4 = new Target();
        KN = target4;
        az(target4);
        ty(target4);
        Target target5 = new Target();
        xMQ = target5;
        HI(target5);
        ty(target5);
        Target target6 = new Target();
        mUb = target6;
        qie(target6);
        ty(target6);
    }

    private static void HI(Target target) {
        float[] fArr = target.rl;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private void Ik() {
        float[] fArr = this.f40510t;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    private static void az(Target target) {
        float[] fArr = target.rl;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void ck(Target target) {
        float[] fArr = target.f40509n;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void qie(Target target) {
        float[] fArr = target.rl;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void ty(Target target) {
        float[] fArr = target.f40509n;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    public float J2() {
        return this.f40510t[2];
    }

    public float KN() {
        return this.rl[1];
    }

    public float O() {
        return this.f40509n[0];
    }

    public float Uo() {
        return this.f40510t[0];
    }

    void gh() {
        int length = this.f40510t.length;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            float f4 = this.f40510t[i2];
            if (f4 > 0.0f) {
                f3 += f4;
            }
        }
        if (f3 != 0.0f) {
            int length2 = this.f40510t.length;
            for (int i3 = 0; i3 < length2; i3++) {
                float[] fArr = this.f40510t;
                float f5 = fArr[i3];
                if (f5 > 0.0f) {
                    fArr[i3] = f5 / f3;
                }
            }
        }
    }

    public boolean mUb() {
        return this.nr;
    }

    public float n() {
        return this.f40510t[1];
    }

    public float nr() {
        return this.rl[0];
    }

    public float rl() {
        return this.rl[2];
    }

    public float t() {
        return this.f40509n[2];
    }

    public float xMQ() {
        return this.f40509n[1];
    }

    Target() {
        float[] fArr = new float[3];
        this.f40509n = fArr;
        float[] fArr2 = new float[3];
        this.rl = fArr2;
        r(fArr);
        r(fArr2);
        Ik();
    }
}

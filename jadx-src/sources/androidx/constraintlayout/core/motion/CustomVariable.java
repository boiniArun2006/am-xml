package androidx.constraintlayout.core.motion;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class CustomVariable {
    boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f35177O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f35178n;
    private float nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35179t;

    public CustomVariable(CustomVariable customVariable) {
        this.f35179t = Integer.MIN_VALUE;
        this.nr = Float.NaN;
        this.f35177O = null;
        this.f35178n = customVariable.f35178n;
        this.rl = customVariable.rl;
        this.f35179t = customVariable.f35179t;
        this.nr = customVariable.nr;
        this.f35177O = customVariable.f35177O;
        this.J2 = customVariable.J2;
    }

    private static int n(int i2) {
        int i3 = (i2 & (~(i2 >> 31))) - 255;
        return (i3 & (i3 >> 31)) + 255;
    }

    public static String rl(int i2) {
        return "#" + ("00000000" + Integer.toHexString(i2)).substring(r2.length() - 8);
    }

    public void HI(float f3) {
        this.nr = f3;
    }

    public void Ik(MotionWidget motionWidget, float[] fArr) {
        int i2 = this.rl;
        switch (i2) {
            case 900:
                motionWidget.T(this.f35178n, i2, (int) fArr[0]);
                return;
            case 901:
            case 905:
                motionWidget.X(this.f35178n, i2, fArr[0]);
                return;
            case 902:
                motionWidget.T(this.f35178n, this.rl, (n((int) (fArr[3] * 255.0f)) << 24) | (n((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (n((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | n((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case 903:
            case 906:
                throw new RuntimeException("unable to interpolate " + this.f35178n);
            case 904:
                motionWidget.N(this.f35178n, i2, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public int J2() {
        return this.f35179t;
    }

    public String KN() {
        return this.f35177O;
    }

    public float O() {
        return this.nr;
    }

    public String Uo() {
        return this.f35178n;
    }

    public int az() {
        return this.rl != 902 ? 1 : 4;
    }

    public void ck(int i2) {
        this.f35179t = i2;
    }

    public void gh(float[] fArr) {
        switch (this.rl) {
            case 900:
                fArr[0] = this.f35179t;
                return;
            case 901:
                fArr[0] = this.nr;
                return;
            case 902:
                int i2 = (this.f35179t >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                return;
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                fArr[0] = this.J2 ? 1.0f : 0.0f;
                return;
            case 905:
                fArr[0] = this.nr;
                return;
            default:
                return;
        }
    }

    public float mUb() {
        switch (this.rl) {
            case 900:
                return this.f35179t;
            case 901:
                return this.nr;
            case 902:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                return this.J2 ? 1.0f : 0.0f;
            case 905:
                return this.nr;
            default:
                return Float.NaN;
        }
    }

    public boolean nr() {
        return this.J2;
    }

    public void o(float[] fArr) {
        switch (this.rl) {
            case 900:
            case 906:
                this.f35179t = (int) fArr[0];
                return;
            case 901:
            case 905:
                this.nr = fArr[0];
                return;
            case 902:
                this.f35179t = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                this.J2 = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    public boolean qie() {
        int i2 = this.rl;
        return (i2 == 903 || i2 == 904 || i2 == 906) ? false : true;
    }

    public void r(Object obj) {
        switch (this.rl) {
            case 900:
            case 906:
                this.f35179t = ((Integer) obj).intValue();
                break;
            case 901:
                this.nr = ((Float) obj).floatValue();
                break;
            case 902:
                this.f35179t = ((Integer) obj).intValue();
                break;
            case 903:
                this.f35177O = (String) obj;
                break;
            case 904:
                this.J2 = ((Boolean) obj).booleanValue();
                break;
            case 905:
                this.nr = ((Float) obj).floatValue();
                break;
        }
    }

    public CustomVariable t() {
        return new CustomVariable(this);
    }

    public String toString() {
        String str = this.f35178n + ':';
        switch (this.rl) {
            case 900:
                return str + this.f35179t;
            case 901:
                return str + this.nr;
            case 902:
                return str + rl(this.f35179t);
            case 903:
                return str + this.f35177O;
            case 904:
                return str + Boolean.valueOf(this.J2);
            case 905:
                return str + this.nr;
            default:
                return str + "????";
        }
    }

    public void ty(boolean z2) {
        this.J2 = z2;
    }

    public int xMQ() {
        return this.rl;
    }

    public CustomVariable(String str, int i2, int i3) {
        this.f35179t = Integer.MIN_VALUE;
        this.nr = Float.NaN;
        this.f35177O = null;
        this.f35178n = str;
        this.rl = i2;
        if (i2 == 901) {
            this.nr = i3;
        } else {
            this.f35179t = i3;
        }
    }

    public CustomVariable(String str, int i2, float f3) {
        this.f35179t = Integer.MIN_VALUE;
        this.f35177O = null;
        this.f35178n = str;
        this.rl = i2;
        this.nr = f3;
    }

    public CustomVariable(String str, int i2, boolean z2) {
        this.f35179t = Integer.MIN_VALUE;
        this.nr = Float.NaN;
        this.f35177O = null;
        this.f35178n = str;
        this.rl = i2;
        this.J2 = z2;
    }
}

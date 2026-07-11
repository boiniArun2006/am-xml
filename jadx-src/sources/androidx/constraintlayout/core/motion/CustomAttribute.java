package androidx.constraintlayout.core.motion;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class CustomAttribute {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f35166O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AttributeType f35167n;
    boolean nr;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f35168t;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public void n(float[] fArr) {
        switch (this.f35167n) {
            case INT_TYPE:
                fArr[0] = this.rl;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.f35168t;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i2 = (this.f35166O >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.nr ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.f35168t;
                return;
            default:
                return;
        }
    }

    public int rl() {
        int iOrdinal = this.f35167n.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }
}

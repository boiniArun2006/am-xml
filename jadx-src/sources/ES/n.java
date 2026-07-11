package ES;

import android.graphics.PointF;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class n {
    public float J2;
    public int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f2314O;
    public float Uo;
    public PointF az;
    public boolean gh;
    public float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f2315n;
    public j nr;
    public PointF qie;
    public String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f2316t;
    public int xMQ;

    public enum j {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public n(String str, String str2, float f3, j jVar, int i2, float f4, float f5, int i3, int i5, float f6, boolean z2, PointF pointF, PointF pointF2) {
        n(str, str2, f3, jVar, i2, f4, f5, i3, i5, f6, z2, pointF, pointF2);
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f2315n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f2316t)) * 31) + this.nr.ordinal()) * 31) + this.f2314O;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.J2);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.KN;
    }

    public void n(String str, String str2, float f3, j jVar, int i2, float f4, float f5, int i3, int i5, float f6, boolean z2, PointF pointF, PointF pointF2) {
        this.f2315n = str;
        this.rl = str2;
        this.f2316t = f3;
        this.nr = jVar;
        this.f2314O = i2;
        this.J2 = f4;
        this.Uo = f5;
        this.KN = i3;
        this.xMQ = i5;
        this.mUb = f6;
        this.gh = z2;
        this.qie = pointF;
        this.az = pointF2;
    }

    public n() {
    }
}

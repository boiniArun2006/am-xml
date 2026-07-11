package Jff;

import Hh.C;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j f4622n = j.BITMAP_ONLY;
    private boolean rl = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float[] f4623t = null;
    private int nr = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f4621O = 0.0f;
    private int J2 = 0;
    private float Uo = 0.0f;
    private boolean KN = false;
    private boolean xMQ = false;
    private boolean mUb = false;

    public enum j {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public I28 az(float f3) {
        C.t(f3 >= 0.0f, "the border width cannot be < 0");
        this.f4621O = f3;
        return this;
    }

    public I28 ck(float f3) {
        C.t(f3 >= 0.0f, "the padding cannot be < 0");
        this.Uo = f3;
        return this;
    }

    private float[] nr() {
        if (this.f4623t == null) {
            this.f4623t = new float[8];
        }
        return this.f4623t;
    }

    public I28 HI(int i2) {
        this.nr = i2;
        this.f4622n = j.OVERLAY_COLOR;
        return this;
    }

    public I28 Ik(boolean z2) {
        this.rl = z2;
        return this;
    }

    public float J2() {
        return this.Uo;
    }

    public boolean KN() {
        return this.mUb;
    }

    public int O() {
        return this.nr;
    }

    public boolean Uo() {
        return this.xMQ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        I28 i28 = (I28) obj;
        if (this.rl == i28.rl && this.nr == i28.nr && Float.compare(i28.f4621O, this.f4621O) == 0 && this.J2 == i28.J2 && Float.compare(i28.Uo, this.Uo) == 0 && this.f4622n == i28.f4622n && this.KN == i28.KN && this.xMQ == i28.xMQ) {
            return Arrays.equals(this.f4623t, i28.f4623t);
        }
        return false;
    }

    public boolean gh() {
        return this.KN;
    }

    public int hashCode() {
        j jVar = this.f4622n;
        int iHashCode = (((jVar != null ? jVar.hashCode() : 0) * 31) + (this.rl ? 1 : 0)) * 31;
        float[] fArr = this.f4623t;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.nr) * 31;
        float f3 = this.f4621O;
        int iFloatToIntBits = (((iHashCode2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31) + this.J2) * 31;
        float f4 = this.Uo;
        return ((((iFloatToIntBits + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31) + (this.KN ? 1 : 0)) * 31) + (this.xMQ ? 1 : 0);
    }

    public j mUb() {
        return this.f4622n;
    }

    public int n() {
        return this.J2;
    }

    public I28 qie(int i2) {
        this.J2 = i2;
        return this;
    }

    public float rl() {
        return this.f4621O;
    }

    public float[] t() {
        return this.f4623t;
    }

    public boolean xMQ() {
        return this.rl;
    }

    public I28 ty(float f3, float f4, float f5, float f6) {
        float[] fArrNr = nr();
        fArrNr[1] = f3;
        fArrNr[0] = f3;
        fArrNr[3] = f4;
        fArrNr[2] = f4;
        fArrNr[5] = f5;
        fArrNr[4] = f5;
        fArrNr[7] = f6;
        fArrNr[6] = f6;
        return this;
    }
}

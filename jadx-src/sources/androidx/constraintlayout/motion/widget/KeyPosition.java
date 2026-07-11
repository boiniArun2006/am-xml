package androidx.constraintlayout.motion.widget;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class KeyPosition extends KeyPositionBase {
    String KN = null;
    int xMQ = Key.J2;
    int mUb = 0;
    float gh = Float.NaN;
    float qie = Float.NaN;
    float az = Float.NaN;
    float ty = Float.NaN;
    float HI = Float.NaN;
    float ck = Float.NaN;
    int Ik = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35666r = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35665o = Float.NaN;

    private static class Loader {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static SparseIntArray f35667n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f35667n = sparseIntArray;
            sparseIntArray.append(R.styleable.ybf, 1);
            f35667n.append(R.styleable.rVB, 2);
            f35667n.append(R.styleable.C5, 3);
            f35667n.append(R.styleable.xn, 4);
            f35667n.append(R.styleable.fU, 5);
            f35667n.append(R.styleable.NqA, 6);
            f35667n.append(R.styleable.IL, 7);
            f35667n.append(R.styleable.Su, 9);
            f35667n.append(R.styleable.Q0, 8);
            f35667n.append(R.styleable.vH3, 11);
            f35667n.append(R.styleable.f36038ON, 12);
            f35667n.append(R.styleable.Vm, 10);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void n(HashMap map) {
    }

    public void qie(int i2) {
        this.Ik = i2;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: rl */
    public Key clone() {
        return new KeyPosition().t(this);
    }

    public KeyPosition() {
        this.nr = 2;
    }

    public void az(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "transitionEasing":
                this.KN = obj.toString();
                break;
            case "percentWidth":
                this.gh = mUb(obj);
                break;
            case "percentHeight":
                this.qie = mUb(obj);
                break;
            case "drawPath":
                this.mUb = gh(obj);
                break;
            case "sizePercent":
                float fMUb = mUb(obj);
                this.gh = fMUb;
                this.qie = fMUb;
                break;
            case "percentX":
                this.az = mUb(obj);
                break;
            case "percentY":
                this.ty = mUb(obj);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key t(Key key) {
        super.t(key);
        KeyPosition keyPosition = (KeyPosition) key;
        this.KN = keyPosition.KN;
        this.xMQ = keyPosition.xMQ;
        this.mUb = keyPosition.mUb;
        this.gh = keyPosition.gh;
        this.qie = Float.NaN;
        this.az = keyPosition.az;
        this.ty = keyPosition.ty;
        this.HI = keyPosition.HI;
        this.ck = keyPosition.ck;
        this.f35666r = keyPosition.f35666r;
        this.f35665o = keyPosition.f35665o;
        return this;
    }
}

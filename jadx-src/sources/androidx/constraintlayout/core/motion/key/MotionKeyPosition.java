package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class MotionKeyPosition extends MotionKey {
    public float HI;
    public int Ik;
    public String KN;
    public int Uo;
    public float az;
    public float ck;
    public float gh;
    public int mUb;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f35246o;
    public float qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f35247r;
    public float ty;
    public int xMQ;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void J2(HashMap map) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void xMQ(HashSet hashSet) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean O(int i2, String str) {
        if (i2 != 501) {
            return super.O(i2, str);
        }
        this.KN = str.toString();
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: Uo */
    public MotionKey clone() {
        return new MotionKeyPosition().KN(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean rl(int i2, int i3) {
        if (i2 == 100) {
            this.f35236n = i3;
            return true;
        }
        if (i2 == 508) {
            this.Uo = i3;
            return true;
        }
        if (i2 != 510) {
            return super.rl(i2, i3);
        }
        this.Ik = i3;
        return true;
    }

    public MotionKeyPosition() {
        int i2 = MotionKey.J2;
        this.Uo = i2;
        this.KN = null;
        this.xMQ = i2;
        this.mUb = 0;
        this.gh = Float.NaN;
        this.qie = Float.NaN;
        this.az = Float.NaN;
        this.ty = Float.NaN;
        this.HI = Float.NaN;
        this.ck = Float.NaN;
        this.Ik = 0;
        this.f35247r = Float.NaN;
        this.f35246o = Float.NaN;
        this.nr = 2;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey KN(MotionKey motionKey) {
        super.KN(motionKey);
        MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
        this.KN = motionKeyPosition.KN;
        this.xMQ = motionKeyPosition.xMQ;
        this.mUb = motionKeyPosition.mUb;
        this.gh = motionKeyPosition.gh;
        this.qie = Float.NaN;
        this.az = motionKeyPosition.az;
        this.ty = motionKeyPosition.ty;
        this.HI = motionKeyPosition.HI;
        this.ck = motionKeyPosition.ck;
        this.f35247r = motionKeyPosition.f35247r;
        this.f35246o = motionKeyPosition.f35246o;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int n(String str) {
        return TypedValues.PositionType.n(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean t(int i2, float f3) {
        switch (i2) {
            case 503:
                this.gh = f3;
                return true;
            case 504:
                this.qie = f3;
                return true;
            case 505:
                this.gh = f3;
                this.qie = f3;
                return true;
            case 506:
                this.az = f3;
                return true;
            case 507:
                this.ty = f3;
                return true;
            default:
                return super.t(i2, f3);
        }
    }
}

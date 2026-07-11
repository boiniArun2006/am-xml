package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class MotionKey implements TypedValues {
    public static int J2 = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public HashMap f35235O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35236n;
    public int nr;
    int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    String f35237t;

    public abstract void J2(HashMap map);

    @Override // 
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public abstract MotionKey clone();

    public void mUb(HashMap map) {
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean nr(int i2, boolean z2) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean t(int i2, float f3) {
        return false;
    }

    public abstract void xMQ(HashSet hashSet);

    public MotionKey KN(MotionKey motionKey) {
        this.f35236n = motionKey.f35236n;
        this.rl = motionKey.rl;
        this.f35237t = motionKey.f35237t;
        this.nr = motionKey.nr;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean O(int i2, String str) {
        if (i2 != 101) {
            return false;
        }
        this.f35237t = str;
        return true;
    }

    float gh(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    int qie(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean rl(int i2, int i3) {
        if (i2 != 100) {
            return false;
        }
        this.f35236n = i3;
        return true;
    }

    public MotionKey() {
        int i2 = J2;
        this.f35236n = i2;
        this.rl = i2;
        this.f35237t = null;
    }
}

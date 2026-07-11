package androidx.constraintlayout.motion.widget;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Key {
    public static int J2 = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    HashMap f35651O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f35652n;
    protected int nr;
    int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    String f35653t;

    public void Uo(HashMap map) {
    }

    public abstract void n(HashMap map);

    abstract void nr(HashSet hashSet);

    @Override // 
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public abstract Key clone();

    public void J2(int i2) {
        this.f35652n = i2;
    }

    public Key KN(int i2) {
        this.rl = i2;
        return this;
    }

    boolean O(String str) {
        String str2 = this.f35653t;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    int gh(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    float mUb(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public Key t(Key key) {
        this.f35652n = key.f35652n;
        this.rl = key.rl;
        this.f35653t = key.f35653t;
        this.nr = key.nr;
        this.f35651O = key.f35651O;
        return this;
    }

    boolean xMQ(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    public Key() {
        int i2 = J2;
        this.f35652n = i2;
        this.rl = i2;
        this.f35653t = null;
    }
}

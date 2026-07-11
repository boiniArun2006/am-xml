package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public abstract class VersionedParcel {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final ArrayMap f42338n;
    protected final ArrayMap rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final ArrayMap f42339t;

    protected abstract void E2(int i2);

    protected abstract int HI();

    protected abstract Parcelable Ik();

    public boolean J2() {
        return false;
    }

    protected abstract void N(String str);

    protected abstract boolean Uo();

    protected abstract void ViF(boolean z2);

    protected abstract void WPU(int i2);

    protected abstract void X(Parcelable parcelable);

    public void aYN(boolean z2, boolean z3) {
    }

    protected abstract boolean az(int i2);

    protected abstract void g(byte[] bArr);

    protected abstract CharSequence gh();

    protected abstract void iF(CharSequence charSequence);

    protected abstract void n();

    protected abstract String o();

    protected abstract VersionedParcel rl();

    protected abstract byte[] xMQ();

    /* JADX INFO: renamed from: androidx.versionedparcelable.VersionedParcel$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class AnonymousClass1 extends ObjectInputStream {
        @Override // java.io.ObjectInputStream
        protected Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            if (cls != null) {
                return cls;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    private Method O(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.rl.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsT = t(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsT.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.rl.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private Method nr(String str) throws NoSuchMethodException {
        Method method = (Method) this.f42338n.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.f42338n.put(str, declaredMethod);
        return declaredMethod;
    }

    private Class t(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f42339t.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f42339t.put(cls.getName(), cls3);
        return cls3;
    }

    protected void wTp(VersionedParcelable versionedParcelable) {
        if (versionedParcelable == null) {
            N(null);
            return;
        }
        rV9(versionedParcelable);
        VersionedParcel versionedParcelRl = rl();
        s7N(versionedParcelable, versionedParcelRl);
        versionedParcelRl.n();
    }

    public VersionedParcel(ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        this.f42338n = arrayMap;
        this.rl = arrayMap2;
        this.f42339t = arrayMap3;
    }

    private void rV9(VersionedParcelable versionedParcelable) {
        try {
            N(t(versionedParcelable.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(versionedParcelable.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    public boolean KN(boolean z2, int i2) {
        if (!az(i2)) {
            return z2;
        }
        return Uo();
    }

    public VersionedParcelable S(VersionedParcelable versionedParcelable, int i2) {
        if (!az(i2)) {
            return versionedParcelable;
        }
        return XQ();
    }

    public void T(Parcelable parcelable, int i2) {
        WPU(i2);
        X(parcelable);
    }

    protected VersionedParcelable XQ() {
        String strO = o();
        if (strO == null) {
            return null;
        }
        return ty(strO, rl());
    }

    public String Z(String str, int i2) {
        if (!az(i2)) {
            return str;
        }
        return o();
    }

    public int ck(int i2, int i3) {
        if (!az(i3)) {
            return i2;
        }
        return HI();
    }

    public void e(int i2, int i3) {
        WPU(i3);
        E2(i2);
    }

    public void fD(CharSequence charSequence, int i2) {
        WPU(i2);
        iF(charSequence);
    }

    public byte[] mUb(byte[] bArr, int i2) {
        if (!az(i2)) {
            return bArr;
        }
        return xMQ();
    }

    public void nHg(String str, int i2) {
        WPU(i2);
        N(str);
    }

    public void nY(boolean z2, int i2) {
        WPU(i2);
        ViF(z2);
    }

    public CharSequence qie(CharSequence charSequence, int i2) {
        if (!az(i2)) {
            return charSequence;
        }
        return gh();
    }

    public Parcelable r(Parcelable parcelable, int i2) {
        if (!az(i2)) {
            return parcelable;
        }
        return Ik();
    }

    protected void s7N(VersionedParcelable versionedParcelable, VersionedParcel versionedParcel) {
        try {
            O(versionedParcelable.getClass()).invoke(null, versionedParcelable, versionedParcel);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public void te(byte[] bArr, int i2) {
        WPU(i2);
        g(bArr);
    }

    protected VersionedParcelable ty(String str, VersionedParcel versionedParcel) {
        try {
            return (VersionedParcelable) nr(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public void v(VersionedParcelable versionedParcelable, int i2) {
        WPU(i2);
        wTp(versionedParcelable);
    }
}

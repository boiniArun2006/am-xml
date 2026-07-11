package Pj0;

import Hh.C;
import android.graphics.Bitmap;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j implements Cloneable, Closeable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f7747o;
    protected final Throwable J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected final w6 f7749O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f7750n = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final SharedReference f7751t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Class f7748r = j.class;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final fuX f7746Z = new C0274j();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final w6 f7745S = new n();

    public interface w6 {
        void n(SharedReference sharedReference, Throwable th);

        boolean rl();
    }

    protected j(SharedReference sharedReference, w6 w6Var, Throwable th) {
        this.f7751t = (SharedReference) C.Uo(sharedReference);
        sharedReference.rl();
        this.f7749O = w6Var;
        this.J2 = th;
    }

    public static j fcU(Object obj, fuX fux, w6 w6Var) {
        if (obj == null) {
            return null;
        }
        return n1(obj, fux, w6Var, w6Var.rl() ? new Throwable() : null);
    }

    public static j z(Closeable closeable, w6 w6Var) {
        if (closeable == null) {
            return null;
        }
        return n1(closeable, f7746Z, w6Var, w6Var.rl() ? new Throwable() : null);
    }

    public synchronized j Z() {
        if (!isValid()) {
            return null;
        }
        return clone();
    }

    public void close() {
        synchronized (this) {
            try {
                if (this.f7750n) {
                    return;
                }
                this.f7750n = true;
                this.f7751t.nr();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized Object eF() {
        C.xMQ(!this.f7750n);
        return C.Uo(this.f7751t.J2());
    }

    public synchronized boolean isValid() {
        return !this.f7750n;
    }

    /* JADX INFO: renamed from: rl */
    public abstract j clone();

    /* JADX INFO: renamed from: Pj0.j$j, reason: collision with other inner class name */
    class C0274j implements fuX {
        @Override // Pj0.fuX
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(Closeable closeable) {
            try {
                Hh.n.n(closeable, true);
            } catch (IOException unused) {
            }
        }

        C0274j() {
        }
    }

    class n implements w6 {
        @Override // Pj0.j.w6
        public boolean rl() {
            return false;
        }

        n() {
        }

        @Override // Pj0.j.w6
        public void n(SharedReference sharedReference, Throwable th) {
            String name;
            Object objJ2 = sharedReference.J2();
            Class cls = j.f7748r;
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            Integer numValueOf2 = Integer.valueOf(System.identityHashCode(sharedReference));
            if (objJ2 == null) {
                name = null;
            } else {
                name = objJ2.getClass().getName();
            }
            Dzy.j.WPU(cls, "Finalized without closing: %x %x (type = %s)", numValueOf, numValueOf2, name);
        }
    }

    public static boolean FX(j jVar) {
        return jVar != null && jVar.isValid();
    }

    public static void M7(j jVar) {
        if (jVar != null) {
            jVar.close();
        }
    }

    public static j Mx(Object obj, fuX fux) {
        return fcU(obj, fux, f7745S);
    }

    public static j T(j jVar) {
        if (jVar != null) {
            return jVar.Z();
        }
        return null;
    }

    public static List U(Collection collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(T((j) it.next()));
        }
        return arrayList;
    }

    public static j a(Closeable closeable) {
        return Mx(closeable, f7746Z);
    }

    public static j n1(Object obj, fuX fux, w6 w6Var, Throwable th) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Bitmap) || (obj instanceof Ml)) {
            int i2 = f7747o;
            if (i2 == 1) {
                return new Pj0.w6(obj, fux, w6Var, th);
            }
            if (i2 == 2) {
                return new CN3(obj, fux, w6Var, th);
            }
            if (i2 == 3) {
                return new I28(obj);
            }
        }
        return new Pj0.n(obj, fux, w6Var, th);
    }

    public static void p5(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                M7((j) it.next());
            }
        }
    }

    public int M() {
        if (isValid()) {
            return System.identityHashCode(this.f7751t.J2());
        }
        return 0;
    }

    protected j(Object obj, fuX fux, w6 w6Var, Throwable th, boolean z2) {
        this.f7751t = new SharedReference(obj, fux, z2);
        this.f7749O = w6Var;
        this.J2 = th;
    }
}

package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.view.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class FragmentTransaction {
    CharSequence HI;
    ArrayList Ik;
    int J2;
    int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f38642O;
    int Uo;
    CharSequence az;
    ArrayList ck;
    String gh;
    boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FragmentFactory f38643n;
    int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList f38644o;
    int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f38645r;
    private final ClassLoader rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ArrayList f38646t;
    int ty;
    boolean xMQ;

    static final class Op {
        int J2;
        Lifecycle.State KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f38647O;
        int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f38648n;
        int nr;
        Fragment rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f38649t;
        Lifecycle.State xMQ;

        Op() {
        }

        Op(int i2, Fragment fragment) {
            this.f38648n = i2;
            this.rl = fragment;
            this.f38649t = false;
            Lifecycle.State state = Lifecycle.State.f38884r;
            this.KN = state;
            this.xMQ = state;
        }

        Op(int i2, Fragment fragment, boolean z2) {
            this.f38648n = i2;
            this.rl = fragment;
            this.f38649t = z2;
            Lifecycle.State state = Lifecycle.State.f38884r;
            this.KN = state;
            this.xMQ = state;
        }

        Op(int i2, Fragment fragment, Lifecycle.State state) {
            this.f38648n = i2;
            this.rl = fragment;
            this.f38649t = false;
            this.KN = fragment.mMaxState;
            this.xMQ = state;
        }

        Op(Op op) {
            this.f38648n = op.f38648n;
            this.rl = op.rl;
            this.f38649t = op.f38649t;
            this.nr = op.nr;
            this.f38647O = op.f38647O;
            this.J2 = op.J2;
            this.Uo = op.Uo;
            this.KN = op.KN;
            this.xMQ = op.xMQ;
        }
    }

    FragmentTransaction(FragmentFactory fragmentFactory, ClassLoader classLoader) {
        this.f38646t = new ArrayList();
        this.mUb = true;
        this.f38645r = false;
        this.f38643n = fragmentFactory;
        this.rl = classLoader;
    }

    public FragmentTransaction O(Fragment fragment, String str) {
        ck(0, fragment, str, 1);
        return this;
    }

    public FragmentTransaction S(int i2, int i3) {
        return WPU(i2, i3, 0, 0);
    }

    public abstract void az();

    public abstract int gh();

    public abstract int mUb();

    public FragmentTransaction o(int i2, Fragment fragment) {
        return Z(i2, fragment, null);
    }

    public abstract void qie();

    public FragmentTransaction rl(int i2, Fragment fragment) {
        ck(i2, fragment, null, 1);
        return this;
    }

    public FragmentTransaction t(int i2, Fragment fragment, String str) {
        ck(i2, fragment, str, 1);
        return this;
    }

    public FragmentTransaction HI() {
        if (this.xMQ) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.mUb = false;
        return this;
    }

    public boolean Ik() {
        return this.f38646t.isEmpty();
    }

    void J2(Op op) {
        this.f38646t.add(op);
        op.nr = this.nr;
        op.f38647O = this.f38642O;
        op.J2 = this.J2;
        op.Uo = this.Uo;
    }

    public FragmentTransaction KN(String str) {
        if (!this.mUb) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.xMQ = true;
        this.gh = str;
        return this;
    }

    public FragmentTransaction ViF(Fragment fragment) {
        J2(new Op(8, fragment));
        return this;
    }

    public FragmentTransaction WPU(int i2, int i3, int i5, int i7) {
        this.nr = i2;
        this.f38642O = i3;
        this.J2 = i5;
        this.Uo = i7;
        return this;
    }

    FragmentTransaction XQ(boolean z2, Runnable runnable) {
        if (!z2) {
            HI();
        }
        if (this.f38644o == null) {
            this.f38644o = new ArrayList();
        }
        this.f38644o.add(runnable);
        return this;
    }

    public FragmentTransaction Z(int i2, Fragment fragment, String str) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        ck(i2, fragment, str, 2);
        return this;
    }

    public FragmentTransaction aYN(Fragment fragment, Lifecycle.State state) {
        J2(new Op(10, fragment, state));
        return this;
    }

    void ck(int i2, Fragment fragment, String str, int i3) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.KN(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i5 = fragment.mFragmentId;
            if (i5 != 0 && i5 != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
            }
            fragment.mFragmentId = i2;
            fragment.mContainerId = i2;
        }
        J2(new Op(i3, fragment));
    }

    public FragmentTransaction g(int i2) {
        this.KN = i2;
        return this;
    }

    public FragmentTransaction nY(boolean z2) {
        this.f38645r = z2;
        return this;
    }

    public final FragmentTransaction nr(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        return t(viewGroup.getId(), fragment, str);
    }

    public FragmentTransaction r(Fragment fragment) {
        J2(new Op(3, fragment));
        return this;
    }

    public FragmentTransaction ty(Fragment fragment) {
        J2(new Op(6, fragment));
        return this;
    }

    public FragmentTransaction xMQ(Fragment fragment) {
        J2(new Op(7, fragment));
        return this;
    }

    public FragmentTransaction Uo(View view, String str) {
        if (FragmentTransition.J2()) {
            String strN = ViewCompat.N(view);
            if (strN != null) {
                if (this.ck == null) {
                    this.ck = new ArrayList();
                    this.Ik = new ArrayList();
                } else if (!this.Ik.contains(str)) {
                    if (this.ck.contains(strN)) {
                        throw new IllegalArgumentException("A shared element with the source name '" + strN + "' has already been added to the transaction.");
                    }
                } else {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                this.ck.add(strN);
                this.Ik.add(str);
                return this;
            }
            throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
        }
        return this;
    }

    FragmentTransaction(FragmentFactory fragmentFactory, ClassLoader classLoader, FragmentTransaction fragmentTransaction) {
        this(fragmentFactory, classLoader);
        Iterator it = fragmentTransaction.f38646t.iterator();
        while (it.hasNext()) {
            this.f38646t.add(new Op((Op) it.next()));
        }
        this.nr = fragmentTransaction.nr;
        this.f38642O = fragmentTransaction.f38642O;
        this.J2 = fragmentTransaction.J2;
        this.Uo = fragmentTransaction.Uo;
        this.KN = fragmentTransaction.KN;
        this.xMQ = fragmentTransaction.xMQ;
        this.mUb = fragmentTransaction.mUb;
        this.gh = fragmentTransaction.gh;
        this.ty = fragmentTransaction.ty;
        this.HI = fragmentTransaction.HI;
        this.qie = fragmentTransaction.qie;
        this.az = fragmentTransaction.az;
        if (fragmentTransaction.ck != null) {
            ArrayList arrayList = new ArrayList();
            this.ck = arrayList;
            arrayList.addAll(fragmentTransaction.ck);
        }
        if (fragmentTransaction.Ik != null) {
            ArrayList arrayList2 = new ArrayList();
            this.Ik = arrayList2;
            arrayList2.addAll(fragmentTransaction.Ik);
        }
        this.f38645r = fragmentTransaction.f38645r;
    }
}

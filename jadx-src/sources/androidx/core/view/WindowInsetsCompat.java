package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class WindowInsetsCompat {
    public static final WindowInsetsCompat rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Impl f36820n;

    @RequiresApi
    static class Api21ReflectionHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static Field f36821n;
        private static boolean nr;
        private static Field rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static Field f36822t;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f36821n = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                rl = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f36822t = declaredField3;
                declaredField3.setAccessible(true);
                nr = true;
            } catch (ReflectiveOperationException e2) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
            }
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final BuilderImpl f36823n;

        public Builder() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                this.f36823n = new BuilderImpl34();
                return;
            }
            if (i2 >= 30) {
                this.f36823n = new BuilderImpl30();
            } else if (i2 >= 29) {
                this.f36823n = new BuilderImpl29();
            } else {
                this.f36823n = new BuilderImpl20();
            }
        }

        public WindowInsetsCompat n() {
            return this.f36823n.rl();
        }

        public Builder nr(Insets insets) {
            this.f36823n.Uo(insets);
            return this;
        }

        public Builder rl(int i2, Insets insets) {
            this.f36823n.t(i2, insets);
            return this;
        }

        public Builder t(Insets insets) {
            this.f36823n.O(insets);
            return this;
        }

        public Builder(WindowInsetsCompat windowInsetsCompat) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                this.f36823n = new BuilderImpl34(windowInsetsCompat);
                return;
            }
            if (i2 >= 30) {
                this.f36823n = new BuilderImpl30(windowInsetsCompat);
            } else if (i2 >= 29) {
                this.f36823n = new BuilderImpl29(windowInsetsCompat);
            } else {
                this.f36823n = new BuilderImpl20(windowInsetsCompat);
            }
        }
    }

    private static class BuilderImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WindowInsetsCompat f36824n;
        Insets[] rl;

        BuilderImpl() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        void J2(Insets insets) {
        }

        void KN(Insets insets) {
        }

        void O(Insets insets) {
        }

        void Uo(Insets insets) {
        }

        void nr(Insets insets) {
        }

        BuilderImpl(WindowInsetsCompat windowInsetsCompat) {
            this.f36824n = windowInsetsCompat;
        }

        protected final void n() {
            Insets[] insetsArr = this.rl;
            if (insetsArr != null) {
                Insets insetsJ2 = insetsArr[Type.O(1)];
                Insets insetsJ22 = this.rl[Type.O(2)];
                if (insetsJ22 == null) {
                    insetsJ22 = this.f36824n.J2(2);
                }
                if (insetsJ2 == null) {
                    insetsJ2 = this.f36824n.J2(1);
                }
                Uo(Insets.n(insetsJ2, insetsJ22));
                Insets insets = this.rl[Type.O(16)];
                if (insets != null) {
                    J2(insets);
                }
                Insets insets2 = this.rl[Type.O(32)];
                if (insets2 != null) {
                    nr(insets2);
                }
                Insets insets3 = this.rl[Type.O(64)];
                if (insets3 != null) {
                    KN(insets3);
                }
            }
        }

        void t(int i2, Insets insets) {
            if (this.rl == null) {
                this.rl = new Insets[10];
            }
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    this.rl[Type.O(i3)] = insets;
                }
            }
        }

        WindowInsetsCompat rl() {
            n();
            return this.f36824n;
        }
    }

    @RequiresApi
    private static class BuilderImpl20 extends BuilderImpl {
        private static boolean J2;
        private static boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static Field f36825O;
        private static Constructor Uo;
        private Insets nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private WindowInsets f36826t;

        BuilderImpl20() {
            this.f36826t = xMQ();
        }

        private static WindowInsets xMQ() {
            if (!J2) {
                try {
                    f36825O = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                J2 = true;
            }
            Field field = f36825O;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!KN) {
                try {
                    Uo = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                KN = true;
            }
            Constructor constructor = Uo;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void O(Insets insets) {
            this.nr = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void Uo(Insets insets) {
            WindowInsets windowInsets = this.f36826t;
            if (windowInsets != null) {
                this.f36826t = windowInsets.replaceSystemWindowInsets(insets.f36410n, insets.rl, insets.f36411t, insets.nr);
            }
        }

        BuilderImpl20(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f36826t = windowInsetsCompat.nY();
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        WindowInsetsCompat rl() {
            n();
            WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(this.f36826t);
            windowInsetsCompatG.XQ(this.rl);
            windowInsetsCompatG.aYN(this.nr);
            return windowInsetsCompatG;
        }
    }

    @RequiresApi
    private static class BuilderImpl29 extends BuilderImpl {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final WindowInsets.Builder f36827t;

        BuilderImpl29() {
            this.f36827t = androidx.core.splashscreen.w6.n();
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void J2(Insets insets) {
            this.f36827t.setSystemGestureInsets(insets.J2());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void KN(Insets insets) {
            this.f36827t.setTappableElementInsets(insets.J2());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void O(Insets insets) {
            this.f36827t.setStableInsets(insets.J2());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void Uo(Insets insets) {
            this.f36827t.setSystemWindowInsets(insets.J2());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void nr(Insets insets) {
            this.f36827t.setMandatorySystemGestureInsets(insets.J2());
        }

        BuilderImpl29(WindowInsetsCompat windowInsetsCompat) {
            WindowInsets.Builder builderN;
            super(windowInsetsCompat);
            WindowInsets windowInsetsNY = windowInsetsCompat.nY();
            if (windowInsetsNY != null) {
                builderN = Md.n(windowInsetsNY);
            } else {
                builderN = androidx.core.splashscreen.w6.n();
            }
            this.f36827t = builderN;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        WindowInsetsCompat rl() {
            n();
            WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(this.f36827t.build());
            windowInsetsCompatG.XQ(this.rl);
            return windowInsetsCompatG;
        }
    }

    @RequiresApi
    private static class BuilderImpl30 extends BuilderImpl29 {
        BuilderImpl30() {
        }

        BuilderImpl30(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void t(int i2, Insets insets) {
            this.f36827t.setInsets(TypeImpl30.n(i2), insets.J2());
        }
    }

    @RequiresApi
    private static class BuilderImpl34 extends BuilderImpl30 {
        BuilderImpl34() {
        }

        BuilderImpl34(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void t(int i2, Insets insets) {
            this.f36827t.setInsets(TypeImpl34.n(i2), insets.J2());
        }
    }

    private static class Impl {
        static final WindowInsetsCompat rl = new Builder().n().n().rl().t();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final WindowInsetsCompat f36828n;

        boolean HI() {
            return false;
        }

        boolean Ik(int i2) {
            return true;
        }

        DisplayCutoutCompat J2() {
            return null;
        }

        void O(WindowInsetsCompat windowInsetsCompat) {
        }

        void S(int i2) {
        }

        public void XQ(Insets insets) {
        }

        void Z(WindowInsetsCompat windowInsetsCompat) {
        }

        boolean ck() {
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl)) {
                return false;
            }
            Impl impl = (Impl) obj;
            return ck() == impl.ck() && HI() == impl.HI() && ObjectsCompat.n(qie(), impl.qie()) && ObjectsCompat.n(mUb(), impl.mUb()) && ObjectsCompat.n(J2(), impl.J2());
        }

        void nr(View view) {
        }

        void o(Insets insets) {
        }

        public void r(Insets[] insetsArr) {
        }

        Insets KN(int i2) {
            if ((i2 & 8) == 0) {
                return Insets.f36409O;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        Insets Uo(int i2) {
            return Insets.f36409O;
        }

        Insets mUb() {
            return Insets.f36409O;
        }

        WindowInsetsCompat n() {
            return this.f36828n;
        }

        Insets qie() {
            return Insets.f36409O;
        }

        WindowInsetsCompat rl() {
            return this.f36828n;
        }

        WindowInsetsCompat t() {
            return this.f36828n;
        }

        WindowInsetsCompat ty(int i2, int i3, int i5, int i7) {
            return rl;
        }

        Impl(WindowInsetsCompat windowInsetsCompat) {
            this.f36828n = windowInsetsCompat;
        }

        Insets az() {
            return qie();
        }

        Insets gh() {
            return qie();
        }

        public int hashCode() {
            return ObjectsCompat.rl(Boolean.valueOf(ck()), Boolean.valueOf(HI()), qie(), mUb(), J2());
        }

        Insets xMQ() {
            return qie();
        }
    }

    @RequiresApi
    private static class Impl20 extends Impl {
        private static Field az;
        private static Class gh;
        private static Method mUb;
        private static Field qie;
        private static boolean xMQ;
        private WindowInsetsCompat J2;
        int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Insets f36829O;
        Insets Uo;
        private Insets[] nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final WindowInsets f36830t;

        Impl20(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f36829O = null;
            this.f36830t = windowInsets;
        }

        static boolean iF(int i2, int i3) {
            return (i2 & 6) == (i3 & 6);
        }

        private static void te() {
            try {
                mUb = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                gh = cls;
                qie = cls.getDeclaredField("mVisibleInsets");
                az = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                qie.setAccessible(true);
                az.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
            xMQ = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean Ik(int i2) {
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i2 & i3) != 0 && !g(i3)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets KN(int i2) {
            return WPU(i2, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets Uo(int i2) {
            return WPU(i2, false);
        }

        protected Insets aYN(int i2, boolean z2) {
            Insets insetsKN;
            int i3;
            if (i2 == 1) {
                return z2 ? Insets.t(0, Math.max(ViF().rl, qie().rl), 0, 0) : (this.KN & 4) != 0 ? Insets.f36409O : Insets.t(0, qie().rl, 0, 0);
            }
            if (i2 == 2) {
                if (z2) {
                    Insets insetsViF = ViF();
                    Insets insetsMUb = mUb();
                    return Insets.t(Math.max(insetsViF.f36410n, insetsMUb.f36410n), 0, Math.max(insetsViF.f36411t, insetsMUb.f36411t), Math.max(insetsViF.nr, insetsMUb.nr));
                }
                if ((this.KN & 2) != 0) {
                    return Insets.f36409O;
                }
                Insets insetsQie = qie();
                WindowInsetsCompat windowInsetsCompat = this.J2;
                insetsKN = windowInsetsCompat != null ? windowInsetsCompat.KN() : null;
                int iMin = insetsQie.nr;
                if (insetsKN != null) {
                    iMin = Math.min(iMin, insetsKN.nr);
                }
                return Insets.t(insetsQie.f36410n, 0, insetsQie.f36411t, iMin);
            }
            if (i2 != 8) {
                if (i2 == 16) {
                    return gh();
                }
                if (i2 == 32) {
                    return xMQ();
                }
                if (i2 == 64) {
                    return az();
                }
                if (i2 != 128) {
                    return Insets.f36409O;
                }
                WindowInsetsCompat windowInsetsCompat2 = this.J2;
                DisplayCutoutCompat displayCutoutCompatO = windowInsetsCompat2 != null ? windowInsetsCompat2.O() : J2();
                return displayCutoutCompatO != null ? Insets.t(displayCutoutCompatO.rl(), displayCutoutCompatO.nr(), displayCutoutCompatO.t(), displayCutoutCompatO.n()) : Insets.f36409O;
            }
            Insets[] insetsArr = this.nr;
            insetsKN = insetsArr != null ? insetsArr[Type.O(8)] : null;
            if (insetsKN != null) {
                return insetsKN;
            }
            Insets insetsQie2 = qie();
            Insets insetsViF2 = ViF();
            int i5 = insetsQie2.nr;
            if (i5 > insetsViF2.nr) {
                return Insets.t(0, 0, 0, i5);
            }
            Insets insets = this.Uo;
            return (insets == null || insets.equals(Insets.f36409O) || (i3 = this.Uo.nr) <= insetsViF2.nr) ? Insets.f36409O : Insets.t(0, 0, 0, i3);
        }

        protected boolean g(int i2) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 8 && i2 != 128) {
                    return true;
                }
            }
            return !aYN(i2, false).equals(Insets.f36409O);
        }

        private Insets ViF() {
            WindowInsetsCompat windowInsetsCompat = this.J2;
            return windowInsetsCompat != null ? windowInsetsCompat.KN() : Insets.f36409O;
        }

        private Insets WPU(int i2, boolean z2) {
            Insets insetsN = Insets.f36409O;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    insetsN = Insets.n(insetsN, aYN(i3, z2));
                }
            }
            return insetsN;
        }

        private Insets nY(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!xMQ) {
                te();
            }
            Method method = mUb;
            if (method != null && gh != null && qie != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) qie.get(az.get(objInvoke));
                    if (rect != null) {
                        return Insets.nr(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void O(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.WPU(this.J2);
            windowInsetsCompat.S(this.Uo);
            windowInsetsCompat.ViF(this.KN);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void S(int i2) {
            this.KN = i2;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void Z(WindowInsetsCompat windowInsetsCompat) {
            this.J2 = windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean ck() {
            return this.f36830t.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void o(Insets insets) {
            this.Uo = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final Insets qie() {
            if (this.f36829O == null) {
                this.f36829O = Insets.t(this.f36830t.getSystemWindowInsetLeft(), this.f36830t.getSystemWindowInsetTop(), this.f36830t.getSystemWindowInsetRight(), this.f36830t.getSystemWindowInsetBottom());
            }
            return this.f36829O;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void r(Insets[] insetsArr) {
            this.nr = insetsArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat ty(int i2, int i3, int i5, int i7) {
            Builder builder = new Builder(WindowInsetsCompat.g(this.f36830t));
            builder.nr(WindowInsetsCompat.Ik(qie(), i2, i3, i5, i7));
            builder.t(WindowInsetsCompat.Ik(mUb(), i2, i3, i5, i7));
            return builder.n();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            Impl20 impl20 = (Impl20) obj;
            if (!Objects.equals(this.Uo, impl20.Uo) || !iF(this.KN, impl20.KN)) {
                return false;
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void nr(View view) {
            Insets insetsNY = nY(view);
            if (insetsNY == null) {
                insetsNY = Insets.f36409O;
            }
            o(insetsNY);
        }

        Impl20(WindowInsetsCompat windowInsetsCompat, Impl20 impl20) {
            this(windowInsetsCompat, new WindowInsets(impl20.f36830t));
        }
    }

    @RequiresApi
    private static class Impl21 extends Impl20 {
        private Insets ty;

        Impl21(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.ty = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean HI() {
            return this.f36830t.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void XQ(Insets insets) {
            this.ty = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final Insets mUb() {
            if (this.ty == null) {
                this.ty = Insets.t(this.f36830t.getStableInsetLeft(), this.f36830t.getStableInsetTop(), this.f36830t.getStableInsetRight(), this.f36830t.getStableInsetBottom());
            }
            return this.ty;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat rl() {
            return WindowInsetsCompat.g(this.f36830t.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat t() {
            return WindowInsetsCompat.g(this.f36830t.consumeSystemWindowInsets());
        }

        Impl21(WindowInsetsCompat windowInsetsCompat, Impl21 impl21) {
            super(windowInsetsCompat, impl21);
            this.ty = null;
            this.ty = impl21.ty;
        }
    }

    @RequiresApi
    private static class Impl28 extends Impl21 {
        Impl28(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl28)) {
                return false;
            }
            Impl28 impl28 = (Impl28) obj;
            return Objects.equals(this.f36830t, impl28.f36830t) && Objects.equals(this.Uo, impl28.Uo) && Impl20.iF(this.KN, impl28.KN);
        }

        Impl28(WindowInsetsCompat windowInsetsCompat, Impl28 impl28) {
            super(windowInsetsCompat, impl28);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        DisplayCutoutCompat J2() {
            return DisplayCutoutCompat.J2(this.f36830t.getDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.f36830t.hashCode();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat n() {
            return WindowInsetsCompat.g(this.f36830t.consumeDisplayCutout());
        }
    }

    @RequiresApi
    private static class Impl29 extends Impl28 {
        private Insets HI;
        private Insets Ik;
        private Insets ck;

        Impl29(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.HI = null;
            this.ck = null;
            this.Ik = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void XQ(Insets insets) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        Insets az() {
            if (this.Ik == null) {
                this.Ik = Insets.O(this.f36830t.getTappableElementInsets());
            }
            return this.Ik;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        Insets gh() {
            if (this.HI == null) {
                this.HI = Insets.O(this.f36830t.getSystemGestureInsets());
            }
            return this.HI;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat ty(int i2, int i3, int i5, int i7) {
            return WindowInsetsCompat.g(this.f36830t.inset(i2, i3, i5, i7));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        Insets xMQ() {
            if (this.ck == null) {
                this.ck = Insets.O(this.f36830t.getMandatorySystemGestureInsets());
            }
            return this.ck;
        }

        Impl29(WindowInsetsCompat windowInsetsCompat, Impl29 impl29) {
            super(windowInsetsCompat, impl29);
            this.HI = null;
            this.ck = null;
            this.Ik = null;
        }
    }

    @RequiresApi
    private static class Impl30 extends Impl29 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final WindowInsetsCompat f36831r = WindowInsetsCompat.g(WindowInsets.CONSUMED);

        Impl30(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        final void nr(View view) {
        }

        Impl30(WindowInsetsCompat windowInsetsCompat, Impl30 impl30) {
            super(windowInsetsCompat, impl30);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean Ik(int i2) {
            return this.f36830t.isVisible(TypeImpl30.n(i2));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets KN(int i2) {
            return Insets.O(this.f36830t.getInsetsIgnoringVisibility(TypeImpl30.n(i2)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets Uo(int i2) {
            return Insets.O(this.f36830t.getInsets(TypeImpl30.n(i2)));
        }
    }

    @RequiresApi
    private static class Impl34 extends Impl30 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final WindowInsetsCompat f36832o = WindowInsetsCompat.g(WindowInsets.CONSUMED);

        Impl34(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl34(WindowInsetsCompat windowInsetsCompat, Impl34 impl34) {
            super(windowInsetsCompat, impl34);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean Ik(int i2) {
            return this.f36830t.isVisible(TypeImpl34.n(i2));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets KN(int i2) {
            return Insets.O(this.f36830t.getInsetsIgnoringVisibility(TypeImpl34.n(i2)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets Uo(int i2) {
            return Insets.O(this.f36830t.getInsets(TypeImpl34.n(i2)));
        }
    }

    public static final class Side {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface InsetsSide {
        }
    }

    public static final class Type {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface InsetsType {
        }

        public static int J2() {
            return 32;
        }

        public static int KN() {
            return 1;
        }

        static int O(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            if (i2 == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
        }

        public static int Uo() {
            return 2;
        }

        public static int gh() {
            return 64;
        }

        public static int mUb() {
            return 16;
        }

        static int n() {
            return -1;
        }

        public static int nr() {
            return 8;
        }

        public static int rl() {
            return 4;
        }

        public static int t() {
            return 128;
        }

        public static int xMQ() {
            return 519;
        }
    }

    @RequiresApi
    private static final class TypeImpl30 {
        static int n(int i2) {
            int iStatusBars;
            int i3 = 0;
            for (int i5 = 1; i5 <= 512; i5 <<= 1) {
                if ((i2 & i5) != 0) {
                    if (i5 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i5 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i5 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i5 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i5 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i5 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i5 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i5 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i3 |= iStatusBars;
                }
            }
            return i3;
        }
    }

    @RequiresApi
    private static final class TypeImpl34 {
        static int n(int i2) {
            int iStatusBars;
            int i3 = 0;
            for (int i5 = 1; i5 <= 512; i5 <<= 1) {
                if ((i2 & i5) != 0) {
                    if (i5 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i5 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i5 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i5 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i5 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i5 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i5 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i5 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i5 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i3 |= iStatusBars;
                }
            }
            return i3;
        }
    }

    private WindowInsetsCompat(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            this.f36820n = new Impl34(this, windowInsets);
            return;
        }
        if (i2 >= 30) {
            this.f36820n = new Impl30(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f36820n = new Impl29(this, windowInsets);
        } else if (i2 >= 28) {
            this.f36820n = new Impl28(this, windowInsets);
        } else {
            this.f36820n = new Impl21(this, windowInsets);
        }
    }

    public static WindowInsetsCompat g(WindowInsets windowInsets) {
        return te(windowInsets, null);
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            rl = Impl34.f36832o;
        } else if (i2 >= 30) {
            rl = Impl30.f36831r;
        } else {
            rl = Impl.rl;
        }
    }

    static Insets Ik(Insets insets, int i2, int i3, int i5, int i7) {
        int iMax = Math.max(0, insets.f36410n - i2);
        int iMax2 = Math.max(0, insets.rl - i3);
        int iMax3 = Math.max(0, insets.f36411t - i5);
        int iMax4 = Math.max(0, insets.nr - i7);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i5 && iMax4 == i7) ? insets : Insets.t(iMax, iMax2, iMax3, iMax4);
    }

    public static WindowInsetsCompat te(WindowInsets windowInsets, View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat((WindowInsets) Preconditions.Uo(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            windowInsetsCompat.WPU(ViewCompat.X(view));
            windowInsetsCompat.nr(view.getRootView());
            windowInsetsCompat.ViF(view.getWindowSystemUiVisibility());
        }
        return windowInsetsCompat;
    }

    public boolean HI() {
        return !this.f36820n.qie().equals(Insets.f36409O);
    }

    public Insets J2(int i2) {
        return this.f36820n.Uo(i2);
    }

    public Insets KN() {
        return this.f36820n.mUb();
    }

    public DisplayCutoutCompat O() {
        return this.f36820n.J2();
    }

    void S(Insets insets) {
        this.f36820n.o(insets);
    }

    public Insets Uo(int i2) {
        return this.f36820n.KN(i2);
    }

    void ViF(int i2) {
        this.f36820n.S(i2);
    }

    void WPU(WindowInsetsCompat windowInsetsCompat) {
        this.f36820n.Z(windowInsetsCompat);
    }

    void XQ(Insets[] insetsArr) {
        this.f36820n.r(insetsArr);
    }

    public WindowInsetsCompat Z(int i2, int i3, int i5, int i7) {
        return new Builder(this).nr(Insets.t(i2, i3, i5, i7)).n();
    }

    void aYN(Insets insets) {
        this.f36820n.XQ(insets);
    }

    public int az() {
        return this.f36820n.qie().rl;
    }

    public WindowInsetsCompat ck(int i2, int i3, int i5, int i7) {
        return this.f36820n.ty(i2, i3, i5, i7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return ObjectsCompat.n(this.f36820n, ((WindowInsetsCompat) obj).f36820n);
        }
        return false;
    }

    public int gh() {
        return this.f36820n.qie().f36410n;
    }

    public int hashCode() {
        Impl impl = this.f36820n;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    public int mUb() {
        return this.f36820n.qie().nr;
    }

    public WindowInsetsCompat n() {
        return this.f36820n.n();
    }

    public WindowInsets nY() {
        Impl impl = this.f36820n;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).f36830t;
        }
        return null;
    }

    void nr(View view) {
        this.f36820n.nr(view);
    }

    public boolean o(int i2) {
        return this.f36820n.Ik(i2);
    }

    public int qie() {
        return this.f36820n.qie().f36411t;
    }

    public boolean r() {
        return this.f36820n.HI();
    }

    public WindowInsetsCompat rl() {
        return this.f36820n.rl();
    }

    public WindowInsetsCompat t() {
        return this.f36820n.t();
    }

    public Insets xMQ() {
        return this.f36820n.gh();
    }

    public boolean ty() {
        Insets insetsJ2 = J2(Type.n());
        Insets insets = Insets.f36409O;
        if (insetsJ2.equals(insets) && Uo(Type.n() ^ Type.nr()).equals(insets) && O() == null) {
            return false;
        }
        return true;
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            Impl impl = windowInsetsCompat.f36820n;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34 && (impl instanceof Impl34)) {
                this.f36820n = new Impl34(this, (Impl34) impl);
            } else if (i2 >= 30 && (impl instanceof Impl30)) {
                this.f36820n = new Impl30(this, (Impl30) impl);
            } else if (i2 >= 29 && (impl instanceof Impl29)) {
                this.f36820n = new Impl29(this, (Impl29) impl);
            } else if (i2 >= 28 && (impl instanceof Impl28)) {
                this.f36820n = new Impl28(this, (Impl28) impl);
            } else if (impl instanceof Impl21) {
                this.f36820n = new Impl21(this, (Impl21) impl);
            } else if (impl instanceof Impl20) {
                this.f36820n = new Impl20(this, (Impl20) impl);
            } else {
                this.f36820n = new Impl(this);
            }
            impl.O(this);
            return;
        }
        this.f36820n = new Impl(this);
    }
}

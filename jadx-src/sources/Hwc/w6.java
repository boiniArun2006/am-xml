package Hwc;

import android.content.Context;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.reflect.InvocationTargetException;
import ln.Q;
import ln.QJ;
import ln.UGc;
import ln.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Class f4000n = w6.class;
    private static Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile boolean f4001t;

    public static void nr(Context context, l3D l3d, n nVar) {
        O(context, l3d, nVar, true);
    }

    public static void t(Context context, l3D l3d) {
        nr(context, l3d, null);
    }

    public static I28 Uo() {
        return rl.get();
    }

    private static void J2(Context context, n nVar) {
        if (T5.n.nr()) {
            T5.n.n("Fresco.initializeDrawee");
        }
        Wre wre = new Wre(context, nVar);
        rl = wre;
        SimpleDraweeView.xMQ(wre);
        if (T5.n.nr()) {
            T5.n.rl();
        }
    }

    public static void O(Context context, l3D l3d, n nVar, boolean z2) {
        if (T5.n.nr()) {
            T5.n.n("Fresco#initialize");
        }
        if (f4001t) {
            Dzy.j.XQ(f4000n, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f4001t = true;
        }
        Q.rl(z2);
        if (!y5Y.j.t()) {
            if (T5.n.nr()) {
                T5.n.n("Fresco.initialize->SoLoader.init");
            }
            try {
                try {
                    try {
                        Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
                    } catch (IllegalAccessException unused) {
                        y5Y.j.rl(new y5Y.w6());
                        if (T5.n.nr()) {
                        }
                    } catch (InvocationTargetException unused2) {
                        y5Y.j.rl(new y5Y.w6());
                        if (T5.n.nr()) {
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                    y5Y.j.rl(new y5Y.w6());
                    if (T5.n.nr()) {
                    }
                } catch (NoSuchMethodException unused4) {
                    y5Y.j.rl(new y5Y.w6());
                    if (T5.n.nr()) {
                    }
                }
                if (T5.n.nr()) {
                    T5.n.rl();
                }
            } catch (Throwable th) {
                if (T5.n.nr()) {
                    T5.n.rl();
                }
                throw th;
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (l3d == null) {
            UGc.o(applicationContext);
        } else {
            UGc.Z(l3d);
        }
        J2(applicationContext, nVar);
        if (T5.n.nr()) {
            T5.n.rl();
        }
    }

    public static QJ n() {
        return rl().mUb();
    }

    public static UGc rl() {
        return UGc.qie();
    }
}

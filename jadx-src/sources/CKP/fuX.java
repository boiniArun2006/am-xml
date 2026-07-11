package CKP;

import CKP.Xo;
import CKP.o;
import CKP.s4;
import android.content.Context;
import com.facebook.internal.Pl;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fuX f878n = new fuX();
    private static final AtomicBoolean rl = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(Ref.ObjectRef billingClientWrapper, final s4.j billingClientVersion, final Context context) {
        if (VmF.j.nr(fuX.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(billingClientWrapper, "$billingClientWrapper");
            Intrinsics.checkNotNullParameter(billingClientVersion, "$billingClientVersion");
            Intrinsics.checkNotNullParameter(context, "$context");
            ((Dsr) billingClientWrapper.element).n(s4.n.SUBS, new Runnable() { // from class: CKP.CN3
                @Override // java.lang.Runnable
                public final void run() {
                    fuX.Uo(billingClientVersion, context);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, fuX.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(s4.j billingClientVersion, Context context) {
        if (VmF.j.nr(fuX.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(billingClientVersion, "$billingClientVersion");
            Intrinsics.checkNotNullParameter(context, "$context");
            fuX fux = f878n;
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            fux.nr(billingClientVersion, packageName);
        } catch (Throwable th) {
            VmF.j.rl(th, fuX.class);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [CKP.Xo, T] */
    /* JADX WARN: Type inference failed for: r4v6, types: [CKP.o, T] */
    public static final synchronized void O(final Context context, final s4.j billingClientVersion) {
        if (VmF.j.nr(fuX.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(billingClientVersion, "billingClientVersion");
            AtomicBoolean atomicBoolean = rl;
            if (atomicBoolean.get()) {
                return;
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            s4.j jVar = s4.j.V2_V4;
            if (billingClientVersion == jVar) {
                objectRef.element = o.Ik.nr(context);
            } else if (billingClientVersion == s4.j.V5_V7) {
                objectRef.element = Xo.rV9.nr(context);
            }
            if (objectRef.element == 0) {
                atomicBoolean.set(true);
                return;
            }
            if (!com.facebook.internal.Pl.Uo(Pl.n.AndroidIAPSubscriptionAutoLogging) || (zx.I28.nr() && billingClientVersion != jVar)) {
                ((Dsr) objectRef.element).n(s4.n.INAPP, new Runnable() { // from class: CKP.Wre
                    @Override // java.lang.Runnable
                    public final void run() {
                        fuX.KN(billingClientVersion, context);
                    }
                });
            } else {
                ((Dsr) objectRef.element).n(s4.n.INAPP, new Runnable() { // from class: CKP.I28
                    @Override // java.lang.Runnable
                    public final void run() {
                        fuX.J2(objectRef, billingClientVersion, context);
                    }
                });
            }
        } catch (Throwable th) {
            VmF.j.rl(th, fuX.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(s4.j billingClientVersion, Context context) {
        if (VmF.j.nr(fuX.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(billingClientVersion, "$billingClientVersion");
            Intrinsics.checkNotNullParameter(context, "$context");
            fuX fux = f878n;
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            fux.nr(billingClientVersion, packageName);
        } catch (Throwable th) {
            VmF.j.rl(th, fuX.class);
        }
    }

    private fuX() {
    }

    private final void nr(s4.j jVar, String str) {
        if (!VmF.j.nr(this)) {
            try {
                boolean zO = QJ.O();
                if (zO) {
                    QJ.Uo();
                }
                if (jVar == s4.j.V2_V4) {
                    o.n nVar = o.Ik;
                    QJ.nr(nVar.t(), nVar.O(), false, str, jVar, zO);
                    QJ.nr(nVar.J2(), nVar.O(), true, str, jVar, zO);
                    nVar.t().clear();
                    nVar.J2().clear();
                } else {
                    Xo.j jVar2 = Xo.rV9;
                    QJ.nr(jVar2.t(), jVar2.O(), false, str, jVar, zO);
                    QJ.nr(jVar2.J2(), jVar2.O(), true, str, jVar, zO);
                    jVar2.t().clear();
                    jVar2.J2().clear();
                }
                if (zO) {
                    QJ.KN();
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }
}

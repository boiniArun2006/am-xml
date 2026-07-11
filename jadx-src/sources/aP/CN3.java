package aP;

import aP.aC;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class CN3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final j J2 = new j(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Map f12878r = new HashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final AtomicBoolean f12879O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WeakReference f12880n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f12881t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final void n(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapRl = CN3.rl();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object cn3 = mapRl.get(numValueOf);
            if (cn3 == null) {
                cn3 = new CN3(activity, null);
                mapRl.put(numValueOf, cn3);
            }
            CN3.t((CN3) cn3);
        }

        public final void rl(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            CN3 cn3 = (CN3) CN3.rl().remove(Integer.valueOf(activity.hashCode()));
            if (cn3 != null) {
                CN3.nr(cn3);
            }
        }
    }

    public /* synthetic */ CN3(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    private CN3(Activity activity) {
        this.f12880n = new WeakReference(activity);
        this.f12881t = new Handler(Looper.getMainLooper());
        this.f12879O = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(CN3 this$0) {
        if (VmF.j.nr(CN3.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                View viewNr = UiE.fuX.nr((Activity) this$0.f12880n.get());
                Activity activity = (Activity) this$0.f12880n.get();
                if (viewNr != null && activity != null) {
                    for (View view : w6.n(viewNr)) {
                        if (!Zfb.Ml.Uo(view)) {
                            String strNr = w6.nr(view);
                            if (strNr.length() > 0 && strNr.length() <= 300) {
                                aC.j jVar = aC.f12888r;
                                String localClassName = activity.getLocalClassName();
                                Intrinsics.checkNotNullExpressionValue(localClassName, "activity.localClassName");
                                jVar.nr(view, viewNr, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            VmF.j.rl(th, CN3.class);
        }
    }

    public static final /* synthetic */ void nr(CN3 cn3) {
        if (VmF.j.nr(CN3.class)) {
            return;
        }
        try {
            cn3.KN();
        } catch (Throwable th) {
            VmF.j.rl(th, CN3.class);
        }
    }

    public static final /* synthetic */ Map rl() {
        if (VmF.j.nr(CN3.class)) {
            return null;
        }
        try {
            return f12878r;
        } catch (Throwable th) {
            VmF.j.rl(th, CN3.class);
            return null;
        }
    }

    public static final /* synthetic */ void t(CN3 cn3) {
        if (VmF.j.nr(CN3.class)) {
            return;
        }
        try {
            cn3.Uo();
        } catch (Throwable th) {
            VmF.j.rl(th, CN3.class);
        }
    }

    private final void KN() {
        View viewNr;
        if (!VmF.j.nr(this)) {
            try {
                if (this.f12879O.getAndSet(false) && (viewNr = UiE.fuX.nr((Activity) this.f12880n.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewNr.getViewTreeObserver();
                    if (!viewTreeObserver.isAlive()) {
                        return;
                    }
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final void O() {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: aP.Wre
                @Override // java.lang.Runnable
                public final void run() {
                    CN3.J2(this.f12886n);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f12881t.post(runnable);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private final void Uo() {
        View viewNr;
        if (!VmF.j.nr(this)) {
            try {
                if (!this.f12879O.getAndSet(true) && (viewNr = UiE.fuX.nr((Activity) this.f12880n.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewNr.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        O();
                    }
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            O();
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }
}

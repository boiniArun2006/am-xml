package Vk7;

import UiE.fuX;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.appevents.rv6;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Wre implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private final AtomicBoolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final WeakReference f11277O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f11278n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f11279t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f11276r = new j(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f11275o = new HashMap();

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String t(String str, String str2) {
            return Intrinsics.areEqual("r2", str) ? new Regex("[^\\d.]").replace(str2, "") : str2;
        }

        public final void O(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapRl = Wre.rl();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object wre = mapRl.get(numValueOf);
            if (wre == null) {
                wre = new Wre(activity, null);
                mapRl.put(numValueOf, wre);
            }
            Wre.t((Wre) wre);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void nr(Map map, String str, String str2) {
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        if (StringsKt.startsWith$default(str2, "m", false, 2, (Object) null) || StringsKt.startsWith$default(str2, "b", false, 2, (Object) null) || StringsKt.startsWith$default(str2, "ge", false, 2, (Object) null)) {
                            str2 = "m";
                        } else {
                            str2 = InneractiveMediationDefs.GENDER_FEMALE;
                        }
                    }
                    break;
                case 3586:
                    if (str.equals("r4")) {
                        str2 = new Regex("[^a-z]+").replace(str2, "");
                    }
                    break;
                case 3587:
                    if (str.equals("r5")) {
                    }
                    break;
                case 3588:
                    if (str.equals("r6") && StringsKt.contains$default((CharSequence) str2, (CharSequence) "-", false, 2, (Object) null)) {
                        str2 = ((String[]) new Regex("-").split(str2, 0).toArray(new String[0]))[0];
                    }
                    break;
            }
            map.put(str, str2);
        }
    }

    public /* synthetic */ Wre(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    private Wre(Activity activity) {
        this.f11278n = new LinkedHashSet();
        this.f11279t = new Handler(Looper.getMainLooper());
        this.f11277O = new WeakReference(activity);
        this.J2 = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(View view, Wre this$0) {
        if (VmF.j.nr(Wre.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "$view");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (view instanceof EditText) {
                this$0.J2(view);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
        }
    }

    public static final /* synthetic */ Map rl() {
        if (VmF.j.nr(Wre.class)) {
            return null;
        }
        try {
            return f11275o;
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    public static final /* synthetic */ void t(Wre wre) {
        if (VmF.j.nr(Wre.class)) {
            return;
        }
        try {
            wre.KN();
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
        }
    }

    private final void J2(View view) {
        if (!VmF.j.nr(this)) {
            try {
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.EditText");
                String lowerCase = StringsKt.trim((CharSequence) ((EditText) view).getText().toString()).toString().toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                if (lowerCase.length() != 0 && !this.f11278n.contains(lowerCase) && lowerCase.length() <= 100) {
                    this.f11278n.add(lowerCase);
                    HashMap map = new HashMap();
                    List listRl = w6.rl(view);
                    List listN = null;
                    for (Ml ml : Ml.nr.t()) {
                        j jVar = f11276r;
                        String strT = jVar.t(ml.t(), lowerCase);
                        if (ml.nr().length() <= 0 || w6.J2(strT, ml.nr())) {
                            if (w6.O(listRl, ml.rl())) {
                                jVar.nr(map, ml.t(), strT);
                            } else {
                                if (listN == null) {
                                    listN = w6.n(view);
                                }
                                if (w6.O(listN, ml.rl())) {
                                    jVar.nr(map, ml.t(), strT);
                                }
                            }
                        }
                    }
                    rv6.rl.O(map);
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final void KN() {
        View viewNr;
        if (!VmF.j.nr(this)) {
            try {
                if (!this.J2.getAndSet(true) && (viewNr = fuX.nr((Activity) this.f11277O.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewNr.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalFocusChangeListener(this);
                    }
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final void Uo(Runnable runnable) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f11279t.post(runnable);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private final void nr(final View view) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Uo(new Runnable() { // from class: Vk7.I28
                @Override // java.lang.Runnable
                public final void run() {
                    Wre.O(view, this);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (!VmF.j.nr(this)) {
            if (view != null) {
                try {
                    nr(view);
                } catch (Throwable th) {
                    VmF.j.rl(th, this);
                    return;
                }
            }
            if (view2 != null) {
                nr(view2);
            }
        }
    }
}

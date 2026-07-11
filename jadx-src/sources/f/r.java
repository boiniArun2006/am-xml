package f;

import Dj7.AbstractC1329m;
import QmE.iF;
import QmE.j;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.view.ComponentActivity;
import androidx.view.OnBackPressedCallback;
import f.SPz;
import f.r;
import i.AbstractC2166Wre;
import i.C2169w6;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xAo.Ln;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class r {

    static final class j implements Function2 {
        final /* synthetic */ iF J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ sqD.w6 f64037O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ C1989z f64038n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ C2169w6 f64039o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ WK.n f64040r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ComposeView f64041t;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit qie(ComposeView composeView, sqD.w6 w6Var, iF iFVar) {
            r.n(composeView, w6Var, iFVar, false);
            return Unit.INSTANCE;
        }

        j(C1989z c1989z, ComposeView composeView, sqD.w6 w6Var, iF iFVar, WK.n nVar, C2169w6 c2169w6) {
            this.f64038n = c1989z;
            this.f64041t = composeView;
            this.f64037O = w6Var;
            this.J2 = iFVar;
            this.f64040r = nVar;
            this.f64039o = c2169w6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NBO.n KN(C2169w6 c2169w6, JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return NBO.Wre.t(it, c2169w6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit gh(ComposeView composeView, sqD.w6 w6Var, iF iFVar, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ViewParent parent = composeView.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(composeView);
            w6Var.t(new SPz.j(it));
            iFVar.n(new j.Sw(w6Var.rl().getValue(), it));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NBO.j mUb(C2169w6 c2169w6, JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return NBO.Ml.n(it, c2169w6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(C1989z c1989z, ComposeView composeView, sqD.w6 w6Var, iF iFVar, OnBackPressedCallback BackPressHandler) {
            Intrinsics.checkNotNullParameter(BackPressHandler, "$this$BackPressHandler");
            if (c1989z.J2()) {
                r.n(composeView, w6Var, iFVar, true);
            }
            return Unit.INSTANCE;
        }

        public final void Uo(Composer composer, int i2) throws JSONException {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-930209189, i2, -1, "com.alightcreative.crisper.experiences.onPopupExperience.<anonymous> (PopupExperience.kt:78)");
            }
            composer.eF(-225745230);
            C1989z c1989z = this.f64038n;
            final C2169w6 c2169w6 = this.f64039o;
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = WK.w6.rl(c1989z.t(), new Function1() { // from class: f.QJ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.j.KN(c2169w6, (JSONObject) obj);
                    }
                });
                composer.o(objIF);
            }
            List list = (List) objIF;
            composer.Xw();
            composer.eF(-225740112);
            C1989z c1989z2 = this.f64038n;
            final C2169w6 c2169w62 = this.f64039o;
            Object objIF2 = composer.iF();
            if (objIF2 == companion.n()) {
                objIF2 = WK.w6.rl(c1989z2.rl(), new Function1() { // from class: f.l3D
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.j.mUb(c2169w62, (JSONObject) obj);
                    }
                });
                composer.o(objIF2);
            }
            List list2 = (List) objIF2;
            composer.Xw();
            boolean zO = this.f64038n.O();
            composer.eF(-225730500);
            boolean zE2 = composer.E2(this.f64041t) | composer.E2(this.f64037O) | composer.E2(this.J2);
            final ComposeView composeView = this.f64041t;
            final sqD.w6 w6Var = this.f64037O;
            final iF iFVar = this.J2;
            Object objIF3 = composer.iF();
            if (zE2 || objIF3 == companion.n()) {
                objIF3 = new Function1() { // from class: f.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.j.gh(composeView, w6Var, iFVar, (String) obj);
                    }
                };
                composer.o(objIF3);
            }
            Function1 function1 = (Function1) objIF3;
            composer.Xw();
            composer.eF(-225718049);
            boolean zE22 = composer.E2(this.f64041t) | composer.E2(this.f64037O) | composer.E2(this.J2);
            final ComposeView composeView2 = this.f64041t;
            final sqD.w6 w6Var2 = this.f64037O;
            final iF iFVar2 = this.J2;
            Object objIF4 = composer.iF();
            if (zE22 || objIF4 == companion.n()) {
                objIF4 = new Function0() { // from class: f.s4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.j.qie(composeView2, w6Var2, iFVar2);
                    }
                };
                composer.o(objIF4);
            }
            Function0 function0 = (Function0) objIF4;
            composer.Xw();
            composer.eF(-225714256);
            boolean zE23 = composer.E2(this.f64040r);
            final WK.n nVar = this.f64040r;
            Object objIF5 = composer.iF();
            if (zE23 || objIF5 == companion.n()) {
                objIF5 = new Function1() { // from class: f.UGc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.j.az(nVar, ((Integer) obj).intValue());
                    }
                };
                composer.o(objIF5);
            }
            composer.Xw();
            AbstractC1329m.xMQ(zO, list, list2, function1, function0, (Function1) objIF5, composer, 0);
            composer.eF(-225711688);
            boolean zE24 = composer.E2(this.f64038n) | composer.E2(this.f64041t) | composer.E2(this.f64037O) | composer.E2(this.J2);
            final C1989z c1989z3 = this.f64038n;
            final ComposeView composeView3 = this.f64041t;
            final sqD.w6 w6Var3 = this.f64037O;
            final iF iFVar3 = this.J2;
            Object objIF6 = composer.iF();
            if (zE24 || objIF6 == companion.n()) {
                objIF6 = new Function1() { // from class: f.Q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.j.xMQ(c1989z3, composeView3, w6Var3, iFVar3, (OnBackPressedCallback) obj);
                    }
                };
                composer.o(objIF6);
            }
            composer.Xw();
            N.I28.O(null, (Function1) objIF6, composer, 0, 1);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws JSONException {
            Uo((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x0X.n az(WK.n nVar, int i2) {
            return nVar.rl(i2);
        }
    }

    public static final void n(View view, sqD.w6 action, iF eventLogger, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        ViewParent parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeView(view);
        action.t(SPz.n.f64000n);
        eventLogger.n(new j.xq(action.rl().getValue(), z2));
    }

    public static final void rl(ComponentActivity activity, sqD.w6 action, C1989z experience, iF eventLogger, WK.n getUriFromResource) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(getUriFromResource, "getUriFromResource");
        ComposeView composeView = new ComposeView(activity, null, 0, 6, null);
        activity.addContentView(composeView, new ViewGroup.LayoutParams(-1, -1));
        C2169w6 c2169w6T = Iy.j.t(Iy.j.f4399n, AbstractC2166Wre.rl(experience.nr()), null, 2, null);
        if (c2169w6T == null) {
            c2169w6T = C2169w6.rl.n();
        }
        composeView.setContent(ComposableLambdaKt.rl(-930209189, true, new j(experience, composeView, action, eventLogger, getUriFromResource, c2169w6T)));
        eventLogger.n(new j.rfW(action.rl().getValue()));
    }

    public static final C1989z t(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Boolean boolN = bIo.Wre.n(jSONObject, "isDismissible");
        boolean zBooleanValue = boolN != null ? boolN.booleanValue() : false;
        Boolean boolN2 = bIo.Wre.n(jSONObject, "isDismissibleWithBackButton");
        boolean zBooleanValue2 = boolN2 != null ? boolN2.booleanValue() : zBooleanValue;
        JSONArray jSONArrayN = Ln.n(jSONObject, "elements");
        if (jSONArrayN == null) {
            jSONArrayN = new JSONArray();
        }
        JSONArray jSONArray = jSONArrayN;
        JSONArray jSONArrayN2 = Ln.n(jSONObject, "buttons");
        if (jSONArrayN2 == null) {
            jSONArrayN2 = new JSONArray();
        }
        JSONArray jSONArray2 = jSONArrayN2;
        JSONObject jSONObjectRl = Ln.rl(jSONObject, "localization");
        if (jSONObjectRl == null) {
            jSONObjectRl = new JSONObject();
        }
        return new C1989z(zBooleanValue, zBooleanValue2, jSONArray, jSONArray2, jSONObjectRl);
    }
}

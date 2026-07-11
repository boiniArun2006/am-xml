package HW;

import HI0.qf;
import LdY.Ml;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneSelection;
import com.alightcreative.app.motion.scene.TimeKt;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yc.DAz;
import yc.Um;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List f3893n = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public static final o B(Activity activity) {
        o oVarXMQ;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        return (i28 == null || (oVarXMQ = i28.xMQ()) == null) ? Ml.f3896n : oVarXMQ;
    }

    public static final void D(Fragment fragment, Function2 updater) {
        SceneElement sceneElementNHg;
        SceneHolder sceneHolderE;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(updater, "updater");
        Scene sceneIF = iF(fragment);
        if (sceneIF == null || (sceneElementNHg = nHg(fragment)) == null || (sceneHolderE = e(fragment)) == null) {
            return;
        }
        sceneHolderE.update((SceneElement) updater.invoke(sceneIF, sceneElementNHg));
    }

    public static final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        List list = f3893n;
        list.add(new WeakReference(view));
        CollectionsKt.removeAll(list, new Function1() { // from class: HW.CN3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C.M((WeakReference) obj));
            }
        });
    }

    public static final SceneHolder E2(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        I28 i28X = X(view);
        if (i28X != null) {
            return i28X.getSceneHolder();
        }
        return null;
    }

    public static final Unit FX(Fragment fragment, int i2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        KeyEventDispatcher.Component activity = fragment.getActivity();
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        if (i28 == null) {
            return null;
        }
        i28.iF(i2);
        return Unit.INSTANCE;
    }

    public static final int HI(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        int iXQ = XQ(activity);
        Scene sceneG = g(activity);
        return TimeKt.frameNumberFromTime(iXQ, sceneG != null ? sceneG.getFramesPerHundredSeconds() : 30);
    }

    public static final int Ik(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        int iXQ = XQ(activity);
        Scene sceneG = g(activity);
        return TimeKt.roundToFrameEndTime(iXQ, sceneG != null ? sceneG.getFramesPerHundredSeconds() : AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
    }

    public static final void J(Activity activity, Function2 updater) {
        SceneElement sceneElementT;
        SceneHolder sceneHolderFD;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(updater, "updater");
        Scene sceneG = g(activity);
        if (sceneG == null || (sceneElementT = T(activity)) == null || (sceneHolderFD = fD(activity)) == null) {
            return;
        }
        sceneHolderFD.update((SceneElement) updater.invoke(sceneG, sceneElementT));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Ml.j J2(Activity activity) {
        Ml.j jVarCk;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        return (i28 == null || (jVarCk = i28.ck()) == null) ? LdY.Ml.Ik.n() : jVarCk;
    }

    public static final Ml.j KN(View view) {
        Ml.j jVarCk;
        Intrinsics.checkNotNullParameter(view, "<this>");
        I28 i28X = X(view);
        return (i28X == null || (jVarCk = i28X.ck()) == null) ? LdY.Ml.Ik.n() : jVarCk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null;
    }

    public static final Unit M7(Fragment fragment, int i2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        KeyEventDispatcher.Component activity = fragment.getActivity();
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        if (i28 != null) {
            return P5(i28, i2);
        }
        return null;
    }

    public static final SceneElement N(View view) {
        SceneSelection selection;
        Long directSelection;
        Intrinsics.checkNotNullParameter(view, "<this>");
        I28 i28X = X(view);
        if (i28X != null && (selection = i28X.getSelection()) != null && (directSelection = selection.getDirectSelection()) != null) {
            long jLongValue = directSelection.longValue();
            Scene sceneTe = te(view);
            if (sceneTe != null) {
                return SceneKt.elementById(sceneTe, Long.valueOf(jLongValue));
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit P5(I28 i28, int i2) {
        Intrinsics.checkNotNullParameter(i28, "<this>");
        Context context = i28 instanceof Context ? (Context) i28 : null;
        if (context == null) {
            return null;
        }
        String string = context.getString(i2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        i28.mUb(string);
        return Unit.INSTANCE;
    }

    public static final int S(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        I28 i28X = X(view);
        if (i28X != null) {
            return i28X.getCurrentTime();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SceneElement T(Activity activity) {
        SceneSelection selection;
        Long directSelection;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        if (i28 != null && (selection = i28.getSelection()) != null && (directSelection = selection.getDirectSelection()) != null) {
            long jLongValue = directSelection.longValue();
            Scene sceneG = g(activity);
            if (sceneG != null) {
                return SceneKt.elementById(sceneG, Long.valueOf(jLongValue));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean U(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Ml.j Uo(Context context) {
        Ml.j jVarCk;
        Intrinsics.checkNotNullParameter(context, "<this>");
        I28 i28 = context instanceof I28 ? (I28) context : null;
        return (i28 == null || (jVarCk = i28.ck()) == null) ? LdY.Ml.Ik.n() : jVarCk;
    }

    public static final String ViF(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        KeyEventDispatcher.Component activity = fragment.getActivity();
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        if (i28 != null) {
            return i28.Uo();
        }
        return null;
    }

    public static final int WPU(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        KeyEventDispatcher.Component activity = fragment.getActivity();
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        if (i28 != null) {
            return i28.getCurrentTime();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int XQ(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        if (i28 != null) {
            return i28.getCurrentTime();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement Xw(oA.j jVar, int i2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return (SceneElement) jVar.rl(el, qf.t(i2));
    }

    public static final int Z(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        int iWPU = WPU(fragment);
        Scene sceneIF = iF(fragment);
        return TimeKt.roundToFrameStartTime(iWPU, sceneIF != null ? sceneIF.getFramesPerHundredSeconds() : AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
    }

    public static final float aYN(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        SceneElement sceneElementNHg = nHg(fragment);
        if (sceneElementNHg != null) {
            return SceneElementKt.fractionalTime(sceneElementNHg, WPU(fragment));
        }
        return 0.0f;
    }

    public static final int az(Activity activity) {
        int i2;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Scene sceneG = g(activity);
        Integer numValueOf = sceneG != null ? Integer.valueOf(SceneKt.getDuration(sceneG)) : null;
        int iXQ = XQ(activity);
        Scene sceneG2 = g(activity);
        int framesPerHundredSeconds = sceneG2 != null ? sceneG2.getFramesPerHundredSeconds() : AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
        return (numValueOf == null || numValueOf.intValue() <= (i2 = 50000 / framesPerHundredSeconds) || iXQ < numValueOf.intValue() - i2) ? Ik(activity) : TimeKt.roundToFrameEndTime(XQ(activity) + (100000 / framesPerHundredSeconds), framesPerHundredSeconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable bzg(Scene scene, SceneElement sceneElement, Activity activity, int i2, Keyable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableKt.copyWithValueForTime(it, scene, sceneElement, SceneElementKt.fractionalTime(sceneElement, XQ(activity)), qf.t(i2));
    }

    public static final int ck(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        int iWPU = WPU(fragment);
        Scene sceneIF = iF(fragment);
        return TimeKt.frameNumberFromTime(iWPU, sceneIF != null ? sceneIF.getFramesPerHundredSeconds() : 30);
    }

    public static final SceneHolder e(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        KeyEventDispatcher.Component activity = fragment.getActivity();
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        if (i28 != null) {
            return i28.getSceneHolder();
        }
        return null;
    }

    public static final void eF(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        KeyEventDispatcher.Component activity = fragment.getActivity();
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        if (i28 != null) {
            i28.nY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SceneHolder fD(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        if (i28 != null) {
            return i28.getSceneHolder();
        }
        return null;
    }

    public static final Scene g(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        SceneHolder sceneHolderFD = fD(activity);
        if (sceneHolderFD != null) {
            return sceneHolderFD.getScene();
        }
        return null;
    }

    public static final int gh(Activity activity, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Scene sceneG = g(activity);
        Integer numValueOf = sceneG != null ? Integer.valueOf(SceneKt.getDuration(sceneG)) : null;
        Scene sceneG2 = g(activity);
        int framesPerHundredSeconds = AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
        int framesPerHundredSeconds2 = sceneG2 != null ? sceneG2.getFramesPerHundredSeconds() : 3000;
        if (numValueOf != null && numValueOf.intValue() > (i3 = 50000 / framesPerHundredSeconds2) && i2 >= numValueOf.intValue() - i3) {
            return TimeKt.roundToFrameEndTime(i2 + (100000 / framesPerHundredSeconds2), framesPerHundredSeconds2);
        }
        Scene sceneG3 = g(activity);
        if (sceneG3 != null) {
            framesPerHundredSeconds = sceneG3.getFramesPerHundredSeconds();
        }
        return TimeKt.roundToFrameEndTime(i2, framesPerHundredSeconds);
    }

    public static final Scene iF(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        SceneHolder sceneHolderE = e(fragment);
        if (sceneHolderE != null) {
            return sceneHolderE.getScene();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean jB(I28 i28) {
        Intrinsics.checkNotNullParameter(i28, "<this>");
        List list = f3893n;
        CollectionsKt.removeAll(list, new Function1() { // from class: HW.Wre
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C.U((WeakReference) obj));
            }
        });
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DAz dAz = (DAz) ((WeakReference) it.next()).get();
            View view = dAz instanceof View ? (View) dAz : null;
            if (dAz != 0 && view != null && Intrinsics.areEqual(view.getContext(), i28) && view.isAttachedToWindow() && view.getVisibility() == 0 && dAz.onBackPressed()) {
                return true;
            }
        }
        return false;
    }

    public static final Unit mUb(Fragment fragment, int i2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        KeyEventDispatcher.Component activity = fragment.getActivity();
        Um um = activity instanceof Um ? (Um) activity : null;
        if (um == null) {
            return null;
        }
        um.rV9(i2);
        return Unit.INSTANCE;
    }

    public static final SceneElement nHg(Fragment fragment) {
        SceneSelection selection;
        Long directSelection;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        KeyEventDispatcher.Component activity = fragment.getActivity();
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        if (i28 != null && (selection = i28.getSelection()) != null && (directSelection = selection.getDirectSelection()) != null) {
            long jLongValue = directSelection.longValue();
            Scene sceneIF = iF(fragment);
            if (sceneIF != null) {
                return SceneKt.elementById(sceneIF, Long.valueOf(jLongValue));
            }
        }
        return null;
    }

    public static final float nY(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        KeyEventDispatcher.Component activity = fragment.getActivity();
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        if (i28 != null) {
            return i28.nHg();
        }
        return 1.0f;
    }

    public static final int o(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        int iXQ = XQ(activity);
        Scene sceneG = g(activity);
        return TimeKt.roundToFrameStartTime(iXQ, sceneG != null ? sceneG.getFramesPerHundredSeconds() : AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
    }

    public static final Unit p5(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        KeyEventDispatcher.Component activity = fragment.getActivity();
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        if (i28 == null) {
            return null;
        }
        i28.qie();
        return Unit.INSTANCE;
    }

    public static final int qie(Activity activity, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Scene sceneG = g(activity);
        Integer numValueOf = sceneG != null ? Integer.valueOf(SceneKt.getDuration(sceneG)) : null;
        Scene sceneG2 = g(activity);
        int framesPerHundredSeconds = AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
        int framesPerHundredSeconds2 = sceneG2 != null ? sceneG2.getFramesPerHundredSeconds() : 3000;
        if (numValueOf != null && numValueOf.intValue() > (i3 = 50000 / framesPerHundredSeconds2) && i2 >= numValueOf.intValue() - i3) {
            return TimeKt.roundToFrameStartTime(i2 + (100000 / framesPerHundredSeconds2), framesPerHundredSeconds2);
        }
        Scene sceneG3 = g(activity);
        if (sceneG3 != null) {
            framesPerHundredSeconds = sceneG3.getFramesPerHundredSeconds();
        }
        return TimeKt.roundToFrameStartTime(i2, framesPerHundredSeconds);
    }

    public static final int r(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        int iWPU = WPU(fragment);
        Scene sceneIF = iF(fragment);
        return TimeKt.roundToFrameEndTime(iWPU, sceneIF != null ? sceneIF.getFramesPerHundredSeconds() : AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement rV9(oA.j jVar, final Activity activity, final int i2, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        return (SceneElement) jVar.t(el, new Function1() { // from class: HW.aC
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C.bzg(scene, el, activity, i2, (Keyable) obj);
            }
        });
    }

    public static final void s7N(final Activity activity, int i2, Intent intent, boolean z2) {
        final int intExtra;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (i2 != -1 || intent == null || (intExtra = intent.getIntExtra("NEW_COLOR", 0)) == intent.getIntExtra("OLD_COLOR", 0)) {
            return;
        }
        if (z2) {
            String stringExtra = intent.getStringExtra("COLOR_LENS");
            Intrinsics.checkNotNull(stringExtra);
            final oA.j jVarNr = oA.fuX.nr(stringExtra);
            J(activity, new Function2() { // from class: HW.fuX
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C.rV9(jVarNr, activity, intExtra, (Scene) obj, (SceneElement) obj2);
                }
            });
            return;
        }
        String stringExtra2 = intent.getStringExtra("COLOR_LENS");
        Intrinsics.checkNotNull(stringExtra2);
        final oA.j jVarNr2 = oA.fuX.nr(stringExtra2);
        J(activity, new Function2() { // from class: HW.Dsr
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C.Xw(jVarNr2, intExtra, (Scene) obj, (SceneElement) obj2);
            }
        });
    }

    public static final Scene te(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        SceneHolder sceneHolderE2 = E2(view);
        if (sceneHolderE2 != null) {
            return sceneHolderE2.getScene();
        }
        return null;
    }

    public static final int ty(Activity activity) {
        int i2;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Scene sceneG = g(activity);
        Integer numValueOf = sceneG != null ? Integer.valueOf(SceneKt.getDuration(sceneG)) : null;
        int iXQ = XQ(activity);
        Scene sceneG2 = g(activity);
        int framesPerHundredSeconds = sceneG2 != null ? sceneG2.getFramesPerHundredSeconds() : AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
        return (numValueOf == null || numValueOf.intValue() <= (i2 = 50000 / framesPerHundredSeconds) || iXQ < numValueOf.intValue() - i2) ? o(activity) : TimeKt.roundToFrameStartTime(XQ(activity) + (100000 / framesPerHundredSeconds), framesPerHundredSeconds);
    }

    public static /* synthetic */ void v(Fragment fragment, int i2, Intent intent, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = true;
        }
        wTp(fragment, i2, intent, z2);
    }

    public static final void wTp(Fragment fragment, int i2, Intent intent, boolean z2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            s7N(activity, i2, intent, z2);
        }
    }

    public static final Ml.j xMQ(Fragment fragment) {
        Ml.j jVarCk;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        KeyEventDispatcher.Component activity = fragment.getActivity();
        I28 i28 = activity instanceof I28 ? (I28) activity : null;
        return (i28 == null || (jVarCk = i28.ck()) == null) ? LdY.Ml.Ik.n() : jVarCk;
    }

    private static final I28 X(View view) {
        ComponentCallbacks2 componentCallbacks2N = qz.n(view);
        if (componentCallbacks2N instanceof I28) {
            return (I28) componentCallbacks2N;
        }
        return null;
    }
}

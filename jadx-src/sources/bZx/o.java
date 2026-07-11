package bZx;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import bZx.o;
import com.facebook.AccessToken;
import com.facebook.Ew;
import com.facebook.GraphRequest;
import com.facebook.g9s;
import com.facebook.internal.Z;
import com.facebook.internal.ci;
import com.facebook.internal.vd;
import com.facebook.s4;
import com.safedk.android.analytics.AppLovinBridge;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class o {
    private static final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f43364O = new j(null);
    private static o Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f43365n;
    private String nr;
    private final WeakReference rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Timer f43366t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(g9s it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Z.f52780O.rl(Ew.APP_EVENTS, o.nr(), "App index sent to FB!");
        }

        public final GraphRequest rl(String str, AccessToken accessToken, String str2, String requestType) {
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            if (str == null) {
                return null;
            }
            GraphRequest.w6 w6Var = GraphRequest.ty;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str3 = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
            GraphRequest graphRequestG = w6Var.g(accessToken, str3, null, null);
            Bundle bundleXQ = graphRequestG.XQ();
            if (bundleXQ == null) {
                bundleXQ = new Bundle();
            }
            bundleXQ.putString("tree", str);
            bundleXQ.putString("app_version", UiE.fuX.t());
            bundleXQ.putString(AppLovinBridge.f61288f, AppLovinBridge.f61290h);
            bundleXQ.putString("request_type", requestType);
            if (Intrinsics.areEqual(requestType, "app_indexing")) {
                bundleXQ.putString(dpcnwfoVOnrtRA.FQudvAHkcQwf, I28.Uo());
            }
            graphRequestG.T(bundleXQ);
            graphRequestG.fD(new GraphRequest.n() { // from class: bZx.C
                @Override // com.facebook.GraphRequest.n
                public final void n(g9s g9sVar) {
                    o.j.t(g9sVar);
                }
            });
            return graphRequestG;
        }
    }

    private static final class n implements Callable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WeakReference f43367n;

        public n(View rootView) {
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            this.f43367n = new WeakReference(rootView);
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = (View) this.f43367n.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(view.width,…t, Bitmap.Config.RGB_565)");
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(outputStr…eArray(), Base64.NO_WRAP)");
            return strEncodeToString;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class w6 extends TimerTask {
        w6() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) o.t(o.this).get();
                View viewNr = UiE.fuX.nr(activity);
                if (activity != null && viewNr != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (I28.KN()) {
                        if (ci.rl()) {
                            Zfb.I28.n();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new n(viewNr));
                        o.O(o.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e2) {
                            Log.e(o.nr(), "Failed to take screenshot.", e2);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(Zfb.Wre.nr(viewNr));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused) {
                            Log.e(o.nr(), obbPUqyhtS.ADwf);
                        }
                        String string = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "viewTree.toString()");
                        o.J2(o.this, string);
                    }
                }
            } catch (Exception e3) {
                Log.e(o.nr(), "UI Component tree indexing failure!", e3);
            }
        }
    }

    static {
        String canonicalName = o.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        J2 = canonicalName;
    }

    public o(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.rl = new WeakReference(activity);
        this.nr = null;
        this.f43365n = new Handler(Looper.getMainLooper());
        Uo = this;
    }

    public static final /* synthetic */ void J2(o oVar, String str) {
        if (VmF.j.nr(o.class)) {
            return;
        }
        try {
            oVar.mUb(str);
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
        }
    }

    public static final /* synthetic */ Handler O(o oVar) {
        if (VmF.j.nr(o.class)) {
            return null;
        }
        try {
            return oVar.f43365n;
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(String tree, o this$0) {
        if (VmF.j.nr(o.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(tree, "$tree");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            String strETf = vd.eTf(tree);
            AccessToken accessTokenO = AccessToken.INSTANCE.O();
            if (strETf == null || !Intrinsics.areEqual(strETf, this$0.nr)) {
                this$0.Uo(f43364O.rl(tree, accessTokenO, s4.az(), "app_indexing"), strETf);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
        }
    }

    public static final /* synthetic */ String nr() {
        if (VmF.j.nr(o.class)) {
            return null;
        }
        try {
            return J2;
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
            return null;
        }
    }

    public static final /* synthetic */ WeakReference t(o oVar) {
        if (VmF.j.nr(o.class)) {
            return null;
        }
        try {
            return oVar.rl;
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(o this$0, TimerTask indexingTask) {
        if (VmF.j.nr(o.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(indexingTask, "$indexingTask");
            try {
                Timer timer = this$0.f43366t;
                if (timer != null) {
                    timer.cancel();
                }
                this$0.nr = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                this$0.f43366t = timer2;
            } catch (Exception e2) {
                Log.e(J2, "Error scheduling indexing job", e2);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, o.class);
        }
    }

    public final void Uo(GraphRequest graphRequest, String str) {
        if (VmF.j.nr(this) || graphRequest == null) {
            return;
        }
        try {
            g9s g9sVarGh = graphRequest.gh();
            try {
                JSONObject jSONObjectT = g9sVarGh.t();
                if (jSONObjectT == null) {
                    Log.e(J2, "Error sending UI component tree to Facebook: " + g9sVarGh.rl());
                    return;
                }
                if (Intrinsics.areEqual("true", jSONObjectT.optString("success"))) {
                    Z.f52780O.rl(Ew.APP_EVENTS, J2, "Successfully send UI component tree to server");
                    this.nr = str;
                }
                if (jSONObjectT.has("is_app_indexing_enabled")) {
                    I28.ty(jSONObjectT.getBoolean("is_app_indexing_enabled"));
                }
            } catch (JSONException e2) {
                Log.e(J2, "Error decoding server response.", e2);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    private final void mUb(final String str) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            s4.Z().execute(new Runnable() { // from class: bZx.aC
                @Override // java.lang.Runnable
                public final void run() {
                    o.gh(str, this);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public final void KN() {
        if (!VmF.j.nr(this)) {
            try {
                final w6 w6Var = new w6();
                try {
                    s4.Z().execute(new Runnable() { // from class: bZx.Dsr
                        @Override // java.lang.Runnable
                        public final void run() {
                            o.xMQ(this.f43339n, w6Var);
                        }
                    });
                } catch (RejectedExecutionException e2) {
                    Log.e(J2, "Error scheduling indexing job", e2);
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    public final void qie() {
        if (!VmF.j.nr(this)) {
            try {
                if (((Activity) this.rl.get()) != null) {
                    try {
                        Timer timer = this.f43366t;
                        if (timer != null) {
                            timer.cancel();
                        }
                        this.f43366t = null;
                    } catch (Exception e2) {
                        Log.e(J2, "Error unscheduling indexing job", e2);
                    }
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }
}

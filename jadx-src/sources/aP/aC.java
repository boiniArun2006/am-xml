package aP;

import aP.aC;
import android.os.Bundle;
import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.GraphRequest;
import com.facebook.appevents.rv6;
import com.facebook.internal.vd;
import com.facebook.s4;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import eK.Wre;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class aC implements View.OnClickListener {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final WeakReference f12889O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View.OnClickListener f12890n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final WeakReference f12891t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f12888r = new j(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Set f12887o = new HashSet();

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void KN(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float f3 : fArr) {
                    sb.append(f3);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString(TtmlNode.TAG_METADATA, jSONObject.toString());
                GraphRequest.w6 w6Var = GraphRequest.ty;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str3 = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{s4.az()}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
                GraphRequest graphRequestG = w6Var.g(null, str3, null, null);
                graphRequestG.T(bundle);
                graphRequestG.gh();
            } catch (JSONException unused) {
            }
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Uo(String queriedEvent, String buttonText) {
            Intrinsics.checkNotNullParameter(queriedEvent, "$queriedEvent");
            Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
            aC.f12888r.O(queriedEvent, buttonText, new float[0]);
        }

        public final void nr(View hostView, View rootView, String activityName) {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            int iHashCode = hostView.hashCode();
            if (aC.rl().contains(Integer.valueOf(iHashCode))) {
                return;
            }
            Zfb.Wre.r(hostView, new aC(hostView, rootView, activityName, null));
            aC.rl().add(Integer.valueOf(iHashCode));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean J2(String str, final String str2) {
            final String strNr = n.nr(str);
            if (strNr == null) {
                return false;
            }
            if (!Intrinsics.areEqual(strNr, InneractiveMediationNameConsts.OTHER)) {
                vd.Org(new Runnable() { // from class: aP.Dsr
                    @Override // java.lang.Runnable
                    public final void run() {
                        aC.j.Uo(strNr, str2);
                    }
                });
                return true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void O(String str, String str2, float[] fArr) {
            if (I28.J2(str)) {
                new rv6(s4.qie()).O(str, str2);
            } else if (I28.O(str)) {
                KN(str, str2, fArr);
            }
        }
    }

    public /* synthetic */ aC(View view, View view2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, view2, str);
    }

    private aC(View view, View view2, String str) {
        this.f12890n = Zfb.Wre.Uo(view);
        this.f12891t = new WeakReference(view2);
        this.f12889O = new WeakReference(view);
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        this.J2 = StringsKt.replace$default(lowerCase, "activity", "", false, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(JSONObject viewData, String buttonText, aC this$0, String pathID) {
        String[] strArrIk;
        if (VmF.j.nr(aC.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(viewData, "$viewData");
            Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(pathID, "$pathID");
            try {
                String lowerCase = vd.S(s4.qie()).toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                float[] fArrN = aP.j.n(viewData, lowerCase);
                String strT = aP.j.t(buttonText, this$0.J2, lowerCase);
                if (fArrN != null && (strArrIk = eK.Wre.Ik(Wre.j.MTML_APP_EVENT_PREDICTION, new float[][]{fArrN}, new String[]{strT})) != null) {
                    String str = strArrIk[0];
                    n.n(pathID, str);
                    if (Intrinsics.areEqual(str, InneractiveMediationNameConsts.OTHER)) {
                        return;
                    }
                    f12888r.O(str, buttonText, fArrN);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            VmF.j.rl(th, aC.class);
        }
    }

    public static final /* synthetic */ Set rl() {
        if (VmF.j.nr(aC.class)) {
            return null;
        }
        try {
            return f12887o;
        } catch (Throwable th) {
            VmF.j.rl(th, aC.class);
            return null;
        }
    }

    private final void O() {
        if (!VmF.j.nr(this)) {
            try {
                View view = (View) this.f12891t.get();
                View view2 = (View) this.f12889O.get();
                if (view != null && view2 != null) {
                    try {
                        String strNr = w6.nr(view2);
                        String strRl = n.rl(view2, strNr);
                        if (strRl != null && !f12888r.J2(strRl, strNr)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("view", w6.rl(view, view2));
                            jSONObject.put("screenname", this.J2);
                            t(strRl, strNr, jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final void t(final String str, final String str2, final JSONObject jSONObject) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            vd.Org(new Runnable() { // from class: aP.fuX
                @Override // java.lang.Runnable
                public final void run() {
                    aC.nr(jSONObject, str2, this, str);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            View.OnClickListener onClickListener = this.f12890n;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            O();
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }
}

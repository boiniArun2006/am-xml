package aP;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f12900n = new w6();
    private static final List rl = CollectionsKt.listOf((Object[]) new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class});

    public static final void O(View view, JSONObject json) {
        if (VmF.j.nr(w6.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String strGh = Zfb.Wre.gh(view);
                String strXMQ = Zfb.Wre.xMQ(view);
                json.put("classname", view.getClass().getSimpleName());
                json.put("classtypebitmask", Zfb.Wre.t(view));
                if (strGh.length() > 0) {
                    json.put("text", strGh);
                }
                if (strXMQ.length() > 0) {
                    json.put("hint", strXMQ);
                }
                if (view instanceof EditText) {
                    json.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r5.isClickable() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        r1.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r5 = Zfb.Wre.rl(r5).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r5.hasNext() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r1.addAll(n((android.view.View) r5.next()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List n(View view) {
        if (VmF.j.nr(w6.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator it = rl.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Class) it.next()).isInstance(view)) {
                    break;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
            return null;
        }
    }

    public static final String nr(View hostView) {
        if (VmF.j.nr(w6.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            String strGh = Zfb.Wre.gh(hostView);
            if (strGh.length() > 0) {
                return strGh;
            }
            String strJoin = TextUtils.join(" ", f12900n.t(hostView));
            Intrinsics.checkNotNullExpressionValue(strJoin, "join(\" \", childrenText)");
            return strJoin;
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
            return null;
        }
    }

    public static final JSONObject rl(View view, View clickedView) {
        if (VmF.j.nr(w6.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            O(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = Zfb.Wre.rl(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(rl((View) it.next(), clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
            return null;
        }
    }

    private w6() {
    }

    private final List t(View view) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : Zfb.Wre.rl(view)) {
                String strGh = Zfb.Wre.gh(view2);
                if (strGh.length() > 0) {
                    arrayList.add(strGh);
                }
                arrayList.addAll(t(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}

package Ti;

import Ti.w6;
import com.facebook.GraphRequest;
import com.facebook.ci;
import com.facebook.g9s;
import com.facebook.internal.Pl;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f10530n = new n();
    private static boolean rl;

    public static final boolean nr() {
        return false;
    }

    public static final void rl() {
        rl = true;
        if (s4.ck()) {
            f10530n.O();
        }
    }

    public final void O() {
        if (vd.J()) {
            return;
        }
        File[] fileArrTy = C.ty();
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrTy) {
            final w6 w6VarNr = w6.j.nr(file);
            if (w6VarNr.J2()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", w6VarNr.toString());
                    GraphRequest.w6 w6Var = GraphRequest.ty;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("%s/instruments", Arrays.copyOf(new Object[]{s4.az()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                    arrayList.add(w6Var.g(null, str, jSONObject, new GraphRequest.n() { // from class: Ti.j
                        @Override // com.facebook.GraphRequest.n
                        public final void n(g9s g9sVar) {
                            n.J2(w6VarNr, g9sVar);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new ci(arrayList).KN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(w6 instrumentData, g9s response) {
        JSONObject jSONObjectNr;
        Intrinsics.checkNotNullParameter(instrumentData, "$instrumentData");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.rl() == null && (jSONObjectNr = response.nr()) != null && jSONObjectNr.getBoolean("success")) {
                instrumentData.n();
            }
        } catch (JSONException unused) {
        }
    }

    public static final void t(Throwable th) {
        if (!rl || nr() || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "it.className");
            Pl.n nVarNr = Pl.nr(className);
            if (nVarNr != Pl.n.Unknown) {
                Pl.t(nVarNr);
                hashSet.add(nVarNr.toString());
            }
        }
        if (!s4.ck() || hashSet.isEmpty()) {
            return;
        }
        w6.j.t(new JSONArray((Collection) hashSet)).Uo();
    }

    private n() {
    }
}

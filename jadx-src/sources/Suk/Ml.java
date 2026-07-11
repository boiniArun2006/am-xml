package Suk;

import android.content.SharedPreferences;
import com.facebook.Ew;
import com.facebook.GraphRequest;
import com.facebook.afx;
import com.facebook.g9s;
import com.facebook.internal.Z;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f10035n = new Ml();
    private static final String rl = Ml.class.getCanonicalName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f10036t;

    public static final Map O() {
        if (VmF.j.nr(Ml.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = s4.qie().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
            if (sharedPreferences == null) {
                return null;
            }
            Xo xo = Xo.DATASETID;
            String string = sharedPreferences.getString(xo.rl(), null);
            Xo xo2 = Xo.URL;
            String string2 = sharedPreferences.getString(xo2.rl(), null);
            Xo xo3 = Xo.ACCESSKEY;
            String string3 = sharedPreferences.getString(xo3.rl(), null);
            if (string != null && !StringsKt.isBlank(string) && string2 != null && !StringsKt.isBlank(string2) && string3 != null && !StringsKt.isBlank(string3)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(xo2.rl(), string2);
                linkedHashMap.put(xo.rl(), string);
                linkedHashMap.put(xo3.rl(), string3);
                Z.f52780O.t(Ew.APP_EVENTS, rl.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                return linkedHashMap;
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, Ml.class);
            return null;
        }
    }

    public static final void rl() {
        try {
            GraphRequest graphRequest = new GraphRequest(null, s4.az() + "/cloudbridge_settings", null, afx.GET, new GraphRequest.n() { // from class: Suk.w6
                @Override // com.facebook.GraphRequest.n
                public final void n(g9s g9sVar) {
                    Ml.t(g9sVar);
                }
            }, null, 32, null);
            Z.j jVar = Z.f52780O;
            Ew ew = Ew.APP_EVENTS;
            String str = rl;
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            jVar.t(ew, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
            graphRequest.qie();
        } catch (JSONException e2) {
            Z.j jVar2 = Z.f52780O;
            Ew ew2 = Ew.APP_EVENTS;
            String str2 = rl;
            Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type kotlin.String");
            jVar2.t(ew2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", ExceptionsKt.stackTraceToString(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(g9s response) {
        Intrinsics.checkNotNullParameter(response, "response");
        f10035n.nr(response);
    }

    public final boolean J2() {
        return f10036t;
    }

    public final void nr(g9s response) {
        Object obj;
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.rl() != null) {
            Z.j jVar = Z.f52780O;
            Ew ew = Ew.APP_EVENTS;
            String str = rl;
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            jVar.t(ew, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", response.rl().toString(), String.valueOf(response.rl().getException()));
            Map mapO = O();
            if (mapO != null) {
                URL url = new URL(String.valueOf(mapO.get(Xo.URL.rl())));
                CN3.nr(String.valueOf(mapO.get(Xo.DATASETID.rl())), url.getProtocol() + "://" + url.getHost(), String.valueOf(mapO.get(Xo.ACCESSKEY.rl())));
                f10036t = true;
                return;
            }
            return;
        }
        Z.j jVar2 = Z.f52780O;
        Ew ew2 = Ew.APP_EVENTS;
        String TAG = rl;
        Intrinsics.checkNotNull(TAG, "null cannot be cast to non-null type kotlin.String");
        jVar2.t(ew2, TAG, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
        JSONObject jSONObjectT = response.t();
        if (jSONObjectT != null) {
            try {
                obj = jSONObjectT.get("data");
            } catch (NullPointerException e2) {
                Z.j jVar3 = Z.f52780O;
                Ew ew3 = Ew.APP_EVENTS;
                String TAG2 = rl;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                jVar3.t(ew3, TAG2, "CloudBridge Settings API response is not a valid json: \n%s ", ExceptionsKt.stackTraceToString(e2));
                return;
            } catch (JSONException e3) {
                Z.j jVar4 = Z.f52780O;
                Ew ew4 = Ew.APP_EVENTS;
                String TAG3 = rl;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                jVar4.t(ew4, TAG3, "CloudBridge Settings API response is not a valid json: \n%s ", ExceptionsKt.stackTraceToString(e3));
                return;
            }
        } else {
            obj = null;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
        Map mapHI = vd.HI(new JSONObject((String) CollectionsKt.firstOrNull(vd.ty((JSONArray) obj))));
        String str2 = (String) mapHI.get(Xo.URL.rl());
        String str3 = (String) mapHI.get(Xo.DATASETID.rl());
        String str4 = (String) mapHI.get(Xo.ACCESSKEY.rl());
        if (str2 == null || str3 == null || str4 == null) {
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            jVar2.rl(ew2, TAG, "CloudBridge Settings API response doesn't have valid data");
            return;
        }
        try {
            CN3.nr(str3, str2, str4);
            Uo(mapHI);
            Xo xo = Xo.ENABLED;
            if (mapHI.get(xo.rl()) != null) {
                Object obj2 = mapHI.get(xo.rl());
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                zBooleanValue = ((Boolean) obj2).booleanValue();
            } else {
                zBooleanValue = false;
            }
            f10036t = zBooleanValue;
        } catch (MalformedURLException e4) {
            Z.j jVar5 = Z.f52780O;
            Ew ew5 = Ew.APP_EVENTS;
            String TAG4 = rl;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            jVar5.t(ew5, TAG4, "CloudBridge Settings API response doesn't have valid url\n %s ", ExceptionsKt.stackTraceToString(e4));
        }
    }

    private Ml() {
    }

    public final void Uo(Map map) {
        SharedPreferences sharedPreferences = s4.qie().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences != null) {
            if (map == null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.clear();
                editorEdit.apply();
                return;
            }
            Xo xo = Xo.DATASETID;
            Object obj = map.get(xo.rl());
            Xo xo2 = Xo.URL;
            Object obj2 = map.get(xo2.rl());
            Xo xo3 = Xo.ACCESSKEY;
            Object obj3 = map.get(xo3.rl());
            if (obj != null && obj2 != null && obj3 != null) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                editorEdit2.putString(xo.rl(), obj.toString());
                editorEdit2.putString(xo2.rl(), obj2.toString());
                editorEdit2.putString(xo3.rl(), obj3.toString());
                editorEdit2.apply();
                Z.f52780O.t(Ew.APP_EVENTS, rl.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
            }
        }
    }
}

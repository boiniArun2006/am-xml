package Suk;

import Suk.CN3;
import com.facebook.Ew;
import com.facebook.GraphRequest;
import com.facebook.internal.Z;
import com.facebook.internal.vd;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.safedk.android.a.g;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class CN3 {
    private static int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static List f10002O;
    public static j nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CN3 f10003n = new CN3();
    private static final HashSet rl = SetsKt.hashSetOf(200, Integer.valueOf(Sdk.SDKError.Reason.AD_CONSUMED_VALUE));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final HashSet f10004t = SetsKt.hashSetOf(503, 504, 429);

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f10005n;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f10006t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f10005n, jVar.f10005n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f10006t, jVar.f10006t);
        }

        public j(String datasetID, String cloudBridgeURL, String accessKey) {
            Intrinsics.checkNotNullParameter(datasetID, "datasetID");
            Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
            Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            this.f10005n = datasetID;
            this.rl = cloudBridgeURL;
            this.f10006t = accessKey;
        }

        public int hashCode() {
            return (((this.f10005n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f10006t.hashCode();
        }

        public final String n() {
            return this.f10006t;
        }

        public final String rl() {
            return this.rl;
        }

        public final String t() {
            return this.f10005n;
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.f10005n + ", cloudBridgeURL=" + this.rl + ", accessKey=" + this.f10006t + ')';
        }
    }

    static final class n extends Lambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f10007n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(List list) {
            super(2);
            this.f10007n = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(Integer num, List processedEvents) {
            Intrinsics.checkNotNullParameter(processedEvents, "$processedEvents");
            if (CollectionsKt.contains(CN3.rl, num)) {
                return;
            }
            CN3.f10003n.Uo(num, processedEvents, 5);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((String) obj, (Integer) obj2);
            return Unit.INSTANCE;
        }

        public final void rl(String str, final Integer num) {
            final List list = this.f10007n;
            vd.Org(new Runnable() { // from class: Suk.fuX
                @Override // java.lang.Runnable
                public final void run() {
                    CN3.n.t(num, list);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(GraphRequest request) throws JSONException {
        Intrinsics.checkNotNullParameter(request, "$request");
        String strR = request.r();
        List listSplit$default = strR != null ? StringsKt.split$default((CharSequence) strR, new String[]{"/"}, false, 0, 6, (Object) null) : null;
        if (listSplit$default == null || listSplit$default.size() != 2) {
            Z.f52780O.t(Ew.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", request);
            return;
        }
        try {
            CN3 cn3 = f10003n;
            String str = cn3.O().rl() + "/capi/" + cn3.O().t() + "/events";
            List listGh = cn3.gh(request);
            if (listGh == null) {
                return;
            }
            cn3.t(listGh);
            int iMin = Math.min(cn3.J2().size(), 10);
            List listSlice = CollectionsKt.slice(cn3.J2(), new IntRange(0, iMin - 1));
            cn3.J2().subList(0, iMin).clear();
            JSONArray jSONArray = new JSONArray((Collection) listSlice);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", cn3.O().n());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            Z.j jVar = Z.f52780O;
            Ew ew = Ew.APP_EVENTS;
            String string = jSONObject.toString(2);
            Intrinsics.checkNotNullExpressionValue(string, "jsonBodyStr.toString(2)");
            jVar.t(ew, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, request, string);
            cn3.KN(str, "POST", jSONObject.toString(), MapsKt.mapOf(TuplesKt.to("Content-Type", "application/json")), 60000, new n(listSlice));
        } catch (UninitializedPropertyAccessException e2) {
            Z.f52780O.t(Ew.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e2);
        }
    }

    public static final void nr(String datasetID, String url, String accessKey) {
        Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        Z.f52780O.t(Ew.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        CN3 cn3 = f10003n;
        cn3.xMQ(new j(datasetID, url, accessKey));
        cn3.mUb(new ArrayList());
    }

    public static final void qie(final GraphRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        vd.Org(new Runnable() { // from class: Suk.Wre
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                CN3.az(request);
            }
        });
    }

    public final List J2() {
        List list = f10002O;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transformedEvents");
        return null;
    }

    public final void KN(String urlStr, String requestMethod, String str, Map map, int i2, Function2 function2) {
        Set<String> setKeySet;
        Intrinsics.checkNotNullParameter(urlStr, "urlStr");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(urlStr).openConnection());
            Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestMethod(requestMethod);
            if (map != null && (setKeySet = map.keySet()) != null) {
                for (String str2 : setKeySet) {
                    httpURLConnection.setRequestProperty(str2, (String) map.get(str2));
                }
            }
            httpURLConnection.setDoOutput(httpURLConnection.getRequestMethod().equals("POST") || httpURLConnection.getRequestMethod().equals(g.f61256f));
            httpURLConnection.setConnectTimeout(i2);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, com.google.android.exoplayer2.C.UTF8_NAME));
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedOutputStream.close();
            StringBuilder sb = new StringBuilder();
            if (rl.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), com.google.android.exoplayer2.C.UTF8_NAME));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb.append(line);
                        }
                    } finally {
                        try {
                            throw th;
                        } catch (Throwable th) {
                            CloseableKt.closeFinally(bufferedReader, th);
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedReader, null);
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "connResponseSB.toString()");
            Z.f52780O.t(Ew.APP_EVENTS, "CAPITransformerWebRequests", "\nResponse Received: \n%s\n%s", string, Integer.valueOf(httpURLConnection.getResponseCode()));
            if (function2 != null) {
                function2.invoke(string, Integer.valueOf(httpURLConnection.getResponseCode()));
            }
        } catch (UnknownHostException e2) {
            Z.f52780O.t(Ew.APP_EVENTS, "CAPITransformerWebRequests", "Connection failed, retrying: \n%s", e2.toString());
            if (function2 != null) {
                function2.invoke(null, 503);
            }
        } catch (IOException e3) {
            Z.f52780O.t(Ew.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "Send to server failed: \n%s", e3.toString());
        }
    }

    public final j O() {
        j jVar = nr;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("credentials");
        return null;
    }

    public final void Uo(Integer num, List processedEvents, int i2) {
        Intrinsics.checkNotNullParameter(processedEvents, "processedEvents");
        if (CollectionsKt.contains(f10004t, num)) {
            if (J2 >= i2) {
                J2().clear();
                J2 = 0;
            } else {
                J2().addAll(0, processedEvents);
                J2++;
            }
        }
    }

    public final void mUb(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        f10002O = list;
    }

    public final void t(List list) {
        if (list != null) {
            J2().addAll(list);
        }
        int iMax = Math.max(0, J2().size() - 1000);
        if (iMax > 0) {
            List listDrop = CollectionsKt.drop(J2(), iMax);
            Intrinsics.checkNotNull(listDrop, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
            mUb(TypeIntrinsics.asMutableList(listDrop));
        }
    }

    public final void xMQ(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        nr = jVar;
    }

    private CN3() {
    }

    private final List gh(GraphRequest graphRequest) {
        JSONObject jSONObjectIk = graphRequest.Ik();
        if (jSONObjectIk != null) {
            Map mutableMap = MapsKt.toMutableMap(vd.HI(jSONObjectIk));
            Object objWPU = graphRequest.WPU();
            Intrinsics.checkNotNull(objWPU, "null cannot be cast to non-null type kotlin.Any");
            mutableMap.put("custom_events", objWPU);
            StringBuilder sb = new StringBuilder();
            for (String str : mutableMap.keySet()) {
                sb.append(str);
                sb.append(" : ");
                sb.append(mutableMap.get(str));
                sb.append(System.getProperty("line.separator"));
            }
            Z.f52780O.t(Ew.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb);
            return I28.f10022n.O(mutableMap);
        }
        return null;
    }
}

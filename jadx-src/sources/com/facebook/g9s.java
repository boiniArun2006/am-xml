package com.facebook;

import Hr.CQ.USEaHtCMH;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.internal.vd;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class g9s {
    public final FacebookRequestError J2;
    public final JSONArray KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final JSONArray f52401O;
    public final JSONObject Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final GraphRequest f52402n;
    public final JSONObject nr;
    public final HttpURLConnection rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f52403t;
    public static final j xMQ = new j(null);
    public static final String mUb = g9s.class.getCanonicalName();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public j() {
        }

        private final g9s rl(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object NULL, Object obj) throws JSONException {
            if (NULL instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) NULL;
                FacebookRequestError facebookRequestErrorN = FacebookRequestError.INSTANCE.n(jSONObject, obj, httpURLConnection);
                if (facebookRequestErrorN != null) {
                    Log.e(g9s.mUb, facebookRequestErrorN.toString());
                    if (facebookRequestErrorN.getErrorCode() == 190 && vd.B(graphRequest.az())) {
                        if (facebookRequestErrorN.getSubErrorCode() != 493) {
                            AccessToken.INSTANCE.KN(null);
                        } else {
                            AccessToken.Companion companion = AccessToken.INSTANCE;
                            AccessToken accessTokenO = companion.O();
                            if (accessTokenO != null && !accessTokenO.ty()) {
                                companion.nr();
                            }
                        }
                    }
                    return new g9s(graphRequest, httpURLConnection, facebookRequestErrorN);
                }
                Object objXw = vd.Xw(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (objXw instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) objXw;
                    return new g9s(graphRequest, httpURLConnection, jSONObject2.toString(), jSONObject2);
                }
                if (objXw instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objXw;
                    return new g9s(graphRequest, httpURLConnection, jSONArray.toString(), jSONArray);
                }
                NULL = JSONObject.NULL;
                Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
            }
            if (NULL == JSONObject.NULL) {
                return new g9s(graphRequest, httpURLConnection, NULL.toString(), (JSONObject) null);
            }
            throw new FacebookException("Got unexpected object type in response, class: " + NULL.getClass().getSimpleName());
        }

        public final List J2(HttpURLConnection connection, ci requests) {
            List listN;
            String str = USEaHtCMH.ylKRBxMGRBLQA;
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            try {
                try {
                    try {
                        if (!s4.E2()) {
                            Log.e(g9s.mUb, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                            throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        }
                        InputStream errorStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                        List listNr = nr(errorStream, connection, requests);
                        vd.mUb(errorStream);
                        return listNr;
                    } catch (FacebookException e2) {
                        com.facebook.internal.Z.f52780O.t(Ew.REQUESTS, str, "Response <Error>: %s", e2);
                        listN = n(requests, connection, e2);
                        vd.mUb(null);
                        return listN;
                    }
                } catch (Exception e3) {
                    com.facebook.internal.Z.f52780O.t(Ew.REQUESTS, str, "Response <Error>: %s", e3);
                    listN = n(requests, connection, new FacebookException(e3));
                    vd.mUb(null);
                    return listN;
                }
            } catch (Throwable th) {
                vd.mUb(null);
                throw th;
            }
        }

        public final List O(String responseString, HttpURLConnection httpURLConnection, ci requests) throws JSONException {
            Intrinsics.checkNotNullParameter(responseString, "responseString");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Object resultObject = new JSONTokener(responseString).nextValue();
            Intrinsics.checkNotNullExpressionValue(resultObject, "resultObject");
            List listT = t(httpURLConnection, requests, resultObject);
            com.facebook.internal.Z.f52780O.t(Ew.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.ty(), Integer.valueOf(responseString.length()), listT);
            return listT;
        }

        public final List n(List requests, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(requests, 10));
            Iterator it = requests.iterator();
            while (it.hasNext()) {
                arrayList.add(new g9s((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(httpURLConnection, facebookException)));
            }
            return arrayList;
        }

        public final List nr(InputStream inputStream, HttpURLConnection httpURLConnection, ci requests) throws Throwable {
            Intrinsics.checkNotNullParameter(requests, "requests");
            String strG7 = vd.G7(inputStream);
            com.facebook.internal.Z.f52780O.t(Ew.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strG7.length()), strG7);
            return O(strG7, httpURLConnection, requests);
        }

        private final List t(HttpURLConnection httpURLConnection, List list, Object obj) {
            Object obj2;
            int responseCode;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                GraphRequest graphRequest = (GraphRequest) list.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", obj);
                    if (httpURLConnection != null) {
                        responseCode = httpURLConnection.getResponseCode();
                    } else {
                        responseCode = 200;
                    }
                    jSONObject.put("code", responseCode);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj2 = jSONArray;
                } catch (IOException e2) {
                    arrayList.add(new g9s(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e2)));
                    obj2 = obj;
                } catch (JSONException e3) {
                    arrayList.add(new g9s(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e3)));
                    obj2 = obj;
                }
            } else {
                obj2 = obj;
            }
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj2;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        GraphRequest graphRequest2 = (GraphRequest) list.get(i2);
                        try {
                            Object obj3 = ((JSONArray) obj2).get(i2);
                            Intrinsics.checkNotNullExpressionValue(obj3, "obj");
                            arrayList.add(rl(graphRequest2, httpURLConnection, obj3, obj));
                        } catch (FacebookException e4) {
                            arrayList.add(new g9s(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e4)));
                        } catch (JSONException e5) {
                            arrayList.add(new g9s(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e5)));
                        }
                    }
                    return arrayList;
                }
            }
            throw new FacebookException("Unexpected number of results");
        }
    }

    public g9s(GraphRequest request, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f52402n = request;
        this.rl = httpURLConnection;
        this.f52403t = str;
        this.nr = jSONObject;
        this.f52401O = jSONArray;
        this.J2 = facebookRequestError;
        this.Uo = jSONObject;
        this.KN = jSONArray;
    }

    public final JSONObject nr() {
        return this.Uo;
    }

    public final FacebookRequestError rl() {
        return this.J2;
    }

    public final JSONObject t() {
        return this.nr;
    }

    public String toString() {
        String str;
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.rl;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.nr + ", error: " + this.J2 + "}";
        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g9s(GraphRequest request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g9s(GraphRequest request, HttpURLConnection httpURLConnection, String rawResponse, JSONArray graphObjects) {
        this(request, httpURLConnection, rawResponse, null, graphObjects, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        Intrinsics.checkNotNullParameter(graphObjects, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g9s(GraphRequest request, HttpURLConnection httpURLConnection, FacebookRequestError error) {
        this(request, httpURLConnection, null, null, null, error);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
    }
}

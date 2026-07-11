package com.safedk.android.analytics.reporters;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.SafeDK;
import com.safedk.android.utils.e;
import com.safedk.android.utils.n;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f62853a = "exceptions";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62854b = "type";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62855c = "message";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62856d = "lines";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62857e = "proguard_map_uuid";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f62858g = "build_params";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f62859h = "crash_stacktrace";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f62860i = "threads_traces";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f62861j = "is_low_memory";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Context f62862f;

    public b() {
        this.f62862f = null;
        if (SafeDK.getInstance() != null) {
            this.f62862f = SafeDK.getInstance().m();
        }
    }

    public b(Context context) {
        this.f62862f = null;
        this.f62862f = context;
    }

    protected JSONObject a(Throwable th, boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f62858g, n.a(a()));
        jSONObject.put(f62861j, e.b(this.f62862f));
        jSONObject.put(f62859h, a(th));
        if (z2) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                jSONArray.put(a(entry.getKey(), entry.getValue()));
            }
            jSONObject.put(f62860i, jSONArray);
        }
        String proguardMD5 = SafeDK.getProguardMD5();
        if (!TextUtils.isEmpty(proguardMD5)) {
            jSONObject.put(f62857e, proguardMD5);
        }
        return jSONObject;
    }

    private Bundle a() {
        Bundle bundle = new Bundle();
        a(Build.class, "", bundle);
        a(Build.VERSION.class, "VERSION", bundle);
        return bundle;
    }

    private void a(Class<?> cls, String str, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        for (Field field : cls.getFields()) {
            StringBuilder sb2 = new StringBuilder();
            if (str != null && str.length() > 0) {
                sb2.append(str);
                sb2.append('.');
            }
            sb2.append(field.getName());
            try {
                Object obj = field.get(null);
                if (obj != null) {
                    if (field.getType().isArray()) {
                        bundle.putParcelableArrayList(sb2.toString(), (ArrayList) Arrays.asList(obj));
                    } else {
                        bundle.putString(sb2.toString(), obj.toString());
                    }
                }
            } catch (IllegalAccessException e2) {
                sb.append("N/A");
            } catch (IllegalArgumentException e3) {
                sb.append("N/A");
            } catch (Exception e4) {
            }
        }
    }

    protected JSONObject a(Throwable th) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONObject.put(f62853a, jSONArray);
        a(th, jSONArray);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            a(cause, jSONArray);
        }
        return jSONObject;
    }

    private void a(Throwable th, JSONArray jSONArray) throws JSONException {
        if (th == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", th.getClass());
        jSONObject.put("message", th.getMessage());
        a(jSONObject, th.getStackTrace());
        jSONArray.put(jSONObject);
    }

    private void a(JSONObject jSONObject, StackTraceElement[] stackTraceElementArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("c", stackTraceElement.getClassName());
            jSONObject2.put("m", stackTraceElement.getMethodName());
            jSONObject2.put(InneractiveMediationDefs.GENDER_FEMALE, stackTraceElement.getFileName());
            jSONObject2.put(CmcdData.STREAM_TYPE_LIVE, stackTraceElement.getLineNumber());
            jSONObject2.put(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, stackTraceElement.isNativeMethod());
            jSONArray.put(jSONObject2);
        }
        jSONObject.put(f62856d, jSONArray);
    }

    protected JSONObject a(Thread thread, StackTraceElement[] stackTraceElementArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, thread.getName());
        a(jSONObject, stackTraceElementArr);
        return jSONObject;
    }
}

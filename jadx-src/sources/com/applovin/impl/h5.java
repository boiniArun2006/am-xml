package com.applovin.impl;

import androidx.arch.core.util.Function;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f48657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f48658b = new Object();

    public JSONObject a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.f48658b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f48657a);
        }
        return jSONObjectDeepCopy;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f48658b) {
            stringList = JsonUtils.getStringList(this.f48657a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f48658b) {
            this.f48657a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f48658b) {
            string = this.f48657a.toString();
        }
        return string;
    }

    public h5(JSONObject jSONObject) {
        this.f48657a = jSONObject;
    }

    public boolean a(String str) {
        boolean zHas;
        synchronized (this.f48658b) {
            zHas = this.f48657a.has(str);
        }
        return zHas;
    }

    public Object b(String str) {
        Object objOpt;
        synchronized (this.f48658b) {
            objOpt = this.f48657a.opt(str);
        }
        return objOpt;
    }

    public void a(Consumer consumer) {
        synchronized (this.f48658b) {
            consumer.accept(this);
        }
    }

    public void b(String str, int i2) {
        synchronized (this.f48658b) {
            JsonUtils.putInt(this.f48657a, str, i2);
        }
    }

    public Object a(Function function) {
        Object objApply;
        synchronized (this.f48658b) {
            objApply = function.apply(this);
        }
        return objApply;
    }

    public void b(String str, long j2) {
        synchronized (this.f48658b) {
            JsonUtils.putLong(this.f48657a, str, j2);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f48658b) {
            bool2 = JsonUtils.getBoolean(this.f48657a, str, bool);
        }
        return bool2;
    }

    public void b(String str, String str2) {
        synchronized (this.f48658b) {
            JsonUtils.putString(this.f48657a, str, str2);
        }
    }

    public float a(String str, float f3) {
        float f4;
        synchronized (this.f48658b) {
            f4 = JsonUtils.getFloat(this.f48657a, str, f3);
        }
        return f4;
    }

    public int a(String str, int i2) {
        int i3;
        synchronized (this.f48658b) {
            i3 = JsonUtils.getInt(this.f48657a, str, i2);
        }
        return i3;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f48658b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f48657a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f48658b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f48657a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j2) {
        long j3;
        synchronized (this.f48658b) {
            j3 = JsonUtils.getLong(this.f48657a, str, j2);
        }
        return j3;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f48658b) {
            string = JsonUtils.getString(this.f48657a, str, str2);
        }
        return string;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f48658b) {
            integerList = JsonUtils.getIntegerList(this.f48657a, str, list);
        }
        return integerList;
    }

    public void a(String str, boolean z2) {
        synchronized (this.f48658b) {
            JsonUtils.putBoolean(this.f48657a, str, z2);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f48658b) {
            JsonUtils.putObject(this.f48657a, str, obj);
        }
    }
}

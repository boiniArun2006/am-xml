package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class CN3 {
    private static final Date KN = new Date(0);
    private long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private JSONObject f60710O;
    private JSONArray Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private JSONObject f60711n;
    private JSONArray nr;
    private JSONObject rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Date f60712t;

    public static class n {
        private JSONArray J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f60713O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private JSONObject f60714n;
        private JSONObject nr;
        private Date rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private JSONArray f60715t;

        private n() {
            this.f60714n = new JSONObject();
            this.rl = CN3.KN;
            this.f60715t = new JSONArray();
            this.nr = new JSONObject();
            this.f60713O = 0L;
            this.J2 = new JSONArray();
        }

        public n J2(JSONObject jSONObject) {
            try {
                this.nr = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public n KN(long j2) {
            this.f60713O = j2;
            return this;
        }

        public n O(Date date) {
            this.rl = date;
            return this;
        }

        public n Uo(JSONArray jSONArray) {
            try {
                this.J2 = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public CN3 n() {
            return new CN3(this.f60714n, this.rl, this.f60715t, this.nr, this.f60713O, this.J2);
        }

        public n nr(JSONArray jSONArray) {
            try {
                this.f60715t = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public n rl(Map map) {
            this.f60714n = new JSONObject(map);
            return this;
        }

        public n t(JSONObject jSONObject) {
            try {
                this.f60714n = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }
    }

    private CN3(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j2, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j2);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.rl = jSONObject;
        this.f60712t = date;
        this.nr = jSONArray;
        this.f60710O = jSONObject2;
        this.J2 = j2;
        this.Uo = jSONArray2;
        this.f60711n = jSONObject3;
    }

    private static CN3 nr(JSONObject jSONObject) {
        return rl(new JSONObject(jSONObject.toString()));
    }

    public static n qie() {
        return new n();
    }

    static CN3 rl(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new CN3(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    private Map t() throws JSONException {
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < mUb().length(); i2++) {
            JSONObject jSONObject = mUb().getJSONObject(i2);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                String string3 = jSONArray.getString(i3);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    public Set J2(CN3 cn3) throws JSONException {
        JSONObject jSONObjectUo = nr(cn3.f60711n).Uo();
        Map mapT = t();
        Map mapT2 = cn3.t();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = Uo().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!cn3.Uo().has(next)) {
                hashSet.add(next);
            } else if (!Uo().get(next).equals(cn3.Uo().get(next))) {
                hashSet.add(next);
            } else if ((xMQ().has(next) && !cn3.xMQ().has(next)) || (!xMQ().has(next) && cn3.xMQ().has(next))) {
                hashSet.add(next);
            } else if (xMQ().has(next) && cn3.xMQ().has(next) && !xMQ().getJSONObject(next).toString().equals(cn3.xMQ().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapT.containsKey(next) != mapT2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapT.containsKey(next) && mapT2.containsKey(next) && !((Map) mapT.get(next)).equals(mapT2.get(next))) {
                hashSet.add(next);
            } else {
                jSONObjectUo.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObjectUo.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public Date KN() {
        return this.f60712t;
    }

    public JSONArray O() {
        return this.nr;
    }

    public JSONObject Uo() {
        return this.rl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CN3) {
            return this.f60711n.toString().equals(((CN3) obj).toString());
        }
        return false;
    }

    public long gh() {
        return this.J2;
    }

    public int hashCode() {
        return this.f60711n.hashCode();
    }

    public JSONArray mUb() {
        return this.Uo;
    }

    public String toString() {
        return this.f60711n.toString();
    }

    public JSONObject xMQ() {
        return this.f60710O;
    }
}

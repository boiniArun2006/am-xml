package com.google.firebase.remoteconfig.internal;

import N67.C;
import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.content.SharedPreferences;
import c8G.Fsz.qwlyMfUJj;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class C1916c {
    static final Date J2 = new Date(-1);
    static final Date Uo = new Date(-1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SharedPreferences f60744n;
    private final Object rl = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f60745t = new Object();
    private final Object nr = new Object();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f60743O = new Object();

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.c$j */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f60746n;
        private Date rl;

        Date n() {
            return this.rl;
        }

        int rl() {
            return this.f60746n;
        }

        j(int i2, Date date) {
            this.f60746n = i2;
            this.rl = date;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.c$n */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f60747n;
        private Date rl;

        Date n() {
            return this.rl;
        }

        int rl() {
            return this.f60747n;
        }

        public n(int i2, Date date) {
            this.f60747n = i2;
            this.rl = date;
        }
    }

    void gh() {
        HI(0, Uo);
    }

    void mUb() {
        qie(0, Uo);
    }

    void HI(int i2, Date date) {
        synchronized (this.nr) {
            this.f60744n.edit().putInt("num_failed_realtime_streams", i2).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void Ik(Date date) {
        synchronized (this.rl) {
            this.f60744n.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    Date J2() {
        return new Date(this.f60744n.getLong("last_fetch_time_in_millis", -1L));
    }

    public long KN() {
        return this.f60744n.getLong("minimum_fetch_interval_in_seconds", qz.mUb);
    }

    String O() {
        return this.f60744n.getString(qwlyMfUJj.xPlGosZL, null);
    }

    long Uo() {
        return this.f60744n.getLong("last_template_version", 0L);
    }

    void az(String str) {
        synchronized (this.rl) {
            this.f60744n.edit().putString(pTYaLzzmJSGAPQ.pStHyczb, str).apply();
        }
    }

    void ck() {
        synchronized (this.rl) {
            this.f60744n.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    j n() {
        j jVar;
        synchronized (this.f60745t) {
            jVar = new j(this.f60744n.getInt("num_failed_fetches", 0), new Date(this.f60744n.getLong("backoff_end_time_in_millis", -1L)));
        }
        return jVar;
    }

    public N67.aC nr() {
        UGc uGcN;
        synchronized (this.rl) {
            long j2 = this.f60744n.getLong("last_fetch_time_in_millis", -1L);
            int i2 = this.f60744n.getInt("last_fetch_status", 0);
            uGcN = UGc.rl().t(i2).nr(j2).rl(new C.n().nr(this.f60744n.getLong("fetch_timeout_in_seconds", 60L)).O(this.f60744n.getLong("minimum_fetch_interval_in_seconds", qz.mUb)).t()).n();
        }
        return uGcN;
    }

    void qie(int i2, Date date) {
        synchronized (this.f60745t) {
            this.f60744n.edit().putInt("num_failed_fetches", i2).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void r() {
        synchronized (this.rl) {
            this.f60744n.edit().putInt("last_fetch_status", 2).apply();
        }
    }

    public Map rl() {
        try {
            JSONObject jSONObject = new JSONObject(this.f60744n.getString("customSignals", dpcnwfoVOnrtRA.ahonzETcXQ));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public long t() {
        return this.f60744n.getLong("fetch_timeout_in_seconds", 60L);
    }

    void ty(long j2) {
        synchronized (this.rl) {
            this.f60744n.edit().putLong("last_template_version", j2).apply();
        }
    }

    public n xMQ() {
        n nVar;
        synchronized (this.nr) {
            nVar = new n(this.f60744n.getInt("num_failed_realtime_streams", 0), new Date(this.f60744n.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return nVar;
    }

    public C1916c(SharedPreferences sharedPreferences) {
        this.f60744n = sharedPreferences;
    }
}

package com.safedk.android.internal;

import android.os.Bundle;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f63049a = "master";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f63050b = "collect_host_urls";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f63051c = "SafeDKToggles";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f63052d = "network";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f63053e = "location";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f63054f = "calllog";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f63055g = "accounts";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f63056h = "contacts";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f63057i = "calendar";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f63058j = "browser";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f63059k = "sms";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f63060l = "files";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f63061m = "camera";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f63062n = "microphone";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f63063o = "accelerometer";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f63064p = "notifications";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f63065q = "packagemanager";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f63066r = "advertising_identifier";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f63076s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f63077t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f63078u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f63079v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f63080w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f63081x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f63082y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f63083z = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f63067A = true;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f63068B = true;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f63069C = true;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f63070D = true;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f63071E = true;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f63072F = true;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f63073G = true;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f63074H = true;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f63075I = false;

    public h(boolean z2) {
        b(z2);
    }

    private void b(boolean z2) {
        this.f63074H = z2;
        this.f63073G = z2;
        this.f63072F = z2;
        this.f63071E = z2;
        this.f63070D = z2;
        this.f63069C = z2;
        this.f63068B = z2;
        this.f63067A = z2;
        this.f63083z = z2;
        this.f63082y = z2;
        this.f63081x = z2;
        this.f63080w = z2;
        this.f63079v = z2;
        this.f63078u = z2;
        this.f63077t = z2;
        this.f63076s = z2;
        this.f63075I = false;
    }

    public h(String str) {
        a(str);
    }

    public h(JSONObject jSONObject) {
        a(jSONObject);
    }

    private Bundle s() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(f63049a, this.f63076s);
        bundle.putBoolean("network", this.f63077t);
        bundle.putBoolean(f63053e, this.f63078u);
        bundle.putBoolean(f63055g, this.f63080w);
        bundle.putBoolean(f63054f, this.f63079v);
        bundle.putBoolean(f63056h, this.f63081x);
        bundle.putBoolean(f63057i, this.f63082y);
        bundle.putBoolean(f63058j, this.f63083z);
        bundle.putBoolean(f63059k, this.f63067A);
        bundle.putBoolean("files", this.f63068B);
        bundle.putBoolean(f63061m, this.f63069C);
        bundle.putBoolean(f63062n, this.f63070D);
        bundle.putBoolean(f63063o, this.f63071E);
        bundle.putBoolean(f63064p, this.f63072F);
        bundle.putBoolean(f63065q, this.f63073G);
        bundle.putBoolean(f63066r, this.f63074H);
        bundle.putBoolean(f63050b, this.f63075I);
        return bundle;
    }

    private void a(String str) {
        try {
            a(new JSONObject(str));
        } catch (JSONException e2) {
            Logger.e(f63051c, "Failed to convert toggles to json", e2);
        }
    }

    public void a(JSONObject jSONObject) {
        try {
            if (jSONObject.has(f63049a)) {
                this.f63076s = jSONObject.getBoolean(f63049a);
            }
            if (jSONObject.has("network")) {
                this.f63077t = jSONObject.getBoolean("network");
            }
            if (jSONObject.has(f63053e)) {
                this.f63078u = jSONObject.getBoolean(f63053e);
            }
            if (jSONObject.has(f63055g)) {
                this.f63080w = jSONObject.getBoolean(f63055g);
            }
            if (jSONObject.has(f63054f)) {
                this.f63079v = jSONObject.getBoolean(f63054f);
            }
            if (jSONObject.has(f63056h)) {
                this.f63081x = jSONObject.getBoolean(f63056h);
            }
            if (jSONObject.has(f63057i)) {
                this.f63082y = jSONObject.getBoolean(f63057i);
            }
            if (jSONObject.has(f63058j)) {
                this.f63083z = jSONObject.getBoolean(f63058j);
            }
            if (jSONObject.has(f63059k)) {
                this.f63067A = jSONObject.getBoolean(f63059k);
            }
            if (jSONObject.has("files")) {
                this.f63068B = jSONObject.getBoolean("files");
            }
            if (jSONObject.has(f63061m)) {
                this.f63069C = jSONObject.getBoolean(f63061m);
            }
            if (jSONObject.has(f63062n)) {
                this.f63070D = jSONObject.getBoolean(f63062n);
            }
            if (jSONObject.has(f63063o)) {
                this.f63071E = jSONObject.getBoolean(f63063o);
            }
            if (jSONObject.has(f63064p)) {
                this.f63072F = jSONObject.getBoolean(f63064p);
            }
            if (jSONObject.has(f63065q)) {
                this.f63073G = jSONObject.getBoolean(f63065q);
            }
            if (jSONObject.has(f63066r)) {
                this.f63074H = jSONObject.getBoolean(f63066r);
            }
            if (jSONObject.has(f63050b)) {
                this.f63075I = jSONObject.getBoolean(f63050b);
            }
        } catch (Throwable th) {
            Object[] objArr = new Object[3];
            objArr[0] = "Failed to parse toggles: ";
            objArr[1] = jSONObject == null ? V8ValueNull.NULL : jSONObject.toString();
            objArr[2] = th;
            Logger.e(f63051c, objArr);
            new CrashReporter().caughtException(th);
            b(true);
        }
    }

    public ArrayList<String> a() {
        return a(true);
    }

    public ArrayList<String> a(boolean z2) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Bundle bundleS = s();
            for (String str : bundleS.keySet()) {
                if (!str.equals(f63050b) && !bundleS.getBoolean(str)) {
                    arrayList.add(str);
                }
            }
        } catch (Throwable th) {
            Logger.e(f63051c, "caught exception", th);
            if (z2) {
                new CrashReporter().caughtException(th);
            }
        }
        return arrayList;
    }

    public boolean b() {
        return this.f63076s;
    }

    public boolean c() {
        return this.f63077t;
    }

    public boolean d() {
        return this.f63078u;
    }

    public boolean e() {
        return this.f63080w;
    }

    public boolean f() {
        return this.f63079v;
    }

    public boolean g() {
        return this.f63081x;
    }

    public boolean h() {
        return this.f63082y;
    }

    public boolean i() {
        return this.f63083z;
    }

    public boolean j() {
        return this.f63067A;
    }

    public boolean k() {
        return this.f63068B;
    }

    public boolean l() {
        return this.f63069C;
    }

    public boolean m() {
        return this.f63070D;
    }

    public boolean n() {
        return this.f63071E;
    }

    public boolean o() {
        return this.f63072F;
    }

    public boolean p() {
        return this.f63073G;
    }

    public boolean q() {
        return this.f63074H;
    }

    public boolean r() {
        return this.f63075I;
    }

    public String toString() {
        return "SafeDKToggles: master=" + this.f63076s + "; network=" + this.f63077t + "; location=" + this.f63078u + "; ; accounts=" + this.f63080w + "; call_log=" + this.f63079v + "; contacts=" + this.f63081x + "; calendar=" + this.f63082y + "; browser=" + this.f63083z + "; sms_mms=" + this.f63067A + "; files=" + this.f63068B + "; camera=" + this.f63069C + "; microphone=" + this.f63070D + "; accelerometer=" + this.f63071E + "; notifications=" + this.f63072F + "; packageManager=" + this.f63073G + "; advertisingId=" + this.f63074H;
    }
}

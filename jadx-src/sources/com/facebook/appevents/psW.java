package com.facebook.appevents;

import UiE.Dsr;
import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.Pl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class psW {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f52327O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.facebook.internal.j f52328n;
    private final List nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f52329t;
    public static final j J2 = new j(null);
    private static final String Uo = psW.class.getSimpleName();
    private static final int KN = 1000;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public final synchronized void n(Ml event) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (this.f52329t.size() + this.nr.size() >= KN) {
                this.f52327O++;
            } else {
                this.f52329t.add(event);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public final synchronized List nr() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            List list = this.f52329t;
            this.f52329t = new ArrayList();
            return list;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public final synchronized void rl(boolean z2) {
        if (VmF.j.nr(this)) {
            return;
        }
        if (!z2) {
            this.nr.clear();
            this.f52327O = 0;
            return;
        }
        try {
            this.f52329t.addAll(this.nr);
            this.nr.clear();
            this.f52327O = 0;
            return;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return;
        }
    }

    public final synchronized int t() {
        if (VmF.j.nr(this)) {
            return 0;
        }
        try {
            return this.f52329t.size();
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return 0;
        }
    }

    public psW(com.facebook.internal.j attributionIdentifiers, String anonymousAppDeviceGUID) {
        Intrinsics.checkNotNullParameter(attributionIdentifiers, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.f52328n = attributionIdentifiers;
        this.rl = anonymousAppDeviceGUID;
        this.f52329t = new ArrayList();
        this.nr = new ArrayList();
    }

    private final void J2(GraphRequest graphRequest, Context context, int i2, JSONArray jSONArray, JSONArray jSONArray2, boolean z2) {
        JSONObject jSONObject;
        try {
            if (!VmF.j.nr(this)) {
                try {
                    jSONObject = UiE.Dsr.n(Dsr.j.CUSTOM_APP_EVENTS, this.f52328n, this.rl, z2, context);
                    if (this.f52327O > 0) {
                        jSONObject.put("num_skipped_events", i2);
                    }
                } catch (JSONException unused) {
                    jSONObject = new JSONObject();
                }
                graphRequest.e(jSONObject);
                Bundle bundleXQ = graphRequest.XQ();
                String string = jSONArray.toString();
                Intrinsics.checkNotNullExpressionValue(string, "events.toString()");
                bundleXQ.putString("custom_events", string);
                if (com.facebook.internal.Pl.Uo(Pl.n.IapLoggingLib5To7)) {
                    bundleXQ.putString("operational_parameters", jSONArray2.toString());
                }
                graphRequest.N(string);
                graphRequest.T(bundleXQ);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public final int O(GraphRequest request, Context applicationContext, boolean z2, boolean z3) {
        Throwable th;
        Throwable th2;
        if (VmF.j.nr(this)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            try {
                synchronized (this) {
                    try {
                        int i2 = this.f52327O;
                        kdD.j.nr(this.f52329t);
                        this.nr.addAll(this.f52329t);
                        this.f52329t.clear();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        for (Ml ml : this.nr) {
                            try {
                                if (z2 || !ml.KN()) {
                                    jSONArray.put(ml.O());
                                    jSONArray2.put(ml.Uo());
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        }
                        if (jSONArray.length() == 0) {
                            try {
                                return 0;
                            } catch (Throwable th4) {
                                th = th4;
                                VmF.j.rl(th, this);
                                return 0;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        J2(request, applicationContext, i2, jSONArray, jSONArray2, z3);
                        return jSONArray.length();
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                    throw th2;
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
                VmF.j.rl(th, this);
                return 0;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}

package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Z;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ml implements Serializable {
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f52279O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JSONObject f52280n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f52281r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final JSONObject f52282t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f52278o = new j(null);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final HashSet f52277Z = new HashSet();

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final void n(String identifier) {
            boolean zContains;
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            if (identifier.length() == 0 || identifier.length() > 40) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{identifier, 40}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                throw new FacebookException(str);
            }
            synchronized (Ml.f52277Z) {
                zContains = Ml.f52277Z.contains(identifier);
                Unit unit = Unit.INSTANCE;
            }
            if (zContains) {
                return;
            }
            if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").matches(identifier)) {
                synchronized (Ml.f52277Z) {
                    Ml.f52277Z.add(identifier);
                }
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str2 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{identifier}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                throw new FacebookException(str2);
            }
        }
    }

    public static final class n implements Serializable {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final j f52283r = new j(null);
        private final boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final boolean f52284O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f52285n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f52286t;

        public static final class j {
            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private j() {
            }
        }

        public n(String jsonString, String operationalJsonString, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            Intrinsics.checkNotNullParameter(operationalJsonString, "operationalJsonString");
            this.f52285n = jsonString;
            this.f52286t = operationalJsonString;
            this.f52284O = z2;
            this.J2 = z3;
        }

        private final Object readResolve() throws ObjectStreamException, JSONException {
            return new Ml(this.f52285n, this.f52286t, this.f52284O, this.J2, null);
        }
    }

    public /* synthetic */ Ml(String str, String str2, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z2, z3);
    }

    public Ml(String contextName, String eventName, Double d2, Bundle bundle, boolean z2, boolean z3, UUID uuid, vd vdVar) {
        JSONObject jSONObjectO;
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f52279O = z2;
        this.J2 = z3;
        this.f52281r = eventName;
        this.f52282t = (vdVar == null || (jSONObjectO = vdVar.O()) == null) ? new JSONObject() : jSONObjectO;
        this.f52280n = nr(contextName, eventName, d2, bundle, uuid);
    }

    static /* synthetic */ Map mUb(Ml ml, Bundle bundle, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return ml.xMQ(bundle, z2);
    }

    private final JSONObject nr(String str, String str2, Double d2, Bundle bundle, UUID uuid) throws JSONException {
        f52278o.n(str2);
        JSONObject jSONObject = new JSONObject();
        String strO = eR.j.O(str2);
        if (Intrinsics.areEqual(strO, str2)) {
            strO = zx.Wre.nr(str2);
        }
        jSONObject.put("_eventName", strO);
        jSONObject.put("_logTime", System.currentTimeMillis() / ((long) 1000));
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map mapMUb = mUb(this, bundle, false, 2, null);
            for (String str3 : mapMUb.keySet()) {
                jSONObject.put(str3, mapMUb.get(str3));
            }
        }
        if (d2 != null) {
            jSONObject.put("_valueToSum", d2.doubleValue());
        }
        if (this.J2) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f52279O) {
            jSONObject.put("_implicitlyLogged", "1");
            return jSONObject;
        }
        Z.j jVar = com.facebook.internal.Z.f52780O;
        com.facebook.Ew ew = com.facebook.Ew.APP_EVENTS;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "eventObject.toString()");
        jVar.t(ew, "AppEvents", "Created app event '%s'", string);
        return jSONObject;
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.f52280n.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        String string2 = this.f52282t.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "operationalJsonObject.toString()");
        return new n(string, string2, this.f52279O, this.J2);
    }

    private final Map xMQ(Bundle bundle, boolean z2) {
        HashMap map = new HashMap();
        for (String key : bundle.keySet()) {
            j jVar = f52278o;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            jVar.n(key);
            Object obj = bundle.get(key);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                throw new FacebookException(str);
            }
            map.put(key, obj.toString());
        }
        if (!z2) {
            zx.w6.t(map);
            eR.j.J2(TypeIntrinsics.asMutableMap(map), this.f52281r);
            kdD.j.t(TypeIntrinsics.asMutableMap(map), this.f52281r);
        }
        return map;
    }

    public final String J2() {
        return this.f52281r;
    }

    public final boolean KN() {
        return this.f52279O;
    }

    public final JSONObject O() {
        return this.f52280n;
    }

    public final JSONObject Uo() {
        return this.f52282t;
    }

    public final boolean rl() {
        return this.f52279O;
    }

    public final JSONObject t() {
        return this.f52280n;
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f52280n.optString("_eventName"), Boolean.valueOf(this.f52279O), this.f52280n.toString()}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    private Ml(String str, String str2, boolean z2, boolean z3) {
        JSONObject jSONObject = new JSONObject(str);
        this.f52280n = jSONObject;
        this.f52282t = new JSONObject(str2);
        this.f52279O = z2;
        String strOptString = jSONObject.optString("_eventName");
        Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.f52281r = strOptString;
        this.J2 = z3;
    }
}

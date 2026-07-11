package Vk7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f11273n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f11274t;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Set f11272O = new CopyOnWriteArraySet();

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final void nr(String rulesFromServer) {
            Intrinsics.checkNotNullParameter(rulesFromServer, "rulesFromServer");
            try {
                Ml.n().clear();
                n(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        }

        public final Set rl() {
            HashSet hashSet = new HashSet();
            Iterator it = Ml.n().iterator();
            while (it.hasNext()) {
                hashSet.add(((Ml) it.next()).t());
            }
            return hashSet;
        }

        public final Set t() {
            return new HashSet(Ml.n());
        }

        private final void n(JSONObject jSONObject) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(key);
                if (jSONObjectOptJSONObject != null) {
                    String k2 = jSONObjectOptJSONObject.optString("k");
                    String v2 = jSONObjectOptJSONObject.optString("v");
                    Intrinsics.checkNotNullExpressionValue(k2, "k");
                    if (k2.length() != 0) {
                        Set setN = Ml.n();
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        List listSplit$default = StringsKt.split$default((CharSequence) k2, new String[]{","}, false, 0, 6, (Object) null);
                        Intrinsics.checkNotNullExpressionValue(v2, "v");
                        setN.add(new Ml(key, listSplit$default, v2, null));
                    }
                }
            }
        }
    }

    public /* synthetic */ Ml(String str, List list, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2);
    }

    private Ml(String str, List list, String str2) {
        this.f11273n = str;
        this.rl = str2;
        this.f11274t = list;
    }

    public static final /* synthetic */ Set n() {
        if (VmF.j.nr(Ml.class)) {
            return null;
        }
        try {
            return f11272O;
        } catch (Throwable th) {
            VmF.j.rl(th, Ml.class);
            return null;
        }
    }

    public final String nr() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            return this.rl;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public final List rl() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f11274t);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public final String t() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            return this.f11273n;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}

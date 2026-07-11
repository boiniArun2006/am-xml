package jkl;

import Ti.C;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j {
    public static final C0999j nr = new C0999j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f69620n;
    private String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Long f69621t;

    /* JADX INFO: renamed from: jkl.j$j, reason: collision with other inner class name */
    public static final class C0999j {
        public /* synthetic */ C0999j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0999j() {
        }
    }

    public j(String str) {
        this.f69621t = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.rl = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l2 = this.f69621t;
        Intrinsics.checkNotNull(l2, "null cannot be cast to non-null type kotlin.Long");
        stringBuffer.append(l2.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n         …)\n            .toString()");
        this.f69620n = string;
    }

    public final void n() {
        C.nr(this.f69620n);
    }

    public final boolean nr() {
        return (this.rl == null || this.f69621t == null) ? false : true;
    }

    public final int rl(j data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l2 = this.f69621t;
        if (l2 == null) {
            return -1;
        }
        long jLongValue = l2.longValue();
        Long l5 = data.f69621t;
        if (l5 != null) {
            return Intrinsics.compare(l5.longValue(), jLongValue);
        }
        return 1;
    }

    public final JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l2 = this.f69621t;
            if (l2 != null) {
                jSONObject.put(StatsEvent.f62824A, l2);
            }
            jSONObject.put("error_message", this.rl);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void O() {
        if (nr()) {
            C.Z(this.f69620n, toString());
        }
    }

    public String toString() {
        JSONObject jSONObjectT = t();
        if (jSONObjectT == null) {
            return super.toString();
        }
        String string = jSONObjectT.toString();
        Intrinsics.checkNotNullExpressionValue(string, "params.toString()");
        return string;
    }

    public j(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.f69620n = name;
        JSONObject jSONObjectR = C.r(name, true);
        if (jSONObjectR != null) {
            this.f69621t = Long.valueOf(jSONObjectR.optLong(StatsEvent.f62824A, 0L));
            this.rl = jSONObjectR.optString("error_message", null);
        }
    }
}

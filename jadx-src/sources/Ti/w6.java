package Ti;

import android.os.Build;
import com.caoccao.javet.exceptions.JavetError;
import com.facebook.internal.vd;
import com.safedk.android.analytics.events.base.StatsEvent;
import ep.oxM.esLNYym;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 {
    public static final n KN = new n(null);
    private String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f10531O;
    private Long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f10532n;
    private String nr;
    private EnumC0373w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private JSONArray f10533t;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f10534n = new j();

        public static final w6 n(String str, String str2) {
            return new w6(str, str2, (DefaultConstructorMarker) null);
        }

        public static final w6 nr(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new w6(file, (DefaultConstructorMarker) null);
        }

        public static final w6 rl(Throwable th, EnumC0373w6 t3) {
            Intrinsics.checkNotNullParameter(t3, "t");
            return new w6(th, t3, (DefaultConstructorMarker) null);
        }

        public static final w6 t(JSONArray features) {
            Intrinsics.checkNotNullParameter(features, "features");
            return new w6(features, (DefaultConstructorMarker) null);
        }

        private j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EnumC0373w6 rl(String str) {
            return StringsKt.startsWith$default(str, "crash_log_", false, 2, (Object) null) ? EnumC0373w6.CrashReport : StringsKt.startsWith$default(str, esLNYym.wPPsTjiP, false, 2, (Object) null) ? EnumC0373w6.CrashShield : StringsKt.startsWith$default(str, "thread_check_log_", false, 2, (Object) null) ? EnumC0373w6.ThreadCheck : StringsKt.startsWith$default(str, "analysis_log_", false, 2, (Object) null) ? EnumC0373w6.Analysis : StringsKt.startsWith$default(str, "anr_log_", false, 2, (Object) null) ? EnumC0373w6.AnrReport : EnumC0373w6.Unknown;
        }
    }

    /* JADX INFO: renamed from: Ti.w6$w6, reason: collision with other inner class name */
    public enum EnumC0373w6 {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* JADX INFO: renamed from: Ti.w6$w6$j */
        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC0373w6.values().length];
                try {
                    iArr[EnumC0373w6.Analysis.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0373w6.AnrReport.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC0373w6.CrashReport.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC0373w6.CrashShield.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC0373w6.ThreadCheck.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final String rl() {
            int i2 = j.$EnumSwitchMapping$0[ordinal()];
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i2 = j.$EnumSwitchMapping$0[ordinal()];
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    public /* synthetic */ w6(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    public /* synthetic */ class Ml {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0373w6.values().length];
            try {
                iArr[EnumC0373w6.Analysis.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0373w6.AnrReport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0373w6.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0373w6.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC0373w6.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ w6(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    private final JSONObject O() {
        EnumC0373w6 enumC0373w6 = this.rl;
        int i2 = enumC0373w6 == null ? -1 : Ml.$EnumSwitchMapping$0[enumC0373w6.ordinal()];
        if (i2 == 1) {
            return t();
        }
        if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            return nr();
        }
        return null;
    }

    private final JSONObject nr() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.nr;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l2 = this.Uo;
            if (l2 != null) {
                jSONObject.put(StatsEvent.f62824A, l2);
            }
            String str2 = this.f10531O;
            if (str2 != null) {
                jSONObject.put(JavetError.PARAMETER_REASON, str2);
            }
            String str3 = this.J2;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            EnumC0373w6 enumC0373w6 = this.rl;
            if (enumC0373w6 != null) {
                jSONObject.put("type", enumC0373w6);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f10533t;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l2 = this.Uo;
            if (l2 != null) {
                jSONObject.put(StatsEvent.f62824A, l2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean J2() {
        EnumC0373w6 enumC0373w6 = this.rl;
        int i2 = enumC0373w6 == null ? -1 : Ml.$EnumSwitchMapping$0[enumC0373w6.ordinal()];
        return i2 != 1 ? i2 != 2 ? ((i2 != 3 && i2 != 4 && i2 != 5) || this.J2 == null || this.Uo == null) ? false : true : (this.J2 == null || this.f10531O == null || this.Uo == null) ? false : true : (this.f10533t == null || this.Uo == null) ? false : true;
    }

    public final void n() {
        C.nr(this.f10532n);
    }

    public final int rl(w6 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Long l2 = this.Uo;
        if (l2 == null) {
            return -1;
        }
        long jLongValue = l2.longValue();
        Long l5 = data.Uo;
        if (l5 != null) {
            return Intrinsics.compare(l5.longValue(), jLongValue);
        }
        return 1;
    }

    public /* synthetic */ w6(Throwable th, EnumC0373w6 enumC0373w6, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, enumC0373w6);
    }

    public final void Uo() {
        if (!J2()) {
            return;
        }
        C.Z(this.f10532n, toString());
    }

    public String toString() {
        JSONObject jSONObjectO = O();
        if (jSONObjectO == null) {
            String string = new JSONObject().toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject().toString()");
            return string;
        }
        String string2 = jSONObjectO.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "params.toString()");
        return string2;
    }

    public /* synthetic */ w6(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    private w6(JSONArray jSONArray) {
        this.rl = EnumC0373w6.Analysis;
        this.Uo = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f10533t = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.Uo));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n         …)\n            .toString()");
        this.f10532n = string;
    }

    private w6(Throwable th, EnumC0373w6 enumC0373w6) {
        this.rl = enumC0373w6;
        this.nr = vd.WPU();
        this.f10531O = C.O(th);
        this.J2 = C.KN(th);
        this.Uo = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(enumC0373w6.rl());
        stringBuffer.append(String.valueOf(this.Uo));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer().append(t.…ppend(\".json\").toString()");
        this.f10532n = string;
    }

    private w6(String str, String str2) {
        this.rl = EnumC0373w6.AnrReport;
        this.nr = vd.WPU();
        this.f10531O = str;
        this.J2 = str2;
        this.Uo = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.Uo));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer()\n         …)\n            .toString()");
        this.f10532n = string;
    }

    private w6(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        this.f10532n = name;
        this.rl = KN.rl(name);
        JSONObject jSONObjectR = C.r(this.f10532n, true);
        if (jSONObjectR != null) {
            this.Uo = Long.valueOf(jSONObjectR.optLong(StatsEvent.f62824A, 0L));
            this.nr = jSONObjectR.optString("app_version", null);
            this.f10531O = jSONObjectR.optString(JavetError.PARAMETER_REASON, null);
            this.J2 = jSONObjectR.optString("callstack", null);
            this.f10533t = jSONObjectR.optJSONArray("feature_names");
        }
    }
}

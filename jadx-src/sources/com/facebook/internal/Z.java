package com.facebook.internal;

import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.facebook.Ew f52781n;
    private int nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private StringBuilder f52782t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f52780O = new j(null);
    private static final HashMap J2 = new HashMap();

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final synchronized String J2(String str) {
            String strReplace$default;
            strReplace$default = str;
            for (Map.Entry entry : Z.J2.entrySet()) {
                strReplace$default = StringsKt.replace$default(strReplace$default, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
            }
            return strReplace$default;
        }

        public final synchronized void O(String original, String replace) {
            Intrinsics.checkNotNullParameter(original, "original");
            Intrinsics.checkNotNullParameter(replace, "replace");
            Z.J2.put(original, replace);
        }

        public final synchronized void nr(String accessToken) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            if (!com.facebook.s4.T(com.facebook.Ew.INCLUDE_ACCESS_TOKENS)) {
                O(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        private j() {
        }

        public final void n(com.facebook.Ew behavior, int i2, String tag, String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            if (com.facebook.s4.T(behavior)) {
                String strJ2 = J2(string);
                if (!StringsKt.startsWith$default(tag, "FacebookSDK.", false, 2, (Object) null)) {
                    tag = "FacebookSDK." + tag;
                }
                Log.println(i2, tag, strJ2);
                if (behavior == com.facebook.Ew.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void rl(com.facebook.Ew behavior, String tag, String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            n(behavior, 3, tag, string);
        }

        public final void t(com.facebook.Ew behavior, String tag, String format, Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (com.facebook.s4.T(behavior)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                n(behavior, 3, tag, str);
            }
        }
    }

    public Z(com.facebook.Ew behavior, String tag) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.nr = 3;
        this.f52781n = behavior;
        this.rl = "FacebookSDK." + Lu.gh(tag, "tag");
        this.f52782t = new StringBuilder();
    }

    private final boolean Uo() {
        return com.facebook.s4.T(this.f52781n);
    }

    public final void J2(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        f52780O.n(this.f52781n, this.nr, this.rl, string);
    }

    public final void O() {
        String string = this.f52782t.toString();
        Intrinsics.checkNotNullExpressionValue(string, "contents.toString()");
        J2(string);
        this.f52782t = new StringBuilder();
    }

    public final void nr(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        t("  %s:\t%s\n", key, value);
    }

    public final void rl(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (Uo()) {
            this.f52782t.append(string);
        }
    }

    public final void t(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (Uo()) {
            StringBuilder sb = this.f52782t;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            sb.append(str);
        }
    }
}

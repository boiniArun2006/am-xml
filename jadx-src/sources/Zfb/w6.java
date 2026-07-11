package Zfb;

import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class w6 {
    public static final j xMQ = new j(null);
    private final String J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f12576O;
    private final String Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f12577n;
    private final String nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f12578t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public enum n {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f12584n;

        public final int rl() {
            return this.f12584n;
        }

        n(int i2) {
            this.f12584n = i2;
        }
    }

    public w6(JSONObject component) throws JSONException {
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("class_name");
        Intrinsics.checkNotNullExpressionValue(string, qfEYuUHwj.HYnN);
        this.f12577n = string;
        this.rl = component.optInt("index", -1);
        this.f12578t = component.optInt("id");
        String strOptString = component.optString("text");
        Intrinsics.checkNotNullExpressionValue(strOptString, "component.optString(PATH_TEXT_KEY)");
        this.nr = strOptString;
        String strOptString2 = component.optString("tag");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "component.optString(PATH_TAG_KEY)");
        this.f12576O = strOptString2;
        String strOptString3 = component.optString("description");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.J2 = strOptString3;
        String strOptString4 = component.optString("hint");
        Intrinsics.checkNotNullExpressionValue(strOptString4, "component.optString(PATH_HINT_KEY)");
        this.Uo = strOptString4;
        this.KN = component.optInt("match_bitmask");
    }

    public final int J2() {
        return this.KN;
    }

    public final String KN() {
        return this.nr;
    }

    public final int O() {
        return this.rl;
    }

    public final String Uo() {
        return this.f12576O;
    }

    public final String n() {
        return this.f12577n;
    }

    public final int nr() {
        return this.f12578t;
    }

    public final String rl() {
        return this.J2;
    }

    public final String t() {
        return this.Uo;
    }
}

package f;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class ci implements InterfaceC1984j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JSONArray f64015n;
    private final JSONObject rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f64014t = new j(null);
    public static final int nr = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj;
        return Intrinsics.areEqual(this.f64015n, ciVar.f64015n) && Intrinsics.areEqual(this.rl, ciVar.rl);
    }

    public ci(JSONArray questions, JSONObject localization) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f64015n = questions;
        this.rl = localization;
    }

    public int hashCode() {
        return (this.f64015n.hashCode() * 31) + this.rl.hashCode();
    }

    @Override // f.InterfaceC1984j
    public Bundle n() {
        return BundleKt.n(TuplesKt.to(CreativeInfo.f62455s, this.f64015n.toString()), TuplesKt.to("localization", this.rl.toString()));
    }

    public String toString() {
        return "SurveyExperience(questions=" + this.f64015n + ", localization=" + this.rl + ")";
    }
}

package YgZ;

import android.content.Context;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements YgZ.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final j f12216n = new j(null);

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public String KN() {
        return String.valueOf(w6.f12217n.xMQ());
    }

    public String Uo() {
        return w6.f12217n.KN();
    }

    public double mUb(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Wre.f12214n.rl(context);
    }

    @Override // YgZ.j
    public String n() {
        return w6.f12217n.J2();
    }

    @Override // YgZ.j
    public String rl() {
        return w6.f12217n.Uo();
    }

    public String xMQ() {
        return w6.f12217n.mUb();
    }

    public String J2() {
        Locale locale = Locale.getDefault();
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            return locale.getLanguage() + "-" + locale.getScript() + "_" + locale.getCountry();
        }
        return locale.getLanguage() + "_" + locale.getCountry();
    }

    public String O() {
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return language;
    }

    public String gh() {
        String id = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id, "getID(...)");
        return id;
    }

    public boolean nr() {
        return TimeZone.getDefault().inDaylightTime(new Date());
    }

    public int qie() {
        return TimeZone.getDefault().getRawOffset() / 1000;
    }

    public String t() {
        String country = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        return country;
    }
}

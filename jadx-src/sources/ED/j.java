package ED;

import SHQ.j;
import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class j {
    private final long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f2258O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2259n;
    private final Date nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f2260t;
    private static final String[] Uo = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    static final DateFormat KN = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    private static void Uo(Map map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : Uo) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    static j n(j.w6 w6Var) {
        String str = w6Var.nr;
        if (str == null) {
            str = "";
        }
        return new j(w6Var.rl, String.valueOf(w6Var.f9076t), str, new Date(w6Var.az), w6Var.f9074O, w6Var.mUb);
    }

    static j rl(Map map) throws AbtException {
        Uo(map);
        try {
            return new j((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", KN.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e2) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e2);
        } catch (ParseException e3) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e3);
        }
    }

    j.w6 J2(String str) {
        j.w6 w6Var = new j.w6();
        w6Var.f9075n = str;
        w6Var.az = nr();
        w6Var.rl = this.f2259n;
        w6Var.f9076t = this.rl;
        w6Var.nr = TextUtils.isEmpty(this.f2260t) ? null : this.f2260t;
        w6Var.f9074O = this.f2258O;
        w6Var.mUb = this.J2;
        return w6Var;
    }

    String O() {
        return this.rl;
    }

    long nr() {
        return this.nr.getTime();
    }

    String t() {
        return this.f2259n;
    }

    public j(String str, String str2, String str3, Date date, long j2, long j3) {
        this.f2259n = str;
        this.rl = str2;
        this.f2260t = str3;
        this.nr = date;
        this.f2258O = j2;
        this.J2 = j3;
    }
}

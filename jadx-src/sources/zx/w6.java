package zx;

import com.facebook.internal.C1869z;
import com.facebook.s4;
import eK.Wre;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f76733n = new w6();
    private static boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f76734t;

    public static final void n() {
        if (VmF.j.nr(w6.class)) {
            return;
        }
        try {
            rl = true;
            f76734t = C1869z.nr("FBSDKFeatureIntegritySample", s4.az(), false);
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
        }
    }

    public static final void t(Map parameters) {
        if (VmF.j.nr(w6.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            if (!rl || parameters.isEmpty()) {
                return;
            }
            try {
                List<String> list = CollectionsKt.toList(parameters.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : list) {
                    Object obj = parameters.get(str);
                    if (obj == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String str2 = (String) obj;
                    w6 w6Var = f76733n;
                    if (w6Var.nr(str) || w6Var.nr(str2)) {
                        parameters.remove(str);
                        if (!f76734t) {
                            str2 = "";
                        }
                        jSONObject.put(str, str2);
                    }
                }
                if (jSONObject.length() != 0) {
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "restrictiveParamJson.toString()");
                    parameters.put("_onDeviceParams", string);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
        }
    }

    private w6() {
    }

    private final boolean nr(String str) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            return !Intrinsics.areEqual("none", rl(str));
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final String rl(String str) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            String[] strArrIk = eK.Wre.Ik(Wre.j.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (strArrIk != null) {
                String str2 = strArrIk[0];
                if (str2 != null) {
                    return str2;
                }
                return "none";
            }
            return "none";
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}

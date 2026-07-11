package qE;

import com.bendingspoons.oracle.models.GeneratedJsonAdapter;
import com.bendingspoons.oracle.models.Settings;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;
import okio.Buffer;
import org.json.JSONException;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class l3D {

    static final class j implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f72307n;

        j(String str) {
            this.f72307n = str;
        }

        public final Map n() {
            return nKK.f72310n.n(this.f72307n);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return qf.n(n());
        }
    }

    private static final String KN(Map map) {
        Buffer buffer = new Buffer();
        buffer.writeUtf8("{");
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (z2) {
                z2 = false;
            } else {
                buffer.writeUtf8(",");
            }
            buffer.writeUtf8("\"");
            buffer.writeUtf8(str);
            buffer.writeUtf8("\":");
            buffer.writeUtf8(str2);
        }
        buffer.writeUtf8("}");
        return buffer.readUtf8();
    }

    private static final x0X.n O(XA.Ml ml, String str, kotlinx.serialization.json.n nVar) {
        try {
            return new n.w6(nVar.t(ml, str));
        } catch (SerializationException e2) {
            return new n.C1266n(new SerializationException("Error parsing settings string as JSON: " + e2, e2));
        } catch (IllegalArgumentException e3) {
            return new n.C1266n(new IllegalArgumentException("Error converting settings JSON to target class: " + e3, e3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ajd.j Uo(qE.j jVar, String str, Throwable th) {
        return qE.j.nr(jVar, "ParseSettings_" + str, th, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0X.n gh(String str, String str2) {
        return lej.f72308n.rl(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0X.n xMQ(String str) {
        return x0X.w6.n(new j(str));
    }

    private static final x0X.n J2(JsonAdapter jsonAdapter, String str) {
        try {
            Object objFromJson = jsonAdapter.fromJson(str);
            if (objFromJson != null) {
                return new n.w6(objFromJson);
            }
            return new n.C1266n(new NullPointerException("Null deserialized settings, this should not happen"));
        } catch (IOException e2) {
            return new n.C1266n(new IOException("Error parsing settings JSON: " + e2, e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0X.n mUb(Map map, boolean z2, kotlinx.serialization.json.n nVar) {
        x0X.n nVarJ2;
        String strKN = KN(map);
        if (z2) {
            nVarJ2 = O(Settings.INSTANCE.serializer(), strKN, nVar);
        } else {
            nVarJ2 = J2(new GeneratedJsonAdapter(et.w6.rl()), strKN);
        }
        if (nVarJ2 instanceof n.C1266n) {
            return new n.C1266n(new JSONException("Unable to construct Settings object from merged json:\n" + ((n.C1266n) nVarJ2).n()));
        }
        if (nVarJ2 instanceof n.w6) {
            return new n.w6(TuplesKt.to(strKN, (Settings) ((n.w6) nVarJ2).n()));
        }
        throw new NoWhenBranchMatchedException();
    }
}

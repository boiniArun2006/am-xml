package cIr;

import Mj.j;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.google.android.gms.common.internal.Preconditions;
import com.safedk.android.analytics.brandsafety.l;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n extends Dh.w6 {
    private static final String nr = "cIr.n";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f43601n;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f43602t;

    n(String str, long j2) {
        this(str, j2, new j.C0231j().currentTimeMillis());
    }

    n(String str, long j2, long j3) {
        Preconditions.checkNotEmpty(str);
        this.f43601n = str;
        this.f43602t = j2;
        this.rl = j3;
    }

    static n O(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new n(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e2) {
            Log.e(nr, "Could not deserialize token: " + e2.getMessage());
            return null;
        }
    }

    long J2() {
        return this.f43602t;
    }

    long KN() {
        return this.rl;
    }

    @Override // Dh.w6
    public long n() {
        return this.rl + this.f43602t;
    }

    @Override // Dh.w6
    public String rl() {
        return this.f43601n;
    }

    String xMQ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", this.f43601n);
            jSONObject.put("receivedAt", this.rl);
            jSONObject.put(inFlMLxL.WgCcMlgHbb, this.f43602t);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.e(nr, "Could not serialize token: " + e2.getMessage());
            return null;
        }
    }

    private static long Uo(Map map, String str) {
        Preconditions.checkNotNull(map);
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    public static n nr(String str) {
        Preconditions.checkNotNull(str);
        Map mapRl = Mj.w6.rl(str);
        long jUo = Uo(mapRl, "iat");
        return new n(str, (Uo(mapRl, l.f62670y) - jUo) * 1000, jUo * 1000);
    }

    public static n t(j jVar) {
        long jUo;
        Preconditions.checkNotNull(jVar);
        try {
            jUo = (long) (Double.parseDouble(jVar.rl().replace(CmcdData.STREAMING_FORMAT_SS, "")) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map mapRl = Mj.w6.rl(jVar.t());
            jUo = 1000 * (Uo(mapRl, l.f62670y) - Uo(mapRl, "iat"));
        }
        return new n(jVar.t(), jUo);
    }
}

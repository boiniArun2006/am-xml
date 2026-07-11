package X3O;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class aC extends Wre {
    private final JSONObject az;
    private final String ty;

    @Override // X3O.I28
    protected String O() {
        return "POST";
    }

    @Override // X3O.I28
    protected JSONObject Uo() {
        return this.az;
    }

    @Override // X3O.I28
    protected Map qie() {
        HashMap map = new HashMap();
        map.put(AppMeasurementSdk.ConditionalUserProperty.NAME, mUb());
        map.put("uploadType", "resumable");
        return map;
    }

    public aC(O6.fuX fux, com.google.firebase.Wre wre, JSONObject jSONObject, String str) {
        super(fux, wre);
        this.az = jSONObject;
        this.ty = str;
        if (TextUtils.isEmpty(str)) {
            this.f11739n = new IllegalArgumentException("mContentType is null or empty");
        }
        super.X("X-Goog-Upload-Protocol", "resumable");
        super.X("X-Goog-Upload-Command", TtmlNode.START);
        super.X("X-Goog-Upload-Header-Content-Type", str);
    }

    @Override // X3O.I28
    public Uri XQ() {
        String authority = o().n().getAuthority();
        Uri.Builder builderBuildUpon = o().rl().buildUpon();
        builderBuildUpon.appendPath("b");
        builderBuildUpon.appendPath(authority);
        builderBuildUpon.appendPath("o");
        return builderBuildUpon.build();
    }
}

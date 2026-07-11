package X3O;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Ml extends I28 {
    private final Integer az;
    private final String ty;

    @Override // X3O.I28
    protected String O() {
        return "GET";
    }

    @Override // X3O.I28
    protected Map qie() {
        HashMap map = new HashMap();
        String strMUb = mUb();
        if (!strMUb.isEmpty()) {
            map.put("prefix", strMUb + "/");
        }
        map.put(TtmlNode.RUBY_DELIMITER, "/");
        Integer num = this.az;
        if (num != null) {
            map.put("maxResults", Integer.toString(num.intValue()));
        }
        if (!TextUtils.isEmpty(this.ty)) {
            map.put("pageToken", this.ty);
        }
        return map;
    }

    public Ml(O6.fuX fux, com.google.firebase.Wre wre, Integer num, String str) {
        super(fux, wre);
        this.az = num;
        this.ty = str;
    }

    @Override // X3O.I28
    public Uri XQ() {
        return Uri.parse(o().rl() + "/b/" + o().n().getAuthority() + "/o");
    }
}

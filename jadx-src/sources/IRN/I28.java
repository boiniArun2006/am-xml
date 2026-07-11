package IRN;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f4206n = new HashMap();
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f4207t;

    public synchronized void O(Map map) {
        try {
            int i2 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strRl = rl((String) entry.getKey());
                if (this.f4206n.size() < this.rl || this.f4206n.containsKey(strRl)) {
                    String str = (String) entry.getValue();
                    this.f4206n.put(strRl, str == null ? "" : t(str, this.f4207t));
                } else {
                    i2++;
                }
            }
            if (i2 > 0) {
                h1M.CN3.J2().gh("Ignored " + i2 + " entries when adding custom keys. Maximum allowable: " + this.rl);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Map n() {
        return Collections.unmodifiableMap(new HashMap(this.f4206n));
    }

    public synchronized boolean nr(String str, String str2) {
        String strRl = rl(str);
        if (this.f4206n.size() >= this.rl && !this.f4206n.containsKey(strRl)) {
            h1M.CN3.J2().gh("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.rl);
            return false;
        }
        String strT = t(str2, this.f4207t);
        if (QNA.Dsr.nY((String) this.f4206n.get(strRl), strT)) {
            return false;
        }
        Map map = this.f4206n;
        if (str2 == null) {
            strT = "";
        }
        map.put(strRl, strT);
        return true;
    }

    private String rl(String str) {
        if (str != null) {
            return t(str, this.f4207t);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String t(String str, int i2) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i2 ? strTrim.substring(0, i2) : strTrim;
    }

    public I28(int i2, int i3) {
        this.rl = i2;
        this.f4207t = i3;
    }
}

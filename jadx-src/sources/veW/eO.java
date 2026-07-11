package veW;

import android.util.Base64;
import veW.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class eO {

    public static abstract class j {
        public abstract eO n();

        public abstract j nr(bF.I28 i28);

        public abstract j rl(String str);

        public abstract j t(byte[] bArr);
    }

    public abstract bF.I28 nr();

    public abstract String rl();

    public abstract byte[] t();

    public static j n() {
        return new Ml.n().nr(bF.I28.DEFAULT);
    }

    public eO J2(bF.I28 i28) {
        return n().rl(rl()).nr(i28).t(t()).n();
    }

    public boolean O() {
        if (t() != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String strEncodeToString;
        String strRl = rl();
        bF.I28 i28Nr = nr();
        if (t() == null) {
            strEncodeToString = "";
        } else {
            strEncodeToString = Base64.encodeToString(t(), 2);
        }
        return String.format("TransportContext(%s, %s, %s)", strRl, i28Nr, strEncodeToString);
    }
}

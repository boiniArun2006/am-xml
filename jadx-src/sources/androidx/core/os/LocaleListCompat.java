package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class LocaleListCompat {
    private static final LocaleListCompat rl = n(new Locale[0]);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LocaleListInterface f36532n;

    @RequiresApi
    static class Api24Impl {
        static LocaleList n(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    @RequiresApi
    static class Api21Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final Locale[] f36533n = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale n(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    public static LocaleListCompat O() {
        return rl;
    }

    public static LocaleListCompat gh(LocaleList localeList) {
        return new LocaleListCompat(new LocaleListPlatformWrapper(localeList));
    }

    static Locale rl(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static LocaleListCompat t(String str) {
        if (str == null || str.isEmpty()) {
            return O();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i2 = 0; i2 < length; i2++) {
            localeArr[i2] = Api21Impl.n(strArrSplit[i2]);
        }
        return n(localeArr);
    }

    public Locale J2(String[] strArr) {
        return this.f36532n.t(strArr);
    }

    public int KN() {
        return this.f36532n.size();
    }

    public boolean Uo() {
        return this.f36532n.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof LocaleListCompat) && this.f36532n.equals(((LocaleListCompat) obj).f36532n);
    }

    public int hashCode() {
        return this.f36532n.hashCode();
    }

    public Object mUb() {
        return this.f36532n.rl();
    }

    public Locale nr(int i2) {
        return this.f36532n.get(i2);
    }

    public String toString() {
        return this.f36532n.toString();
    }

    public String xMQ() {
        return this.f36532n.n();
    }

    private LocaleListCompat(LocaleListInterface localeListInterface) {
        this.f36532n = localeListInterface;
    }

    public static LocaleListCompat n(Locale... localeArr) {
        return gh(Api24Impl.n(localeArr));
    }
}

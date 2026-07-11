package androidx.core.os;

import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class LocaleListCompatWrapper implements LocaleListInterface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Locale[] f36536n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Locale[] f36535t = new Locale[0];
    private static final Locale nr = new Locale("en", "XA");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Locale f36534O = new Locale("ar", "XB");
    private static final Locale J2 = LocaleListCompat.rl("en-Latn");

    private int J2(Locale locale) {
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f36536n;
            if (i2 >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (xMQ(locale, localeArr[i2]) > 0) {
                return i2;
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocaleListCompatWrapper)) {
            return false;
        }
        Locale[] localeArr = ((LocaleListCompatWrapper) obj).f36536n;
        if (this.f36536n.length != localeArr.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            Locale[] localeArr2 = this.f36536n;
            if (i2 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i2].equals(localeArr[i2])) {
                return false;
            }
            i2++;
        }
    }

    @Override // androidx.core.os.LocaleListInterface
    public Object rl() {
        return null;
    }

    @RequiresApi
    static class Api21Impl {
        static String n(Locale locale) {
            return locale.getScript();
        }
    }

    private static boolean KN(Locale locale) {
        return nr.equals(locale) || f36534O.equals(locale);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int O(Collection collection, boolean z2) {
        int iJ2;
        Locale[] localeArr = this.f36536n;
        if (localeArr.length == 1) {
            return 0;
        }
        if (localeArr.length == 0) {
            return -1;
        }
        if (z2) {
            iJ2 = J2(J2);
            if (iJ2 == 0) {
                return 0;
            }
            if (iJ2 >= Integer.MAX_VALUE) {
            }
        } else {
            iJ2 = Integer.MAX_VALUE;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            int iJ22 = J2(LocaleListCompat.rl((String) it.next()));
            if (iJ22 == 0) {
                return 0;
            }
            if (iJ22 < iJ2) {
                iJ2 = iJ22;
            }
        }
        if (iJ2 == Integer.MAX_VALUE) {
            return 0;
        }
        return iJ2;
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale get(int i2) {
        if (i2 < 0) {
            return null;
        }
        Locale[] localeArr = this.f36536n;
        if (i2 < localeArr.length) {
            return localeArr[i2];
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f36536n) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
        return this.f36536n.length == 0;
    }

    @Override // androidx.core.os.LocaleListInterface
    public String n() {
        return this.rl;
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
        return this.f36536n.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f36536n;
            if (i2 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i2]);
            if (i2 < this.f36536n.length - 1) {
                sb.append(',');
            }
            i2++;
        }
    }

    private static String Uo(Locale locale) {
        String strN = Api21Impl.n(locale);
        if (!strN.isEmpty()) {
            return strN;
        }
        return "";
    }

    private Locale nr(Collection collection, boolean z2) {
        int iO = O(collection, z2);
        if (iO == -1) {
            return null;
        }
        return this.f36536n[iO];
    }

    private static int xMQ(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || KN(locale) || KN(locale2)) {
            return 0;
        }
        String strUo = Uo(locale);
        if (!strUo.isEmpty()) {
            return strUo.equals(Uo(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        if (country.isEmpty() || country.equals(locale2.getCountry())) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale t(String[] strArr) {
        return nr(Arrays.asList(strArr), false);
    }
}

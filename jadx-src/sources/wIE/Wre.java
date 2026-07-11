package wIE;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Wre implements HostnameVerifier {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Wre f74829n = new Wre();
    private static final Pattern rl = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private boolean J2(String str, X509Certificate x509Certificate) {
        List listN = n(x509Certificate, 7);
        int size = listN.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equalsIgnoreCase((String) listN.get(i2))) {
                return true;
            }
        }
        return false;
    }

    private boolean nr(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return rl(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    private boolean O(String str, X509Certificate x509Certificate) {
        String strRl;
        String lowerCase = str.toLowerCase(Locale.US);
        List listN = n(x509Certificate, 2);
        int size = listN.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            if (nr(lowerCase, (String) listN.get(i2))) {
                return true;
            }
            i2++;
            z2 = true;
        }
        if (z2 || (strRl = new Ml(x509Certificate.getSubjectX500Principal()).rl("cn")) == null) {
            return false;
        }
        return nr(lowerCase, strRl);
    }

    private static List n(X509Certificate x509Certificate, int i2) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i2 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    static boolean t(String str) {
        return rl.matcher(str).matches();
    }

    private Wre() {
    }

    public boolean rl(String str, X509Certificate x509Certificate) {
        if (t(str)) {
            return J2(str, x509Certificate);
        }
        return O(str, x509Certificate);
    }
}

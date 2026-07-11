package nl4;

import R0.CN3;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f71219n = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long n(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            yMa.j.O().n("The content-length value is not a valid number");
            return null;
        }
    }

    public static String rl(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static boolean t(String str) {
        return str == null || !f71219n.matcher(str).matches();
    }

    public static void nr(CN3 cn3) {
        if (!cn3.J2()) {
            cn3.qie();
        }
        cn3.rl();
    }
}

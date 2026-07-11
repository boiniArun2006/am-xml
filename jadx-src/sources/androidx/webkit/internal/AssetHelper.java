package androidx.webkit.internal;

import android.content.Context;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class AssetHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f42507n;

    private int O(int i2) {
        TypedValue typedValue = new TypedValue();
        this.f42507n.getResources().getValue(i2, typedValue, true);
        return typedValue.type;
    }

    private static InputStream Uo(String str, InputStream inputStream) {
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStream) : inputStream;
    }

    private int nr(String str, String str2) {
        return this.f42507n.getResources().getIdentifier(str2, str, this.f42507n.getPackageName());
    }

    public static InputStream xMQ(File file) {
        return Uo(file.getPath(), new FileInputStream(file));
    }

    public static String J2(String str) {
        String strN = MimeUtil.n(str);
        if (strN == null) {
            return "text/plain";
        }
        return strN;
    }

    private static String gh(String str) {
        if (str.length() > 1 && str.charAt(0) == '/') {
            return str.substring(1);
        }
        return str;
    }

    public static String n(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.endsWith("/")) {
            return canonicalPath + "/";
        }
        return canonicalPath;
    }

    public static File rl(File file, String str) throws IOException {
        String strN = n(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(strN)) {
            return new File(canonicalPath);
        }
        return null;
    }

    public static File t(Context context) {
        return ApiHelperForN.n(context);
    }

    public InputStream KN(String str) {
        String strGh = gh(str);
        return Uo(strGh, this.f42507n.getAssets().open(strGh, 2));
    }

    public InputStream mUb(String str) throws IOException {
        String strGh = gh(str);
        String[] strArrSplit = strGh.split("/", -1);
        if (strArrSplit.length == 2) {
            String str2 = strArrSplit[0];
            String strSubstring = strArrSplit[1];
            int iLastIndexOf = strSubstring.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iLastIndexOf);
            }
            int iNr = nr(str2, strSubstring);
            int iO = O(iNr);
            if (iO == 3) {
                return Uo(strGh, this.f42507n.getResources().openRawResource(iNr));
            }
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", strGh, Integer.valueOf(iO)));
        }
        throw new IllegalArgumentException("Incorrect resource path: " + strGh);
    }
}

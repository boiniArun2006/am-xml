package vn;

import Hh.C;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.g;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import qk.AbstractC2341j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Uri f74754n = Uri.withAppendedPath((Uri) AbstractC2341j.n(ContactsContract.AUTHORITY_URI), "display_photo");

    public static URL Ik(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String J2(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static boolean KN(Uri uri) {
        return "data".equals(J2(uri));
    }

    public static Uri Uo(int i2) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i2)).build();
    }

    private static String nr(boolean z2) {
        return "_id";
    }

    private static String rl(boolean z2) {
        return "_data";
    }

    private static Uri t(boolean z2) {
        return z2 ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    public static boolean HI(Uri uri) {
        String strJ2 = J2(uri);
        if (!"https".equals(strJ2) && !g.f62375e.equals(strJ2)) {
            return false;
        }
        return true;
    }

    public static String O(ContentResolver contentResolver, Uri uri) {
        boolean z2;
        Uri uri2;
        String str;
        String[] strArr;
        int columnIndexOrThrow;
        String type = contentResolver.getType(uri);
        String string = null;
        if (qie(uri)) {
            if (type != null && type.startsWith("video/")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri);
                C.Uo(documentId);
                uri2 = (Uri) C.Uo(t(z2));
                str = nr(z2) + "=?";
                strArr = new String[]{documentId.split(":")[1]};
            } else {
                uri2 = uri;
                str = null;
                strArr = null;
            }
            Cursor cursorQuery = contentResolver.query(uri2, new String[]{rl(z2)}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst() && (columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow(rl(z2))) != -1) {
                        string = cursorQuery.getString(columnIndexOrThrow);
                    }
                } finally {
                    cursorQuery.close();
                }
            }
            if (cursorQuery != null) {
            }
            return string;
        }
        if (!az(uri)) {
            return null;
        }
        return uri.getPath();
    }

    public static boolean az(Uri uri) {
        return FileUploadManager.f61570h.equals(J2(uri));
    }

    public static boolean ck(Uri uri) {
        return "android.resource".equals(J2(uri));
    }

    public static boolean gh(Uri uri) {
        if (uri.getPath() == null || !qie(uri) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith((String) AbstractC2341j.n(f74754n.getPath()))) {
            return false;
        }
        return true;
    }

    public static boolean mUb(Uri uri) {
        String string = uri.toString();
        if (!string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
            return false;
        }
        return true;
    }

    public static AssetFileDescriptor n(ContentResolver contentResolver, Uri uri) {
        if (qie(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    public static boolean qie(Uri uri) {
        return AppLovinEventTypes.USER_VIEWED_CONTENT.equals(J2(uri));
    }

    public static boolean ty(Uri uri) {
        return "res".equals(J2(uri));
    }

    public static boolean xMQ(Uri uri) {
        return "asset".equals(J2(uri));
    }
}

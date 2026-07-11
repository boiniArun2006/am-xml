package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import mfo.CLVG.aNrWBQYwFf;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class FileProvider extends ContentProvider {
    private PathStrategy J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f36339O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f36340n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f36341t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String[] f36338r = {"_display_name", "_size"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final File f36337o = new File("/");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final HashMap f36336Z = new HashMap();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    interface PathStrategy {
        Uri n(File file);

        File rl(Uri uri);
    }

    public FileProvider() {
        this(0);
    }

    public static Uri KN(Context context, String str, File file) {
        return Uo(context, str, 0).n(file);
    }

    private static File rl(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    @RequiresApi
    static class Api21Impl {
        static File[] n(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static class SimplePathStrategy implements PathStrategy {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f36342n;
        private final HashMap rl = new HashMap();

        SimplePathStrategy(String str) {
            this.f36342n = str;
        }

        private boolean nr(String str, String str2) {
            return FileProvider.gh(str).startsWith(FileProvider.gh(str2) + '/');
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public Uri n(File file) {
            String strSubstring;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.rl.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (nr(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    if (path2.endsWith("/")) {
                        strSubstring = canonicalPath.substring(path2.length());
                    } else {
                        strSubstring = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(this.f36342n).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(strSubstring, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public File rl(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            if (iIndexOf != -1) {
                String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
                String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
                File file = (File) this.rl.get(strDecode);
                if (file != null) {
                    File file2 = new File(file, strDecode2);
                    try {
                        File canonicalFile = file2.getCanonicalFile();
                        if (nr(canonicalFile.getPath(), file.getPath())) {
                            return canonicalFile;
                        }
                        throw new SecurityException("Resolved path jumped beyond configured root");
                    } catch (IOException unused) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                    }
                }
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            throw new IllegalArgumentException("Unable to find path from root: " + uri);
        }

        void t(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.rl.put(str, file.getCanonicalFile());
                    return;
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e2);
                }
            }
            throw new IllegalArgumentException("Name must not be empty");
        }
    }

    protected FileProvider(int i2) {
        this.f36340n = new Object();
        this.f36341t = i2;
    }

    private PathStrategy J2() {
        PathStrategy pathStrategy;
        synchronized (this.f36340n) {
            try {
                ObjectsCompat.nr(this.f36339O, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.J2 == null) {
                    this.J2 = Uo(getContext(), this.f36339O, this.f36341t);
                }
                pathStrategy = this.J2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pathStrategy;
    }

    static XmlResourceParser O(Context context, String str, ProviderInfo providerInfo, int i2) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i2 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i2);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    private static PathStrategy Uo(Context context, String str, int i2) {
        PathStrategy pathStrategyMUb;
        HashMap map = f36336Z;
        synchronized (map) {
            try {
                pathStrategyMUb = (PathStrategy) map.get(str);
                if (pathStrategyMUb == null) {
                    try {
                        try {
                            pathStrategyMUb = mUb(context, str, i2);
                            map.put(str, pathStrategyMUb);
                        } catch (IOException e2) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                        }
                    } catch (XmlPullParserException e3) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pathStrategyMUb;
    }

    private static PathStrategy mUb(Context context, String str, int i2) throws XmlPullParserException, IOException {
        SimplePathStrategy simplePathStrategy = new SimplePathStrategy(str);
        XmlResourceParser xmlResourceParserO = O(context, str, context.getPackageManager().resolveContentProvider(str, 128), i2);
        while (true) {
            int next = xmlResourceParserO.next();
            if (next == 1) {
                return simplePathStrategy;
            }
            if (next == 2) {
                String name = xmlResourceParserO.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserO.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.NAME);
                String attributeValue2 = xmlResourceParserO.getAttributeValue(null, JavetError.PARAMETER_PATH);
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f36337o;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = ContextCompat.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] fileArrN = Api21Impl.n(context);
                    if (fileArrN.length > 0) {
                        externalStorageDirectory = fileArrN[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    simplePathStrategy.t(attributeValue, rl(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    private static String[] nr(String[] strArr, int i2) {
        String[] strArr2 = new String[i2];
        System.arraycopy(strArr, 0, strArr2, 0, i2);
        return strArr2;
    }

    private static Object[] t(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        return objArr2;
    }

    private static int xMQ(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(aNrWBQYwFf.jfaKZtzFqYgR + str);
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String gh(String str) {
        if (str.length() > 0 && str.charAt(str.length() - 1) == '/') {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority;
                if (str != null && !str.trim().isEmpty()) {
                    String str2 = providerInfo.authority.split(";")[0];
                    synchronized (this.f36340n) {
                        this.f36339O = str2;
                    }
                    HashMap map = f36336Z;
                    synchronized (map) {
                        map.remove(str2);
                    }
                    return;
                }
                throw new SecurityException("Provider must have a non-empty authority");
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return J2().rl(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File fileRl = J2().rl(uri);
        int iLastIndexOf = fileRl.getName().lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileRl.getName().substring(iLastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(J2().rl(uri), xMQ(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i2;
        String name;
        File fileRl = J2().rl(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f36338r;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i3 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i3] = "_display_name";
                i2 = i3 + 1;
                if (queryParameter == null) {
                    name = fileRl.getName();
                } else {
                    name = queryParameter;
                }
                objArr[i3] = name;
            } else if ("_size".equals(str3)) {
                strArr3[i3] = "_size";
                i2 = i3 + 1;
                objArr[i3] = Long.valueOf(fileRl.length());
            }
            i3 = i2;
        }
        String[] strArrNr = nr(strArr3, i3);
        Object[] objArrT = t(objArr, i3);
        MatrixCursor matrixCursor = new MatrixCursor(strArrNr, 1);
        matrixCursor.addRow(objArrT);
        return matrixCursor;
    }
}

package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.tracing.Trace;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class FontProvider {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final LruCache f36557n = new LruCache(2);
    private static final Comparator rl = new Comparator() { // from class: androidx.core.provider.j
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return FontProvider.n((byte[]) obj, (byte[]) obj2);
        }
    };

    private interface ContentQueryWrapper {
        void close();

        Cursor rl(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        static ContentQueryWrapper n(Context context, Uri uri) {
            return new ContentQueryWrapperApi24Impl(context, uri);
        }
    }

    private static class ContentQueryWrapperApi16Impl implements ContentQueryWrapper {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ContentProviderClient f36558n;

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
            ContentProviderClient contentProviderClient = this.f36558n;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public Cursor rl(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f36558n;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e2) {
                Log.w("FontsProvider", "Unable to query the content provider", e2);
                return null;
            }
        }
    }

    @RequiresApi
    private static class ContentQueryWrapperApi24Impl implements ContentQueryWrapper {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ContentProviderClient f36559n;

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
            ContentProviderClient contentProviderClient = this.f36559n;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public Cursor rl(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f36559n;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e2) {
                Log.w("FontsProvider", "Unable to query the content provider", e2);
                return null;
            }
        }

        ContentQueryWrapperApi24Impl(Context context, Uri uri) {
            this.f36559n = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }
    }

    private static class ProviderCacheKey {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f36560n;
        String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        List f36561t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProviderCacheKey)) {
                return false;
            }
            ProviderCacheKey providerCacheKey = (ProviderCacheKey) obj;
            return Objects.equals(this.f36560n, providerCacheKey.f36560n) && Objects.equals(this.rl, providerCacheKey.rl) && Objects.equals(this.f36561t, providerCacheKey.f36561t);
        }

        public int hashCode() {
            return Objects.hash(this.f36560n, this.rl, this.f36561t);
        }

        ProviderCacheKey(String str, String str2, List list) {
            this.f36560n = str;
            this.rl = str2;
            this.f36561t = list;
        }
    }

    public static /* synthetic */ int n(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            byte b4 = bArr2[i2];
            if (b2 != b4) {
                return b2 - b4;
            }
        }
        return 0;
    }

    static ProviderInfo J2(PackageManager packageManager, FontRequest fontRequest, Resources resources) {
        Trace.t("FontProvider.getProvider");
        try {
            List listNr = nr(fontRequest, resources);
            ProviderCacheKey providerCacheKey = new ProviderCacheKey(fontRequest.O(), fontRequest.J2(), listNr);
            ProviderInfo providerInfo = (ProviderInfo) f36557n.get(providerCacheKey);
            if (providerInfo != null) {
                return providerInfo;
            }
            String strO = fontRequest.O();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strO, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strO);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(fontRequest.J2())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strO + ", but package was not " + fontRequest.J2());
            }
            List listRl = rl(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listRl, rl);
            for (int i2 = 0; i2 < listNr.size(); i2++) {
                ArrayList arrayList = new ArrayList((Collection) listNr.get(i2));
                Collections.sort(arrayList, rl);
                if (t(listRl, arrayList)) {
                    f36557n.put(providerCacheKey, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.J2();
            return null;
        } finally {
            Trace.J2();
        }
    }

    static FontsContractCompat.FontFamilyResult O(Context context, List list, CancellationSignal cancellationSignal) {
        Trace.t("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                FontRequest fontRequest = (FontRequest) list.get(i2);
                ProviderInfo providerInfoJ2 = J2(context.getPackageManager(), fontRequest, context.getResources());
                if (providerInfoJ2 == null) {
                    return FontsContractCompat.FontFamilyResult.rl(1, null);
                }
                arrayList.add(Uo(context, fontRequest, providerInfoJ2.authority, cancellationSignal));
            }
            return FontsContractCompat.FontFamilyResult.n(0, arrayList);
        } finally {
            Trace.J2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2, types: [androidx.core.provider.FontProvider$ContentQueryWrapper] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static FontsContractCompat.FontInfo[] Uo(Context context, FontRequest fontRequest, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        ContentQueryWrapper contentQueryWrapper;
        ContentQueryWrapper contentQueryWrapper2;
        Uri uriWithAppendedId;
        boolean z2;
        Trace.t("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(str).appendPath(FileUploadManager.f61570h).build();
            ContentQueryWrapper contentQueryWrapperN = ContentQueryWrapper.n(context, uriBuild);
            Cursor cursorRl = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.t("ContentQueryWrapper.query");
                try {
                    try {
                        cursorRl = contentQueryWrapperN.rl(uriBuild, strArr, "query = ?", new String[]{fontRequest.Uo()}, null, cancellationSignal);
                        if (cursorRl == null || cursorRl.getCount() <= 0) {
                            contentQueryWrapper = contentQueryWrapperN;
                        } else {
                            int columnIndex = cursorRl.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorRl.getColumnIndex("_id");
                            int columnIndex3 = cursorRl.getColumnIndex("file_id");
                            int columnIndex4 = cursorRl.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorRl.getColumnIndex("font_weight");
                            int columnIndex6 = cursorRl.getColumnIndex("font_italic");
                            while (cursorRl.moveToNext()) {
                                int i2 = columnIndex != -1 ? cursorRl.getInt(columnIndex) : 0;
                                int i3 = columnIndex4 != -1 ? cursorRl.getInt(columnIndex4) : 0;
                                if (columnIndex3 == -1) {
                                    contentQueryWrapper2 = contentQueryWrapperN;
                                    uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorRl.getLong(columnIndex2));
                                } else {
                                    contentQueryWrapper2 = contentQueryWrapperN;
                                    uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorRl.getLong(columnIndex3));
                                }
                                int i5 = columnIndex5 != -1 ? cursorRl.getInt(columnIndex5) : Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE;
                                if (columnIndex6 != -1) {
                                    z2 = true;
                                    if (cursorRl.getInt(columnIndex6) != 1) {
                                        z2 = false;
                                    }
                                }
                                arrayList2.add(FontsContractCompat.FontInfo.n(uriWithAppendedId, i3, i5, z2, i2));
                                contentQueryWrapperN = contentQueryWrapper2;
                            }
                            contentQueryWrapper = contentQueryWrapperN;
                            arrayList = arrayList2;
                        }
                        if (cursorRl != null) {
                            cursorRl.close();
                        }
                        contentQueryWrapper.close();
                        return (FontsContractCompat.FontInfo[]) arrayList.toArray(new FontsContractCompat.FontInfo[0]);
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    r16 = context;
                    if (cursorRl != null) {
                        cursorRl.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r16 = contentQueryWrapperN;
            }
        } finally {
            Trace.J2();
        }
    }

    private static List rl(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static List nr(FontRequest fontRequest, Resources resources) {
        if (fontRequest.rl() != null) {
            return fontRequest.rl();
        }
        return FontResourcesParserCompat.t(resources, fontRequest.t());
    }

    private static boolean t(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals((byte[]) list.get(i2), (byte[]) list2.get(i2))) {
                return false;
            }
        }
        return true;
    }
}

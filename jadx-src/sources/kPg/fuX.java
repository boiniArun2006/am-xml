package kPg;

import HI0.AbstractC1370c;
import XoT.C;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fuX f69922n = new fuX();
    private static final String rl = "sample";

    public static /* synthetic */ Pair xMQ(fuX fux, String str, char c2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c2 = '=';
        }
        return fux.KN(str, c2);
    }

    public final Pair KN(String str, char c2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.contains$default((CharSequence) str, c2, false, 2, (Object) null)) {
            return TuplesKt.to(StringsKt.substringBefore$default(str, c2, (String) null, 2, (Object) null), StringsKt.substringAfter$default(str, c2, (String) null, 2, (Object) null));
        }
        return null;
    }

    public final Bitmap O(final Uri uri) {
        String schemeSpecificPart;
        String strSubstringBefore$default;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Intrinsics.areEqual(uri.getScheme(), rl) && (schemeSpecificPart = uri.getSchemeSpecificPart()) != null && (strSubstringBefore$default = StringsKt.substringBefore$default(schemeSpecificPart, '?', (String) null, 2, (Object) null)) != null) {
            String lowerCase = strSubstringBefore$default.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                C.Uo(this, new Function0() { // from class: kPg.CN3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return fuX.J2(uri);
                    }
                });
                try {
                    InputStream inputStreamOpen = IvA.n.rl().getApplicationContext().getAssets().open("samplemedia_thumbs/" + lowerCase + ".webp");
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                        CloseableKt.closeFinally(inputStreamOpen, null);
                        return bitmapDecodeStream;
                    } finally {
                    }
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public final Bitmap Uo(Uri uri) {
        String strSubstringAfter$default;
        Integer intOrNull;
        Integer intOrNull2;
        String strSubstringBefore$default;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!Intrinsics.areEqual(uri.getScheme(), rl)) {
            return null;
        }
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (schemeSpecificPart == null || (strSubstringAfter$default = StringsKt.substringAfter$default(schemeSpecificPart, '?', (String) null, 2, (Object) null)) == null) {
            strSubstringAfter$default = "";
        }
        List listSplit$default = StringsKt.split$default((CharSequence) strSubstringAfter$default, new String[]{"&"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            Pair pairXMQ = xMQ(f69922n, (String) it.next(), (char) 0, 1, null);
            if (pairXMQ != null) {
                arrayList.add(pairXMQ);
            }
        }
        Map map = MapsKt.toMap(arrayList);
        String str = (String) map.get("w");
        if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
            int iIntValue = intOrNull.intValue();
            String str2 = (String) map.get(CmcdData.STREAMING_FORMAT_HLS);
            if (str2 != null && (intOrNull2 = StringsKt.toIntOrNull(str2)) != null) {
                int iIntValue2 = intOrNull2.intValue();
                String schemeSpecificPart2 = uri.getSchemeSpecificPart();
                if (schemeSpecificPart2 != null && (strSubstringBefore$default = StringsKt.substringBefore$default(schemeSpecificPart2, '?', (String) null, 2, (Object) null)) != null) {
                    String lowerCase = strSubstringBefore$default.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (lowerCase != null) {
                        try {
                            InputStream inputStreamOpen = IvA.n.rl().getApplicationContext().getAssets().open("samplemedia/" + lowerCase + ".webp");
                            try {
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                                CloseableKt.closeFinally(inputStreamOpen, null);
                                Intrinsics.checkNotNull(bitmapDecodeStream);
                                return AbstractC1370c.J2(bitmapDecodeStream, iIntValue, iIntValue2);
                            } finally {
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return null;
    }

    public final List nr(Dsr dsr) {
        if (dsr == null) {
            return Wre.mUb();
        }
        List listMUb = Wre.mUb();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMUb) {
            if (((n) obj).nr() == dsr) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String rl() {
        return rl;
    }

    public final n t(Uri uri) {
        String strSubstringAfter$default;
        Integer intOrNull;
        Integer intOrNull2;
        String strSubstringBefore$default;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        Object obj = null;
        if (schemeSpecificPart == null || (strSubstringAfter$default = StringsKt.substringAfter$default(schemeSpecificPart, '?', (String) null, 2, (Object) null)) == null) {
            strSubstringAfter$default = "";
        }
        List listSplit$default = StringsKt.split$default((CharSequence) strSubstringAfter$default, new String[]{"&"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            Pair pairXMQ = xMQ(f69922n, (String) it.next(), (char) 0, 1, null);
            if (pairXMQ != null) {
                arrayList.add(pairXMQ);
            }
        }
        Map map = MapsKt.toMap(arrayList);
        String str = (String) map.get("w");
        if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
            return null;
        }
        int iIntValue = intOrNull.intValue();
        String str2 = (String) map.get(CmcdData.STREAMING_FORMAT_HLS);
        if (str2 == null || (intOrNull2 = StringsKt.toIntOrNull(str2)) == null) {
            return null;
        }
        int iIntValue2 = intOrNull2.intValue();
        String schemeSpecificPart2 = uri.getSchemeSpecificPart();
        if (schemeSpecificPart2 == null || (strSubstringBefore$default = StringsKt.substringBefore$default(schemeSpecificPart2, '?', (String) null, 2, (Object) null)) == null) {
            return null;
        }
        String lowerCase = strSubstringBefore$default.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase == null) {
            return null;
        }
        Iterator it2 = Wre.mUb().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            n nVar = (n) next;
            if (nVar.J2() == iIntValue && nVar.rl() == iIntValue2 && Intrinsics.areEqual(nVar.n().n(), lowerCase)) {
                obj = next;
                break;
            }
        }
        return (n) obj;
    }

    private fuX() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String J2(Uri uri) {
        return "getSampleMediaThumb: uri=" + uri + ", scheme=" + uri.getScheme() + ", ssp=" + uri.getSchemeSpecificPart() + ", id=" + uri.getLastPathSegment() + ", query=" + uri.getQuery();
    }
}

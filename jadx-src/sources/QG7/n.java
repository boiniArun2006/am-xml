package QG7;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.content.res.ResourcesCompat;
import bA.C1653C;
import bA.C1659aC;
import bA.InterfaceC1656I28;
import bA.eO;
import dX.Ml;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import vn.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n implements bAP.n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f7961t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Resources f7962n;
    private final Map rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public n(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f7962n = resources;
        this.rl = new ConcurrentHashMap();
    }

    private final int rl(String str) {
        Map map = this.rl;
        Object objValueOf = map.get(str);
        if (objValueOf == null) {
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            objValueOf = Integer.valueOf(t(uri));
            map.put(str, objValueOf);
        }
        return ((Number) objValueOf).intValue();
    }

    @Override // bAP.n
    public InterfaceC1656I28 n(C1653C encodedImage, int i2, eO qualityInfo, Ml options) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(qualityInfo, "qualityInfo");
        Intrinsics.checkNotNullParameter(options, "options");
        try {
            String strA = encodedImage.a();
            if (strA == null) {
                throw new IllegalStateException("No source in encoded image");
            }
            Drawable drawableJ2 = ResourcesCompat.J2(this.f7962n, rl(strA), null);
            if (drawableJ2 != null) {
                return new C1659aC(drawableJ2);
            }
            return null;
        } catch (Throwable th) {
            Dzy.j.xMQ("XmlFormatDecoder", "Cannot decode xml", th);
            return null;
        }
    }

    private final int t(Uri uri) {
        Integer intOrNull;
        if (!I28.ty(uri) && !I28.ck(uri)) {
            throw new IllegalStateException(("Unsupported uri " + uri).toString());
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        String str = (String) CollectionsKt.lastOrNull((List) pathSegments);
        if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
            return intOrNull.intValue();
        }
        throw new IllegalStateException(("Unable to read resource ID from " + uri.getPath()).toString());
    }
}

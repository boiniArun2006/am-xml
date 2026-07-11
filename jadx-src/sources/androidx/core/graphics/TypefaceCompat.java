package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.tracing.Trace;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class TypefaceCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final TypefaceCompatBaseImpl f36420n;
    private static final LruCache rl;

    @RestrictTo
    public static class ResourcesCallbackAdapter extends FontsContractCompat.FontRequestCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ResourcesCompat.FontCallback f36421n;

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void n(int i2) {
            ResourcesCompat.FontCallback fontCallback = this.f36421n;
            if (fontCallback != null) {
                fontCallback.J2(i2);
            }
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void rl(Typeface typeface) {
            ResourcesCompat.FontCallback fontCallback = this.f36421n;
            if (fontCallback != null) {
                fontCallback.Uo(typeface);
            }
        }

        public ResourcesCallbackAdapter(ResourcesCompat.FontCallback fontCallback) {
            this.f36421n = fontCallback;
        }
    }

    private static Typeface KN(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    static {
        Trace.t("TypefaceCompat static init");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f36420n = new TypefaceCompatApi29Impl();
        } else if (i2 >= 28) {
            f36420n = new TypefaceCompatApi28Impl();
        } else if (i2 >= 26) {
            f36420n = new TypefaceCompatApi26Impl();
        } else if (TypefaceCompatApi24Impl.ty()) {
            f36420n = new TypefaceCompatApi24Impl();
        } else {
            f36420n = new TypefaceCompatApi21Impl();
        }
        rl = new LruCache(16);
        Trace.J2();
    }

    private static String J2(Resources resources, int i2, String str, int i3, int i5) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i5;
    }

    public static Typeface O(Context context, Resources resources, int i2, String str, int i3, int i5) {
        Typeface typefaceJ2 = f36420n.J2(context, resources, i2, str, i5);
        if (typefaceJ2 != null) {
            rl.put(J2(resources, i2, str, i3, i5), typefaceJ2);
        }
        return typefaceJ2;
    }

    public static Typeface Uo(Resources resources, int i2, String str, int i3, int i5) {
        return (Typeface) rl.get(J2(resources, i2, str, i3, i5));
    }

    public static Typeface n(Context context, Typeface typeface, int i2) {
        if (context != null) {
            return Typeface.create(typeface, i2);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface nr(Context context, FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, Resources resources, int i2, String str, int i3, int i5, ResourcesCompat.FontCallback fontCallback, Handler handler, boolean z2) {
        Typeface typefaceRl;
        if (familyResourceEntry instanceof FontResourcesParserCompat.ProviderResourceEntry) {
            FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry;
            Typeface typefaceKN = KN(providerResourceEntry.nr());
            if (typefaceKN != null) {
                if (fontCallback != null) {
                    fontCallback.nr(typefaceKN, handler);
                }
                return typefaceKN;
            }
            typefaceRl = FontsContractCompat.t(context, providerResourceEntry.n() != null ? w6.n(new Object[]{providerResourceEntry.t(), providerResourceEntry.n()}) : w6.n(new Object[]{providerResourceEntry.t()}), i5, !z2 ? fontCallback != null : providerResourceEntry.rl() != 0, z2 ? providerResourceEntry.O() : -1, ResourcesCompat.FontCallback.O(handler), new ResourcesCallbackAdapter(fontCallback));
        } else {
            typefaceRl = f36420n.rl(context, (FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry, resources, i5);
            if (fontCallback != null) {
                if (typefaceRl != null) {
                    fontCallback.nr(typefaceRl, handler);
                } else {
                    fontCallback.t(-3, handler);
                }
            }
        }
        if (typefaceRl != null) {
            rl.put(J2(resources, i2, str, i3, i5), typefaceRl);
        }
        return typefaceRl;
    }

    public static Typeface rl(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        Trace.t("TypefaceCompat.createFromFontInfo");
        try {
            return f36420n.t(context, cancellationSignal, fontInfoArr, i2);
        } finally {
            Trace.J2();
        }
    }

    public static Typeface t(Context context, CancellationSignal cancellationSignal, List list, int i2) {
        Trace.t("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f36420n.nr(context, cancellationSignal, list, i2);
        } finally {
            Trace.J2();
        }
    }
}

package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
class TypefaceCompatBaseImpl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ConcurrentHashMap f36426n = new ConcurrentHashMap();

    private interface StyleExtractor<T> {
        boolean n(Object obj);

        int rl(Object obj);
    }

    private static Object xMQ(Object[] objArr, int i2, boolean z2, StyleExtractor styleExtractor) {
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(styleExtractor.rl(obj2) - i2) * 2) + (styleExtractor.n(obj2) == z2 ? 0 : 1);
            if (obj == null || i3 > iAbs) {
                obj = obj2;
                i3 = iAbs;
            }
        }
        return obj;
    }

    public Typeface t(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (fontInfoArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(mUb(fontInfoArr, i2).nr());
            try {
                Typeface typefaceO = O(context, inputStreamOpenInputStream);
                TypefaceCompatUtil.n(inputStreamOpenInputStream);
                return typefaceO;
            } catch (IOException unused) {
                TypefaceCompatUtil.n(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                TypefaceCompatUtil.n(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$3, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    class AnonymousClass3 implements StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry> {
        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public boolean n(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
            return fontFileResourceEntry.J2();
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int rl(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
            return fontFileResourceEntry.O();
        }
    }

    private static Object KN(Object[] objArr, int i2, StyleExtractor styleExtractor) {
        return xMQ(objArr, (i2 & 1) == 0 ? Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE : 700, (i2 & 2) != 0, styleExtractor);
    }

    private static long gh(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        } catch (NoSuchFieldException e3) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
            return 0L;
        }
    }

    protected FontsContractCompat.FontInfo mUb(FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        return (FontsContractCompat.FontInfo) KN(fontInfoArr, i2, new StyleExtractor<FontsContractCompat.FontInfo>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.1
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
            public boolean n(FontsContractCompat.FontInfo fontInfo) {
                return fontInfo.J2();
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public int rl(FontsContractCompat.FontInfo fontInfo) {
                return fontInfo.O();
            }
        });
    }

    public Typeface nr(Context context, CancellationSignal cancellationSignal, List list, int i2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    TypefaceCompatBaseImpl() {
    }

    private FontResourcesParserCompat.FontFileResourceEntry Uo(FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, int i2) {
        return (FontResourcesParserCompat.FontFileResourceEntry) KN(fontFamilyFilesResourceEntry.n(), i2, new StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.2
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
            public boolean n(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.J2();
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public int rl(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
                return fontFileResourceEntry.O();
            }
        });
    }

    private void n(Typeface typeface, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry) {
        long jGh = gh(typeface);
        if (jGh != 0) {
            this.f36426n.put(Long.valueOf(jGh), fontFamilyFilesResourceEntry);
        }
    }

    public Typeface J2(Context context, Resources resources, int i2, String str, int i3) {
        File fileO = TypefaceCompatUtil.O(context);
        if (fileO == null) {
            return null;
        }
        try {
            if (!TypefaceCompatUtil.t(fileO, resources, i2)) {
                return null;
            }
            return Typeface.createFromFile(fileO.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileO.delete();
        }
    }

    protected Typeface O(Context context, InputStream inputStream) {
        File fileO = TypefaceCompatUtil.O(context);
        if (fileO == null) {
            return null;
        }
        try {
            if (!TypefaceCompatUtil.nr(fileO, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(fileO.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileO.delete();
        }
    }

    public Typeface rl(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntryUo = Uo(fontFamilyFilesResourceEntry, i2);
        if (fontFileResourceEntryUo == null) {
            return null;
        }
        Typeface typefaceO = TypefaceCompat.O(context, resources, fontFileResourceEntryUo.rl(), fontFileResourceEntryUo.n(), 0, i2);
        n(typefaceO, fontFamilyFilesResourceEntry);
        return typefaceO;
    }
}

package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Consumer;
import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class FontRequestWorker {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final LruCache f36565n = new LruCache(16);
    private static final ExecutorService rl = RequestExecutor.n("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final Object f36566t = new Object();
    static final SimpleArrayMap nr = new SimpleArrayMap();

    static final class TypefaceResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Typeface f36573n;
        final int rl;

        TypefaceResult(int i2) {
            this.f36573n = null;
            this.rl = i2;
        }

        boolean n() {
            return this.rl == 0;
        }

        TypefaceResult(Typeface typeface) {
            this.f36573n = typeface;
            this.rl = 0;
        }
    }

    private static String n(List list, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < list.size(); i3++) {
            sb.append(((FontRequest) list.get(i3)).nr());
            sb.append("-");
            sb.append(i2);
            if (i3 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    static TypefaceResult t(String str, Context context, List list, int i2) {
        Trace.t("getFontSync");
        try {
            LruCache lruCache = f36565n;
            Typeface typeface = (Typeface) lruCache.get(str);
            if (typeface != null) {
                return new TypefaceResult(typeface);
            }
            FontsContractCompat.FontFamilyResult fontFamilyResultO = FontProvider.O(context, list, null);
            int iRl = rl(fontFamilyResultO);
            if (iRl != 0) {
                return new TypefaceResult(iRl);
            }
            Typeface typefaceRl = (!fontFamilyResultO.J2() || Build.VERSION.SDK_INT < 29) ? TypefaceCompat.rl(context, null, fontFamilyResultO.t(), i2) : TypefaceCompat.t(context, null, fontFamilyResultO.nr(), i2);
            if (typefaceRl == null) {
                return new TypefaceResult(-3);
            }
            lruCache.put(str, typefaceRl);
            return new TypefaceResult(typefaceRl);
        } catch (PackageManager.NameNotFoundException unused) {
            return new TypefaceResult(-1);
        } finally {
            Trace.J2();
        }
    }

    static Typeface O(final Context context, final FontRequest fontRequest, CallbackWrapper callbackWrapper, final int i2, int i3) {
        final String strN = n(androidx.core.graphics.w6.n(new Object[]{fontRequest}), i2);
        Typeface typeface = (Typeface) f36565n.get(strN);
        if (typeface != null) {
            callbackWrapper.rl(new TypefaceResult(typeface));
            return typeface;
        }
        if (i3 == -1) {
            TypefaceResult typefaceResultT = t(strN, context, androidx.core.graphics.w6.n(new Object[]{fontRequest}), i2);
            callbackWrapper.rl(typefaceResultT);
            return typefaceResultT.f36573n;
        }
        try {
            TypefaceResult typefaceResult = (TypefaceResult) RequestExecutor.nr(rl, new Callable<TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.1
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public TypefaceResult call() {
                    return FontRequestWorker.t(strN, context, androidx.core.graphics.w6.n(new Object[]{fontRequest}), i2);
                }
            }, i3);
            callbackWrapper.rl(typefaceResult);
            return typefaceResult.f36573n;
        } catch (InterruptedException unused) {
            callbackWrapper.rl(new TypefaceResult(-3));
            return null;
        }
    }

    static Typeface nr(final Context context, final List list, final int i2, Executor executor, final CallbackWrapper callbackWrapper) {
        final String strN = n(list, i2);
        Typeface typeface = (Typeface) f36565n.get(strN);
        if (typeface != null) {
            callbackWrapper.rl(new TypefaceResult(typeface));
            return typeface;
        }
        Consumer<TypefaceResult> consumer = new Consumer<TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.2
            @Override // androidx.core.util.Consumer
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public void accept(TypefaceResult typefaceResult) {
                if (typefaceResult == null) {
                    typefaceResult = new TypefaceResult(-3);
                }
                callbackWrapper.rl(typefaceResult);
            }
        };
        synchronized (f36566t) {
            try {
                SimpleArrayMap simpleArrayMap = nr;
                ArrayList arrayList = (ArrayList) simpleArrayMap.get(strN);
                if (arrayList != null) {
                    arrayList.add(consumer);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(consumer);
                simpleArrayMap.put(strN, arrayList2);
                Callable<TypefaceResult> callable = new Callable<TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.3
                    @Override // java.util.concurrent.Callable
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public TypefaceResult call() {
                        try {
                            return FontRequestWorker.t(strN, context, list, i2);
                        } catch (Throwable unused) {
                            return new TypefaceResult(-3);
                        }
                    }
                };
                if (executor == null) {
                    executor = rl;
                }
                RequestExecutor.t(executor, callable, new Consumer<TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.4
                    @Override // androidx.core.util.Consumer
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public void accept(TypefaceResult typefaceResult) {
                        synchronized (FontRequestWorker.f36566t) {
                            try {
                                SimpleArrayMap simpleArrayMap2 = FontRequestWorker.nr;
                                ArrayList arrayList3 = (ArrayList) simpleArrayMap2.get(strN);
                                if (arrayList3 == null) {
                                    return;
                                }
                                simpleArrayMap2.remove(strN);
                                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                                    ((Consumer) arrayList3.get(i3)).accept(typefaceResult);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                });
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static int rl(FontsContractCompat.FontFamilyResult fontFamilyResult) {
        int i2 = 1;
        if (fontFamilyResult.O() != 0) {
            if (fontFamilyResult.O() != 1) {
                return -3;
            }
            return -2;
        }
        FontsContractCompat.FontInfo[] fontInfoArrT = fontFamilyResult.t();
        if (fontInfoArrT != null && fontInfoArrT.length != 0) {
            i2 = 0;
            for (FontsContractCompat.FontInfo fontInfo : fontInfoArrT) {
                int iRl = fontInfo.rl();
                if (iRl != 0) {
                    if (iRl < 0) {
                        return -3;
                    }
                    return iRl;
                }
            }
        }
        return i2;
    }
}

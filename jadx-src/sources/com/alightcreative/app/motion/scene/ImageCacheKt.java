package com.alightcreative.app.motion.scene;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Log;
import android.util.LruCache;
import d.AbstractC1951j;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import z8.AbstractC2487Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0007\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000b\u0010\u000f\u001a\u001f\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"$\u0010\u001b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001c\"\u0015\u0010+\u001a\u00020(*\u00020'8F¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0015\u0010-\u001a\u00020(*\u00020'8F¢\u0006\u0006\u001a\u0004\b,\u0010*\"\u0015\u0010/\u001a\u00020(*\u00020'8F¢\u0006\u0006\u001a\u0004\b.\u0010*¨\u00060"}, d2 = {"", "force", "", "trimImageCacheMemory", "(Z)V", "KEY", "Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "key", "Lkotlin/Function0;", "Landroid/graphics/Bitmap;", "valueMaker", "getOrPut", "(Lcom/alightcreative/app/motion/scene/BitmapLruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Landroid/graphics/Bitmap;", "VALUE", "Landroid/util/LruCache;", "(Landroid/util/LruCache;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "LHI0/Q;", "contentResolver", "Landroid/net/Uri;", "uri", "loadImageThumbFromUri", "(LHI0/Q;Landroid/net/Uri;)Landroid/graphics/Bitmap;", "flipped", "loadImageFromUri", "(LHI0/Q;Landroid/net/Uri;Z)Landroid/graphics/Bitmap;", "", "Ljava/lang/ref/WeakReference;", "bitmapCaches", "Ljava/util/List;", "", "GB", "J", "Lcom/alightcreative/app/motion/scene/CacheKey;", "uriBitmapCache", "Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "uriThumbCache", "", "Landroid/graphics/Bitmap$Config;", "SUPPORTED_CONFIGS", "Landroid/graphics/BitmapFactory$Options;", "", "getScaledWidth", "(Landroid/graphics/BitmapFactory$Options;)I", "scaledWidth", "getScaledHeight", "scaledHeight", "getScaledMemory", "scaledMemory", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageCache.kt\ncom/alightcreative/app/motion/scene/ImageCacheKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n1611#2,9:231\n1863#2:240\n1864#2:242\n1620#2:243\n1863#2,2:244\n1#3:241\n*S KotlinDebug\n*F\n+ 1 ImageCache.kt\ncom/alightcreative/app/motion/scene/ImageCacheKt\n*L\n39#1:231,9\n39#1:240\n39#1:242\n39#1:243\n39#1:244,2\n39#1:241\n*E\n"})
public final class ImageCacheKt {
    private static final List<Bitmap.Config> SUPPORTED_CONFIGS;
    private static final BitmapLruCache<Uri> uriThumbCache;
    private static final List<WeakReference<BitmapLruCache<?>>> bitmapCaches = new ArrayList();
    private static final long GB = 1073741824;
    private static final BitmapLruCache<CacheKey> uriBitmapCache = new BitmapLruCache<>(0, "uriBitmapCache", 1, null);

    public static final <KEY> Bitmap getOrPut(BitmapLruCache<KEY> bitmapLruCache, KEY key, Function0<Bitmap> valueMaker) {
        Intrinsics.checkNotNullParameter(bitmapLruCache, "<this>");
        Intrinsics.checkNotNullParameter(valueMaker, "valueMaker");
        Bitmap bitmap = bitmapLruCache.get(key);
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmapInvoke = valueMaker.invoke();
        bitmapLruCache.put(key, bitmapInvoke);
        return bitmapInvoke;
    }

    static {
        uriThumbCache = new BitmapLruCache<>(AbstractC2487Wre.gh() > ((long) 4) * 1073741824 ? 125829120 : AbstractC2487Wre.gh() > ((long) 3) * 1073741824 ? 104857600 : AbstractC2487Wre.gh() > ((long) 2) * 1073741824 ? 62914560 : AbstractC2487Wre.gh() > 1073741824 ? 20971520 : 10485760, "uriThumbCache");
        SUPPORTED_CONFIGS = CollectionsKt.listOf((Object[]) new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGB_565});
    }

    public static final int getScaledHeight(BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "<this>");
        int i2 = options.inSampleSize;
        int i3 = options.outHeight;
        return i2 < 1 ? i3 : i3 / i2;
    }

    public static final int getScaledMemory(BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "<this>");
        return getScaledWidth(options) * getScaledHeight(options) * 4;
    }

    public static final int getScaledWidth(BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "<this>");
        int i2 = options.inSampleSize;
        int i3 = options.outWidth;
        return i2 < 1 ? i3 : i3 / i2;
    }

    public static final Bitmap loadImageFromUri(HI0.Q contentResolver, Uri uri, boolean z2) {
        Bitmap bitmapLoadImageFromUri$loadImage;
        Bitmap bitmapCreateBitmap;
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(uri, "uri");
        BitmapLruCache<CacheKey> bitmapLruCache = uriBitmapCache;
        CacheKey cacheKey = new CacheKey(uri, z2);
        Bitmap bitmap = bitmapLruCache.get(cacheKey);
        if (bitmap != null) {
            return bitmap;
        }
        String scheme = uri.getScheme();
        kPg.fuX fux = kPg.fuX.f69922n;
        if (Intrinsics.areEqual(scheme, fux.rl())) {
            Bitmap bitmapUo = fux.Uo(uri);
            if (bitmapUo == null) {
                return null;
            }
            bitmapLruCache.put(cacheKey, bitmapUo);
            return bitmapUo;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            AssetFileDescriptor assetFileDescriptorNr = contentResolver.nr(uri, "r");
            try {
                options.inJustDecodeBounds = true;
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorNr.getFileDescriptor());
                try {
                    fileInputStream.skip(assetFileDescriptorNr.getStartOffset());
                    BitmapFactory.decodeStream(fileInputStream, null, options);
                    CloseableKt.closeFinally(fileInputStream, null);
                    CloseableKt.closeFinally(assetFileDescriptorNr, null);
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = 1;
                    int i2 = AbstractC2487Wre.gh() > ((long) 2) * GB ? 4096 : 2048;
                    while (true) {
                        if (getScaledWidth(options) <= i2 && getScaledHeight(options) <= i2 && getScaledMemory(options) <= bitmapLruCache.maxSize() / 3) {
                            break;
                        }
                        options.inSampleSize *= 2;
                    }
                    Log.d("BitmapUriCache", "Will decode: " + uri + " (" + options.outWidth + "x" + options.outHeight + " @ss=" + options.inSampleSize + " -> " + getScaledWidth(options) + "x" + getScaledHeight(options) + ")");
                    try {
                        bitmapLoadImageFromUri$loadImage = loadImageFromUri$loadImage(contentResolver, uri, options);
                    } catch (OutOfMemoryError unused) {
                        trimImageCacheMemory(true);
                        try {
                            bitmapLoadImageFromUri$loadImage = loadImageFromUri$loadImage(contentResolver, uri, options);
                        } catch (OutOfMemoryError unused2) {
                            options.inSampleSize *= 2;
                            bitmapLoadImageFromUri$loadImage = loadImageFromUri$loadImage(contentResolver, uri, options);
                        }
                    }
                    if (!z2) {
                        if (!CollectionsKt.contains(SUPPORTED_CONFIGS, bitmapLoadImageFromUri$loadImage.getConfig())) {
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapLoadImageFromUri$loadImage.getWidth(), bitmapLoadImageFromUri$loadImage.getHeight(), Bitmap.Config.ARGB_8888);
                            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapLoadImageFromUri$loadImage, 0.0f, 0.0f, (Paint) null);
                        }
                        bitmapLruCache.put(cacheKey, bitmapLoadImageFromUri$loadImage);
                        Log.d("BitmapUriCache", "Decoded: " + uri + " (" + bitmapLoadImageFromUri$loadImage.getWidth() + "x" + bitmapLoadImageFromUri$loadImage.getHeight() + " " + (bitmapLoadImageFromUri$loadImage.getAllocationByteCount() / 1024) + "kb)");
                        return bitmapLoadImageFromUri$loadImage;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapLoadImageFromUri$loadImage.getWidth(), bitmapLoadImageFromUri$loadImage.getHeight(), Bitmap.Config.ARGB_8888);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.scale(-1.0f, 1.0f, bitmapLoadImageFromUri$loadImage.getWidth() / 2.0f, bitmapLoadImageFromUri$loadImage.getHeight() / 2.0f);
                    canvas.drawBitmap(bitmapLoadImageFromUri$loadImage, 0.0f, 0.0f, (Paint) null);
                    bitmapLoadImageFromUri$loadImage = bitmapCreateBitmap;
                    bitmapLruCache.put(cacheKey, bitmapLoadImageFromUri$loadImage);
                    Log.d("BitmapUriCache", "Decoded: " + uri + " (" + bitmapLoadImageFromUri$loadImage.getWidth() + "x" + bitmapLoadImageFromUri$loadImage.getHeight() + " " + (bitmapLoadImageFromUri$loadImage.getAllocationByteCount() / 1024) + "kb)");
                    return bitmapLoadImageFromUri$loadImage;
                } finally {
                }
            } finally {
            }
        } catch (IOException | SecurityException unused3) {
            return null;
        }
    }

    public static /* synthetic */ Bitmap loadImageFromUri$default(HI0.Q q2, Uri uri, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return loadImageFromUri(q2, uri, z2);
    }

    private static final Bitmap loadImageFromUri$loadImage(HI0.Q q2, Uri uri, BitmapFactory.Options options) {
        AssetFileDescriptor assetFileDescriptorNr = q2.nr(uri, "r");
        try {
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorNr.getFileDescriptor());
            try {
                fileInputStream.skip(assetFileDescriptorNr.getStartOffset());
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                CloseableKt.closeFinally(fileInputStream, null);
                CloseableKt.closeFinally(assetFileDescriptorNr, null);
                if (bitmapDecodeStream != null) {
                    return bitmapDecodeStream;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                return bitmapCreateBitmap;
            } finally {
            }
        } finally {
        }
    }

    public static final Bitmap loadImageThumbFromUri(HI0.Q contentResolver, Uri uri) {
        BitmapLruCache<Uri> bitmapLruCache;
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(uri, "uri");
        BitmapLruCache<Uri> bitmapLruCache2 = uriThumbCache;
        Bitmap bitmap = bitmapLruCache2.get(uri);
        if (bitmap != null) {
            return bitmap;
        }
        String scheme = uri.getScheme();
        kPg.fuX fux = kPg.fuX.f69922n;
        if (Intrinsics.areEqual(scheme, fux.rl())) {
            Bitmap bitmapO = fux.O(uri);
            if (bitmapO == null) {
                return null;
            }
            bitmapLruCache2.put(uri, bitmapO);
            return bitmapO;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            AssetFileDescriptor assetFileDescriptorNr = contentResolver.nr(uri, "r");
            try {
                options.inJustDecodeBounds = true;
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorNr.getFileDescriptor());
                try {
                    fileInputStream.skip(assetFileDescriptorNr.getStartOffset());
                    BitmapFactory.decodeStream(fileInputStream, null, options);
                    CloseableKt.closeFinally(fileInputStream, null);
                    CloseableKt.closeFinally(assetFileDescriptorNr, null);
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = 1;
                    long jGh = AbstractC2487Wre.gh();
                    long j2 = 2;
                    long j3 = GB;
                    int i2 = jGh > (j2 * j3) + (j3 / j2) ? 512 : AbstractC2487Wre.gh() > j3 + (j3 / j2) ? 256 : 128;
                    while (true) {
                        if (getScaledWidth(options) <= i2 && getScaledHeight(options) <= i2) {
                            int scaledMemory = getScaledMemory(options);
                            bitmapLruCache = uriThumbCache;
                            if (scaledMemory <= bitmapLruCache.maxSize() / 3) {
                                break;
                            }
                        }
                        options.inSampleSize *= 2;
                    }
                    Log.d("BitmapUriCache", "Will decode: " + uri + " (" + options.outWidth + "x" + options.outHeight + " @ss=" + options.inSampleSize + " -> " + getScaledWidth(options) + "x" + getScaledHeight(options) + ")");
                    assetFileDescriptorNr = contentResolver.nr(uri, "r");
                    try {
                        fileInputStream = new FileInputStream(assetFileDescriptorNr.getFileDescriptor());
                        try {
                            fileInputStream.skip(assetFileDescriptorNr.getStartOffset());
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                            CloseableKt.closeFinally(fileInputStream, null);
                            CloseableKt.closeFinally(assetFileDescriptorNr, null);
                            if (bitmapDecodeStream == null) {
                                bitmapDecodeStream = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                                Intrinsics.checkNotNullExpressionValue(bitmapDecodeStream, "createBitmap(...)");
                            }
                            Pair pairUo = AbstractC1951j.Uo(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), 250, 250);
                            int iIntValue = ((Number) pairUo.component1()).intValue();
                            int iIntValue2 = ((Number) pairUo.component2()).intValue();
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
                            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, (Rect) null, new Rect(0, 0, iIntValue, iIntValue2), (Paint) null);
                            bitmapLruCache.put(uri, bitmapCreateBitmap);
                            Log.d("ThumbUriCache", "Decoded: " + uri + " (" + bitmapCreateBitmap.getWidth() + "x" + bitmapCreateBitmap.getHeight() + " " + (bitmapCreateBitmap.getAllocationByteCount() / 1024) + "kb)");
                            return bitmapCreateBitmap;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (IOException | SecurityException unused) {
            return null;
        }
    }

    public static final void trimImageCacheMemory(final boolean z2) {
        List<WeakReference<BitmapLruCache<?>>> list = bitmapCaches;
        ArrayList<BitmapLruCache> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            BitmapLruCache bitmapLruCache = (BitmapLruCache) ((WeakReference) it.next()).get();
            if (bitmapLruCache != null) {
                arrayList.add(bitmapLruCache);
            }
        }
        for (final BitmapLruCache bitmapLruCache2 : arrayList) {
            XoT.C.KN("trimImageCacheMemory", new Function0() { // from class: com.alightcreative.app.motion.scene.eO
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImageCacheKt.trimImageCacheMemory$lambda$2$lambda$1(bitmapLruCache2, z2);
                }
            });
            if (z2) {
                bitmapLruCache2.evictAll();
            } else {
                bitmapLruCache2.trimToSize(bitmapLruCache2.maxSize() / 10);
            }
        }
    }

    public static /* synthetic */ void trimImageCacheMemory$default(boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        trimImageCacheMemory(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String trimImageCacheMemory$lambda$2$lambda$1(BitmapLruCache bitmapLruCache, boolean z2) {
        String tag = bitmapLruCache.getTag();
        if (tag == null) {
            tag = "?";
        }
        return "trim cache tag=" + tag + " " + bitmapLruCache.size() + "/" + bitmapLruCache.maxSize() + " force=" + z2;
    }

    public static final <KEY, VALUE> VALUE getOrPut(LruCache<KEY, VALUE> lruCache, KEY key, Function0<? extends VALUE> valueMaker) {
        Intrinsics.checkNotNullParameter(lruCache, "<this>");
        Intrinsics.checkNotNullParameter(valueMaker, "valueMaker");
        VALUE value = lruCache.get(key);
        if (value != null) {
            return value;
        }
        VALUE valueInvoke = valueMaker.invoke();
        lruCache.put(key, valueInvoke);
        return valueInvoke;
    }
}

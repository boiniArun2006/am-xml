package com.facebook.imageutils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.Pair;
import androidx.core.util.Pools;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml {
    private static boolean nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f52656t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f52655n = new Ml();
    private static final Lazy rl = LazyKt.lazy(new Function0() { // from class: com.facebook.imageutils.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Ml.rl();
        }
    });

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Bitmap.Config.RGBA_1010102.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int KN(Bitmap.Config config) {
        switch (config == null ? -1 : j.$EnumSwitchMapping$0[config.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
            case 7:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final Wre O(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Ml ml = f52655n;
        ByteBuffer byteBufferGh = ml.gh();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferGh.array();
            ml.J2(inputStream, null, options);
            Wre wre = new Wre(options.outWidth, options.outHeight, Build.VERSION.SDK_INT >= 26 ? options.outColorSpace : null);
            ml.qie(byteBufferGh);
            return wre;
        } catch (Throwable th) {
            f52655n.qie(byteBufferGh);
            throw th;
        }
    }

    private final Pools.SynchronizedPool Uo() {
        return (Pools.SynchronizedPool) rl.getValue();
    }

    public static final int mUb(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    public static final Pair nr(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Ml ml = f52655n;
        ByteBuffer byteBufferGh = ml.gh();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferGh.array();
            Pair pair = null;
            ml.J2(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            ml.qie(byteBufferGh);
            return pair;
        } catch (Throwable th) {
            f52655n.qie(byteBufferGh);
            throw th;
        }
    }

    private final void qie(ByteBuffer byteBuffer) {
        if (f52656t) {
            return;
        }
        Uo().n(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pools.SynchronizedPool rl() {
        return new Pools.SynchronizedPool(12);
    }

    private final ByteBuffer t() {
        return f52656t ? A72.n.f16n.acquire() : (ByteBuffer) Uo().acquire();
    }

    public static final int xMQ(int i2, int i3, Bitmap.Config config) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(("width must be > 0, width is: " + i2).toString());
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException(("height must be > 0, height is: " + i3).toString());
        }
        int iKN = KN(config);
        int i5 = i2 * i3 * iKN;
        if (i5 > 0) {
            return i5;
        }
        throw new IllegalStateException(("size must be > 0: size: " + i5 + ", width: " + i2 + ", height: " + i3 + ", pixelSize: " + iKN).toString());
    }

    public final Bitmap J2(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (!nr) {
            return BitmapFactory.decodeStream(inputStream, rect, options);
        }
        try {
            return BitmapFactory.decodeStream(inputStream, rect, options);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private Ml() {
    }

    private final ByteBuffer gh() {
        ByteBuffer byteBufferT = t();
        if (byteBufferT == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(A72.n.nr());
            Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
            return byteBufferAllocate;
        }
        return byteBufferT;
    }
}

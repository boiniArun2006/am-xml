package kYF;

import Z.w6;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import fVb.n;
import java.io.Closeable;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import r1.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Bitmap.Config[] f69927n;
    private static final Bitmap.Config rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Headers f69928t;

    public static final String mUb(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt.substringAfterLast(StringsKt.substringAfterLast$default(StringsKt.substringBeforeLast$default(StringsKt.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    public static final Headers.Builder rl(Headers.Builder builder, String str) {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String string = StringsKt.trim((CharSequence) strSubstring).toString();
        String strSubstring2 = str.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        builder.addUnsafeNonAscii(string, strSubstring2);
        return builder;
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Be4.CN3.values().length];
            try {
                iArr[Be4.CN3.f517n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Be4.CN3.f520t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Be4.CN3.f516O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Be4.CN3.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Z.CN3.values().length];
            try {
                iArr3[Z.CN3.f12263n.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Z.CN3.f12264t.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f69927n = i2 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        rl = i2 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f69928t = new Headers.Builder().build();
    }

    public static final int HI(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final Bitmap.Config J2() {
        return rl;
    }

    public static final FjR.eO S(FjR.eO eOVar) {
        return eOVar == null ? FjR.eO.f3020t : eOVar;
    }

    public static final eQ.w6 Uo(n.j jVar) {
        return jVar instanceof fVb.w6 ? ((fVb.w6) jVar).O() : eQ.w6.rl;
    }

    public static final Headers WPU(Headers headers) {
        return headers == null ? f69928t : headers;
    }

    public static final FjR.o XQ(FjR.o oVar) {
        return oVar == null ? FjR.o.f3057O : oVar;
    }

    public static final boolean Z(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
    }

    public static final int gh(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final int nY(Z.w6 w6Var, Z.CN3 cn3) {
        if (w6Var instanceof w6.j) {
            return ((w6.j) w6Var).f12273n;
        }
        int i2 = j.$EnumSwitchMapping$2[cn3.ordinal()];
        if (i2 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i2 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean o(n.j jVar) {
        return (jVar instanceof fVb.w6) && ((fVb.w6) jVar).J2();
    }

    public static final boolean r(int i2) {
        return i2 == Integer.MIN_VALUE || i2 == Integer.MAX_VALUE;
    }

    public static final int t(Context context, double d2) {
        int largeMemoryClass;
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        double d4 = 1024;
        return (int) (d2 * ((double) largeMemoryClass) * d4 * d4);
    }

    public static final Bitmap.Config[] ty() {
        return f69927n;
    }

    public static final int xMQ(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final boolean Ik() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final String KN(Uri uri) {
        return (String) CollectionsKt.firstOrNull((List) uri.getPathSegments());
    }

    public static final int ViF(String str, int i2) {
        Long longOrNull = StringsKt.toLongOrNull(str);
        if (longOrNull != null) {
            long jLongValue = longOrNull.longValue();
            if (jLongValue > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (jLongValue < 0) {
                return 0;
            }
            return (int) jLongValue;
        }
        return i2;
    }

    public static final ResponseBody aYN(Response response) {
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null) {
            return responseBodyBody;
        }
        throw new IllegalStateException("response body == null");
    }

    public static final Z.CN3 az(ImageView imageView) {
        int i2;
        ImageView.ScaleType scaleType = imageView.getScaleType();
        if (scaleType == null) {
            i2 = -1;
        } else {
            i2 = j.$EnumSwitchMapping$1[scaleType.ordinal()];
        }
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            return Z.CN3.f12263n;
        }
        return Z.CN3.f12264t;
    }

    public static final boolean ck(Uri uri) {
        if (Intrinsics.areEqual(uri.getScheme(), FileUploadManager.f61570h) && Intrinsics.areEqual(KN(uri), "android_asset")) {
            return true;
        }
        return false;
    }

    public static final void n(j.n nVar) {
        try {
            nVar.abort();
        } catch (Exception unused) {
        }
    }

    public static final void nr(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final File qie(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            cacheDir.mkdirs();
            return cacheDir;
        }
        throw new IllegalStateException("cacheDir == null");
    }

    public static final double O(Context context) {
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            if (!((ActivityManager) systemService).isLowRamDevice()) {
                return 0.2d;
            }
            return 0.15d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }
}

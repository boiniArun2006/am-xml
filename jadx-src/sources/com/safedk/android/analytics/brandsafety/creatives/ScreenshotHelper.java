package com.safedk.android.analytics.brandsafety.creatives;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.safedk.android.SafeDK;
import com.safedk.android.utils.Logger;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class ScreenshotHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62046a = "ScreenshotHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ScheduledExecutorService f62047b = Executors.newScheduledThreadPool(1);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public static class DefaultOnPixelCopyFinishedListener implements PixelCopy.OnPixelCopyFinishedListener {
        final Activity activity;
        com.safedk.android.analytics.brandsafety.c adInfo;
        Bitmap bitmap;

        private DefaultOnPixelCopyFinishedListener(Bitmap bitmap, com.safedk.android.analytics.brandsafety.c adInfo, Activity activity) {
            this.bitmap = bitmap;
            this.adInfo = adInfo;
            this.activity = activity;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int copyResult) {
            if (copyResult == 0 && this.adInfo != null) {
                com.safedk.android.analytics.brandsafety.a aVarA = SafeDK.getInstance().a(this.adInfo.f61834p);
                if (aVarA != null) {
                    Logger.d(ScreenshotHelper.f62046a, "PC finished - Calling ", this.adInfo.f61834p, " finder handleScreenshotCompleted");
                    aVarA.a(this.bitmap, this.adInfo);
                    return;
                }
                return;
            }
            Logger.d(ScreenshotHelper.f62046a, "PC finished NOT successfully. result= ", Integer.valueOf(copyResult));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public static class ImprovedOnPixelCopyFinishedListener implements PixelCopy.OnPixelCopyFinishedListener {
        private static int surfaceViewCount;
        private final com.safedk.android.analytics.brandsafety.c adInfo;
        private Bitmap bitmap;
        private final Object onPixelCopyFinishedLock;
        private final float scalingFactor;
        private final Bitmap topViewBitmap;
        private final View view;

        private ImprovedOnPixelCopyFinishedListener(Bitmap bitmap, com.safedk.android.analytics.brandsafety.c adInfo, View view, float scalingFactor, Bitmap topViewBitmap) {
            this.onPixelCopyFinishedLock = new Object();
            this.bitmap = bitmap;
            this.adInfo = adInfo;
            this.view = view;
            this.scalingFactor = scalingFactor;
            this.topViewBitmap = topViewBitmap;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00ce A[Catch: all -> 0x00d0, DONT_GENERATE, TryCatch #0 {, blocks: (B:24:0x00ce, B:23:0x00c1, B:9:0x0012, B:12:0x0022, B:14:0x0026, B:16:0x0042, B:18:0x009a, B:20:0x009e, B:15:0x0031, B:17:0x0078), top: B:31:0x0012, inners: #1 }] */
        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onPixelCopyFinished(int copyResult) {
            com.safedk.android.analytics.brandsafety.a aVarA;
            if (this.adInfo == null || this.bitmap == null) {
                Logger.d(ScreenshotHelper.f62046a, "PC finished successfully. adInfo: ", this.adInfo, ", bitmap: ", this.bitmap);
                return;
            }
            synchronized (this.onPixelCopyFinishedLock) {
                try {
                    aVarA = SafeDK.getInstance().a(this.adInfo.f61834p);
                } finally {
                }
                if (aVarA != null) {
                    if (copyResult == 0) {
                        if (this.topViewBitmap == null) {
                            surfaceViewCount = handleSurfaceViews(this.view, this.bitmap);
                        } else {
                            surfaceViewCount--;
                            ScreenshotHelper.f62047b.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.ScreenshotHelper.ImprovedOnPixelCopyFinishedListener.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    ImprovedOnPixelCopyFinishedListener.this.combineSurfaceViewAndTopViewBitmaps();
                                }
                            });
                        }
                        Logger.d(ScreenshotHelper.f62046a, "PC finished successfully. surface view count: ", Integer.valueOf(surfaceViewCount), ", bitmap: ", Integer.valueOf(this.bitmap.getWidth()), "x", Integer.valueOf(this.bitmap.getHeight()));
                    } else {
                        surfaceViewCount--;
                        Logger.d(ScreenshotHelper.f62046a, "PC finished NOT successfully. result= ", Integer.valueOf(copyResult), ", surface view count: ", Integer.valueOf(surfaceViewCount));
                    }
                    if (surfaceViewCount <= 0) {
                        surfaceViewCount = 0;
                        scaleBitmap();
                        Logger.d(ScreenshotHelper.f62046a, "PC finished - Calling ", this.adInfo.f61834p, " finder handleScreenshotCompleted");
                        aVarA.a(this.bitmap, this.adInfo);
                    }
                }
            }
        }

        private int handleSurfaceViews(View topView, Bitmap topViewBitmap) {
            if (!(topView instanceof ViewGroup)) {
                return 0;
            }
            ViewGroup viewGroup = (ViewGroup) topView;
            int iHandleSurfaceViews = 0;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof SurfaceView) {
                    Logger.d(ScreenshotHelper.f62046a, "handle SV - found: ", childAt);
                    iHandleSurfaceViews++;
                    ScreenshotHelper.a(this.adInfo, (SurfaceView) childAt, this.scalingFactor, topViewBitmap);
                } else if (childAt instanceof ViewGroup) {
                    iHandleSurfaceViews += handleSurfaceViews(childAt, topViewBitmap);
                }
            }
            return iHandleSurfaceViews;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void combineSurfaceViewAndTopViewBitmaps() {
            Logger.d(ScreenshotHelper.f62046a, "process screenshot, combine bitmap (", Integer.valueOf(this.bitmap.getWidth()), "x", Integer.valueOf(this.bitmap.getHeight()), ") with bitmap (", Integer.valueOf(this.topViewBitmap.getWidth()), "x", Integer.valueOf(this.topViewBitmap.getHeight()), ")");
            Canvas canvas = new Canvas(this.topViewBitmap);
            int[] iArr = new int[2];
            this.view.getLocationInWindow(iArr);
            canvas.drawBitmap(this.bitmap, (Rect) null, new Rect(iArr[0], iArr[1], iArr[0] + this.view.getWidth(), iArr[1] + this.view.getHeight()), (Paint) null);
        }

        private void scaleBitmap() {
            Bitmap bitmap = this.topViewBitmap;
            if (bitmap == null) {
                bitmap = this.bitmap;
            }
            Pair<Bitmap, Float> pairA = ScreenshotHelper.a(bitmap.getWidth(), bitmap.getHeight(), this.scalingFactor);
            this.bitmap = (Bitmap) pairA.first;
            float fFloatValue = ((Float) pairA.second).floatValue();
            Canvas canvas = new Canvas(this.bitmap);
            float f3 = 1.0f / fFloatValue;
            canvas.scale(f3, f3);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    public static Bitmap a(View view, int i2, com.safedk.android.analytics.brandsafety.c cVar) {
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0) {
            Logger.d(f62046a, aNrWBQYwFf.UmJ, view);
            return null;
        }
        Pair<Bitmap, Float> pairA = a(view, i2);
        Bitmap bitmap = (Bitmap) pairA.first;
        float fFloatValue = ((Float) pairA.second).floatValue();
        if (bitmap != null) {
            Canvas canvas = new Canvas(bitmap);
            float f3 = 1.0f / fFloatValue;
            canvas.scale(f3, f3);
            try {
                view.draw(canvas);
            } catch (IllegalArgumentException e2) {
                if (cVar != null) {
                    Logger.d(f62046a, "take screenshot - could not draw bit map. ad has hardware rendered view: ", cVar);
                    cVar.d("image=no,husrd");
                    return null;
                }
            }
        }
        return bitmap;
    }

    public static Pair<Bitmap, Float> a(float f3, float f4, float f5) {
        if (f5 > 0.0f) {
            f3 /= f5;
            f4 /= f5;
            Logger.d(f62046a, "create bitmap for portrait view: (", Integer.valueOf((int) f3), "x", Integer.valueOf((int) f4), "), scale: ", Float.valueOf(f5));
        } else {
            Logger.d(f62046a, "create bitmap: ", Integer.valueOf((int) f3), "x", Integer.valueOf((int) f4), ", scale: ", Float.valueOf(1.0f));
            f5 = 1.0f;
        }
        return new Pair<>(Bitmap.createBitmap((int) f3, (int) f4, Bitmap.Config.ARGB_8888), Float.valueOf(f5));
    }

    public static Pair<Bitmap, Float> a(float f3, float f4, int i2) {
        float f5 = 1.0f;
        if (i2 <= 0) {
            Logger.d(f62046a, "create bitmap: ", Integer.valueOf((int) f3), "x", Integer.valueOf((int) f4), ", scale: ", Float.valueOf(1.0f));
        } else if (f3 > f4) {
            float f6 = i2;
            if (f3 > f6) {
                f5 = f3 / f6;
                f4 = (f4 * f6) / f3;
                f3 = f6;
            }
            Logger.d(f62046a, "create bitmap for landscape view: (", Integer.valueOf((int) f3), "x", Integer.valueOf((int) f4), "), scale: ", Float.valueOf(f5));
        } else {
            float f7 = i2;
            if (f4 > f7) {
                f5 = f4 / f7;
                f3 = (f3 * f7) / f4;
                f4 = f7;
            }
            Logger.d(f62046a, "create bitmap for portrait view: (", Integer.valueOf((int) f3), "x", Integer.valueOf((int) f4), "), scale: ", Float.valueOf(f5));
        }
        return new Pair<>(Bitmap.createBitmap((int) f3, (int) f4, Bitmap.Config.ARGB_8888), Float.valueOf(f5));
    }

    private static Pair<Bitmap, Float> a(View view, int i2) {
        Logger.d(f62046a, "create bitmap of view ", view);
        return a(view.getWidth(), view.getHeight(), i2);
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void a(Activity activity, com.safedk.android.analytics.brandsafety.c cVar, View view, float f3) {
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0) {
            Logger.d(f62046a, "Cannot save view to bitmap! view: ", view);
            return;
        }
        try {
            boolean z2 = CreativeInfoManager.a(cVar.c(), AdNetworkConfiguration.SHOULD_CAPTURE_SURFACE_VIEW_WHEN_USING_PIXELCOPY, false) && SafeDK.getInstance().O();
            Bitmap bitmap = (Bitmap) a(view.getWidth(), view.getHeight(), z2 ? -1.0f : f3).first;
            if (activity != null && bitmap != null) {
                PixelCopy.OnPixelCopyFinishedListener defaultOnPixelCopyFinishedListener = new DefaultOnPixelCopyFinishedListener(bitmap, cVar, activity);
                if (z2) {
                    Logger.d(f62046a, "take screenshot using PC - support improved capturing");
                    defaultOnPixelCopyFinishedListener = new ImprovedOnPixelCopyFinishedListener(bitmap, cVar, view, f3, null);
                }
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
                Object[] objArr = new Object[8];
                objArr[0] = "take screenshot using PC - window attributes : ";
                objArr[1] = activity.getWindow() != null ? activity.getWindow().getAttributes() : "";
                objArr[2] = ", Decor View : ";
                objArr[3] = activity.getWindow() != null ? activity.getWindow().getDecorView() : "";
                objArr[4] = ", rect : ";
                objArr[5] = rect;
                objArr[6] = ", bitmap : ";
                objArr[7] = Integer.valueOf(bitmap.getHeight());
                Logger.d(f62046a, objArr);
                PixelCopy.request(activity.getWindow(), rect, bitmap, defaultOnPixelCopyFinishedListener, new Handler(Looper.getMainLooper()));
                return;
            }
            Logger.d(f62046a, "take screenshot using PC - OS API version too low : ", Integer.valueOf(Build.VERSION.SDK_INT), ", exiting");
        } catch (Throwable th) {
            Logger.d(f62046a, "take screenshot using PC - throwable on request: ", th);
        }
    }

    public static void a(com.safedk.android.analytics.brandsafety.c cVar, SurfaceView surfaceView, float f3, Bitmap bitmap) {
        if (surfaceView == null || surfaceView.getWidth() <= 0 || surfaceView.getHeight() <= 0) {
            Logger.d(f62046a, "Cannot save view to bitmap! view: ", surfaceView);
            return;
        }
        try {
            Bitmap bitmap2 = (Bitmap) a(surfaceView, 0).first;
            if (bitmap2 != null) {
                if (a()) {
                    Logger.d(f62046a, "take screenshot using PC - surface view : ", surfaceView, ", bitmap : ", Integer.valueOf(bitmap2.getHeight()));
                    PixelCopy.request(surfaceView, bitmap2, new ImprovedOnPixelCopyFinishedListener(bitmap2, cVar, surfaceView, f3, bitmap), new Handler(Looper.getMainLooper()));
                } else {
                    Logger.d(f62046a, "take screenshot using PC - OS API version too low : ", Integer.valueOf(Build.VERSION.SDK_INT), ", exiting");
                }
            }
        } catch (Throwable th) {
            Logger.d(f62046a, "take screenshot using PC - throwable on PC request: ", th);
        }
    }
}

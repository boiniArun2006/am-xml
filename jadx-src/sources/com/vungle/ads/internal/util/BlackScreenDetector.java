package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.util.BlackScreenDetector;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002J+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\u0013H\u0001¢\u0006\u0002\b\u0014J&\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\u0013H\u0002J&\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\u0013H\u0003J6\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\u0013H\u0003J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J+\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\"2\b\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0005H\u0001¢\u0006\u0002\b#J2\u0010$\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u00052\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004J\u0006\u0010%\u001a\u00020\u0007R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/util/BlackScreenDetector;", "", "()V", "callback", "Lkotlin/Function2;", "", "", "", "calculateBlackScreenPercentageWithMargin", "image", "Landroid/graphics/Bitmap;", "marginPercentage", "", "samplingFactor", "maxMarginPercentage", "captureViewBitmapAsync", "view", "Landroid/view/View;", "onComplete", "Lkotlin/Function1;", "captureViewBitmapAsync$vungle_ads_release", "captureViewWithCanvas", "captureViewWithPixelCopy", "executePixelCopyRequest", "window", "Landroid/view/Window;", "rect", "Landroid/graphics/Rect;", "bitmap", "getActivity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "processBitmapForBlackScreen", "Lkotlin/Pair;", "processBitmapForBlackScreen$vungle_ads_release", TtmlNode.START, "stop", "Companion", "vungle-ads_release", "executors", "Lcom/vungle/ads/internal/executor/Executors;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BlackScreenDetector {
    private static final int BLACK_PIXEL_THRESHOLD = 10;
    private static final double BLACK_SCREEN_MARGIN_PERCENTAGE = 0.1d;
    private static final String TAG = "BlackScreenDetector";
    private volatile Function2<? super Integer, ? super String, Unit> callback;

    /* JADX INFO: renamed from: com.vungle.ads.internal.util.BlackScreenDetector$captureViewWithPixelCopy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    static final class C19481 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Lazy<Executors> $executors$delegate;
        final /* synthetic */ Function1<Bitmap, Unit> $onComplete;
        final /* synthetic */ View $view;
        final /* synthetic */ Window $window;
        final /* synthetic */ BlackScreenDetector this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C19481(View view, Lazy<? extends Executors> lazy, BlackScreenDetector blackScreenDetector, Window window, Function1<? super Bitmap, Unit> function1) {
            super(0);
            this.$view = view;
            this.$executors$delegate = lazy;
            this.this$0 = blackScreenDetector;
            this.$window = window;
            this.$onComplete = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m302invoke$lambda0(int i2, int i3, BlackScreenDetector this$0, Window window, Rect rect, Function1 onComplete) {
            Bitmap bitmapCreateBitmap;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(rect, "$rect");
            Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                try {
                    this$0.executePixelCopyRequest(window, rect, bitmapCreateBitmap, onComplete);
                } catch (Throwable th) {
                    th = th;
                    Logger.INSTANCE.e(BlackScreenDetector.TAG, "Bitmap creation failed", th);
                    if (bitmapCreateBitmap != null) {
                        bitmapCreateBitmap.recycle();
                    }
                    onComplete.invoke(null);
                }
            } catch (Throwable th2) {
                th = th2;
                bitmapCreateBitmap = null;
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            final int width = this.$view.getWidth();
            final int height = this.$view.getHeight();
            int[] iArr = new int[2];
            this.$view.getLocationInWindow(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            final Rect rect = new Rect(i2, i3, i2 + width, i3 + height);
            VungleThreadPoolExecutor job_executor = BlackScreenDetector.m300captureViewWithPixelCopy$lambda0(this.$executors$delegate).getJOB_EXECUTOR();
            final BlackScreenDetector blackScreenDetector = this.this$0;
            final Window window = this.$window;
            final Function1<Bitmap, Unit> function1 = this.$onComplete;
            job_executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.n
                @Override // java.lang.Runnable
                public final void run() {
                    BlackScreenDetector.C19481.m302invoke$lambda0(width, height, blackScreenDetector, window, rect, function1);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.util.BlackScreenDetector$start$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    static final class C19491 extends Lambda implements Function1<Bitmap, Unit> {
        final /* synthetic */ int $samplingFactor;
        final /* synthetic */ View $view;
        final /* synthetic */ BlackScreenDetector this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C19491(View view, BlackScreenDetector blackScreenDetector, int i2) {
            super(1);
            this.$view = view;
            this.this$0 = blackScreenDetector;
            this.$samplingFactor = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
            invoke2(bitmap);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
        public static final void m304invoke$lambda1(BlackScreenDetector this$0, Bitmap bitmap, int i2) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                Pair<Integer, String> pairProcessBitmapForBlackScreen$vungle_ads_release = this$0.processBitmapForBlackScreen$vungle_ads_release(bitmap, i2);
                int iIntValue = pairProcessBitmapForBlackScreen$vungle_ads_release.component1().intValue();
                String strComponent2 = pairProcessBitmapForBlackScreen$vungle_ads_release.component2();
                Function2 function2 = this$0.callback;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(iIntValue), strComponent2);
                }
            } catch (Throwable th) {
                try {
                    Logger.INSTANCE.e(BlackScreenDetector.TAG, "Black screen detection failed", th);
                    Function2 function22 = this$0.callback;
                    if (function22 != null) {
                        function22.invoke(-1, "Internal calculation error: " + th.getMessage());
                    }
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    this$0.callback = null;
                } finally {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    this$0.callback = null;
                }
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final Bitmap bitmap) {
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            final Context context = this.$view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            VungleThreadPoolExecutor job_executor = m303invoke$lambda0(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Executors>() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$start$1$invoke$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final Executors invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(Executors.class);
                }
            })).getJOB_EXECUTOR();
            final BlackScreenDetector blackScreenDetector = this.this$0;
            final int i2 = this.$samplingFactor;
            job_executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.w6
                @Override // java.lang.Runnable
                public final void run() {
                    BlackScreenDetector.C19491.m304invoke$lambda1(blackScreenDetector, bitmap, i2);
                }
            });
        }

        /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
        private static final Executors m303invoke$lambda0(Lazy<? extends Executors> lazy) {
            return lazy.getValue();
        }
    }

    @VisibleForTesting
    public final Pair<Integer, String> processBitmapForBlackScreen$vungle_ads_release(Bitmap bitmap, int samplingFactor) {
        if (bitmap != null) {
            int iCalculateBlackScreenPercentageWithMargin$default = calculateBlackScreenPercentageWithMargin$default(this, bitmap, 0.1d, samplingFactor, 0.0d, 8, null);
            return new Pair<>(Integer.valueOf(iCalculateBlackScreenPercentageWithMargin$default), iCalculateBlackScreenPercentageWithMargin$default == -1 ? "Internal calculation error" : "");
        }
        Logger.INSTANCE.w(TAG, "Black screen detection failed: Snapshot capture failure");
        return new Pair<>(-1, "Snapshot capture failure");
    }

    public final void stop() {
        this.callback = null;
    }

    static /* synthetic */ int calculateBlackScreenPercentageWithMargin$default(BlackScreenDetector blackScreenDetector, Bitmap bitmap, double d2, int i2, double d4, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 100;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            d4 = 0.5d;
        }
        return blackScreenDetector.calculateBlackScreenPercentageWithMargin(bitmap, d2, i5, d4);
    }

    private final void captureViewWithCanvas(final View view, final Function1<? super Bitmap, Unit> onComplete) {
        ThreadUtil.INSTANCE.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.internal.util.BlackScreenDetector.captureViewWithCanvas.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                    view.draw(new Canvas(bitmapCreateBitmap));
                    onComplete.invoke(bitmapCreateBitmap);
                } catch (Throwable th) {
                    Logger.INSTANCE.e(BlackScreenDetector.TAG, "Bitmap capture failed", th);
                    onComplete.invoke(null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi
    public final void executePixelCopyRequest(Window window, Rect rect, final Bitmap bitmap, final Function1<? super Bitmap, Unit> onComplete) {
        try {
            PixelCopy.request(window, rect, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.vungle.ads.internal.util.j
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i2) {
                    BlackScreenDetector.m301executePixelCopyRequest$lambda1(onComplete, bitmap, i2);
                }
            }, new Handler(Looper.getMainLooper()));
        } catch (Throwable th) {
            Logger.INSTANCE.e(TAG, "PixelCopy request failed", th);
            bitmap.recycle();
            onComplete.invoke(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executePixelCopyRequest$lambda-1, reason: not valid java name */
    public static final void m301executePixelCopyRequest$lambda1(Function1 onComplete, Bitmap bitmap, int i2) {
        Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        if (i2 == 0) {
            onComplete.invoke(bitmap);
            return;
        }
        Logger.INSTANCE.w(TAG, "PixelCopy failed: " + i2);
        bitmap.recycle();
        onComplete.invoke(null);
    }

    private final Activity getActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    @VisibleForTesting
    public final void captureViewBitmapAsync$vungle_ads_release(View view, Function1<? super Bitmap, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        if (this.callback == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            captureViewWithPixelCopy(view, onComplete);
        } else {
            captureViewWithCanvas(view, onComplete);
        }
    }

    public final void start(View view, int samplingFactor, Function2<? super Integer, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        if (view != null) {
            captureViewBitmapAsync$vungle_ads_release(view, new C19491(view, this, samplingFactor));
            return;
        }
        Logger.INSTANCE.w(TAG, "Black screen detection failed: View not available");
        Function2<? super Integer, ? super String, Unit> function2 = this.callback;
        if (function2 != null) {
            function2.invoke(-1, "View not available");
        }
        this.callback = null;
    }

    private final int calculateBlackScreenPercentageWithMargin(Bitmap image, double marginPercentage, int samplingFactor, double maxMarginPercentage) {
        int i2;
        int width = image.getWidth();
        int height = image.getHeight();
        int i3 = (int) (((double) width) * marginPercentage);
        int i5 = (int) (((double) height) * marginPercentage);
        int i7 = width - (i3 * 2);
        int i8 = height - (i5 * 2);
        if (i7 <= 0 || i8 <= 0) {
            return -1;
        }
        long j2 = ((long) i7) * ((long) i8);
        if (j2 > 2147483647L) {
            if (marginPercentage >= maxMarginPercentage) {
                return -1;
            }
            return calculateBlackScreenPercentageWithMargin(image, marginPercentage * ((double) 2), samplingFactor, maxMarginPercentage);
        }
        int i9 = (int) j2;
        int[] iArr = new int[i9];
        image.getPixels(iArr, 0, i7, i3, i5, i7, i8);
        int i10 = i9 - 1;
        if (samplingFactor > 0) {
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, i10, samplingFactor);
            int i11 = 0;
            if (progressionLastElement >= 0) {
                int i12 = 0;
                i2 = 0;
                while (true) {
                    i11++;
                    int i13 = iArr[i12];
                    int i14 = (i13 >> 24) & 255;
                    int i15 = (i13 >> 16) & 255;
                    int i16 = (i13 >> 8) & 255;
                    int i17 = i13 & 255;
                    if (i14 > 0 && i15 < 10 && i16 < 10 && i17 < 10) {
                        i2++;
                    }
                    if (i12 == progressionLastElement) {
                        break;
                    }
                    i12 += samplingFactor;
                }
            } else {
                i2 = 0;
            }
            if (i11 <= 0) {
                return 0;
            }
            return (int) ((((long) i2) * ((long) 100)) / ((long) i11));
        }
        throw new IllegalArgumentException("Step must be positive, was: " + samplingFactor + '.');
    }

    @RequiresApi
    private final void captureViewWithPixelCopy(View view, Function1<? super Bitmap, Unit> onComplete) {
        Window window;
        Activity activity = getActivity(view.getContext());
        if (activity != null) {
            window = activity.getWindow();
        } else {
            window = null;
        }
        if (window == null) {
            Logger.INSTANCE.w(TAG, "Activity/Window not found for PixelCopy");
            onComplete.invoke(null);
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        ThreadUtil.INSTANCE.runOnUiThread(new C19481(view, LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<Executors>() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$captureViewWithPixelCopy$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Executors invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(Executors.class);
            }
        }), this, window, onComplete));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: captureViewWithPixelCopy$lambda-0, reason: not valid java name */
    public static final Executors m300captureViewWithPixelCopy$lambda0(Lazy<? extends Executors> lazy) {
        return lazy.getValue();
    }
}

package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.sdk.AppLovinSdkUtils;
import d8q.jqQ.QTafcm;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f48630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f48631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f48632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f48633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f48634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f48635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f48636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f48637i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f48639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f48640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f48641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f48642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f48643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Handler f48644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private HandlerThread f48645q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f48647s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference f48638j = new WeakReference(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f48646r = new Runnable() { // from class: com.applovin.impl.kO4
        @Override // java.lang.Runnable
        public final void run() {
            this.f48829n.a();
        }
    };

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class a implements d {
        @Override // com.applovin.impl.h0.d
        public void a(Bitmap bitmap) {
            try {
                h0.a(h0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i2 = width / h0.this.f48635g;
                int i3 = height / h0.this.f48635g;
                int i5 = i2 / 2;
                for (int i7 = i3 / 2; i7 < height; i7 += i3) {
                    for (int i8 = i5; i8 < width; i8 += i2) {
                        int pixel = bitmap.getPixel(i8, i7);
                        if (h0.this.a(pixel)) {
                            bitmap.recycle();
                            h0.this.j();
                            h0.this.g();
                            return;
                        }
                        if (h0.this.f48641m == null) {
                            h0.this.f48641m = Integer.valueOf(pixel);
                        }
                    }
                }
                h0.f(h0.this);
                bitmap.recycle();
                h0.this.g();
            } catch (Exception e2) {
                h0.this.f48629a.D().a("BlackViewDetector", "onScreenshotCaptured", e2);
                h0.this.k();
            }
        }

        a() {
        }

        @Override // com.applovin.impl.h0.d
        public void a(boolean z2) {
            if (z2) {
                h0.this.k();
            } else {
                h0.this.g();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f48649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f48650b;

        b(d dVar, Bitmap bitmap) {
            this.f48649a = dVar;
            this.f48650b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i2) {
            if (i2 == 0) {
                this.f48649a.a(this.f48650b);
                return;
            }
            C1804o unused = h0.this.f48630b;
            if (C1804o.a()) {
                h0.this.f48630b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i2);
            }
            this.f48649a.a(true);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public interface c {
        void a(int i2, int i3);

        void a(int i2, int i3, int i5);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private interface d {
        void a(Bitmap bitmap);

        void a(boolean z2);
    }

    static /* synthetic */ int a(h0 h0Var) {
        int i2 = h0Var.f48640l;
        h0Var.f48640l = i2 + 1;
        return i2;
    }

    static /* synthetic */ int f(h0 h0Var) {
        int i2 = h0Var.f48639k;
        h0Var.f48639k = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f48639k = 0;
        this.f48641m = null;
    }

    private void c() {
        if (this.f48639k >= this.f48634f && !this.f48643o) {
            this.f48643o = true;
            h();
        }
        if (this.f48639k < this.f48633e || this.f48642n) {
            return;
        }
        this.f48642n = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.f48647s;
        if (cVar != null) {
            cVar.a(this.f48633e, this.f48639k, this.f48640l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        c cVar = this.f48647s;
        if (cVar != null) {
            cVar.a(this.f48639k, this.f48640l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f48647s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f48631c <= 0) {
            if (this.f48639k == 1) {
                if (!this.f48643o) {
                    this.f48643o = true;
                    h();
                }
                if (!this.f48642n) {
                    this.f48642n = true;
                    i();
                }
            }
            k();
            return;
        }
        c();
        if (this.f48644p == null) {
            if (C1804o.a()) {
                this.f48630b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            k();
        } else if (this.f48642n && this.f48643o) {
            k();
        } else {
            this.f48644p.postDelayed(this.f48646r, this.f48631c);
        }
    }

    private void h() {
        View view = (View) this.f48638j.get();
        if (C1804o.a()) {
            this.f48630b.k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.hQ
            @Override // java.lang.Runnable
            public final void run() {
                this.f48674n.d();
            }
        });
    }

    private void i() {
        View view = (View) this.f48638j.get();
        if (C1804o.a()) {
            this.f48630b.k(QTafcm.UvOGoRIkPj, "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.RzR
            @Override // java.lang.Runnable
            public final void run() {
                this.f47824n.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f48638j.get() != null) {
            if (C1804o.a()) {
                this.f48630b.a("BlackViewDetector", "Stopped monitoring view: " + this.f48638j.get());
            }
            this.f48638j.clear();
        }
        Handler handler = this.f48644p;
        if (handler != null) {
            handler.removeCallbacks(this.f48646r);
            this.f48644p = null;
        }
        if (this.f48647s != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.pq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49710n.f();
                }
            });
        }
    }

    public void b() {
        k();
        HandlerThread handlerThread = this.f48645q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f48645q = null;
        }
    }

    public h0(C1802k c1802k) {
        this.f48629a = c1802k;
        this.f48630b = c1802k.O();
        this.f48631c = ((Long) c1802k.a(x4.j6)).longValue();
        this.f48632d = ((Long) c1802k.a(x4.f50824i6)).longValue();
        this.f48635g = ((Integer) c1802k.a(x4.f50827k6)).intValue();
        this.f48636h = ((Integer) c1802k.a(x4.l6)).intValue();
        this.f48637i = ((Integer) c1802k.a(x4.m6)).intValue();
        this.f48633e = ((Integer) c1802k.a(x4.s6)).intValue();
        this.f48634f = ((Integer) c1802k.a(x4.t6)).intValue();
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f48629a.a(x4.h6)).booleanValue()) {
            View view2 = (View) this.f48638j.get();
            if (view2 != null) {
                if (C1804o.a()) {
                    this.f48630b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (C1804o.a()) {
                this.f48630b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f48645q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f48645q = handlerThread;
                    handlerThread.start();
                } else {
                    this.f48629a.D().a(d2.L0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    k();
                }
                this.f48647s = cVar;
                this.f48638j = new WeakReference(view);
                j();
                this.f48642n = false;
                this.f48643o = false;
                Handler handler = new Handler(this.f48645q.getLooper());
                this.f48644p = handler;
                handler.postDelayed(this.f48646r, this.f48632d);
            } catch (Throwable th) {
                k();
                this.f48629a.D().a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo memoryInfoA;
        View view = (View) this.f48638j.get();
        if (view == null) {
            if (C1804o.a()) {
                this.f48630b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            k();
            return;
        }
        Long l2 = (Long) this.f48629a.a(x4.q6);
        if (l2.longValue() > 0 && (memoryInfoA = n7.a((ActivityManager) C1802k.o().getSystemService("activity"))) != null && memoryInfoA.availMem < l2.longValue()) {
            if (C1804o.a()) {
                this.f48630b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (this.f48629a.m0().isApplicationPaused()) {
            if (C1804o.a()) {
                this.f48630b.a("BlackViewDetector", "App is backgrounded - skipping black view detection");
            }
            j();
            g();
            return;
        }
        if (C1804o.a()) {
            this.f48630b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (C1804o.a()) {
            this.f48630b.k("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
        }
        j();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(int i2) {
        boolean z2;
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        Integer num = this.f48641m;
        if (num != null) {
            z2 = Math.abs(iRed - Color.red(num.intValue())) > this.f48637i || Math.abs(iGreen - Color.green(this.f48641m.intValue())) > this.f48637i || Math.abs(iBlue - Color.blue(this.f48641m.intValue())) > this.f48637i;
        }
        int i3 = this.f48636h;
        return iRed > i3 || iGreen > i3 || iBlue > i3 || z2;
    }

    private void a(View view, d dVar) {
        if (o0.g()) {
            Activity activityA = this.f48629a.e().a();
            if (activityA == null) {
                if (C1804o.a()) {
                    this.f48630b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            Rect rect = new Rect(i2, i3, i2 + measuredWidth, i3 + measuredHeight);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
                return;
            } catch (Throwable th) {
                if (C1804o.a()) {
                    this.f48630b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.a(true);
                return;
            }
        }
        if (C1804o.a()) {
            this.f48630b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}

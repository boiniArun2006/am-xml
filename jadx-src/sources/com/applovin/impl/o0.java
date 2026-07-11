package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.impl.sdk.C1802k;
import com.applovin.sdk.AppLovinSdkUtils;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f49511a = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f49512b = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f49513c = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f49514d = new HashMap(2);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f49515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f49516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f49518d;

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a(this) && b() == aVar.b() && d() == aVar.d() && c() == aVar.c() && a() == aVar.a();
        }

        public int a() {
            return this.f49518d;
        }

        public int b() {
            return this.f49515a;
        }

        public int c() {
            return this.f49517c;
        }

        public int d() {
            return this.f49516b;
        }

        public Map e() {
            HashMap map = new HashMap();
            map.put(TtmlNode.LEFT, Integer.valueOf(this.f49515a));
            map.put("top", Integer.valueOf(this.f49516b));
            map.put(TtmlNode.RIGHT, Integer.valueOf(this.f49517c));
            map.put("bottom", Integer.valueOf(this.f49518d));
            return map;
        }

        public String toString() {
            return "CompatibilityUtils.Insets(left=" + b() + ", top=" + d() + ", right=" + c() + ", bottom=" + a() + ")";
        }

        public a(int i2, int i3, int i5, int i7) {
            this.f49515a = i2;
            this.f49516b = i3;
            this.f49517c = i5;
            this.f49518d = i7;
        }

        public static a a(Insets insets) {
            return new a(insets.left, insets.top, insets.right, insets.bottom);
        }

        public int hashCode() {
            return ((((((b() + 59) * 59) + d()) * 59) + c()) * 59) + a();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f49519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f49520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f49522d;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f49523a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f49524b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f49525c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f49526d;

            public a a(int i2) {
                this.f49525c = i2;
                return this;
            }

            public b a() {
                return new b(this.f49523a, this.f49524b, this.f49525c, this.f49526d);
            }

            public a b(int i2) {
                this.f49526d = i2;
                return this;
            }

            public a c(int i2) {
                this.f49523a = i2;
                return this;
            }

            public a d(int i2) {
                this.f49524b = i2;
                return this;
            }

            public String toString() {
                return "CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=" + this.f49523a + ", topRight=" + this.f49524b + ", bottomLeft=" + this.f49525c + ", bottomRight=" + this.f49526d + ")";
            }

            a() {
            }
        }

        protected boolean a(Object obj) {
            return obj instanceof b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a(this) && c() == bVar.c() && d() == bVar.d() && a() == bVar.a() && b() == bVar.b();
        }

        public int a() {
            return this.f49521c;
        }

        public int b() {
            return this.f49522d;
        }

        public int c() {
            return this.f49519a;
        }

        public int d() {
            return this.f49520b;
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + jhotmBbwMbr.dskGCjNG + b() + ")";
        }

        b(int i2, int i3, int i5, int i7) {
            this.f49519a = i2;
            this.f49520b = i3;
            this.f49521c = i5;
            this.f49522d = i7;
        }

        public int hashCode() {
            return ((((((c() + 59) * 59) + d()) * 59) + a()) * 59) + b();
        }
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static Point b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        C1802k c1802k = C1802k.C0;
        boolean z2 = c1802k == null || ((Boolean) c1802k.a(x4.E6)).booleanValue();
        if (!c(context) || z2) {
            Map map = f49514d;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = 480;
        point.y = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        WindowManager windowManagerF = n7.f(context);
        if (windowManagerF != null) {
            Display defaultDisplay = windowManagerF.getDefaultDisplay();
            if (b()) {
                Rect bounds = windowManagerF.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else {
                defaultDisplay.getRealSize(point);
            }
        }
        f49514d.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return true;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static a c(WindowInsets windowInsets, C1802k c1802k) {
        if (c1802k == null || !((Boolean) c1802k.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.statusBars()));
    }

    public static Point a(Context context) {
        Display defaultDisplay = n7.f(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static Map c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f49512b.get(str);
    }

    public static a a(WindowInsets windowInsets, C1802k c1802k) {
        if (c1802k == null || !((Boolean) c1802k.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.displayCutout());
        return new a(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
    }

    public static void c(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f49512b.put(str, aVar.e());
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static Map a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f49511a.get(str);
    }

    public static void a(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f49511a.put(str, aVar.e());
    }

    public static a b(WindowInsets windowInsets, C1802k c1802k) {
        if (c1802k == null || !((Boolean) c1802k.a(x4.E4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars()));
    }

    public static b a(Context context, C1802k c1802k) {
        WindowManager windowManagerF;
        if (((Boolean) c1802k.a(x4.Y3)).booleanValue() && k() && (windowManagerF = n7.f(context)) != null) {
            try {
                Display defaultDisplay = windowManagerF.getDefaultDisplay();
                return new b.a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Map b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f49513c.get(str);
    }

    public static void b(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f49513c.put(str, aVar.e());
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static int a(int i2, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i2);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}

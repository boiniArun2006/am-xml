package com.applovin.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class AppLovinSdkUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f51163a = new Handler(Looper.getMainLooper());

    public static final class Size {
        public static final Size ZERO = new Size(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f51164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f51165b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Size)) {
                return false;
            }
            Size size = (Size) obj;
            return this.f51164a == size.getWidth() && this.f51165b == size.getHeight();
        }

        public int getHeight() {
            return this.f51165b;
        }

        public int getWidth() {
            return this.f51164a;
        }

        public int hashCode() {
            int i2 = this.f51165b;
            int i3 = this.f51164a;
            return i2 ^ ((i3 >>> 16) | (i3 << 16));
        }

        public String toString() {
            return this.f51164a + "x" + this.f51165b;
        }

        public Size(int i2, int i3) {
            this.f51164a = i2;
            this.f51165b = i3;
        }
    }

    @Dimension
    public static int dpToPx(Context context, @Dimension int i2) {
        return (int) TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    @Dimension
    public static int pxToDp(Context context, @Dimension int i2) {
        return (int) Math.ceil(i2 / context.getResources().getDisplayMetrics().density);
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(false, runnable);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j2) {
        runOnUiThreadDelayed(runnable, j2, f51163a);
    }

    public static int getOrientation(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    public static boolean isEmulator() {
        return a(Build.DEVICE, "goldfish,vbox") || a(Build.HARDWARE, "ranchu,generic,vbox") || a(Build.MANUFACTURER, "Genymotion") || a(Build.MODEL, "Android SDK built for x86");
    }

    public static boolean isFireOS(Context context) {
        return "amazon".equalsIgnoreCase(Build.MANUFACTURER) || isFireTv(context);
    }

    public static boolean isSdkVersionGreaterThanOrEqualTo(String str) {
        return AppLovinSdk.VERSION_CODE >= n7.g(str);
    }

    public static void runOnUiThread(boolean z2, Runnable runnable) {
        if (z2 || !n7.i()) {
            f51163a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j2, Handler handler) {
        if (j2 > 0) {
            handler.postDelayed(runnable, j2);
        } else if (n7.i()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    private static boolean a(String str, String str2) {
        return StringUtils.startsWithAtLeastOnePrefix(str, CollectionUtils.explode(str2));
    }

    public static boolean isFireTv(Context context) {
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static boolean isInclusiveVersion(String str, @Nullable String str2, @Nullable String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int iG = n7.g(str);
        if (str2 != null && iG < n7.g(str2)) {
            return false;
        }
        if (str3 == null || iG <= n7.g(str3)) {
            return true;
        }
        return false;
    }

    public static boolean isTablet(Context context) {
        Point pointB = o0.b(context);
        if (Math.min(pointB.x, pointB.y) >= dpToPx(context, Sdk.SDKError.Reason.NATIVE_ASSET_ERROR_VALUE)) {
            return true;
        }
        return false;
    }

    public static boolean isTv(Context context) {
        if (isFireTv(context)) {
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        if (o0.d()) {
            return packageManager.hasSystemFeature("android.software.leanback");
        }
        return packageManager.hasSystemFeature("android.hardware.type.television");
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static void setImageUrl(String str, ImageView imageView, AppLovinSdk appLovinSdk) {
        ImageViewUtils.setImageUri(imageView, Uri.parse(str), appLovinSdk.a());
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        return JsonUtils.toStringMap(jSONObject);
    }
}

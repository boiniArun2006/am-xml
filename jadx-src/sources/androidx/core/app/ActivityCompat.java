package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.ContextCompat;
import com.safedk.android.utils.Logger;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ActivityCompat extends ContextCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static PermissionCompatDelegate f36203n;

    /* JADX INFO: renamed from: androidx.core.app.ActivityCompat$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f36204O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String[] f36205n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Activity f36206t;

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f36205n.length];
            PackageManager packageManager = this.f36206t.getPackageManager();
            String packageName = this.f36206t.getPackageName();
            int length = this.f36205n.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.f36205n[i2], packageName);
            }
            ((OnRequestPermissionsResultCallback) this.f36206t).onRequestPermissionsResult(this.f36204O, this.f36205n, iArr);
        }
    }

    @RequiresApi
    static class Api22Impl {
    }

    @RequiresApi
    static class Api23Impl {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static void n(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void rl(Activity activity, String[] strArr, int i2) {
            activity.requestPermissions(strArr, i2);
        }

        static boolean t(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    @RequiresApi
    static class Api28Impl {
    }

    @RequiresApi
    static class Api30Impl {
    }

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    public interface PermissionCompatDelegate {
        boolean n(Activity activity, String[] strArr, int i2);
    }

    @RestrictTo
    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i2);
    }

    @RequiresApi
    static class SharedElementCallback21Impl extends android.app.SharedElementCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SharedElementCallback f36207n;

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f36207n.rl(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f36207n.t(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List list, Map map) {
            this.f36207n.nr(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List list) {
            this.f36207n.O(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List list, List list2, List list3) {
            this.f36207n.J2(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List list, List list2, List list3) {
            this.f36207n.Uo(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List list, List list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f36207n.KN(list, list2, new SharedElementCallback.OnSharedElementsReadyListener() { // from class: androidx.core.app.n
                @Override // androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener
                public final void n() {
                    ActivityCompat.Api23Impl.n(onSharedElementsReadyListener);
                }
            });
        }

        SharedElementCallback21Impl(SharedElementCallback sharedElementCallback) {
            this.f36207n = sharedElementCallback;
        }
    }

    public static void safedk_Activity_startActivityForResult_9f44e908bf9d747fc527dbfa22dc7b4d(Activity p0, Intent p1, int p2, Bundle p3) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2, p3);
    }

    @RequiresApi
    static class Api21Impl {
        static void O(Activity activity) {
            activity.startPostponedEnterTransition();
        }

        static void n(Activity activity) {
            activity.finishAfterTransition();
        }

        static void nr(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void rl(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void t(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }
    }

    @RequiresApi
    static class Api31Impl {
        static boolean n(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    @RequiresApi
    static class Api32Impl {
        static boolean n(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J2(Activity activity, String[] strArr, int i2) {
        PermissionCompatDelegate permissionCompatDelegate = f36203n;
        if (permissionCompatDelegate == null || !permissionCompatDelegate.n(activity, strArr, i2)) {
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (TextUtils.isEmpty(strArr[i3])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i5 = 0;
                for (int i7 = 0; i7 < strArr.length; i7++) {
                    if (!hashSet.contains(Integer.valueOf(i7))) {
                        strArr2[i5] = strArr[i7];
                        i5++;
                    }
                }
            }
            if (activity instanceof RequestPermissionsRequestCodeValidator) {
                ((RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i2);
            }
            Api23Impl.rl(activity, strArr, i2);
        }
    }

    public static void KN(Activity activity, SharedElementCallback sharedElementCallback) {
        Api21Impl.nr(activity, sharedElementCallback != null ? new SharedElementCallback21Impl(sharedElementCallback) : null);
    }

    public static void O(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.j
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityCompat.n(activity);
                }
            });
        }
    }

    public static void Uo(Activity activity, SharedElementCallback sharedElementCallback) {
        Api21Impl.t(activity, sharedElementCallback != null ? new SharedElementCallback21Impl(sharedElementCallback) : null);
    }

    public static boolean xMQ(Activity activity, String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i2 >= 32 ? Api32Impl.n(activity, str) : i2 == 31 ? Api31Impl.n(activity, str) : Api23Impl.t(activity, str);
        }
        return false;
    }

    public static void gh(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i5, int i7, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i2, intent, i3, i5, i7, bundle);
    }

    public static void mUb(Activity activity, Intent intent, int i2, Bundle bundle) {
        safedk_Activity_startActivityForResult_9f44e908bf9d747fc527dbfa22dc7b4d(activity, intent, i2, bundle);
    }

    public static /* synthetic */ void n(Activity activity) {
        if (!activity.isFinishing() && !ActivityRecreator.xMQ(activity)) {
            activity.recreate();
        }
    }

    public static void nr(Activity activity) {
        Api21Impl.rl(activity);
    }

    public static void qie(Activity activity) {
        Api21Impl.O(activity);
    }

    public static void rl(Activity activity) {
        activity.finishAffinity();
    }

    public static void t(Activity activity) {
        Api21Impl.n(activity);
    }
}

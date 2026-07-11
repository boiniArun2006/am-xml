package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class NavUtils {
    public static boolean J2(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    public static void O(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    public static Intent n(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strT = t(activity);
        if (strT == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strT);
        try {
            if (nr(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strT + "' in manifest");
            return null;
        }
    }

    public static String nr(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        int i2;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i2 = 269222528;
        } else {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static Intent rl(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strNr = nr(context, componentName);
        if (strNr == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strNr);
        if (nr(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String t(Activity activity) {
        try {
            return nr(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}

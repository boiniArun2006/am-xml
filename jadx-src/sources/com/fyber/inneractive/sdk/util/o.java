package com.fyber.inneractive.sdk.util;

import android.app.Application;
import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.zpl;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.vungle.ads.internal.protos.Sdk;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Application f57018a;

    public static void a() {
    }

    public static int b(int i2) {
        return (int) (((IAConfigManager.f53260M.f53295u.a().getResources().getConfiguration().densityDpi / 160.0f) * i2) + 0.5f);
    }

    public static int c() {
        Application application = f57018a;
        int i2 = (application == null || application.getResources() == null || application.getResources().getConfiguration() == null) ? 1 : application.getResources().getConfiguration().orientation;
        try {
            if (Settings.System.getInt(application.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                i2 = 1;
            }
        } catch (Throwable th) {
            IAlog.a("failed getOrientation. returning portrait orientation", th, new Object[0]);
        }
        IAlog.a("The device orientation: %s", i2 == 1 ? "portrait" : "landscape");
        return i2;
    }

    public static int d() {
        int i2;
        WindowManager windowManager;
        Display defaultDisplay;
        if (f57018a == null || (windowManager = (WindowManager) IAConfigManager.f53260M.f53295u.a().getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            i2 = -1;
        } else {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i2 = point.y;
        }
        if (i2 != -1) {
            return i2;
        }
        try {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics != null) {
                i2 = displayMetrics.heightPixels;
            }
        } catch (Throwable unused) {
        }
        if (i2 == -1) {
            return 480;
        }
        return i2;
    }

    public static int e() {
        int i2;
        WindowManager windowManager;
        Display defaultDisplay;
        if (f57018a == null || (windowManager = (WindowManager) IAConfigManager.f53260M.f53295u.a().getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            i2 = -1;
        } else {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i2 = point.x;
        }
        if (i2 != -1) {
            return i2;
        }
        try {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics != null) {
                i2 = displayMetrics.widthPixels;
            }
        } catch (Throwable unused) {
        }
        return i2 == -1 ? Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE : i2;
    }

    public static void f() {
    }

    public static void g() {
    }

    public static String h() {
        IAConfigManager iAConfigManager;
        int i2 = 0;
        while (true) {
            iAConfigManager = IAConfigManager.f53260M;
            if (!iAConfigManager.f53298x.f57033a.get() || iAConfigManager.f53298x.f57036d.compareAndSet(true, true) || i2 >= 25) {
                break;
            }
            IAlog.a("UserAgentProvider | waiting on user agent", new Object[0]);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            i2++;
        }
        return iAConfigManager.f53298x.a();
    }

    public static boolean a(String str) {
        return f57018a.checkCallingOrSelfPermission(str) == 0;
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static int b() {
        return ((WindowManager) IAConfigManager.f53260M.f53295u.a().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static int a(int i2) {
        return Math.round(((IAConfigManager.f53260M.f53295u.a().getResources().getConfiguration().densityDpi / 160.0f) * i2) + 0.5f);
    }

    public static int c(int i2) {
        try {
            return (int) ((i2 / (IAConfigManager.f53260M.f53295u.a().getResources().getConfiguration().densityDpi / 160.0f)) + 0.5f);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String b(String str) {
        String string = (String) n.f57013a.get(str);
        if (TextUtils.isEmpty(string)) {
            IAlog.a("Assets cache: reading file: %s", str);
            try {
                InputStream inputStreamOpen = f57018a.getAssets().open(str, 3);
                StringBuffer stringBuffer = new StringBuffer();
                byte[] bArr = new byte[4096];
                for (int i2 = 0; i2 != -1; i2 = inputStreamOpen.read(bArr)) {
                    stringBuffer.append(new String(bArr, 0, i2));
                }
                inputStreamOpen.close();
                string = stringBuffer.toString();
                IAlog.a("Assets cache: success - %s", str);
            } catch (IOException e2) {
                IAlog.a("Assets cache: Could not read response from file", new Object[0]);
                IAlog.e(v.b(e2), new Object[0]);
            }
            if (!TextUtils.isEmpty(string)) {
                n.f57013a.put(str, string);
            }
            return string;
        }
        IAlog.a("Assets cache: returning cached assets for %s", str);
        return string;
    }

    public static int a(float f3) {
        return (int) (TypedValue.applyDimension(1, f3, IAConfigManager.f53260M.f53295u.a().getResources().getDisplayMetrics()) + 0.5f);
    }

    public static Drawable d(int i2) {
        return IAConfigManager.f53260M.f53295u.a().getDrawable(i2);
    }

    public static String a(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT >= 26) {
            return zpl.n(",", arrayList);
        }
        return TextUtils.join(",", arrayList);
    }

    public static void a(Context context, byte[] bArr) {
        FileOutputStream fileOutputStreamOpenFileOutput;
        try {
            fileOutputStreamOpenFileOutput = context.openFileOutput("session_details.json", 0);
        } catch (Throwable unused) {
            fileOutputStreamOpenFileOutput = null;
        }
        try {
            fileOutputStreamOpenFileOutput.write(bArr);
            fileOutputStreamOpenFileOutput.flush();
        } catch (Throwable unused2) {
            try {
                IAlog.a("writeFileWithContext failed writing %s", "session_details.json");
            } finally {
                v.a(fileOutputStreamOpenFileOutput);
            }
        }
    }

    public static String a(Context context) {
        if (context != null) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr.length > 0) {
                    Signature signature = signatureArr[0];
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(signature.toByteArray());
                    byte[] bArrDigest = messageDigest.digest();
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : bArrDigest) {
                        String hexString = Integer.toHexString(b2 & UByte.MAX_VALUE);
                        if (hexString.length() == 1) {
                            sb.append("0");
                        }
                        sb.append(hexString);
                    }
                    return sb.toString();
                }
                return "";
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static void a(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i2;
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = i2;
        } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (i2 == 17) {
                layoutParams2.addRule(13);
            } else {
                int i3 = i2 & 7;
                if (i3 == 1) {
                    layoutParams2.addRule(14);
                } else if (i3 == 3) {
                    layoutParams2.addRule(9);
                } else if (i3 == 5) {
                    layoutParams2.addRule(11);
                }
                int i5 = i2 & 112;
                if (i5 == 16) {
                    layoutParams2.addRule(15);
                } else if (i5 == 48) {
                    layoutParams2.addRule(10);
                } else if (i5 == 80) {
                    layoutParams2.addRule(12);
                }
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public static Context a(View view) {
        if (view != null) {
            return view.getContext();
        }
        return f57018a;
    }
}

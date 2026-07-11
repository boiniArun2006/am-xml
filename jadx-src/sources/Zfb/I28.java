package Zfb;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f12559n = new I28();
    private static final String rl = I28.class.getCanonicalName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Class f12560t;

    public static final void n() {
        nr("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    public static final void nr(String str, String str2, String str3) {
        try {
            if (f12560t == null) {
                f12560t = f12559n.rl();
            }
            Class cls = f12560t;
            Class cls2 = null;
            if (cls == null) {
                Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
                cls = null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class cls3 = f12560t;
            if (cls3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
            } else {
                cls2 = cls3;
            }
            method.invoke(cls2, str, str2, str3);
        } catch (Exception e2) {
            Log.e(rl, "Failed to send message to Unity", e2);
        }
    }

    private final Class rl() throws ClassNotFoundException {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        Intrinsics.checkNotNullExpressionValue(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    public static final void t(String str) {
        nr("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    private I28() {
    }
}

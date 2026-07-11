package androidx.webkit.internal;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class WebViewGlueCommunicator {

    private static class LAZY_COMPAT_CONVERTER_HOLDER {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final WebkitToCompatConverter f42561n = new WebkitToCompatConverter(WebViewGlueCommunicator.nr().getWebkitToCompatConverter());
    }

    private static class LAZY_FACTORY_HOLDER {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final WebViewProviderFactory f42562n = WebViewGlueCommunicator.n();
    }

    private static Object J2() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static ClassLoader O() {
        return Build.VERSION.SDK_INT >= 28 ? ApiHelperForP.rl() : J2().getClass().getClassLoader();
    }

    public static WebViewProviderFactory nr() {
        return LAZY_FACTORY_HOLDER.f42562n;
    }

    public static WebkitToCompatConverter t() {
        return LAZY_COMPAT_CONVERTER_HOLDER.f42561n;
    }

    static WebViewProviderFactory n() {
        try {
            return new WebViewProviderFactoryAdapter((WebViewProviderFactoryBoundaryInterface) SuF.j.n(WebViewProviderFactoryBoundaryInterface.class, rl()));
        } catch (ClassNotFoundException unused) {
            return new IncompatibleApkWebViewProviderFactory();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static InvocationHandler rl() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, O()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }
}

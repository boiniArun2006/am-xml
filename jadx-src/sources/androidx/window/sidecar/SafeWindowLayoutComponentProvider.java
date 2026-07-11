package androidx.window.sidecar;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\f\u0010\bJ\u001d\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u0006*\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u0006*\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u0012\u0012\u0002\b\u0003 \u0019*\b\u0012\u0002\b\u0003\u0018\u00010\u00160\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u0012\u0012\u0002\b\u0003 \u0019*\b\u0012\u0002\b\u0003\u0018\u00010\u00160\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ'\u0010\u001d\u001a\u0012\u0012\u0002\b\u0003 \u0019*\b\u0012\u0002\b\u0003\u0018\u00010\u00160\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ'\u0010\u001e\u001a\u0012\u0012\u0002\b\u0003 \u0019*\b\u0012\u0002\b\u0003\u0018\u00010\u00160\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001bR\u001d\u0010$\u001a\u0004\u0018\u00010\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010'\u001a\u00020\u0006*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/window/layout/SafeWindowLayoutComponentProvider;", "", "<init>", "()V", "Ljava/lang/ClassLoader;", "classLoader", "", "xMQ", "(Ljava/lang/ClassLoader;)Z", "r", "ck", "ty", "Ik", "Lkotlin/Function0;", "block", "o", "(Lkotlin/jvm/functions/Function0;)Z", "Ljava/lang/reflect/Method;", "Lkotlin/reflect/KClass;", "clazz", "gh", "(Ljava/lang/reflect/Method;Lkotlin/reflect/KClass;)Z", "Ljava/lang/Class;", "mUb", "(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z", "kotlin.jvm.PlatformType", "XQ", "(Ljava/lang/ClassLoader;)Ljava/lang/Class;", "Z", "qie", "S", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "rl", "Lkotlin/Lazy;", "az", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "windowLayoutComponent", "HI", "(Ljava/lang/reflect/Method;)Z", "isPublic", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SafeWindowLayoutComponentProvider {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SafeWindowLayoutComponentProvider f42647n = new SafeWindowLayoutComponentProvider();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final Lazy windowLayoutComponent = LazyKt.lazy(new Function0<WindowLayoutComponent>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$windowLayoutComponent$2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final WindowLayoutComponent invoke() {
            ClassLoader classLoader = SafeWindowLayoutComponentProvider.class.getClassLoader();
            if (classLoader == null || !SafeWindowLayoutComponentProvider.f42647n.xMQ(classLoader)) {
                return null;
            }
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
    });

    private final boolean Ik(final ClassLoader classLoader) {
        return o(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0038  */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Boolean invoke() throws NoSuchMethodException {
                boolean z2;
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.f42647n;
                Class clsS = safeWindowLayoutComponentProvider.S(classLoader);
                Method addListenerMethod = clsS.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
                Method removeListenerMethod = clsS.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                Intrinsics.checkNotNullExpressionValue(addListenerMethod, "addListenerMethod");
                if (safeWindowLayoutComponentProvider.HI(addListenerMethod)) {
                    Intrinsics.checkNotNullExpressionValue(removeListenerMethod, "removeListenerMethod");
                    z2 = safeWindowLayoutComponentProvider.HI(removeListenerMethod);
                }
                return Boolean.valueOf(z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class S(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class XQ(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class Z(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    private final boolean ck(final ClassLoader classLoader) {
        return o(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() throws NoSuchMethodException {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.f42647n;
                boolean z2 = false;
                Method getWindowLayoutComponentMethod = safeWindowLayoutComponentProvider.Z(classLoader).getMethod("getWindowLayoutComponent", new Class[0]);
                Class windowLayoutComponentClass = safeWindowLayoutComponentProvider.S(classLoader);
                Intrinsics.checkNotNullExpressionValue(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                if (safeWindowLayoutComponentProvider.HI(getWindowLayoutComponentMethod)) {
                    Intrinsics.checkNotNullExpressionValue(windowLayoutComponentClass, "windowLayoutComponentClass");
                    if (safeWindowLayoutComponentProvider.mUb(getWindowLayoutComponentMethod, windowLayoutComponentClass)) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class qie(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    private final boolean r(final ClassLoader classLoader) {
        return o(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() throws NoSuchMethodException {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.f42647n;
                boolean z2 = false;
                Method getWindowExtensionsMethod = safeWindowLayoutComponentProvider.XQ(classLoader).getDeclaredMethod("getWindowExtensions", new Class[0]);
                Class windowExtensionsClass = safeWindowLayoutComponentProvider.Z(classLoader);
                Intrinsics.checkNotNullExpressionValue(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                Intrinsics.checkNotNullExpressionValue(windowExtensionsClass, "windowExtensionsClass");
                if (safeWindowLayoutComponentProvider.mUb(getWindowExtensionsMethod, windowExtensionsClass) && safeWindowLayoutComponentProvider.HI(getWindowExtensionsMethod)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        });
    }

    private final boolean ty(final ClassLoader classLoader) {
        return o(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() throws NoSuchMethodException {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.f42647n;
                Class clsQie = safeWindowLayoutComponentProvider.qie(classLoader);
                boolean z2 = false;
                Method getBoundsMethod = clsQie.getMethod("getBounds", new Class[0]);
                Method getTypeMethod = clsQie.getMethod("getType", new Class[0]);
                Method getStateMethod = clsQie.getMethod("getState", new Class[0]);
                Intrinsics.checkNotNullExpressionValue(getBoundsMethod, "getBoundsMethod");
                if (safeWindowLayoutComponentProvider.gh(getBoundsMethod, Reflection.getOrCreateKotlinClass(Rect.class)) && safeWindowLayoutComponentProvider.HI(getBoundsMethod)) {
                    Intrinsics.checkNotNullExpressionValue(getTypeMethod, "getTypeMethod");
                    Class cls = Integer.TYPE;
                    if (safeWindowLayoutComponentProvider.gh(getTypeMethod, Reflection.getOrCreateKotlinClass(cls)) && safeWindowLayoutComponentProvider.HI(getTypeMethod)) {
                        Intrinsics.checkNotNullExpressionValue(getStateMethod, "getStateMethod");
                        if (safeWindowLayoutComponentProvider.gh(getStateMethod, Reflection.getOrCreateKotlinClass(cls)) && safeWindowLayoutComponentProvider.HI(getStateMethod)) {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            }
        });
    }

    public final WindowLayoutComponent az() {
        return (WindowLayoutComponent) windowLayoutComponent.getValue();
    }

    private SafeWindowLayoutComponentProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean HI(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean gh(Method method, KClass kClass) {
        return mUb(method, JvmClassMappingKt.getJavaClass(kClass));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean mUb(Method method, Class cls) {
        return method.getReturnType().equals(cls);
    }

    private final boolean o(Function0 block) {
        try {
            return ((Boolean) block.invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean xMQ(ClassLoader classLoader) {
        if (r(classLoader) && ck(classLoader) && Ik(classLoader) && ty(classLoader)) {
            return true;
        }
        return false;
    }
}

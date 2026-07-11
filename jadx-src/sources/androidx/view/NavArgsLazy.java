package androidx.view;

import android.os.Bundle;
import androidx.view.NavArgs;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/navigation/NavArgsLazy;", "Landroidx/navigation/NavArgs;", "Args", "Lkotlin/Lazy;", "", "isInitialized", "()Z", "Lkotlin/reflect/KClass;", c.f62177j, "Lkotlin/reflect/KClass;", "navArgsClass", "Lkotlin/Function0;", "Landroid/os/Bundle;", "t", "Lkotlin/jvm/functions/Function0;", "argumentProducer", "O", "Landroidx/navigation/NavArgs;", "cached", "()Landroidx/navigation/NavArgs;", "value", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NavArgsLazy<Args extends NavArgs> implements Lazy<Args> {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private NavArgs cached;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final KClass navArgsClass;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function0 argumentProducer;

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.cached != null;
    }

    @Override // kotlin.Lazy
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public NavArgs getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        NavArgs navArgs = this.cached;
        if (navArgs != null) {
            return navArgs;
        }
        Bundle bundle = (Bundle) this.argumentProducer.invoke();
        Method method = (Method) NavArgsLazyKt.n().get(this.navArgsClass);
        if (method == null) {
            Class javaClass = JvmClassMappingKt.getJavaClass(this.navArgsClass);
            Class[] clsArrRl = NavArgsLazyKt.rl();
            method = javaClass.getMethod("fromBundle", (Class[]) Arrays.copyOf(clsArrRl, clsArrRl.length));
            NavArgsLazyKt.n().put(this.navArgsClass, method);
            Intrinsics.checkNotNullExpressionValue(method, "navArgsClass.java.getMet…                        }");
        }
        Object objInvoke = method.invoke(null, bundle);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        NavArgs navArgs2 = (NavArgs) objInvoke;
        this.cached = navArgs2;
        return navArgs2;
    }
}

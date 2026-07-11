package androidx.view;

import androidx.view.NavOptions;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010!\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR*\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00048\u0006@@X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R.\u0010/\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010)8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u0016\u00101\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0018R6\u00109\u001a\b\u0012\u0002\b\u0003\u0018\u0001022\f\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u0001028F@BX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R.\u0010@\u001a\u0004\u0018\u00010\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u00018F@BX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Landroidx/navigation/NavOptionsBuilder;", "", "<init>", "()V", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/PopUpToBuilder;", "", "Lkotlin/ExtensionFunctionType;", "popUpToBuilder", "t", "(ILkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/AnimBuilder;", "animBuilder", c.f62177j, "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/NavOptions;", "rl", "()Landroidx/navigation/NavOptions;", "Landroidx/navigation/NavOptions$Builder;", "Landroidx/navigation/NavOptions$Builder;", "builder", "", "Z", "getLaunchSingleTop", "()Z", "nr", "(Z)V", "launchSingleTop", "<set-?>", "getRestoreState", "Uo", "restoreState", "value", "I", "getPopUpToId", "()I", "O", "(I)V", "popUpToId", "", "Ljava/lang/String;", "getPopUpToRoute", "()Ljava/lang/String;", "J2", "(Ljava/lang/String;)V", "popUpToRoute", "inclusive", "saveState", "Lkotlin/reflect/KClass;", "KN", "Lkotlin/reflect/KClass;", "getPopUpToRouteClass", "()Lkotlin/reflect/KClass;", "setPopUpToRouteClass", "(Lkotlin/reflect/KClass;)V", "popUpToRouteClass", "xMQ", "Ljava/lang/Object;", "getPopUpToRouteObject", "()Ljava/lang/Object;", "setPopUpToRouteObject", "(Ljava/lang/Object;)V", "popUpToRouteObject", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@NavOptionsDsl
@SourceDebugExtension({"SMAP\nNavOptionsBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptionsBuilder.kt\nandroidx/navigation/NavOptionsBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
public final class NavOptionsBuilder {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean inclusive;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private KClass popUpToRouteClass;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private String popUpToRoute;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean saveState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final NavOptions.Builder builder = new NavOptions.Builder();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int popUpToId = -1;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private boolean launchSingleTop;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean restoreState;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private Object popUpToRouteObject;

    private final void J2(String str) {
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.popUpToRoute = str;
            this.inclusive = false;
        }
    }

    public final void O(int i2) {
        this.popUpToId = i2;
        this.inclusive = false;
    }

    public final void Uo(boolean z2) {
        this.restoreState = z2;
    }

    public final void n(Function1 animBuilder) {
        Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
        AnimBuilder animBuilder2 = new AnimBuilder();
        animBuilder.invoke(animBuilder2);
        this.builder.rl(animBuilder2.getEnter()).t(animBuilder2.getExit()).O(animBuilder2.getPopEnter()).J2(animBuilder2.getPopExit());
    }

    public final void nr(boolean z2) {
        this.launchSingleTop = z2;
    }

    public final NavOptions rl() {
        NavOptions.Builder builder = this.builder;
        builder.nr(this.launchSingleTop);
        builder.qie(this.restoreState);
        String str = this.popUpToRoute;
        if (str != null) {
            builder.xMQ(str, this.inclusive, this.saveState);
        } else {
            KClass kClass = this.popUpToRouteClass;
            if (kClass != null) {
                Intrinsics.checkNotNull(kClass);
                builder.mUb(kClass, this.inclusive, this.saveState);
            } else {
                Object obj = this.popUpToRouteObject;
                if (obj != null) {
                    Intrinsics.checkNotNull(obj);
                    builder.KN(obj, this.inclusive, this.saveState);
                } else {
                    builder.Uo(this.popUpToId, this.inclusive, this.saveState);
                }
            }
        }
        return builder.n();
    }

    public final void t(int id, Function1 popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        O(id);
        J2(null);
        PopUpToBuilder popUpToBuilder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(popUpToBuilder2);
        this.inclusive = popUpToBuilder2.getInclusive();
        this.saveState = popUpToBuilder2.getSaveState();
    }
}

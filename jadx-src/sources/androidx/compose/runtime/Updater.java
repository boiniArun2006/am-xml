package androidx.compose.runtime;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JI\u0010\u000f\u001a\u00020\f\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00012,\u0010\u000e\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0012\u001a\u00020\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0002\b\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b\u001f\u0010 \u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006!"}, d2 = {"Landroidx/compose/runtime/Updater;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/Composer;", "composer", c.f62177j, "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "V", "value", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "Lkotlin/ExtensionFunctionType;", "block", "O", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "nr", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "", "J2", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "", "t", "(Landroidx/compose/runtime/Composer;)I", InneractiveMediationNameConsts.OTHER, "", "rl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class Updater<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Composer composer;

    public static String J2(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    public static Composer n(Composer composer) {
        return composer;
    }

    public static boolean rl(Composer composer, Object obj) {
        return (obj instanceof Updater) && Intrinsics.areEqual(composer, ((Updater) obj).getComposer());
    }

    public static int t(Composer composer) {
        return composer.hashCode();
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final /* synthetic */ Composer getComposer() {
        return this.composer;
    }

    public boolean equals(Object obj) {
        return rl(this.composer, obj);
    }

    public int hashCode() {
        return t(this.composer);
    }

    public String toString() {
        return J2(this.composer);
    }

    public static final void O(Composer composer, Object obj, Function2 function2) {
        if (!composer.J2() && Intrinsics.areEqual(composer.iF(), obj)) {
            return;
        }
        composer.o(obj);
        composer.az(obj, function2);
    }

    public static final void nr(Composer composer, final Function1 function1) {
        if (composer.J2()) {
            composer.az(Unit.INSTANCE, new Function2<T, Unit, Unit>() { // from class: androidx.compose.runtime.Updater$init$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object obj, Unit unit) {
                    n(obj, unit);
                    return Unit.INSTANCE;
                }

                public final void n(Object obj, Unit unit) {
                    function1.invoke(obj);
                }
            });
        }
    }
}

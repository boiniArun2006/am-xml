package androidx.compose.foundation;

import GJW.C;
import GJW.h;
import GJW.vd;
import GJW.xuv;
import android.view.Surface;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015Rx\u0010\u001e\u001ad\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0016¢\u0006\u0002\b\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dRS\u0010!\u001a?\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f¢\u0006\u0002\b\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010 R)\u0010%\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\"¢\u0006\u0002\b\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "Landroidx/compose/foundation/SurfaceScope;", "LGJW/vd;", "scope", "<init>", "(LGJW/vd;)V", "Landroid/view/Surface;", "surface", "", "width", "height", "", "nr", "(Landroid/view/Surface;II)V", "t", "O", "(Landroid/view/Surface;)V", c.f62177j, "LGJW/vd;", "getScope", "()LGJW/vd;", "Lkotlin/Function5;", "Landroidx/compose/foundation/SurfaceCoroutineScope;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function5;", "onSurface", "Lkotlin/Function3;", "Lkotlin/jvm/functions/Function3;", "onSurfaceChanged", "Lkotlin/Function1;", "J2", "Lkotlin/jvm/functions/Function1;", "onSurfaceDestroyed", "LGJW/xuv;", "r", "LGJW/xuv;", "job", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
abstract class BaseAndroidExternalSurfaceState implements AndroidExternalSurfaceScope, SurfaceScope {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Function1 onSurfaceDestroyed;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Function3 onSurfaceChanged;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final vd scope;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private xuv job;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Function5 onSurface;

    public final void O(Surface surface) {
        Function1 function1 = this.onSurfaceDestroyed;
        if (function1 != null) {
            function1.invoke(surface);
        }
        xuv xuvVar = this.job;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        this.job = null;
    }

    public final void nr(Surface surface, int width, int height) {
        if (this.onSurface != null) {
            this.job = C.nr(this.scope, null, h.J2, new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this, surface, width, height, null), 1, null);
        }
    }

    public final void t(Surface surface, int width, int height) {
        Function3 function3 = this.onSurfaceChanged;
        if (function3 != null) {
            function3.invoke(surface, Integer.valueOf(width), Integer.valueOf(height));
        }
    }

    public BaseAndroidExternalSurfaceState(vd vdVar) {
        this.scope = vdVar;
    }
}

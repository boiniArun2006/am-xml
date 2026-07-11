package com.alightcreative.app.motion;

import GJW.aC;
import GJW.vd;
import IvA.Xo;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import cd.ip.ARvULgsejMmTuN;
import com.alightcreative.app.motion.scene.ImageCacheKt;
import com.applovin.sdk.AppLovinEventTypes;
import dalvik.system.ZipPathValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import kgE.fuX;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import td9.lej;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R3\u0010\"\u001a\r\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u001b0\u00198\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u000b\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010)\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/alightcreative/app/motion/AlightMotionApplication;", "Landroid/app/Application;", "<init>", "()V", "", "onCreate", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "onTrimMemory", "(I)V", "LkgE/fuX;", "O", "LkgE/fuX;", "getIapManager", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "", "J2", "Z", "()Z", "Uo", "(Z)V", "usingFirebaseEmulator", "", "Ltd9/lej;", "Lkotlin/jvm/JvmSuppressWildcards;", "r", "Ljava/util/List;", "()Ljava/util/List;", "setInitializers", "(Ljava/util/List;)V", "getInitializers$annotations", "initializers", "Landroid/app/Activity;", "value", "o", "Landroid/app/Activity;", "nr", "()Landroid/app/Activity;", "currentActivity", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class AlightMotionApplication extends Xo {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public boolean usingFirebaseEmulator;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public fuX iapManager;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public Activity currentActivity;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public List initializers;

    public static final class n implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public n() {
        }

        private final void n(Activity activity) {
            if (Intrinsics.areEqual(activity, AlightMotionApplication.this.getCurrentActivity())) {
                AlightMotionApplication.this.currentActivity = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            n(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            n(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            AlightMotionApplication.this.currentActivity = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            n(activity);
        }
    }

    @Override // IvA.Xo, android.app.Application
    public void onCreate() throws IllegalAccessException, InvocationTargetException {
        ARvULgsejMmTuN.hQu.invoke(null, this);
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f44308n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f44309t;

        public j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AlightMotionApplication.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44309t;
            if (i2 != 0) {
                if (i2 == 1) {
                    it = (Iterator) this.f44308n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                it = AlightMotionApplication.this.O().iterator();
            }
            while (it.hasNext()) {
                lej lejVar = (lej) it.next();
                this.f44308n = it;
                this.f44309t = 1;
                if (lejVar.n(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final boolean getUsingFirebaseEmulator() {
        return this.usingFirebaseEmulator;
    }

    public final List O() {
        List list = this.initializers;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("initializers");
        return null;
    }

    public final void Uo(boolean z2) {
        this.usingFirebaseEmulator = z2;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final Activity getCurrentActivity() {
        return this.currentActivity;
    }

    public static void safedk_AlightMotionApplication_onCreate_20a3da4aa53cb768cfe883e86c608ab9(AlightMotionApplication p0) {
        IvA.n.f4321n = p0;
        if (Build.VERSION.SDK_INT >= 34) {
            ZipPathValidator.clearCallback();
        }
        super.onCreate();
        aC.rl(null, p0.new j(null), 1, null);
        p0.registerActivityLifecycleCallbacks(p0.new n());
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        if (level != 10 && level != 15 && level != 80) {
            return;
        }
        ImageCacheKt.trimImageCacheMemory(true);
    }
}

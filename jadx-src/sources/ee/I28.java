package ee;

import DSG.Wre;
import android.content.Context;
import android.util.Log;
import bH.CN3;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import ee.I28;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class I28 {

    static final class j extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f63776n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f63777t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Context context, Continuation continuation) {
            super(1, continuation);
            this.f63777t = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void xMQ(AdInspectorError adInspectorError) {
            if (adInspectorError == null) {
                Log.d("AdInspector", "Ad Inspector closed.");
                return;
            }
            Log.e("AdInspector", "Error closing Ad Inspector: " + adInspectorError.getMessage());
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new j(this.f63777t, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f63776n == 0) {
                ResultKt.throwOnFailure(obj);
                MobileAds.openAdInspector(this.f63777t, new OnAdInspectorClosedListener() { // from class: ee.Ml
                    @Override // com.google.android.gms.ads.OnAdInspectorClosedListener
                    public final void onAdInspectorClosed(AdInspectorError adInspectorError) {
                        I28.j.xMQ(adInspectorError);
                    }
                });
                return Wre.j.EnumC0054j.f1447n;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void n(CN3 cn3, Context context) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        cn3.n(CN3.I28.f43224n, new Wre.j("AdMob Ad Inspector", "🕵", null, new j(context, null), 4, null));
    }
}

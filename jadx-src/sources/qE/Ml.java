package qE;

import GJW.OU;
import GJW.vd;
import ScC.FuwU.XIvb;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.content.core.DataMigration;
import com.bendingspoons.oracle.models.OracleResponse;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class Ml implements DataMigration {
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f72200n;
    private final et.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f72201t;

    /* JADX INFO: renamed from: qE.Ml$Ml, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    static final class C1113Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ml f72202O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72203n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ OracleResponse f72204t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C1113Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1113Ml(OracleResponse oracleResponse, Ml ml, Continuation continuation) {
            super(2, continuation);
            this.f72204t = oracleResponse;
            this.f72202O = ml;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C1113Ml(this.f72204t, this.f72202O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72203n == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f72204t == null && this.f72202O.Uo().getString("Setup", null) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boxing.boxBoolean(z2);
            }
            throw new IllegalStateException(XIvb.QTvZJpRofzB);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72205n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72205n == 0) {
                ResultKt.throwOnFailure(obj);
                SharedPreferences sharedPreferencesUo = Ml.this.Uo();
                Intrinsics.checkNotNullExpressionValue(sharedPreferencesUo, "access$getSharedPreferences(...)");
                SharedPreferences.Editor editorEdit = sharedPreferencesUo.edit();
                editorEdit.remove("Setup");
                editorEdit.apply();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72207n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72207n == 0) {
                ResultKt.throwOnFailure(obj);
                String string = Ml.this.Uo().getString("Setup", null);
                if (string == null) {
                    return null;
                }
                x0X.n nVarN = Ml.this.rl.n(string);
                if (!(nVarN instanceof n.C1266n)) {
                    if (nVarN instanceof n.w6) {
                        ((OracleResponse) ((n.w6) nVarN).n()).setRawBody(string);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return x0X.w6.nr(nVarN);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public Ml(Context context, et.n jsonSerializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        this.f72200n = context;
        this.rl = jsonSerializer;
        this.f72201t = LazyKt.lazy(new Function0() { // from class: qE.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ml.xMQ(this.f72372n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences Uo() {
        return (SharedPreferences) this.f72201t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences xMQ(Ml ml) {
        return ml.f72200n.getSharedPreferences("Oracle", 0);
    }

    @Override // androidx.content.core.DataMigration
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public Object t(OracleResponse oracleResponse, Continuation continuation) {
        return GJW.Dsr.Uo(OU.rl(), new w6(null), continuation);
    }

    @Override // androidx.content.core.DataMigration
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public Object n(OracleResponse oracleResponse, Continuation continuation) {
        return GJW.Dsr.Uo(OU.rl(), new C1113Ml(oracleResponse, this, null), continuation);
    }

    @Override // androidx.content.core.DataMigration
    public Object rl(Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(OU.rl(), new n(null), continuation);
        if (objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objUo;
        }
        return Unit.INSTANCE;
    }
}

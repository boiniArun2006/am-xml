package uCY;

import DSG.Wre;
import FZ.Ml;
import FZ.n;
import android.content.Context;
import bH.CN3;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: uCY.j$j, reason: collision with other inner class name */
    static final class C1220j extends SuspendLambda implements Function1 {
        final /* synthetic */ Context J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ n f74325O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74326n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f74327r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f74328t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1220j(Function1 function1, n nVar, Context context, Function1 function12, Continuation continuation) {
            super(1, continuation);
            this.f74328t = function1;
            this.f74325O = nVar;
            this.J2 = context;
            this.f74327r = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new C1220j(this.f74328t, this.f74325O, this.J2, this.f74327r, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        
            if (FZ.n.w6.n(r5, r6, r7, null, r12, 4, null) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
        
            if (FZ.n.w6.rl(r1, r2, r13, r4, r5, r7, null, r8, 32, null) != r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C1220j c1220j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f74326n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            c1220j = this;
                            Wf.j jVar = (Wf.j) obj;
                            String strN = jVar.n();
                            List listRl = jVar.rl();
                            n nVar = c1220j.f74325O;
                            Context context = c1220j.J2;
                            List listListOf = CollectionsKt.listOf(strN);
                            String string = c1220j.J2.getString(Ml.f2715n);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            String string2 = c1220j.J2.getString(Ml.rl);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            c1220j.f74326n = 4;
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    return Wre.j.EnumC0054j.f1449t;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Function1 function1 = this.f74328t;
                this.f74326n = 1;
                obj = function1.invoke(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            String str = (String) obj;
            if (!StringsKt.isBlank(str)) {
                n nVar2 = this.f74325O;
                Context context2 = this.J2;
                this.f74326n = 2;
            } else {
                c1220j = this;
                Function1 function12 = c1220j.f74327r;
                c1220j.f74326n = 3;
                obj = function12.invoke(this);
                if (obj != coroutine_suspended) {
                    Wf.j jVar2 = (Wf.j) obj;
                    String strN2 = jVar2.n();
                    List listRl2 = jVar2.rl();
                    n nVar3 = c1220j.f74325O;
                    Context context3 = c1220j.J2;
                    List listListOf2 = CollectionsKt.listOf(strN2);
                    String string3 = c1220j.J2.getString(Ml.f2715n);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    String string22 = c1220j.J2.getString(Ml.rl);
                    Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
                    c1220j.f74326n = 4;
                }
            }
            return coroutine_suspended;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C1220j) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void n(CN3 cn3, Context context, n customerSupport, Function1 emailTargetsProvider, Function1 privacyRequestUrlTemplateProvider) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customerSupport, "customerSupport");
        Intrinsics.checkNotNullParameter(emailTargetsProvider, "emailTargetsProvider");
        Intrinsics.checkNotNullParameter(privacyRequestUrlTemplateProvider, "privacyRequestUrlTemplateProvider");
        CN3.I28 i28 = CN3.I28.f43225t;
        String string = context.getString(Ml.rl);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        cn3.n(i28, new Wre.j(string, "✉️", null, new C1220j(privacyRequestUrlTemplateProvider, customerSupport, context, emailTargetsProvider, null), 4, null));
    }
}

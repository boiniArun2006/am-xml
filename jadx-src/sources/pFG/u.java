package pFG;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.InlineMarker;
import kotlin.text.StringsKt;
import ktm.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class u {

    public static final class j implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre[] f71829n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function8 f71830t;

        /* JADX INFO: renamed from: pFG.u$j$j, reason: collision with other inner class name */
        public static final class C1098j implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre[] f71831n;

            public C1098j(TFv.Wre[] wreArr) {
                this.f71831n = wreArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new Object[this.f71831n.length];
            }
        }

        public static final class n extends SuspendLambda implements Function3 {
            final /* synthetic */ Function8 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            /* synthetic */ Object f71832O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f71833n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f71834t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(Continuation continuation, Function8 function8) {
                super(3, continuation);
                this.J2 = function8;
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TFv.CN3 cn3, Object[] objArr, Continuation continuation) {
                n nVar = new n(continuation, this.J2);
                nVar.f71834t = cn3;
                nVar.f71832O = objArr;
                return nVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
            
                if (r1.rl(r14, r13) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                TFv.CN3 cn3;
                n nVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f71833n;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cn3 = (TFv.CN3) this.f71834t;
                    ResultKt.throwOnFailure(obj);
                    nVar = this;
                } else {
                    ResultKt.throwOnFailure(obj);
                    cn3 = (TFv.CN3) this.f71834t;
                    Object[] objArr = (Object[]) this.f71832O;
                    Function8 function8 = this.J2;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    Object obj7 = objArr[5];
                    Object obj8 = objArr[6];
                    this.f71834t = cn3;
                    this.f71833n = 1;
                    InlineMarker.mark(6);
                    nVar = this;
                    obj = function8.invoke(obj2, obj3, obj4, obj5, obj6, obj7, obj8, nVar);
                    InlineMarker.mark(7);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                nVar.f71834t = null;
                nVar.f71833n = 2;
            }
        }

        public j(TFv.Wre[] wreArr, Function8 function8) {
            this.f71829n = wreArr;
            this.f71830t = function8;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            TFv.Wre[] wreArr = this.f71829n;
            Object objN = teV.Dsr.n(cn3, wreArr, new C1098j(wreArr), new n(null, this.f71830t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TFv.Wre O(TFv.Wre wre, TFv.Wre wre2, TFv.Wre wre3, TFv.Wre wre4, TFv.Wre wre5, TFv.Wre wre6, TFv.Wre wre7, Function8 function8) {
        return new j(new TFv.Wre[]{wre, wre2, wre3, wre4, wre5, wre6, wre7}, function8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ktm.j J2(ktm.j jVar, Map map) {
        if (!map.containsKey(jVar.t())) {
            return jVar;
        }
        return ktm.j.rl(jVar, null, (j.C1041j) map.get(jVar.t()), null, null, null, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean KN(ktm.j jVar, String str) {
        boolean zContains;
        boolean z2;
        if (!StringsKt.contains((CharSequence) jVar.t(), (CharSequence) str, true)) {
            List listO = jVar.O();
            if (listO != null && listO.isEmpty()) {
                z2 = false;
                if (z2) {
                }
            } else {
                Iterator it = listO.iterator();
                while (it.hasNext()) {
                    String strRl = ((j.C1041j) it.next()).rl();
                    if (strRl != null) {
                        zContains = StringsKt.contains((CharSequence) strRl, (CharSequence) str, true);
                    } else {
                        zContains = false;
                    }
                    if (zContains) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
                if (z2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Uo(ktm.j jVar) {
        if (jVar.nr() != null) {
            return true;
        }
        return false;
    }
}

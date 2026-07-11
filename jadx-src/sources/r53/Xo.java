package r53;

import QmE.iF;
import com.alightcreative.importer.xml.data.XmlValidationBackend;
import ga6.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Xo implements Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final XmlValidationBackend f72845n;
    private final iF rl;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72847n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f72848t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72848t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Xo.this.n(null, this);
        }
    }

    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f72849O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72850n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, Continuation continuation) {
            super(1, continuation);
            this.f72849O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return Xo.this.new n(this.f72849O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72850n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Function2<XmlValidationBackend.ValidateXmlRequest, Continuation<? super XmlValidationBackend.ValidateXmlResponse>, Object> validateXMLBeforeImporting = Xo.this.f72845n.getValidateXMLBeforeImporting();
                XmlValidationBackend.ValidateXmlRequest validateXmlRequest = new XmlValidationBackend.ValidateXmlRequest(this.f72849O);
                this.f72850n = 1;
                obj = validateXMLBeforeImporting.invoke(validateXmlRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(((XmlValidationBackend.ValidateXmlResponse) obj).getXmlIsSafe());
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public Xo(XmlValidationBackend xmlValidationBackend, iF eventLogger) {
        Intrinsics.checkNotNullParameter(xmlValidationBackend, "xmlValidationBackend");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f72845n = xmlValidationBackend;
        this.rl = eventLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // r53.Pl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(String str, Continuation continuation) {
        j jVar;
        Xo xo;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objUo = jVar.f72848t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            n nVar = new n(str, null);
            jVar.f72847n = this;
            jVar.J2 = 1;
            objUo = x0X.w6.Uo(nVar, jVar);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            xo = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xo = (Xo) jVar.f72847n;
            ResultKt.throwOnFailure(objUo);
        }
        return M3.j.rl(M3.n.rl((x0X.n) objUo, j.w6.f67628O, j.EnumC0949j.J2, j.n.J2, null, 8, null), xo.rl);
    }
}

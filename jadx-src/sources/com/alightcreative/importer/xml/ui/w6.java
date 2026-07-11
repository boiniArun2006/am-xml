package com.alightcreative.importer.xml.ui;

import GJW.C;
import GJW.vd;
import QmE.iF;
import QmE.j;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import com.alightcreative.importer.xml.ui.Ml;
import com.alightcreative.importer.xml.ui.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qcD.nehv.Apsps;
import r53.aC;
import rWZ.QJ;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/alightcreative/importer/xml/ui/w6;", "LuW/n;", "Lcom/alightcreative/importer/xml/ui/Ml;", "Lcom/alightcreative/importer/xml/ui/n;", "Lr53/aC;", "importTemplateUseCase", "LQmE/iF;", "eventLogger", "<init>", "(Lr53/aC;LQmE/iF;)V", "", "Uo", "()V", "Landroid/net/Uri;", "uri", "", "type", "ck", "(Landroid/net/Uri;Ljava/lang/String;)V", "Lr53/aC;", "KN", "LQmE/iF;", "xMQ", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w6 extends uW.n {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    public final iF eventLogger;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    public final aC importTemplateUseCase;

    @Override // uW.w6
    public void Uo() {
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final /* synthetic */ Uri f46672O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f46673n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f46672O = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new n(this.f46672O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            n nVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46673n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    nVar = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                w6.this.mUb(Ml.j.f46665n);
                aC aCVar = w6.this.importTemplateUseCase;
                Uri uri = this.f46672O;
                this.f46673n = 1;
                nVar = this;
                obj = aC.j.t(aCVar, uri, null, nVar, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar2 = (x0X.n) obj;
            w6 w6Var = w6.this;
            boolean z2 = nVar2 instanceof n.C1266n;
            if (!z2) {
                if (nVar2 instanceof n.w6) {
                    String str = (String) ((n.w6) nVar2).n();
                    w6Var.eventLogger.n(new j.C1446t(1, 1, QJ.f73067t));
                    w6Var.xMQ(new n.C0663n(str, null));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            w6 w6Var2 = w6.this;
            if (z2) {
                ga6.j jVar = (ga6.j) ((n.C1266n) nVar2).n();
                w6Var2.eventLogger.n(j.cA.f8485n);
                String strRl = jVar.rl();
                if (strRl == null) {
                    strRl = "Unknown error.";
                }
                w6Var2.xMQ(new n.j(strRl, true));
            } else if (!(nVar2 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.importer.xml.ui.w6$w6, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    static final class C0664w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final /* synthetic */ Uri f46675O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f46676n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0664w6(Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f46675O = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new C0664w6(this.f46675O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C0664w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C0664w6 c0664w6;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46676n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    c0664w6 = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                w6.this.mUb(Ml.j.f46665n);
                aC aCVar = w6.this.importTemplateUseCase;
                Uri uri = this.f46675O;
                this.f46676n = 1;
                c0664w6 = this;
                obj = aC.j.O(aCVar, uri, null, c0664w6, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            w6 w6Var = w6.this;
            boolean z2 = nVar instanceof n.C1266n;
            if (!z2) {
                if (nVar instanceof n.w6) {
                    Pair pair = (Pair) ((n.w6) nVar).n();
                    int iIntValue = ((Number) pair.component1()).intValue();
                    w6Var.eventLogger.n(new j.C1446t(((Number) pair.component2()).intValue() + iIntValue, iIntValue, QJ.f73067t));
                    w6Var.xMQ(new n.C0663n(null, pair));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            w6 w6Var2 = w6.this;
            if (z2) {
                ga6.j jVar = (ga6.j) ((n.C1266n) nVar).n();
                w6Var2.eventLogger.n(j.cA.f8485n);
                String strRl = jVar.rl();
                if (strRl == null) {
                    strRl = "Unknown error.";
                }
                w6Var2.xMQ(new n.j(strRl, false));
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    public w6(aC aCVar, iF eventLogger) {
        Intrinsics.checkNotNullParameter(aCVar, Apsps.cJlZo);
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.importTemplateUseCase = aCVar;
        this.eventLogger = eventLogger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r12.equals("text/xml") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r12.equals("application/xml") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r0 = GJW.C.nr(androidx.view.ViewModelKt.n(r10), null, null, new com.alightcreative.importer.xml.ui.w6.n(r10, r11, null), 3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ck(Uri uri, String type) {
        this.eventLogger.n(j.g9.f8508n);
        if (uri == null) {
            this.eventLogger.n(j.cA.f8485n);
            xMQ(new n.j("No data received.", true));
            return;
        }
        if (type != null) {
            int iHashCode = type.hashCode();
            if (iHashCode != -1248326952) {
                if (iHashCode != -1248325150) {
                    if (iHashCode == -1004727243) {
                    }
                } else if (type.equals("application/zip")) {
                    C.nr(ViewModelKt.n(this), null, null, new C0664w6(uri, null), 3, null);
                    return;
                }
            }
        }
        this.eventLogger.n(j.cA.f8485n);
        xMQ(new n.j("Unsupported file type", true));
        Unit unit = Unit.INSTANCE;
    }
}

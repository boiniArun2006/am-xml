package com.alightcreative.backup.domain.usecases.internal;

import GJW.yg;
import android.content.Context;
import com.google.firebase.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class fuX implements wtO.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final wtO.w6 f46567n;
    private final Context rl;

    static final class j extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f46568O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f46569Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f46570n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f46572r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46573t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f46572r = obj;
            this.f46569Z |= Integer.MIN_VALUE;
            return fuX.this.n(null, null, this);
        }
    }

    static final class n extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f46574O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f46575Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f46576n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f46578r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46579t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f46578r = obj;
            this.f46575Z |= Integer.MIN_VALUE;
            return fuX.this.J2(null, null, this);
        }
    }

    public fuX(wtO.w6 deleteFromCloudUseCase, Context context) {
        Intrinsics.checkNotNullParameter(deleteFromCloudUseCase, "deleteFromCloudUseCase");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46567n = deleteFromCloudUseCase;
        this.rl = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0098 -> B:23:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J2(String str, Set set, Continuation continuation) throws Throwable {
        n nVar;
        fuX fux;
        Iterator it;
        fuX fux2;
        String str2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f46575Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f46575Z = i2 - Integer.MIN_VALUE;
                fux = this;
            } else {
                fux = this;
                nVar = fux.new n(continuation);
            }
        }
        Object obj = nVar.f46578r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f46575Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            it = set.iterator();
            fux2 = fux;
            str2 = str;
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str3 = (String) nVar.J2;
        it = (Iterator) nVar.f46574O;
        String str4 = (String) nVar.f46579t;
        fux2 = (fuX) nVar.f46576n;
        ResultKt.throwOnFailure(obj);
        x0X.n nVar2 = (x0X.n) obj;
        boolean z2 = nVar2 instanceof n.C1266n;
        if (!z2) {
            if (!(nVar2 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((Boolean) ((n.w6) nVar2).n()).booleanValue()) {
                fux2.KN(str4, str3);
            } else {
                if (Timestamp.INSTANCE.t().getSeconds() - com.alightcreative.app.motion.persist.j.INSTANCE.getUnfinishedCloudUploadTimestamps().getOrDefault(str4 + "?" + str3, Boxing.boxLong(0L)).longValue() > 60) {
                    fux2.KN(str4, str3);
                }
            }
        }
        if (z2) {
            Throwable th = (Throwable) ((n.C1266n) nVar2).n();
            if (th instanceof CancellationException) {
                throw th;
            }
        } else if (!(nVar2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        str2 = str4;
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            List listSplit$default = StringsKt.split$default((CharSequence) next, new String[]{"?"}, false, 0, 6, (Object) null);
            String str5 = (String) listSplit$default.get(0);
            str3 = (String) listSplit$default.get(1);
            if (Intrinsics.areEqual(str2, str5)) {
                wtO.w6 w6Var = fux2.f46567n;
                nVar.f46576n = fux2;
                nVar.f46579t = str2;
                nVar.f46574O = it;
                nVar.J2 = str3;
                nVar.f46575Z = 1;
                Object objN = w6Var.n(str2, str3, nVar);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str4 = str2;
                obj = objN;
                x0X.n nVar22 = (x0X.n) obj;
                boolean z22 = nVar22 instanceof n.C1266n;
                if (!z22) {
                }
                if (z22) {
                }
                str2 = str4;
                while (it.hasNext()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void KN(String str, final String str2) {
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.backup.domain.usecases.internal.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.xMQ(str2);
            }
        });
        com.alightcreative.app.motion.persist.j.INSTANCE.getUnfinishedCloudUploadTimestamps().remove(str + "?" + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Uo(String str) {
        return "registerUploadInterrupted: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xMQ(String str) {
        return "unregisterUploadInterrupted: " + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r2.J2(r11, r10, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // wtO.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(String str, Long l2, Continuation continuation) {
        j jVar;
        Set<String> setKeySet;
        fuX fux;
        String str2;
        Set<String> set;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f46569Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f46569Z = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f46572r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f46569Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (str == null || !XoT.fuX.Ik(this.rl)) {
                return Unit.INSTANCE;
            }
            setKeySet = com.alightcreative.app.motion.persist.j.INSTANCE.getUnfinishedCloudUploadTimestamps().keySet();
            jVar.f46570n = this;
            jVar.f46573t = str;
            jVar.f46568O = l2;
            jVar.J2 = setKeySet;
            jVar.f46569Z = 1;
            if (J2(str, setKeySet, jVar) != coroutine_suspended) {
                fux = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            Set<String> set2 = (Set) jVar.J2;
            l2 = (Long) jVar.f46568O;
            String str3 = (String) jVar.f46573t;
            fuX fux2 = (fuX) jVar.f46570n;
            ResultKt.throwOnFailure(obj);
            setKeySet = set2;
            str = str3;
            fux = fux2;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            set = (Set) jVar.f46568O;
            str2 = (String) jVar.f46573t;
            fux = (fuX) jVar.f46570n;
            ResultKt.throwOnFailure(obj);
            jVar.f46570n = null;
            jVar.f46573t = null;
            jVar.f46568O = null;
            jVar.f46569Z = 3;
        }
        if (l2 != null) {
            long jLongValue = l2.longValue();
            jVar.f46570n = fux;
            jVar.f46573t = str;
            jVar.f46568O = setKeySet;
            jVar.J2 = null;
            jVar.f46569Z = 2;
            if (yg.rl(jLongValue, jVar) != coroutine_suspended) {
                str2 = str;
                set = setKeySet;
                jVar.f46570n = null;
                jVar.f46573t = null;
                jVar.f46568O = null;
                jVar.f46569Z = 3;
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // wtO.n
    public void rl(String uid, final String projectId) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.backup.domain.usecases.internal.CN3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.Uo(projectId);
            }
        });
        com.alightcreative.app.motion.persist.j.INSTANCE.getUnfinishedCloudUploadTimestamps().put(uid + "?" + projectId, Long.valueOf(Timestamp.INSTANCE.t().getSeconds()));
    }
}

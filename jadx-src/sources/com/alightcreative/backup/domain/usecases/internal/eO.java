package com.alightcreative.backup.domain.usecases.internal;

import GJW.OU;
import GJW.lej;
import GJW.vd;
import HI0.afx;
import HI0.gnv;
import LM.qYU;
import QmE.iF;
import QmE.j;
import android.content.Context;
import android.content.DialogInterface;
import com.alightcreative.app.motion.activities.R6;
import com.alightcreative.app.motion.project.VideoResolutionTooHighException;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.alightcreative.backup.domain.usecases.internal.Dsr;
import com.google.firebase.storage.Ml;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class eO implements wtO.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final wtO.Dsr f46542n;
    private final iF nr;
    private final wtO.fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final wtO.I28 f46543t;

    static final class Ml extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f46549O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f46551Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f46552g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f46553n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f46554o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46555r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46556t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f46551Z = obj;
            this.f46552g |= Integer.MIN_VALUE;
            return eO.this.xMQ(null, null, null, false, null, null, null, this);
        }
    }

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f46557O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f46558n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f46559r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46560t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f46557O = obj;
            this.f46559r |= Integer.MIN_VALUE;
            return eO.this.KN(null, null, null, this);
        }
    }

    static final class n implements TFv.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f46561n;

        n(Function1 function1) {
            this.f46561n = function1;
        }

        @Override // TFv.CN3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object rl(Ml.j jVar, Continuation continuation) {
            this.f46561n.invoke(Boxing.boxFloat((jVar.n() * 1.0f) / jVar.rl()));
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f46562O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f46563n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f46564o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f46566t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f46564o |= Integer.MIN_VALUE;
            return eO.this.n(null, null, null, false, null, null, this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static final class I28 extends SuspendLambda implements Function2 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ File f46544O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46545n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f46546o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f46547r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f46548t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(Context context, File file, String str, boolean z2, String str2, Continuation continuation) {
            super(2, continuation);
            this.f46548t = context;
            this.f46544O = file;
            this.J2 = str;
            this.f46547r = z2;
            this.f46546o = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new I28(this.f46548t, this.f46544O, this.J2, this.f46547r, this.f46546o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws MalformedSceneException {
            boolean z2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f46545n == 0) {
                ResultKt.throwOnFailure(obj);
                Context context = this.f46548t;
                File file = this.f46544O;
                String str = this.J2;
                if (!this.f46547r && this.f46546o != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                qYU.X(context, file, str, z2);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException(dpcnwfoVOnrtRA.ZPS);
        }
    }

    public eO(wtO.Dsr linkLocalAndCloudProjectUseCase, wtO.fuX hasEnoughStorageLeftUseCase, wtO.I28 getAllowedStorageUseCase, iF eventLogger) {
        Intrinsics.checkNotNullParameter(linkLocalAndCloudProjectUseCase, "linkLocalAndCloudProjectUseCase");
        Intrinsics.checkNotNullParameter(hasEnoughStorageLeftUseCase, "hasEnoughStorageLeftUseCase");
        Intrinsics.checkNotNullParameter(getAllowedStorageUseCase, "getAllowedStorageUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f46542n = linkLocalAndCloudProjectUseCase;
        this.rl = hasEnoughStorageLeftUseCase;
        this.f46543t = getAllowedStorageUseCase;
        this.nr = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KN(com.google.firebase.storage.Ml ml, Function1 function1, Function1 function12, Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f46559r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f46559r = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f46557O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f46559r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreAz = wQ.eO.az(ml);
                n nVar = new n(function1);
                jVar.f46558n = ml;
                jVar.f46560t = function12;
                jVar.f46559r = 1;
                if (wreAz.n(nVar, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function12 = (Function1) jVar.f46560t;
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(true);
        } catch (CancellationException e2) {
            ml.S();
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            function12.invoke(cause);
            return Boxing.boxBoolean(false);
        } catch (Exception e3) {
            function12.invoke(e3);
            return Boxing.boxBoolean(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(Function0 function0, DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        function0.invoke();
        return Unit.INSTANCE;
    }

    private final boolean gh(Context context, Dsr dsr, final Function0 function0) {
        String string;
        Dsr.j jVar = Dsr.j.f46463n;
        int i2 = Intrinsics.areEqual(dsr, jVar) ? 2132019587 : 2132017704;
        if (Intrinsics.areEqual(dsr, Dsr.n.f46464n)) {
            string = context.getString(2132017702);
        } else if (Intrinsics.areEqual(dsr, jVar)) {
            string = context.getString(2132018963, gnv.J2(this.f46543t.n()));
        } else if (Intrinsics.areEqual(dsr, Dsr.Ml.f46460n) || Intrinsics.areEqual(dsr, Dsr.I28.f46459n)) {
            string = context.getString(2132017701);
        } else if (dsr instanceof Dsr.Wre) {
            Dsr.Wre wre = (Dsr.Wre) dsr;
            string = context.getString(2132017703, Integer.valueOf(wre.t()), Integer.valueOf(wre.n()), Integer.valueOf(wre.rl()));
        } else {
            if (!(dsr instanceof Dsr.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            String message = ((Dsr.w6) dsr).n().getMessage();
            if (message == null) {
                message = "Unknown";
            }
            string = "Reason: " + message;
        }
        Intrinsics.checkNotNull(string);
        if (Intrinsics.areEqual(dsr, jVar)) {
            this.nr.n(j.tI.f8577n);
        }
        R6 r6O = new R6(context).mUb(i2).O(string);
        ((!Intrinsics.areEqual(dsr, jVar) || function0 == null) ? r6O.xMQ(2132017378, new Function1() { // from class: com.alightcreative.backup.domain.usecases.internal.Pl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eO.HI((DialogInterface) obj);
            }
        }) : r6O.xMQ(2132018967, new Function1() { // from class: com.alightcreative.backup.domain.usecases.internal.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eO.az(function0, (DialogInterface) obj);
            }
        }).J2(2132017396, new Function1() { // from class: com.alightcreative.backup.domain.usecases.internal.qz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return eO.ty((DialogInterface) obj);
            }
        })).gh();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(eO eOVar, Context context, Function0 function0, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String message = it.getMessage();
        if (message == null) {
            message = "";
        }
        eOVar.gh(context, StringsKt.contains$default((CharSequence) message, (CharSequence) "permission", false, 2, (Object) null) ? Dsr.j.f46463n : Dsr.I28.f46459n, function0);
        return Unit.INSTANCE;
    }

    static /* synthetic */ boolean qie(eO eOVar, Context context, Dsr dsr, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        return eOVar.gh(context, dsr, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xMQ(final Context context, String str, String str2, boolean z2, Function1 function1, final Function0 function0, File file, Continuation continuation) {
        Ml ml;
        Context context2;
        boolean z3;
        File file2;
        eO eOVar;
        Context context3;
        eO eOVar2;
        String string;
        String str3;
        String str4;
        String str5;
        String str6 = str;
        String str7 = str2;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f46552g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f46552g = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objKN = ml.f46551Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f46552g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objKN);
            com.google.firebase.storage.o oVarRl = com.google.firebase.storage.I28.J2().ty().rl("cloud");
            Intrinsics.checkNotNullExpressionValue(oVarRl, "child(...)");
            com.google.firebase.storage.o oVarRl2 = wQ.eO.Ik(oVarRl, str6, str7).rl("projectfiles.zip");
            Intrinsics.checkNotNullExpressionValue(oVarRl2, "child(...)");
            if (!this.rl.n(XFr.j.nr(0))) {
                gh(context, Dsr.j.f46463n, function0);
                return Boxing.boxBoolean(false);
            }
            com.google.firebase.storage.Ml mlXMQ = oVarRl2.xMQ(file);
            Intrinsics.checkNotNullExpressionValue(mlXMQ, "getFile(...)");
            Function1 function12 = new Function1() { // from class: com.alightcreative.backup.domain.usecases.internal.Xo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return eO.mUb(this.f46536n, context, function0, (Throwable) obj);
                }
            };
            ml.f46553n = this;
            ml.f46556t = context;
            ml.f46549O = str6;
            ml.J2 = str7;
            ml.f46555r = file;
            ml.f46554o = z2;
            ml.f46552g = 1;
            objKN = KN(mlXMQ, function1, function12, ml);
            if (objKN != coroutine_suspended) {
                context2 = context;
                z3 = z2;
                file2 = file;
                eOVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) ml.f46555r;
            str5 = (String) ml.J2;
            str4 = (String) ml.f46549O;
            context3 = (Context) ml.f46556t;
            eOVar2 = (eO) ml.f46553n;
            try {
                ResultKt.throwOnFailure(objKN);
                eOVar2.f46542n.n(str4, str3, str5);
                com.alightcreative.app.motion.persist.j.INSTANCE.getCloudSyncTimeMillis().put(str3, Boxing.boxLong(afx.o(context3, str3).lastModified()));
                return Boxing.boxBoolean(true);
            } catch (VideoResolutionTooHighException e2) {
                e = e2;
                eO eOVar3 = eOVar2;
                qie(eOVar3, context3, new Dsr.Wre(e.getWidth(), e.getHeight(), e.getMaxRes()), null, 4, null);
                return Boxing.boxBoolean(false);
            } catch (MalformedSceneException unused) {
                eO eOVar4 = eOVar2;
                qie(eOVar4, context3, Dsr.n.f46464n, null, 4, null);
                return Boxing.boxBoolean(false);
            } catch (IOException e3) {
                e = e3;
                eO eOVar5 = eOVar2;
                qie(eOVar5, context3, new Dsr.w6(e), null, 4, null);
                return Boxing.boxBoolean(false);
            }
        }
        z3 = ml.f46554o;
        File file3 = (File) ml.f46555r;
        str7 = (String) ml.J2;
        String str8 = (String) ml.f46549O;
        context2 = (Context) ml.f46556t;
        eOVar = (eO) ml.f46553n;
        ResultKt.throwOnFailure(objKN);
        file2 = file3;
        str6 = str8;
        if (!((Boolean) objKN).booleanValue()) {
            return Boxing.boxBoolean(false);
        }
        try {
            String strRl = eOVar.f46542n.rl(str7);
            if (!z3 || strRl == null) {
                if (strRl != null) {
                    eOVar.f46542n.nr(str7);
                }
                string = UUID.randomUUID().toString();
                Intrinsics.checkNotNull(string);
            } else {
                string = strRl;
            }
            lej lejVarRl = OU.rl();
            Context context4 = context2;
            String str9 = string;
            try {
                I28 i28 = new I28(context4, file2, str9, z3, strRl, null);
                context3 = context4;
                str3 = str9;
                try {
                    ml.f46553n = eOVar;
                    ml.f46556t = context3;
                    ml.f46549O = str6;
                    ml.J2 = str7;
                    ml.f46555r = str3;
                    ml.f46552g = 2;
                    if (GJW.Dsr.Uo(lejVarRl, i28, ml) != coroutine_suspended) {
                        String str10 = str7;
                        str4 = str6;
                        str5 = str10;
                        eOVar2 = eOVar;
                        eOVar2.f46542n.n(str4, str3, str5);
                        com.alightcreative.app.motion.persist.j.INSTANCE.getCloudSyncTimeMillis().put(str3, Boxing.boxLong(afx.o(context3, str3).lastModified()));
                        return Boxing.boxBoolean(true);
                    }
                    return coroutine_suspended;
                } catch (VideoResolutionTooHighException e4) {
                    e = e4;
                    eOVar2 = eOVar;
                    eO eOVar32 = eOVar2;
                    qie(eOVar32, context3, new Dsr.Wre(e.getWidth(), e.getHeight(), e.getMaxRes()), null, 4, null);
                    return Boxing.boxBoolean(false);
                } catch (MalformedSceneException unused2) {
                    eOVar2 = eOVar;
                    eO eOVar42 = eOVar2;
                    qie(eOVar42, context3, Dsr.n.f46464n, null, 4, null);
                    return Boxing.boxBoolean(false);
                } catch (IOException e5) {
                    e = e5;
                    eOVar2 = eOVar;
                    eO eOVar52 = eOVar2;
                    qie(eOVar52, context3, new Dsr.w6(e), null, 4, null);
                    return Boxing.boxBoolean(false);
                }
            } catch (VideoResolutionTooHighException e6) {
                e = e6;
                context3 = context4;
            } catch (MalformedSceneException unused3) {
                context3 = context4;
            } catch (IOException e7) {
                e = e7;
                context3 = context4;
            }
        } catch (VideoResolutionTooHighException e8) {
            e = e8;
            context3 = context2;
        } catch (MalformedSceneException unused4) {
            context3 = context2;
        } catch (IOException e9) {
            e = e9;
            context3 = context2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // wtO.Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Context context, String str, String str2, boolean z2, Function1 function1, Function0 function0, Continuation continuation) throws Throwable {
        w6 w6Var;
        Throwable th;
        File file;
        eO eOVar;
        boolean z3;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f46564o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f46564o = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        w6 w6Var2 = w6Var;
        Object objXMQ = w6Var2.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var2.f46564o;
        boolean zBooleanValue = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objXMQ);
            if (!XoT.fuX.Ik(context)) {
                qie(this, context, Dsr.Ml.f46460n, null, 4, null);
                return Boxing.boxBoolean(false);
            }
            this.nr.n(j.Pl.f8438n);
            File cacheDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
            File fileResolve = FilesKt.resolve(FilesKt.resolve(cacheDir, "cloud"), "import_" + System.currentTimeMillis() + ".tmp");
            if (fileResolve.exists()) {
                fileResolve.delete();
            }
            File parentFile = fileResolve.getParentFile();
            if (parentFile != null) {
                Boxing.boxBoolean(parentFile.mkdirs());
            }
            try {
                w6Var2.f46563n = this;
                w6Var2.f46566t = fileResolve;
                w6Var2.f46562O = z2;
                w6Var2.f46564o = 1;
                objXMQ = xMQ(context, str, str2, z2, function1, function0, fileResolve, w6Var2);
                if (objXMQ == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eOVar = this;
                z3 = z2;
                file = fileResolve;
            } catch (CancellationException unused) {
                eOVar = this;
                file = fileResolve;
                eOVar.nr.n(j.C1444o.f8538n);
            } catch (Throwable th2) {
                th = th2;
                file = fileResolve;
                file.delete();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = w6Var2.f46562O;
            file = (File) w6Var2.f46566t;
            eOVar = (eO) w6Var2.f46563n;
            try {
                try {
                    ResultKt.throwOnFailure(objXMQ);
                } catch (CancellationException unused2) {
                    eOVar.nr.n(j.C1444o.f8538n);
                }
            } catch (Throwable th3) {
                th = th3;
                file.delete();
                throw th;
            }
        }
        if (((Boolean) objXMQ).booleanValue()) {
            eOVar.nr.n(new j.qz(z3));
        }
        zBooleanValue = ((Boolean) objXMQ).booleanValue();
        file.delete();
        return Boxing.boxBoolean(zBooleanValue);
    }
}

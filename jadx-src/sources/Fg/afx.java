package Fg;

import Fg.afx;
import GJW.xuv;
import HI0.AsyncTaskC1374z;
import Hr.CQ.USEaHtCMH;
import LM.qYU;
import QmE.j;
import WJ.phkN.HFAkacKHsU;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import com.alightcreative.app.motion.project.VideoResolutionTooHighException;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.alightcreative.export.projectpackage.SharedProjectInfo;
import com.alightcreative.export.projectpackage.SharedProjectPackageInfo;
import com.alightcreative.importer.projectpackage.AlightLinkMetadataRequest;
import com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse;
import com.alightcreative.importer.projectpackage.RequestProjectDownloadRequest;
import com.alightcreative.importer.projectpackage.RequestProjectDownloadResponse;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Timestamp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.functions.n;
import com.google.firebase.storage.Ml;
import com.safedk.android.analytics.AppLovinBridge;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kP.InterfaceC2210n;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class afx {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f2856n = new LinkedHashMap();
    private static final Map rl = new LinkedHashMap();

    static final class j extends SuspendLambda implements Function2 {
        int E2;
        Object J2;
        final /* synthetic */ nYs.Ml M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ boolean f2857N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f2858O;
        final /* synthetic */ InterfaceC2210n P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        boolean f2859S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ QmE.iF f2860T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        final /* synthetic */ xAo.I28 f2861U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ Intent f2862X;
        final /* synthetic */ boolean Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f2863Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f2864e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f2865g;
        final /* synthetic */ kgE.fuX jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2866n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f2867o;
        final /* synthetic */ Function2 p5;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f2868r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f2869t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f2870v;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ComponentActivity componentActivity, Intent intent, QmE.iF iFVar, boolean z2, boolean z3, boolean z4, kgE.fuX fux, xAo.I28 i28, InterfaceC2210n interfaceC2210n, nYs.Ml ml, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f2864e = componentActivity;
            this.f2862X = intent;
            this.f2860T = iFVar;
            this.f2857N = z2;
            this.f2870v = z3;
            this.Xw = z4;
            this.jB = fux;
            this.f2861U = i28;
            this.P5 = interfaceC2210n;
            this.M7 = ml;
            this.p5 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f2864e, this.f2862X, this.f2860T, this.f2857N, this.f2870v, this.Xw, this.jB, this.f2861U, this.P5, this.M7, this.p5, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            QmE.iF iFVar;
            xAo.I28 i28;
            kgE.fuX fux;
            boolean z2;
            boolean z3;
            ComponentActivity componentActivity;
            InterfaceC2210n interfaceC2210n;
            nYs.Ml ml;
            Function2 function2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.E2;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        boolean z4 = this.f2865g;
                        boolean z5 = this.f2859S;
                        Function2 function22 = (Function2) this.f2863Z;
                        nYs.Ml ml2 = (nYs.Ml) this.f2867o;
                        InterfaceC2210n interfaceC2210n2 = (InterfaceC2210n) this.f2868r;
                        xAo.I28 i282 = (xAo.I28) this.J2;
                        kgE.fuX fux2 = (kgE.fuX) this.f2858O;
                        iFVar = (QmE.iF) this.f2869t;
                        ComponentActivity componentActivity2 = (ComponentActivity) this.f2866n;
                        ResultKt.throwOnFailure(obj);
                        i28 = i282;
                        fux = fux2;
                        function2 = function22;
                        ml = ml2;
                        z3 = z4;
                        z2 = z5;
                        componentActivity = componentActivity2;
                        interfaceC2210n = interfaceC2210n2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ComponentActivity componentActivity3 = this.f2864e;
                    Intent intent = this.f2862X;
                    iFVar = this.f2860T;
                    boolean z6 = this.f2857N;
                    boolean z7 = this.f2870v;
                    boolean z9 = this.Xw;
                    kgE.fuX fux3 = this.jB;
                    xAo.I28 i283 = this.f2861U;
                    InterfaceC2210n interfaceC2210n3 = this.P5;
                    nYs.Ml ml3 = this.M7;
                    Function2 function23 = this.p5;
                    Result.Companion companion = Result.INSTANCE;
                    this.f2866n = componentActivity3;
                    this.f2869t = iFVar;
                    this.f2858O = fux3;
                    this.J2 = i283;
                    this.f2868r = interfaceC2210n3;
                    this.f2867o = ml3;
                    this.f2863Z = function23;
                    this.f2859S = z7;
                    this.f2865g = z9;
                    this.E2 = 1;
                    obj = wQ.w6.nr(componentActivity3, intent, iFVar, z6, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i28 = i283;
                    fux = fux3;
                    z2 = z7;
                    z3 = z9;
                    componentActivity = componentActivity3;
                    interfaceC2210n = interfaceC2210n3;
                    ml = ml3;
                    function2 = function23;
                }
                Result.m313constructorimpl(Boxing.boxBoolean(afx.E(componentActivity, (Uri) obj, z2, z3, iFVar, fux, i28, null, interfaceC2210n, ml, function2, 64, null)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m313constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class n implements FirebaseAuth.j {
        final /* synthetic */ kgE.fuX J2;
        final /* synthetic */ String KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f2871O;
        final /* synthetic */ xAo.I28 Uo;
        final /* synthetic */ nYs.Ml mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ QmE.iF f2872n;
        final /* synthetic */ Function2 nr;
        final /* synthetic */ ComponentActivity rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Uri f2873t;
        final /* synthetic */ InterfaceC2210n xMQ;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(ComponentActivity componentActivity, Uri uri, Function2 function2, boolean z2, QmE.iF iFVar, kgE.fuX fux, xAo.I28 i28, String str, InterfaceC2210n interfaceC2210n, nYs.Ml ml) {
            afx.M(componentActivity, uri, false, function2, z2, iFVar, fux, i28, str, interfaceC2210n, ml);
            return Unit.INSTANCE;
        }

        n(QmE.iF iFVar, ComponentActivity componentActivity, Uri uri, Function2 function2, boolean z2, kgE.fuX fux, xAo.I28 i28, String str, InterfaceC2210n interfaceC2210n, nYs.Ml ml) {
            this.f2872n = iFVar;
            this.rl = componentActivity;
            this.f2873t = uri;
            this.nr = function2;
            this.f2871O = z2;
            this.J2 = fux;
            this.Uo = i28;
            this.KN = str;
            this.xMQ = interfaceC2210n;
            this.mUb = ml;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void J2(final QmE.iF iFVar, final ComponentActivity componentActivity, final Uri uri, final Function2 function2, final boolean z2, final kgE.fuX fux, final xAo.I28 i28, final String str, final InterfaceC2210n interfaceC2210n, final nYs.Ml ml, DialogInterface dialogInterface, int i2) {
            iFVar.n(new j.eh(rWZ.Xo.f73072n));
            dialogInterface.dismiss();
            PJ9.DAz.fD(componentActivity, new Function0() { // from class: Fg.nKK
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return afx.n.Uo(componentActivity, uri, function2, z2, iFVar, fux, i28, str, interfaceC2210n, ml);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void O(QmE.iF iFVar, DialogInterface dialogInterface, int i2) {
            iFVar.n(new j.Z5b(rWZ.Pl.f73061n));
            dialogInterface.dismiss();
        }

        @Override // com.google.firebase.auth.FirebaseAuth.j
        public void n(FirebaseAuth auth) {
            Intrinsics.checkNotNullParameter(auth, "auth");
            auth.ck(this);
            if (auth.getUid() != null) {
                afx.M(this.rl, this.f2873t, false, this.nr, this.f2871O, this.f2872n, this.J2, this.Uo, this.KN, this.xMQ, this.mUb);
                return;
            }
            this.f2872n.n(new j.qfL(rWZ.Pl.f73061n));
            AlertDialog.Builder builderUo = new AlertDialog.Builder(this.rl).o(2132020173).Uo(2132019324);
            final QmE.iF iFVar = this.f2872n;
            AlertDialog.Builder negativeButton = builderUo.setNegativeButton(2132017396, new DialogInterface.OnClickListener() { // from class: Fg.Z
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    afx.n.O(iFVar, dialogInterface, i2);
                }
            });
            final QmE.iF iFVar2 = this.f2872n;
            final ComponentActivity componentActivity = this.rl;
            final Uri uri = this.f2873t;
            final Function2 function2 = this.nr;
            final boolean z2 = this.f2871O;
            final kgE.fuX fux = this.J2;
            final xAo.I28 i28 = this.Uo;
            final String str = this.KN;
            final InterfaceC2210n interfaceC2210n = this.xMQ;
            final nYs.Ml ml = this.mUb;
            negativeButton.setPositiveButton(2132020171, new DialogInterface.OnClickListener() { // from class: Fg.Ew
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    afx.n.J2(iFVar2, componentActivity, uri, function2, z2, fux, i28, str, interfaceC2210n, ml, dialogInterface, i2);
                }
            }).create().show();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ String E2;
        final /* synthetic */ Uri J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ nYs.Ml f2874N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f2875O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ kgE.fuX f2876S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ InterfaceC2210n f2877T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ xAo.I28 f2878X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ boolean f2879Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2 f2880e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f2881g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2882n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ AlertDialog f2883o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ QmE.iF f2884r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f2885t;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f2886n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ InterfaceC2210n f2887t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(InterfaceC2210n interfaceC2210n, Continuation continuation) {
                super(2, continuation);
                this.f2887t = interfaceC2210n;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f2887t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f2886n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC2210n interfaceC2210n = this.f2887t;
                    Eu.I28 i28 = Eu.I28.f2386g;
                    this.f2886n = 1;
                    if (Eu.Wre.n(interfaceC2210n, i28, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class n implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ mCM.QJ f2888n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f2889t;

            public static final class Ml implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f2890n;

                public Ml(String str) {
                    this.f2890n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "WrappedHttpsCallable: " + this.f2890n + " OUT";
                }
            }

            public static final class j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f2891n;

                public j(String str) {
                    this.f2891n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "WrappedHttpsCallable: " + this.f2891n + " IN";
                }
            }

            /* JADX INFO: renamed from: Fg.afx$w6$n$n, reason: collision with other inner class name */
            public static final class C0100n implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f2892n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String f2893t;

                public C0100n(String str, String str2) {
                    this.f2892n = str;
                    this.f2893t = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f2892n + ": IN / " + this.f2893t;
                }
            }

            /* JADX INFO: renamed from: Fg.afx$w6$n$w6, reason: collision with other inner class name */
            public static final class C0101w6 implements com.google.android.gms.tasks.Continuation {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ mCM.QJ f2894n;
                final /* synthetic */ String nr;
                final /* synthetic */ JsonAdapter rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Function1 f2895t;

                /* JADX INFO: renamed from: Fg.afx$w6$n$w6$CN3 */
                public static final class CN3 implements Function0 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ String f2896n;

                    public CN3(String str) {
                        this.f2896n = str;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "typedCall:" + this.f2896n + ": FAIL";
                    }
                }

                /* JADX INFO: renamed from: Fg.afx$w6$n$w6$I28 */
                public static final class I28 implements Function0 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ String f2897n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Throwable f2898t;

                    public I28(String str, Throwable th) {
                        this.f2897n = str;
                        this.f2898t = th;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "typedCall:" + this.f2897n + ": Parse error! " + this.f2898t;
                    }
                }

                /* JADX INFO: renamed from: Fg.afx$w6$n$w6$Ml */
                /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
                public static final class Ml implements Function0 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ String f2899O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ String f2900n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ int f2901t;

                    public Ml(String str, int i2, String str2) {
                        this.f2900n = str;
                        this.f2901t = i2;
                        this.f2899O = str2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "typedCall:" + this.f2900n + ": RESPONSE: " + StringsKt.padStart$default(String.valueOf(this.f2901t), 4, (char) 0, 2, (Object) null) + HFAkacKHsU.EAYakUOaYNjA + this.f2899O;
                    }
                }

                /* JADX INFO: renamed from: Fg.afx$w6$n$w6$Wre */
                public static final class Wre implements Function0 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ String f2902n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Object f2903t;

                    public Wre(String str, Object obj) {
                        this.f2902n = str;
                        this.f2903t = obj;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "typedCall:" + this.f2902n + ": RESULT: " + this.f2903t;
                    }
                }

                /* JADX INFO: renamed from: Fg.afx$w6$n$w6$j */
                /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
                public static final class j implements Function0 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ String f2904n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Task f2905t;

                    public j(String str, Task task) {
                        this.f2904n = str;
                        this.f2905t = task;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        String message;
                        String str = this.f2904n;
                        Task task = this.f2905t;
                        boolean zIsSuccessful = task.isSuccessful();
                        boolean zIsCanceled = this.f2905t.isCanceled();
                        boolean zIsComplete = this.f2905t.isComplete();
                        Exception exception = this.f2905t.getException();
                        if (exception == null || (message = exception.getMessage()) == null) {
                            message = "NONE";
                        }
                        return "typedCall:" + str + ": CONTINUE (" + task + ") isSuccessful=" + zIsSuccessful + " isCanceled=" + zIsCanceled + USEaHtCMH.bNL + zIsComplete + " exception=" + message;
                    }
                }

                /* JADX INFO: renamed from: Fg.afx$w6$n$w6$n, reason: collision with other inner class name */
                public static final class C0102n implements Function0 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ String f2906n;

                    public C0102n(String str) {
                        this.f2906n = str;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "typedCall:" + this.f2906n + ": SUCCESS";
                    }
                }

                /* JADX INFO: renamed from: Fg.afx$w6$n$w6$w6, reason: collision with other inner class name */
                public static final class C0103w6 implements Function0 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ String f2907n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ String f2908t;

                    public C0103w6(String str, String str2) {
                        this.f2907n = str;
                        this.f2908t = str2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "typedCall:" + this.f2907n + ": RESPONSE: len=" + this.f2908t.length();
                    }
                }

                public C0101w6(mCM.QJ qj, JsonAdapter jsonAdapter, Function1 function1, String str) {
                    this.f2894n = qj;
                    this.rl = jsonAdapter;
                    this.f2895t = function1;
                    this.nr = str;
                }

                public final void n(Task task) {
                    Intrinsics.checkNotNullParameter(task, "task");
                    XoT.C.Uo(this.f2894n, new j(this.nr, task));
                    if (task.isSuccessful()) {
                        mCM.l3D l3d = (mCM.l3D) task.getResult();
                        if (l3d == null) {
                            Function1 function1 = this.f2895t;
                            Result.Companion companion = Result.INSTANCE;
                            function1.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")))));
                            return;
                        }
                        XoT.C.Uo(this.f2894n, new C0102n(this.nr));
                        Moshi moshiN = HI0.Lu.n();
                        Object obj = l3d.f70669n;
                        JsonAdapter jsonAdapterAdapter = moshiN.adapter(Object.class);
                        Intrinsics.checkNotNull(jsonAdapterAdapter);
                        JsonAdapter jsonAdapterIndent = jsonAdapterAdapter.indent("    ");
                        Intrinsics.checkNotNull(jsonAdapterIndent);
                        String json = jsonAdapterIndent.toJson(obj);
                        Intrinsics.checkNotNull(json);
                        XoT.C.Uo(this.f2894n, new C0103w6(this.nr, json));
                        Sequence<String> sequenceLineSequence = StringsKt.lineSequence(json);
                        mCM.QJ qj = this.f2894n;
                        String str = this.nr;
                        int i2 = 0;
                        for (String str2 : sequenceLineSequence) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            XoT.C.Uo(qj, new Ml(str, i2, str2));
                            i2 = i3;
                        }
                        try {
                            Object objFromJson = this.rl.fromJson(json);
                            XoT.C.Uo(this.f2894n, new Wre(this.nr, objFromJson));
                            if (objFromJson != null) {
                                this.f2895t.invoke(Result.m312boximpl(Result.m313constructorimpl(objFromJson)));
                                return;
                            }
                        } catch (Throwable th) {
                            XoT.C.Uo(this.f2894n, new I28(this.nr, th));
                            Function1 function12 = this.f2895t;
                            Result.Companion companion2 = Result.INSTANCE;
                            function12.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(th))));
                            return;
                        }
                    }
                    XoT.C.Uo(this.f2894n, new CN3(this.nr));
                    Exception exception = task.getException();
                    if (exception != null) {
                        Function1 function13 = this.f2895t;
                        Result.Companion companion3 = Result.INSTANCE;
                        function13.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(exception))));
                    } else {
                        Function1 function14 = this.f2895t;
                        Result.Companion companion4 = Result.INSTANCE;
                        function14.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")))));
                    }
                }

                @Override // com.google.android.gms.tasks.Continuation
                public /* bridge */ /* synthetic */ Object then(Task task) {
                    n(task);
                    return Unit.INSTANCE;
                }
            }

            public n(mCM.QJ qj, String str) {
                this.f2888n = qj;
                this.f2889t = str;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                n(obj, (Function1) obj2);
                return Unit.INSTANCE;
            }

            public final void n(Object obj, Function1 cb2) {
                Intrinsics.checkNotNullParameter(cb2, "cb");
                XoT.C.KN("WrappedHttpsCallable", new j(this.f2889t));
                mCM.QJ qj = this.f2888n;
                String str = this.f2889t;
                JsonAdapter jsonAdapterAdapter = HI0.Lu.n().adapter(AlightLinkMetadataRequest.class);
                Intrinsics.checkNotNull(jsonAdapterAdapter);
                String json = jsonAdapterAdapter.toJson(obj);
                Intrinsics.checkNotNull(json);
                XoT.C.Uo(qj, new C0100n(str, json));
                qj.rl(new JSONObject(json)).continueWith(new C0101w6(qj, HI0.Lu.n().adapter(AlightLinkMetadataResponse.class), cb2, str));
                XoT.C.KN("WrappedHttpsCallable", new Ml(this.f2889t));
            }
        }

        /* JADX INFO: renamed from: Fg.afx$w6$w6, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class C0104w6 implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ mCM.QJ f2909n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f2910t;

            /* JADX INFO: renamed from: Fg.afx$w6$w6$Ml */
            public static final class Ml implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f2911n;

                public Ml(String str) {
                    this.f2911n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "WrappedHttpsCallable: " + this.f2911n + " OUT";
                }
            }

            /* JADX INFO: renamed from: Fg.afx$w6$w6$j */
            public static final class j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f2912n;

                public j(String str) {
                    this.f2912n = str;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "WrappedHttpsCallable: " + this.f2912n + " IN";
                }
            }

            /* JADX INFO: renamed from: Fg.afx$w6$w6$n */
            public static final class n implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f2913n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ String f2914t;

                public n(String str, String str2) {
                    this.f2913n = str;
                    this.f2914t = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "typedCall:" + this.f2913n + ": IN / " + this.f2914t;
                }
            }

            /* JADX INFO: renamed from: Fg.afx$w6$w6$w6, reason: collision with other inner class name */
            public static final class C0105w6 implements com.google.android.gms.tasks.Continuation {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ mCM.QJ f2915n;
                final /* synthetic */ String nr;
                final /* synthetic */ JsonAdapter rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Function1 f2916t;

                /* JADX INFO: renamed from: Fg.afx$w6$w6$w6$CN3 */
                public static final class CN3 implements Function0 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ String f2917n;

                    public CN3(String str) {
                        this.f2917n = str;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "typedCall:" + this.f2917n + ": FAIL";
                    }
                }

                /* JADX INFO: renamed from: Fg.afx$w6$w6$w6$I28 */
                public static final class I28 implements Function0 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ String f2918n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Throwable f2919t;

                    public I28(String str, Throwable th) {
                        this.f2918n = str;
                        this.f2919t = th;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "typedCall:" + this.f2918n + ": Parse error! " + this.f2919t;
                    }
                }

                /* JADX INFO: renamed from: Fg.afx$w6$w6$w6$Ml */
                public static final class Ml implements Function0 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ String f2920O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ String f2921n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ int f2922t;

                    public Ml(String str, int i2, String str2) {
                        this.f2921n = str;
                        this.f2922t = i2;
                        this.f2920O = str2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "typedCall:" + this.f2921n + ": RESPONSE: " + StringsKt.padStart$default(String.valueOf(this.f2922t), 4, (char) 0, 2, (Object) null) + ": " + this.f2920O;
                    }
                }

                /* JADX INFO: renamed from: Fg.afx$w6$w6$w6$Wre */
                public static final class Wre implements Function0 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ String f2923n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Object f2924t;

                    public Wre(String str, Object obj) {
                        this.f2923n = str;
                        this.f2924t = obj;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "typedCall:" + this.f2923n + ": RESULT: " + this.f2924t;
                    }
                }

                /* JADX INFO: renamed from: Fg.afx$w6$w6$w6$j */
                public static final class j implements Function0 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ String f2925n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Task f2926t;

                    public j(String str, Task task) {
                        this.f2925n = str;
                        this.f2926t = task;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        String message;
                        String str = this.f2925n;
                        Task task = this.f2926t;
                        boolean zIsSuccessful = task.isSuccessful();
                        boolean zIsCanceled = this.f2926t.isCanceled();
                        boolean zIsComplete = this.f2926t.isComplete();
                        Exception exception = this.f2926t.getException();
                        if (exception == null || (message = exception.getMessage()) == null) {
                            message = "NONE";
                        }
                        return "typedCall:" + str + ": CONTINUE (" + task + ") isSuccessful=" + zIsSuccessful + " isCanceled=" + zIsCanceled + " isComplete=" + zIsComplete + " exception=" + message;
                    }
                }

                /* JADX INFO: renamed from: Fg.afx$w6$w6$w6$n */
                public static final class n implements Function0 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ String f2927n;

                    public n(String str) {
                        this.f2927n = str;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "typedCall:" + this.f2927n + ": SUCCESS";
                    }
                }

                /* JADX INFO: renamed from: Fg.afx$w6$w6$w6$w6, reason: collision with other inner class name */
                public static final class C0106w6 implements Function0 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ String f2928n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ String f2929t;

                    public C0106w6(String str, String str2) {
                        this.f2928n = str;
                        this.f2929t = str2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "typedCall:" + this.f2928n + ": RESPONSE: len=" + this.f2929t.length();
                    }
                }

                public C0105w6(mCM.QJ qj, JsonAdapter jsonAdapter, Function1 function1, String str) {
                    this.f2915n = qj;
                    this.rl = jsonAdapter;
                    this.f2916t = function1;
                    this.nr = str;
                }

                public final void n(Task task) {
                    Intrinsics.checkNotNullParameter(task, "task");
                    XoT.C.Uo(this.f2915n, new j(this.nr, task));
                    if (task.isSuccessful()) {
                        mCM.l3D l3d = (mCM.l3D) task.getResult();
                        if (l3d == null) {
                            Function1 function1 = this.f2916t;
                            Result.Companion companion = Result.INSTANCE;
                            function1.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")))));
                            return;
                        }
                        XoT.C.Uo(this.f2915n, new n(this.nr));
                        Moshi moshiN = HI0.Lu.n();
                        Object obj = l3d.f70669n;
                        JsonAdapter jsonAdapterAdapter = moshiN.adapter(Object.class);
                        Intrinsics.checkNotNull(jsonAdapterAdapter);
                        JsonAdapter jsonAdapterIndent = jsonAdapterAdapter.indent("    ");
                        Intrinsics.checkNotNull(jsonAdapterIndent);
                        String json = jsonAdapterIndent.toJson(obj);
                        Intrinsics.checkNotNull(json);
                        XoT.C.Uo(this.f2915n, new C0106w6(this.nr, json));
                        Sequence<String> sequenceLineSequence = StringsKt.lineSequence(json);
                        mCM.QJ qj = this.f2915n;
                        String str = this.nr;
                        int i2 = 0;
                        for (String str2 : sequenceLineSequence) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            XoT.C.Uo(qj, new Ml(str, i2, str2));
                            i2 = i3;
                        }
                        try {
                            Object objFromJson = this.rl.fromJson(json);
                            XoT.C.Uo(this.f2915n, new Wre(this.nr, objFromJson));
                            if (objFromJson != null) {
                                this.f2916t.invoke(Result.m312boximpl(Result.m313constructorimpl(objFromJson)));
                                return;
                            }
                        } catch (Throwable th) {
                            XoT.C.Uo(this.f2915n, new I28(this.nr, th));
                            Function1 function12 = this.f2916t;
                            Result.Companion companion2 = Result.INSTANCE;
                            function12.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(th))));
                            return;
                        }
                    }
                    XoT.C.Uo(this.f2915n, new CN3(this.nr));
                    Exception exception = task.getException();
                    if (exception != null) {
                        Function1 function13 = this.f2916t;
                        Result.Companion companion3 = Result.INSTANCE;
                        function13.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(exception))));
                    } else {
                        Function1 function14 = this.f2916t;
                        Result.Companion companion4 = Result.INSTANCE;
                        function14.invoke(Result.m312boximpl(Result.m313constructorimpl(ResultKt.createFailure(new Exception("Failed processing resposne")))));
                    }
                }

                @Override // com.google.android.gms.tasks.Continuation
                public /* bridge */ /* synthetic */ Object then(Task task) {
                    n(task);
                    return Unit.INSTANCE;
                }
            }

            public C0104w6(mCM.QJ qj, String str) {
                this.f2909n = qj;
                this.f2910t = str;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                n(obj, (Function1) obj2);
                return Unit.INSTANCE;
            }

            public final void n(Object obj, Function1 cb2) {
                Intrinsics.checkNotNullParameter(cb2, "cb");
                XoT.C.KN("WrappedHttpsCallable", new j(this.f2910t));
                mCM.QJ qj = this.f2909n;
                String str = this.f2910t;
                JsonAdapter jsonAdapterAdapter = HI0.Lu.n().adapter(RequestProjectDownloadRequest.class);
                Intrinsics.checkNotNull(jsonAdapterAdapter);
                String json = jsonAdapterAdapter.toJson(obj);
                Intrinsics.checkNotNull(json);
                XoT.C.Uo(qj, new n(str, json));
                qj.rl(new JSONObject(json)).continueWith(new C0105w6(qj, HI0.Lu.n().adapter(RequestProjectDownloadResponse.class), cb2, str));
                XoT.C.KN("WrappedHttpsCallable", new Ml(this.f2910t));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Nxk(ComponentActivity componentActivity, Uri uri, Function2 function2, boolean z2, QmE.iF iFVar, kgE.fuX fux, xAo.I28 i28, String str, InterfaceC2210n interfaceC2210n, nYs.Ml ml) {
            afx.M(componentActivity, uri, false, function2, z2, iFVar, fux, i28, str, interfaceC2210n, ml);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:152:0x0415  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0143  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Unit P5(final ComponentActivity componentActivity, AlertDialog alertDialog, final QmE.iF iFVar, Uri uri, final boolean z2, final kgE.fuX fux, boolean z3, final String str, final String str2, final String str3, final Uri uri2, final Function2 function2, final xAo.I28 i28, final InterfaceC2210n interfaceC2210n, final nYs.Ml ml, final wQ.QJ qj, final com.google.firebase.storage.I28 i282, final GJW.vd vdVar, Result result) {
            boolean z4;
            final Uri uri3;
            String str4;
            AlightLinkMetadataResponse alightLinkMetadataResponse;
            String localizedMessage;
            String errorCode;
            boolean z5;
            boolean z6;
            String string;
            String quantityString;
            String message;
            final Uri uri4;
            final SharedProjectPackageInfo sharedProjectPackageInfo;
            boolean z7;
            int i2;
            GJW.vd vdVar2;
            String strT;
            Date date;
            List<SharedProjectInfo> projects;
            List<SharedProjectInfo> projects2;
            if (!componentActivity.isDestroyed()) {
                alertDialog.dismiss();
            }
            Object value = result.getValue();
            if (Result.m319isFailureimpl(value)) {
                value = null;
            }
            AlightLinkMetadataResponse alightLinkMetadataResponse2 = (AlightLinkMetadataResponse) value;
            SharedProjectPackageInfo info = alightLinkMetadataResponse2 != null ? alightLinkMetadataResponse2.getInfo() : null;
            if (info == null || (projects2 = info.getProjects()) == null) {
                z4 = false;
                break;
            }
            if (!projects2.isEmpty()) {
                Iterator<T> it = projects2.iterator();
                while (it.hasNext()) {
                    if (!Intrinsics.areEqual(((SharedProjectInfo) it.next()).getType(), "preset")) {
                        z4 = false;
                        break;
                    }
                }
            }
            z4 = true;
            if (alightLinkMetadataResponse2 == null || info == null || Result.m319isFailureimpl(result.getValue())) {
                uri3 = uri2;
                str4 = str3;
                alightLinkMetadataResponse = alightLinkMetadataResponse2;
            } else {
                alightLinkMetadataResponse = alightLinkMetadataResponse2;
                if (Intrinsics.areEqual(alightLinkMetadataResponse2.getResult(), "success")) {
                    String unavailableNotice = info.getUnavailableNotice();
                    if (unavailableNotice != null && !StringsKt.isBlank(unavailableNotice)) {
                        Bundle bundle = new Bundle();
                        bundle.putString("uid", str3);
                        bundle.putString("projectId", str);
                        bundle.putBoolean("sp", com.alightcreative.app.motion.persist.j.INSTANCE.getUpdateSp());
                        bundle.putString(MRAIDPresenter.ERROR, "admin_unavailable");
                        Unit unit = Unit.INSTANCE;
                        iFVar.n(new j.fuX("alink_verifyfail", bundle));
                        new AlertDialog.Builder(componentActivity).o(2132019463).KN(info.getUnavailableNotice() + HrvQKfmFZJudBc.BXehlnAkGnjUdE + uri).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: Fg.Lu
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                afx.w6.eWT(dialogInterface, i3);
                            }
                        }).ty(new DialogInterface.OnDismissListener() { // from class: Fg.h
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                afx.w6.ul(uri2, dialogInterface);
                            }
                        }).create().show();
                        return Unit.INSTANCE;
                    }
                    if (info.getMaxFFVer() == null || info.getMaxFFVer().intValue() > SceneKt.getMAX_SUPPORTED_PROJECT_FORMAT_VERSION()) {
                        z5 = info.getAmVersionCode() > 1028425;
                    } else {
                        List<String> requiredEffects = info.getRequiredEffects();
                        if (requiredEffects == null) {
                            requiredEffects = CollectionsKt.emptyList();
                        }
                        if (requiredEffects == null || !requiredEffects.isEmpty()) {
                            Iterator<T> it2 = requiredEffects.iterator();
                            while (it2.hasNext()) {
                                if (VisualEffectKt.visualEffectById((String) it2.next()) == null) {
                                    if (info.getAmVersionCode() > 1028425) {
                                    }
                                }
                            }
                        }
                    }
                    if (z2 || ((projects = info.getProjects()) != null && projects.isEmpty())) {
                        z6 = false;
                    } else {
                        Iterator<T> it3 = projects.iterator();
                        while (it3.hasNext()) {
                            if (Intrinsics.areEqual(((SharedProjectInfo) it3.next()).getType(), "preset")) {
                                z6 = true;
                                break;
                            }
                        }
                        z6 = false;
                    }
                    if (!z5 || z6) {
                        SharedProjectPackageInfo sharedProjectPackageInfo2 = info;
                        boolean z9 = z4;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("uid", str3);
                        bundle2.putString("projectId", str);
                        bundle2.putBoolean("sp", com.alightcreative.app.motion.persist.j.INSTANCE.getUpdateSp());
                        Unit unit2 = Unit.INSTANCE;
                        iFVar.n(new j.fuX("alink_unsupported", bundle2));
                        AlertDialog.Builder builder = new AlertDialog.Builder(componentActivity);
                        List<SharedProjectInfo> projects3 = sharedProjectPackageInfo2.getProjects();
                        if (projects3 == null || !projects3.isEmpty()) {
                            Iterator<T> it4 = projects3.iterator();
                            while (it4.hasNext()) {
                                if (!Intrinsics.areEqual(((SharedProjectInfo) it4.next()).getType(), "element")) {
                                    string = z9 ? componentActivity.getString(2132019912) : componentActivity.getResources().getQuantityString(2131886104, sharedProjectPackageInfo2.getProjects().size(), Integer.valueOf(sharedProjectPackageInfo2.getProjects().size()));
                                }
                            }
                            string = componentActivity.getResources().getQuantityString(2131886103, sharedProjectPackageInfo2.getProjects().size(), Integer.valueOf(sharedProjectPackageInfo2.getProjects().size()));
                        } else {
                            string = componentActivity.getResources().getQuantityString(2131886103, sharedProjectPackageInfo2.getProjects().size(), Integer.valueOf(sharedProjectPackageInfo2.getProjects().size()));
                        }
                        builder.setTitle(string).Uo(2132019727).mUb("Cancel", new DialogInterface.OnClickListener() { // from class: Fg.psW
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                afx.w6.B(dialogInterface, i3);
                            }
                        }).ck("Check for Update", new DialogInterface.OnClickListener() { // from class: Fg.Md
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                afx.w6.J(componentActivity, dialogInterface, i3);
                            }
                        }).ty(new DialogInterface.OnDismissListener() { // from class: Fg.Zs
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                afx.w6.D(uri2, dialogInterface);
                            }
                        }).create().show();
                        return Unit.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(info.getProjects(), 10));
                    for (Iterator it5 = r0.iterator(); it5.hasNext(); it5 = it5) {
                        arrayList.add("• " + ((SharedProjectInfo) it5.next()).getTitle());
                    }
                    String str5 = GWY.j.rl(arrayList, 15, null, null, 12, null) + "\n\n Total: " + HI0.gnv.nr(info.getSize());
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("uid", str3);
                    bundle3.putString("projectId", str);
                    bundle3.putLong("size", info.getSize());
                    bundle3.putInt("projectCount", info.getProjects().size());
                    bundle3.putInt("amVerCode", info.getAmVersionCode());
                    bundle3.putString("amVerName", info.getAmVersionString());
                    Timestamp shareDate = info.getShareDate();
                    bundle3.putLong("shareDate", (shareDate == null || (date = shareDate.toDate()) == null) ? 0L : date.getTime());
                    bundle3.putBoolean("sp", com.alightcreative.app.motion.persist.j.INSTANCE.getUpdateSp());
                    Unit unit3 = Unit.INSTANCE;
                    iFVar.n(new j.fuX("alink_popup", bundle3));
                    if (Intrinsics.areEqual(alightLinkMetadataResponse.getDownload(), "allowed")) {
                        final boolean z10 = z4;
                        final SharedProjectPackageInfo sharedProjectPackageInfo3 = info;
                        iFVar.n(new j.Buf(str, str2));
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(componentActivity);
                        List<SharedProjectInfo> projects4 = sharedProjectPackageInfo3.getProjects();
                        if (projects4 == null || !projects4.isEmpty()) {
                            Iterator<T> it6 = projects4.iterator();
                            while (it6.hasNext()) {
                                if (!Intrinsics.areEqual(((SharedProjectInfo) it6.next()).getType(), "element")) {
                                    List<SharedProjectInfo> projects5 = sharedProjectPackageInfo3.getProjects();
                                    if (projects5 == null || !projects5.isEmpty()) {
                                        Iterator<T> it7 = projects5.iterator();
                                        while (it7.hasNext()) {
                                            if (!Intrinsics.areEqual(((SharedProjectInfo) it7.next()).getType(), "preset")) {
                                                quantityString = componentActivity.getResources().getQuantityString(2131886104, sharedProjectPackageInfo3.getProjects().size(), Integer.valueOf(sharedProjectPackageInfo3.getProjects().size()));
                                                break;
                                            }
                                        }
                                        quantityString = componentActivity.getResources().getQuantityString(2131886125, sharedProjectPackageInfo3.getProjects().size(), Integer.valueOf(sharedProjectPackageInfo3.getProjects().size()));
                                    } else {
                                        quantityString = componentActivity.getResources().getQuantityString(2131886125, sharedProjectPackageInfo3.getProjects().size(), Integer.valueOf(sharedProjectPackageInfo3.getProjects().size()));
                                    }
                                }
                            }
                            quantityString = componentActivity.getResources().getQuantityString(2131886103, sharedProjectPackageInfo3.getProjects().size(), Integer.valueOf(sharedProjectPackageInfo3.getProjects().size()));
                        } else {
                            quantityString = componentActivity.getResources().getQuantityString(2131886103, sharedProjectPackageInfo3.getProjects().size(), Integer.valueOf(sharedProjectPackageInfo3.getProjects().size()));
                        }
                        AlertDialog alertDialogCreate = builder2.setTitle(quantityString).Z(2131558657).setNegativeButton(2132017396, new DialogInterface.OnClickListener() { // from class: Fg.Ln
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                afx.w6.pJg(iFVar, str, dialogInterface, i3);
                            }
                        }).setPositiveButton(2132017375, new DialogInterface.OnClickListener() { // from class: Fg.lej
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                afx.w6.ofS(iFVar, str, componentActivity, qj, str3, fux, sharedProjectPackageInfo3, i282, z10, vdVar, function2, dialogInterface, i3);
                            }
                        }).az(new DialogInterface.OnCancelListener() { // from class: Fg.M
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                afx.w6.C(iFVar, str, dialogInterface);
                            }
                        }).ty(new DialogInterface.OnDismissListener() { // from class: Fg.rv6
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                afx.w6.Mx(uri2, dialogInterface);
                            }
                        }).create();
                        alertDialogCreate.show();
                        View viewFindViewById = alertDialogCreate.findViewById(2131363886);
                        Intrinsics.checkNotNull(viewFindViewById);
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
                        View viewFindViewById2 = alertDialogCreate.findViewById(2131363461);
                        Intrinsics.checkNotNull(viewFindViewById2);
                        TextView textView = (TextView) viewFindViewById2;
                        if (sharedProjectPackageInfo3.getMedThumbUrl() != null) {
                            XoT.C.Uo(vdVar, new Function0() { // from class: Fg.vd
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return afx.w6.G7(sharedProjectPackageInfo3);
                                }
                            });
                            simpleDraweeView.gh(Uri.parse(sharedProjectPackageInfo3.getMedThumbUrl()), null);
                        } else {
                            simpleDraweeView.setVisibility(8);
                        }
                        textView.setText(str5);
                        return Unit.INSTANCE;
                    }
                    String download = alightLinkMetadataResponse.getDownload();
                    boolean z11 = Intrinsics.areEqual(download, "sub-required-size") || Intrinsics.areEqual(download, "sub-required-other");
                    if (z11 && fux.Uo().contains(kgE.K.f70078g)) {
                        if (z3) {
                            new AlertDialog.Builder(componentActivity).setTitle("Staging/Production Mismatch").KN("You are attempting to access a staging link in a release build or a production link in a debug build, but the link is too large to download without a membership. This operation is currently not supported.").setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: Fg.P
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    afx.w6.a(dialogInterface, i3);
                                }
                            }).create().show();
                        } else if (((Boolean) fux.ck().getValue()).booleanValue()) {
                            new AlertDialog.Builder(componentActivity).o(2132019614).Uo(2132019613).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: Fg.gnv
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    afx.w6.k(dialogInterface, i3);
                                }
                            }).create().show();
                        } else {
                            iFVar.n(new j.qfL(rWZ.Pl.f73061n));
                            new AlertDialog.Builder(componentActivity).o(2132020173).Uo(z4 ? 2132019911 : 2132020174).setNegativeButton(2132017396, new DialogInterface.OnClickListener() { // from class: Fg.m
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    afx.w6.I(iFVar, dialogInterface, i3);
                                }
                            }).setPositiveButton(2132020171, new DialogInterface.OnClickListener() { // from class: Fg.iF
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    afx.w6.GR(iFVar, componentActivity, uri2, function2, z2, fux, i28, str2, interfaceC2210n, ml, dialogInterface, i3);
                                }
                            }).ty(new DialogInterface.OnDismissListener() { // from class: Fg.LEl
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    afx.w6.Y(uri2, dialogInterface);
                                }
                            }).create().show();
                        }
                        return Unit.INSTANCE;
                    }
                    AlertDialog.Builder builderO = new AlertDialog.Builder(componentActivity).o(z11 ? 2132019616 : 2132019463);
                    String download2 = alightLinkMetadataResponse.getDownload();
                    if (download2 != null) {
                        int iHashCode = download2.hashCode();
                        if (iHashCode != -1569459569) {
                            if (iHashCode != -1435991902) {
                                if (iHashCode == 560073902 && download2.equals("not-allowed")) {
                                    message = alightLinkMetadataResponse.getMessage();
                                    if (message == null) {
                                        message = componentActivity.getResources().getString(2132019463);
                                        Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
                                    }
                                } else {
                                    message = alightLinkMetadataResponse.getMessage();
                                    if (message == null) {
                                        message = componentActivity.getResources().getString(2132019463);
                                        Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
                                    }
                                }
                            } else if (download2.equals("sub-required-size")) {
                                Resources resources = componentActivity.getResources();
                                Long freeUserMaxDownloadSize = alightLinkMetadataResponse.getFreeUserMaxDownloadSize();
                                if (freeUserMaxDownloadSize == null || (strT = com.alightcreative.app.motion.activities.lej.t(freeUserMaxDownloadSize.longValue(), false, 1, null)) == null) {
                                    strT = "??";
                                }
                                message = resources.getString(2132019618, strT) + (Intrinsics.areEqual(alightLinkMetadataResponse.getLiteVersionAvailable(), Boolean.TRUE) ? "\n\n" + componentActivity.getResources().getString(2132019975) : "");
                            }
                        } else if (download2.equals("sub-required-other")) {
                            Resources resources2 = componentActivity.getResources();
                            String message2 = alightLinkMetadataResponse.getMessage();
                            message = resources2.getString(2132019617, message2 != null ? message2 : "");
                            Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
                        }
                    }
                    AlertDialog.Builder builderGh = builderO.KN(message).Z(2131558657).gh(z11 ? 2132017396 : 2132017378, new DialogInterface.OnClickListener() { // from class: Fg.fg
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            afx.w6.dR0(dialogInterface, i3);
                        }
                    });
                    if (Intrinsics.areEqual(alightLinkMetadataResponse.getLiteVersionAvailable(), Boolean.TRUE)) {
                        sharedProjectPackageInfo = info;
                        final boolean z12 = z4;
                        z7 = z11;
                        i2 = 2131363886;
                        uri4 = uri2;
                        vdVar2 = vdVar;
                        builderGh.setNegativeButton(2132017376, new DialogInterface.OnClickListener() { // from class: Fg.KH
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                afx.w6.z(iFVar, componentActivity, qj, str3, str, fux, sharedProjectPackageInfo, i282, z12, vdVar, function2, dialogInterface, i3);
                            }
                        });
                    } else {
                        uri4 = uri2;
                        sharedProjectPackageInfo = info;
                        z7 = z11;
                        i2 = 2131363886;
                        vdVar2 = vdVar;
                    }
                    if (z7) {
                        builderGh.setPositiveButton(2132019615, new DialogInterface.OnClickListener() { // from class: Fg.Mf
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                afx.w6.piY(ml, componentActivity, i28, interfaceC2210n, dialogInterface, i3);
                            }
                        });
                    }
                    final AlertDialog alertDialogCreate2 = builderGh.ty(new DialogInterface.OnDismissListener() { // from class: Fg.o7q
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            afx.w6.ijL(uri4, dialogInterface);
                        }
                    }).create();
                    alertDialogCreate2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: Fg.u
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            afx.w6.m(alertDialogCreate2, dialogInterface);
                        }
                    });
                    alertDialogCreate2.show();
                    View viewFindViewById3 = alertDialogCreate2.findViewById(i2);
                    Intrinsics.checkNotNull(viewFindViewById3);
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) viewFindViewById3;
                    View viewFindViewById4 = alertDialogCreate2.findViewById(2131363461);
                    Intrinsics.checkNotNull(viewFindViewById4);
                    TextView textView2 = (TextView) viewFindViewById4;
                    if (sharedProjectPackageInfo.getMedThumbUrl() != null) {
                        XoT.C.Uo(vdVar2, new Function0() { // from class: Fg.qf
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return afx.w6.eTf(sharedProjectPackageInfo);
                            }
                        });
                        simpleDraweeView2.gh(Uri.parse(sharedProjectPackageInfo.getMedThumbUrl()), null);
                    } else {
                        simpleDraweeView2.setVisibility(8);
                    }
                    textView2.setText(str5);
                    return Unit.INSTANCE;
                }
                uri3 = uri2;
                str4 = str3;
            }
            Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(result.getValue());
            if (thM316exceptionOrNullimpl == null || (localizedMessage = thM316exceptionOrNullimpl.getLocalizedMessage()) == null) {
                localizedMessage = (alightLinkMetadataResponse == null || (errorCode = alightLinkMetadataResponse.getErrorCode()) == null || !Intrinsics.areEqual(errorCode, "no-permission")) ? null : "No Permission";
                if (localizedMessage == null) {
                    String errorMessage = alightLinkMetadataResponse != null ? alightLinkMetadataResponse.getErrorMessage() : null;
                    localizedMessage = errorMessage == null ? "Unknown" : errorMessage;
                }
            }
            Bundle bundle4 = new Bundle();
            bundle4.putString("uid", str4);
            bundle4.putString("projectId", str);
            bundle4.putBoolean("sp", com.alightcreative.app.motion.persist.j.INSTANCE.getUpdateSp());
            bundle4.putString(MRAIDPresenter.ERROR, localizedMessage);
            Unit unit4 = Unit.INSTANCE;
            iFVar.n(new j.fuX("alink_verifyfail", bundle4));
            new AlertDialog.Builder(componentActivity).o(2132019464).KN("Error: " + localizedMessage + "\nLink: " + uri).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: Fg.O
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    afx.w6.xg(dialogInterface, i3);
                }
            }).ty(new DialogInterface.OnDismissListener() { // from class: Fg.iwV
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    afx.w6.fcU(uri3, dialogInterface);
                }
            }).create().show();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(AlertDialog alertDialog, DialogInterface dialogInterface) {
            try {
                Button buttonXMQ = alertDialog.xMQ(-1);
                Button buttonXMQ2 = alertDialog.xMQ(-2);
                Button buttonXMQ3 = alertDialog.xMQ(-3);
                if (buttonXMQ != null) {
                    buttonXMQ.setGravity(8388613);
                }
                if (buttonXMQ2 != null) {
                    buttonXMQ2.setGravity(8388613);
                }
                if (buttonXMQ3 != null) {
                    buttonXMQ3.setGravity(8388613);
                }
                ViewParent parent = buttonXMQ3 != null ? buttonXMQ3.getParent() : null;
                LinearLayout linearLayout = parent instanceof LinearLayout ? (LinearLayout) parent : null;
                if (linearLayout != null) {
                    linearLayout.setOrientation(1);
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(ComponentActivity componentActivity, Uri uri, QmE.iF iFVar, AlertDialog alertDialog, boolean z2, kgE.fuX fux, boolean z3, String str, Function2 function2, xAo.I28 i28, InterfaceC2210n interfaceC2210n, nYs.Ml ml, Continuation continuation) {
            super(2, continuation);
            this.f2875O = componentActivity;
            this.J2 = uri;
            this.f2884r = iFVar;
            this.f2883o = alertDialog;
            this.f2879Z = z2;
            this.f2876S = fux;
            this.f2881g = z3;
            this.E2 = str;
            this.f2880e = function2;
            this.f2878X = i28;
            this.f2877T = interfaceC2210n;
            this.f2874N = ml;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void C(QmE.iF iFVar, String str, DialogInterface dialogInterface) {
            iFVar.n(new j.C1435Dt(str));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit E(GJW.vd vdVar, QmE.iF iFVar, Function2 function2, String str, String str2, SharedProjectPackageInfo sharedProjectPackageInfo, final LM.aC aCVar) {
            Date date;
            XoT.C.Uo(vdVar, new Function0() { // from class: Fg.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return afx.w6.M(aCVar);
                }
            });
            Bundle bundle = new Bundle();
            bundle.putString("uid", str2);
            bundle.putString("projectId", str);
            bundle.putLong("size", sharedProjectPackageInfo.getSize());
            bundle.putInt("projectCount", sharedProjectPackageInfo.getProjects().size());
            bundle.putInt("amVerCode", sharedProjectPackageInfo.getAmVersionCode());
            bundle.putString("amVerName", sharedProjectPackageInfo.getAmVersionString());
            Timestamp shareDate = sharedProjectPackageInfo.getShareDate();
            bundle.putLong("shareDate", (shareDate == null || (date = shareDate.toDate()) == null) ? 0L : date.getTime());
            bundle.putInt("missingMediaCount", aCVar.J2());
            bundle.putBoolean("sp", com.alightcreative.app.motion.persist.j.INSTANCE.getUpdateSp());
            bundle.putInt("audioCount", aCVar.n());
            bundle.putInt("videoCount", aCVar.xMQ());
            bundle.putInt("imageCount", aCVar.rl());
            bundle.putInt("otherCount", aCVar.KN());
            Unit unit = Unit.INSTANCE;
            iFVar.n(new j.fuX("alink_import_complete", bundle));
            function2.invoke(str, aCVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void GR(final QmE.iF iFVar, final ComponentActivity componentActivity, final Uri uri, final Function2 function2, final boolean z2, final kgE.fuX fux, final xAo.I28 i28, final String str, final InterfaceC2210n interfaceC2210n, final nYs.Ml ml, DialogInterface dialogInterface, int i2) {
            iFVar.n(new j.eh(rWZ.Xo.f73072n));
            dialogInterface.dismiss();
            PJ9.DAz.fD(componentActivity, new Function0() { // from class: Fg.yg
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return afx.w6.Nxk(componentActivity, uri, function2, z2, iFVar, fux, i28, str, interfaceC2210n, ml);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void I(QmE.iF iFVar, DialogInterface dialogInterface, int i2) {
            iFVar.n(new j.Z5b(rWZ.Pl.f73061n));
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String M(LM.aC aCVar) {
            return "downloadAndImportPackagedProject: " + aCVar;
        }

        private static final void M7(final QmE.iF iFVar, final ComponentActivity componentActivity, wQ.QJ qj, final String str, final String str2, kgE.fuX fux, final SharedProjectPackageInfo sharedProjectPackageInfo, final com.google.firebase.storage.I28 i28, final boolean z2, final GJW.vd vdVar, final Function2 function2, boolean z3) {
            Date date;
            Bundle bundle = new Bundle();
            bundle.putString("uid", str);
            bundle.putString("projectId", str2);
            bundle.putLong("size", sharedProjectPackageInfo.getSize());
            bundle.putInt("projectCount", sharedProjectPackageInfo.getProjects().size());
            bundle.putInt("amVerCode", sharedProjectPackageInfo.getAmVersionCode());
            bundle.putString("amVerName", sharedProjectPackageInfo.getAmVersionString());
            Timestamp shareDate = sharedProjectPackageInfo.getShareDate();
            bundle.putLong("shareDate", (shareDate == null || (date = shareDate.toDate()) == null) ? 0L : date.getTime());
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            bundle.putBoolean("sp", jVar.getUpdateSp());
            Unit unit = Unit.INSTANCE;
            iFVar.n(new j.fuX("alink_import_begin", bundle));
            final AlertDialog alertDialogCreate = new AlertDialog.Builder(componentActivity).Uo(2132019882).rl(false).create();
            Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
            alertDialogCreate.show();
            qj.rl(new RequestProjectDownloadRequest(str, str2, AppLovinBridge.f61290h, 1028425, z3, fux.rl() ? jVar.getAcctTestMode() : "normal"), new Function1() { // from class: Fg.pO
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return afx.w6.p5(alertDialogCreate, componentActivity, i28, z2, iFVar, str2, vdVar, function2, str, sharedProjectPackageInfo, (Result) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit eF(QmE.iF iFVar, String str, String str2) {
            iFVar.n(new j.Um(str, str2));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ofS(QmE.iF iFVar, String str, ComponentActivity componentActivity, wQ.QJ qj, String str2, kgE.fuX fux, SharedProjectPackageInfo sharedProjectPackageInfo, com.google.firebase.storage.I28 i28, boolean z2, GJW.vd vdVar, Function2 function2, DialogInterface dialogInterface, int i2) {
            iFVar.n(new j.MKd(str));
            dialogInterface.dismiss();
            M7(iFVar, componentActivity, qj, str2, str, fux, sharedProjectPackageInfo, i28, z2, vdVar, function2, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void pJg(QmE.iF iFVar, String str, DialogInterface dialogInterface, int i2) {
            iFVar.n(new j.C1435Dt(str));
            dialogInterface.dismiss();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = new w6(this.f2875O, this.J2, this.f2884r, this.f2883o, this.f2879Z, this.f2876S, this.f2881g, this.E2, this.f2880e, this.f2878X, this.f2877T, this.f2874N, continuation);
            w6Var.f2885t = obj;
            return w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objJ2;
            final GJW.vd vdVar;
            final Uri uri;
            CN3 cn3M7;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2882n;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    GJW.vd vdVar2 = (GJW.vd) this.f2885t;
                    ComponentActivity componentActivity = this.f2875O;
                    String string = this.J2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    QmE.iF iFVar = this.f2884r;
                    this.f2885t = vdVar2;
                    this.f2882n = 1;
                    objJ2 = wQ.w6.J2(componentActivity, string, iFVar, false, this, 4, null);
                    if (objJ2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    vdVar = vdVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    GJW.vd vdVar3 = (GJW.vd) this.f2885t;
                    ResultKt.throwOnFailure(obj);
                    vdVar = vdVar3;
                    objJ2 = obj;
                }
                uri = (Uri) objJ2;
                cn3M7 = afx.M7(uri);
            } catch (Exception unused) {
                this.f2883o.dismiss();
                AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.f2875O).o(2132019464).KN(this.J2.toString()).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: Fg.K
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        afx.w6.n1(dialogInterface, i3);
                    }
                });
                final Uri uri2 = this.J2;
                positiveButton.ty(new DialogInterface.OnDismissListener() { // from class: Fg.mz
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        afx.w6.Jk(uri2, dialogInterface);
                    }
                }).create().show();
            }
            if (cn3M7 == null) {
                this.f2883o.dismiss();
                afx.I(this.J2);
                return Unit.INSTANCE;
            }
            final String strRl = cn3M7.rl();
            final String strN = cn3M7.n();
            if (!this.f2879Z) {
                QmE.iF iFVar2 = this.f2884r;
                Bundle bundle = new Bundle();
                bundle.putString("uid", strRl);
                bundle.putString("projectId", strN);
                bundle.putBoolean("sp", com.alightcreative.app.motion.persist.j.INSTANCE.getUpdateSp());
                Unit unit = Unit.INSTANCE;
                iFVar2.n(new j.fuX("alink_launch", bundle));
            }
            final com.google.firebase.storage.I28 i28KN = this.f2879Z ? com.google.firebase.storage.I28.KN(com.google.firebase.Wre.ty("alt"), "gs://alight-creative-staging.appspot.com") : com.google.firebase.storage.I28.J2();
            Intrinsics.checkNotNull(i28KN);
            n.j jVar = com.google.firebase.functions.n.mUb;
            wQ.QJ qj = new wQ.QJ("getProjectMetadata", new n(jVar.t().ck("getProjectMetadata"), "getProjectMetadata"));
            final wQ.QJ qj2 = new wQ.QJ("requestProjectDownload", new C0104w6(jVar.t().ck("requestProjectDownload"), "requestProjectDownload"));
            AlightLinkMetadataRequest alightLinkMetadataRequest = new AlightLinkMetadataRequest(strRl, strN, AppLovinBridge.f61290h, 1028425, this.f2876S.rl() ? com.alightcreative.app.motion.persist.j.INSTANCE.getAcctTestMode() : "normal");
            final ComponentActivity componentActivity2 = this.f2875O;
            final AlertDialog alertDialog = this.f2883o;
            final QmE.iF iFVar3 = this.f2884r;
            final boolean z2 = this.f2881g;
            final kgE.fuX fux = this.f2876S;
            final boolean z3 = this.f2879Z;
            final String str = this.E2;
            final Uri uri3 = this.J2;
            final Function2 function2 = this.f2880e;
            final xAo.I28 i28 = this.f2878X;
            final InterfaceC2210n interfaceC2210n = this.f2877T;
            final nYs.Ml ml = this.f2874N;
            qj.rl(alightLinkMetadataRequest, new Function1() { // from class: Fg.DAz
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return afx.w6.P5(componentActivity2, alertDialog, iFVar3, uri, z2, fux, z3, strN, str, strRl, uri3, function2, i28, interfaceC2210n, ml, qj2, i28KN, vdVar, (Result) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void B(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void D(Uri uri, DialogInterface dialogInterface) {
            afx.I(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void FX(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String G7(SharedProjectPackageInfo sharedProjectPackageInfo) {
            return "Load medium thumbnail : '" + sharedProjectPackageInfo.getMedThumbUrl() + "'";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void J(ComponentActivity componentActivity, DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            ot.j.rl(componentActivity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Jk(Uri uri, DialogInterface dialogInterface) {
            afx.I(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Mx(Uri uri, DialogInterface dialogInterface) {
            afx.I(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Y(Uri uri, DialogInterface dialogInterface) {
            afx.I(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void dR0(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String eTf(SharedProjectPackageInfo sharedProjectPackageInfo) {
            return "Load medium thumbnail : '" + sharedProjectPackageInfo.getMedThumbUrl() + "'";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void eWT(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void fcU(Uri uri, DialogInterface dialogInterface) {
            afx.I(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ijL(Uri uri, DialogInterface dialogInterface) {
            afx.I(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n1(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p5(AlertDialog alertDialog, ComponentActivity componentActivity, com.google.firebase.storage.I28 i28, boolean z2, final QmE.iF iFVar, final String str, final GJW.vd vdVar, final Function2 function2, final String str2, final SharedProjectPackageInfo sharedProjectPackageInfo, Result result) {
            String message;
            int i2;
            String string;
            String localizedMessage;
            alertDialog.dismiss();
            Object value = result.getValue();
            if (Result.m319isFailureimpl(value)) {
                value = null;
            }
            RequestProjectDownloadResponse requestProjectDownloadResponse = (RequestProjectDownloadResponse) value;
            if (requestProjectDownloadResponse != null && Intrinsics.areEqual(requestProjectDownloadResponse.getResult(), "success") && requestProjectDownloadResponse.getDownloadUri() != null) {
                afx.g(componentActivity, i28, requestProjectDownloadResponse.getDownloadUri(), z2, new Function1() { // from class: Fg.Sis
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return afx.w6.eF(iFVar, str, (String) obj);
                    }
                }, new Function1() { // from class: Fg.l4Z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return afx.w6.E(vdVar, iFVar, function2, str, str2, sharedProjectPackageInfo, (LM.aC) obj);
                    }
                });
            } else {
                Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(result.getValue());
                String str3 = "Unknown";
                if (thM316exceptionOrNullimpl == null || (message = thM316exceptionOrNullimpl.getMessage()) == null) {
                    message = "Unknown";
                }
                iFVar.n(new j.Um(str, message));
                AlertDialog.Builder builder = new AlertDialog.Builder(componentActivity);
                if (z2) {
                    i2 = 2132019910;
                } else {
                    i2 = 2132019402;
                }
                AlertDialog.Builder builderO = builder.o(i2);
                if (z2) {
                    string = componentActivity.getString(2132019909);
                } else {
                    if (thM316exceptionOrNullimpl != null && (localizedMessage = thM316exceptionOrNullimpl.getLocalizedMessage()) != null) {
                        str3 = localizedMessage;
                    }
                    string = "Reason: " + str3;
                }
                builderO.KN(string).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: Fg.OU
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        afx.w6.FX(dialogInterface, i3);
                    }
                }).create().show();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void piY(nYs.Ml ml, ComponentActivity componentActivity, xAo.I28 i28, InterfaceC2210n interfaceC2210n, DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            nYs.j jVarInvoke = ml.invoke();
            if (jVarInvoke != null && jVarInvoke.Xw()) {
                GJW.C.nr(LifecycleOwnerKt.n(componentActivity), null, null, new j(interfaceC2210n, null), 3, null);
            } else {
                xAo.I28.o(i28, xAo.nKK.f75290n, null, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ul(Uri uri, DialogInterface dialogInterface) {
            afx.I(uri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void xg(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(QmE.iF iFVar, ComponentActivity componentActivity, wQ.QJ qj, String str, String str2, kgE.fuX fux, SharedProjectPackageInfo sharedProjectPackageInfo, com.google.firebase.storage.I28 i28, boolean z2, GJW.vd vdVar, Function2 function2, DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            M7(iFVar, componentActivity, qj, str, str2, fux, sharedProjectPackageInfo, i28, z2, vdVar, function2, true);
        }
    }

    public static /* synthetic */ boolean E(ComponentActivity componentActivity, Uri uri, boolean z2, boolean z3, QmE.iF iFVar, kgE.fuX fux, xAo.I28 i28, String str, InterfaceC2210n interfaceC2210n, nYs.Ml ml, Function2 function2, int i2, Object obj) {
        return eF(componentActivity, uri, z2, z3, iFVar, fux, i28, (i2 & 64) != 0 ? null : str, interfaceC2210n, ml, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Uri uri) {
        f2856n.remove(uri);
        rl.put(uri, Long.valueOf(System.nanoTime() / ((long) 1000000)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(Function1 function1, Activity activity, boolean z2, ProgressDialog progressDialog, File file, MalformedSceneException e2) {
        String string;
        Intrinsics.checkNotNullParameter(e2, "e");
        String message = e2.getMessage();
        if (message == null) {
            message = "Unknown";
        }
        function1.invoke(message);
        te(activity, progressDialog, file);
        AlertDialog.Builder builderO = new AlertDialog.Builder(activity).o(z2 ? 2132019910 : 2132019402);
        if (z2) {
            string = activity.getString(2132019909);
        } else {
            string = "Reason: " + e2.getMessage();
        }
        builderO.KN(string).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: Fg.QJ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                afx.N(dialogInterface, i2);
            }
        }).create().show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(Function1 function1, Activity activity, boolean z2, ProgressDialog progressDialog, File file, Exception it) {
        String string;
        Intrinsics.checkNotNullParameter(it, "it");
        String message = it.getMessage();
        if (message == null) {
            message = "Unknown";
        }
        function1.invoke(message);
        te(activity, progressDialog, file);
        AlertDialog.Builder builderO = new AlertDialog.Builder(activity).o(z2 ? 2132019910 : 2132017700);
        if (z2) {
            string = activity.getString(2132019909);
        } else {
            string = "Reason: " + it.getMessage();
        }
        builderO.KN(string).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: Fg.qz
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                afx.P5(dialogInterface, i2);
            }
        }).create().show();
    }

    public static final xuv ViF(ComponentActivity componentActivity, Intent intent, boolean z2, boolean z3, QmE.iF eventLogger, kgE.fuX iapManager, xAo.I28 crisperManager, boolean z4, Function2 onImportComplete, InterfaceC2210n injet, nYs.Ml getAlightSettingsUseCase) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(crisperManager, "crisperManager");
        Intrinsics.checkNotNullParameter(onImportComplete, "onImportComplete");
        Intrinsics.checkNotNullParameter(injet, "injet");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        return GJW.C.nr(LifecycleOwnerKt.n(componentActivity), null, null, new j(componentActivity, intent, eventLogger, z4, z2, z3, iapManager, crisperManager, injet, getAlightSettingsUseCase, onImportComplete, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Xw(ProgressDialog progressDialog, Ml.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.rl() > 0 && it.n() <= it.rl()) {
            long j2 = 1024;
            progressDialog.setMax((int) (it.rl() / j2));
            progressDialog.setProgress((int) (it.n() / j2));
        }
        return Unit.INSTANCE;
    }

    private static final void a(Uri uri) {
        f2856n.put(uri, Long.valueOf(System.nanoTime() / ((long) 1000000)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String bzg(String str) {
        return "downloadAndImportPackagedProject projectUrl=" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function1 function1, Activity activity, boolean z2, ProgressDialog progressDialog, File file, IOException e2) {
        String string;
        Intrinsics.checkNotNullParameter(e2, "e");
        String message = e2.getMessage();
        if (message == null) {
            message = "Unknown";
        }
        function1.invoke(message);
        te(activity, progressDialog, file);
        AlertDialog.Builder builderO = new AlertDialog.Builder(activity).o(z2 ? 2132019910 : 2132019402);
        if (z2) {
            string = activity.getString(2132019909);
        } else {
            string = "Reason: " + e2.getMessage();
        }
        builderO.KN(string).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: Fg.z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                afx.X(dialogInterface, i2);
            }
        }).create().show();
        return Unit.INSTANCE;
    }

    public static final boolean eF(ComponentActivity componentActivity, Uri link, boolean z2, boolean z3, QmE.iF eventLogger, kgE.fuX iapManager, xAo.I28 crisperManager, String str, InterfaceC2210n injet, nYs.Ml getAlightSettingsUseCase, Function2 importCompleteListener) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(crisperManager, "crisperManager");
        Intrinsics.checkNotNullParameter(injet, "injet");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(importCompleteListener, "importCompleteListener");
        CN3 cn3M7 = M7(link);
        if (cn3M7 != null) {
            eventLogger.n(new j.a(cn3M7.n(), cn3M7.rl()));
        }
        if (((Boolean) iapManager.ck().getValue()).booleanValue() || z2) {
            return M(componentActivity, link, false, importCompleteListener, z3, eventLogger, iapManager, crisperManager, str, injet, getAlightSettingsUseCase);
        }
        FirebaseAuth.getInstance().t(new n(eventLogger, componentActivity, link, importCompleteListener, z3, iapManager, crisperManager, str, injet, getAlightSettingsUseCase));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fD(Function1 function1, Activity activity, boolean z2, ProgressDialog progressDialog, File file, VideoResolutionTooHighException e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        String message = e2.getMessage();
        if (message == null) {
            message = "Unknown";
        }
        function1.invoke(message);
        te(activity, progressDialog, file);
        new AlertDialog.Builder(activity).o(z2 ? 2132019910 : 2132019402).KN(activity.getString(2132019814, Integer.valueOf(e2.getWidth()), Integer.valueOf(e2.getHeight()), Integer.valueOf(e2.getMaxRes()))).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: Fg.eO
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                afx.E2(dialogInterface, i2);
            }
        }).create().show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit iF(final Activity activity, final File file, final Function1 function1, final String str, final boolean z2, final ProgressDialog progressDialog, final Function1 function12, Ml.j jVar) {
        AsyncTaskC1374z asyncTaskC1374zNr = HI0.qz.nr(null, new Function0() { // from class: Fg.g9s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return afx.v(activity, file, function1, str);
            }
        }, 1, null);
        Function1 function13 = new Function1() { // from class: Fg.Dsr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return afx.fD(function1, activity, z2, progressDialog, file, (VideoResolutionTooHighException) obj);
            }
        };
        AsyncTask.Status status = asyncTaskC1374zNr.getStatus();
        AsyncTask.Status status2 = AsyncTask.Status.PENDING;
        if (status != status2) {
            throw new IllegalStateException("Check failed.");
        }
        asyncTaskC1374zNr.J2(new HI0.eO(asyncTaskC1374zNr.nr(), Reflection.getOrCreateKotlinClass(VideoResolutionTooHighException.class), asyncTaskC1374zNr, function13));
        Function1 function14 = new Function1() { // from class: Fg.aC
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return afx.e(function1, activity, z2, progressDialog, file, (IOException) obj);
            }
        };
        if (asyncTaskC1374zNr.getStatus() != status2) {
            throw new IllegalStateException("Check failed.");
        }
        asyncTaskC1374zNr.J2(new HI0.eO(asyncTaskC1374zNr.nr(), Reflection.getOrCreateKotlinClass(IOException.class), asyncTaskC1374zNr, function14));
        Function1 function15 = new Function1() { // from class: Fg.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return afx.T(function1, activity, z2, progressDialog, file, (MalformedSceneException) obj);
            }
        };
        if (asyncTaskC1374zNr.getStatus() != status2) {
            throw new IllegalStateException("Check failed.");
        }
        asyncTaskC1374zNr.J2(new HI0.eO(asyncTaskC1374zNr.nr(), Reflection.getOrCreateKotlinClass(MalformedSceneException.class), asyncTaskC1374zNr, function15));
        asyncTaskC1374zNr.Uo(new Function1() { // from class: Fg.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return afx.nHg(z2, activity, progressDialog, file, function12, (LM.aC) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jB(Function1 function1, Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        function1.invoke(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nHg(boolean z2, Activity activity, ProgressDialog progressDialog, File file, final Function1 function1, final LM.aC it) {
        Intrinsics.checkNotNullParameter(it, "it");
        te(activity, progressDialog, file);
        final Function0 function0 = new Function0() { // from class: Fg.Pl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return afx.s7N(function1, it);
            }
        };
        if (z2 || it.J2() <= 0) {
            function0.invoke();
        } else {
            new AlertDialog.Builder(activity).setTitle("Missing Media").KN("Some of the media required by the project could not be found in the project package. The package has been imported anyway, but may not work properly.").setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: Fg.Xo
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    afx.wTp(function0, dialogInterface, i2);
                }
            }).rl(false).create().show();
        }
        return Unit.INSTANCE;
    }

    public static final CN3 p5(String templateLink) {
        Intrinsics.checkNotNullParameter(templateLink, "templateLink");
        List listDrop = CollectionsKt.drop(StringsKt.split$default((CharSequence) templateLink, new String[]{"/"}, false, 0, 6, (Object) null), 1);
        if (listDrop.size() < 4) {
            return null;
        }
        String str = (String) listDrop.get(0);
        String str2 = (String) listDrop.get(1);
        String str3 = (String) listDrop.get(2);
        String str4 = (String) listDrop.get(3);
        if (Intrinsics.areEqual(str, "u") && Intrinsics.areEqual(str3, TtmlNode.TAG_P)) {
            return new CN3(str2, str4);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private static final boolean D(Uri uri) {
        long jLongValue;
        long jNanoTime = System.nanoTime() / ((long) 1000000);
        Long l2 = (Long) f2856n.get(uri);
        long jLongValue2 = 0;
        if (l2 != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        if (jNanoTime - jLongValue >= 15000) {
            Long l5 = (Long) rl.get(uri);
            if (l5 != null) {
                jLongValue2 = l5.longValue();
            }
            if (jNanoTime - jLongValue2 >= 500) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E2(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FX(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Uri uri, DialogInterface dialogInterface) {
        I(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M(ComponentActivity componentActivity, final Uri uri, boolean z2, Function2 function2, boolean z3, QmE.iF iFVar, kgE.fuX fux, xAo.I28 i28, String str, InterfaceC2210n interfaceC2210n, nYs.Ml ml) {
        int i2;
        if (!XoT.fuX.Ik(componentActivity)) {
            new AlertDialog.Builder(componentActivity).o(2132019733).setNegativeButton(2132017378, new DialogInterface.OnClickListener() { // from class: Fg.fuX
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    afx.FX(dialogInterface, i3);
                }
            }).create().show();
            return false;
        }
        String host = uri.getHost();
        String str2 = "";
        if (host == null) {
            host = "";
        }
        if (!StringsKt.endsWith$default(host, ".link", false, 2, (Object) null)) {
            String path = uri.getPath();
            if (path != null) {
                str2 = path;
            }
            if (!StringsKt.startsWith$default(str2, "/am/share/u/", false, 2, (Object) null)) {
                new AlertDialog.Builder(componentActivity).o(2132019464).KN(uri.toString()).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: Fg.l3D
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        afx.B(dialogInterface, i3);
                    }
                }).ty(new DialogInterface.OnDismissListener() { // from class: Fg.c
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        afx.J(uri, dialogInterface);
                    }
                }).create().show();
                return false;
            }
        }
        if (D(uri) && !z2) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(componentActivity);
        if (z2) {
            i2 = 2132020420;
        } else {
            i2 = 2132020419;
        }
        AlertDialog alertDialogCreate = builder.Uo(i2).rl(false).create();
        Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
        alertDialogCreate.show();
        a(uri);
        GJW.C.nr(LifecycleOwnerKt.n(componentActivity), null, null, new w6(componentActivity, uri, iFVar, alertDialogCreate, z2, fux, z3, str, function2, i28, interfaceC2210n, ml, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CN3 M7(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        List listDrop = CollectionsKt.drop(pathSegments, 2);
        if (listDrop.size() < 4) {
            return null;
        }
        String str = (String) listDrop.get(0);
        String str2 = (String) listDrop.get(1);
        String str3 = (String) listDrop.get(2);
        String str4 = (String) listDrop.get(3);
        if (!Intrinsics.areEqual(str, "u") || !Intrinsics.areEqual(str3, TtmlNode.TAG_P)) {
            return null;
        }
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(str4);
        return new CN3(str2, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P5(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final Activity activity, com.google.firebase.storage.I28 i28, final String str, final boolean z2, final Function1 function1, final Function1 function12) {
        com.google.firebase.storage.o oVarRl = i28.ty().rl(str);
        Intrinsics.checkNotNullExpressionValue(oVarRl, "child(...)");
        XoT.C.Uo(activity, new Function0() { // from class: Fg.s4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return afx.bzg(str);
            }
        });
        final ProgressDialog progressDialog = new ProgressDialog(activity);
        progressDialog.setTitle(2132019913);
        progressDialog.setProgressStyle(1);
        progressDialog.setProgressNumberFormat(null);
        progressDialog.setCancelable(false);
        progressDialog.show();
        File cacheDir = activity.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        final File fileResolve = FilesKt.resolve(FilesKt.resolve(cacheDir, AppLovinEventTypes.USER_SHARED_LINK), "import_" + System.currentTimeMillis() + ".tmp");
        if (!fileResolve.exists()) {
            File parentFile = fileResolve.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            HI0.Ml.KN(activity);
            com.google.firebase.storage.Ml mlXMQ = oVarRl.xMQ(fileResolve);
            final Function1 function13 = new Function1() { // from class: Fg.UGc
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return afx.Xw(progressDialog, (Ml.j) obj);
                }
            };
            com.google.firebase.storage.g9s g9sVarCk = mlXMQ.r(new com.google.firebase.storage.aC() { // from class: Fg.Q
                @Override // com.google.firebase.storage.aC
                public final void n(Object obj) {
                    afx.jB(function13, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: Fg.r
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    afx.U(function1, activity, z2, progressDialog, fileResolve, exc);
                }
            });
            final Function1 function14 = new Function1() { // from class: Fg.SPz
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return afx.iF(activity, fileResolve, function1, str, z2, progressDialog, function12, (Ml.j) obj);
                }
            };
            g9sVarCk.addOnSuccessListener(new OnSuccessListener() { // from class: Fg.ci
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    afx.rV9(function14, obj);
                }
            });
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rV9(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s7N(Function1 function1, LM.aC aCVar) {
        function1.invoke(aCVar);
        return Unit.INSTANCE;
    }

    private static final void te(Activity activity, ProgressDialog progressDialog, File file) {
        if (!activity.isDestroyed()) {
            progressDialog.dismiss();
            HI0.Ml.nr(activity);
        }
        file.delete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LM.aC v(Activity activity, File file, Function1 function1, String str) {
        return qYU.Xw(activity, file, function1, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wTp(Function0 function0, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        function0.invoke();
    }
}

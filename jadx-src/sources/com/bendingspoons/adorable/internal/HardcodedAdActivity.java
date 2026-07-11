package com.bendingspoons.adorable.internal;

import GJW.vd;
import GJW.yg;
import Rxk.C;
import ScC.j;
import TFv.CN3;
import TFv.SPz;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcherKt;
import androidx.view.ViewModelLazy;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.compose.ComponentActivityKt;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.InitializerViewModelFactoryBuilder;
import com.bendingspoons.adorable.internal.HardcodedAdActivity;
import com.bendingspoons.adorable.internal.Ml;
import com.bendingspoons.adorable.internal.j;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.Constants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.json.JSONObject;
import xFr.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/bendingspoons/adorable/internal/HardcodedAdActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "Lcom/bendingspoons/adorable/internal/j;", "actions", "", "fcU", "(Ljava/util/List;)V", "", Constants.PLACEMENT_TYPE_REWARDED, "Mx", "(Z)V", "n1", "ul", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/bendingspoons/adorable/internal/I28;", c.f62177j, "Lkotlin/Lazy;", "G7", "()Lcom/bendingspoons/adorable/internal/I28;", "viewModel", "Lcom/bendingspoons/adorable/internal/HardcodedAdActivity$j;", "t", "Lcom/bendingspoons/adorable/internal/HardcodedAdActivity$j;", "args", "O", "j", "adorable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHardcodedAdActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardcodedAdActivity.kt\ncom/bendingspoons/adorable/internal/HardcodedAdActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,168:1\n70#2,11:169\n1#3:180\n35#4:181\n77#4,2:182\n*S KotlinDebug\n*F\n+ 1 HardcodedAdActivity.kt\ncom/bendingspoons/adorable/internal/HardcodedAdActivity\n*L\n32#1:169,11\n33#1:181\n34#1:182,2\n*E\n"})
public final class HardcodedAdActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(com.bendingspoons.adorable.internal.I28.class), new I28(this), new Function0() { // from class: gp.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HardcodedAdActivity.qm();
        }
    }, new Wre(null, this));

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private j args;
    public static final int J2 = 8;

    public static final class I28 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f51177n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(ComponentActivity componentActivity) {
            super(0);
            this.f51177n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f51177n.getViewModelStore();
        }
    }

    static final class Ml implements Function2 {

        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, com.bendingspoons.adorable.internal.I28.class, "onCloseClicked", "onCloseClicked()V", 0);
            }

            public final void n() {
                ((com.bendingspoons.adorable.internal.I28) this.receiver).KN();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
            n(Object obj) {
                super(0, obj, com.bendingspoons.adorable.internal.I28.class, "onAdClicked", "onAdClicked()V", 0);
            }

            public final void n() {
                ((com.bendingspoons.adorable.internal.I28) this.receiver).J2();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        Ml() {
        }

        static final class w6 extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f51179n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ HardcodedAdActivity f51180t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            w6(HardcodedAdActivity hardcodedAdActivity, Continuation continuation) {
                super(2, continuation);
                this.f51180t = hardcodedAdActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new w6(this.f51180t, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f51179n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    j jVar = this.f51180t.args;
                    if (jVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("args");
                        jVar = null;
                    }
                    long jRl = jVar.rl();
                    this.f51179n = 1;
                    if (yg.rl(jRl, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f51180t.G7().Uo();
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1580310343, i2, -1, "com.bendingspoons.adorable.internal.HardcodedAdActivity.onCreate.<anonymous> (HardcodedAdActivity.kt:56)");
            }
            j jVar = HardcodedAdActivity.this.args;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("args");
                jVar = null;
            }
            int iKN = jVar.KN();
            j jVar2 = HardcodedAdActivity.this.args;
            if (jVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("args");
                jVar2 = null;
            }
            int iT = jVar2.t();
            Ml.j jVarRl = ((com.bendingspoons.adorable.internal.Ml) SnapshotStateKt.rl(HardcodedAdActivity.this.G7().t(), null, composer, 0, 1).getValue()).rl();
            com.bendingspoons.adorable.internal.I28 i28G7 = HardcodedAdActivity.this.G7();
            composer.eF(-745755626);
            boolean zE2 = composer.E2(i28G7);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new j(i28G7);
                composer.o(objIF);
            }
            composer.Xw();
            Function0 function0 = (Function0) ((KFunction) objIF);
            composer.eF(-745752950);
            boolean zE22 = composer.E2(HardcodedAdActivity.this);
            final HardcodedAdActivity hardcodedAdActivity = HardcodedAdActivity.this;
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: com.bendingspoons.adorable.internal.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HardcodedAdActivity.Ml.t(hardcodedAdActivity);
                    }
                };
                composer.o(objIF2);
            }
            Function0 function02 = (Function0) objIF2;
            composer.Xw();
            com.bendingspoons.adorable.internal.I28 i28G72 = HardcodedAdActivity.this.G7();
            composer.eF(-745732653);
            boolean zE23 = composer.E2(i28G72);
            Object objIF3 = composer.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new n(i28G72);
                composer.o(objIF3);
            }
            composer.Xw();
            com.bendingspoons.adorable.internal.w6.aYN(iKN, iT, jVarRl, function0, function02, (Function0) ((KFunction) objIF3), 0, composer, 0, 64);
            j jVar3 = HardcodedAdActivity.this.args;
            if (jVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("args");
                jVar3 = null;
            }
            if (jVar3.rl() >= 0) {
                composer.eF(-745728223);
                boolean zE24 = composer.E2(HardcodedAdActivity.this);
                HardcodedAdActivity hardcodedAdActivity2 = HardcodedAdActivity.this;
                Object objIF4 = composer.iF();
                if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                    objIF4 = new w6(hardcodedAdActivity2, null);
                    composer.o(objIF4);
                }
                composer.Xw();
                EffectsKt.O(null, (Function2) objIF4, composer, 6);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(HardcodedAdActivity hardcodedAdActivity) {
            hardcodedAdActivity.G7().mUb();
            k.Wre wre = k.Wre.f69648n;
            k.I28 i28 = k.I28.J2;
            j jVar = hardcodedAdActivity.args;
            j jVar2 = null;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("args");
                jVar = null;
            }
            String strO = jVar.O();
            j jVar3 = hardcodedAdActivity.args;
            if (jVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("args");
                jVar3 = null;
            }
            String strJ2 = jVar3.J2();
            j jVar4 = hardcodedAdActivity.args;
            if (jVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("args");
            } else {
                jVar2 = jVar4;
            }
            k.Ml mlRl = wre.rl(i28, strO, null, "", "", "", strJ2, jVar2.n());
            ScC.j.f9792n.rl().invoke(mlRl.n(), mlRl.rl());
            return Unit.INSTANCE;
        }
    }

    public static final class Wre extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f51181n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f51182t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f51181n = function0;
            this.f51182t = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f51181n;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f51182t.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static final class j {
        private final String J2;
        private final pq.Ml KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final String f51183O;
        private final long Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f51184n;
        private final j.n nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f51185t;
        public static final C0716j xMQ = new C0716j(null);
        public static final int mUb = 8;

        /* JADX INFO: renamed from: com.bendingspoons.adorable.internal.HardcodedAdActivity$j$j, reason: collision with other inner class name */
        public static final class C0716j {
            public /* synthetic */ C0716j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0716j() {
            }

            public final j n(Bundle bundle) {
                pq.Ml ml;
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                int i2 = bundle.getInt("videoId");
                int i3 = bundle.getInt("closeIconId");
                String string = bundle.getString("url");
                Intrinsics.checkNotNull(string);
                String string2 = bundle.getString("emulatedType");
                Intrinsics.checkNotNull(string2);
                j.n nVarValueOf = j.n.valueOf(string2);
                String string3 = bundle.getString("location");
                Intrinsics.checkNotNull(string3);
                String string4 = bundle.getString("rewardContent");
                long j2 = bundle.getLong("closeButtonDelayMillis");
                String string5 = bundle.getString("additionalInfo");
                if (string5 == null || (ml = fuX.xMQ(new JSONObject(string5))) == null) {
                    ml = new pq.Ml();
                }
                return new j(i2, i3, string, nVarValueOf, string3, string4, j2, ml);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f51184n == jVar.f51184n && this.rl == jVar.rl && Intrinsics.areEqual(this.f51185t, jVar.f51185t) && this.nr == jVar.nr && Intrinsics.areEqual(this.f51183O, jVar.f51183O) && Intrinsics.areEqual(this.J2, jVar.J2) && this.Uo == jVar.Uo && Intrinsics.areEqual(this.KN, jVar.KN);
        }

        public int hashCode() {
            int iHashCode = ((((((((Integer.hashCode(this.f51184n) * 31) + Integer.hashCode(this.rl)) * 31) + this.f51185t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f51183O.hashCode()) * 31;
            String str = this.J2;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.Uo)) * 31) + this.KN.hashCode();
        }

        public String toString() {
            return "Args(videoId=" + this.f51184n + ", closeIconId=" + this.rl + ", url=" + this.f51185t + ", emulatedType=" + this.nr + ", location=" + this.f51183O + ", rewardContent=" + this.J2 + ", closeButtonDelayMillis=" + this.Uo + ", additionalInfo=" + this.KN + ")";
        }

        public j(int i2, int i3, String url, j.n emulatedType, String location, String str, long j2, pq.Ml additionalInfo) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(emulatedType, "emulatedType");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
            this.f51184n = i2;
            this.rl = i3;
            this.f51185t = url;
            this.nr = emulatedType;
            this.f51183O = location;
            this.J2 = str;
            this.Uo = j2;
            this.KN = additionalInfo;
        }

        public final String J2() {
            return this.J2;
        }

        public final int KN() {
            return this.f51184n;
        }

        public final String O() {
            return this.f51183O;
        }

        public final String Uo() {
            return this.f51185t;
        }

        public final pq.Ml n() {
            return this.KN;
        }

        public final j.n nr() {
            return this.nr;
        }

        public final long rl() {
            return this.Uo;
        }

        public final int t() {
            return this.rl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Rl(DialogInterface dialogInterface, int i2) {
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51186n;

        static final class j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ HardcodedAdActivity f51188n;

            j(HardcodedAdActivity hardcodedAdActivity) {
                this.f51188n = hardcodedAdActivity;
            }

            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(List list, Continuation continuation) {
                this.f51188n.fcU(list);
                return Unit.INSTANCE;
            }
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HardcodedAdActivity.this.new w6(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51186n;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                SPz sPzRl = HardcodedAdActivity.this.G7().rl();
                j jVar = new j(HardcodedAdActivity.this);
                this.f51186n = 1;
                if (sPzRl.n(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.bendingspoons.adorable.internal.I28 G7() {
        return (com.bendingspoons.adorable.internal.I28) this.viewModel.getValue();
    }

    private final void Mx(boolean rewarded) {
        Intent intent = new Intent();
        intent.putExtra(Constants.PLACEMENT_TYPE_REWARDED, rewarded);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eWT(HardcodedAdActivity hardcodedAdActivity, OnBackPressedCallback addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        hardcodedAdActivity.G7().KN();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.bendingspoons.adorable.internal.I28 mYa(CreationExtras initializer) {
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        return new com.bendingspoons.adorable.internal.I28();
    }

    private final void n1() {
        new nv.n(new ContextThemeWrapper(this, C.J2)).setTitle(getResources().getString(k.CN3.nr)).KN(getResources().getString(k.CN3.f69638t)).mUb(getResources().getString(k.CN3.f69637n), new DialogInterface.OnClickListener() { // from class: gp.w6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                HardcodedAdActivity.Jk(this.f67669n, dialogInterface, i2);
            }
        }).ck(getResources().getString(k.CN3.rl), new DialogInterface.OnClickListener() { // from class: gp.Ml
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                HardcodedAdActivity.Rl(dialogInterface, i2);
            }
        }).XQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory qm() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.n(Reflection.getOrCreateKotlinClass(com.bendingspoons.adorable.internal.I28.class), new Function1() { // from class: gp.I28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HardcodedAdActivity.mYa((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.rl();
    }

    private final void ul() {
        YgZ.Ml ml = YgZ.Ml.f12213n;
        j jVar = this.args;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("args");
            jVar = null;
        }
        YgZ.Ml.rl(ml, this, jVar.Uo(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jk(HardcodedAdActivity hardcodedAdActivity, DialogInterface dialogInterface, int i2) {
        hardcodedAdActivity.G7().xMQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fcU(List actions) {
        com.bendingspoons.adorable.internal.j jVar = (com.bendingspoons.adorable.internal.j) CollectionsKt.firstOrNull(actions);
        if (jVar != null) {
            if (jVar instanceof j.C0717j) {
                Mx(((j.C0717j) jVar).n());
            } else if (Intrinsics.areEqual(jVar, j.w6.f51199n)) {
                n1();
            } else if (Intrinsics.areEqual(jVar, j.n.f51198n)) {
                ul();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            G7().O();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        j.C0716j c0716j = j.xMQ;
        Bundle extras = getIntent().getExtras();
        Intrinsics.checkNotNull(extras);
        this.args = c0716j.n(extras);
        OnBackPressedDispatcherKt.rl(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: gp.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HardcodedAdActivity.eWT(this.f67660n, (OnBackPressedCallback) obj);
            }
        }, 3, null);
        GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new w6(null), 3, null);
        com.bendingspoons.adorable.internal.I28 i28G7 = G7();
        j jVar = this.args;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("args");
            jVar = null;
        }
        i28G7.nr(jVar.nr());
        ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(1580310343, true, new Ml()), 1, null);
    }
}

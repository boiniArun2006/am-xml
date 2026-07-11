package androidx.compose.foundation.text.selection;

import GJW.C;
import GJW.h;
import GJW.vd;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1", f = "TextFieldSelectionManager.kt", i = {0, 0}, l = {781}, m = "invokeSuspend", n = {"copy", "cut"}, s = {"L$0", "L$1"})
final class TextFieldSelectionManager$showSelectionToolbar$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ TextFieldSelectionManager J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f20970O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f20971n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f20972t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$showSelectionToolbar$1(TextFieldSelectionManager textFieldSelectionManager, Continuation continuation) {
        super(2, continuation);
        this.J2 = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$showSelectionToolbar$1(this.J2, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((TextFieldSelectionManager$showSelectionToolbar$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LegacyTextFieldState state;
        Function0<Unit> function0;
        Function0<Unit> function02;
        Function0<Unit> function03;
        Function0<Unit> function04;
        Function0<Unit> function05;
        TextToolbar textToolbar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f20970O;
        boolean z2 = false;
        Function0<Unit> function06 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                function03 = (Function0) this.f20972t;
                function0 = (Function0) this.f20971n;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.J2.T() && ((state = this.J2.getState()) == null || state.g())) {
                boolean z3 = this.J2.getVisualTransformation() instanceof PasswordVisualTransformation;
                if (!TextRange.KN(this.J2.p5().getSelection()) && !z3) {
                    final TextFieldSelectionManager textFieldSelectionManager = this.J2;
                    function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$copy$1

                        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$copy$1$1, reason: invalid class name */
                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                        @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$copy$1$1", f = "TextFieldSelectionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                            int f20975n;

                            /* JADX INFO: renamed from: t, reason: collision with root package name */
                            final /* synthetic */ TextFieldSelectionManager f20976t;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(TextFieldSelectionManager textFieldSelectionManager, Continuation continuation) {
                                super(2, continuation);
                                this.f20976t = textFieldSelectionManager;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object obj, Continuation continuation) {
                                return new AnonymousClass1(this.f20976t, continuation);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final Object invoke2(vd vdVar, Continuation continuation) {
                                return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                return invoke2(vdVar, (Continuation) continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.f20975n == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    TextFieldSelectionManager.r(this.f20976t, false, 1, null);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            vd coroutineScope = textFieldSelectionManager.getCoroutineScope();
                            if (coroutineScope != null) {
                                C.nr(coroutineScope, null, h.J2, new AnonymousClass1(textFieldSelectionManager, null), 1, null);
                            }
                            textFieldSelectionManager.M();
                        }
                    };
                } else {
                    function0 = null;
                }
                if (!TextRange.KN(this.J2.p5().getSelection()) && this.J2.X() && !z3) {
                    final TextFieldSelectionManager textFieldSelectionManager2 = this.J2;
                    function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$cut$1

                        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$cut$1$1, reason: invalid class name */
                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                        @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$cut$1$1", f = "TextFieldSelectionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                            int f20978n;

                            /* JADX INFO: renamed from: t, reason: collision with root package name */
                            final /* synthetic */ TextFieldSelectionManager f20979t;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(TextFieldSelectionManager textFieldSelectionManager, Continuation continuation) {
                                super(2, continuation);
                                this.f20979t = textFieldSelectionManager;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object obj, Continuation continuation) {
                                return new AnonymousClass1(this.f20979t, continuation);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final Object invoke2(vd vdVar, Continuation continuation) {
                                return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                return invoke2(vdVar, (Continuation) continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.f20978n == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.f20979t.XQ();
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }

                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            vd coroutineScope = textFieldSelectionManager2.getCoroutineScope();
                            if (coroutineScope != null) {
                                C.nr(coroutineScope, null, h.J2, new AnonymousClass1(textFieldSelectionManager2, null), 1, null);
                            }
                            textFieldSelectionManager2.M();
                        }
                    };
                } else {
                    function02 = null;
                }
                if (this.J2.X()) {
                    Clipboard clipboard = this.J2.getClipboard();
                    if (clipboard != null) {
                        this.f20971n = function0;
                        this.f20972t = function02;
                        this.f20970O = 1;
                        Object objN = clipboard.n(this);
                        if (objN == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        function03 = function02;
                        obj = objN;
                    }
                    if (!z2) {
                        final TextFieldSelectionManager textFieldSelectionManager3 = this.J2;
                        function04 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1

                            /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                            @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1$1", f = "TextFieldSelectionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                int f20981n;

                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                final /* synthetic */ TextFieldSelectionManager f20982t;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(TextFieldSelectionManager textFieldSelectionManager, Continuation continuation) {
                                    super(2, continuation);
                                    this.f20982t = textFieldSelectionManager;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation create(Object obj, Continuation continuation) {
                                    return new AnonymousClass1(this.f20982t, continuation);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final Object invoke2(vd vdVar, Continuation continuation) {
                                    return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                    return invoke2(vdVar, (Continuation) continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (this.f20981n == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.f20982t.B();
                                        return Unit.INSTANCE;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }

                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                vd coroutineScope = textFieldSelectionManager3.getCoroutineScope();
                                if (coroutineScope != null) {
                                    C.nr(coroutineScope, null, h.J2, new AnonymousClass1(textFieldSelectionManager3, null), 1, null);
                                }
                                textFieldSelectionManager3.M();
                            }
                        };
                    }
                    Function0<Unit> function07 = function02;
                    Function0<Unit> function08 = function0;
                    if (TextRange.mUb(this.J2.p5().getSelection()) != this.J2.p5().xMQ().length()) {
                        final TextFieldSelectionManager textFieldSelectionManager4 = this.J2;
                        function05 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$selectAll$1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                textFieldSelectionManager4.J();
                            }
                        };
                    } else {
                        function05 = null;
                    }
                    if (this.J2.X() && TextRange.KN(this.J2.p5().getSelection())) {
                        final TextFieldSelectionManager textFieldSelectionManager5 = this.J2;
                        function06 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$autofill$1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                textFieldSelectionManager5.HI();
                            }
                        };
                    }
                    Function0<Unit> function09 = function06;
                    textToolbar = this.J2.getTextToolbar();
                    if (textToolbar != null) {
                        textToolbar.nr(this.J2.te(), function08, function04, function07, function05, function09);
                    }
                    return Unit.INSTANCE;
                }
                function04 = null;
                Function0<Unit> function072 = function02;
                Function0<Unit> function082 = function0;
                if (TextRange.mUb(this.J2.p5().getSelection()) != this.J2.p5().xMQ().length()) {
                }
                if (this.J2.X()) {
                    final TextFieldSelectionManager textFieldSelectionManager52 = this.J2;
                    function06 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$autofill$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            textFieldSelectionManager52.HI();
                        }
                    };
                }
                Function0<Unit> function092 = function06;
                textToolbar = this.J2.getTextToolbar();
                if (textToolbar != null) {
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        ClipEntry clipEntry = (ClipEntry) obj;
        if (clipEntry != null && ClipboardUtils_androidKt.t(clipEntry)) {
            function02 = function03;
            z2 = true;
        } else {
            function02 = function03;
        }
        if (!z2) {
            function04 = null;
        }
        Function0<Unit> function0722 = function02;
        Function0<Unit> function0822 = function0;
        if (TextRange.mUb(this.J2.p5().getSelection()) != this.J2.p5().xMQ().length()) {
        }
        if (this.J2.X()) {
        }
        Function0<Unit> function0922 = function06;
        textToolbar = this.J2.getTextToolbar();
        if (textToolbar != null) {
        }
        return Unit.INSTANCE;
    }
}

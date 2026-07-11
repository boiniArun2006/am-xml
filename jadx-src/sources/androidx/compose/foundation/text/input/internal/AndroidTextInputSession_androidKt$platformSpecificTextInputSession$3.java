package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAndroidTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextInputSession.android.kt\nandroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 extends SuspendLambda implements Function2<GJW.vd, Continuation<?>, Object> {
    final /* synthetic */ Function1 E2;
    final /* synthetic */ TransformedTextFieldState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TFv.r f20032O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ ImeOptions f20033S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    final /* synthetic */ ViewConfiguration f20034X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ PlatformTextInputSession f20035Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0 f20036e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ReceiveContentConfiguration f20037g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f20038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ ComposeInputMethodManager f20039o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ TextLayoutState f20040r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f20041t;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<GJW.vd, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ComposeInputMethodManager f20042O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f20043n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TransformedTextFieldState f20044t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, Continuation continuation) {
            super(2, continuation);
            this.f20044t = transformedTextFieldState;
            this.f20042O = composeInputMethodManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f20044t, this.f20042O, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(GJW.vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(GJW.vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void O(ComposeInputMethodManager composeInputMethodManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2) {
            int iQie;
            long selection = textFieldCharSequence.getSelection();
            TextRange composition = textFieldCharSequence.getComposition();
            long selection2 = textFieldCharSequence2.getSelection();
            TextRange composition2 = textFieldCharSequence2.getComposition();
            if (z2) {
                composeInputMethodManager.rl();
                return;
            }
            if (TextRange.Uo(selection, selection2) && Intrinsics.areEqual(composition, composition2)) {
                return;
            }
            int iQie2 = TextRange.qie(selection2);
            int iGh = TextRange.gh(selection2);
            int iGh2 = -1;
            if (composition2 != null) {
                iQie = TextRange.qie(composition2.getPackedValue());
            } else {
                iQie = -1;
            }
            if (composition2 != null) {
                iGh2 = TextRange.gh(composition2.getPackedValue());
            }
            composeInputMethodManager.n(iQie2, iGh, iQie, iGh2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f20043n;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                TransformedTextFieldState transformedTextFieldState = this.f20044t;
                final ComposeInputMethodManager composeInputMethodManager = this.f20042O;
                TextFieldState.NotifyImeListener notifyImeListener = new TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text.input.internal.n
                    @Override // androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener
                    public final void n(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2) {
                        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.AnonymousClass1.O(composeInputMethodManager, textFieldCharSequence, textFieldCharSequence2, z2);
                    }
                };
                this.f20043n = 1;
                if (transformedTextFieldState.xMQ(notifyImeListener, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(this.f20032O, this.J2, this.f20040r, this.f20039o, this.f20035Z, this.f20033S, this.f20037g, this.E2, this.f20036e, this.f20034X, continuation);
        androidTextInputSession_androidKt$platformSpecificTextInputSession$3.f20041t = obj;
        return androidTextInputSession_androidKt$platformSpecificTextInputSession$3;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(GJW.vd vdVar, Continuation continuation) {
        return ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(TFv.r rVar, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, PlatformTextInputSession platformTextInputSession, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, Function1 function1, Function0 function0, ViewConfiguration viewConfiguration, Continuation continuation) {
        super(2, continuation);
        this.f20032O = rVar;
        this.J2 = transformedTextFieldState;
        this.f20040r = textLayoutState;
        this.f20039o = composeInputMethodManager;
        this.f20035Z = platformTextInputSession;
        this.f20033S = imeOptions;
        this.f20037g = receiveContentConfiguration;
        this.E2 = function1;
        this.f20036e = function0;
        this.f20034X = viewConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputConnection O(final TransformedTextFieldState transformedTextFieldState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, ComposeInputMethodManager composeInputMethodManager, Function1 function1, CursorAnchorInfoController cursorAnchorInfoController, TextLayoutState textLayoutState, Function0 function0, ViewConfiguration viewConfiguration, EditorInfo editorInfo) {
        AndroidTextInputSession_androidKt.t(null, new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "createInputConnection(value=\"" + ((Object) transformedTextFieldState.HI()) + "\")";
            }
        }, 1, null);
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1(new DefaultImeEditCommandScope(transformedTextFieldState), transformedTextFieldState, composeInputMethodManager, function1, receiveContentConfiguration, cursorAnchorInfoController, textLayoutState, function0, viewConfiguration);
        EditorInfo_androidKt.rl(editorInfo, transformedTextFieldState.HI(), transformedTextFieldState.HI().getSelection(), imeOptions, receiveContentConfiguration != null ? AndroidTextInputSession_androidKt.f20027n : null);
        return new StatelessInputConnection(androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1, editorInfo);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(GJW.vd vdVar, Continuation<?> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f20038n;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            GJW.vd vdVar = (GJW.vd) this.f20041t;
            GJW.C.nr(vdVar, null, GJW.h.J2, new AnonymousClass1(this.J2, this.f20039o, null), 1, null);
            TFv.r rVar = this.f20032O;
            if (rVar != null) {
                GJW.C.nr(vdVar, null, null, new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(rVar, this.f20039o, null), 3, null);
            }
            final CursorAnchorInfoController cursorAnchorInfoController = new CursorAnchorInfoController(this.J2, this.f20040r, this.f20039o, vdVar);
            PlatformTextInputSession platformTextInputSession = this.f20035Z;
            final TransformedTextFieldState transformedTextFieldState = this.J2;
            final ImeOptions imeOptions = this.f20033S;
            final ReceiveContentConfiguration receiveContentConfiguration = this.f20037g;
            final ComposeInputMethodManager composeInputMethodManager = this.f20039o;
            final Function1 function1 = this.E2;
            final TextLayoutState textLayoutState = this.f20040r;
            final Function0 function0 = this.f20036e;
            final ViewConfiguration viewConfiguration = this.f20034X;
            PlatformTextInputMethodRequest platformTextInputMethodRequest = new PlatformTextInputMethodRequest() { // from class: androidx.compose.foundation.text.input.internal.j
                @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
                public final InputConnection n(EditorInfo editorInfo) {
                    return AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.O(transformedTextFieldState, imeOptions, receiveContentConfiguration, composeInputMethodManager, function1, cursorAnchorInfoController, textLayoutState, function0, viewConfiguration, editorInfo);
                }
            };
            this.f20038n = 1;
            if (platformTextInputSession.n(platformTextInputMethodRequest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}

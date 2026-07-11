package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeOptions;
import com.applovin.sdk.AppLovinEventTypes;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a|\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015\u001a~\u0010\u0018\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0081@¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/platform/PlatformTextInputSession;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "state", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "layoutState", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "receiveContentConfiguration", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "", "onImeAction", "Lkotlin/Function0;", "updateSelectionState", "LTFv/r;", "stylusHandwritingTrigger", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "", "nr", "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LTFv/r;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "composeImm", "O", "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;LTFv/r;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tag", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "[Ljava/lang/String;", "ALL_MIME_TYPES", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidTextInputSession_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f20027n = {"*/*", "image/*", "video/*"};

    private static final void rl(String str, Function0 function0) {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(PlatformTextInputSession platformTextInputSession, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, Function1 function1, Function0 function0, ComposeInputMethodManager composeInputMethodManager, TFv.r rVar, ViewConfiguration viewConfiguration, Continuation continuation) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 androidTextInputSession_androidKt$platformSpecificTextInputSession$2;
        if (continuation instanceof AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2) {
            androidTextInputSession_androidKt$platformSpecificTextInputSession$2 = (AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2) continuation;
            int i2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.f20031t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidTextInputSession_androidKt$platformSpecificTextInputSession$2.f20031t = i2 - Integer.MIN_VALUE;
            } else {
                androidTextInputSession_androidKt$platformSpecificTextInputSession$2 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2(continuation);
            }
        }
        Object obj = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.f20030n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.f20031t;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(rVar, transformedTextFieldState, textLayoutState, composeInputMethodManager, platformTextInputSession, imeOptions, receiveContentConfiguration, function1, function0, viewConfiguration, null);
            androidTextInputSession_androidKt$platformSpecificTextInputSession$2.f20031t = 1;
            if (GJW.Lu.J2(androidTextInputSession_androidKt$platformSpecificTextInputSession$3, androidTextInputSession_androidKt$platformSpecificTextInputSession$2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object nr(PlatformTextInputSession platformTextInputSession, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, Function1 function1, Function0 function0, TFv.r rVar, ViewConfiguration viewConfiguration, Continuation continuation) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$1;
        if (continuation instanceof AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) {
            androidTextInputSession_androidKt$platformSpecificTextInputSession$1 = (AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) continuation;
            int i2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$1.f20029t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidTextInputSession_androidKt$platformSpecificTextInputSession$1.f20029t = i2 - Integer.MIN_VALUE;
            } else {
                androidTextInputSession_androidKt$platformSpecificTextInputSession$1 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1(continuation);
            }
        }
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$12 = androidTextInputSession_androidKt$platformSpecificTextInputSession$1;
        Object obj = androidTextInputSession_androidKt$platformSpecificTextInputSession$12.f20028n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = androidTextInputSession_androidKt$platformSpecificTextInputSession$12.f20029t;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            ComposeInputMethodManager composeInputMethodManagerN = ComposeInputMethodManager_androidKt.n(platformTextInputSession.getView());
            androidTextInputSession_androidKt$platformSpecificTextInputSession$12.f20029t = 1;
            if (O(platformTextInputSession, transformedTextFieldState, textLayoutState, imeOptions, receiveContentConfiguration, function1, function0, composeInputMethodManagerN, rVar, viewConfiguration, androidTextInputSession_androidKt$platformSpecificTextInputSession$12) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ void t(String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "AndroidTextInputSession";
        }
        rl(str, function0);
    }
}

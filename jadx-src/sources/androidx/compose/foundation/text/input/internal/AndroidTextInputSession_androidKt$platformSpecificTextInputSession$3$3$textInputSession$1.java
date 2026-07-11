package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000m\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\r\u0010\u0005J\u001b\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\u001aJ\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010)\u001a\u00020\u00032\u0006\u0010#\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"androidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1", "Landroidx/compose/foundation/text/input/internal/TextInputSession;", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "", "beginBatchEdit", "()Z", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "Lkotlin/ExtensionFunctionType;", "block", "t", "(Lkotlin/jvm/functions/Function1;)V", "endBatchEdit", "Landroidx/compose/ui/text/TextRange;", "range", "J2", "(J)J", "O", "Landroid/view/KeyEvent;", "keyEvent", "sendKeyEvent", "(Landroid/view/KeyEvent;)V", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "rl", "(I)V", "Landroidx/compose/foundation/content/TransferableContent;", "transferableContent", "Uo", "(Landroidx/compose/foundation/content/TransferableContent;)Z", "", "cursorUpdateMode", "requestCursorUpdates", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "nr", "(Landroid/view/inputmethod/HandwritingGesture;)I", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "text", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 implements TextInputSession, ImeEditCommandScope {
    final /* synthetic */ CursorAnchorInfoController J2;
    final /* synthetic */ Function0 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ ReceiveContentConfiguration f20051O;
    final /* synthetic */ TextLayoutState Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ DefaultImeEditCommandScope f20052n;
    final /* synthetic */ Function1 nr;
    final /* synthetic */ TransformedTextFieldState rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ ComposeInputMethodManager f20053t;
    final /* synthetic */ ViewConfiguration xMQ;

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public long J2(long range) {
        return this.f20052n.J2(range);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public long O(long range) {
        return this.f20052n.O(range);
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean beginBatchEdit() {
        return this.f20052n.beginBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public boolean endBatchEdit() {
        return this.f20052n.endBatchEdit();
    }

    @Override // androidx.compose.foundation.text.input.internal.ImeEditCommandScope
    public void t(Function1 block) {
        this.f20052n.t(block);
    }

    AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1(DefaultImeEditCommandScope defaultImeEditCommandScope, TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, Function1 function1, ReceiveContentConfiguration receiveContentConfiguration, CursorAnchorInfoController cursorAnchorInfoController, TextLayoutState textLayoutState, Function0 function0, ViewConfiguration viewConfiguration) {
        this.rl = transformedTextFieldState;
        this.f20053t = composeInputMethodManager;
        this.nr = function1;
        this.f20051O = receiveContentConfiguration;
        this.J2 = cursorAnchorInfoController;
        this.Uo = textLayoutState;
        this.KN = function0;
        this.xMQ = viewConfiguration;
        this.f20052n = defaultImeEditCommandScope;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public boolean Uo(TransferableContent transferableContent) {
        ReceiveContentConfiguration receiveContentConfiguration = this.f20051O;
        if (receiveContentConfiguration != null) {
            return receiveContentConfiguration.rl(transferableContent);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public TextFieldCharSequence n() {
        return this.rl.HI();
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public int nr(HandwritingGesture gesture) {
        if (Build.VERSION.SDK_INT >= 34) {
            return HandwritingGestureApi34.f20119n.az(this.rl, gesture, this.Uo, this.KN, this.xMQ);
        }
        return 2;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture gesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return HandwritingGestureApi34.f20119n.E2(this.rl, gesture, this.Uo, cancellationSignal);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public void requestCursorUpdates(int cursorUpdateMode) {
        this.J2.nr(cursorUpdateMode);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public void rl(int imeAction) {
        Function1 function1 = this.nr;
        if (function1 != null) {
            function1.invoke(ImeAction.mUb(imeAction));
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.TextInputSession
    public void sendKeyEvent(KeyEvent keyEvent) {
        this.f20053t.sendKeyEvent(keyEvent);
    }
}

package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.events.a;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000»\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001u\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010'J\u0019\u0010)\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010-J+\u00104\u001a\u00020\f2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J!\u00109\u001a\u00020\b2\u0006\u0010/\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b9\u0010:J!\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0011H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u0011H\u0016¢\u0006\u0004\bD\u0010-J\u0017\u0010F\u001a\u00020\b2\u0006\u0010E\u001a\u00020\u0011H\u0016¢\u0006\u0004\bF\u0010-J\u0019\u0010H\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bH\u0010IJ\u0019\u0010L\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bL\u0010MJ\u0011\u0010O\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u0011H\u0016¢\u0006\u0004\bR\u0010-J\u0017\u0010T\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0016¢\u0006\u0004\bT\u0010UJ#\u0010Z\u001a\u00020\b2\b\u0010W\u001a\u0004\u0018\u00010V2\b\u0010Y\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\bZ\u0010[J)\u0010_\u001a\u00020\b2\u0006\u0010]\u001a\u00020\\2\u0006\u0010%\u001a\u00020\u00112\b\u0010^\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\bH\u0002¢\u0006\u0004\ba\u0010\nJ\u000f\u0010b\u001a\u00020\bH\u0002¢\u0006\u0004\bb\u0010\nJ\u0017\u0010d\u001a\u00020\f2\u0006\u0010c\u001a\u00020\u0011H\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\f2\u0006\u0010f\u001a\u00020VH\u0002¢\u0006\u0004\bg\u0010hR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010m\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR+\u0010t\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020\f0o¢\u0006\u0002\bq0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010w\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010vR\u001a\u0010z\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\bb\u0010x\u0012\u0004\by\u0010\u000eR\u0014\u0010\u0010\u001a\u00020{8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006~"}, d2 = {"Landroidx/compose/foundation/text/input/internal/StatelessInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/foundation/text/input/internal/TextInputSession;", "session", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "<init>", "(Landroidx/compose/foundation/text/input/internal/TextInputSession;Landroid/view/inputmethod/EditorInfo;)V", "", "beginBatchEdit", "()Z", "endBatchEdit", "", "closeConnection", "()V", "", "text", "", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", TtmlNode.START, TtmlNode.END, "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", a.f62811a, "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", AdActivity.REQUEST_KEY_EXTRA, "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "reqModes", "getCursorCapsMode", "(I)I", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "", FileUploadManager.f61572j, "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "nr", "O", "code", "KN", "(I)V", "message", "Uo", "(Ljava/lang/String;)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/foundation/text/input/internal/TextInputSession;", "rl", "I", "batchDepth", "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", "Lkotlin/ExtensionFunctionType;", "t", "Landroidx/compose/runtime/collection/MutableVector;", "editCommands", "androidx/compose/foundation/text/input/internal/StatelessInputConnection$terminalInputConnection$1", "Landroidx/compose/foundation/text/input/internal/StatelessInputConnection$terminalInputConnection$1;", "terminalInputConnection", "Landroid/view/inputmethod/InputConnection;", "getCommitContentDelegateInputConnection$annotations", "commitContentDelegateInputConnection", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "J2", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStatelessInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,660:1\n1101#2:661\n1083#2,2:662\n*S KotlinDebug\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection\n*L\n112#1:661\n112#1:662,2\n*E\n"})
public final class StatelessInputConnection implements InputConnection {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final InputConnection commitContentDelegateInputConnection;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TextInputSession session;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final StatelessInputConnection$terminalInputConnection$1 terminalInputConnection;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int batchDepth;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableVector editCommands = new MutableVector(new Function1[16], 0);

    /* JADX INFO: Access modifiers changed from: private */
    public final void Uo(String message) {
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    private final TextFieldCharSequence J2() {
        return this.session.n();
    }

    private final void KN(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }

    private final boolean O() {
        return this.session.endBatchEdit();
    }

    private final boolean nr() {
        return this.session.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        Uo("beginBatchEdit()");
        return nr();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        Uo("clearMetaKeyStates(" + states + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        Uo("closeConnection()");
        this.editCommands.KN();
        this.batchDepth = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo text) {
        StringBuilder sb = new StringBuilder();
        sb.append("commitCompletion(");
        sb.append((Object) (text != null ? text.getText() : null));
        sb.append(')');
        Uo(sb.toString());
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) {
        Uo("commitContent(" + inputContentInfo + ", " + flags + ", " + opts + ')');
        if (Build.VERSION.SDK_INT >= 25) {
            return Api25CommitContentImpl.f20054n.n(this.commitContentDelegateInputConnection, inputContentInfo, flags, opts);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence text, int newCursorPosition) {
        Uo("commitText(\"" + ((Object) text) + "\", " + newCursorPosition + ')');
        if (text == null) {
            return true;
        }
        ImeEditCommand_androidKt.rl(this.session, text.toString(), newCursorPosition);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        Uo("deleteSurroundingText(" + beforeLength + ", " + afterLength + ')');
        ImeEditCommand_androidKt.t(this.session, beforeLength, afterLength);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        Uo("deleteSurroundingTextInCodePoints(" + beforeLength + ", " + afterLength + ')');
        ImeEditCommand_androidKt.nr(this.session, beforeLength, afterLength);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        Uo("endBatchEdit()");
        return O();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        Uo("finishComposingText()");
        ImeEditCommand_androidKt.O(this.session);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        Uo("getCursorCapsMode(" + reqModes + ')');
        return TextUtils.getCapsMode(J2(), TextRange.qie(J2().getSelection()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) {
        Uo("getExtractedText(" + request + ", " + flags + ')');
        return StatelessInputConnection_androidKt.O(J2());
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        Uo("getHandler()");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id) {
        Uo("performContextMenuAction(" + id + ')');
        switch (id) {
            case R.id.selectAll:
                ImeEditCommand_androidKt.gh(this.session, 0, J2().length());
                return false;
            case R.id.cut:
                KN(277);
                return false;
            case R.id.copy:
                KN(278);
                return false;
            case R.id.paste:
                KN(279);
                return false;
            default:
                return false;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        int iN;
        Uo("performEditorAction(" + editorAction + ')');
        if (editorAction != 0) {
            switch (editorAction) {
                case 2:
                    iN = ImeAction.INSTANCE.t();
                    break;
                case 3:
                    iN = ImeAction.INSTANCE.Uo();
                    break;
                case 4:
                    iN = ImeAction.INSTANCE.KN();
                    break;
                case 5:
                    iN = ImeAction.INSTANCE.nr();
                    break;
                case 6:
                    iN = ImeAction.INSTANCE.rl();
                    break;
                case 7:
                    iN = ImeAction.INSTANCE.J2();
                    break;
                default:
                    Uo("IME sent an unrecognized editor action: " + editorAction);
                    iN = ImeAction.INSTANCE.n();
                    break;
            }
        } else {
            iN = ImeAction.INSTANCE.n();
        }
        this.session.rl(iN);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture gesture, Executor executor, IntConsumer consumer) {
        Uo("performHandwritingGesture(" + gesture + ", " + executor + ", " + consumer + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        Api34PerformHandwritingGestureImpl.f20056n.rl(this.session, gesture, executor, consumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String action, Bundle data) {
        Uo("performPrivateCommand(" + action + ", " + data + ')');
        return this.commitContentDelegateInputConnection.performPrivateCommand(action, data);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture gesture, CancellationSignal cancellationSignal) {
        Uo("previewHandwritingGesture(" + gesture + ", " + cancellationSignal + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return Api34PerformHandwritingGestureImpl.f20056n.nr(this.session, gesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        Uo("reportFullscreenMode(" + enabled + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        Uo("requestCursorUpdates(" + cursorUpdateMode + ')');
        this.session.requestCursorUpdates(cursorUpdateMode);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        Uo("sendKeyEvent(" + event + ')');
        this.session.sendKeyEvent(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        Uo("setComposingRegion(" + start + ", " + end + ')');
        ImeEditCommand_androidKt.xMQ(this.session, start, end);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence text, int newCursorPosition) {
        Uo("setComposingText(\"" + ((Object) text) + "\", " + newCursorPosition + ')');
        if (text == null) {
            return true;
        }
        TextInputSession textInputSession = this.session;
        String string = text.toString();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        ImeEditCommand_androidKt.mUb(textInputSession, string, newCursorPosition, spanned != null ? StatelessInputConnection_androidKt.nr(spanned) : null);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        Uo(qUrazMnwDskFs.ERjvYz + start + ", " + end + ')');
        ImeEditCommand_androidKt.gh(this.session, start, end);
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.inputmethod.InputConnection, androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1] */
    public StatelessInputConnection(TextInputSession textInputSession, EditorInfo editorInfo) {
        this.session = textInputSession;
        ?? r3 = new InputConnectionWrapper(this) { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1
            {
                super(this, false);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) {
                return false;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean performPrivateCommand(String action, Bundle data) {
                return true;
            }
        };
        this.terminalInputConnection = r3;
        this.commitContentDelegateInputConnection = InputConnectionCompat.nr(r3, editorInfo, new InputConnectionCompat.OnCommitContentListener() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$commitContentDelegateInputConnection$1
            @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
            public boolean n(InputContentInfoCompat inputContentInfo, int flags, Bundle opts) {
                if (Build.VERSION.SDK_INT >= 25 && (flags & 1) != 0) {
                    try {
                        inputContentInfo.nr();
                        Object objO = inputContentInfo.O();
                        Intrinsics.checkNotNull(objO, "null cannot be cast to non-null type android.os.Parcelable");
                        Parcelable parcelable = (Parcelable) objO;
                        opts = opts == null ? new Bundle() : new Bundle(opts);
                        opts.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
                    } catch (Exception e2) {
                        this.f20193n.Uo("Can't insert content from IME; requestPermission() failed, " + e2);
                        return false;
                    }
                }
                return this.f20193n.session.Uo(StatelessInputConnection_androidKt.KN(inputContentInfo, opts));
            }
        });
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int flags) {
        String string;
        if (TextRange.KN(J2().getSelection())) {
            string = null;
        } else {
            string = TextFieldCharSequenceKt.n(J2()).toString();
        }
        Uo("getSelectedText(" + flags + "): " + ((Object) string));
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        String string = TextFieldCharSequenceKt.rl(J2(), maxChars).toString();
        Uo("getTextAfterCursor(" + maxChars + ", " + flags + "): " + string);
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        String string = TextFieldCharSequenceKt.t(J2(), maxChars).toString();
        Uo("getTextBeforeCursor(" + maxChars + ", " + flags + "): " + string);
        return string;
    }
}

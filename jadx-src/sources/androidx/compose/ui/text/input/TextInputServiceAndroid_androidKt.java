package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "xMQ", "(Landroid/view/inputmethod/EditorInfo;)V", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "KN", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "nr", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "bits", "flag", "", "Uo", "(II)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,586:1\n1#2:587\n*E\n"})
public final class TextInputServiceAndroid_androidKt {
    private static final boolean Uo(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.I28
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                TextInputServiceAndroid_androidKt.J2(runnable, j2);
            }
        });
    }

    public static final Executor nr(final Choreographer choreographer) {
        return new Executor() { // from class: androidx.compose.ui.text.input.Ml
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.O(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(Runnable runnable, long j2) {
        runnable.run();
    }

    public static final void KN(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        String privateImeOptions;
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i2 = 6;
        if (ImeAction.az(imeAction, companion.n())) {
            if (!imeOptions.getSingleLine()) {
                i2 = 0;
            }
        } else if (ImeAction.az(imeAction, companion.O())) {
            i2 = 1;
        } else if (ImeAction.az(imeAction, companion.t())) {
            i2 = 2;
        } else if (ImeAction.az(imeAction, companion.nr())) {
            i2 = 5;
        } else if (ImeAction.az(imeAction, companion.J2())) {
            i2 = 7;
        } else if (ImeAction.az(imeAction, companion.Uo())) {
            i2 = 3;
        } else if (ImeAction.az(imeAction, companion.KN())) {
            i2 = 4;
        } else if (!ImeAction.az(imeAction, companion.rl())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i2;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.ty(keyboardType, companion2.KN())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.ty(keyboardType, companion2.n())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.ty(keyboardType, companion2.nr())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.ty(keyboardType, companion2.Uo())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.ty(keyboardType, companion2.mUb())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.ty(keyboardType, companion2.t())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.ty(keyboardType, companion2.J2())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.ty(keyboardType, companion2.O())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.ty(keyboardType, companion2.rl())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type");
        }
        if (!imeOptions.getSingleLine() && Uo(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.az(imeOptions.getImeAction(), companion.n())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (Uo(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.xMQ(capitalization, companion3.n())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.xMQ(capitalization, companion3.O())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.xMQ(capitalization, companion3.t())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.ty(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.xMQ(textFieldValue.getSelection());
        EditorInfoCompat.J2(editorInfo, textFieldValue.xMQ());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(EditorInfo editorInfo) {
        if (!EmojiCompat.gh()) {
            return;
        }
        EmojiCompat.t().aYN(editorInfo);
    }
}

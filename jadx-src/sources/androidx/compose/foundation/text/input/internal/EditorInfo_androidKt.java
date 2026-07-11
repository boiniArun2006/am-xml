package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a@\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "", "", "contentMimeTypes", "", "rl", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/input/ImeOptions;[Ljava/lang/String;)V", "", "bits", "flag", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(II)Z", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEditorInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorInfo.android.kt\nandroidx/compose/foundation/text/input/internal/EditorInfo_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
public final class EditorInfo_androidKt {
    private static final boolean n(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static /* synthetic */ void t(EditorInfo editorInfo, CharSequence charSequence, long j2, ImeOptions imeOptions, String[] strArr, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            strArr = null;
        }
        rl(editorInfo, charSequence, j2, imeOptions, strArr);
    }

    public static final void rl(EditorInfo editorInfo, CharSequence charSequence, long j2, ImeOptions imeOptions, String[] strArr) {
        String privateImeOptions;
        int imeAction = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i2 = 3;
        int i3 = 6;
        if (ImeAction.az(imeAction, companion.n())) {
            if (!imeOptions.getSingleLine()) {
                i3 = 0;
            }
        } else if (ImeAction.az(imeAction, companion.O())) {
            i3 = 1;
        } else if (ImeAction.az(imeAction, companion.t())) {
            i3 = 2;
        } else if (ImeAction.az(imeAction, companion.nr())) {
            i3 = 5;
        } else if (ImeAction.az(imeAction, companion.J2())) {
            i3 = 7;
        } else if (ImeAction.az(imeAction, companion.Uo())) {
            i3 = 3;
        } else if (ImeAction.az(imeAction, companion.KN())) {
            i3 = 4;
        } else if (!ImeAction.az(imeAction, companion.rl())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i3;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        LocaleListHelper.f20172n.n(editorInfo, imeOptions.getHintLocales());
        int keyboardType = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.ty(keyboardType, companion2.KN())) {
            i2 = 1;
        } else if (KeyboardType.ty(keyboardType, companion2.n())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (KeyboardType.ty(keyboardType, companion2.nr())) {
            i2 = 2;
        } else if (!KeyboardType.ty(keyboardType, companion2.Uo())) {
            if (KeyboardType.ty(keyboardType, companion2.mUb())) {
                i2 = 17;
            } else if (KeyboardType.ty(keyboardType, companion2.t())) {
                i2 = 33;
            } else if (KeyboardType.ty(keyboardType, companion2.J2())) {
                i2 = 129;
            } else if (KeyboardType.ty(keyboardType, companion2.O())) {
                i2 = 18;
            } else if (KeyboardType.ty(keyboardType, companion2.rl())) {
                i2 = 8194;
            } else {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
        }
        editorInfo.inputType = i2;
        if (!imeOptions.getSingleLine() && n(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.az(imeOptions.getImeAction(), companion.n())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (n(editorInfo.inputType, 1)) {
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
        editorInfo.initialSelStart = TextRange.ty(j2);
        editorInfo.initialSelEnd = TextRange.xMQ(j2);
        EditorInfoCompat.J2(editorInfo, charSequence);
        if (strArr != null) {
            EditorInfoCompat.nr(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (StylusHandwriting_androidKt.n() && !KeyboardType.ty(imeOptions.getKeyboardType(), companion2.J2()) && !KeyboardType.ty(imeOptions.getKeyboardType(), companion2.O())) {
            EditorInfoCompat.Uo(editorInfo, true);
            EditorInfoApi34.f20116n.n(editorInfo);
        } else {
            EditorInfoCompat.Uo(editorInfo, false);
        }
    }
}

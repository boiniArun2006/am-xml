package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001a\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImpl;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroid/view/inputmethod/InputMethodManager;", "nr", "()Landroid/view/inputmethod/InputMethodManager;", "", "rl", "()V", "", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "info", "t", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "O", "J2", "Uo", "xMQ", "Landroid/view/View;", "KN", "()Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroidx/core/view/SoftwareKeyboardControllerCompat;", "Landroidx/core/view/SoftwareKeyboardControllerCompat;", "softwareKeyboardControllerCompat", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposeInputMethodManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeInputMethodManager.android.kt\nandroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
abstract class ComposeInputMethodManagerImpl implements ComposeInputMethodManager {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private android.view.inputmethod.InputMethodManager imm;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat;

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void J2() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void O() {
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void Uo() {
    }

    private final android.view.inputmethod.InputMethodManager nr() {
        Object systemService = this.view.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (android.view.inputmethod.InputMethodManager) systemService;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    protected final View getView() {
        return this.view;
    }

    protected final android.view.inputmethod.InputMethodManager xMQ() {
        android.view.inputmethod.InputMethodManager inputMethodManager = this.imm;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        android.view.inputmethod.InputMethodManager inputMethodManagerNr = nr();
        this.imm = inputMethodManagerNr;
        return inputMethodManagerNr;
    }

    public ComposeInputMethodManagerImpl(View view) {
        this.view = view;
        this.softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void n(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd) {
        xMQ().updateSelection(this.view, selectionStart, selectionEnd, compositionStart, compositionEnd);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void rl() {
        xMQ().restartInput(this.view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void t(CursorAnchorInfo info) {
        xMQ().updateCursorAnchorInfo(this.view, info);
    }
}

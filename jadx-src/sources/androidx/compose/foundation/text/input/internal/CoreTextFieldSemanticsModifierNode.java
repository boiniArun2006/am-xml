package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b:\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u0019*\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ]\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00103\u001a\u0004\b\f\u00105\"\u0004\b<\u00107R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u00105¨\u0006V"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/text/input/TransformedText;", "transformedText", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "", "readOnly", "enabled", "isPassword", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "<init>", "(Landroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/LegacyTextFieldState;ZZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/FocusRequester;)V", "", "text", "", "kC", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Ljava/lang/String;ZZ)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "FX", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "eOa", "jB", "Landroidx/compose/ui/text/input/TransformedText;", "getTransformedText", "()Landroidx/compose/ui/text/input/TransformedText;", "setTransformedText", "(Landroidx/compose/ui/text/input/TransformedText;)V", "U", "Landroidx/compose/ui/text/input/TextFieldValue;", "jE", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "P5", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "ZwA", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "M7", "Z", "WKb", "()Z", "setReadOnly", "(Z)V", "p5", "ni", "setEnabled", "eF", "setPassword", "E", "Landroidx/compose/ui/text/input/OffsetMapping;", "b", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "M", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "Vd", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "setManager", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroidx/compose/ui/text/input/ImeOptions;", "GT", "()Landroidx/compose/ui/text/input/ImeOptions;", "setImeOptions", "(Landroidx/compose/ui/text/input/ImeOptions;)V", "B", "Landroidx/compose/ui/focus/FocusRequester;", "eWT", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "L", "shouldMergeDescendantSemantics", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoreTextFieldSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextFieldSemanticsModifier.kt\nandroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
public final class CoreTextFieldSemanticsModifierNode extends DelegatingNode implements SemanticsModifierNode {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private FocusRequester focusRequester;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private OffsetMapping offsetMapping;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private ImeOptions imeOptions;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private TextFieldSelectionManager manager;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private boolean readOnly;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private LegacyTextFieldState state;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue value;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private boolean isPassword;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private TransformedText transformedText;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: Access modifiers changed from: private */
    public final void kC(LegacyTextFieldState state, String text, boolean readOnly, boolean enabled) {
        Unit unit;
        if (readOnly || !enabled) {
            return;
        }
        androidx.compose.ui.text.input.TextInputSession inputSession = state.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.Uo(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(text, 1)}), state.getProcessor(), state.getOnValueChange(), inputSession);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            state.getOnValueChange().invoke(new TextFieldValue(text, TextRangeKt.n(text.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: L */
    public boolean getMergeDescendants() {
        return true;
    }

    public final void eOa(TransformedText transformedText, TextFieldValue value, LegacyTextFieldState state, boolean readOnly, boolean enabled, boolean isPassword, OffsetMapping offsetMapping, TextFieldSelectionManager manager, ImeOptions imeOptions, FocusRequester focusRequester) {
        boolean z2 = this.enabled;
        boolean z3 = false;
        boolean z4 = z2 && !this.readOnly;
        boolean z5 = this.isPassword;
        ImeOptions imeOptions2 = this.imeOptions;
        TextFieldSelectionManager textFieldSelectionManager = this.manager;
        if (enabled && !readOnly) {
            z3 = true;
        }
        this.transformedText = transformedText;
        this.value = value;
        this.state = state;
        this.readOnly = readOnly;
        this.enabled = enabled;
        this.offsetMapping = offsetMapping;
        this.manager = manager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        if (enabled != z2 || z3 != z4 || !Intrinsics.areEqual(imeOptions, imeOptions2) || isPassword != z5 || !TextRange.KN(value.getSelection())) {
            SemanticsModifierNodeKt.rl(this);
        }
        if (Intrinsics.areEqual(manager, textFieldSelectionManager)) {
            return;
        }
        manager.eTf(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$updateNodeSemantics$1
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
                DelegatableNodeKt.xMQ(this.f20093n);
            }
        });
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void FX(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.piY(semanticsPropertyReceiver, this.value.getText());
        SemanticsPropertiesKt.k(semanticsPropertyReceiver, this.transformedText.getText());
        SemanticsPropertiesKt.mYa(semanticsPropertyReceiver, this.value.getSelection());
        SemanticsPropertiesKt.a(semanticsPropertyReceiver, ContentDataType.INSTANCE.n());
        SemanticsPropertiesKt.nY(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(AnnotatedString annotatedString) {
                this.f20081n.getState().N(true);
                this.f20081n.getState().iF(true);
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.f20081n;
                coreTextFieldSemanticsModifierNode.kC(coreTextFieldSemanticsModifierNode.getState(), annotatedString.getText(), this.f20081n.getReadOnly(), this.f20081n.getEnabled());
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!this.enabled) {
            SemanticsPropertiesKt.qie(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.bzg(semanticsPropertyReceiver);
        }
        boolean z2 = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.Y(semanticsPropertyReceiver, z2);
        SemanticsPropertiesKt.XQ(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(List list) {
                boolean z3;
                if (this.f20084n.getState().qie() != null) {
                    TextLayoutResultProxy textLayoutResultProxyQie = this.f20084n.getState().qie();
                    Intrinsics.checkNotNull(textLayoutResultProxyQie);
                    list.add(textLayoutResultProxyQie.getValue());
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            }
        }, 1, null);
        if (z2) {
            SemanticsPropertiesKt.qm(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(AnnotatedString annotatedString) {
                    CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.f20085n;
                    coreTextFieldSemanticsModifierNode.kC(coreTextFieldSemanticsModifierNode.getState(), annotatedString.getText(), this.f20085n.getReadOnly(), this.f20085n.getEnabled());
                    return Boolean.TRUE;
                }
            }, 1, null);
            SemanticsPropertiesKt.aYN(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(AnnotatedString annotatedString) {
                    Unit unit;
                    if (this.f20086n.getReadOnly() || !this.f20086n.getEnabled()) {
                        return Boolean.FALSE;
                    }
                    androidx.compose.ui.text.input.TextInputSession inputSession = this.f20086n.getState().getInputSession();
                    if (inputSession != null) {
                        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.f20086n;
                        TextFieldDelegate.INSTANCE.Uo(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), coreTextFieldSemanticsModifierNode.getState().getProcessor(), coreTextFieldSemanticsModifierNode.getState().getOnValueChange(), inputSession);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode2 = this.f20086n;
                        coreTextFieldSemanticsModifierNode2.getState().getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) coreTextFieldSemanticsModifierNode2.getValue().xMQ(), TextRange.ty(coreTextFieldSemanticsModifierNode2.getValue().getSelection()), TextRange.xMQ(coreTextFieldSemanticsModifierNode2.getValue().getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.n(TextRange.ty(coreTextFieldSemanticsModifierNode2.getValue().getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                    }
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.fcU(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$5
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return n(num.intValue(), num2.intValue(), bool.booleanValue());
            }

            public final Boolean n(int i2, int i3, boolean z3) {
                if (!z3) {
                    i2 = this.f20088n.getOffsetMapping().n(i2);
                }
                if (!z3) {
                    i3 = this.f20088n.getOffsetMapping().n(i3);
                }
                boolean z4 = false;
                if (this.f20088n.getEnabled() && (i2 != TextRange.ty(this.f20088n.getValue().getSelection()) || i3 != TextRange.xMQ(this.f20088n.getValue().getSelection()))) {
                    if (Math.min(i2, i3) < 0 || Math.max(i2, i3) > this.f20088n.getValue().getText().length()) {
                        this.f20088n.getManager().nY();
                    } else {
                        if (z3 || i2 == i3) {
                            this.f20088n.getManager().nY();
                        } else {
                            TextFieldSelectionManager.ViF(this.f20088n.getManager(), false, 1, null);
                        }
                        this.f20088n.getState().getOnValueChange().invoke(new TextFieldValue(this.f20088n.getValue().getText(), TextRangeKt.rl(i2, i3), (TextRange) null, 4, (DefaultConstructorMarker) null));
                        z4 = true;
                    }
                }
                return Boolean.valueOf(z4);
            }
        }, 1, null);
        SemanticsPropertiesKt.fD(semanticsPropertyReceiver, this.imeOptions.getImeAction(), null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f20089n.getState().getOnImeActionPerformed().invoke(ImeAction.mUb(this.f20089n.getImeOptions().getImeAction()));
                return Boolean.TRUE;
            }
        }, 2, null);
        SemanticsPropertiesKt.te(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                CoreTextFieldKt.Ik(this.f20090n.getState(), this.f20090n.getFocusRequester(), !this.f20090n.getReadOnly());
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.e(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$8
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                TextFieldSelectionManager.ViF(this.f20091n.getManager(), false, 1, null);
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!TextRange.KN(this.value.getSelection()) && !this.isPassword) {
            SemanticsPropertiesKt.KN(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$9
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    TextFieldSelectionManager.r(this.f20092n.getManager(), false, 1, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.mUb(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$10
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        this.f20082n.getManager().XQ();
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        SemanticsPropertiesKt.jB(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$11
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f20083n.getManager().B();
                return Boolean.TRUE;
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: GT, reason: from getter */
    public final ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    /* JADX INFO: renamed from: Vd, reason: from getter */
    public final TextFieldSelectionManager getManager() {
        return this.manager;
    }

    /* JADX INFO: renamed from: WKb, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    /* JADX INFO: renamed from: ZwA, reason: from getter */
    public final LegacyTextFieldState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    /* JADX INFO: renamed from: eWT, reason: from getter */
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    /* JADX INFO: renamed from: jE, reason: from getter */
    public final TextFieldValue getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: ni, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public CoreTextFieldSemanticsModifierNode(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z2, boolean z3, boolean z4, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z2;
        this.enabled = z3;
        this.isPassword = z4;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        textFieldSelectionManager.eTf(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.1
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
                DelegatableNodeKt.xMQ(CoreTextFieldSemanticsModifierNode.this);
            }
        });
    }
}

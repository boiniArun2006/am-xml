package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0000\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0016*\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001c\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J(\u0010*\u001a\u00020\u00162\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b(H\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b4\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010HR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010IR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010JR\u001a\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/foundation/text/TextFieldKeyInput;", "", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "selectionManager", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "", "editable", "singleLine", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "preparedSelectionState", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "keyCombiner", "Landroidx/compose/foundation/text/KeyMapping;", "keyMapping", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "<init>", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/ui/text/input/EditCommand;", "J2", "(Ljava/util/List;)V", "O", "(Landroidx/compose/ui/text/input/EditCommand;)V", "Landroidx/compose/ui/input/key/KeyEvent;", a.f62811a, "Landroidx/compose/ui/text/input/CommitTextCommand;", "az", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/CommitTextCommand;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Lkotlin/ExtensionFunctionType;", "block", "Uo", "(Lkotlin/jvm/functions/Function1;)V", "qie", "(Landroid/view/KeyEvent;)Z", c.f62177j, "Landroidx/compose/foundation/text/LegacyTextFieldState;", "mUb", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "rl", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "KN", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "t", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "nr", "Z", "getEditable", "()Z", "xMQ", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getPreparedSelectionState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "Landroidx/compose/foundation/text/UndoManager;", "gh", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "Landroidx/compose/foundation/text/KeyMapping;", "Lkotlin/jvm/functions/Function1;", "I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInput\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1#2:272\n*E\n"})
public final class TextFieldKeyInput {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final TextPreparedSelectionState preparedSelectionState;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final UndoManager undoManager;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final OffsetMapping offsetMapping;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final Function1 onValueChange;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final KeyMapping keyMapping;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LegacyTextFieldState state;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final boolean editable;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final int imeAction;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final TextFieldSelectionManager selectionManager;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final TextFieldValue value;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final DeadKeyCombiner keyCombiner;

    public /* synthetic */ TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z2, boolean z3, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z2, z3, textPreparedSelectionState, offsetMapping, undoManager, deadKeyCombiner, keyMapping, function1, i2);
    }

    private TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z2, boolean z3, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, Function1 function1, int i2) {
        this.state = legacyTextFieldState;
        this.selectionManager = textFieldSelectionManager;
        this.value = textFieldValue;
        this.editable = z2;
        this.singleLine = z3;
        this.preparedSelectionState = textPreparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.keyCombiner = deadKeyCombiner;
        this.keyMapping = keyMapping;
        this.onValueChange = function1;
        this.imeAction = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2(List list) {
        EditProcessor processor = this.state.getProcessor();
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.add(0, new FinishComposingTextCommand());
        this.onValueChange.invoke(processor.rl(mutableList));
    }

    private final void Uo(Function1 block) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.qie(), this.preparedSelectionState);
        block.invoke(textFieldPreparedSelection);
        if (TextRange.Uo(textFieldPreparedSelection.getSelection(), this.value.getSelection()) && Intrinsics.areEqual(textFieldPreparedSelection.getAnnotatedString(), this.value.getText())) {
            return;
        }
        this.onValueChange.invoke(textFieldPreparedSelection.B());
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final LegacyTextFieldState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(EditCommand editCommand) {
        J2(CollectionsKt.listOf(editCommand));
    }

    private final CommitTextCommand az(KeyEvent event) {
        Integer numN;
        if (!TextFieldKeyInput_androidKt.n(event) || (numN = this.keyCombiner.n(event)) == null) {
            return null;
        }
        return new CommitTextCommand(StringHelpers_jvmKt.n(new StringBuilder(), numN.intValue()).toString(), 1);
    }

    public final boolean qie(KeyEvent event) {
        final KeyCommand keyCommandN;
        CommitTextCommand commitTextCommandAz = az(event);
        if (commitTextCommandAz != null) {
            if (!this.editable) {
                return false;
            }
            O(commitTextCommandAz);
            this.preparedSelectionState.rl();
            return true;
        }
        if (!KeyEventType.J2(KeyEvent_androidKt.rl(event), KeyEventType.INSTANCE.n()) || (keyCommandN = this.keyMapping.n(event)) == null || (keyCommandN.getEditsText() && !this.editable)) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        Uo(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[KeyCommand.values().length];
                    try {
                        iArr[KeyCommand.f19711U.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[KeyCommand.P5.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[KeyCommand.M7.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[KeyCommand.f19722t.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[KeyCommand.f19708O.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[KeyCommand.f19721r.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[KeyCommand.J2.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[KeyCommand.f19714Z.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[KeyCommand.f19720o.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[KeyCommand.f19712X.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[KeyCommand.f19710T.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[KeyCommand.f19707N.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[KeyCommand.f19723v.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[KeyCommand.f19709S.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[KeyCommand.f19717g.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[KeyCommand.E2.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[KeyCommand.f19716e.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[KeyCommand.Xw.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[KeyCommand.jB.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[KeyCommand.p5.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[KeyCommand.eF.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[KeyCommand.f19700E.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[KeyCommand.f19706M.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[KeyCommand.f19701FX.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[KeyCommand.f19697B.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[KeyCommand.Mx.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[KeyCommand.f19702G7.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[KeyCommand.f19705J.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[KeyCommand.f19699D.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[KeyCommand.f19715a.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[KeyCommand.f19724z.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[KeyCommand.piY.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[KeyCommand.f19719m.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[KeyCommand.ijL.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[KeyCommand.eTf.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[KeyCommand.xg.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[KeyCommand.pJg.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[KeyCommand.ofS.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[KeyCommand.f19704I.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    try {
                        iArr[KeyCommand.f19703GR.ordinal()] = 40;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr[KeyCommand.Nxk.ordinal()] = 41;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr[KeyCommand.f19713Y.ordinal()] = 42;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr[KeyCommand.f19718k.ordinal()] = 43;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr[KeyCommand.dR0.ordinal()] = 44;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr[KeyCommand.f19698C.ordinal()] = 45;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr[KeyCommand.fcU.ordinal()] = 46;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr[KeyCommand.eWT.ordinal()] = 47;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr[KeyCommand.ul.ordinal()] = 48;
                    } catch (NoSuchFieldError unused48) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                n(textFieldPreparedSelection);
                return Unit.INSTANCE;
            }

            public final void n(TextFieldPreparedSelection textFieldPreparedSelection) {
                TextFieldValue textFieldValueUo;
                TextFieldValue textFieldValueT;
                switch (WhenMappings.$EnumSwitchMapping$0[keyCommandN.ordinal()]) {
                    case 1:
                        this.getSelectionManager().Ik(false);
                        break;
                    case 2:
                        this.getSelectionManager().B();
                        break;
                    case 3:
                        this.getSelectionManager().XQ();
                        break;
                    case 4:
                        textFieldPreparedSelection.rl(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                n(textFieldPreparedSelection2);
                                return Unit.INSTANCE;
                            }

                            public final void n(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.g();
                            }
                        });
                        break;
                    case 5:
                        textFieldPreparedSelection.t(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                n(textFieldPreparedSelection2);
                                return Unit.INSTANCE;
                            }

                            public final void n(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.N();
                            }
                        });
                        break;
                    case 6:
                        textFieldPreparedSelection.te();
                        break;
                    case 7:
                        textFieldPreparedSelection.nHg();
                        break;
                    case 8:
                        textFieldPreparedSelection.X();
                        break;
                    case 9:
                        textFieldPreparedSelection.fD();
                        break;
                    case 10:
                        textFieldPreparedSelection.jB();
                        break;
                    case 11:
                        textFieldPreparedSelection.nY();
                        break;
                    case 12:
                        textFieldPreparedSelection.a();
                        break;
                    case 13:
                        textFieldPreparedSelection.D();
                        break;
                    case 14:
                        textFieldPreparedSelection.Xw();
                        break;
                    case 15:
                        textFieldPreparedSelection.v();
                        break;
                    case 16:
                        textFieldPreparedSelection.rV9();
                        break;
                    case 17:
                        textFieldPreparedSelection.bzg();
                        break;
                    case 18:
                        textFieldPreparedSelection.wTp();
                        break;
                    case 19:
                        textFieldPreparedSelection.s7N();
                        break;
                    case 20:
                        List listFX = textFieldPreparedSelection.FX(new Function1<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.3
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                return new DeleteSurroundingTextCommand(TextRange.xMQ(textFieldPreparedSelection2.getSelection()) - textFieldPreparedSelection2.Ik(), 0);
                            }
                        });
                        if (listFX != null) {
                            this.J2(listFX);
                        }
                        break;
                    case 21:
                        List listFX2 = textFieldPreparedSelection.FX(new Function1<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.4
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                int iQie = textFieldPreparedSelection2.qie();
                                if (iQie != -1) {
                                    return new DeleteSurroundingTextCommand(0, iQie - TextRange.xMQ(textFieldPreparedSelection2.getSelection()));
                                }
                                return null;
                            }
                        });
                        if (listFX2 != null) {
                            this.J2(listFX2);
                        }
                        break;
                    case 22:
                        List listFX3 = textFieldPreparedSelection.FX(new Function1<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.5
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                Integer numZ = textFieldPreparedSelection2.Z();
                                if (numZ != null) {
                                    return new DeleteSurroundingTextCommand(TextRange.xMQ(textFieldPreparedSelection2.getSelection()) - numZ.intValue(), 0);
                                }
                                return null;
                            }
                        });
                        if (listFX3 != null) {
                            this.J2(listFX3);
                        }
                        break;
                    case 23:
                        List listFX4 = textFieldPreparedSelection.FX(new Function1<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.6
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                Integer numAz = textFieldPreparedSelection2.az();
                                if (numAz != null) {
                                    return new DeleteSurroundingTextCommand(0, numAz.intValue() - TextRange.xMQ(textFieldPreparedSelection2.getSelection()));
                                }
                                return null;
                            }
                        });
                        if (listFX4 != null) {
                            this.J2(listFX4);
                        }
                        break;
                    case 24:
                        List listFX5 = textFieldPreparedSelection.FX(new Function1<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.7
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                Integer numXMQ = textFieldPreparedSelection2.xMQ();
                                if (numXMQ != null) {
                                    return new DeleteSurroundingTextCommand(TextRange.xMQ(textFieldPreparedSelection2.getSelection()) - numXMQ.intValue(), 0);
                                }
                                return null;
                            }
                        });
                        if (listFX5 != null) {
                            this.J2(listFX5);
                        }
                        break;
                    case 25:
                        List listFX6 = textFieldPreparedSelection.FX(new Function1<TextFieldPreparedSelection, EditCommand>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.8
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                Integer numJ2 = textFieldPreparedSelection2.J2();
                                if (numJ2 != null) {
                                    return new DeleteSurroundingTextCommand(0, numJ2.intValue() - TextRange.xMQ(textFieldPreparedSelection2.getSelection()));
                                }
                                return null;
                            }
                        });
                        if (listFX6 != null) {
                            this.J2(listFX6);
                        }
                        break;
                    case 26:
                        if (!this.getSingleLine()) {
                            this.O(new CommitTextCommand("\n", 1));
                        } else {
                            this.getState().getOnImeActionPerformed().invoke(ImeAction.mUb(this.imeAction));
                        }
                        break;
                    case 27:
                        if (!this.getSingleLine()) {
                            this.O(new CommitTextCommand("\t", 1));
                        } else {
                            booleanRef.element = false;
                        }
                        break;
                    case 28:
                        textFieldPreparedSelection.U();
                        break;
                    case 29:
                        ((TextFieldPreparedSelection) textFieldPreparedSelection.g()).P5();
                        break;
                    case 30:
                        ((TextFieldPreparedSelection) textFieldPreparedSelection.N()).P5();
                        break;
                    case 31:
                        ((TextFieldPreparedSelection) textFieldPreparedSelection.te()).P5();
                        break;
                    case 32:
                        ((TextFieldPreparedSelection) textFieldPreparedSelection.nHg()).P5();
                        break;
                    case 33:
                        ((TextFieldPreparedSelection) textFieldPreparedSelection.X()).P5();
                        break;
                    case 34:
                        ((TextFieldPreparedSelection) textFieldPreparedSelection.fD()).P5();
                        break;
                    case 35:
                        ((TextFieldPreparedSelection) textFieldPreparedSelection.Xw()).P5();
                        break;
                    case 36:
                        ((TextFieldPreparedSelection) textFieldPreparedSelection.v()).P5();
                        break;
                    case 37:
                        ((TextFieldPreparedSelection) textFieldPreparedSelection.rV9()).P5();
                        break;
                    case 38:
                        ((TextFieldPreparedSelection) textFieldPreparedSelection.bzg()).P5();
                        break;
                    case 39:
                        ((TextFieldPreparedSelection) textFieldPreparedSelection.jB()).P5();
                        break;
                    case 40:
                        ((TextFieldPreparedSelection) textFieldPreparedSelection.nY()).P5();
                        break;
                    case 41:
                        textFieldPreparedSelection.a().P5();
                        break;
                    case 42:
                        textFieldPreparedSelection.D().P5();
                        break;
                    case 43:
                        ((TextFieldPreparedSelection) textFieldPreparedSelection.wTp()).P5();
                        break;
                    case 44:
                        ((TextFieldPreparedSelection) textFieldPreparedSelection.s7N()).P5();
                        break;
                    case 45:
                        textFieldPreparedSelection.nr();
                        break;
                    case 46:
                        UndoManager undoManager = this.getUndoManager();
                        if (undoManager != null) {
                            undoManager.rl(textFieldPreparedSelection.B());
                        }
                        UndoManager undoManager2 = this.getUndoManager();
                        if (undoManager2 != null && (textFieldValueUo = undoManager2.Uo()) != null) {
                            this.onValueChange.invoke(textFieldValueUo);
                            break;
                        }
                        break;
                    case 47:
                        UndoManager undoManager3 = this.getUndoManager();
                        if (undoManager3 != null && (textFieldValueT = undoManager3.t()) != null) {
                            this.onValueChange.invoke(textFieldValueT);
                            break;
                        }
                        break;
                    case 48:
                        KeyEventHelpers_androidKt.rl();
                        break;
                }
            }
        });
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.n();
        }
        return booleanRef.element;
    }

    public /* synthetic */ TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z2, boolean z3, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, Function1 function1, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(legacyTextFieldState, textFieldSelectionManager, (i3 & 4) != 0 ? new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null) : textFieldValue, (i3 & 8) != 0 ? true : z2, (i3 & 16) != 0 ? false : z3, textPreparedSelectionState, (i3 & 64) != 0 ? OffsetMapping.INSTANCE.n() : offsetMapping, (i3 & 128) != 0 ? null : undoManager, deadKeyCombiner, (i3 & 512) != 0 ? KeyMapping_androidKt.n() : keyMapping, (i3 & 1024) != 0 ? new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput.1
            public final void n(TextFieldValue textFieldValue2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                n(textFieldValue2);
                return Unit.INSTANCE;
            }
        } : function1, i2, null);
    }
}

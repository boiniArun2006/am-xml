package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyEventHelpers_androidKt;
import androidx.compose.foundation.text.KeyMapping;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text.TextFieldKeyInput_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextRange;
import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J:\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJX\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/KeyEvent;", a.f62811a, "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "clipboardKeyCommandsHandler", "", "editable", "singleLine", "Lkotlin/Function0;", "", "onSubmit", "nr", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function0;)Z", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;)F", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "t", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "rl", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function0;)Z", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "preparedSelectionState", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "deadKeyCombiner", "Landroidx/compose/foundation/text/KeyMapping;", "Landroidx/compose/foundation/text/KeyMapping;", "keyMapping", "Landroidx/collection/MutableLongSet;", "Landroidx/collection/MutableLongSet;", "currentlyConsumedDownKeys", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldKeyEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,294:1\n247#1,27:296\n1#2:295\n61#3:323\n70#4:324\n22#5:325\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n*L\n160#1:296,27\n289#1:323\n289#1:324\n289#1:325\n*E\n"})
public abstract class TextFieldKeyEventHandler {

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private MutableLongSet currentlyConsumedDownKeys;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TextFieldPreparedSelectionState preparedSelectionState = new TextFieldPreparedSelectionState();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final DeadKeyCombiner deadKeyCombiner = new DeadKeyCombiner();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final KeyMapping keyMapping = KeyMapping_androidKt.n();

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

    private final float n(TextLayoutState textLayoutState) {
        LayoutCoordinates layoutCoordinatesMUb = textLayoutState.mUb();
        if (layoutCoordinatesMUb != null) {
            Rect rectN = null;
            if (!layoutCoordinatesMUb.nr()) {
                layoutCoordinatesMUb = null;
            }
            if (layoutCoordinatesMUb != null) {
                LayoutCoordinates layoutCoordinatesO = textLayoutState.O();
                if (layoutCoordinatesO != null) {
                    if (!layoutCoordinatesO.nr()) {
                        layoutCoordinatesO = null;
                    }
                    if (layoutCoordinatesO != null) {
                        rectN = LayoutCoordinates.N(layoutCoordinatesO, layoutCoordinatesMUb, false, 2, null);
                    }
                }
                if (rectN != null) {
                    return Float.intBitsToFloat((int) (rectN.Ik() & 4294967295L));
                }
                return Float.NaN;
            }
            return Float.NaN;
        }
        return Float.NaN;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final boolean nr(KeyEvent event, TransformedTextFieldState textFieldState, TextLayoutState textLayoutState, Function1 clipboardKeyCommandsHandler, boolean editable, boolean singleLine, Function0 onSubmit) {
        WedgeAffinity wedgeAffinity;
        Integer numN;
        boolean z2 = false;
        if (TextFieldKeyInput_androidKt.n(event) && (numN = this.deadKeyCombiner.n(event)) != null) {
            String string = StringHelpers_jvmKt.n(new StringBuilder(2), numN.intValue()).toString();
            if (!editable) {
                return false;
            }
            TransformedTextFieldState.aYN(textFieldState, string, true, null, !TextFieldKeyEventHandler_androidKt.t(event), 4, null);
            this.preparedSelectionState.rl();
            return true;
        }
        KeyCommand keyCommandN = this.keyMapping.n(event);
        if (keyCommandN != null && (!keyCommandN.getEditsText() || editable)) {
            TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(textFieldState, textLayoutState.J2(), TextFieldKeyEventHandler_androidKt.t(event), n(textLayoutState), this.preparedSelectionState);
            switch (WhenMappings.$EnumSwitchMapping$0[keyCommandN.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    clipboardKeyCommandsHandler.invoke(keyCommandN);
                    z2 = true;
                    break;
                case 4:
                    textFieldPreparedSelection.O(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$processKeyDownEvent$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                            n(textFieldPreparedSelection2);
                            return Unit.INSTANCE;
                        }

                        public final void n(TextFieldPreparedSelection textFieldPreparedSelection2) {
                            textFieldPreparedSelection2.nY();
                        }
                    });
                    z2 = true;
                    break;
                case 5:
                    textFieldPreparedSelection.J2(new Function1<TextFieldPreparedSelection, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$processKeyDownEvent$1$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                            n(textFieldPreparedSelection2);
                            return Unit.INSTANCE;
                        }

                        public final void n(TextFieldPreparedSelection textFieldPreparedSelection2) {
                            textFieldPreparedSelection2.T();
                        }
                    });
                    z2 = true;
                    break;
                case 6:
                    textFieldPreparedSelection.g();
                    z2 = true;
                    break;
                case 7:
                    textFieldPreparedSelection.N();
                    z2 = true;
                    break;
                case 8:
                    textFieldPreparedSelection.e();
                    z2 = true;
                    break;
                case 9:
                    textFieldPreparedSelection.iF();
                    z2 = true;
                    break;
                case 10:
                    textFieldPreparedSelection.Xw();
                    z2 = true;
                    break;
                case 11:
                    textFieldPreparedSelection.aYN();
                    z2 = true;
                    break;
                case 12:
                    textFieldPreparedSelection.jB();
                    z2 = true;
                    break;
                case 13:
                    textFieldPreparedSelection.ViF();
                    z2 = true;
                    break;
                case 14:
                    textFieldPreparedSelection.bzg();
                    z2 = true;
                    break;
                case 15:
                    textFieldPreparedSelection.wTp();
                    z2 = true;
                    break;
                case 16:
                    textFieldPreparedSelection.v();
                    z2 = true;
                    break;
                case 17:
                    textFieldPreparedSelection.rV9();
                    z2 = true;
                    break;
                case 18:
                    textFieldPreparedSelection.s7N();
                    z2 = true;
                    break;
                case 19:
                    textFieldPreparedSelection.nHg();
                    z2 = true;
                    break;
                case 20:
                    textFieldPreparedSelection.E2().Uo();
                    z2 = true;
                    break;
                case 21:
                    textFieldPreparedSelection.te().Uo();
                    z2 = true;
                    break;
                case 22:
                    textFieldPreparedSelection.X().Uo();
                    z2 = true;
                    break;
                case 23:
                    textFieldPreparedSelection.fD().Uo();
                    z2 = true;
                    break;
                case 24:
                    textFieldPreparedSelection.bzg().Uo();
                    z2 = true;
                    break;
                case 25:
                    textFieldPreparedSelection.wTp().Uo();
                    z2 = true;
                    break;
                case 26:
                    if (!singleLine) {
                        TransformedTextFieldState.aYN(textFieldState, "\n", true, null, !TextFieldKeyEventHandler_androidKt.t(event), 4, null);
                    } else {
                        onSubmit.invoke();
                    }
                    z2 = true;
                    break;
                case 27:
                    if (!singleLine) {
                        TransformedTextFieldState.aYN(textFieldState, "\t", true, null, !TextFieldKeyEventHandler_androidKt.t(event), 4, null);
                        z2 = true;
                    }
                    break;
                case 28:
                    textFieldPreparedSelection.U();
                    z2 = true;
                    break;
                case 29:
                    textFieldPreparedSelection.nY().P5();
                    z2 = true;
                    break;
                case 30:
                    textFieldPreparedSelection.T().P5();
                    z2 = true;
                    break;
                case 31:
                    textFieldPreparedSelection.g().P5();
                    z2 = true;
                    break;
                case 32:
                    textFieldPreparedSelection.N().P5();
                    z2 = true;
                    break;
                case 33:
                    textFieldPreparedSelection.e().P5();
                    z2 = true;
                    break;
                case 34:
                    textFieldPreparedSelection.iF().P5();
                    z2 = true;
                    break;
                case 35:
                    textFieldPreparedSelection.bzg().P5();
                    z2 = true;
                    break;
                case 36:
                    textFieldPreparedSelection.wTp().P5();
                    z2 = true;
                    break;
                case 37:
                    textFieldPreparedSelection.v().P5();
                    z2 = true;
                    break;
                case 38:
                    textFieldPreparedSelection.rV9().P5();
                    z2 = true;
                    break;
                case 39:
                    textFieldPreparedSelection.Xw().P5();
                    z2 = true;
                    break;
                case 40:
                    textFieldPreparedSelection.aYN().P5();
                    z2 = true;
                    break;
                case 41:
                    textFieldPreparedSelection.jB().P5();
                    z2 = true;
                    break;
                case 42:
                    textFieldPreparedSelection.ViF().P5();
                    z2 = true;
                    break;
                case 43:
                    textFieldPreparedSelection.s7N().P5();
                    z2 = true;
                    break;
                case 44:
                    textFieldPreparedSelection.nHg().P5();
                    z2 = true;
                    break;
                case 45:
                    textFieldPreparedSelection.KN();
                    z2 = true;
                    break;
                case 46:
                    textFieldState.E2();
                    z2 = true;
                    break;
                case 47:
                    textFieldState.XQ();
                    z2 = true;
                    break;
                case 48:
                    KeyEventHelpers_androidKt.rl();
                    z2 = true;
                    break;
                default:
                    z2 = true;
                    break;
            }
            if (!TextRange.Uo(textFieldPreparedSelection.getSelection(), textFieldPreparedSelection.getInitialValue().getSelection())) {
                textFieldState.te(textFieldPreparedSelection.getSelection());
            }
            if (textFieldPreparedSelection.getWedgeAffinity() != null && (wedgeAffinity = textFieldPreparedSelection.getWedgeAffinity()) != null) {
                if (TextRange.KN(textFieldState.ty().getSelection())) {
                    textFieldState.fD(new SelectionWedgeAffinity(wedgeAffinity));
                    return z2;
                }
                textFieldState.fD(SelectionWedgeAffinity.rl(textFieldPreparedSelection.getInitialWedgeAffinity(), null, wedgeAffinity, 1, null));
            }
        }
        return z2;
    }

    public boolean rl(KeyEvent event, TransformedTextFieldState textFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, Function1 clipboardKeyCommandsHandler, boolean editable, boolean singleLine, Function0 onSubmit) {
        long jN = KeyEvent_androidKt.n(event);
        int iRl = KeyEvent_androidKt.rl(event);
        KeyEventType.Companion companion = KeyEventType.INSTANCE;
        if (KeyEventType.J2(iRl, companion.rl())) {
            MutableLongSet mutableLongSet = this.currentlyConsumedDownKeys;
            if (mutableLongSet == null || !mutableLongSet.n(jN)) {
                return false;
            }
            MutableLongSet mutableLongSet2 = this.currentlyConsumedDownKeys;
            if (mutableLongSet2 != null) {
                mutableLongSet2.az(jN);
            }
            return true;
        }
        if (KeyEventType.J2(KeyEvent_androidKt.rl(event), companion.t()) && !TextFieldKeyInput_androidKt.n(event)) {
            return false;
        }
        boolean zNr = nr(event, textFieldState, textLayoutState, clipboardKeyCommandsHandler, editable, singleLine, onSubmit);
        if (zNr) {
            MutableLongSet mutableLongSet3 = this.currentlyConsumedDownKeys;
            if (mutableLongSet3 == null) {
                mutableLongSet3 = new MutableLongSet(3);
                this.currentlyConsumedDownKeys = mutableLongSet3;
            }
            mutableLongSet3.qie(jN);
        }
        return zNr;
    }

    public boolean t(KeyEvent event, TransformedTextFieldState textFieldState, TextFieldSelectionState textFieldSelectionState, FocusManager focusManager, SoftwareKeyboardController keyboardController) {
        if (!TextRange.KN(textFieldState.HI().getSelection()) && KeyEventHelpers_androidKt.n(event)) {
            textFieldSelectionState.wTp();
            return true;
        }
        return false;
    }
}

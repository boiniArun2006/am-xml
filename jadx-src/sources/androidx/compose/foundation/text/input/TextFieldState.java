package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextUndoManager;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002YZB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ-\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0011H\u0001¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b,\u0010+J'\u00100\u001a\u00020\u00112\u0006\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\rH\u0001¢\u0006\u0004\b0\u00101R\u001a\u00106\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R(\u0010<\u001a\u00020!8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b7\u00108\u0012\u0004\b;\u0010'\u001a\u0004\b9\u0010#\"\u0004\b:\u0010%R+\u0010C\u001a\u00020\r2\u0006\u0010=\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR+\u0010H\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u00148@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010>\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR \u0010N\u001a\u00020I8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010J\u0012\u0004\bM\u0010'\u001a\u0004\bK\u0010LR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020(0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010PR\u0011\u0010U\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0017\u0010X\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bV\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "", "", "initialText", "Landroidx/compose/ui/text/TextRange;", "initialSelection", "Landroidx/compose/foundation/text/input/TextUndoManager;", "initialTextUndoManager", "<init>", "(Ljava/lang/String;JLandroidx/compose/foundation/text/input/TextUndoManager;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/text/input/InputTransformation;", "inputTransformation", "", "restartImeIfContentChanges", "Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "undoBehavior", "", "O", "(Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "oldValue", "newValue", "Z", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Z)V", "previousValue", "postValue", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "changes", "ty", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "r", "()Landroidx/compose/foundation/text/input/TextFieldBuffer;", "nr", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "J2", "()V", "Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "notifyImeListener", "t", "(Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;)V", "HI", "temporaryBuffer", "textChanged", "selectionChanged", "o", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;ZZ)V", c.f62177j, "Landroidx/compose/foundation/text/input/TextUndoManager;", "mUb", "()Landroidx/compose/foundation/text/input/TextUndoManager;", "textUndoManager", "rl", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Uo", "setMainBuffer$foundation_release", "getMainBuffer$foundation_release$annotations", "mainBuffer", "<set-?>", "Landroidx/compose/runtime/MutableState;", "az", "()Z", "ck", "(Z)V", "isEditing", "qie", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "Ik", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;)V", "value", "Landroidx/compose/foundation/text/input/UndoState;", "Landroidx/compose/foundation/text/input/UndoState;", "gh", "()Landroidx/compose/foundation/text/input/UndoState;", "getUndoState$annotations", "undoState", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "notifyImeListeners", "", "xMQ", "()Ljava/lang/CharSequence;", "text", "KN", "()J", "selection", "NotifyImeListener", "Saver", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,765:1\n1101#2:766\n1083#2,2:767\n85#3:769\n113#3,2:770\n85#3:772\n113#3,2:773\n602#4,8:775\n602#4,8:783\n50#5,5:791\n1#6:796\n423#7,9:797\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n593#1:766\n593#1:767,2\n96#1:769\n96#1:770,2\n110#1:772\n110#1:773,2\n180#1:775,8\n197#1:783,8\n198#1:791,5\n447#1:797,9\n*E\n"})
public final class TextFieldState {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableVector notifyImeListeners;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final UndoState undoState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TextUndoManager textUndoManager;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private TextFieldBuffer mainBuffer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState isEditing;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "oldValue", "newValue", "", "restartIme", "", c.f62177j, "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Z)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface NotifyImeListener {
        void n(TextFieldCharSequence oldValue, TextFieldCharSequence newValue, boolean restartIme);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState$Saver;", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/TextFieldState;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/SaverScope;", "value", "nr", "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/text/input/TextFieldState;)Ljava/lang/Object;", "t", "(Ljava/lang/Object;)Landroidx/compose/foundation/text/input/TextFieldState;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState$Saver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,765:1\n1#2:766\n*E\n"})
    public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextFieldState, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Saver f19993n = new Saver();

        @Override // androidx.compose.runtime.saveable.Saver
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public TextFieldState rl(Object value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) value;
            Object obj = list.get(0);
            Object obj2 = list.get(1);
            Object obj3 = list.get(2);
            Object obj4 = list.get(3);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            long jRl = TextRangeKt.rl(iIntValue, ((Integer) obj3).intValue());
            TextUndoManager.Companion.Saver saver = TextUndoManager.Companion.Saver.f20003n;
            Intrinsics.checkNotNull(obj4);
            TextUndoManager textUndoManagerT = saver.rl(obj4);
            Intrinsics.checkNotNull(textUndoManagerT);
            return new TextFieldState(str, jRl, textUndoManagerT, null);
        }

        private Saver() {
        }

        @Override // androidx.compose.runtime.saveable.Saver
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public Object n(SaverScope saverScope, TextFieldState textFieldState) {
            return CollectionsKt.listOf(textFieldState.xMQ().toString(), Integer.valueOf(TextRange.ty(textFieldState.KN())), Integer.valueOf(TextRange.xMQ(textFieldState.KN())), TextUndoManager.Companion.Saver.f20003n.n(saverScope, textFieldState.getTextUndoManager()));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldEditUndoBehavior.values().length];
            try {
                iArr[TextFieldEditUndoBehavior.f20588t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.f20586n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.f20585O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TextFieldState(String str, long j2, TextUndoManager textUndoManager, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, textUndoManager);
    }

    public final void J2() {
        ck(false);
    }

    public /* synthetic */ TextFieldState(String str, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2);
    }

    private final void Ik(TextFieldCharSequence textFieldCharSequence) {
        this.value.setValue(textFieldCharSequence);
    }

    private final boolean az() {
        return ((Boolean) this.isEditing.getValue()).booleanValue();
    }

    private final void ck(boolean z2) {
        this.isEditing.setValue(Boolean.valueOf(z2));
    }

    private final void ty(TextFieldCharSequence previousValue, TextFieldCharSequence postValue, TextFieldBuffer.ChangeList changes, TextFieldEditUndoBehavior undoBehavior) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[undoBehavior.ordinal()];
        if (i2 == 1) {
            this.textUndoManager.t();
        } else if (i2 == 2) {
            TextUndoManagerKt.t(this.textUndoManager, previousValue, postValue, changes, true);
        } else {
            if (i2 != 3) {
                return;
            }
            TextUndoManagerKt.t(this.textUndoManager, previousValue, postValue, changes, false);
        }
    }

    public final void HI(NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.ck(notifyImeListener);
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final TextFieldBuffer getMainBuffer() {
        return this.mainBuffer;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final UndoState getUndoState() {
        return this.undoState;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final TextUndoManager getTextUndoManager() {
        return this.textUndoManager;
    }

    public final void o(TextFieldBuffer temporaryBuffer, boolean textChanged, boolean selectionChanged) {
        TextFieldCharSequence textFieldCharSequenceG = TextFieldBuffer.g(this.mainBuffer, 0L, null, null, 7, null);
        if (textChanged) {
            this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(temporaryBuffer.toString(), temporaryBuffer.getSelectionInChars(), null, null, null, 28, null), null, null, null, 14, null);
        } else if (selectionChanged) {
            this.mainBuffer.aYN(TextRangeKt.rl(TextRange.ty(temporaryBuffer.getSelectionInChars()), TextRange.xMQ(temporaryBuffer.getSelectionInChars())));
        }
        if (textChanged || selectionChanged || !Intrinsics.areEqual(textFieldCharSequenceG.getComposition(), temporaryBuffer.getComposition())) {
            this.mainBuffer.nr();
        }
        Z(textFieldCharSequenceG, TextFieldBuffer.g(this.mainBuffer, 0L, null, null, 7, null), true);
    }

    public final TextFieldCharSequence qie() {
        return (TextFieldCharSequence) this.value.getValue();
    }

    public final TextFieldBuffer r() {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot snapshotNr = companion.nr();
        Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
        Snapshot snapshotO = companion.O(snapshotNr);
        try {
            if (az()) {
                InlineClassHelperKt.t("TextFieldState does not support concurrent or nested editing.");
            }
            ck(true);
            return new TextFieldBuffer(qie(), null, null, null, 14, null);
        } finally {
            companion.az(snapshotNr, snapshotO, function1Uo);
        }
    }

    public final void t(NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.rl(notifyImeListener);
    }

    public String toString() {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot snapshotNr = companion.nr();
        Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
        Snapshot snapshotO = companion.O(snapshotNr);
        try {
            return "TextFieldState(selection=" + ((Object) TextRange.Ik(KN())) + ", text=\"" + ((Object) xMQ()) + "\")";
        } finally {
            companion.az(snapshotNr, snapshotO, function1Uo);
        }
    }

    private TextFieldState(String str, long j2, TextUndoManager textUndoManager) {
        this.textUndoManager = textUndoManager;
        this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(str, TextRangeKt.t(j2, 0, str.length()), null, null, null, 28, null), null, null, null, 14, null);
        this.isEditing = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
        this.value = SnapshotStateKt__SnapshotStateKt.O(new TextFieldCharSequence(str, j2, null, null, null, 28, null), null, 2, null);
        this.undoState = new UndoState(this);
        this.notifyImeListeners = new MutableVector(new NotifyImeListener[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(InputTransformation inputTransformation, boolean restartImeIfContentChanges, TextFieldEditUndoBehavior undoBehavior) {
        boolean z2;
        TextFieldCharSequence textFieldCharSequenceQie = qie();
        if (this.mainBuffer.O().rl() == 0 && TextRange.Uo(textFieldCharSequenceQie.getSelection(), this.mainBuffer.getSelectionInChars())) {
            if (Intrinsics.areEqual(textFieldCharSequenceQie.getComposition(), this.mainBuffer.getComposition()) && Intrinsics.areEqual(textFieldCharSequenceQie.getHighlight(), this.mainBuffer.getHighlight()) && Intrinsics.areEqual(textFieldCharSequenceQie.getComposingAnnotations(), this.mainBuffer.getComposingAnnotations())) {
                return;
            }
            Z(qie(), new TextFieldCharSequence(this.mainBuffer.toString(), this.mainBuffer.getSelectionInChars(), this.mainBuffer.getComposition(), this.mainBuffer.getHighlight(), TextFieldStateKt.rl(this.mainBuffer.getComposition(), this.mainBuffer.getComposingAnnotations()), null), restartImeIfContentChanges);
            return;
        }
        boolean z3 = false;
        if (this.mainBuffer.O().rl() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        TextFieldCharSequence textFieldCharSequence = new TextFieldCharSequence(this.mainBuffer.toString(), this.mainBuffer.getSelectionInChars(), this.mainBuffer.getComposition(), this.mainBuffer.getHighlight(), TextFieldStateKt.rl(this.mainBuffer.getComposition(), this.mainBuffer.getComposingAnnotations()), null);
        if (inputTransformation == null) {
            if (z2 && restartImeIfContentChanges) {
                z3 = true;
            }
            Z(textFieldCharSequenceQie, textFieldCharSequence, z3);
            ty(textFieldCharSequenceQie, textFieldCharSequence, this.mainBuffer.O(), undoBehavior);
            return;
        }
        TextFieldBuffer textFieldBuffer = new TextFieldBuffer(textFieldCharSequence, this.mainBuffer.O(), textFieldCharSequenceQie, null, 8, null);
        inputTransformation.B(textFieldBuffer);
        boolean zContentEquals = StringsKt.contentEquals(textFieldBuffer.n(), textFieldCharSequence);
        boolean z4 = !zContentEquals;
        boolean zUo = TextRange.Uo(textFieldBuffer.getSelectionInChars(), textFieldCharSequence.getSelection());
        boolean z5 = !zUo;
        if (zContentEquals && zUo) {
            Z(textFieldCharSequenceQie, TextFieldBuffer.g(textFieldBuffer, 0L, textFieldCharSequence.getComposition(), null, 5, null), restartImeIfContentChanges);
        } else {
            o(textFieldBuffer, z4, z5);
        }
        ty(textFieldCharSequenceQie, qie(), textFieldBuffer.J2(), undoBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(TextFieldCharSequence oldValue, TextFieldCharSequence newValue, boolean restartImeIfContentChanges) {
        boolean z2;
        Ik(newValue);
        J2();
        MutableVector mutableVector = this.notifyImeListeners;
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            NotifyImeListener notifyImeListener = (NotifyImeListener) objArr[i2];
            if (restartImeIfContentChanges && !oldValue.n(newValue) && oldValue.getComposition() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            notifyImeListener.n(oldValue, newValue, z2);
        }
    }

    public final long KN() {
        return qie().getSelection();
    }

    public final void nr(TextFieldBuffer newValue) {
        boolean z2;
        if (newValue.J2().rl() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zUo = true ^ TextRange.Uo(newValue.getSelectionInChars(), this.mainBuffer.getSelectionInChars());
        if (z2) {
            this.textUndoManager.t();
        }
        o(newValue, z2, zUo);
    }

    public final CharSequence xMQ() {
        return qie().getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldState(String str, long j2) {
        this(str, j2, new TextUndoManager(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), null);
    }
}

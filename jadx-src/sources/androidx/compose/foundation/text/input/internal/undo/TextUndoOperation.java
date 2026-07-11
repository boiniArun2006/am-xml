package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.UndoManager_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001)BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u0014\u0010 R\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$R\u0011\u0010(\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "", "", "index", "", "preText", "postText", "Landroidx/compose/ui/text/TextRange;", "preSelection", "postSelection", "", "timeInMillis", "", "canMerge", "<init>", "(ILjava/lang/String;Ljava/lang/String;JJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", c.f62177j, "I", "nr", "()I", "rl", "Ljava/lang/String;", "KN", "()Ljava/lang/String;", "t", "J2", "J", "Uo", "()J", "O", "mUb", "Z", "()Z", "Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "xMQ", "()Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "textEditType", "Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "()Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "deletionType", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextUndoOperation {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long timeInMillis;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final TextEditType textEditType;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long postSelection;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final boolean canMerge;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long preSelection;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final String preText;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String postText;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver mUb = new Saver<TextUndoOperation, Object>() { // from class: androidx.compose.foundation.text.input.internal.undo.TextUndoOperation$Companion$Saver$1
        @Override // androidx.compose.runtime.saveable.Saver
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public TextUndoOperation rl(Object value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) value;
            Object obj = list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = list.get(3);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj4).intValue();
            Object obj5 = list.get(4);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
            long jRl = TextRangeKt.rl(iIntValue2, ((Integer) obj5).intValue());
            Object obj6 = list.get(5);
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue3 = ((Integer) obj6).intValue();
            Object obj7 = list.get(6);
            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
            long jRl2 = TextRangeKt.rl(iIntValue3, ((Integer) obj7).intValue());
            Object obj8 = list.get(7);
            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
            return new TextUndoOperation(iIntValue, (String) obj2, (String) obj3, jRl, jRl2, ((Long) obj8).longValue(), false, 64, null);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public Object n(SaverScope saverScope, TextUndoOperation textUndoOperation) {
            return CollectionsKt.listOf(Integer.valueOf(textUndoOperation.getIndex()), textUndoOperation.getPreText(), textUndoOperation.getPostText(), Integer.valueOf(TextRange.ty(textUndoOperation.getPreSelection())), Integer.valueOf(TextRange.xMQ(textUndoOperation.getPreSelection())), Integer.valueOf(TextRange.ty(textUndoOperation.getPostSelection())), Integer.valueOf(TextRange.xMQ(textUndoOperation.getPostSelection())), Long.valueOf(textUndoOperation.getTimeInMillis()));
        }
    };

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", c.f62177j, "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver n() {
            return TextUndoOperation.mUb;
        }
    }

    public /* synthetic */ TextUndoOperation(int i2, String str, String str2, long j2, long j3, long j4, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str, str2, j2, j3, j4, z2);
    }

    private TextUndoOperation(int i2, String str, String str2, long j2, long j3, long j4, boolean z2) {
        this.index = i2;
        this.preText = str;
        this.postText = str2;
        this.preSelection = j2;
        this.postSelection = j3;
        this.timeInMillis = j4;
        this.canMerge = z2;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        this.textEditType = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? TextEditType.f20581O : TextEditType.f20584t : TextEditType.f20582n;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final String getPostText() {
        return this.postText;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final String getPreText() {
        return this.preText;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final long getPostSelection() {
        return this.postSelection;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final long getPreSelection() {
        return this.preSelection;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final long getTimeInMillis() {
        return this.timeInMillis;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final boolean getCanMerge() {
        return this.canMerge;
    }

    public final TextDeleteType t() {
        return this.textEditType != TextEditType.f20584t ? TextDeleteType.J2 : !TextRange.KN(this.postSelection) ? TextDeleteType.J2 : TextRange.KN(this.preSelection) ? TextRange.ty(this.preSelection) > TextRange.ty(this.postSelection) ? TextDeleteType.f20577n : TextDeleteType.f20580t : (TextRange.ty(this.preSelection) == TextRange.ty(this.postSelection) && TextRange.ty(this.preSelection) == this.index) ? TextDeleteType.f20576O : TextDeleteType.J2;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final TextEditType getTextEditType() {
        return this.textEditType;
    }

    public /* synthetic */ TextUndoOperation(int i2, String str, String str2, long j2, long j3, long j4, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str, str2, j2, j3, (i3 & 32) != 0 ? UndoManager_jvmKt.n() : j4, (i3 & 64) != 0 ? true : z2, null);
    }
}

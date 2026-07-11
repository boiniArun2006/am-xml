package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0003JKLB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010'\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J'\u00100\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020)H\u0016¢\u0006\u0004\b0\u00101R/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u00102\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R/\u0010\t\u001a\u0004\u0018\u00010\b2\b\u00102\u001a\u0004\u0018\u00010\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010*\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006M"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache;", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/runtime/snapshots/StateObject;", "<init>", "()V", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "nonMeasureInputs", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "measureInputs", "E2", "(Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs;)Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/TextMeasurer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs;)Landroidx/compose/ui/text/TextMeasurer;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "visualText", "te", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs;)Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "softWrap", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "", "s7N", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZZLandroidx/compose/foundation/text/KeyboardOptions;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Constraints;", "constraints", "X", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "HI", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "previous", "current", "applied", "XQ", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "<set-?>", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/runtime/MutableState;", "fD", "()Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "nHg", "(Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;)V", "t", "iF", "()Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "N", "(Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs;)V", "O", "Landroidx/compose/ui/text/TextMeasurer;", "textMeasurer", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$CacheRecord;", "J2", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$CacheRecord;", "record", "e", "()Landroidx/compose/ui/text/TextLayoutResult;", "ck", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "CacheRecord", "MeasureInputs", "NonMeasureInputs", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldLayoutStateCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n246#1,4:520\n251#1:531\n85#2:506\n113#2,2:507\n85#2:509\n113#2,2:510\n70#3,7:512\n2475#4:519\n2355#4:524\n1894#4,2:525\n2356#4:529\n2355#4:532\n1894#4,2:533\n2356#4:537\n33#5,2:527\n33#5,2:535\n1#6:530\n1#6:538\n1#6:539\n*S KotlinDebug\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache\n*L\n226#1:520,4\n226#1:531\n71#1:506\n71#1:507,2\n73#1:509\n73#1:510,2\n147#1:512,7\n163#1:519\n226#1:524\n226#1:525,2\n226#1:529\n249#1:532\n249#1:533,2\n249#1:537\n226#1:527,2\n249#1:535,2\n226#1:530\n249#1:538\n*E\n"})
public final class TextFieldLayoutStateCache implements State<TextLayoutResult>, StateObject {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private TextMeasurer textMeasurer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableState nonMeasureInputs = SnapshotStateKt.xMQ(null, NonMeasureInputs.INSTANCE.n());

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState measureInputs = SnapshotStateKt.xMQ(null, MeasureInputs.INSTANCE.n());

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private CacheRecord record = new CacheRecord();

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R4\u0010\u001d\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00160\u0015j\u0002`\u0017\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00104\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00108\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010)\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010C\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010;\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R$\u0010J\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010R\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR(\u0010X\u001a\u00020S8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b<\u0010T\u001a\u0004\bL\u0010U\"\u0004\bV\u0010WR$\u0010_\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$CacheRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "<init>", "()V", "nr", "()Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "t", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "", "toString", "()Ljava/lang/String;", "", "Ljava/lang/CharSequence;", "XQ", "()Ljava/lang/CharSequence;", "X", "(Ljava/lang/CharSequence;)V", "visualText", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "Ljava/util/List;", "mUb", "()Ljava/util/List;", "S", "(Ljava/util/List;)V", "composingAnnotations", "Landroidx/compose/ui/text/TextRange;", "O", "Landroidx/compose/ui/text/TextRange;", "gh", "()Landroidx/compose/ui/text/TextRange;", "WPU", "(Landroidx/compose/ui/text/TextRange;)V", "composition", "Landroidx/compose/ui/text/TextStyle;", "J2", "Landroidx/compose/ui/text/TextStyle;", "Z", "()Landroidx/compose/ui/text/TextStyle;", "e", "(Landroidx/compose/ui/text/TextStyle;)V", "textStyle", "", "Uo", "r", "()Z", "fD", "(Z)V", "singleLine", "KN", "o", "E2", "softWrap", "", "xMQ", "F", "az", "()F", "ViF", "(F)V", "densityValue", "HI", "g", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/LayoutDirection;", "ck", "()Landroidx/compose/ui/unit/LayoutDirection;", "te", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "qie", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "ty", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "nY", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontFamilyResolver", "Landroidx/compose/ui/unit/Constraints;", "J", "()J", "aYN", "(J)V", "constraints", "Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/TextLayoutResult;", "Ik", "()Landroidx/compose/ui/text/TextLayoutResult;", "iF", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "layoutResult", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class CacheRecord extends StateRecord {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
        private TextStyle textStyle;

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata and from toString */
        private boolean softWrap;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
        private TextRange composition;

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata and from toString */
        private boolean singleLine;

        /* JADX INFO: renamed from: gh, reason: from kotlin metadata and from toString */
        private LayoutDirection layoutDirection;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
        private List composingAnnotations;

        /* JADX INFO: renamed from: qie, reason: from kotlin metadata and from toString */
        private FontFamily.Resolver fontFamilyResolver;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private CharSequence visualText;

        /* JADX INFO: renamed from: ty, reason: from kotlin metadata and from toString */
        private TextLayoutResult layoutResult;

        /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata and from toString */
        private float densityValue = Float.NaN;

        /* JADX INFO: renamed from: mUb, reason: from kotlin metadata and from toString */
        private float fontScale = Float.NaN;

        /* JADX INFO: renamed from: az, reason: from kotlin metadata and from toString */
        private long constraints = ConstraintsKt.rl(0, 0, 0, 0, 15, null);

        public final void E2(boolean z2) {
            this.softWrap = z2;
        }

        /* JADX INFO: renamed from: HI, reason: from getter */
        public final float getFontScale() {
            return this.fontScale;
        }

        /* JADX INFO: renamed from: Ik, reason: from getter */
        public final TextLayoutResult getLayoutResult() {
            return this.layoutResult;
        }

        public final void S(List list) {
            this.composingAnnotations = list;
        }

        public final void ViF(float f3) {
            this.densityValue = f3;
        }

        public final void WPU(TextRange textRange) {
            this.composition = textRange;
        }

        public final void X(CharSequence charSequence) {
            this.visualText = charSequence;
        }

        /* JADX INFO: renamed from: XQ, reason: from getter */
        public final CharSequence getVisualText() {
            return this.visualText;
        }

        /* JADX INFO: renamed from: Z, reason: from getter */
        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final void aYN(long j2) {
            this.constraints = j2;
        }

        /* JADX INFO: renamed from: az, reason: from getter */
        public final float getDensityValue() {
            return this.densityValue;
        }

        /* JADX INFO: renamed from: ck, reason: from getter */
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final void e(TextStyle textStyle) {
            this.textStyle = textStyle;
        }

        public final void fD(boolean z2) {
            this.singleLine = z2;
        }

        public final void g(float f3) {
            this.fontScale = f3;
        }

        /* JADX INFO: renamed from: gh, reason: from getter */
        public final TextRange getComposition() {
            return this.composition;
        }

        public final void iF(TextLayoutResult textLayoutResult) {
            this.layoutResult = textLayoutResult;
        }

        /* JADX INFO: renamed from: mUb, reason: from getter */
        public final List getComposingAnnotations() {
            return this.composingAnnotations;
        }

        public final void nY(FontFamily.Resolver resolver) {
            this.fontFamilyResolver = resolver;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord nr() {
            return new CacheRecord();
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        /* JADX INFO: renamed from: qie, reason: from getter */
        public final long getConstraints() {
            return this.constraints;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final boolean getSingleLine() {
            return this.singleLine;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void t(StateRecord value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
            CacheRecord cacheRecord = (CacheRecord) value;
            this.visualText = cacheRecord.visualText;
            this.composingAnnotations = cacheRecord.composingAnnotations;
            this.composition = cacheRecord.composition;
            this.textStyle = cacheRecord.textStyle;
            this.singleLine = cacheRecord.singleLine;
            this.softWrap = cacheRecord.softWrap;
            this.densityValue = cacheRecord.densityValue;
            this.fontScale = cacheRecord.fontScale;
            this.layoutDirection = cacheRecord.layoutDirection;
            this.fontFamilyResolver = cacheRecord.fontFamilyResolver;
            this.constraints = cacheRecord.constraints;
            this.layoutResult = cacheRecord.layoutResult;
        }

        public final void te(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public String toString() {
            return "CacheRecord(visualText=" + ((Object) this.visualText) + ", composingAnnotations=" + this.composingAnnotations + ", composition=" + this.composition + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.Ik(this.constraints)) + ", layoutResult=" + this.layoutResult + ')';
        }

        /* JADX INFO: renamed from: ty, reason: from getter */
        public final FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001#B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\u0017\u0010 \u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/ui/unit/Density;", "t", "()Landroidx/compose/ui/unit/Density;", "rl", "Landroidx/compose/ui/unit/LayoutDirection;", "Uo", "()Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "O", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "nr", "J", "()J", "", "F", "()F", "densityValue", "J2", "fontScale", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class MeasureInputs {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
        private final float fontScale;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
        private final float densityValue;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Density density;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
        private final long constraints;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private final LayoutDirection layoutDirection;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final FontFamily.Resolver fontFamilyResolver;

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final SnapshotMutationPolicy KN = new SnapshotMutationPolicy<MeasureInputs>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache$MeasureInputs$Companion$mutationPolicy$1
            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public boolean rl(TextFieldLayoutStateCache.MeasureInputs a2, TextFieldLayoutStateCache.MeasureInputs b2) {
                if (a2 == null || b2 == null) {
                    return !((a2 == null) ^ (b2 == null));
                }
                return a2.getDensityValue() == b2.getDensityValue() && a2.getFontScale() == b2.getFontScale() && a2.getLayoutDirection() == b2.getLayoutDirection() && Intrinsics.areEqual(a2.getFontFamilyResolver(), b2.getFontFamilyResolver()) && Constraints.J2(a2.getConstraints(), b2.getConstraints());
            }
        };

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "mutationPolicy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final SnapshotMutationPolicy n() {
                return MeasureInputs.KN;
            }
        }

        public /* synthetic */ MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(density, layoutDirection, resolver, j2);
        }

        private MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.fontFamilyResolver = resolver;
            this.constraints = j2;
            this.densityValue = density.getDensity();
            this.fontScale = density.getFontScale();
        }

        /* JADX INFO: renamed from: J2, reason: from getter */
        public final float getFontScale() {
            return this.fontScale;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        /* JADX INFO: renamed from: Uo, reason: from getter */
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final float getDensityValue() {
            return this.densityValue;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final long getConstraints() {
            return this.constraints;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final Density getDensity() {
            return this.density;
        }

        public String toString() {
            return "MeasureInputs(density=" + this.density + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.Ik(this.constraints)) + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "softWrap", "isKeyboardTypePhone", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZZZ)V", "", "toString", "()Ljava/lang/String;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "nr", "()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "rl", "Landroidx/compose/ui/text/TextStyle;", "O", "()Landroidx/compose/ui/text/TextStyle;", "t", "Z", "()Z", "J2", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class NonMeasureInputs {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final SnapshotMutationPolicy Uo = new SnapshotMutationPolicy<NonMeasureInputs>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1
            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public boolean rl(TextFieldLayoutStateCache.NonMeasureInputs a2, TextFieldLayoutStateCache.NonMeasureInputs b2) {
                if (a2 == null || b2 == null) {
                    return !((a2 == null) ^ (b2 == null));
                }
                return a2.getTextFieldState() == b2.getTextFieldState() && Intrinsics.areEqual(a2.getTextStyle(), b2.getTextStyle()) && a2.getSingleLine() == b2.getSingleLine() && a2.getSoftWrap() == b2.getSoftWrap() && a2.getIsKeyboardTypePhone() == b2.getIsKeyboardTypePhone();
            }
        };

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isKeyboardTypePhone;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final TransformedTextFieldState textFieldState;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
        private final boolean softWrap;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private final TextStyle textStyle;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean singleLine;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "mutationPolicy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final SnapshotMutationPolicy n() {
                return NonMeasureInputs.Uo;
            }
        }

        /* JADX INFO: renamed from: J2, reason: from getter */
        public final boolean getIsKeyboardTypePhone() {
            return this.isKeyboardTypePhone;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final TransformedTextFieldState getTextFieldState() {
            return this.textFieldState;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final boolean getSingleLine() {
            return this.singleLine;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        public String toString() {
            return "NonMeasureInputs(textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ", isKeyboardTypePhone=" + this.isKeyboardTypePhone + ')';
        }

        public NonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, boolean z3, boolean z4) {
            this.textFieldState = transformedTextFieldState;
            this.textStyle = textStyle;
            this.singleLine = z2;
            this.softWrap = z3;
            this.isKeyboardTypePhone = z4;
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord XQ(StateRecord previous, StateRecord current, StateRecord applied) {
        return applied;
    }

    private final TextLayoutResult E2(NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        CharSequence visualText;
        TextFieldCharSequence textFieldCharSequenceHI = nonMeasureInputs.getTextFieldState().HI();
        CacheRecord cacheRecord = (CacheRecord) SnapshotKt.X(this.record);
        TextLayoutResult layoutResult = cacheRecord.getLayoutResult();
        if (layoutResult != null && (visualText = cacheRecord.getVisualText()) != null && StringsKt.contentEquals(visualText, textFieldCharSequenceHI) && Intrinsics.areEqual(cacheRecord.getComposingAnnotations(), textFieldCharSequenceHI.getComposingAnnotations()) && Intrinsics.areEqual(cacheRecord.getComposition(), textFieldCharSequenceHI.getComposition()) && cacheRecord.getSingleLine() == nonMeasureInputs.getSingleLine() && cacheRecord.getSoftWrap() == nonMeasureInputs.getSoftWrap() && cacheRecord.getLayoutDirection() == measureInputs.getLayoutDirection() && cacheRecord.getDensityValue() == measureInputs.getDensity().getDensity() && cacheRecord.getFontScale() == measureInputs.getDensity().getFontScale() && Constraints.J2(cacheRecord.getConstraints(), measureInputs.getConstraints()) && Intrinsics.areEqual(cacheRecord.getFontFamilyResolver(), measureInputs.getFontFamilyResolver()) && !layoutResult.getMultiParagraph().getIntrinsics().rl()) {
            TextStyle textStyle = cacheRecord.getTextStyle();
            boolean zX = textStyle != null ? textStyle.X(nonMeasureInputs.getTextStyle()) : false;
            TextStyle textStyle2 = cacheRecord.getTextStyle();
            boolean zE = textStyle2 != null ? textStyle2.e(nonMeasureInputs.getTextStyle()) : false;
            if (zX && zE) {
                return layoutResult;
            }
            if (zX) {
                return TextLayoutResult.rl(layoutResult, new TextLayoutInput(layoutResult.getLayoutInput().getText(), nonMeasureInputs.getTextStyle(), layoutResult.getLayoutInput().getPlaceholders(), layoutResult.getLayoutInput().getMaxLines(), layoutResult.getLayoutInput().getSoftWrap(), layoutResult.getLayoutInput().getOverflow(), layoutResult.getLayoutInput().getDensity(), layoutResult.getLayoutInput().getLayoutDirection(), layoutResult.getLayoutInput().getFontFamilyResolver(), layoutResult.getLayoutInput().getConstraints(), (DefaultConstructorMarker) null), 0L, 2, null);
            }
        }
        TextLayoutResult textLayoutResultTe = te(textFieldCharSequenceHI, nonMeasureInputs, measureInputs);
        if (!Intrinsics.areEqual(textLayoutResultTe, layoutResult)) {
            Snapshot snapshotT = Snapshot.INSTANCE.t();
            if (!snapshotT.KN()) {
                CacheRecord cacheRecord2 = this.record;
                synchronized (SnapshotKt.nHg()) {
                    CacheRecord cacheRecord3 = (CacheRecord) SnapshotKt.k(cacheRecord2, this, snapshotT);
                    cacheRecord3.X(textFieldCharSequenceHI);
                    cacheRecord3.S(textFieldCharSequenceHI.getComposingAnnotations());
                    cacheRecord3.WPU(textFieldCharSequenceHI.getComposition());
                    cacheRecord3.fD(nonMeasureInputs.getSingleLine());
                    cacheRecord3.E2(nonMeasureInputs.getSoftWrap());
                    cacheRecord3.e(nonMeasureInputs.getTextStyle());
                    cacheRecord3.te(measureInputs.getLayoutDirection());
                    cacheRecord3.ViF(measureInputs.getDensityValue());
                    cacheRecord3.g(measureInputs.getFontScale());
                    cacheRecord3.aYN(measureInputs.getConstraints());
                    cacheRecord3.nY(measureInputs.getFontFamilyResolver());
                    cacheRecord3.iF(textLayoutResultTe);
                    Unit unit = Unit.INSTANCE;
                }
                SnapshotKt.jB(snapshotT, this);
                return textLayoutResultTe;
            }
        }
        return textLayoutResultTe;
    }

    private final void N(MeasureInputs measureInputs) {
        this.measureInputs.setValue(measureInputs);
    }

    private final TextMeasurer T(MeasureInputs measureInputs) {
        TextMeasurer textMeasurer = this.textMeasurer;
        if (textMeasurer != null) {
            return textMeasurer;
        }
        TextMeasurer textMeasurer2 = new TextMeasurer(measureInputs.getFontFamilyResolver(), measureInputs.getDensity(), measureInputs.getLayoutDirection(), 1);
        this.textMeasurer = textMeasurer2;
        return textMeasurer2;
    }

    private final NonMeasureInputs fD() {
        return (NonMeasureInputs) this.nonMeasureInputs.getValue();
    }

    private final MeasureInputs iF() {
        return (MeasureInputs) this.measureInputs.getValue();
    }

    private final void nHg(NonMeasureInputs nonMeasureInputs) {
        this.nonMeasureInputs.setValue(nonMeasureInputs);
    }

    private final TextLayoutResult te(TextFieldCharSequence visualText, NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        TextStyle textStyle;
        Locale localeN;
        TextMeasurer textMeasurerT = T(measureInputs);
        if (nonMeasureInputs.getIsKeyboardTypePhone()) {
            LocaleList localeListXQ = nonMeasureInputs.getTextStyle().XQ();
            if (localeListXQ == null || (localeN = localeListXQ.J2(0)) == null) {
                localeN = Locale.INSTANCE.n();
            }
            textStyle = nonMeasureInputs.getTextStyle().nHg(new TextStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, TextFieldLayoutStateCache_androidKt.n(localeN.getPlatformLocale()), 0L, null, null, null, 0, 0, null, 16711679, null));
        } else {
            textStyle = nonMeasureInputs.getTextStyle();
        }
        String string = visualText.toString();
        List composingAnnotations = visualText.getComposingAnnotations();
        if (composingAnnotations == null) {
            composingAnnotations = CollectionsKt.emptyList();
        }
        return TextMeasurer.rl(textMeasurerT, new AnnotatedString(string, composingAnnotations), textStyle, 0, nonMeasureInputs.getSoftWrap(), nonMeasureInputs.getSingleLine() ? 1 : Integer.MAX_VALUE, null, measureInputs.getConstraints(), measureInputs.getLayoutDirection(), measureInputs.getDensity(), measureInputs.getFontFamilyResolver(), false, 1060, null);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void HI(StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.record = (CacheRecord) value;
    }

    public final TextLayoutResult X(Density density, LayoutDirection layoutDirection, FontFamily.Resolver fontFamilyResolver, long constraints) {
        MeasureInputs measureInputs = new MeasureInputs(density, layoutDirection, fontFamilyResolver, constraints, null);
        N(measureInputs);
        NonMeasureInputs nonMeasureInputsFD = fD();
        if (nonMeasureInputsFD != null) {
            return E2(nonMeasureInputsFD, measureInputs);
        }
        InlineClassHelperKt.nr("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: ck */
    public StateRecord getFirstStateRecord() {
        return this.record;
    }

    public final void s7N(TransformedTextFieldState textFieldState, TextStyle textStyle, boolean singleLine, boolean softWrap, KeyboardOptions keyboardOptions) {
        nHg(new NonMeasureInputs(textFieldState, textStyle, singleLine, softWrap, KeyboardType.ty(keyboardOptions.getKeyboardType(), KeyboardType.INSTANCE.Uo())));
    }

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public TextLayoutResult getValue() {
        MeasureInputs measureInputsIF;
        NonMeasureInputs nonMeasureInputsFD = fD();
        if (nonMeasureInputsFD == null || (measureInputsIF = iF()) == null) {
            return null;
        }
        return E2(nonMeasureInputsFD, measureInputsIF);
    }
}

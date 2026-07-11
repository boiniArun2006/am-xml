package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0003\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0017¢\u0006\u0004\b!\u0010 J-\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"H\u0017¢\u0006\u0004\b$\u0010%J-\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"H\u0017¢\u0006\u0004\b&\u0010%J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b)\u0010(J-\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"H\u0017¢\u0006\u0004\b+\u0010%J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b,\u0010(J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001bH\u0017¢\u0006\u0004\b-\u0010(J\u001a\u00100\u001a\u00020\u001b2\b\u0010/\u001a\u0004\u0018\u00010.H\u0096\u0002¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u00105R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u00105R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u00105R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u00105R\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u00105R\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u00105R\u001a\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b)\u00105R\u001a\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u00105R\u001a\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u00105R\u001a\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u00105R\u001a\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u00105R\u001a\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b8\u00105R\u001a\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u00105R\u001a\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u00105R\u001a\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b;\u00105R\u001a\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b<\u00105R\u001a\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b=\u00105R\u001a\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u00105R\u001a\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u00105R\u001a\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b@\u00105R\u001a\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bA\u00105R\u001a\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bB\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D²\u0006\f\u0010C\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010C\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010C\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors;", "Landroidx/compose/material/TextFieldColors;", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "isError", "Landroidx/compose/runtime/State;", "rl", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "J2", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "mUb", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "O", c.f62177j, "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Uo", MRAIDPresenter.ERROR, "KN", "t", "xMQ", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "nr", "gh", "qie", "az", "ty", "HI", "ck", "Ik", "r", "o", "Z", "XQ", "S", "focused", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,671:1\n85#2:672\n85#2:673\n85#2:674\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors\n*L\n533#1:672\n551#1:673\n583#1:674\n*E\n"})
final class DefaultTextFieldForExposedDropdownMenusColors implements TextFieldColors {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final long errorTrailingIconColor;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final long focusedLabelColor;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long unfocusedIndicatorColor;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final long disabledIndicatorColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long focusedIndicatorColor;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final long disabledPlaceholderColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final long errorIndicatorColor;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final long placeholderColor;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final long errorLabelColor;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final long focusedTrailingIconColor;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final long backgroundColor;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final long errorLeadingIconColor;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long textColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long errorCursorColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long disabledLabelColor;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final long trailingIconColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedLabelColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long disabledTextColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long cursorColor;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final long disabledTrailingIconColor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final long leadingIconColor;

    public /* synthetic */ DefaultTextFieldForExposedDropdownMenusColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DefaultTextFieldForExposedDropdownMenusColors.class != other.getClass()) {
            return false;
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = (DefaultTextFieldForExposedDropdownMenusColors) other;
        return Color.HI(this.textColor, defaultTextFieldForExposedDropdownMenusColors.textColor) && Color.HI(this.disabledTextColor, defaultTextFieldForExposedDropdownMenusColors.disabledTextColor) && Color.HI(this.cursorColor, defaultTextFieldForExposedDropdownMenusColors.cursorColor) && Color.HI(this.errorCursorColor, defaultTextFieldForExposedDropdownMenusColors.errorCursorColor) && Color.HI(this.focusedIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.focusedIndicatorColor) && Color.HI(this.unfocusedIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.unfocusedIndicatorColor) && Color.HI(this.errorIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.errorIndicatorColor) && Color.HI(this.disabledIndicatorColor, defaultTextFieldForExposedDropdownMenusColors.disabledIndicatorColor) && Color.HI(this.leadingIconColor, defaultTextFieldForExposedDropdownMenusColors.leadingIconColor) && Color.HI(this.disabledLeadingIconColor, defaultTextFieldForExposedDropdownMenusColors.disabledLeadingIconColor) && Color.HI(this.errorLeadingIconColor, defaultTextFieldForExposedDropdownMenusColors.errorLeadingIconColor) && Color.HI(this.trailingIconColor, defaultTextFieldForExposedDropdownMenusColors.trailingIconColor) && Color.HI(this.focusedTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.focusedTrailingIconColor) && Color.HI(this.disabledTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.disabledTrailingIconColor) && Color.HI(this.errorTrailingIconColor, defaultTextFieldForExposedDropdownMenusColors.errorTrailingIconColor) && Color.HI(this.backgroundColor, defaultTextFieldForExposedDropdownMenusColors.backgroundColor) && Color.HI(this.focusedLabelColor, defaultTextFieldForExposedDropdownMenusColors.focusedLabelColor) && Color.HI(this.unfocusedLabelColor, defaultTextFieldForExposedDropdownMenusColors.unfocusedLabelColor) && Color.HI(this.disabledLabelColor, defaultTextFieldForExposedDropdownMenusColors.disabledLabelColor) && Color.HI(this.errorLabelColor, defaultTextFieldForExposedDropdownMenusColors.errorLabelColor) && Color.HI(this.placeholderColor, defaultTextFieldForExposedDropdownMenusColors.placeholderColor) && Color.HI(this.disabledPlaceholderColor, defaultTextFieldForExposedDropdownMenusColors.disabledPlaceholderColor);
    }

    private DefaultTextFieldForExposedDropdownMenusColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24) {
        this.textColor = j2;
        this.disabledTextColor = j3;
        this.cursorColor = j4;
        this.errorCursorColor = j5;
        this.focusedIndicatorColor = j6;
        this.unfocusedIndicatorColor = j7;
        this.errorIndicatorColor = j9;
        this.disabledIndicatorColor = j10;
        this.leadingIconColor = j11;
        this.disabledLeadingIconColor = j12;
        this.errorLeadingIconColor = j13;
        this.trailingIconColor = j14;
        this.focusedTrailingIconColor = j15;
        this.disabledTrailingIconColor = j16;
        this.errorTrailingIconColor = j17;
        this.backgroundColor = j18;
        this.focusedLabelColor = j19;
        this.unfocusedLabelColor = j20;
        this.disabledLabelColor = j21;
        this.errorLabelColor = j22;
        this.placeholderColor = j23;
        this.disabledPlaceholderColor = j24;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Color.XQ(this.textColor) * 31) + Color.XQ(this.disabledTextColor)) * 31) + Color.XQ(this.cursorColor)) * 31) + Color.XQ(this.errorCursorColor)) * 31) + Color.XQ(this.focusedIndicatorColor)) * 31) + Color.XQ(this.unfocusedIndicatorColor)) * 31) + Color.XQ(this.errorIndicatorColor)) * 31) + Color.XQ(this.disabledIndicatorColor)) * 31) + Color.XQ(this.leadingIconColor)) * 31) + Color.XQ(this.disabledLeadingIconColor)) * 31) + Color.XQ(this.errorLeadingIconColor)) * 31) + Color.XQ(this.trailingIconColor)) * 31) + Color.XQ(this.focusedTrailingIconColor)) * 31) + Color.XQ(this.disabledTrailingIconColor)) * 31) + Color.XQ(this.errorTrailingIconColor)) * 31) + Color.XQ(this.backgroundColor)) * 31) + Color.XQ(this.focusedLabelColor)) * 31) + Color.XQ(this.unfocusedLabelColor)) * 31) + Color.XQ(this.disabledLabelColor)) * 31) + Color.XQ(this.errorLabelColor)) * 31) + Color.XQ(this.placeholderColor)) * 31) + Color.XQ(this.disabledPlaceholderColor);
    }

    private static final boolean az(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final boolean gh(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final boolean qie(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    @Override // androidx.compose.material.TextFieldColors
    public State J2(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        composer.eF(1665901393);
        if (ComposerKt.v()) {
            ComposerKt.p5(1665901393, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:516)");
        }
        if (!z2) {
            j2 = this.disabledTrailingIconColor;
        } else if (z3) {
            j2 = this.errorTrailingIconColor;
        } else {
            j2 = this.trailingIconColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State KN(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2) {
        long j2;
        composer.eF(-1749156593);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1749156593, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.labelColor (ExposedDropdownMenu.kt:581)");
        }
        State stateN = FocusInteractionKt.n(interactionSource, composer, (i2 >> 6) & 14);
        if (!z2) {
            j2 = this.disabledLabelColor;
        } else if (z3) {
            j2 = this.errorLabelColor;
        } else if (qie(stateN)) {
            j2 = this.focusedLabelColor;
        } else {
            j2 = this.unfocusedLabelColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State O(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2) {
        long j2;
        Composer composer2;
        State stateCk;
        composer.eF(476110356);
        if (ComposerKt.v()) {
            ComposerKt.p5(476110356, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.indicatorColor (ExposedDropdownMenu.kt:549)");
        }
        State stateN = FocusInteractionKt.n(interactionSource, composer, (i2 >> 6) & 14);
        if (!z2) {
            j2 = this.disabledIndicatorColor;
        } else if (z3) {
            j2 = this.errorIndicatorColor;
        } else if (gh(stateN)) {
            j2 = this.focusedIndicatorColor;
        } else {
            j2 = this.unfocusedIndicatorColor;
        }
        long j3 = j2;
        if (z2) {
            composer.eF(-889472281);
            composer2 = composer;
            stateCk = SingleValueAnimationKt.n(j3, AnimationSpecKt.ty(150, 0, null, 6, null), null, null, composer2, 48, 12);
            composer2.Xw();
        } else {
            composer2 = composer;
            composer2.eF(-889369423);
            stateCk = SnapshotStateKt.ck(Color.xMQ(j3), composer2, 0);
            composer2.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer2.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State Uo(boolean z2, Composer composer, int i2) {
        long j2;
        composer.eF(1742462291);
        if (ComposerKt.v()) {
            ComposerKt.p5(1742462291, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.placeholderColor (ExposedDropdownMenu.kt:572)");
        }
        if (z2) {
            j2 = this.placeholderColor;
        } else {
            j2 = this.disabledPlaceholderColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State mUb(boolean z2, boolean z3, InteractionSource interactionSource, Composer composer, int i2) {
        long j2;
        composer.eF(79259602);
        if (ComposerKt.v()) {
            ComposerKt.p5(79259602, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:531)");
        }
        State stateN = FocusInteractionKt.n(interactionSource, composer, (i2 >> 6) & 14);
        if (!z2) {
            j2 = this.disabledTrailingIconColor;
        } else if (z3) {
            j2 = this.errorTrailingIconColor;
        } else if (az(stateN)) {
            j2 = this.focusedTrailingIconColor;
        } else {
            j2 = this.trailingIconColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State n(boolean z2, Composer composer, int i2) {
        composer.eF(-28962788);
        if (ComposerKt.v()) {
            ComposerKt.p5(-28962788, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.backgroundColor (ExposedDropdownMenu.kt:567)");
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(this.backgroundColor), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State rl(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        composer.eF(-776179197);
        if (ComposerKt.v()) {
            ComposerKt.p5(-776179197, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.leadingIconColor (ExposedDropdownMenu.kt:504)");
        }
        if (!z2) {
            j2 = this.disabledLeadingIconColor;
        } else if (z3) {
            j2 = this.errorLeadingIconColor;
        } else {
            j2 = this.leadingIconColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State t(boolean z2, Composer composer, int i2) {
        long j2;
        composer.eF(394526077);
        if (ComposerKt.v()) {
            ComposerKt.p5(394526077, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.textColor (ExposedDropdownMenu.kt:595)");
        }
        if (z2) {
            j2 = this.textColor;
        } else {
            j2 = this.disabledTextColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.TextFieldColors
    public State xMQ(boolean z2, Composer composer, int i2) {
        long j2;
        composer.eF(-930693132);
        if (ComposerKt.v()) {
            ComposerKt.p5(-930693132, i2, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.cursorColor (ExposedDropdownMenu.kt:600)");
        }
        if (z2) {
            j2 = this.errorCursorColor;
        } else {
            j2 = this.cursorColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }
}

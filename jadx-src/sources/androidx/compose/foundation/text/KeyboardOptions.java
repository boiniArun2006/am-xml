package androidx.compose.foundation.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b%\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001ABU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010BS\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b \u0010!R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b)\u0010\u001cR\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u00106R\u001a\u00108\u001a\u00020\u00028BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b,\u0010\u001cR\u001a\u0010:\u001a\u00020\u00068BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b9\u0010\u001cR\u0014\u0010;\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00105R\u0014\u0010=\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u00106R\u001a\u0010>\u001a\u00020\b8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b2\u0010\u001cR\u0014\u0010@\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "capitalization", "", "autoCorrectEnabled", "Landroidx/compose/ui/text/input/KeyboardType;", "keyboardType", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "platformImeOptions", "showKeyboardOnFocus", "Landroidx/compose/ui/text/intl/LocaleList;", "hintLocales", "<init>", "(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "autoCorrect", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "singleLine", "Landroidx/compose/ui/text/input/ImeOptions;", "qie", "(Z)Landroidx/compose/ui/text/input/ImeOptions;", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "t", "(Landroidx/compose/foundation/text/KeyboardOptions;)Landroidx/compose/foundation/text/KeyboardOptions;", c.f62177j, "I", "getCapitalization-IUNYP9k", "rl", "Ljava/lang/Boolean;", "getAutoCorrectEnabled", "()Ljava/lang/Boolean;", "KN", "nr", "getImeAction-eUduSuo", "O", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "getPlatformImeOptions", "()Landroidx/compose/ui/text/input/PlatformImeOptions;", "J2", "getShowKeyboardOnFocus", "Uo", "Landroidx/compose/ui/text/intl/LocaleList;", "getHintLocales", "()Landroidx/compose/ui/text/intl/LocaleList;", "()Z", "autoCorrectOrDefault", "capitalizationOrDefault", "xMQ", "keyboardTypeOrDefault", "hintLocalesOrDefault", "gh", "isCompletelyUnspecified", "imeActionOrDefault", "mUb", "showKeyboardOnFocusOrDefault", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKeyboardOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardOptions.kt\nandroidx/compose/foundation/text/KeyboardOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,395:1\n1#2:396\n*E\n"})
public final class KeyboardOptions {
    private static final KeyboardOptions mUb = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.INSTANCE.J2(), 0, (PlatformImeOptions) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (LocaleList) null, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final Boolean showKeyboardOnFocus;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlatformImeOptions platformImeOptions;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata and from toString */
    private final LocaleList hintLocales;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final int capitalization;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final int imeAction;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final Boolean autoCorrectEnabled;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final int keyboardType;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KeyboardOptions xMQ = new KeyboardOptions(0, (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 127, (DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/KeyboardOptions;", "Default", "Landroidx/compose/foundation/text/KeyboardOptions;", c.f62177j, "()Landroidx/compose/foundation/text/KeyboardOptions;", "getDefault$annotations", "SecureTextField", "rl", "getSecureTextField$foundation_release$annotations", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KeyboardOptions n() {
            return KeyboardOptions.xMQ;
        }

        public final KeyboardOptions rl() {
            return KeyboardOptions.mUb;
        }
    }

    public /* synthetic */ KeyboardOptions(int i2, Boolean bool, int i3, int i5, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, bool, i3, i5, platformImeOptions, bool2, localeList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) other;
        return KeyboardCapitalization.xMQ(this.capitalization, keyboardOptions.capitalization) && Intrinsics.areEqual(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) && KeyboardType.ty(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.az(this.imeAction, keyboardOptions.imeAction) && Intrinsics.areEqual(this.platformImeOptions, keyboardOptions.platformImeOptions) && Intrinsics.areEqual(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && Intrinsics.areEqual(this.hintLocales, keyboardOptions.hintLocales);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z2, int i3, int i5, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z2, i3, i5, platformImeOptions, bool, localeList);
    }

    private final LocaleList J2() {
        LocaleList localeList = this.hintLocales;
        return localeList == null ? LocaleList.INSTANCE.rl() : localeList;
    }

    private final int O() {
        KeyboardCapitalization keyboardCapitalizationJ2 = KeyboardCapitalization.J2(this.capitalization);
        int value = keyboardCapitalizationJ2.getValue();
        KeyboardCapitalization.Companion companion = KeyboardCapitalization.INSTANCE;
        if (KeyboardCapitalization.xMQ(value, companion.nr())) {
            keyboardCapitalizationJ2 = null;
        }
        return keyboardCapitalizationJ2 != null ? keyboardCapitalizationJ2.getValue() : companion.rl();
    }

    private final boolean gh() {
        return KeyboardCapitalization.xMQ(this.capitalization, KeyboardCapitalization.INSTANCE.nr()) && this.autoCorrectEnabled == null && KeyboardType.ty(this.keyboardType, KeyboardType.INSTANCE.xMQ()) && ImeAction.az(this.imeAction, ImeAction.INSTANCE.xMQ()) && this.platformImeOptions == null && this.showKeyboardOnFocus == null && this.hintLocales == null;
    }

    private final boolean nr() {
        Boolean bool = this.autoCorrectEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final int xMQ() {
        KeyboardType keyboardTypeGh = KeyboardType.gh(this.keyboardType);
        int value = keyboardTypeGh.getValue();
        KeyboardType.Companion companion = KeyboardType.INSTANCE;
        if (KeyboardType.ty(value, companion.xMQ())) {
            keyboardTypeGh = null;
        }
        return keyboardTypeGh != null ? keyboardTypeGh.getValue() : companion.KN();
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    public final int Uo() {
        ImeAction imeActionMUb = ImeAction.mUb(this.imeAction);
        int value = imeActionMUb.getValue();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        if (ImeAction.az(value, companion.xMQ())) {
            imeActionMUb = null;
        }
        return imeActionMUb != null ? imeActionMUb.getValue() : companion.n();
    }

    public int hashCode() {
        int iMUb = KeyboardCapitalization.mUb(this.capitalization) * 31;
        Boolean bool = this.autoCorrectEnabled;
        int iHashCode = (((((iMUb + (bool != null ? bool.hashCode() : 0)) * 31) + KeyboardType.HI(this.keyboardType)) * 31) + ImeAction.ty(this.imeAction)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        int iHashCode2 = (iHashCode + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31;
        Boolean bool2 = this.showKeyboardOnFocus;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.hintLocales;
        return iHashCode3 + (localeList != null ? localeList.hashCode() : 0);
    }

    public final boolean mUb() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final ImeOptions qie(boolean singleLine) {
        return new ImeOptions(singleLine, O(), nr(), xMQ(), Uo(), this.platformImeOptions, J2(), null);
    }

    public final KeyboardOptions t(KeyboardOptions other) {
        if (other == null || other.gh() || Intrinsics.areEqual(other, this)) {
            return this;
        }
        if (gh()) {
            return other;
        }
        KeyboardCapitalization keyboardCapitalizationJ2 = KeyboardCapitalization.J2(this.capitalization);
        if (KeyboardCapitalization.xMQ(keyboardCapitalizationJ2.getValue(), KeyboardCapitalization.INSTANCE.nr())) {
            keyboardCapitalizationJ2 = null;
        }
        int value = keyboardCapitalizationJ2 != null ? keyboardCapitalizationJ2.getValue() : other.capitalization;
        Boolean bool = this.autoCorrectEnabled;
        if (bool == null) {
            bool = other.autoCorrectEnabled;
        }
        Boolean bool2 = bool;
        KeyboardType keyboardTypeGh = KeyboardType.gh(this.keyboardType);
        if (KeyboardType.ty(keyboardTypeGh.getValue(), KeyboardType.INSTANCE.xMQ())) {
            keyboardTypeGh = null;
        }
        int value2 = keyboardTypeGh != null ? keyboardTypeGh.getValue() : other.keyboardType;
        ImeAction imeActionMUb = ImeAction.mUb(this.imeAction);
        ImeAction imeAction = ImeAction.az(imeActionMUb.getValue(), ImeAction.INSTANCE.xMQ()) ? null : imeActionMUb;
        int value3 = imeAction != null ? imeAction.getValue() : other.imeAction;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        if (platformImeOptions == null) {
            platformImeOptions = other.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        Boolean bool3 = this.showKeyboardOnFocus;
        if (bool3 == null) {
            bool3 = other.showKeyboardOnFocus;
        }
        Boolean bool4 = bool3;
        LocaleList localeList = this.hintLocales;
        if (localeList == null) {
            localeList = other.hintLocales;
        }
        return new KeyboardOptions(value, bool2, value2, value3, platformImeOptions2, bool4, localeList, (DefaultConstructorMarker) null);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.gh(this.capitalization)) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + ((Object) KeyboardType.ck(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.HI(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + "showKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + ')';
    }

    private KeyboardOptions(int i2, Boolean bool, int i3, int i5, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        this.capitalization = i2;
        this.autoCorrectEnabled = bool;
        this.keyboardType = i3;
        this.imeAction = i5;
        this.platformImeOptions = platformImeOptions;
        this.showKeyboardOnFocus = bool2;
        this.hintLocales = localeList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KeyboardOptions(int i2, Boolean bool, int i3, int i5, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        int iNr = (i7 & 1) != 0 ? KeyboardCapitalization.INSTANCE.nr() : i2;
        Boolean bool3 = (i7 & 2) != 0 ? null : bool;
        int iXMQ = (i7 & 4) != 0 ? KeyboardType.INSTANCE.xMQ() : i3;
        int iXMQ2 = (i7 & 8) != 0 ? ImeAction.INSTANCE.xMQ() : i5;
        PlatformImeOptions platformImeOptions2 = (i7 & 16) != 0 ? null : platformImeOptions;
        Boolean bool4 = (i7 & 32) != 0 ? null : bool2;
        this(iNr, bool3, iXMQ, iXMQ2, platformImeOptions2, bool4, (i7 & 64) == 0 ? localeList : null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z2, int i3, int i5, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? KeyboardCapitalization.INSTANCE.nr() : i2, z2, (i7 & 4) != 0 ? KeyboardType.INSTANCE.xMQ() : i3, (i7 & 8) != 0 ? ImeAction.INSTANCE.xMQ() : i5, (i7 & 16) != 0 ? null : platformImeOptions, (i7 & 32) != 0 ? null : bool, (i7 & 64) != 0 ? null : localeList, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i2, boolean z2, int i3, int i5, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        this(i2, Boolean.valueOf(z2), i3, i5, platformImeOptions, bool, localeList, (DefaultConstructorMarker) null);
    }
}

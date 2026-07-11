package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.emoji2.text.EmojiCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001dJ\u0015\u0010!\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001dJ\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001dJ\u0015\u0010#\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u0013J\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010*¨\u0006-"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "", "charSequence", "", TtmlNode.START, TtmlNode.END, "Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "offset", "", "getPrevWordBeginningOnTwoWordsBoundary", "rl", "(IZ)I", "getNextWordEndOnTwoWordBoundary", "t", "HI", "(I)Z", "ty", "KN", "qie", "", c.f62177j, "(I)V", "mUb", "gh", "ck", "(I)I", "Ik", "O", "nr", "J2", "Uo", "xMQ", "az", "Ljava/lang/CharSequence;", "getCharSequence", "()Ljava/lang/CharSequence;", "I", "Ljava/text/BreakIterator;", "Ljava/text/BreakIterator;", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWordIterator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordIterator.android.kt\nandroidx/compose/ui/text/android/selection/WordIterator\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,377:1\n114#2,8:378\n114#2,8:386\n114#2,8:394\n*S KotlinDebug\n*F\n+ 1 WordIterator.android.kt\nandroidx/compose/ui/text/android/selection/WordIterator\n*L\n44#1:378,8\n47#1:386,8\n323#1:394,8\n*E\n"})
public final class WordIterator {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final BreakIterator iterator;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int start;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int J2 = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator$Companion;", "", "<init>", "()V", "", "cp", "", c.f62177j, "(I)Z", "WINDOW_WIDTH", "I", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean n(int cp) {
            int type = Character.getType(cp);
            if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
                return false;
            }
            return true;
        }
    }

    public final int O(int offset) {
        return rl(offset, true);
    }

    public final int nr(int offset) {
        return t(offset, true);
    }

    private final boolean KN(int offset) {
        int i2 = this.start + 1;
        if (offset > this.end || i2 > offset) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, offset))) {
            return true;
        }
        int i3 = offset - 1;
        if (Character.isSurrogate(this.charSequence.charAt(i3))) {
            return true;
        }
        if (!EmojiCompat.gh()) {
            return false;
        }
        EmojiCompat emojiCompatT = EmojiCompat.t();
        return emojiCompatT.Uo() == 1 && emojiCompatT.J2(this.charSequence, i3) != -1;
    }

    private final boolean gh(int offset) {
        int i2 = offset - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(this.charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (Intrinsics.areEqual(unicodeBlockOf, unicodeBlock) && Intrinsics.areEqual(Character.UnicodeBlock.of(this.charSequence.charAt(offset)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return Intrinsics.areEqual(Character.UnicodeBlock.of(this.charSequence.charAt(offset)), unicodeBlock) && Intrinsics.areEqual(Character.UnicodeBlock.of(this.charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    private final void n(int offset) {
        int i2 = this.start;
        boolean z2 = false;
        if (offset <= this.end && i2 <= offset) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        InlineClassHelperKt.n("Invalid offset: " + offset + ". Valid range is [" + this.start + " , " + this.end + ']');
    }

    private final boolean qie(int offset) {
        int i2 = this.start;
        if (offset >= this.end || i2 > offset) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.charSequence, offset)) || Character.isSurrogate(this.charSequence.charAt(offset))) {
            return true;
        }
        if (!EmojiCompat.gh()) {
            return false;
        }
        EmojiCompat emojiCompatT = EmojiCompat.t();
        return emojiCompatT.Uo() == 1 && emojiCompatT.J2(this.charSequence, offset) != -1;
    }

    public final boolean az(int offset) {
        int i2 = this.start;
        if (offset >= this.end || i2 > offset) {
            return false;
        }
        return INSTANCE.n(Character.codePointAt(this.charSequence, offset));
    }

    public final boolean xMQ(int offset) {
        int i2 = this.start + 1;
        if (offset > this.end || i2 > offset) {
            return false;
        }
        return INSTANCE.n(Character.codePointBefore(this.charSequence, offset));
    }

    public WordIterator(CharSequence charSequence, int i2, int i3, Locale locale) {
        boolean z2;
        this.charSequence = charSequence;
        if (i2 >= 0 && i2 <= charSequence.length()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.n("input start index is outside the CharSequence");
        }
        if (!(i3 >= 0 && i3 <= charSequence.length())) {
            InlineClassHelperKt.n("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.iterator = wordInstance;
        this.start = Math.max(0, i2 - 50);
        this.end = Math.min(charSequence.length(), i3 + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i2, i3));
    }

    private final boolean HI(int offset) {
        if (az(offset) && !xMQ(offset)) {
            return true;
        }
        return false;
    }

    private final boolean mUb(int offset) {
        n(offset);
        if (this.iterator.isBoundary(offset)) {
            if (!qie(offset) || !qie(offset - 1) || !qie(offset + 1)) {
                if (offset <= 0 || offset >= this.charSequence.length() - 1 || (!gh(offset) && !gh(offset + 1))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private final int rl(int offset, boolean getPrevWordBeginningOnTwoWordsBoundary) {
        n(offset);
        if (qie(offset)) {
            if (mUb(offset) && (!KN(offset) || !getPrevWordBeginningOnTwoWordsBoundary)) {
                return offset;
            }
            return Ik(offset);
        }
        if (KN(offset)) {
            return Ik(offset);
        }
        return -1;
    }

    private final int t(int offset, boolean getNextWordEndOnTwoWordBoundary) {
        n(offset);
        if (KN(offset)) {
            if (mUb(offset) && (!qie(offset) || !getNextWordEndOnTwoWordBoundary)) {
                return offset;
            }
            return ck(offset);
        }
        if (qie(offset)) {
            return ck(offset);
        }
        return -1;
    }

    private final boolean ty(int offset) {
        if (!az(offset) && xMQ(offset)) {
            return true;
        }
        return false;
    }

    public final int Ik(int offset) {
        n(offset);
        int iPreceding = this.iterator.preceding(offset);
        if (qie(iPreceding) && KN(iPreceding) && !gh(iPreceding)) {
            return Ik(iPreceding);
        }
        return iPreceding;
    }

    public final int J2(int offset) {
        n(offset);
        while (offset != -1 && !HI(offset)) {
            offset = Ik(offset);
        }
        return offset;
    }

    public final int Uo(int offset) {
        n(offset);
        while (offset != -1 && !ty(offset)) {
            offset = ck(offset);
        }
        return offset;
    }

    public final int ck(int offset) {
        n(offset);
        int iFollowing = this.iterator.following(offset);
        if (qie(iFollowing - 1) && qie(iFollowing) && !gh(iFollowing)) {
            return ck(iFollowing);
        }
        return iFollowing;
    }
}

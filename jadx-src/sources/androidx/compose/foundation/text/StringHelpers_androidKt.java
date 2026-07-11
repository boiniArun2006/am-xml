package androidx.compose.foundation.text;

import androidx.emoji2.text.EmojiCompat;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "index", "rl", "(Ljava/lang/String;I)I", c.f62177j, "Landroidx/emoji2/text/EmojiCompat;", "t", "()Landroidx/emoji2/text/EmojiCompat;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStringHelpers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringHelpers.android.kt\nandroidx/compose/foundation/text/StringHelpers_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class StringHelpers_androidKt {
    public static final int n(String str, int i2) {
        EmojiCompat emojiCompatT = t();
        Integer num = null;
        if (emojiCompatT != null) {
            Integer numValueOf = Integer.valueOf(emojiCompatT.nr(str, i2));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i2);
    }

    public static final int rl(String str, int i2) {
        EmojiCompat emojiCompatT = t();
        Integer num = null;
        if (emojiCompatT != null) {
            Integer numValueOf = Integer.valueOf(emojiCompatT.J2(str, Math.max(0, i2 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i2);
    }

    private static final EmojiCompat t() {
        if (EmojiCompat.gh()) {
            EmojiCompat emojiCompatT = EmojiCompat.t();
            if (emojiCompatT.Uo() == 1) {
                return emojiCompatT;
            }
        }
        return null;
    }
}

package androidx.emoji2.text;

import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class EmojiExclusions {

    private static class EmojiExclusions_Reflections {
        static Set n() {
            try {
                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
                if (objInvoke == null) {
                    return Collections.EMPTY_SET;
                }
                Set set = (Set) objInvoke;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.EMPTY_SET;
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.EMPTY_SET;
            }
        }
    }

    @RequiresApi
    private static class EmojiExclusions_Api34 {
        @NonNull
        @DoNotInline
        static Set<int[]> n() {
            return EmojiExclusions_Reflections.n();
        }
    }

    static Set n() {
        return Build.VERSION.SDK_INT >= 34 ? EmojiExclusions_Api34.n() : EmojiExclusions_Reflections.n();
    }
}

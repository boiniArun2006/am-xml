package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@AnyThread
@RequiresApi
@RestrictTo
final class EmojiProcessor {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int[] f38329O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EmojiCompat.SpanFactory f38330n;
    private final boolean nr;
    private final MetadataRepo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private EmojiCompat.GlyphChecker f38331t;

    private static class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public UnprecomputeTextOnModificationSpannable f38332n;
        private final EmojiCompat.SpanFactory rl;

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public UnprecomputeTextOnModificationSpannable getResult() {
            return this.f38332n;
        }

        EmojiProcessAddSpanCallback(UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, EmojiCompat.SpanFactory spanFactory) {
            this.f38332n = unprecomputeTextOnModificationSpannable;
            this.rl = spanFactory;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean n(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            Spannable spannableString;
            if (typefaceEmojiRasterizer.gh()) {
                return true;
            }
            if (this.f38332n == null) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                this.f38332n = new UnprecomputeTextOnModificationSpannable(spannableString);
            }
            this.f38332n.setSpan(this.rl.n(typefaceEmojiRasterizer), i2, i3, 33);
            return true;
        }
    }

    private interface EmojiProcessCallback<T> {
        Object getResult();

        boolean n(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    private static class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f38333n;
        public int rl = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f38334t = -1;

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public EmojiProcessLookupCallback getResult() {
            return this;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean n(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i5 = this.f38333n;
            if (i2 > i5 || i5 >= i3) {
                return i3 <= i5;
            }
            this.rl = i2;
            this.f38334t = i3;
            return false;
        }

        EmojiProcessLookupCallback(int i2) {
            this.f38333n = i2;
        }
    }

    static final class ProcessorSm {
        private int J2;
        private final int[] KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f38336O;
        private final boolean Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f38337n = 1;
        private MetadataRepo.Node nr;
        private final MetadataRepo.Node rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private MetadataRepo.Node f38338t;

        private static boolean J2(int i2) {
            return i2 == 65038;
        }

        private int Uo() {
            this.f38337n = 1;
            this.f38338t = this.rl;
            this.J2 = 0;
            return 1;
        }

        private static boolean nr(int i2) {
            return i2 == 65039;
        }

        private boolean KN() {
            if (this.f38338t.rl().mUb() || nr(this.f38336O)) {
                return true;
            }
            if (this.Uo) {
                if (this.KN == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.KN, this.f38338t.rl().rl(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        boolean O() {
            if (this.f38337n != 2 || this.f38338t.rl() == null) {
                return false;
            }
            return this.J2 > 1 || KN();
        }

        int n(int i2) {
            MetadataRepo.Node nodeN = this.f38338t.n(i2);
            int iUo = 2;
            if (this.f38337n != 2) {
                if (nodeN == null) {
                    iUo = Uo();
                } else {
                    this.f38337n = 2;
                    this.f38338t = nodeN;
                    this.J2 = 1;
                }
            } else if (nodeN != null) {
                this.f38338t = nodeN;
                this.J2++;
            } else if (J2(i2)) {
                iUo = Uo();
            } else if (!nr(i2)) {
                if (this.f38338t.rl() != null) {
                    iUo = 3;
                    if (this.J2 != 1 || KN()) {
                        this.nr = this.f38338t;
                        Uo();
                    } else {
                        iUo = Uo();
                    }
                } else {
                    iUo = Uo();
                }
            }
            this.f38336O = i2;
            return iUo;
        }

        TypefaceEmojiRasterizer rl() {
            return this.f38338t.rl();
        }

        TypefaceEmojiRasterizer t() {
            return this.nr.rl();
        }

        ProcessorSm(MetadataRepo.Node node, boolean z2, int[] iArr) {
            this.rl = node;
            this.f38338t = node;
            this.Uo = z2;
            this.KN = iArr;
        }
    }

    private static boolean Uo(int i2, int i3) {
        return i2 == -1 || i3 == -1 || i2 != i3;
    }

    static boolean nr(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z2) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (Uo(selectionStart, selectionEnd)) {
                return false;
            }
            if (z2) {
                iMax = CodepointIndexFinder.n(editable, selectionStart, Math.max(i2, 0));
                iMin = CodepointIndexFinder.rl(editable, selectionEnd, Math.max(i3, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i2, 0);
                iMin = Math.min(selectionEnd + i3, editable.length());
            }
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(iMax, iMin, EmojiSpan.class);
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    @RequiresApi
    private static final class CodepointIndexFinder {
        static int n(CharSequence charSequence, int i2, int i3) {
            int length = charSequence.length();
            if (i2 < 0 || length < i2 || i3 < 0) {
                return -1;
            }
            while (true) {
                boolean z2 = false;
                while (i3 != 0) {
                    i2--;
                    if (i2 < 0) {
                        if (z2) {
                            return -1;
                        }
                        return 0;
                    }
                    char cCharAt = charSequence.charAt(i2);
                    if (z2) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i3--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i3--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z2 = true;
                    }
                }
                return i2;
            }
        }

        static int rl(CharSequence charSequence, int i2, int i3) {
            int length = charSequence.length();
            if (i2 < 0 || length < i2 || i3 < 0) {
                return -1;
            }
            while (true) {
                boolean z2 = false;
                while (i3 != 0) {
                    if (i2 >= length) {
                        if (z2) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i2);
                    if (z2) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i3--;
                        i2++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i3--;
                        i2++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2++;
                        z2 = true;
                    }
                }
                return i2;
            }
        }
    }

    private static class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f38335n;

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public MarkExclusionCallback getResult() {
            return this;
        }

        MarkExclusionCallback(String str) {
            this.f38335n = str;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean n(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i2, i3), this.f38335n)) {
                return true;
            }
            typefaceEmojiRasterizer.qie(true);
            return false;
        }
    }

    static boolean O(Editable editable, int i2, KeyEvent keyEvent) {
        if (!(i2 != 67 ? i2 != 112 ? false : n(editable, keyEvent, true) : n(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private Object gh(CharSequence charSequence, int i2, int i3, int i5, boolean z2, EmojiProcessCallback emojiProcessCallback) {
        int iCharCount;
        ProcessorSm processorSm = new ProcessorSm(this.rl.J2(), this.nr, this.f38329O);
        int i7 = 0;
        boolean zN = true;
        int iCodePointAt = Character.codePointAt(charSequence, i2);
        loop0: while (true) {
            iCharCount = i2;
            while (i2 < i3 && i7 < i5 && zN) {
                int iN = processorSm.n(iCodePointAt);
                if (iN == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i2 = iCharCount;
                } else if (iN == 2) {
                    i2 += Character.charCount(iCodePointAt);
                    if (i2 < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, i2);
                    }
                } else if (iN == 3) {
                    if (z2 || !J2(charSequence, iCharCount, i2, processorSm.t())) {
                        zN = emojiProcessCallback.n(charSequence, iCharCount, i2, processorSm.t());
                        i7++;
                    }
                }
            }
            break loop0;
        }
        if (processorSm.O() && i7 < i5 && zN && (z2 || !J2(charSequence, iCharCount, i2, processorSm.rl()))) {
            emojiProcessCallback.n(charSequence, iCharCount, i2, processorSm.rl());
        }
        return emojiProcessCallback.getResult();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[Catch: all -> 0x002a, TRY_ENTER, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:35:0x0069, B:44:0x0085, B:19:0x0031), top: B:65:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    CharSequence mUb(CharSequence charSequence, int i2, int i3, int i5, boolean z2) throws Throwable {
        UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable;
        CharSequence charSequence2;
        Throwable th;
        int i7;
        int i8;
        EmojiSpan[] emojiSpanArr;
        boolean z3 = charSequence instanceof SpannableBuilder;
        if (z3) {
            ((SpannableBuilder) charSequence).n();
        }
        if (z3) {
            unprecomputeTextOnModificationSpannable = new UnprecomputeTextOnModificationSpannable((Spannable) charSequence);
            if (unprecomputeTextOnModificationSpannable != null) {
            }
            i7 = i2;
            i8 = i3;
            if (i7 == i8) {
            }
            return charSequence2;
        }
        try {
            if (!(charSequence instanceof Spannable)) {
                unprecomputeTextOnModificationSpannable = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i2 + (-1), i3 + 1, EmojiSpan.class) > i3) ? null : new UnprecomputeTextOnModificationSpannable(charSequence);
                if (unprecomputeTextOnModificationSpannable != null) {
                    while (i < r5) {
                    }
                }
                i7 = i2;
                i8 = i3;
                if (i7 == i8) {
                    charSequence2 = charSequence;
                    if (!z3) {
                    }
                    ((SpannableBuilder) charSequence2).nr();
                }
                return charSequence2;
            }
            try {
                unprecomputeTextOnModificationSpannable = new UnprecomputeTextOnModificationSpannable((Spannable) charSequence);
                if (unprecomputeTextOnModificationSpannable != null && (emojiSpanArr = (EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(i2, i3, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
                    for (EmojiSpan emojiSpan : emojiSpanArr) {
                        int spanStart = unprecomputeTextOnModificationSpannable.getSpanStart(emojiSpan);
                        int spanEnd = unprecomputeTextOnModificationSpannable.getSpanEnd(emojiSpan);
                        if (spanStart != i3) {
                            unprecomputeTextOnModificationSpannable.removeSpan(emojiSpan);
                        }
                        i2 = Math.min(spanStart, i2);
                        i3 = Math.max(spanEnd, i3);
                    }
                }
                i7 = i2;
                i8 = i3;
                if (i7 == i8 || i7 >= charSequence.length()) {
                    charSequence2 = charSequence;
                    if (!z3) {
                        return charSequence2;
                    }
                } else {
                    if (i5 != Integer.MAX_VALUE && unprecomputeTextOnModificationSpannable != null) {
                        i5 -= ((EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(0, unprecomputeTextOnModificationSpannable.length(), EmojiSpan.class)).length;
                    }
                    charSequence2 = charSequence;
                    try {
                        UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable2 = (UnprecomputeTextOnModificationSpannable) gh(charSequence2, i7, i8, i5, z2, new EmojiProcessAddSpanCallback(unprecomputeTextOnModificationSpannable, this.f38330n));
                        if (unprecomputeTextOnModificationSpannable2 == null) {
                            if (z3) {
                            }
                            return charSequence2;
                        }
                        Spannable spannableRl = unprecomputeTextOnModificationSpannable2.rl();
                        if (z3) {
                            ((SpannableBuilder) charSequence2).nr();
                        }
                        return spannableRl;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!z3) {
                        }
                    }
                }
                ((SpannableBuilder) charSequence2).nr();
                return charSequence2;
            } catch (Throwable th3) {
                th = th3;
                charSequence2 = charSequence;
                th = th;
                if (!z3) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z3) {
            throw th;
        }
        ((SpannableBuilder) charSequence2).nr();
        throw th;
    }

    int rl(CharSequence charSequence, int i2) {
        if (i2 < 0 || i2 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i2, i2 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanEnd(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) gh(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i2))).f38334t;
    }

    int t(CharSequence charSequence, int i2) {
        if (i2 < 0 || i2 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i2, i2 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanStart(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) gh(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i2))).rl;
    }

    EmojiProcessor(MetadataRepo metadataRepo, EmojiCompat.SpanFactory spanFactory, EmojiCompat.GlyphChecker glyphChecker, boolean z2, int[] iArr, Set set) {
        this.f38330n = spanFactory;
        this.rl = metadataRepo;
        this.f38331t = glyphChecker;
        this.nr = z2;
        this.f38329O = iArr;
        xMQ(set);
    }

    private boolean J2(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (typefaceEmojiRasterizer.nr() == 0) {
            typefaceEmojiRasterizer.az(this.f38331t.n(charSequence, i2, i3, typefaceEmojiRasterizer.KN()));
        }
        if (typefaceEmojiRasterizer.nr() == 2) {
            return true;
        }
        return false;
    }

    private static boolean KN(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private static boolean n(Editable editable, KeyEvent keyEvent, boolean z2) {
        EmojiSpan[] emojiSpanArr;
        if (KN(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!Uo(selectionStart, selectionEnd) && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    private void xMQ(Set set) {
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                String str = new String(iArr, 0, iArr.length);
                gh(str, 0, str.length(), 1, true, new MarkExclusionCallback(str));
            }
        }
    }
}

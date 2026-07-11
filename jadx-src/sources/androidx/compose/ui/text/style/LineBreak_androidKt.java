package androidx.compose.ui.text.style;

import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u000b\u001a'\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"", "i1", "i2", "i3", "O", "(III)I", "mask", "J2", "(I)I", "Uo", "KN", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LineBreak_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int J2(int i2) {
        return i2 & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int KN(int i2) {
        return (i2 >> 16) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O(int i2, int i3, int i5) {
        return i2 | (i3 << 8) | (i5 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Uo(int i2) {
        return (i2 >> 8) & 255;
    }
}

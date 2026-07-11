package androidx.media3.extractor.text.ssa;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import t1.AbstractC2372w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class SsaDialogueFormat {
    public final int endTimeIndex;
    public final int length;
    public final int startTimeIndex;
    public final int styleIndex;
    public final int textIndex;

    @Nullable
    public static SsaDialogueFormat fromFormatLine(String str) {
        Assertions.checkArgument(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i2 = -1;
        int i3 = -1;
        int i5 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
            String strO = AbstractC2372w6.O(strArrSplit[i8].trim());
            strO.getClass();
            switch (strO) {
                case "end":
                    i3 = i8;
                    break;
                case "text":
                    i7 = i8;
                    break;
                case "start":
                    i2 = i8;
                    break;
                case "style":
                    i5 = i8;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i7 == -1) {
            return null;
        }
        return new SsaDialogueFormat(i2, i3, i5, i7, strArrSplit.length);
    }

    private SsaDialogueFormat(int i2, int i3, int i5, int i7, int i8) {
        this.startTimeIndex = i2;
        this.endTimeIndex = i3;
        this.styleIndex = i5;
        this.textIndex = i7;
        this.length = i8;
    }
}

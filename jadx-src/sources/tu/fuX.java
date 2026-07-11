package tu;

import java.util.ArrayList;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class fuX {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
    
        r6 = r6 + 1;
        r5 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CN3 n(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        CN3[] cn3ArrValues = CN3.values();
        ArrayList arrayList = new ArrayList();
        int length = cn3ArrValues.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            CN3 cn3 = cn3ArrValues[i3];
            String[] strArrRl = cn3.rl();
            int length2 = strArrRl.length;
            int i5 = i2;
            while (true) {
                if (i5 < length2) {
                    String str = strArrRl[i5];
                    char[] cArr = new char[1];
                    cArr[i2] = ' ';
                    for (IndexedValue indexedValue : SequencesKt.withIndex(StringsKt.splitToSequence$default((CharSequence) str, cArr, false, 0, 6, (Object) null))) {
                        int index = indexedValue.getIndex();
                        String str2 = (String) indexedValue.component2();
                        if (str2.length() != 2) {
                            throw new RuntimeException("File type '" + cn3 + "' signature '" + str + "' malformed");
                        }
                        if (Intrinsics.areEqual(str2, "??") || (index < data.length && XoT.j.rl(data[index]) == Integer.parseInt(str2, CharsKt.checkRadix(16)))) {
                        }
                    }
                    arrayList.add(cn3);
                    break;
                }
                i5++;
                i2 = 0;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (CN3) arrayList.get(0);
        }
        throw new RuntimeException("Multiple file type matches; check table");
    }
}

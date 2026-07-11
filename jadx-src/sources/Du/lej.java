package Du;

import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class lej {
    public static final XA.Ml n(String serialName, Enum[] values, String[] names, Annotation[][] entryAnnotations, Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        C1342u c1342u = new C1342u(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                c1342u.WPU(annotation);
            }
        }
        int length = values.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Enum r42 = values[i2];
            int i5 = i3 + 1;
            String strName = (String) ArraysKt.getOrNull(names, i3);
            if (strName == null) {
                strName = r42.name();
            }
            DC.ck(c1342u, strName, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) ArraysKt.getOrNull(entryAnnotations, i3);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    c1342u.S(annotation2);
                }
            }
            i2++;
            i3 = i5;
        }
        return new Ln(serialName, values, c1342u);
    }
}

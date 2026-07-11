package Ci2;

import Msr.w6;
import android.text.TextUtils;
import android.util.Pair;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j {
    public static Object[] n(Throwable th, w6 w6Var) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new Pair("exception_name", th.getClass().getSimpleName()));
        arrayList.add(new Pair("description", th.getMessage()));
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.getBuffer().toString();
        if (!TextUtils.isEmpty(string)) {
            arrayList.add(new Pair("stack_trace", string));
        }
        if (w6Var != null) {
            arrayList.add(new Pair("error_code", w6Var.n()));
        }
        Object[] objArr = new Object[arrayList.size() * 2];
        int i2 = 1;
        int i3 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            Pair pair = (Pair) arrayList.get(i5);
            objArr[i3] = pair.first;
            objArr[i2] = pair.second;
            i3 += 2;
            i2 += 2;
        }
        return objArr;
    }
}

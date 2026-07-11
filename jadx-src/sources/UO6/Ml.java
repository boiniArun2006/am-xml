package UO6;

import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import com.alightcreative.app.motion.persist.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ml {
    public static final int n(w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        return Math.min(w6Var.J2(), w6Var.O());
    }

    public static final w6 rl(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{qUrazMnwDskFs.AshI}, false, 0, 6, (Object) null);
        return new w6(Integer.parseInt((String) listSplit$default.get(0)), Integer.parseInt((String) listSplit$default.get(1)), Integer.parseInt((String) listSplit$default.get(2)), j.Pl.valueOf((String) listSplit$default.get(3)), j.fuX.valueOf((String) listSplit$default.get(4)), j.Ml.valueOf((String) listSplit$default.get(5)), Integer.parseInt((String) listSplit$default.get(6)), Boolean.parseBoolean((String) listSplit$default.get(7)), false);
    }
}

package D5a;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class O {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Set f1320n = com.alightcreative.app.motion.persist.j.INSTANCE.getDemoModeMediaAndBuckets();

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[tu.Ew.values().length];
            try {
                iArr[tu.Ew.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tu.Ew.f73884r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[tu.Ew.f73883o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[tu.Ew.f73880Z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List rl(List list, kgE.fuX iapManager) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getUserDemoMode()) {
            Regex regex = new Regex("(\\bdemo\\b)|([^a-z]demo[^a-z])|(^demo[^a-z])|([^a-z]demo$)`");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String strUo = ((tu.Z) obj).Uo();
                if (strUo == null) {
                    strUo = "";
                }
                Locale ENGLISH = Locale.ENGLISH;
                Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                String lowerCase = strUo.toLowerCase(ENGLISH);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (regex.containsMatchIn(lowerCase)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (!jVar.getDemoMode() || !iapManager.rl()) {
            return list;
        }
        f1320n = jVar.getDemoModeMediaAndBuckets();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            tu.Z z2 = (tu.Z) obj2;
            if (z2.ViF() == tu.Ew.f73880Z || !f1320n.contains(z2.nY().toString())) {
                if (f1320n.contains("bucket:" + z2.KN())) {
                }
            }
            arrayList2.add(obj2);
        }
        return arrayList2;
    }

    public static final boolean t(tu.Z z2, kgE.fuX iapManager) {
        String string;
        Intrinsics.checkNotNullParameter(z2, "<this>");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        if (!iapManager.rl() || com.alightcreative.app.motion.persist.j.INSTANCE.getDemoMode()) {
            return false;
        }
        int i2 = j.$EnumSwitchMapping$0[z2.ViF().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            string = z2.nY().toString();
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            string = "bucket:" + z2.KN();
        }
        Intrinsics.checkNotNull(string);
        return f1320n.contains(string);
    }
}

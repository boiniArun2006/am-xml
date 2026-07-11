package kPg;

import android.net.Uri;
import androidx.core.database.sqlite.cL.PtsLKY;
import androidx.media3.common.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List f69910n = CollectionsKt.emptyList();
    private static final Lazy rl = LazyKt.lazy(new Function0() { // from class: kPg.w6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Wre.O();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Lazy f69911t = LazyKt.lazy(new Function0() { // from class: kPg.Ml
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Wre.nr();
        }
    });
    private static final Lazy nr = LazyKt.lazy(new Function0() { // from class: kPg.I28
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Wre.qie();
        }
    });

    private static final List KN() {
        return (List) f69911t.getValue();
    }

    public static final String Uo(n nVar) {
        String str;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        int iJ2 = (nVar.J2() * 10) / nVar.rl();
        if (iJ2 == 5) {
            str = "9:16";
        } else if (iJ2 == 7) {
            str = "3:4";
        } else if (iJ2 == 10) {
            str = "1:1";
        } else if (iJ2 == 13) {
            str = "4:3";
        } else if (iJ2 != 17) {
            str = nVar.J2() + " × " + nVar.rl();
        } else {
            str = "16:9";
        }
        String strN = nVar.n().n();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = strN.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = strN.charAt(i2);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            } else {
                sb2.append(cCharAt);
            }
        }
        Pair pair = new Pair(sb.toString(), sb2.toString());
        String str2 = (String) pair.component1();
        String str3 = (String) pair.component2();
        if (str3.length() > 0) {
            char upperCase = Character.toUpperCase(str3.charAt(0));
            String strSubstring = str3.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            str3 = upperCase + strSubstring;
        }
        return str3 + ((StringsKt.isBlank(str2) || Intrinsics.areEqual(str2, "1")) ? "" : " " + str2) + " (" + str + ")";
    }

    public static final n gh(j jVar, int i2, int i3) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Uri uri = Uri.parse("sample:" + jVar.n() + "?w=" + i2 + "&h=" + i3);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        return new n(jVar, uri, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mUb() {
        return (List) nr.getValue();
    }

    private static final List xMQ() {
        return (List) rl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List O() throws IOException {
        String[] list = IvA.n.rl().getApplicationContext().getAssets().list("samplemedia");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.length);
            for (String str : list) {
                Intrinsics.checkNotNull(str);
                arrayList.add(StringsKt.substringBeforeLast$default(str, '.', (String) null, 2, (Object) null));
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List nr() {
        List listXMQ = xMQ();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listXMQ, 10));
        Iterator it = listXMQ.iterator();
        while (it.hasNext()) {
            arrayList.add(new j(Dsr.f69908n, (String) it.next(), MimeTypes.IMAGE_WEBP));
        }
        List list = f69910n;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new j(Dsr.f69909t, (String) it2.next(), PtsLKY.ihevRprzoP));
        }
        return CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List qie() {
        List<j> listKN = KN();
        ArrayList arrayList = new ArrayList();
        for (j jVar : listKN) {
            CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new n[]{gh(jVar, 1080, 1080), gh(jVar, 1440, 1080), gh(jVar, 1920, 1080), gh(jVar, 1080, 1920)}));
        }
        return arrayList;
    }
}
